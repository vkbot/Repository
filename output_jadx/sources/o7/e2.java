package o7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e2 extends n7.t {
    public final n7.e0 d;
    public final n7.a0 e;

    /* renamed from: f, reason: collision with root package name */
    public final m f4465f;

    /* renamed from: g, reason: collision with root package name */
    public final o f4466g;

    /* renamed from: h, reason: collision with root package name */
    public List f4467h;

    /* renamed from: i, reason: collision with root package name */
    public k1 f4468i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4469j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4470k;

    /* renamed from: l, reason: collision with root package name */
    public l.d f4471l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f2 f4472m;

    public e2(f2 f2Var, n7.e0 e0Var) {
        this.f4472m = f2Var;
        List list = e0Var.f4174b;
        this.f4467h = list;
        u2 u2Var = f2Var.f4499l;
        this.d = e0Var;
        n7.a0 a0Var = new n7.a0(n7.a0.d.incrementAndGet(), "Subchannel", f2Var.t.e());
        this.e = a0Var;
        o oVar = new o(a0Var, u2Var.q(), "Subchannel for " + list);
        this.f4466g = oVar;
        this.f4465f = new m(oVar, u2Var);
    }

    @Override // n7.t
    public final List c() {
        this.f4472m.f4500m.d();
        o4.b.m(this.f4469j, "not started");
        return this.f4467h;
    }

    @Override // n7.t
    public final n7.b d() {
        return this.d.c;
    }

    @Override // n7.t
    public final n7.e e() {
        return this.f4465f;
    }

    @Override // n7.t
    public final Object f() {
        o4.b.m(this.f4469j, "Subchannel is not started");
        return this.f4468i;
    }

    @Override // n7.t
    public final void l() {
        this.f4472m.f4500m.d();
        o4.b.m(this.f4469j, "not started");
        k1 k1Var = this.f4468i;
        if (k1Var.f4593v != null) {
            return;
        }
        k1Var.f4584k.execute(new f1(k1Var, 1));
    }

    @Override // n7.t
    public final void n() {
        l.d dVar;
        f2 f2Var = this.f4472m;
        f2Var.f4500m.d();
        if (this.f4468i == null) {
            this.f4470k = true;
            return;
        }
        if (this.f4470k) {
            if (f2Var.H && (dVar = this.f4471l) != null) {
                dVar.j();
                this.f4471l = null;
            } else {
                return;
            }
        } else {
            this.f4470k = true;
        }
        if (!f2Var.H) {
            this.f4471l = f2Var.f4500m.c(new q1(new com.bumptech.glide.m(17, this)), 5L, TimeUnit.SECONDS, f2Var.f4493f.f4597b.e);
        } else {
            k1 k1Var = this.f4468i;
            k1Var.f4584k.execute(new e0(15, k1Var, f2.f4484e0));
        }
    }

    @Override // n7.t
    public final void p(n7.i0 i0Var) {
        f2 f2Var = this.f4472m;
        f2Var.f4500m.d();
        o4.b.m(!this.f4469j, "already started");
        o4.b.m(!this.f4470k, "already shutdown");
        o4.b.m(!f2Var.H, "Channel is being terminated");
        this.f4469j = true;
        List list = this.d.f4174b;
        String e = f2Var.t.e();
        u2 u2Var = f2Var.f4505s;
        l lVar = f2Var.f4493f;
        ScheduledExecutorService scheduledExecutorService = lVar.f4597b.e;
        u2 u2Var2 = f2Var.f4503p;
        n7.k1 k1Var = f2Var.f4500m;
        w4 w4Var = new w4(4, this, i0Var);
        n7.x xVar = f2Var.O;
        f2Var.K.getClass();
        k1 k1Var2 = new k1(list, e, u2Var, lVar, scheduledExecutorService, u2Var2, k1Var, w4Var, xVar, new b1.m(11), this.f4466g, this.e, this.f4465f, f2Var.f4506u);
        f2Var.M.b(new n7.w("Child Subchannel started", n7.v.f4247b, f2Var.f4499l.q(), k1Var2));
        this.f4468i = k1Var2;
        f2Var.A.add(k1Var2);
    }

    @Override // n7.t
    public final void q(List list) {
        this.f4472m.f4500m.d();
        this.f4467h = list;
        k1 k1Var = this.f4468i;
        k1Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o4.b.i(it.next(), "newAddressGroups contains null entry");
        }
        o4.b.d("newAddressGroups is empty", !list.isEmpty());
        k1Var.f4584k.execute(new e0(14, k1Var, Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.e.toString();
    }
}
