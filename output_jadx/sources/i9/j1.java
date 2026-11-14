package i9;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class j1 implements g9.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2912a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.d f2913b;

    public j1(String str, g9.d dVar) {
        this.f2912a = str;
        this.f2913b = dVar;
    }

    @Override // g9.e
    public final String a() {
        return this.f2912a;
    }

    @Override // g9.e
    public final boolean c() {
        return false;
    }

    @Override // g9.e
    public final int d() {
        return 0;
    }

    @Override // g9.e
    public final String e(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j1) {
                j1 j1Var = (j1) obj;
                if (Intrinsics.areEqual(this.f2912a, j1Var.f2912a) && Intrinsics.areEqual(this.f2913b, j1Var.f2913b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // g9.e
    public final g9.e f(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // g9.e
    public final boolean g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // g9.e
    public final com.bumptech.glide.d getKind() {
        return this.f2913b;
    }

    public final int hashCode() {
        return (this.f2913b.hashCode() * 31) + this.f2912a.hashCode();
    }

    @Override // g9.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "PrimitiveDescriptor(" + this.f2912a + ')';
    }
}
