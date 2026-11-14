package j4;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f3283j;

    /* renamed from: k, reason: collision with root package name */
    public static final o f3284k;
    public final transient Object[] e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f3285f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f3286g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f3287h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f3288i;

    static {
        Object[] objArr = new Object[0];
        f3283j = objArr;
        f3284k = new o(objArr, objArr, 0, 0, 0);
    }

    public o(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        this.e = objArr;
        this.f3285f = i10;
        this.f3286g = objArr2;
        this.f3287h = i11;
        this.f3288i = i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f3286g;
            if (objArr.length != 0) {
                int s5 = com.bumptech.glide.c.s(obj.hashCode());
                while (true) {
                    int i10 = s5 & this.f3287h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    s5 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // j4.a
    public final int d(int i10, Object[] objArr) {
        Object[] objArr2 = this.e;
        int i11 = this.f3288i;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // j4.a
    public final Object[] e() {
        return this.e;
    }

    @Override // j4.a
    public final int f() {
        return this.f3288i;
    }

    @Override // j4.a
    public final int g() {
        return 0;
    }

    @Override // j4.a
    public final boolean h() {
        return false;
    }

    @Override // j4.g, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f3285f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return a().listIterator(0);
    }

    @Override // j4.g
    public final e k() {
        return e.i(this.f3288i, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3288i;
    }
}
