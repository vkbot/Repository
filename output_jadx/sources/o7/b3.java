package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b3 implements n7.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n7.t f4441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f4442b;

    public b3(e3 e3Var, n7.t tVar) {
        this.f4442b = e3Var;
        this.f4441a = tVar;
    }

    @Override // n7.i0
    public final void a(n7.k kVar) {
        n7.h0 d3Var;
        e3 e3Var = this.f4442b;
        n7.e eVar = e3Var.f4473f;
        n7.j jVar = kVar.f4220a;
        if (jVar != n7.j.f4215f) {
            n7.j jVar2 = n7.j.e;
            n7.j jVar3 = n7.j.d;
            if (jVar == jVar3 || jVar == jVar2) {
                eVar.y();
            }
            if (e3Var.f4475h == jVar3) {
                if (jVar == n7.j.f4214b) {
                    return;
                }
                if (jVar == jVar2) {
                    e3Var.e();
                    return;
                }
            }
            int ordinal = jVar.ordinal();
            if (ordinal != 0) {
                n7.t tVar = this.f4441a;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            d3Var = new y2(e3Var, tVar);
                        } else {
                            androidx.navigation.b.t(jVar, "Unsupported state:");
                            return;
                        }
                    } else {
                        d3Var = new d3(n7.f0.a(kVar.f4221b));
                    }
                } else {
                    d3Var = new d3(n7.f0.b(tVar, null));
                }
            } else {
                d3Var = new d3(n7.f0.e);
            }
            e3Var.f4475h = jVar;
            eVar.D(jVar, d3Var);
        }
    }
}
