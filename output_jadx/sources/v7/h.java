package v7;

import n7.e0;
import n7.h0;
import n7.i0;
import n7.j0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5957b;
    public final Object c;

    public /* synthetic */ h(int i10, Object obj) {
        this.f5957b = i10;
        this.c = obj;
    }

    @Override // v7.a, n7.e
    public void D(n7.j jVar, h0 h0Var) {
        switch (this.f5957b) {
            case 1:
                i iVar = (i) this.c;
                x xVar = iVar.f5961g;
                if (xVar.f5997f.containsKey(iVar.f5958a)) {
                    iVar.d = jVar;
                    iVar.e = h0Var;
                    if (!iVar.f5960f && !xVar.f5999h) {
                        if (jVar == n7.j.e) {
                            iVar.f5959b.e();
                        }
                        xVar.j();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.D(jVar, h0Var);
                return;
        }
    }

    @Override // v7.a
    public final n7.e E() {
        switch (this.f5957b) {
            case 0:
                return (n7.e) this.c;
            default:
                return ((i) this.c).f5961g.f5998g;
        }
    }

    @Override // v7.a, n7.e
    public n7.t b(e0 e0Var) {
        switch (this.f5957b) {
            case 0:
                i0 i0Var = (i0) e0Var.c();
                n7.t b10 = super.b(e0Var);
                if (i0Var != null) {
                    n7.b d = b10.d();
                    if (d.f4158a.get(j0.d) == null) {
                        return new g(b10, i0Var);
                    }
                    return b10;
                }
                return b10;
            default:
                return super.b(e0Var);
        }
    }
}
