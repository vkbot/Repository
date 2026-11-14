package o7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k0 implements u {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f4567b;
    public w c;
    public u d;
    public n7.f1 e;

    /* renamed from: g, reason: collision with root package name */
    public o0 f4569g;

    /* renamed from: h, reason: collision with root package name */
    public long f4570h;

    /* renamed from: i, reason: collision with root package name */
    public long f4571i;

    /* renamed from: k, reason: collision with root package name */
    public final g3 f4573k;

    /* renamed from: m, reason: collision with root package name */
    public final n7.e[] f4575m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0 f4576n;

    /* renamed from: f, reason: collision with root package name */
    public List f4568f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f4572j = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final n7.n f4574l = n7.n.b();

    public k0(l0 l0Var, g3 g3Var, n7.e[] eVarArr) {
        this.f4576n = l0Var;
        this.f4573k = g3Var;
        this.f4575m = eVarArr;
    }

    @Override // o7.u4
    public final void a(n7.h hVar) {
        boolean z9;
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called before start");
        this.f4572j.add(new e0(6, this, hVar));
    }

    public final void b(Runnable runnable) {
        boolean z9;
        if (this.c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called after start");
        synchronized (this) {
            try {
                if (!this.f4567b) {
                    this.f4568f.add(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.u
    public final void c(int i10) {
        boolean z9;
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called before start");
        this.f4572j.add(new n0(this, i10, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n7.v0, java.lang.Object] */
    @Override // o7.u
    public final void d(w wVar) {
        boolean z9;
        n7.f1 f1Var;
        boolean z10;
        w wVar2;
        o4.b.i(wVar, "listener");
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "already started");
        synchronized (this) {
            try {
                f1Var = this.e;
                z10 = this.f4567b;
                wVar2 = wVar;
                if (!z10) {
                    o0 o0Var = new o0(wVar);
                    this.f4569g = o0Var;
                    wVar2 = o0Var;
                }
                this.c = wVar2;
                this.f4570h = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f1Var != null) {
            wVar2.b(f1Var, v.f4733b, new Object());
        } else if (z10) {
            k(wVar2);
        }
    }

    @Override // o7.u
    public final void e(i7.i iVar) {
        if (Boolean.TRUE.equals(this.f4573k.f4535a.e)) {
            iVar.f2803b.add("wait_for_ready");
        }
        synchronized (this) {
            try {
                if (this.c != null) {
                    if (this.d != null) {
                        iVar.b(Long.valueOf(this.f4571i - this.f4570h), "buffered_nanos");
                        this.d.e(iVar);
                    } else {
                        iVar.b(Long.valueOf(System.nanoTime() - this.f4570h), "buffered_nanos");
                        iVar.f2803b.add("waiting_for_connection");
                    }
                }
            } finally {
            }
        }
    }

    @Override // o7.u4
    public final void f(t7.a aVar) {
        boolean z9;
        if (this.c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called after start");
        if (this.f4567b) {
            this.d.f(aVar);
        } else {
            b(new e0(9, this, aVar));
        }
    }

    @Override // o7.u4
    public final void flush() {
        boolean z9;
        if (this.c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called after start");
        if (this.f4567b) {
            this.d.flush();
        } else {
            b(new m0(this, 3));
        }
    }

    @Override // o7.u
    public final void g(n7.q qVar) {
        boolean z9;
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called before start");
        o4.b.i(qVar, "decompressorRegistry");
        this.f4572j.add(new e0(7, this, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [n7.v0, java.lang.Object] */
    @Override // o7.u
    public final void h(n7.f1 f1Var) {
        boolean z9;
        boolean z10 = false;
        boolean z11 = true;
        if (this.c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called after start");
        o4.b.i(f1Var, "reason");
        synchronized (this) {
            try {
                u uVar = this.d;
                if (uVar == null) {
                    u2 u2Var = u2.c;
                    if (uVar != null) {
                        z11 = false;
                    }
                    o4.b.l("realStream already set to %s", z11, uVar);
                    this.d = u2Var;
                    this.f4571i = System.nanoTime();
                    this.e = f1Var;
                } else {
                    z10 = true;
                }
            } finally {
            }
        }
        if (z10) {
            b(new e0(10, this, f1Var));
        } else {
            j();
            for (n7.e eVar : this.f4575m) {
                eVar.B(f1Var);
            }
            this.c.b(f1Var, v.f4733b, new Object());
        }
        synchronized (this.f4576n.f4599b) {
            try {
                l0 l0Var = this.f4576n;
                if (l0Var.f4601g != null) {
                    boolean remove = l0Var.f4603i.remove(this);
                    if (!this.f4576n.f() && remove) {
                        l0 l0Var2 = this.f4576n;
                        l0Var2.d.b(l0Var2.f4600f);
                        l0 l0Var3 = this.f4576n;
                        if (l0Var3.f4604j != null) {
                            l0Var3.d.b(l0Var3.f4601g);
                            this.f4576n.f4601g = null;
                        }
                    }
                }
            } finally {
            }
        }
        this.f4576n.d.a();
    }

    @Override // o7.u
    public final void i() {
        boolean z9;
        if (this.c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called after start");
        b(new m0(this, 4));
    }

    @Override // o7.u4
    public final boolean isReady() {
        if (this.f4567b) {
            return this.d.isReady();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.f4568f     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.f4568f = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f4567b = r1     // Catch: java.lang.Throwable -> L50
            o7.o0 r2 = r6.f4569g     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.d     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.d = r0     // Catch: java.lang.Throwable -> L2d
            r2.c = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List r4 = r2.d     // Catch: java.lang.Throwable -> L2d
            r2.d = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r6.f4568f     // Catch: java.lang.Throwable -> L50
            r6.f4568f = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.k0.j():void");
    }

    public final void k(w wVar) {
        ArrayList arrayList = this.f4572j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        this.f4572j = null;
        this.d.d(wVar);
    }

    @Override // o7.u
    public final void m(int i10) {
        boolean z9;
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called before start");
        this.f4572j.add(new n0(this, i10, 0));
    }

    @Override // o7.u
    public final void n(n7.o oVar) {
        boolean z9;
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called before start");
        this.f4572j.add(new e0(8, this, oVar));
    }

    @Override // o7.u4
    public final void o() {
        boolean z9;
        if (this.c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called before start");
        this.f4572j.add(new m0(this, 1));
    }

    @Override // o7.u4
    public final void request() {
        boolean z9;
        if (this.c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "May only be called after start");
        if (this.f4567b) {
            this.d.request();
        } else {
            b(new m0(this, 0));
        }
    }
}
