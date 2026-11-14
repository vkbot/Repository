package j4;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends e {
    public final transient Object[] d;
    public final transient int e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f3278f;

    public m(int i10, int i11, Object[] objArr) {
        this.d = objArr;
        this.e = i10;
        this.f3278f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        o4.b.h(i10, this.f3278f);
        Object obj = this.d[(i10 * 2) + this.e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // j4.a
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3278f;
    }
}
