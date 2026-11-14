package v7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements Map {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5967b = new HashMap();

    public final double a() {
        HashMap hashMap = this.f5967b;
        if (hashMap.isEmpty()) {
            return 0.0d;
        }
        Iterator it = hashMap.values().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (((k) it.next()).d()) {
                i10++;
            }
        }
        return (i10 / i11) * 100.0d;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f5967b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f5967b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f5967b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f5967b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this && !this.f5967b.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f5967b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5967b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5967b.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f5967b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f5967b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f5967b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f5967b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5967b.size();
    }

    public final String toString() {
        return this.f5967b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5967b.values();
    }
}
