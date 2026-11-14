package i9;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class n0 implements g9.e {

    /* renamed from: a, reason: collision with root package name */
    public final g9.e f2925a;

    public n0(g9.e eVar) {
        this.f2925a = eVar;
    }

    @Override // g9.e
    public final boolean c() {
        return false;
    }

    @Override // g9.e
    public final int d() {
        return 1;
    }

    @Override // g9.e
    public final String e(int i10) {
        return String.valueOf(i10);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (Intrinsics.areEqual(this.f2925a, n0Var.f2925a) && Intrinsics.areEqual(a(), n0Var.a())) {
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
        if (i10 >= 0) {
            return this.f2925a;
        }
        androidx.navigation.b.l(ai.onnxruntime.a.q(i10, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // g9.e
    public final boolean g(int i10) {
        if (i10 >= 0) {
            return false;
        }
        androidx.navigation.b.l(ai.onnxruntime.a.q(i10, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return false;
    }

    @Override // g9.e
    public final com.bumptech.glide.d getKind() {
        return g9.j.e;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f2925a.hashCode() * 31);
    }

    @Override // g9.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f2925a + ')';
    }
}
