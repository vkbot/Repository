package o7;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w1 extends n7.s {
    public final n7.y d;
    public final n7.d e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f4758f;

    /* renamed from: g, reason: collision with root package name */
    public final n7.x0 f4759g;

    /* renamed from: h, reason: collision with root package name */
    public final n7.n f4760h;

    /* renamed from: i, reason: collision with root package name */
    public n7.c f4761i;

    /* renamed from: j, reason: collision with root package name */
    public n7.t f4762j;

    public w1(n7.y yVar, a2 a2Var, Executor executor, n7.x0 x0Var, n7.c cVar) {
        this.d = yVar;
        this.e = a2Var;
        this.f4759g = x0Var;
        Executor executor2 = cVar.f4165b;
        executor = executor2 != null ? executor2 : executor;
        this.f4758f = executor;
        c2.k b10 = n7.c.b(cVar);
        b10.d = executor;
        this.f4761i = new n7.c(b10);
        this.f4760h = n7.n.b();
    }

    @Override // n7.s, n7.t
    public final void a(String str, Throwable th) {
        n7.t tVar = this.f4762j;
        if (tVar != null) {
            tVar.a(str, th);
        }
    }

    @Override // n7.t
    public final void o(n7.e eVar, n7.v0 v0Var) {
        n7.c cVar = this.f4761i;
        n7.x0 x0Var = this.f4759g;
        o4.b.i(x0Var, "method");
        o4.b.i(cVar, "callOptions");
        l.d a10 = this.d.a();
        n7.f1 f1Var = (n7.f1) a10.c;
        if (!f1Var.f()) {
            this.f4758f.execute(new h0(this, eVar, y0.h(f1Var)));
            this.f4762j = f2.f4488i0;
            return;
        }
        l2 l2Var = (l2) a10.d;
        j2 j2Var = (j2) l2Var.f4608b.get(x0Var.f4256b);
        if (j2Var == null) {
            j2Var = (j2) l2Var.c.get(x0Var.c);
        }
        if (j2Var == null) {
            j2Var = l2Var.f4607a;
        }
        if (j2Var != null) {
            this.f4761i = this.f4761i.c(j2.f4559g, j2Var);
        }
        n7.t f8 = this.e.f(x0Var, this.f4761i);
        this.f4762j = f8;
        f8.o(eVar, v0Var);
    }

    @Override // n7.s
    public final n7.t r() {
        return this.f4762j;
    }
}
