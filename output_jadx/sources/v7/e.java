package v7;

import n7.f1;
import n7.g0;
import n7.h0;
import n7.j0;
import n7.k0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends j0 {

    /* renamed from: o, reason: collision with root package name */
    public static final o7.g f5945o = new o7.g(1);

    /* renamed from: f, reason: collision with root package name */
    public final c f5946f;

    /* renamed from: g, reason: collision with root package name */
    public final a f5947g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f5948h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f5949i;

    /* renamed from: j, reason: collision with root package name */
    public k0 f5950j;

    /* renamed from: k, reason: collision with root package name */
    public j0 f5951k;

    /* renamed from: l, reason: collision with root package name */
    public n7.j f5952l;

    /* renamed from: m, reason: collision with root package name */
    public h0 f5953m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5954n;

    public e(a aVar) {
        c cVar = new c(this);
        this.f5946f = cVar;
        this.f5949i = cVar;
        this.f5951k = cVar;
        this.f5947g = aVar;
    }

    @Override // n7.j0
    public final boolean b() {
        return g().b();
    }

    @Override // n7.j0
    public final void c(f1 f1Var) {
        g().c(f1Var);
    }

    @Override // n7.j0
    public final void d(g0 g0Var) {
        g().d(g0Var);
    }

    @Override // n7.j0
    public final void e() {
        g().e();
    }

    @Override // n7.j0
    public final void f() {
        this.f5951k.f();
        this.f5949i.f();
    }

    public final j0 g() {
        j0 j0Var = this.f5951k;
        if (j0Var == this.f5946f) {
            return this.f5949i;
        }
        return j0Var;
    }

    public final void h() {
        this.f5947g.D(this.f5952l, this.f5953m);
        this.f5949i.f();
        this.f5949i = this.f5951k;
        this.f5948h = this.f5950j;
        this.f5951k = this.f5946f;
        this.f5950j = null;
    }

    public final void i(k0 k0Var) {
        o4.b.i(k0Var, "newBalancerFactory");
        if (k0Var == this.f5950j) {
            return;
        }
        this.f5951k.f();
        this.f5951k = this.f5946f;
        this.f5950j = null;
        this.f5952l = n7.j.f4214b;
        this.f5953m = f5945o;
        if (k0Var == this.f5948h) {
            return;
        }
        d dVar = new d(this);
        j0 b10 = k0Var.b(dVar);
        dVar.c = b10;
        this.f5951k = b10;
        this.f5950j = k0Var;
        if (!this.f5954n) {
            h();
        }
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(g(), "delegate");
        return t.toString();
    }
}
