package o7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b2 extends n7.t {
    public static final g0 r;
    public final ScheduledFuture d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final n7.n f4429f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4430g;

    /* renamed from: h, reason: collision with root package name */
    public n7.e f4431h;

    /* renamed from: i, reason: collision with root package name */
    public n7.t f4432i;

    /* renamed from: j, reason: collision with root package name */
    public n7.f1 f4433j;

    /* renamed from: k, reason: collision with root package name */
    public List f4434k;

    /* renamed from: l, reason: collision with root package name */
    public i0 f4435l;

    /* renamed from: m, reason: collision with root package name */
    public final n7.n f4436m;

    /* renamed from: n, reason: collision with root package name */
    public final n7.x0 f4437n;

    /* renamed from: o, reason: collision with root package name */
    public final n7.c f4438o;

    /* renamed from: p, reason: collision with root package name */
    public final long f4439p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c2 f4440q;

    static {
        Logger.getLogger(b2.class.getName());
        r = new g0(0);
    }

    public b2(c2 c2Var, n7.n nVar, n7.x0 x0Var, n7.c cVar) {
        ScheduledFuture<?> schedule;
        this.f4440q = c2Var;
        f2 f2Var = c2Var.d;
        Logger logger = f2.f4482c0;
        Executor executor = cVar.f4165b;
        executor = executor == null ? f2Var.f4495h : executor;
        d2 d2Var = f2Var.f4494g;
        n7.o oVar = cVar.f4164a;
        this.f4434k = new ArrayList();
        o4.b.i(executor, "callExecutor");
        this.e = executor;
        o4.b.i(d2Var, "scheduler");
        n7.n b10 = n7.n.b();
        this.f4429f = b10;
        b10.getClass();
        if (oVar == null) {
            schedule = null;
        } else {
            long b11 = oVar.b();
            long abs = Math.abs(b11) / 1000000000;
            long abs2 = Math.abs(b11) % 1000000000;
            StringBuilder sb = new StringBuilder();
            if (b11 < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(abs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            schedule = d2Var.f4457b.schedule(new e0(0, this, sb), b11, TimeUnit.NANOSECONDS);
        }
        this.d = schedule;
        this.f4436m = nVar;
        this.f4437n = x0Var;
        this.f4438o = cVar;
        f2Var.X.getClass();
        this.f4439p = System.nanoTime();
    }

    @Override // n7.t
    public final void a(String str, Throwable th) {
        n7.f1 h2;
        n7.f1 f1Var = n7.f1.f4194f;
        if (str != null) {
            h2 = f1Var.h(str);
        } else {
            h2 = f1Var.h("Call cancelled without message");
        }
        if (th != null) {
            h2 = h2.g(th);
        }
        r(h2, false);
    }

    @Override // n7.t
    public final void g() {
        s(new f0(this, 1));
    }

    @Override // n7.t
    public final void k() {
        if (this.f4430g) {
            this.f4432i.k();
        } else {
            s(new f0(this, 0));
        }
    }

    @Override // n7.t
    public final void m(y5.g gVar) {
        if (this.f4430g) {
            this.f4432i.m(gVar);
        } else {
            s(new e0(2, this, gVar));
        }
    }

    @Override // n7.t
    public final void o(n7.e eVar, n7.v0 v0Var) {
        boolean z9;
        n7.f1 f1Var;
        boolean z10;
        if (this.f4431h == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "already started");
        synchronized (this) {
            try {
                this.f4431h = eVar;
                f1Var = this.f4433j;
                z10 = this.f4430g;
                if (!z10) {
                    i0 i0Var = new i0(eVar);
                    this.f4435l = i0Var;
                    eVar = i0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f1Var != null) {
            this.e.execute(new h0(this, eVar, f1Var));
        } else if (z10) {
            this.f4432i.o(eVar, v0Var);
        } else {
            s(new c3.e(this, eVar, v0Var, 2));
        }
    }

    public final void r(n7.f1 f1Var, boolean z9) {
        n7.e eVar;
        synchronized (this) {
            try {
                n7.t tVar = this.f4432i;
                boolean z10 = true;
                if (tVar == null) {
                    g0 g0Var = r;
                    if (tVar != null) {
                        z10 = false;
                    }
                    o4.b.l("realCall already set to %s", z10, tVar);
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f4432i = g0Var;
                    eVar = this.f4431h;
                    this.f4433j = f1Var;
                    z10 = false;
                } else if (z9) {
                    return;
                } else {
                    eVar = null;
                }
                if (z10) {
                    s(new e0(1, this, f1Var));
                } else {
                    if (eVar != null) {
                        this.e.execute(new h0(this, eVar, f1Var));
                    }
                    t();
                }
                this.f4440q.d.f4500m.execute(new f0(this, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(Runnable runnable) {
        synchronized (this) {
            try {
                if (!this.f4430g) {
                    this.f4434k.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f4434k     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f4434k = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f4430g = r0     // Catch: java.lang.Throwable -> L24
            o7.i0 r0 = r3.f4435l     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.e
            o7.r r2 = new o7.r
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f4434k     // Catch: java.lang.Throwable -> L24
            r3.f4434k = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b2.t():void");
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4432i, "realCall");
        return t.toString();
    }

    public final void u() {
        boolean z9;
        r rVar;
        n7.n a10 = this.f4436m.a();
        try {
            n7.c cVar = this.f4438o;
            a9.w wVar = n7.e.f4172a;
            this.f4440q.d.X.getClass();
            n7.t g10 = this.f4440q.g(this.f4437n, cVar.c(wVar, Long.valueOf(System.nanoTime() - this.f4439p)));
            synchronized (this) {
                try {
                    n7.t tVar = this.f4432i;
                    if (tVar != null) {
                        rVar = null;
                    } else {
                        if (tVar == null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        o4.b.l("realCall already set to %s", z9, tVar);
                        ScheduledFuture scheduledFuture = this.d;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f4432i = g10;
                        rVar = new r(this, this.f4429f);
                    }
                } finally {
                }
            }
            f2 f2Var = this.f4440q.d;
            if (rVar == null) {
                f2Var.f4500m.execute(new f0(this, 2));
                return;
            }
            Executor executor = this.f4438o.f4165b;
            if (executor == null) {
                executor = f2Var.f4495h;
            }
            executor.execute(new e0(20, this, rVar));
        } finally {
            this.f4436m.c(a10);
        }
    }
}
