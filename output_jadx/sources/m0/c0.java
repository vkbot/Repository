package m0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3614b;
    public final /* synthetic */ e0 c;

    public /* synthetic */ c0(e0 e0Var, int i10) {
        this.f3614b = i10;
        this.c = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3614b;
        e0 e0Var = this.c;
        switch (i10) {
            case 0:
                if (e0Var.getView() != null) {
                    String h2 = e0.m.h(new byte[]{99, 67, -62, 0, -60, 91, -39, 18, 103, 87, -40}, new byte[]{19, 34, -85, 114, -101, 40, -83, 115});
                    String str = e0.A;
                    boolean B = e0Var.B(h2, false);
                    int i11 = e0Var.r + 1;
                    e0Var.r = i11;
                    if (B && i11 < 50) {
                        e0Var.f3662o.postDelayed(this, 1500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (e0Var.getView() != null) {
                    String str2 = e0.A;
                    e0Var.y();
                    e0Var.f3662o.postDelayed(this, 1000L);
                    return;
                }
                return;
        }
    }
}
