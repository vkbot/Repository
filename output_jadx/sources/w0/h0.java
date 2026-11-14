package w0;

import java.util.function.BooleanSupplier;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements BooleanSupplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f6115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6116b;
    public final /* synthetic */ int c;

    public /* synthetic */ h0(l0 l0Var, int i10, int i11) {
        this.f6115a = l0Var;
        this.f6116b = i10;
        this.c = i11;
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        l0 l0Var = this.f6115a;
        int i10 = this.f6116b;
        int i11 = this.c;
        if (l0Var.c(i10) && !l0Var.f6166k && l0Var.f6163h.get() == i11 && l0Var.j0()) {
            return true;
        }
        return false;
    }
}
