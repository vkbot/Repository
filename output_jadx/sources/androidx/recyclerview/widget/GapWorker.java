package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import j1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class GapWorker implements Runnable {
    static final ThreadLocal<GapWorker> sGapWorker = new ThreadLocal<>();
    static Comparator<Task> sTaskComparator = new Comparator<Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        public int compare(Task task, Task task2) {
            boolean z9;
            boolean z10;
            RecyclerView recyclerView = task.view;
            if (recyclerView == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (task2.view == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 != z10) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z11 = task.neededNextFrame;
            if (z11 != task2.neededNextFrame) {
                if (!z11) {
                    return 1;
                }
                return -1;
            }
            int i10 = task2.viewVelocity - task.viewVelocity;
            if (i10 != 0) {
                return i10;
            }
            int i11 = task.distanceToItem - task2.distanceToItem;
            if (i11 == 0) {
                return 0;
            }
            return i11;
        }
    };
    long mFrameIntervalNs;
    long mPostTimeNs;
    ArrayList<RecyclerView> mRecyclerViews = new ArrayList<>();
    private final ArrayList<Task> mTasks = new ArrayList<>();

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    int i12 = this.mCount;
                    int i13 = i12 * 2;
                    int[] iArr = this.mPrefetchArray;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.mPrefetchArray = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i13 >= iArr.length) {
                        int[] iArr3 = new int[i12 * 4];
                        this.mPrefetchArray = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.mPrefetchArray;
                    iArr4[i13] = i10;
                    iArr4[i13 + 1] = i11;
                    this.mCount++;
                    return;
                }
                i.k("Pixel distance must be non-negative");
                return;
            }
            i.k("Layout positions must be non-negative");
        }

        public void clearPrefetchPositions() {
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mCount = 0;
        }

        public void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z9) {
            this.mCount = 0;
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z9) {
                    if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.mPrefetchDx, this.mPrefetchDy, recyclerView.mState, this);
                }
                int i10 = this.mCount;
                if (i10 > layoutManager.mPrefetchMaxCountObserved) {
                    layoutManager.mPrefetchMaxCountObserved = i10;
                    layoutManager.mPrefetchMaxObservedInInitialPrefetch = z9;
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        public boolean lastPrefetchIncludedPosition(int i10) {
            if (this.mPrefetchArray != null) {
                int i11 = this.mCount * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.mPrefetchArray[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void setPrefetchVector(int i10, int i11) {
            this.mPrefetchDx = i10;
            this.mPrefetchDy = i11;
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Task {
        public int distanceToItem;
        public boolean neededNextFrame;
        public int position;
        public RecyclerView view;
        public int viewVelocity;

        public void clear() {
            this.neededNextFrame = false;
            this.viewVelocity = 0;
            this.distanceToItem = 0;
            this.view = null;
            this.position = 0;
        }
    }

    private void buildTaskList() {
        Task task;
        boolean z9;
        int size = this.mRecyclerViews.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.mRecyclerViews.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.mCount;
            }
        }
        this.mTasks.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.mRecyclerViews.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(layoutPrefetchRegistryImpl.mPrefetchDy) + Math.abs(layoutPrefetchRegistryImpl.mPrefetchDx);
                for (int i14 = 0; i14 < layoutPrefetchRegistryImpl.mCount * 2; i14 += 2) {
                    if (i12 >= this.mTasks.size()) {
                        task = new Task();
                        this.mTasks.add(task);
                    } else {
                        task = this.mTasks.get(i12);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.mPrefetchArray;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    task.neededNextFrame = z9;
                    task.viewVelocity = abs;
                    task.distanceToItem = i15;
                    task.view = recyclerView2;
                    task.position = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.mTasks, sTaskComparator);
    }

    private void flushTaskWithDeadline(Task task, long j10) {
        long j11;
        if (task.neededNextFrame) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j10;
        }
        RecyclerView.ViewHolder prefetchPositionWithDeadline = prefetchPositionWithDeadline(task.view, task.position, j11);
        if (prefetchPositionWithDeadline != null && prefetchPositionWithDeadline.mNestedRecyclerView != null && prefetchPositionWithDeadline.isBound() && !prefetchPositionWithDeadline.isInvalid()) {
            prefetchInnerRecyclerViewWithDeadline(prefetchPositionWithDeadline.mNestedRecyclerView.get(), j10);
        }
    }

    private void flushTasksWithDeadline(long j10) {
        for (int i10 = 0; i10 < this.mTasks.size(); i10++) {
            Task task = this.mTasks.get(i10);
            if (task.view != null) {
                flushTaskWithDeadline(task, j10);
                task.clear();
            } else {
                return;
            }
        }
    }

    public static boolean isPrefetchPositionAttached(RecyclerView recyclerView, int i10) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void prefetchInnerRecyclerViewWithDeadline(@Nullable RecyclerView recyclerView, long j10) {
        String str;
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
            layoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(recyclerView, true);
            if (layoutPrefetchRegistryImpl.mCount != 0) {
                if (j10 == Long.MAX_VALUE) {
                    str = "RV Nested Prefetch";
                } else {
                    str = "RV Nested Prefetch forced - needed next frame";
                }
                try {
                    Trace.beginSection(str);
                    recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                    for (int i10 = 0; i10 < layoutPrefetchRegistryImpl.mCount * 2; i10 += 2) {
                        prefetchPositionWithDeadline(recyclerView, layoutPrefetchRegistryImpl.mPrefetchArray[i10], j10);
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerView, int i10, long j10) {
        if (isPrefetchPositionAttached(recyclerView, i10)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (TraceCompat.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.onExitLayoutOrScroll(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.onEnterLayoutOrScroll();
        RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i10, false, j10);
        if (tryGetViewHolderForPositionByDeadline != null) {
            if (tryGetViewHolderForPositionByDeadline.isBound() && !tryGetViewHolderForPositionByDeadline.isInvalid()) {
                recycler.recycleView(tryGetViewHolderForPositionByDeadline.itemView);
            } else {
                recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
            }
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        return tryGetViewHolderForPositionByDeadline;
    }

    public void add(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.mRecyclerViews.contains(recyclerView)) {
            i.l("RecyclerView already present in worker list!");
        } else {
            this.mRecyclerViews.add(recyclerView);
        }
    }

    public void postFromTraversal(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.mRecyclerViews.contains(recyclerView)) {
                i.l("attempting to post unregistered view!");
                return;
            } else if (this.mPostTimeNs == 0) {
                this.mPostTimeNs = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.setPrefetchVector(i10, i11);
    }

    public void prefetch(long j10) {
        buildTaskList();
        flushTasksWithDeadline(j10);
    }

    public void remove(RecyclerView recyclerView) {
        boolean remove = this.mRecyclerViews.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            i.l("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.mRecyclerViews.isEmpty()) {
                int size = this.mRecyclerViews.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.mRecyclerViews.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    prefetch(TimeUnit.MILLISECONDS.toNanos(j10) + this.mFrameIntervalNs);
                }
            }
        } finally {
            this.mPostTimeNs = 0L;
            Trace.endSection();
        }
    }
}
