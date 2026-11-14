package j4;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends g {
    public final transient n e;

    /* renamed from: f, reason: collision with root package name */
    public final transient m f3277f;

    public l(n nVar, m mVar) {
        this.e = nVar;
        this.f3277f = mVar;
    }

    @Override // j4.g, j4.a
    public final e a() {
        return this.f3277f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.e.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // j4.a
    public final int d(int i10, Object[] objArr) {
        return this.f3277f.d(i10, objArr);
    }

    @Override // j4.a
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f3277f.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e.f3282g;
    }
}
