package j4;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends g {
    public final transient Object e;

    public p(Object obj) {
        this.e = obj;
    }

    @Override // j4.g, j4.a
    public final e a() {
        Object[] objArr = {this.e};
        c cVar = e.c;
        for (int i10 = 0; i10 < 1; i10++) {
            if (objArr[i10] == null) {
                n0.b.n(ai.onnxruntime.a.e(i10, "at index "));
                return null;
            }
        }
        return e.i(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.e.equals(obj);
    }

    @Override // j4.a
    public final int d(int i10, Object[] objArr) {
        objArr[i10] = this.e;
        return i10 + 1;
    }

    @Override // j4.a
    public final boolean h() {
        return false;
    }

    @Override // j4.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.e.toString() + ']';
    }
}
