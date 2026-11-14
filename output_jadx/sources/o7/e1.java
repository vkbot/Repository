package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e1 extends k.a {
    public final /* synthetic */ int c;
    public final /* synthetic */ n7.z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(n7.z zVar, int i10) {
        super(2);
        this.c = i10;
        this.d = zVar;
    }

    @Override // k.a
    public final void a() {
        switch (this.c) {
            case 0:
                k1 k1Var = (k1) this.d;
                ((e2) k1Var.d.d).f4472m.Y.d(k1Var, true);
                return;
            case 1:
                ((f2) this.d).h();
                return;
            default:
                ((p7.n) this.d).f5075h.j(true);
                return;
        }
    }

    @Override // k.a
    public final void b() {
        switch (this.c) {
            case 0:
                k1 k1Var = (k1) this.d;
                ((e2) k1Var.d.d).f4472m.Y.d(k1Var, false);
                return;
            case 1:
                f2 f2Var = (f2) this.d;
                if (!f2Var.G.get()) {
                    f2Var.j();
                    return;
                }
                return;
            default:
                ((p7.n) this.d).f5075h.j(false);
                return;
        }
    }
}
