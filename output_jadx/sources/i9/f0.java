package i9;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class f0 implements g9.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2890a;

    /* renamed from: b, reason: collision with root package name */
    public final g9.e f2891b;
    public final g9.e c;

    public f0(String str, g9.e eVar, g9.e eVar2) {
        this.f2890a = str;
        this.f2891b = eVar;
        this.c = eVar2;
    }

    @Override // g9.e
    public final String a() {
        return this.f2890a;
    }

    @Override // g9.e
    public final boolean c() {
        return false;
    }

    @Override // g9.e
    public final int d() {
        return 2;
    }

    @Override // g9.e
    public final String e(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                if (!Intrinsics.areEqual(this.f2890a, f0Var.f2890a) || !Intrinsics.areEqual(this.f2891b, f0Var.f2891b) || !Intrinsics.areEqual(this.c, f0Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // g9.e
    public final g9.e f(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 != 0) {
                if (i11 == 1) {
                    return this.c;
                }
                j1.i.l("Unreached");
                return null;
            }
            return this.f2891b;
        }
        l9.i.d(ai.onnxruntime.a.p(ai.onnxruntime.a.q(i10, "Illegal index ", ", "), this.f2890a, " expects only non-negative indices"));
        return null;
    }

    @Override // g9.e
    public final boolean g(int i10) {
        if (i10 >= 0) {
            return false;
        }
        l9.i.d(ai.onnxruntime.a.p(ai.onnxruntime.a.q(i10, "Illegal index ", ", "), this.f2890a, " expects only non-negative indices"));
        return false;
    }

    @Override // g9.e
    public final com.bumptech.glide.d getKind() {
        return g9.j.f2518f;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f2891b.hashCode() + (this.f2890a.hashCode() * 31)) * 31);
    }

    @Override // g9.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.f2890a + '(' + this.f2891b + ", " + this.c + ')';
    }
}
