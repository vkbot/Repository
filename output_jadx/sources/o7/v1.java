package o7;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v1 implements u {
    public static final n7.q0 F;
    public static final n7.q0 G;
    public static final n7.f1 H;
    public static final Random I;
    public boolean A;
    public final /* synthetic */ n7.x0 B;
    public final /* synthetic */ n7.c C;
    public final /* synthetic */ n7.n D;
    public final /* synthetic */ c0.h E;

    /* renamed from: b, reason: collision with root package name */
    public final n7.x0 f4735b;
    public final Executor c;
    public final n7.k1 d;
    public final ScheduledExecutorService e;

    /* renamed from: f, reason: collision with root package name */
    public final n7.v0 f4736f;

    /* renamed from: g, reason: collision with root package name */
    public final e4 f4737g;

    /* renamed from: h, reason: collision with root package name */
    public final a1 f4738h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4739i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4740j;

    /* renamed from: k, reason: collision with root package name */
    public final f f4741k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4742l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4743m;

    /* renamed from: n, reason: collision with root package name */
    public final d4 f4744n;

    /* renamed from: o, reason: collision with root package name */
    public final i7.i f4745o;

    /* renamed from: p, reason: collision with root package name */
    public volatile z3 f4746p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f4747q;
    public final AtomicInteger r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicInteger f4748s;
    public a5.h t;

    /* renamed from: u, reason: collision with root package name */
    public long f4749u;

    /* renamed from: v, reason: collision with root package name */
    public w f4750v;
    public com.bumptech.glide.manager.t w;

    /* renamed from: x, reason: collision with root package name */
    public com.bumptech.glide.manager.t f4751x;

    /* renamed from: y, reason: collision with root package name */
    public long f4752y;

    /* renamed from: z, reason: collision with root package name */
    public n7.f1 f4753z;

    static {
        n7.h hVar = n7.v0.d;
        BitSet bitSet = n7.s0.d;
        F = new n7.q0("grpc-previous-rpc-attempts", hVar);
        G = new n7.q0("grpc-retry-pushback-ms", hVar);
        H = n7.f1.f4194f.h("Stream thrown away because RetriableStream committed");
        I = new Random();
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public v1(c0.h hVar, n7.x0 x0Var, n7.v0 v0Var, n7.c cVar, e4 e4Var, a1 a1Var, n7.n nVar) {
        boolean z9;
        this.E = hVar;
        this.B = x0Var;
        this.C = cVar;
        this.D = nVar;
        f2 f2Var = (f2) hVar.f435b;
        f fVar = f2Var.T;
        long j10 = f2Var.U;
        long j11 = f2Var.V;
        Executor executor = cVar.f4165b;
        executor = executor == null ? f2Var.f4495h : executor;
        ScheduledExecutorService scheduledExecutorService = f2Var.f4493f.f4597b.e;
        d4 d4Var = (d4) hVar.c;
        this.d = new n7.k1(new Object());
        this.f4740j = new Object();
        this.f4745o = new i7.i(1);
        this.f4746p = new z3(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.f4747q = new AtomicBoolean();
        this.r = new AtomicInteger();
        this.f4748s = new AtomicInteger();
        this.f4735b = x0Var;
        this.f4741k = fVar;
        this.f4742l = j10;
        this.f4743m = j11;
        this.c = executor;
        this.e = scheduledExecutorService;
        this.f4736f = v0Var;
        this.f4737g = e4Var;
        if (e4Var != null) {
            this.f4752y = e4Var.f4477b;
        }
        this.f4738h = a1Var;
        if (e4Var != null && a1Var != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        o4.b.d("Should not provide both retryPolicy and hedgingPolicy", z9);
        this.f4739i = a1Var != null;
        this.f4744n = d4Var;
    }

    public static void b(v1 v1Var, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            v1Var.q();
            return;
        }
        synchronized (v1Var.f4740j) {
            try {
                com.bumptech.glide.manager.t tVar = v1Var.f4751x;
                if (tVar == null) {
                    return;
                }
                tVar.c = true;
                Future future = (Future) tVar.e;
                com.bumptech.glide.manager.t tVar2 = new com.bumptech.glide.manager.t(v1Var.f4740j);
                v1Var.f4751x = tVar2;
                if (future != null) {
                    future.cancel(false);
                }
                tVar2.i(v1Var.e.schedule(new e0(22, v1Var, tVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.u4
    public final void a(n7.h hVar) {
        l(new q3(0, hVar));
    }

    @Override // o7.u
    public final void c(int i10) {
        l(new s3(i10, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r7 != false) goto L35;
     */
    @Override // o7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(o7.w r7) {
        /*
            r6 = this;
            r6.f4750v = r7
            c0.h r7 = r6.E
            java.lang.Object r7 = r7.f435b
            o7.f2 r7 = (o7.f2) r7
            b1.m r7 = r7.F
            java.lang.Object r0 = r7.c
            monitor-enter(r0)
            java.lang.Object r1 = r7.e     // Catch: java.lang.Throwable -> L16
            n7.f1 r1 = (n7.f1) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r7 = move-exception
            goto L97
        L19:
            java.lang.Object r7 = r7.d     // Catch: java.lang.Throwable -> L16
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch: java.lang.Throwable -> L16
            r7.add(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r1 = r2
        L22:
            if (r1 == 0) goto L28
            r6.h(r1)
            return
        L28:
            java.lang.Object r7 = r6.f4740j
            monitor-enter(r7)
            o7.z3 r0 = r6.f4746p     // Catch: java.lang.Throwable -> L94
            java.util.List r0 = r0.f4799b     // Catch: java.lang.Throwable -> L94
            o7.y3 r1 = new o7.y3     // Catch: java.lang.Throwable -> L94
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L94
            r0.add(r1)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            r7 = 0
            o7.c4 r0 = r6.k(r7, r7)
            if (r0 != 0) goto L40
            return
        L40:
            boolean r1 = r6.f4739i
            if (r1 == 0) goto L90
            java.lang.Object r1 = r6.f4740j
            monitor-enter(r1)
            o7.z3 r3 = r6.f4746p     // Catch: java.lang.Throwable -> L72
            o7.z3 r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L72
            r6.f4746p = r3     // Catch: java.lang.Throwable -> L72
            o7.z3 r3 = r6.f4746p     // Catch: java.lang.Throwable -> L72
            boolean r3 = r6.r(r3)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L74
            o7.d4 r3 = r6.f4744n     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L68
            java.util.concurrent.atomic.AtomicInteger r4 = r3.d     // Catch: java.lang.Throwable -> L72
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L72
            int r3 = r3.f4461b     // Catch: java.lang.Throwable -> L72
            if (r4 <= r3) goto L66
            r7 = 1
        L66:
            if (r7 == 0) goto L74
        L68:
            com.bumptech.glide.manager.t r2 = new com.bumptech.glide.manager.t     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = r6.f4740j     // Catch: java.lang.Throwable -> L72
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r6.f4751x = r2     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r7 = move-exception
            goto L8e
        L74:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L90
            java.util.concurrent.ScheduledExecutorService r7 = r6.e
            o7.e0 r1 = new o7.e0
            r3 = 22
            r1.<init>(r3, r6, r2)
            o7.a1 r3 = r6.f4738h
            long r3 = r3.f4390b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r1, r3, r5)
            r2.i(r7)
            goto L90
        L8e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r7
        L90:
            r6.p(r0)
            return
        L94:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L94
            throw r0
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.v1.d(o7.w):void");
    }

    @Override // o7.u
    public final void e(i7.i iVar) {
        z3 z3Var;
        synchronized (this.f4740j) {
            iVar.b(this.f4745o, "closed");
            z3Var = this.f4746p;
        }
        if (z3Var.f4800f != null) {
            i7.i iVar2 = new i7.i(1);
            z3Var.f4800f.f4448a.e(iVar2);
            iVar.b(iVar2, "committed");
            return;
        }
        i7.i iVar3 = new i7.i(1);
        for (c4 c4Var : z3Var.c) {
            i7.i iVar4 = new i7.i(1);
            c4Var.f4448a.e(iVar4);
            iVar3.f2803b.add(String.valueOf(iVar4));
        }
        iVar.b(iVar3, "open");
    }

    @Override // o7.u4
    public final void f(t7.a aVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // o7.u4
    public final void flush() {
        z3 z3Var = this.f4746p;
        if (z3Var.f4798a) {
            z3Var.f4800f.f4448a.flush();
        } else {
            l(new r3(0));
        }
    }

    @Override // o7.u
    public final void g(n7.q qVar) {
        l(new q3(2, qVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [n7.v0, java.lang.Object] */
    @Override // o7.u
    public final void h(n7.f1 f1Var) {
        c4 c4Var;
        c4 c4Var2 = new c4(0);
        c4Var2.f4448a = new u2(0);
        p3 j10 = j(c4Var2);
        Object obj = this.f4740j;
        if (j10 != null) {
            synchronized (obj) {
                this.f4746p = this.f4746p.e(c4Var2);
            }
            j10.run();
            s(f1Var, v.f4733b, new Object());
            return;
        }
        synchronized (obj) {
            try {
                if (this.f4746p.c.contains(this.f4746p.f4800f)) {
                    c4Var = this.f4746p.f4800f;
                } else {
                    this.f4753z = f1Var;
                    c4Var = null;
                }
                z3 z3Var = this.f4746p;
                this.f4746p = new z3(z3Var.f4799b, z3Var.c, z3Var.d, z3Var.f4800f, true, z3Var.f4798a, z3Var.f4802h, z3Var.e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4Var != null) {
            c4Var.f4448a.h(f1Var);
        }
    }

    @Override // o7.u
    public final void i() {
        l(new r3(1));
    }

    @Override // o7.u4
    public final boolean isReady() {
        Iterator it = this.f4746p.c.iterator();
        while (it.hasNext()) {
            if (((c4) it.next()).f4448a.isReady()) {
                return true;
            }
        }
        return false;
    }

    public final p3 j(c4 c4Var) {
        boolean z9;
        List list;
        boolean z10;
        Collection collection;
        Future future;
        Future future2;
        synchronized (this.f4740j) {
            try {
                if (this.f4746p.f4800f != null) {
                    return null;
                }
                Collection collection2 = this.f4746p.c;
                z3 z3Var = this.f4746p;
                if (z3Var.f4800f == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o4.b.m(z9, "Already committed");
                List list2 = z3Var.f4799b;
                if (z3Var.c.contains(c4Var)) {
                    list = null;
                    collection = Collections.singleton(c4Var);
                    z10 = true;
                } else {
                    list = list2;
                    z10 = false;
                    collection = Collections.EMPTY_LIST;
                }
                this.f4746p = new z3(list, collection, z3Var.d, c4Var, z3Var.f4801g, z10, z3Var.f4802h, z3Var.e);
                this.f4741k.f4479a.addAndGet(-this.f4749u);
                com.bumptech.glide.manager.t tVar = this.w;
                if (tVar != null) {
                    tVar.c = true;
                    Future future3 = (Future) tVar.e;
                    this.w = null;
                    future = future3;
                } else {
                    future = null;
                }
                com.bumptech.glide.manager.t tVar2 = this.f4751x;
                if (tVar2 != null) {
                    tVar2.c = true;
                    Future future4 = (Future) tVar2.e;
                    this.f4751x = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new p3(this, collection2, c4Var, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [n7.v0, java.lang.Object] */
    public final c4 k(int i10, boolean z9) {
        AtomicInteger atomicInteger;
        int i11;
        do {
            atomicInteger = this.f4748s;
            i11 = atomicInteger.get();
            if (i11 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i11, i11 + 1));
        c4 c4Var = new c4(i10);
        u3 u3Var = new u3(new w3(this, c4Var));
        ?? obj = new Object();
        obj.d(this.f4736f);
        if (i10 > 0) {
            obj.e(F, String.valueOf(i10));
        }
        n7.c cVar = this.C;
        cVar.getClass();
        List list = cVar.d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(u3Var);
        c2.k b10 = n7.c.b(cVar);
        b10.f491g = Collections.unmodifiableList(arrayList);
        n7.c cVar2 = new n7.c(b10);
        n7.e[] c = y0.c(cVar2, obj, i10, z9);
        n7.x0 x0Var = this.B;
        x b11 = this.E.b(new g3(x0Var, obj, cVar2));
        n7.n nVar = this.D;
        n7.n a10 = nVar.a();
        try {
            u d = b11.d(x0Var, obj, cVar2, c);
            nVar.c(a10);
            c4Var.f4448a = d;
            return c4Var;
        } catch (Throwable th) {
            nVar.c(a10);
            throw th;
        }
    }

    public final void l(v3 v3Var) {
        Collection collection;
        synchronized (this.f4740j) {
            try {
                if (!this.f4746p.f4798a) {
                    this.f4746p.f4799b.add(v3Var);
                }
                collection = this.f4746p.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            v3Var.a((c4) it.next());
        }
    }

    @Override // o7.u
    public final void m(int i10) {
        l(new s3(i10, 0));
    }

    @Override // o7.u
    public final void n(n7.o oVar) {
        l(new q3(1, oVar));
    }

    @Override // o7.u4
    public final void o() {
        l(new r3(2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r9.d.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r10.f4448a.d(new o7.w4(5, r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r0 = r10.f4448a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r9.f4746p.f4800f != r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r10 = r9.f4753z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r0.h(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r10 = o7.v1.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r5 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r6 = r3.get(r5);
        r5 = r5 + 1;
        r6 = (o7.v3) r6;
        r6.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if ((r6 instanceof o7.y3) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r6 = r9.f4746p;
        r8 = r6.f4800f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r8 == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r6.f4801g == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(o7.c4 r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.f4740j
            monitor-enter(r5)
            o7.z3 r6 = r9.f4746p     // Catch: java.lang.Throwable -> L12
            o7.c4 r7 = r6.f4800f     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L12:
            r10 = move-exception
            goto Lb3
        L15:
            boolean r7 = r6.f4801g     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L1b:
            java.util.List r7 = r6.f4799b     // Catch: java.lang.Throwable -> L12
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r7) goto L5f
            o7.z3 r0 = r6.e(r10)     // Catch: java.lang.Throwable -> L12
            r9.f4746p = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.isReady()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            com.bumptech.glide.m r1 = new com.bumptech.glide.m     // Catch: java.lang.Throwable -> L12
            r0 = 20
            r1.<init>(r0, r9)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L39:
            if (r1 == 0) goto L41
            n7.k1 r10 = r9.d
            r10.execute(r1)
            return
        L41:
            if (r4 != 0) goto L4e
            o7.u r0 = r10.f4448a
            o7.w4 r1 = new o7.w4
            r2 = 5
            r1.<init>(r2, r9, r10)
            r0.d(r1)
        L4e:
            o7.u r0 = r10.f4448a
            o7.z3 r1 = r9.f4746p
            o7.c4 r1 = r1.f4800f
            if (r1 != r10) goto L59
            n7.f1 r10 = r9.f4753z
            goto L5b
        L59:
            n7.f1 r10 = o7.v1.H
        L5b:
            r0.h(r10)
            return
        L5f:
            boolean r7 = r10.f4449b     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L65
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L65:
            int r7 = r2 + 128
            java.util.List r8 = r6.f4799b     // Catch: java.lang.Throwable -> L12
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L12
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L7f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f4799b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L8b
        L7f:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f4799b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L8b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L91:
            if (r5 >= r2) goto Lb0
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            o7.v3 r6 = (o7.v3) r6
            r6.a(r10)
            boolean r6 = r6 instanceof o7.y3
            if (r6 == 0) goto La3
            r4 = 1
        La3:
            o7.z3 r6 = r9.f4746p
            o7.c4 r8 = r6.f4800f
            if (r8 == 0) goto Lac
            if (r8 == r10) goto Lac
            goto Lb0
        Lac:
            boolean r6 = r6.f4801g
            if (r6 == 0) goto L91
        Lb0:
            r2 = r7
            goto L5
        Lb3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.v1.p(o7.c4):void");
    }

    public final void q() {
        Future future;
        synchronized (this.f4740j) {
            try {
                com.bumptech.glide.manager.t tVar = this.f4751x;
                future = null;
                if (tVar != null) {
                    tVar.c = true;
                    Future future2 = (Future) tVar.e;
                    this.f4751x = null;
                    future = future2;
                }
                z3 z3Var = this.f4746p;
                if (!z3Var.f4802h) {
                    z3Var = new z3(z3Var.f4799b, z3Var.c, z3Var.d, z3Var.f4800f, z3Var.f4801g, z3Var.f4798a, true, z3Var.e);
                }
                this.f4746p = z3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean r(z3 z3Var) {
        if (z3Var.f4800f == null && z3Var.e < this.f4738h.f4389a && !z3Var.f4802h) {
            return true;
        }
        return false;
    }

    @Override // o7.u4
    public final void request() {
        z3 z3Var = this.f4746p;
        if (z3Var.f4798a) {
            z3Var.f4800f.f4448a.request();
        } else {
            l(new r3(3));
        }
    }

    public final void s(n7.f1 f1Var, v vVar, n7.v0 v0Var) {
        this.t = new a5.h(f1Var, vVar, v0Var, 20);
        if (this.f4748s.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.d.execute(new m0.r0(3, this, f1Var, vVar, v0Var));
        }
    }

    public final void t(y5.g gVar) {
        z3 z3Var = this.f4746p;
        if (z3Var.f4798a) {
            u uVar = z3Var.f4800f.f4448a;
            t7.b bVar = this.f4735b.d;
            bVar.getClass();
            uVar.f(new t7.a(gVar, bVar.f5828a));
            return;
        }
        l(new t3(this, gVar));
    }
}
