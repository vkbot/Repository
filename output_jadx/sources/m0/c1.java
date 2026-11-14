package m0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3615b;
    public final /* synthetic */ e1 c;
    public final /* synthetic */ h1 d;
    public final /* synthetic */ String e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3616f;

    public /* synthetic */ c1(e1 e1Var, h1 h1Var, String str, int i10, int i11) {
        this.f3615b = i11;
        this.c = e1Var;
        this.d = h1Var;
        this.e = str;
        this.f3616f = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3615b) {
            case 0:
                h1 h1Var = this.d;
                h1Var.f3716i = false;
                h1Var.f3717j = this.e;
                i1.v((i1) this.c.f3675i, this.f3616f);
                return;
            case 1:
                this.d.f3717j = this.e;
                i1.v((i1) this.c.f3675i, this.f3616f);
                return;
            default:
                this.d.f3717j = this.e;
                i1.v((i1) this.c.f3675i, this.f3616f);
                return;
        }
    }
}
