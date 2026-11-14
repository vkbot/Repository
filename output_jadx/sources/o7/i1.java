package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4549b;
    public final /* synthetic */ com.bumptech.glide.manager.t c;

    public /* synthetic */ i1(com.bumptech.glide.manager.t tVar, int i10) {
        this.f4549b = i10;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.f4549b) {
            case 0:
                com.bumptech.glide.manager.t tVar = this.c;
                k1 k1Var = (k1) tVar.e;
                k1Var.f4587n = null;
                if (k1Var.f4594x != null) {
                    if (k1Var.f4593v == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o4.b.m(z9, "Unexpected non-null activeTransport");
                    com.bumptech.glide.manager.t tVar2 = this.c;
                    ((g1) tVar2.d).a(((k1) tVar2.e).f4594x);
                    return;
                }
                g1 g1Var = k1Var.f4592u;
                g1 g1Var2 = (g1) tVar.d;
                if (g1Var == g1Var2) {
                    k1Var.f4593v = g1Var2;
                    k1 k1Var2 = (k1) this.c.e;
                    k1Var2.f4592u = null;
                    k1.e(k1Var2, n7.j.c);
                    return;
                }
                return;
            default:
                com.bumptech.glide.manager.t tVar3 = this.c;
                ((k1) tVar3.e).f4591s.remove((g1) tVar3.d);
                if (((k1) this.c.e).w.f4220a == n7.j.f4215f && ((k1) this.c.e).f4591s.isEmpty()) {
                    k1 k1Var3 = (k1) this.c.e;
                    k1Var3.f4584k.execute(new f1(k1Var3, 2));
                    return;
                }
                return;
        }
    }
}
