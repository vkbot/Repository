package v7;

import java.util.List;
import n7.e0;
import n7.h0;
import n7.j0;
import o7.d3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5944b = 0;
    public Object c;
    public final /* synthetic */ j0 d;

    public d(t tVar, n7.e eVar) {
        this.d = tVar;
        this.c = new h(0, eVar);
    }

    @Override // v7.a, n7.e
    public final void D(n7.j jVar, h0 h0Var) {
        boolean z9;
        switch (this.f5944b) {
            case 0:
                j0 j0Var = (j0) this.c;
                e eVar = (e) this.d;
                j0 j0Var2 = eVar.f5951k;
                n7.j jVar2 = n7.j.c;
                if (j0Var == j0Var2) {
                    o4.b.m(eVar.f5954n, "there's pending lb while current lb has been out of READY");
                    eVar.f5952l = jVar;
                    eVar.f5953m = h0Var;
                    if (jVar == jVar2) {
                        eVar.h();
                        return;
                    }
                    return;
                }
                if (j0Var == eVar.f5949i) {
                    if (jVar == jVar2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    eVar.f5954n = z9;
                    if (!z9 && j0Var2 != eVar.f5946f) {
                        eVar.h();
                        return;
                    } else {
                        eVar.f5947g.D(jVar, h0Var);
                        return;
                    }
                }
                return;
            default:
                ((h) this.c).D(jVar, new d3(h0Var));
                return;
        }
    }

    @Override // v7.a
    public final n7.e E() {
        switch (this.f5944b) {
            case 0:
                return ((e) this.d).f5947g;
            default:
                return (h) this.c;
        }
    }

    @Override // v7.a, n7.e
    public n7.t b(e0 e0Var) {
        switch (this.f5944b) {
            case 1:
                t tVar = (t) this.d;
                l lVar = tVar.f5986f;
                s sVar = new s(tVar, e0Var, (h) this.c);
                List list = e0Var.f4174b;
                if (t.g(list)) {
                    if (lVar.f5967b.containsKey(((n7.r) list.get(0)).f4239a.get(0))) {
                        k kVar = (k) lVar.f5967b.get(((n7.r) list.get(0)).f4239a.get(0));
                        kVar.a(sVar);
                        if (kVar.d != null) {
                            sVar.s();
                        }
                    }
                }
                return sVar;
            default:
                return super.b(e0Var);
        }
    }

    public d(e eVar) {
        this.d = eVar;
    }
}
