package w0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6079b;
    public final /* synthetic */ l0 c;

    public /* synthetic */ e0(l0 l0Var, int i10) {
        this.f6079b = i10;
        this.c = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6079b) {
            case 0:
                l0 l0Var = this.c;
                l0Var.c0();
                l0Var.d.shutdownNow();
                return;
            case 1:
                l0 l0Var2 = this.c;
                l0Var2.f6172q = -1;
                l0Var2.f6161f.c();
                return;
            default:
                l0 l0Var3 = this.c;
                if (!l0Var3.f6169n.isEmpty() && !l0Var3.j0()) {
                    l0Var3.c0();
                    l0Var3.f6161f.c();
                    l0Var3.f6164i = false;
                }
                l0Var3.S();
                return;
        }
    }
}
