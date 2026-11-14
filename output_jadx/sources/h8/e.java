package h8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends AtomicInteger implements x7.d, n9.b {

    /* renamed from: b, reason: collision with root package name */
    public n9.b f2654b;
    public long c;
    public final AtomicReference d = new AtomicReference();
    public final AtomicLong e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f2655f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f2656g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2657h;

    /* renamed from: i, reason: collision with root package name */
    public final b f2658i;

    /* renamed from: j, reason: collision with root package name */
    public long f2659j;

    public e(b bVar) {
        this.f2658i = bVar;
    }

    @Override // x7.d
    public final void a() {
        long j10 = this.f2659j;
        if (j10 != 0) {
            this.f2659j = 0L;
            h(j10);
        }
        b bVar = this.f2658i;
        bVar.f2634l = false;
        bVar.b();
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    public final void c() {
        int i10 = 1;
        long j10 = 0;
        n9.b bVar = null;
        do {
            n9.b bVar2 = (n9.b) this.d.get();
            if (bVar2 != null) {
                bVar2 = (n9.b) this.d.getAndSet(null);
            }
            long j11 = this.e.get();
            if (j11 != 0) {
                j11 = this.e.getAndSet(0L);
            }
            long j12 = this.f2655f.get();
            if (j12 != 0) {
                j12 = this.f2655f.getAndSet(0L);
            }
            n9.b bVar3 = this.f2654b;
            if (this.f2656g) {
                if (bVar3 != null) {
                    bVar3.cancel();
                    this.f2654b = null;
                }
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            } else {
                long j13 = this.c;
                if (j13 != Long.MAX_VALUE) {
                    j13 = e3.d.b(j13, j11);
                    if (j13 != Long.MAX_VALUE) {
                        j13 -= j12;
                        if (j13 < 0) {
                            a.a.s(new IllegalStateException(ai.onnxruntime.a.h(j13, "More produced than requested: ")));
                            j13 = 0;
                        }
                    }
                    this.c = j13;
                }
                if (bVar2 != null) {
                    if (bVar3 != null) {
                        bVar3.cancel();
                    }
                    this.f2654b = bVar2;
                    if (j13 != 0) {
                        j10 = e3.d.b(j10, j13);
                        bVar = bVar2;
                    }
                } else if (bVar3 != null && j11 != 0) {
                    j10 = e3.d.b(j10, j11);
                    bVar = bVar3;
                }
            }
            i10 = addAndGet(-i10);
        } while (i10 != 0);
        if (j10 != 0) {
            bVar.d(j10);
        }
    }

    @Override // n9.b
    public final void cancel() {
        if (!this.f2656g) {
            this.f2656g = true;
            b();
        }
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10) && !this.f2657h) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j11 = this.c;
                if (j11 != Long.MAX_VALUE) {
                    long b10 = e3.d.b(j11, j10);
                    this.c = b10;
                    if (b10 == Long.MAX_VALUE) {
                        this.f2657h = true;
                    }
                }
                n9.b bVar = this.f2654b;
                if (decrementAndGet() != 0) {
                    c();
                }
                if (bVar != null) {
                    bVar.d(j10);
                    return;
                }
                return;
            }
            e3.d.a(this.e, j10);
            b();
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        this.f2659j++;
        this.f2658i.h(obj);
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        i(bVar);
    }

    public final void h(long j10) {
        if (!this.f2657h) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j11 = this.c;
                if (j11 != Long.MAX_VALUE) {
                    long j12 = j11 - j10;
                    if (j12 < 0) {
                        a.a.s(new IllegalStateException(ai.onnxruntime.a.h(j12, "More produced than requested: ")));
                        j12 = 0;
                    }
                    this.c = j12;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
                c();
                return;
            }
            e3.d.a(this.f2655f, j10);
            b();
        }
    }

    public final void i(n9.b bVar) {
        if (this.f2656g) {
            bVar.cancel();
            return;
        }
        d8.b.a(bVar, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            n9.b bVar2 = this.f2654b;
            if (bVar2 != null) {
                bVar2.cancel();
            }
            this.f2654b = bVar;
            long j10 = this.c;
            if (decrementAndGet() != 0) {
                c();
            }
            if (j10 != 0) {
                bVar.d(j10);
                return;
            }
            return;
        }
        n9.b bVar3 = (n9.b) this.d.getAndSet(bVar);
        if (bVar3 != null) {
            bVar3.cancel();
        }
        b();
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        long j10 = this.f2659j;
        if (j10 != 0) {
            this.f2659j = 0L;
            h(j10);
        }
        this.f2658i.c(th);
    }
}
