package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4443b;
    public final /* synthetic */ w4 c;

    public /* synthetic */ b4(w4 w4Var, int i10) {
        this.f4443b = i10;
        this.c = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4443b) {
            case 0:
                v1 v1Var = (v1) this.c.d;
                v1Var.A = true;
                w wVar = v1Var.f4750v;
                a5.h hVar = v1Var.t;
                wVar.b((n7.f1) hVar.c, (v) hVar.d, (n7.v0) hVar.e);
                return;
            default:
                v1 v1Var2 = (v1) this.c.d;
                if (!v1Var2.A) {
                    v1Var2.f4750v.j();
                    return;
                }
                return;
        }
    }
}
