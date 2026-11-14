package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d3 extends n7.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4458a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4459b;

    public d3(n7.f0 f0Var) {
        o4.b.i(f0Var, "result");
        this.f4459b = f0Var;
    }

    @Override // n7.h0
    public final n7.f0 a(g3 g3Var) {
        switch (this.f4458a) {
            case 0:
                return (n7.f0) this.f4459b;
            default:
                n7.f0 a10 = ((n7.h0) this.f4459b).a(g3Var);
                n7.t tVar = a10.f4192a;
                if (tVar != null) {
                    n7.b d = tVar.d();
                    return n7.f0.b(tVar, new v7.r((v7.k) d.f4158a.get(v7.t.f5985n), a10.f4193b));
                }
                return a10;
        }
    }

    public String toString() {
        switch (this.f4458a) {
            case 0:
                com.bumptech.glide.manager.s sVar = new com.bumptech.glide.manager.s(d3.class.getSimpleName());
                sVar.c((n7.f0) this.f4459b, "result");
                return sVar.toString();
            default:
                return super.toString();
        }
    }

    public d3(n7.h0 h0Var) {
        this.f4459b = h0Var;
    }
}
