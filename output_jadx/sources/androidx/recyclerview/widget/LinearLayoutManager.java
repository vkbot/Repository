package androidx.recyclerview.widget;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import j1.i;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final AnchorInfo mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private LayoutState mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class AnchorInfo {
        int mCoordinate;
        boolean mLayoutFromEnd;
        OrientationHelper mOrientationHelper;
        int mPosition;
        boolean mValid;

        public AnchorInfo() {
            reset();
        }

        public void assignCoordinateFromPadding() {
            int startAfterPadding;
            boolean z9 = this.mLayoutFromEnd;
            OrientationHelper orientationHelper = this.mOrientationHelper;
            if (z9) {
                startAfterPadding = orientationHelper.getEndAfterPadding();
            } else {
                startAfterPadding = orientationHelper.getStartAfterPadding();
            }
            this.mCoordinate = startAfterPadding;
        }

        public void assignFromView(View view, int i10) {
            boolean z9 = this.mLayoutFromEnd;
            OrientationHelper orientationHelper = this.mOrientationHelper;
            if (z9) {
                this.mCoordinate = this.mOrientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedEnd(view);
            } else {
                this.mCoordinate = orientationHelper.getDecoratedStart(view);
            }
            this.mPosition = i10;
        }

        public void assignFromViewAndKeepVisibleRect(View view, int i10) {
            int totalSpaceChange = this.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                assignFromView(view, i10);
                return;
            }
            this.mPosition = i10;
            boolean z9 = this.mLayoutFromEnd;
            OrientationHelper orientationHelper = this.mOrientationHelper;
            if (z9) {
                int endAfterPadding = (orientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view);
                this.mCoordinate = this.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    int decoratedMeasurement = this.mCoordinate - this.mOrientationHelper.getDecoratedMeasurement(view);
                    int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
                    int min = decoratedMeasurement - (Math.min(this.mOrientationHelper.getDecoratedStart(view) - startAfterPadding, 0) + startAfterPadding);
                    if (min < 0) {
                        this.mCoordinate = Math.min(endAfterPadding, -min) + this.mCoordinate;
                        return;
                    }
                    return;
                }
                return;
            }
            int decoratedStart = orientationHelper.getDecoratedStart(view);
            int startAfterPadding2 = decoratedStart - this.mOrientationHelper.getStartAfterPadding();
            this.mCoordinate = decoratedStart;
            if (startAfterPadding2 > 0) {
                int endAfterPadding2 = (this.mOrientationHelper.getEndAfterPadding() - Math.min(0, (this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - this.mOrientationHelper.getDecoratedEnd(view))) - (this.mOrientationHelper.getDecoratedMeasurement(view) + decoratedStart);
                if (endAfterPadding2 < 0) {
                    this.mCoordinate -= Math.min(startAfterPadding2, -endAfterPadding2);
                }
            }
        }

        public boolean isViewValidAsAnchor(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < state.getItemCount()) {
                return true;
            }
            return false;
        }

        public void reset() {
            this.mPosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mValid = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mCoordinate=" + this.mCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + '}';
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        public void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollExtent(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollOffset(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return ScrollbarHelper.computeScrollRange(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z9) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i10;
        if (endAfterPadding2 > 0) {
            int i11 = -scrollBy(-endAfterPadding2, recycler, state);
            int i12 = i10 + i11;
            if (z9 && (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i12) > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding);
                return endAfterPadding + i11;
            }
            return i11;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z9) {
        int startAfterPadding;
        int startAfterPadding2 = i10 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 > 0) {
            int i11 = -scrollBy(startAfterPadding2, recycler, state);
            int i12 = i10 + i11;
            if (z9 && (startAfterPadding = i12 - this.mOrientationHelper.getStartAfterPadding()) > 0) {
                this.mOrientationHelper.offsetChildren(-startAfterPadding);
                return i11 - startAfterPadding;
            }
            return i11;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        int childCount;
        if (this.mShouldReverseLayout) {
            childCount = 0;
        } else {
            childCount = getChildCount() - 1;
        }
        return getChildAt(childCount);
    }

    private View getChildClosestToStart() {
        int i10;
        if (this.mShouldReverseLayout) {
            i10 = getChildCount() - 1;
        } else {
            i10 = 0;
        }
        return getChildAt(i10);
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i10, int i11) {
        boolean z9;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i14);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < position) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z10 = this.mShouldReverseLayout;
                    OrientationHelper orientationHelper = this.mOrientationHelper;
                    if (z9 != z10) {
                        i12 += orientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        i13 += orientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.mScrapList = scrapList;
            if (i12 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i10);
                LayoutState layoutState = this.mLayoutState;
                layoutState.mExtraFillSpace = i12;
                layoutState.mAvailable = 0;
                layoutState.assignPositionFromScrapList();
                fill(recycler, this.mLayoutState, state, false);
            }
            if (i13 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i11);
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mExtraFillSpace = i13;
                layoutState2.mAvailable = 0;
                layoutState2.assignPositionFromScrapList();
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.mScrapList = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (layoutState.mRecycle && !layoutState.mInfinite) {
            int i10 = layoutState.mScrollingOffset;
            int i11 = layoutState.mNoRecycleSpace;
            if (layoutState.mLayoutDirection == -1) {
                recycleViewsFromEnd(recycler, i10, i11);
            } else {
                recycleViewsFromStart(recycler, i10, i11);
            }
        }
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    removeAndRecycleViewAt(i12, recycler);
                }
                return;
            }
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, recycler);
                i10--;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i10, int i11) {
        int childCount = getChildCount();
        if (i10 >= 0) {
            int end = (this.mOrientationHelper.getEnd() - i10) + i11;
            if (this.mShouldReverseLayout) {
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                        recycleChildren(recycler, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = childCount - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View childAt2 = getChildAt(i14);
                if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                    recycleChildren(recycler, i13, i14);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i10, int i11) {
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i13 = childCount - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View childAt = getChildAt(i14);
                    if (this.mOrientationHelper.getDecoratedEnd(childAt) > i12 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i12) {
                        recycleChildren(recycler, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = getChildAt(i15);
                if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i12 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i12) {
                    recycleChildren(recycler, 0, i15);
                    return;
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation != 1 && isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        View findReferenceChild;
        boolean z9;
        boolean z10 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && anchorInfo.isViewValidAsAnchor(focusedChild, state)) {
            anchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z11 = this.mLastStackFromEnd;
        boolean z12 = this.mStackFromEnd;
        if (z11 != z12 || (findReferenceChild = findReferenceChild(recycler, state, anchorInfo.mLayoutFromEnd, z12)) == null) {
            return false;
        }
        anchorInfo.assignFromView(findReferenceChild, getPosition(findReferenceChild));
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(findReferenceChild);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(findReferenceChild);
            int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
            int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
            if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                z10 = true;
            }
            if (z9 || z10) {
                if (anchorInfo.mLayoutFromEnd) {
                    startAfterPadding = endAfterPadding;
                }
                anchorInfo.mCoordinate = startAfterPadding;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorInfo) {
        int i10;
        boolean z9;
        int decoratedStart;
        boolean z10 = false;
        if (!state.isPreLayout() && (i10 = this.mPendingScrollPosition) != -1) {
            if (i10 >= 0 && i10 < state.getItemCount()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.hasValidAnchor()) {
                    boolean z11 = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    anchorInfo.mLayoutFromEnd = z11;
                    OrientationHelper orientationHelper = this.mOrientationHelper;
                    if (z11) {
                        anchorInfo.mCoordinate = orientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset;
                    } else {
                        anchorInfo.mCoordinate = orientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            anchorInfo.assignCoordinateFromPadding();
                            return true;
                        }
                        int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                        OrientationHelper orientationHelper2 = this.mOrientationHelper;
                        if (decoratedStart2 < 0) {
                            anchorInfo.mCoordinate = orientationHelper2.getStartAfterPadding();
                            anchorInfo.mLayoutFromEnd = false;
                            return true;
                        }
                        if (orientationHelper2.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                            anchorInfo.mLayoutFromEnd = true;
                            return true;
                        }
                        boolean z12 = anchorInfo.mLayoutFromEnd;
                        OrientationHelper orientationHelper3 = this.mOrientationHelper;
                        if (z12) {
                            decoratedStart = this.mOrientationHelper.getTotalSpaceChange() + orientationHelper3.getDecoratedEnd(findViewByPosition);
                        } else {
                            decoratedStart = orientationHelper3.getDecoratedStart(findViewByPosition);
                        }
                        anchorInfo.mCoordinate = decoratedStart;
                    } else {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9 == this.mShouldReverseLayout) {
                                z10 = true;
                            }
                            anchorInfo.mLayoutFromEnd = z10;
                        }
                        anchorInfo.assignCoordinateFromPadding();
                    }
                    return true;
                }
                boolean z13 = this.mShouldReverseLayout;
                anchorInfo.mLayoutFromEnd = z13;
                OrientationHelper orientationHelper4 = this.mOrientationHelper;
                if (z13) {
                    anchorInfo.mCoordinate = orientationHelper4.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                } else {
                    anchorInfo.mCoordinate = orientationHelper4.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo) {
        int i10;
        if (updateAnchorFromPendingData(state, anchorInfo) || updateAnchorFromChildren(recycler, state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        if (this.mStackFromEnd) {
            i10 = state.getItemCount() - 1;
        } else {
            i10 = 0;
        }
        anchorInfo.mPosition = i10;
    }

    private void updateLayoutState(int i10, int i11, boolean z9, RecyclerView.State state) {
        int i12;
        int startAfterPadding;
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mLayoutDirection = i10;
        int[] iArr = this.mReusableIntPair;
        boolean z10 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i10 == 1) {
            z10 = true;
        }
        LayoutState layoutState = this.mLayoutState;
        if (z10) {
            i12 = max2;
        } else {
            i12 = max;
        }
        layoutState.mExtraFillSpace = i12;
        if (!z10) {
            max = max2;
        }
        layoutState.mNoRecycleSpace = max;
        if (z10) {
            layoutState.mExtraFillSpace = this.mOrientationHelper.getEndPadding() + i12;
            View childClosestToEnd = getChildClosestToEnd();
            LayoutState layoutState2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i13 = -1;
            }
            layoutState2.mItemDirection = i13;
            int position = getPosition(childClosestToEnd);
            LayoutState layoutState3 = this.mLayoutState;
            layoutState2.mCurrentPosition = position + layoutState3.mItemDirection;
            layoutState3.mOffset = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View childClosestToStart = getChildClosestToStart();
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.mExtraFillSpace = this.mOrientationHelper.getStartAfterPadding() + layoutState4.mExtraFillSpace;
            LayoutState layoutState5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i13 = -1;
            }
            layoutState5.mItemDirection = i13;
            int position2 = getPosition(childClosestToStart);
            LayoutState layoutState6 = this.mLayoutState;
            layoutState5.mCurrentPosition = position2 + layoutState6.mItemDirection;
            layoutState6.mOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(childClosestToStart)) + this.mOrientationHelper.getStartAfterPadding();
        }
        LayoutState layoutState7 = this.mLayoutState;
        layoutState7.mAvailable = i11;
        if (z9) {
            layoutState7.mAvailable = i11 - startAfterPadding;
        }
        layoutState7.mScrollingOffset = startAfterPadding;
    }

    private void updateLayoutStateToFillEnd(int i10, int i11) {
        int i12;
        this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - i11;
        LayoutState layoutState = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        layoutState.mItemDirection = i12;
        layoutState.mCurrentPosition = i10;
        layoutState.mLayoutDirection = 1;
        layoutState.mOffset = i11;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i10, int i11) {
        int i12;
        this.mLayoutState.mAvailable = i11 - this.mOrientationHelper.getStartAfterPadding();
        LayoutState layoutState = this.mLayoutState;
        layoutState.mCurrentPosition = i10;
        if (this.mShouldReverseLayout) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        layoutState.mItemDirection = i12;
        layoutState.mLayoutDirection = -1;
        layoutState.mOffset = i11;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.mLayoutDirection == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i12;
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() != 0 && i10 != 0) {
            ensureLayoutState();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            updateLayoutState(i12, Math.abs(i10), true, state);
            collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i10, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z9;
        int i11;
        SavedState savedState = this.mPendingSavedState;
        int i12 = -1;
        if (savedState != null && savedState.hasValidAnchor()) {
            SavedState savedState2 = this.mPendingSavedState;
            z9 = savedState2.mAnchorLayoutFromEnd;
            i11 = savedState2.mAnchorPosition;
        } else {
            resolveShouldLayoutReverse();
            z9 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z9 ? i10 - 1 : 0;
            }
        }
        if (!z9) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            layoutPrefetchRegistry.addPosition(i11, 0);
            i11 += i12;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i10 = layoutState.mCurrentPosition;
        if (i10 >= 0 && i10 < state.getItemCount()) {
            layoutPrefetchRegistry.addPosition(i10, Math.max(0, layoutState.mScrollingOffset));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z9 = false;
        int i11 = 1;
        if (i10 < getPosition(getChildAt(0))) {
            z9 = true;
        }
        if (z9 != this.mShouldReverseLayout) {
            i11 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i11, 0.0f);
        }
        return new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int convertFocusDirectionToLayoutDirection(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.mOrientation == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.mOrientation == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.mOrientation == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            }
            return 1;
        }
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        }
        return 1;
    }

    public LayoutState createLayoutState() {
        return new LayoutState();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state, boolean z9) {
        int i10 = layoutState.mAvailable;
        int i11 = layoutState.mScrollingOffset;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                layoutState.mScrollingOffset = i11 + i10;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i12 = layoutState.mAvailable + layoutState.mExtraFillSpace;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if ((!layoutState.mInfinite && i12 <= 0) || !layoutState.hasMore(state)) {
                break;
            }
            layoutChunkResult.resetInternal();
            layoutChunk(recycler, state, layoutState, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                layoutState.mOffset = (layoutChunkResult.mConsumed * layoutState.mLayoutDirection) + layoutState.mOffset;
                if (!layoutChunkResult.mIgnoreConsumed || layoutState.mScrapList != null || !state.isPreLayout()) {
                    int i13 = layoutState.mAvailable;
                    int i14 = layoutChunkResult.mConsumed;
                    layoutState.mAvailable = i13 - i14;
                    i12 -= i14;
                }
                int i15 = layoutState.mScrollingOffset;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + layoutChunkResult.mConsumed;
                    layoutState.mScrollingOffset = i16;
                    int i17 = layoutState.mAvailable;
                    if (i17 < 0) {
                        layoutState.mScrollingOffset = i16 + i17;
                    }
                    recycleByLayoutState(recycler, layoutState);
                }
                if (z9 && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - layoutState.mAvailable;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z9, boolean z10) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z9, z10);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z9, z10);
    }

    public View findFirstVisibleChildClosestToStart(boolean z9, boolean z10) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z9, z10);
        }
        return findOneVisibleChild(0, getChildCount(), z9, z10);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 > i10 || i11 < i10) {
            if (this.mOrientationHelper.getDecoratedStart(getChildAt(i10)) < this.mOrientationHelper.getStartAfterPadding()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            }
            if (this.mOrientation == 0) {
                return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i10, i11, i12, i13);
            }
            return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i10, i11, i12, i13);
        }
        return getChildAt(i10);
    }

    public View findOneVisibleChild(int i10, int i11, boolean z9, boolean z10) {
        int i12;
        ensureLayoutState();
        int i13 = 320;
        if (z9) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z10) {
            i13 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.findOneViewWithinBoundFlags(i10, i11, i12, i13);
        }
        return this.mVerticalBoundCheck.findOneViewWithinBoundFlags(i10, i11, i12, i13);
    }

    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z9, boolean z10) {
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        ensureLayoutState();
        int childCount = getChildCount();
        if (z10) {
            i11 = getChildCount() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = childCount;
            i11 = 0;
            i12 = 1;
        }
        int itemCount = state.getItemCount();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(childAt);
            int decoratedEnd = this.mOrientationHelper.getDecoratedEnd(childAt);
            if (position >= 0 && position < itemCount) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view3 == null) {
                        view3 = childAt;
                    }
                } else {
                    if (decoratedEnd <= startAfterPadding && decoratedStart < startAfterPadding) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (decoratedStart >= endAfterPadding && decoratedEnd > endAfterPadding) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z11 && !z12) {
                        return childAt;
                    }
                    if (z9) {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z11) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                }
            }
            i11 += i12;
        }
        if (view != null) {
            return view;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.mOrientationHelper.getTotalSpace();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState, LayoutChunkResult layoutChunkResult) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        LinearLayoutManager linearLayoutManager;
        int decoratedMeasurementInOther;
        boolean z10;
        View next = layoutState.next(recycler);
        if (next == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) next.getLayoutParams();
        List<RecyclerView.ViewHolder> list = layoutState.mScrapList;
        boolean z11 = this.mShouldReverseLayout;
        if (list == null) {
            if (layoutState.mLayoutDirection == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                addView(next);
            } else {
                addView(next, 0);
            }
        } else {
            if (layoutState.mLayoutDirection == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z11 == z9) {
                addDisappearingView(next);
            } else {
                addDisappearingView(next, 0);
            }
        }
        measureChildWithMargins(next, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(next);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                i12 = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(next);
            } else {
                i12 = getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + i12;
            }
            int i14 = layoutState.mLayoutDirection;
            int i15 = layoutState.mOffset;
            if (i14 == -1) {
                i13 = i15 - layoutChunkResult.mConsumed;
                i10 = i15;
                i11 = decoratedMeasurementInOther;
            } else {
                i11 = decoratedMeasurementInOther;
                i10 = layoutChunkResult.mConsumed + i15;
                linearLayoutManager = this;
                i13 = i15;
                linearLayoutManager.layoutDecoratedWithMargins(next, i12, i13, i11, i10);
                if (!layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                    layoutChunkResult.mIgnoreConsumed = true;
                }
                layoutChunkResult.mFocusable = next.hasFocusable();
            }
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(next) + paddingTop;
            int i16 = layoutState.mLayoutDirection;
            int i17 = layoutState.mOffset;
            if (i16 == -1) {
                i11 = i17;
                i10 = decoratedMeasurementInOther2;
                i12 = i17 - layoutChunkResult.mConsumed;
            } else {
                i10 = decoratedMeasurementInOther2;
                i11 = layoutChunkResult.mConsumed + i17;
                i12 = i17;
            }
            i13 = paddingTop;
        }
        linearLayoutManager = this;
        linearLayoutManager.layoutDecoratedWithMargins(next, i12, i13, i11, i10);
        if (!layoutParams.isItemRemoved()) {
        }
        layoutChunkResult.mIgnoreConsumed = true;
        layoutChunkResult.mFocusable = next.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, state);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mScrollingOffset = Integer.MIN_VALUE;
        layoutState.mRecycle = false;
        fill(recycler, layoutState, state, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
        RecyclerView.Adapter adapter = this.mRecyclerView.mAdapter;
        if (adapter != null && adapter.getItemCount() > 0) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_TO_POSITION);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int fixLayoutEndGap;
        int i15;
        View findViewByPosition;
        int decoratedStart;
        int i16;
        int i17 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        AnchorInfo anchorInfo = this.mAnchorInfo;
        if (anchorInfo.mValid && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
                this.mAnchorInfo.assignFromViewAndKeepVisibleRect(focusedChild, getPosition(focusedChild));
            }
        } else {
            anchorInfo.reset();
            AnchorInfo anchorInfo2 = this.mAnchorInfo;
            anchorInfo2.mLayoutFromEnd = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, anchorInfo2);
            this.mAnchorInfo.mValid = true;
        }
        LayoutState layoutState = this.mLayoutState;
        if (layoutState.mLastScrollDelta >= 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        layoutState.mLayoutDirection = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding() + Math.max(0, this.mReusableIntPair[0]);
        int endPadding = this.mOrientationHelper.getEndPadding() + Math.max(0, this.mReusableIntPair[1]);
        if (state.isPreLayout() && (i15 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i15)) != null) {
            boolean z9 = this.mShouldReverseLayout;
            OrientationHelper orientationHelper = this.mOrientationHelper;
            if (z9) {
                i16 = orientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                decoratedStart = this.mPendingScrollPositionOffset;
            } else {
                decoratedStart = orientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                i16 = this.mPendingScrollPositionOffset;
            }
            int i18 = i16 - decoratedStart;
            if (i18 > 0) {
                startAfterPadding += i18;
            } else {
                endPadding -= i18;
            }
        }
        AnchorInfo anchorInfo3 = this.mAnchorInfo;
        boolean z10 = anchorInfo3.mLayoutFromEnd;
        boolean z11 = this.mShouldReverseLayout;
        if (!z10 ? !z11 : z11) {
            i17 = 1;
        }
        onAnchorReady(recycler, state, anchorInfo3, i17);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.mInfinite = resolveIsInfinite();
        this.mLayoutState.mIsPreLayout = state.isPreLayout();
        this.mLayoutState.mNoRecycleSpace = 0;
        AnchorInfo anchorInfo4 = this.mAnchorInfo;
        if (anchorInfo4.mLayoutFromEnd) {
            updateLayoutStateToFillStart(anchorInfo4);
            LayoutState layoutState2 = this.mLayoutState;
            layoutState2.mExtraFillSpace = startAfterPadding;
            fill(recycler, layoutState2, state, false);
            LayoutState layoutState3 = this.mLayoutState;
            i12 = layoutState3.mOffset;
            int i19 = layoutState3.mCurrentPosition;
            int i20 = layoutState3.mAvailable;
            if (i20 > 0) {
                endPadding += i20;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            LayoutState layoutState4 = this.mLayoutState;
            layoutState4.mExtraFillSpace = endPadding;
            layoutState4.mCurrentPosition += layoutState4.mItemDirection;
            fill(recycler, layoutState4, state, false);
            LayoutState layoutState5 = this.mLayoutState;
            i11 = layoutState5.mOffset;
            int i21 = layoutState5.mAvailable;
            if (i21 > 0) {
                updateLayoutStateToFillStart(i19, i12);
                LayoutState layoutState6 = this.mLayoutState;
                layoutState6.mExtraFillSpace = i21;
                fill(recycler, layoutState6, state, false);
                i12 = this.mLayoutState.mOffset;
            }
        } else {
            updateLayoutStateToFillEnd(anchorInfo4);
            LayoutState layoutState7 = this.mLayoutState;
            layoutState7.mExtraFillSpace = endPadding;
            fill(recycler, layoutState7, state, false);
            LayoutState layoutState8 = this.mLayoutState;
            i11 = layoutState8.mOffset;
            int i22 = layoutState8.mCurrentPosition;
            int i23 = layoutState8.mAvailable;
            if (i23 > 0) {
                startAfterPadding += i23;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            LayoutState layoutState9 = this.mLayoutState;
            layoutState9.mExtraFillSpace = startAfterPadding;
            layoutState9.mCurrentPosition += layoutState9.mItemDirection;
            fill(recycler, layoutState9, state, false);
            LayoutState layoutState10 = this.mLayoutState;
            int i24 = layoutState10.mOffset;
            int i25 = layoutState10.mAvailable;
            if (i25 > 0) {
                updateLayoutStateToFillEnd(i22, i11);
                LayoutState layoutState11 = this.mLayoutState;
                layoutState11.mExtraFillSpace = i25;
                fill(recycler, layoutState11, state, false);
                i11 = this.mLayoutState.mOffset;
            }
            i12 = i24;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i11, recycler, state, true);
                i13 = i12 + fixLayoutEndGap2;
                i14 = i11 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i13, recycler, state, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i12, recycler, state, true);
                i13 = i12 + fixLayoutStartGap;
                i14 = i11 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i14, recycler, state, false);
            }
            i12 = i13 + fixLayoutEndGap;
            i11 = i14 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(recycler, state, i12, i11);
        if (!state.isPreLayout()) {
            this.mOrientationHelper.onLayoutComplete();
        } else {
            this.mAnchorInfo.reset();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.reset();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.invalidateAnchor();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z9 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.mAnchorLayoutFromEnd = z9;
            if (z9) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                savedState.mAnchorPosition = getPosition(childClosestToEnd);
                return savedState;
            }
            View childClosestToStart = getChildClosestToStart();
            savedState.mAnchorPosition = getPosition(childClosestToStart);
            savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
            return savedState;
        }
        savedState.invalidateAnchor();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean performAccessibilityAction(int i10, @Nullable Bundle bundle) {
        int min;
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i11 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT, -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                min = Math.min(i11, getRowCountForAccessibility(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i12 = bundle.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT, -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                min = Math.min(i12, getColumnCountForAccessibility(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (min >= 0) {
                scrollToPositionWithOffset(min, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11) {
        char c;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.mShouldReverseLayout) {
            OrientationHelper orientationHelper = this.mOrientationHelper;
            if (c == 1) {
                scrollToPositionWithOffset(position2, orientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedMeasurement(view) + this.mOrientationHelper.getDecoratedStart(view2)));
                return;
            }
            scrollToPositionWithOffset(position2, orientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
            return;
        }
        OrientationHelper orientationHelper2 = this.mOrientationHelper;
        if (c == 65535) {
            scrollToPositionWithOffset(position2, orientationHelper2.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, orientationHelper2.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0) {
            return true;
        }
        return false;
    }

    public int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i11;
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.mRecycle = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        updateLayoutState(i11, abs, true, state);
        LayoutState layoutState = this.mLayoutState;
        int fill = fill(recycler, layoutState, state, false) + layoutState.mScrollingOffset;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i10 = i11 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i10);
        this.mLayoutState.mLastScrollDelta = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            i.k(a.e(i10, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i10 == this.mOrientation && this.mOrientationHelper != null) {
            return;
        }
        OrientationHelper createOrientationHelper = OrientationHelper.createOrientationHelper(this, i10);
        this.mOrientationHelper = createOrientationHelper;
        this.mAnchorInfo.mOrientationHelper = createOrientationHelper;
        this.mOrientation = i10;
        requestLayout();
    }

    public void setRecycleChildrenOnDetach(boolean z9) {
        this.mRecycleChildrenOnDetach = z9;
    }

    public void setReverseLayout(boolean z9) {
        assertNotInLayoutOrScroll(null);
        if (z9 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z9;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z9) {
        this.mSmoothScrollbarEnabled = z9;
    }

    public void setStackFromEnd(boolean z9) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z9) {
            return;
        }
        this.mStackFromEnd = z9;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824 && getWidthMode() != 1073741824 && hasFlexibleChildInBothOrientations()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return false;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        boolean z9 = true;
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
            if (this.mShouldReverseLayout) {
                for (int i10 = 1; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    int position2 = getPosition(childAt);
                    int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                        if (decoratedStart2 >= decoratedStart) {
                            z9 = false;
                        }
                        sb.append(z9);
                        throw new RuntimeException(sb.toString());
                    }
                    if (decoratedStart2 > decoratedStart) {
                        logChildren();
                        b.h("detected invalid location");
                        return;
                    }
                }
                return;
            }
            for (int i11 = 1; i11 < getChildCount(); i11++) {
                View childAt2 = getChildAt(i11);
                int position3 = getPosition(childAt2);
                int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    if (decoratedStart3 >= decoratedStart) {
                        z9 = false;
                    }
                    sb2.append(z9);
                    throw new RuntimeException(sb2.toString());
                }
                if (decoratedStart3 < decoratedStart) {
                    logChildren();
                    b.h("detected invalid location");
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutState {
        static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        static final int ITEM_DIRECTION_HEAD = -1;
        static final int ITEM_DIRECTION_TAIL = 1;
        static final int LAYOUT_END = 1;
        static final int LAYOUT_START = -1;
        static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        static final String TAG = "LLM#LayoutState";
        int mAvailable;
        int mCurrentPosition;
        boolean mInfinite;
        int mItemDirection;
        int mLastScrollDelta;
        int mLayoutDirection;
        int mOffset;
        int mScrollingOffset;
        boolean mRecycle = true;
        int mExtraFillSpace = 0;
        int mNoRecycleSpace = 0;
        boolean mIsPreLayout = false;
        List<RecyclerView.ViewHolder> mScrapList = null;

        private View nextViewFromScrapList() {
            int size = this.mScrapList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.mScrapList.get(i10).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.mCurrentPosition == layoutParams.getViewLayoutPosition()) {
                    assignPositionFromScrapList(view);
                    return view;
                }
            }
            return null;
        }

        public void assignPositionFromScrapList(View view) {
            View nextViewInLimitedList = nextViewInLimitedList(view);
            if (nextViewInLimitedList == null) {
                this.mCurrentPosition = -1;
            } else {
                this.mCurrentPosition = ((RecyclerView.LayoutParams) nextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
            }
        }

        public boolean hasMore(RecyclerView.State state) {
            int i10 = this.mCurrentPosition;
            if (i10 >= 0 && i10 < state.getItemCount()) {
                return true;
            }
            return false;
        }

        public void log() {
            Log.d(TAG, "avail:" + this.mAvailable + ", ind:" + this.mCurrentPosition + ", dir:" + this.mItemDirection + ", offset:" + this.mOffset + ", layoutDir:" + this.mLayoutDirection);
        }

        public View next(RecyclerView.Recycler recycler) {
            if (this.mScrapList != null) {
                return nextViewFromScrapList();
            }
            View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
            this.mCurrentPosition += this.mItemDirection;
            return viewForPosition;
        }

        public View nextViewInLimitedList(View view) {
            int viewLayoutPosition;
            int size = this.mScrapList.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.mScrapList.get(i11).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.mCurrentPosition) * this.mItemDirection) >= 0 && viewLayoutPosition < i10) {
                    if (viewLayoutPosition == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = viewLayoutPosition;
                }
            }
            return view2;
        }

        public void assignPositionFromScrapList() {
            assignPositionFromScrapList(null);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean hasValidAnchor() {
            if (this.mAnchorPosition >= 0) {
                return true;
            }
            return false;
        }

        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        public SavedState() {
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo) {
        updateLayoutStateToFillEnd(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo) {
        updateLayoutStateToFillStart(anchorInfo.mPosition, anchorInfo.mCoordinate);
    }

    public LinearLayoutManager(Context context, int i10, boolean z9) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new AnchorInfo();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z9);
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, AnchorInfo anchorInfo, int i10) {
    }
}
