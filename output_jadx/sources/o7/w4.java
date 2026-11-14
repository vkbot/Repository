package o7;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w4 implements w, u {
    public static final u2 e = new u2(20);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4766b;
    public final Object c;
    public final Object d;

    public w4(String str) {
        this.f4766b = 1;
        n7.l0 a10 = n7.l0.a();
        o4.b.i(a10, "registry");
        this.c = a10;
        o4.b.i(str, "defaultPolicy");
        this.d = str;
    }

    @Override // o7.u4
    public void a(n7.h hVar) {
        ((u) this.c).a(hVar);
    }

    @Override // o7.w
    public void b(n7.f1 f1Var, v vVar, n7.v0 v0Var) {
        boolean z9;
        boolean z10;
        x3 x3Var;
        v1 v1Var;
        com.bumptech.glide.manager.t tVar;
        boolean z11;
        switch (this.f4766b) {
            case 2:
                b1.m mVar = ((g1) ((w4) this.d).d).f4515b;
                if (f1Var.f()) {
                    ((r1) mVar.e).a();
                } else {
                    ((r1) mVar.f305f).a();
                }
                ((w) this.c).b(f1Var, vVar, v0Var);
                return;
            default:
                Integer num = -1;
                synchronized (((v1) this.d).f4740j) {
                    v1 v1Var2 = (v1) this.d;
                    v1Var2.f4746p = v1Var2.f4746p.d((c4) this.c);
                    ((v1) this.d).f4745o.f2803b.add(String.valueOf(f1Var.f4204a));
                }
                if (((v1) this.d).f4748s.decrementAndGet() == Integer.MIN_VALUE) {
                    ((v1) this.d).d.execute(new b4(this, 0));
                    return;
                }
                c4 c4Var = (c4) this.c;
                if (c4Var.c) {
                    v1 v1Var3 = (v1) this.d;
                    p3 j10 = v1Var3.j(c4Var);
                    if (j10 != null) {
                        v1Var3.c.execute(j10);
                    }
                    if (((v1) this.d).f4746p.f4800f == ((c4) this.c)) {
                        ((v1) this.d).s(f1Var, vVar, v0Var);
                        return;
                    }
                    return;
                }
                v vVar2 = v.e;
                if (vVar == vVar2 && ((v1) this.d).r.incrementAndGet() > 1000) {
                    v1 v1Var4 = (v1) this.d;
                    p3 j11 = v1Var4.j((c4) this.c);
                    if (j11 != null) {
                        v1Var4.c.execute(j11);
                    }
                    if (((v1) this.d).f4746p.f4800f == ((c4) this.c)) {
                        ((v1) this.d).s(n7.f1.f4200l.h("Too many transparent retries. Might be a bug in gRPC").g(f1Var.a()), vVar, v0Var);
                        return;
                    }
                    return;
                }
                if (((v1) this.d).f4746p.f4800f == null) {
                    boolean z12 = true;
                    if (vVar != vVar2 && (vVar != v.c || !((v1) this.d).f4747q.compareAndSet(false, true))) {
                        v vVar3 = v.d;
                        v1 v1Var5 = (v1) this.d;
                        if (vVar == vVar3) {
                            if (v1Var5.f4739i) {
                                v1Var5.q();
                            }
                        } else {
                            v1Var5.f4747q.set(true);
                            v1 v1Var6 = (v1) this.d;
                            if (v1Var6.f4739i) {
                                String str = (String) v0Var.c(v1.G);
                                if (str != null) {
                                    try {
                                        num = Integer.valueOf(str);
                                    } catch (NumberFormatException unused) {
                                    }
                                } else {
                                    num = null;
                                }
                                v1 v1Var7 = (v1) this.d;
                                boolean contains = v1Var7.f4738h.c.contains(f1Var.f4204a);
                                if (v1Var7.f4744n != null && (contains || (num != null && num.intValue() < 0))) {
                                    z11 = !v1Var7.f4744n.a();
                                } else {
                                    z11 = false;
                                }
                                if (contains && !z11 && !f1Var.f() && num != null && num.intValue() > 0) {
                                    num = 0;
                                }
                                if (!contains || z11) {
                                    z12 = false;
                                }
                                if (z12) {
                                    v1.b((v1) this.d, num);
                                }
                                synchronized (((v1) this.d).f4740j) {
                                    try {
                                        v1 v1Var8 = (v1) this.d;
                                        v1Var8.f4746p = v1Var8.f4746p.b((c4) this.c);
                                        if (z12) {
                                            v1 v1Var9 = (v1) this.d;
                                            if (!v1Var9.r(v1Var9.f4746p)) {
                                                if (!((v1) this.d).f4746p.d.isEmpty()) {
                                                }
                                            }
                                            return;
                                        }
                                    } finally {
                                    }
                                }
                            } else {
                                e4 e4Var = v1Var6.f4737g;
                                long j12 = 0;
                                if (e4Var == null) {
                                    x3Var = new x3(0L, false);
                                } else {
                                    boolean contains2 = e4Var.f4478f.contains(f1Var.f4204a);
                                    String str2 = (String) v0Var.c(v1.G);
                                    if (str2 != null) {
                                        try {
                                            num = Integer.valueOf(str2);
                                        } catch (NumberFormatException unused2) {
                                        }
                                    } else {
                                        num = null;
                                    }
                                    if (v1Var6.f4744n != null && (contains2 || (num != null && num.intValue() < 0))) {
                                        z9 = !v1Var6.f4744n.a();
                                    } else {
                                        z9 = false;
                                    }
                                    if (v1Var6.f4737g.f4476a > ((c4) this.c).d + 1 && !z9) {
                                        if (num == null) {
                                            if (contains2) {
                                                j12 = (long) (v1.I.nextDouble() * v1Var6.f4752y);
                                                double d = v1Var6.f4752y;
                                                e4 e4Var2 = v1Var6.f4737g;
                                                v1Var6.f4752y = Math.min((long) (d * e4Var2.d), e4Var2.c);
                                                z10 = true;
                                            }
                                        } else if (num.intValue() >= 0) {
                                            j12 = TimeUnit.MILLISECONDS.toNanos(num.intValue());
                                            v1Var6.f4752y = v1Var6.f4737g.f4477b;
                                            z10 = true;
                                        }
                                        x3Var = new x3(j12, z10);
                                    }
                                    z10 = false;
                                    x3Var = new x3(j12, z10);
                                }
                                if (x3Var.f4772a) {
                                    c4 k6 = ((v1) this.d).k(((c4) this.c).d + 1, false);
                                    if (k6 != null) {
                                        synchronized (((v1) this.d).f4740j) {
                                            v1Var = (v1) this.d;
                                            tVar = new com.bumptech.glide.manager.t(v1Var.f4740j);
                                            v1Var.w = tVar;
                                        }
                                        tVar.i(v1Var.e.schedule(new a4(this, k6, 0), x3Var.f4773b, TimeUnit.NANOSECONDS));
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    } else {
                        c4 k10 = ((v1) this.d).k(((c4) this.c).d, true);
                        if (k10 != null) {
                            v1 v1Var10 = (v1) this.d;
                            if (v1Var10.f4739i) {
                                synchronized (v1Var10.f4740j) {
                                    v1 v1Var11 = (v1) this.d;
                                    v1Var11.f4746p = v1Var11.f4746p.c((c4) this.c, k10);
                                }
                            }
                            ((v1) this.d).c.execute(new a4(this, k10, 1));
                            return;
                        }
                        return;
                    }
                }
                v1 v1Var12 = (v1) this.d;
                p3 j13 = v1Var12.j((c4) this.c);
                if (j13 != null) {
                    v1Var12.c.execute(j13);
                }
                if (((v1) this.d).f4746p.f4800f == ((c4) this.c)) {
                    ((v1) this.d).s(f1Var, vVar, v0Var);
                    return;
                }
                return;
        }
    }

    @Override // o7.u
    public void c(int i10) {
        ((u) this.c).c(i10);
    }

    @Override // o7.u
    public void d(w wVar) {
        b1.m mVar = ((g1) this.d).f4515b;
        ((r1) mVar.d).a();
        ((u2) mVar.c).q();
        ((u) this.c).d(new w4(2, this, wVar));
    }

    @Override // o7.u
    public void e(i7.i iVar) {
        ((u) this.c).e(iVar);
    }

    @Override // o7.u4
    public void f(t7.a aVar) {
        ((u) this.c).f(aVar);
    }

    @Override // o7.u4
    public void flush() {
        ((u) this.c).flush();
    }

    @Override // o7.u
    public void g(n7.q qVar) {
        ((u) this.c).g(qVar);
    }

    @Override // o7.u
    public void h(n7.f1 f1Var) {
        ((u) this.c).h(f1Var);
    }

    @Override // o7.u
    public void i() {
        ((u) this.c).i();
    }

    @Override // o7.u4
    public boolean isReady() {
        return ((u) this.c).isReady();
    }

    @Override // o7.w
    public void j() {
        switch (this.f4766b) {
            case 2:
                ((w) this.c).j();
                return;
            default:
                v1 v1Var = (v1) this.d;
                if (v1Var.isReady()) {
                    v1Var.d.execute(new b4(this, 1));
                    return;
                }
                return;
        }
    }

    @Override // o7.w
    public void k(o2 o2Var) {
        boolean z9;
        switch (this.f4766b) {
            case 2:
                ((w) this.c).k(o2Var);
                return;
            default:
                z3 z3Var = ((v1) this.d).f4746p;
                if (z3Var.f4800f != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o4.b.m(z9, "Headers should be received prior to messages.");
                if (z3Var.f4800f != ((c4) this.c)) {
                    Logger logger = y0.f4776a;
                    while (true) {
                        InputStream a10 = o2Var.a();
                        if (a10 != null) {
                            y0.b(a10);
                        } else {
                            return;
                        }
                    }
                } else {
                    ((v1) this.d).d.execute(new e0(24, this, o2Var));
                    return;
                }
        }
    }

    @Override // o7.w
    public void l(n7.v0 v0Var) {
        int i10;
        int i11;
        switch (this.f4766b) {
            case 2:
                ((w) this.c).l(v0Var);
                return;
            default:
                if (((c4) this.c).d > 0) {
                    n7.q0 q0Var = v1.F;
                    v0Var.a(q0Var);
                    v0Var.e(q0Var, String.valueOf(((c4) this.c).d));
                }
                v1 v1Var = (v1) this.d;
                c4 c4Var = (c4) this.c;
                n7.q0 q0Var2 = v1.F;
                p3 j10 = v1Var.j(c4Var);
                if (j10 != null) {
                    v1Var.c.execute(j10);
                }
                if (((v1) this.d).f4746p.f4800f == ((c4) this.c)) {
                    d4 d4Var = ((v1) this.d).f4744n;
                    if (d4Var != null) {
                        AtomicInteger atomicInteger = d4Var.d;
                        do {
                            i10 = atomicInteger.get();
                            i11 = d4Var.f4460a;
                            if (i10 == i11) {
                            }
                        } while (!atomicInteger.compareAndSet(i10, Math.min(d4Var.c + i10, i11)));
                    }
                    ((v1) this.d).d.execute(new e0(23, this, v0Var));
                    return;
                }
                return;
        }
    }

    @Override // o7.u
    public void m(int i10) {
        ((u) this.c).m(i10);
    }

    @Override // o7.u
    public void n(n7.o oVar) {
        ((u) this.c).n(oVar);
    }

    @Override // o7.u4
    public void o() {
        ((u) this.c).o();
    }

    @Override // o7.u4
    public void request() {
        ((u) this.c).request();
    }

    public String toString() {
        switch (this.f4766b) {
            case 2:
                com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
                t.c((w) this.c, "delegate");
                return t.toString();
            case 3:
                com.bumptech.glide.manager.s t3 = com.bumptech.glide.c.t(this);
                t3.c((u) this.c, "delegate");
                return t3.toString();
            default:
                return super.toString();
        }
    }

    public w4() {
        this.f4766b = 0;
        u2 u2Var = u2.d;
        this.d = p4.b();
        this.c = u2Var;
    }

    public /* synthetic */ w4(int i10, Object obj, Object obj2) {
        this.f4766b = i10;
        this.d = obj;
        this.c = obj2;
    }
}
