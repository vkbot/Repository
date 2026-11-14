package h8;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k0 extends o8.a implements x7.d {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2682b;
    public final e8.f c;
    public final b8.a d;
    public n9.b e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2683f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f2684g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f2685h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f2686i = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public boolean f2687j;

    public k0(x7.d dVar, int i10, boolean z9, w7.c cVar) {
        e8.f aVar;
        this.f2682b = dVar;
        this.d = cVar;
        if (z9) {
            aVar = new l8.b(i10);
        } else {
            aVar = new l8.a(i10);
        }
        this.c = aVar;
    }

    @Override // x7.d
    public final void a() {
        this.f2684g = true;
        if (this.f2687j) {
            this.f2682b.a();
        } else {
            j();
        }
    }

    @Override // n9.b
    public final void cancel() {
        if (!this.f2683f) {
            this.f2683f = true;
            this.e.cancel();
            if (getAndIncrement() == 0) {
                this.c.clear();
            }
        }
    }

    @Override // e8.g
    public final void clear() {
        this.c.clear();
    }

    @Override // n9.b
    public final void d(long j10) {
        if (!this.f2687j && o8.f.c(j10)) {
            e3.d.a(this.f2686i, j10);
            j();
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (!this.c.offer(obj)) {
            this.e.cancel();
            RuntimeException runtimeException = new RuntimeException("Buffer is full");
            try {
                this.d.run();
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                runtimeException.initCause(th);
            }
            onError(runtimeException);
            return;
        }
        if (this.f2687j) {
            this.f2682b.e(null);
        } else {
            j();
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.e, bVar)) {
            this.e = bVar;
            this.f2682b.f(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // e8.c
    public final int h(int i10) {
        this.f2687j = true;
        return 2;
    }

    public final boolean i(boolean z9, boolean z10, x7.d dVar) {
        if (this.f2683f) {
            this.c.clear();
            return true;
        }
        if (z9) {
            Throwable th = this.f2685h;
            if (th != null) {
                this.c.clear();
                dVar.onError(th);
                return true;
            }
            if (z10) {
                dVar.a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final void j() {
        boolean z9;
        if (getAndIncrement() == 0) {
            e8.f fVar = this.c;
            x7.d dVar = this.f2682b;
            int i10 = 1;
            while (!i(this.f2684g, fVar.isEmpty(), dVar)) {
                long j10 = this.f2686i.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f2684g;
                    Object poll = fVar.poll();
                    if (poll == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!i(z10, z9, dVar)) {
                        if (z9) {
                            break;
                        }
                        dVar.e(poll);
                        j11++;
                    } else {
                        return;
                    }
                }
                if (j11 != j10 || !i(this.f2684g, fVar.isEmpty(), dVar)) {
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f2686i.addAndGet(-j11);
                    }
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        this.f2685h = th;
        this.f2684g = true;
        if (this.f2687j) {
            this.f2682b.onError(th);
        } else {
            j();
        }
    }

    @Override // e8.g
    public final Object poll() {
        return this.c.poll();
    }
}
