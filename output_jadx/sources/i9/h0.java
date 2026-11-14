package i9;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class h0 extends f1 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2904l;

    public h0(String str, i0 i0Var) {
        super(str, i0Var, 1);
        this.f2904l = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                g9.e eVar = (g9.e) obj;
                if (Intrinsics.areEqual(this.f2892a, eVar.a())) {
                    h0 h0Var = (h0) obj;
                    if (h0Var.f2904l && Arrays.equals((g9.e[]) this.f2898j.getValue(), (g9.e[]) h0Var.f2898j.getValue())) {
                        int d = eVar.d();
                        int i10 = this.c;
                        if (i10 == d) {
                            for (int i11 = 0; i11 < i10; i11++) {
                                if (Intrinsics.areEqual(f(i11).a(), eVar.f(i11).a()) && Intrinsics.areEqual(f(i11).getKind(), eVar.f(i11).getKind())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // i9.f1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // i9.f1, g9.e
    public final boolean isInline() {
        return this.f2904l;
    }
}
