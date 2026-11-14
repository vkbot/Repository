package j4;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends g {
    public final transient n e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f3275f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f3276g;

    public k(n nVar, Object[] objArr, int i10) {
        this.e = nVar;
        this.f3275f = objArr;
        this.f3276g = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.e.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // j4.a
    public final int d(int i10, Object[] objArr) {
        return a().d(i10, objArr);
    }

    @Override // j4.a
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return a().listIterator(0);
    }

    @Override // j4.g
    public final e k() {
        return new j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3276g;
    }
}
