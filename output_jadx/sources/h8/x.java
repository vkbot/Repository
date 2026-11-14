package h8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x extends AtomicReference implements x7.d, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f2715b;
    public final y c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2716f;

    /* renamed from: g, reason: collision with root package name */
    public volatile e8.g f2717g;

    /* renamed from: h, reason: collision with root package name */
    public long f2718h;

    /* renamed from: i, reason: collision with root package name */
    public int f2719i;

    public x(y yVar, long j10) {
        this.f2715b = j10;
        this.c = yVar;
        int i10 = yVar.e;
        this.e = i10;
        this.d = i10 >> 2;
    }

    @Override // x7.d
    public final void a() {
        this.f2716f = true;
        this.c.c();
    }

    public final void b(long j10) {
        if (this.f2719i != 1) {
            long j11 = this.f2718h + j10;
            if (j11 >= this.d) {
                this.f2718h = 0L;
                ((n9.b) get()).d(j11);
            } else {
                this.f2718h = j11;
            }
        }
    }

    @Override // z7.a
    public final void dispose() {
        o8.f.a(this);
    }

    @Override // x7.d
    public final void e(Object obj) {
        int i10 = this.f2719i;
        y yVar = this.c;
        if (i10 != 2) {
            if (yVar.get() == 0 && yVar.compareAndSet(0, 1)) {
                long j10 = yVar.f2727k.get();
                e8.g gVar = this.f2717g;
                if (j10 != 0 && (gVar == null || gVar.isEmpty())) {
                    yVar.f2721b.e(obj);
                    if (j10 != Long.MAX_VALUE) {
                        yVar.f2727k.decrementAndGet();
                    }
                    b(1L);
                } else {
                    if (gVar == null && (gVar = this.f2717g) == null) {
                        gVar = new l8.a(yVar.e);
                        this.f2717g = gVar;
                    }
                    if (!gVar.offer(obj)) {
                        yVar.onError(new RuntimeException("Inner queue full?!"));
                        return;
                    }
                }
                if (yVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                e8.g gVar2 = this.f2717g;
                if (gVar2 == null) {
                    gVar2 = new l8.a(yVar.e);
                    this.f2717g = gVar2;
                }
                if (!gVar2.offer(obj)) {
                    yVar.onError(new RuntimeException("Inner queue full?!"));
                    return;
                } else if (yVar.getAndIncrement() != 0) {
                    return;
                }
            }
            yVar.h();
            return;
        }
        yVar.c();
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.b(this, bVar)) {
            if (bVar instanceof e8.d) {
                e8.d dVar = (e8.d) bVar;
                int h2 = dVar.h(7);
                if (h2 == 1) {
                    this.f2719i = h2;
                    this.f2717g = dVar;
                    this.f2716f = true;
                    this.c.c();
                    return;
                }
                if (h2 == 2) {
                    this.f2719i = h2;
                    this.f2717g = dVar;
                }
            }
            bVar.d(this.e);
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        lazySet(o8.f.f4806b);
        y yVar = this.c;
        p8.b bVar = yVar.f2724h;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            this.f2716f = true;
            yVar.f2728l.cancel();
            for (x xVar : (x[]) yVar.f2726j.getAndSet(y.f2720s)) {
                xVar.getClass();
                o8.f.a(xVar);
            }
            yVar.c();
            return;
        }
        a.a.s(th);
    }
}
