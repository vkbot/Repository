package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4481b;
    public final /* synthetic */ k1 c;

    public /* synthetic */ f1(k1 k1Var, int i10) {
        this.f4481b = i10;
        this.c = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4481b) {
            case 0:
                k1 k1Var = this.c;
                k1Var.f4589p = null;
                k1Var.f4582i.m(2, "CONNECTING after backoff");
                k1.e(k1Var, n7.j.f4214b);
                k1.f(k1Var);
                return;
            case 1:
                if (this.c.w.f4220a == n7.j.e) {
                    this.c.f4582i.m(2, "CONNECTING as requested");
                    k1.e(this.c, n7.j.f4214b);
                    k1.f(this.c);
                    return;
                }
                return;
            default:
                k1 k1Var2 = this.c;
                k1Var2.f4582i.m(2, "Terminated");
                f2 f2Var = ((e2) k1Var2.d.d).f4472m;
                f2Var.A.remove(k1Var2);
                f2.g(f2Var);
                return;
        }
    }
}
