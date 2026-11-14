package androidx.coordinatorlayout.widget;

import ai.onnxruntime.b;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import j1.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {
    private final Pools.Pool<ArrayList<T>> mListPool = new Pools.SimplePool(10);
    private final SimpleArrayMap<T, ArrayList<T>> mGraph = new SimpleArrayMap<>();
    private final ArrayList<T> mSortResult = new ArrayList<>();
    private final HashSet<T> mSortTmpMarked = new HashSet<>();

    private void dfs(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.mGraph.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    dfs(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        b.h("This graph contains cyclic dependencies");
    }

    @NonNull
    private ArrayList<T> getEmptyList() {
        ArrayList<T> acquire = this.mListPool.acquire();
        if (acquire == null) {
            return new ArrayList<>();
        }
        return acquire;
    }

    private void poolList(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.mListPool.release(arrayList);
    }

    public void addEdge(@NonNull T t, @NonNull T t3) {
        if (this.mGraph.containsKey(t) && this.mGraph.containsKey(t3)) {
            ArrayList<T> arrayList = this.mGraph.get(t);
            if (arrayList == null) {
                arrayList = getEmptyList();
                this.mGraph.put(t, arrayList);
            }
            arrayList.add(t3);
            return;
        }
        i.k("All nodes must be present in the graph before being added as an edge");
    }

    public void addNode(@NonNull T t) {
        if (!this.mGraph.containsKey(t)) {
            this.mGraph.put(t, null);
        }
    }

    public void clear() {
        int size = this.mGraph.getSize();
        int i10 = 0;
        while (true) {
            SimpleArrayMap<T, ArrayList<T>> simpleArrayMap = this.mGraph;
            if (i10 < size) {
                ArrayList<T> valueAt = simpleArrayMap.valueAt(i10);
                if (valueAt != null) {
                    poolList(valueAt);
                }
                i10++;
            } else {
                simpleArrayMap.clear();
                return;
            }
        }
    }

    public boolean contains(@NonNull T t) {
        return this.mGraph.containsKey(t);
    }

    @Nullable
    public List getIncomingEdges(@NonNull T t) {
        return this.mGraph.get(t);
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t) {
        int size = this.mGraph.getSize();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i10);
            if (valueAt != null && valueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.mGraph.keyAt(i10));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> getSortedList() {
        this.mSortResult.clear();
        this.mSortTmpMarked.clear();
        int size = this.mGraph.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            dfs(this.mGraph.keyAt(i10), this.mSortResult, this.mSortTmpMarked);
        }
        return this.mSortResult;
    }

    public boolean hasOutgoingEdges(@NonNull T t) {
        int size = this.mGraph.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i10);
            if (valueAt != null && valueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.mGraph.getSize();
    }
}
