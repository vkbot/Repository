package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4557b;
    public final /* synthetic */ n.p c;

    public /* synthetic */ j0(n.p pVar, int i10) {
        this.f4557b = i10;
        this.c = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4557b) {
            case 0:
                this.c.k(true);
                return;
            case 1:
                this.c.k(false);
                return;
            default:
                f2 f2Var = (f2) this.c.c;
                o4.b.m(f2Var.G.get(), "Channel must have been shut down");
                f2Var.H = true;
                f2Var.k(false);
                f2.g(f2Var);
                return;
        }
    }
}
