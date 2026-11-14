package o7;

import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b implements u, u4 {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f4403h = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final w4 f4404b;
    public final v0 c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public n7.v0 f4405f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4406g;

    public b(c5.e eVar, t4 t4Var, w4 w4Var, n7.v0 v0Var, n7.c cVar, boolean z9) {
        o4.b.i(v0Var, "headers");
        o4.b.i(w4Var, "transportTracer");
        this.f4404b = w4Var;
        this.d = !Boolean.TRUE.equals(cVar.a(y0.f4786n));
        this.e = z9;
        if (!z9) {
            this.c = new t2(this, eVar, t4Var);
            this.f4405f = v0Var;
        } else {
            this.c = new a(this, v0Var, t4Var);
        }
    }

    @Override // o7.u4
    public final void a(n7.h hVar) {
        this.c.a(hVar);
    }

    public final void b(p7.u uVar, boolean z9, boolean z10, int i10) {
        boolean z11;
        l9.l lVar;
        if (uVar == null && !z9) {
            z11 = false;
        } else {
            z11 = true;
        }
        o4.b.d("null frame before EOS", z11);
        n.p pVar = ((p7.k) this).f5067n;
        pVar.getClass();
        w7.b.c();
        try {
            if (uVar == null) {
                lVar = p7.k.f5061q;
            } else {
                lVar = uVar.f5107a;
                int i11 = (int) lVar.c;
                if (i11 > 0) {
                    p7.j jVar = ((p7.k) pVar.c).f5066m;
                    synchronized (jVar.f4415b) {
                        jVar.e += i11;
                    }
                }
            }
            synchronized (((p7.k) pVar.c).f5066m.w) {
                p7.j.k(((p7.k) pVar.c).f5066m, lVar, z9, z10);
                w4 w4Var = ((p7.k) pVar.c).f4404b;
                if (i10 == 0) {
                    w4Var.getClass();
                } else {
                    w4Var.getClass();
                    ((u2) w4Var.c).q();
                }
            }
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o7.u
    public final void c(int i10) {
        this.c.c(i10);
    }

    @Override // o7.u
    public final void d(w wVar) {
        boolean z9;
        p7.k kVar = (p7.k) this;
        p7.j jVar = kVar.f5066m;
        if (jVar.f4420j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "Already called setListener");
        o4.b.i(wVar, "listener");
        jVar.f4420j = wVar;
        if (!this.e) {
            kVar.f5067n.l(this.f4405f, null);
            this.f4405f = null;
        }
    }

    @Override // o7.u
    public final void e(i7.i iVar) {
        iVar.b(((p7.k) this).f5068o.f4158a.get(n7.t.f4243a), "remote_addr");
    }

    @Override // o7.u4
    public final void f(t7.a aVar) {
        v0 v0Var = this.c;
        try {
            if (!v0Var.isClosed()) {
                v0Var.b(aVar);
            }
        } finally {
            y0.b(aVar);
        }
    }

    @Override // o7.u4
    public final void flush() {
        v0 v0Var = this.c;
        if (!v0Var.isClosed()) {
            v0Var.flush();
        }
    }

    @Override // o7.u
    public final void g(n7.q qVar) {
        boolean z9;
        p7.j jVar = ((p7.k) this).f5066m;
        if (jVar.f4420j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "Already called start");
        o4.b.i(qVar, "decompressorRegistry");
        jVar.f4421k = qVar;
    }

    @Override // o7.u
    public final void h(n7.f1 f1Var) {
        o4.b.d("Should not cancel with OK status", !f1Var.f());
        this.f4406g = true;
        n.p pVar = ((p7.k) this).f5067n;
        pVar.getClass();
        w7.b.c();
        try {
            synchronized (((p7.k) pVar.c).f5066m.w) {
                ((p7.k) pVar.c).f5066m.l(f1Var, true, null);
            }
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o7.u
    public final void i() {
        p7.k kVar = (p7.k) this;
        if (!kVar.f5066m.f4424n) {
            kVar.f5066m.f4424n = true;
            this.c.close();
        }
    }

    @Override // o7.u4
    public final boolean isReady() {
        if (((p7.k) this).f5066m.f() && !this.f4406g) {
            return true;
        }
        return false;
    }

    @Override // o7.u
    public final void m(int i10) {
        ((p7.k) this).f5066m.f4414a.c = i10;
    }

    @Override // o7.u
    public final void n(n7.o oVar) {
        n7.v0 v0Var = this.f4405f;
        n7.q0 q0Var = y0.c;
        v0Var.a(q0Var);
        this.f4405f.e(q0Var, Long.valueOf(Math.max(0L, oVar.b())));
    }

    @Override // o7.u4
    public final void o() {
        p7.j jVar = ((p7.k) this).f5066m;
        q2 q2Var = jVar.d;
        q2Var.f4669b = jVar;
        jVar.f4414a = q2Var;
    }

    @Override // o7.u4
    public final void request() {
        p7.j jVar = ((p7.k) this).f5066m;
        jVar.getClass();
        w7.b.b();
        com.bumptech.glide.m mVar = new com.bumptech.glide.m(9, jVar);
        synchronized (jVar.w) {
            mVar.run();
        }
    }
}
