package c0;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends ArrayMap {

    /* renamed from: b, reason: collision with root package name */
    public int f429b;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.f429b = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.f429b == 0) {
            this.f429b = super.hashCode();
        }
        return this.f429b;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f429b = 0;
        return super.put(obj, obj2);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap simpleArrayMap) {
        this.f429b = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object removeAt(int i10) {
        this.f429b = 0;
        return super.removeAt(i10);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object setValueAt(int i10, Object obj) {
        this.f429b = 0;
        return super.setValueAt(i10, obj);
    }
}
