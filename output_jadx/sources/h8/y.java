package h8;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y extends AtomicInteger implements x7.d, n9.b {
    public static final x[] r = new x[0];

    /* renamed from: s, reason: collision with root package name */
    public static final x[] f2720s = new x[0];

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2721b;
    public final b8.c c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public volatile e8.f f2722f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f2723g;

    /* renamed from: h, reason: collision with root package name */
    public final p8.b f2724h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f2725i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f2726j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f2727k;

    /* renamed from: l, reason: collision with root package name */
    public n9.b f2728l;

    /* renamed from: m, reason: collision with root package name */
    public long f2729m;

    /* renamed from: n, reason: collision with root package name */
    public long f2730n;

    /* renamed from: o, reason: collision with root package name */
    public int f2731o;

    /* renamed from: p, reason: collision with root package name */
    public int f2732p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2733q;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, p8.b] */
    public y(x7.d dVar, c5.e eVar, int i10, int i11) {
        AtomicReference atomicReference = new AtomicReference();
        this.f2726j = atomicReference;
        this.f2727k = new AtomicLong();
        this.f2721b = dVar;
        this.c = eVar;
        this.d = i10;
        this.e = i11;
        this.f2733q = Math.max(1, i10 >> 1);
        atomicReference.lazySet(r);
    }

    @Override // x7.d
    public final void a() {
        if (this.f2723g) {
            return;
        }
        this.f2723g = true;
        c();
    }

    public final boolean b() {
        if (this.f2725i) {
            e8.f fVar = this.f2722f;
            if (fVar != null) {
                fVar.clear();
                return true;
            }
        } else if (this.f2724h.get() != null) {
            e8.f fVar2 = this.f2722f;
            if (fVar2 != null) {
                fVar2.clear();
            }
            p8.b bVar = this.f2724h;
            bVar.getClass();
            Throwable b10 = p8.d.b(bVar);
            if (b10 != p8.d.f5114a) {
                this.f2721b.onError(b10);
            }
        } else {
            return false;
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // n9.b
    public final void cancel() {
        e8.f fVar;
        x[] xVarArr;
        if (!this.f2725i) {
            this.f2725i = true;
            this.f2728l.cancel();
            AtomicReference atomicReference = this.f2726j;
            x[] xVarArr2 = (x[]) atomicReference.get();
            x[] xVarArr3 = f2720s;
            if (xVarArr2 != xVarArr3 && (xVarArr = (x[]) atomicReference.getAndSet(xVarArr3)) != xVarArr3) {
                for (x xVar : xVarArr) {
                    xVar.getClass();
                    o8.f.a(xVar);
                }
                p8.b bVar = this.f2724h;
                bVar.getClass();
                Throwable b10 = p8.d.b(bVar);
                if (b10 != null && b10 != p8.d.f5114a) {
                    a.a.s(b10);
                }
            }
            if (getAndIncrement() == 0 && (fVar = this.f2722f) != null) {
                fVar.clear();
            }
        }
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10)) {
            e3.d.a(this.f2727k, j10);
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.d
    public final void e(Object obj) {
        if (!this.f2723g) {
            try {
                Object apply = this.c.apply(obj);
                d8.b.a(apply, "The mapper returned a null Publisher");
                n9.a aVar = (n9.a) apply;
                if (aVar instanceof Callable) {
                    try {
                        Object call = ((Callable) aVar).call();
                        if (call != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                long j10 = this.f2727k.get();
                                e8.f fVar = this.f2722f;
                                if (j10 != 0 && (fVar == null || fVar.isEmpty())) {
                                    this.f2721b.e(call);
                                    if (j10 != Long.MAX_VALUE) {
                                        this.f2727k.decrementAndGet();
                                    }
                                    if (this.d != Integer.MAX_VALUE && !this.f2725i) {
                                        int i10 = this.f2732p + 1;
                                        this.f2732p = i10;
                                        int i11 = this.f2733q;
                                        if (i10 == i11) {
                                            this.f2732p = 0;
                                            this.f2728l.d(i11);
                                        }
                                    }
                                } else {
                                    if (fVar == null) {
                                        fVar = i();
                                    }
                                    if (!fVar.offer(call)) {
                                        onError(new IllegalStateException("Scalar queue full?!"));
                                        return;
                                    }
                                }
                                if (decrementAndGet() == 0) {
                                    return;
                                }
                            } else if (!i().offer(call)) {
                                onError(new IllegalStateException("Scalar queue full?!"));
                                return;
                            } else if (getAndIncrement() != 0) {
                                return;
                            }
                            h();
                            return;
                        }
                        if (this.d != Integer.MAX_VALUE && !this.f2725i) {
                            int i12 = this.f2732p + 1;
                            this.f2732p = i12;
                            int i13 = this.f2733q;
                            if (i12 == i13) {
                                this.f2732p = 0;
                                this.f2728l.d(i13);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        com.bumptech.glide.d.v(th);
                        p8.b bVar = this.f2724h;
                        bVar.getClass();
                        p8.d.a(bVar, th);
                        c();
                        return;
                    }
                }
                long j11 = this.f2729m;
                this.f2729m = 1 + j11;
                x xVar = new x(this, j11);
                AtomicReference atomicReference = this.f2726j;
                while (true) {
                    x[] xVarArr = (x[]) atomicReference.get();
                    if (xVarArr == f2720s) {
                        o8.f.a(xVar);
                        return;
                    }
                    int length = xVarArr.length;
                    x[] xVarArr2 = new x[length + 1];
                    System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                    xVarArr2[length] = xVar;
                    while (!atomicReference.compareAndSet(xVarArr, xVarArr2)) {
                        if (atomicReference.get() != xVarArr) {
                            break;
                        }
                    }
                    aVar.a(xVar);
                    return;
                }
            } catch (Throwable th2) {
                com.bumptech.glide.d.v(th2);
                this.f2728l.cancel();
                onError(th2);
            }
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.f2728l, bVar)) {
            this.f2728l = bVar;
            this.f2721b.f(this);
            if (!this.f2725i) {
                int i10 = this.d;
                if (i10 == Integer.MAX_VALUE) {
                    bVar.d(Long.MAX_VALUE);
                } else {
                    bVar.d(i10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r7[r0].f2715b != r10) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.y.h():void");
    }

    public final e8.f i() {
        e8.f fVar = this.f2722f;
        if (fVar == null) {
            if (this.d == Integer.MAX_VALUE) {
                fVar = new l8.b(this.e);
            } else {
                fVar = new l8.a(this.d);
            }
            this.f2722f = fVar;
        }
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(x xVar) {
        x[] xVarArr;
        while (true) {
            AtomicReference atomicReference = this.f2726j;
            x[] xVarArr2 = (x[]) atomicReference.get();
            int length = xVarArr2.length;
            if (length != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (xVarArr2[i10] == xVar) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    if (length == 1) {
                        xVarArr = r;
                    } else {
                        x[] xVarArr3 = new x[length - 1];
                        System.arraycopy(xVarArr2, 0, xVarArr3, 0, i10);
                        System.arraycopy(xVarArr2, i10 + 1, xVarArr3, i10, (length - i10) - 1);
                        xVarArr = xVarArr3;
                    }
                    while (!atomicReference.compareAndSet(xVarArr2, xVarArr)) {
                        if (atomicReference.get() != xVarArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        if (this.f2723g) {
            a.a.s(th);
            return;
        }
        p8.b bVar = this.f2724h;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            this.f2723g = true;
            c();
        } else {
            a.a.s(th);
        }
    }
}
