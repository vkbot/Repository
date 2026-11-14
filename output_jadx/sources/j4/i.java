package j4;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final i f3274f = new i(new Object[0], 0);
    public final transient Object[] d;
    public final transient int e;

    public i(Object[] objArr, int i10) {
        this.d = objArr;
        this.e = i10;
    }

    @Override // j4.e, j4.a
    public final int d(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.e;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // j4.a
    public final Object[] e() {
        return this.d;
    }

    @Override // j4.a
    public final int f() {
        return this.e;
    }

    @Override // j4.a
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        o4.b.h(i10, this.e);
        Object obj = this.d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // j4.a
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
