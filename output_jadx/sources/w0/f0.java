package w0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6082b;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ f0(l0 l0Var, int i10, int i11) {
        this.f6082b = i11;
        this.c = l0Var;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6082b) {
            case 0:
                l0 l0Var = this.c;
                if (this.d == l0Var.f6163h.get()) {
                    l0Var.c0();
                    return;
                }
                return;
            default:
                l0 l0Var2 = this.c;
                if (this.d == l0Var2.f6163h.get()) {
                    l0Var2.c0();
                    l0Var2.S();
                    return;
                }
                return;
        }
    }
}
