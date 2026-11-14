package h8;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class h0 extends o8.a implements x7.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final x7.j f2667b;
    public final int c;
    public final int d;
    public final AtomicLong e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public n9.b f2668f;

    /* renamed from: g, reason: collision with root package name */
    public e8.g f2669g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f2670h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f2671i;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f2672j;

    /* renamed from: k, reason: collision with root package name */
    public int f2673k;

    /* renamed from: l, reason: collision with root package name */
    public long f2674l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2675m;

    public h0(x7.j jVar, int i10) {
        this.f2667b = jVar;
        this.c = i10;
        this.d = i10 - (i10 >> 2);
    }

    @Override // x7.d
    public final void a() {
        if (!this.f2671i) {
            this.f2671i = true;
            m();
        }
    }

    @Override // n9.b
    public final void cancel() {
        if (!this.f2670h) {
            this.f2670h = true;
            this.f2668f.cancel();
            this.f2667b.dispose();
            if (getAndIncrement() == 0) {
                this.f2669g.clear();
            }
        }
    }

    @Override // e8.g
    public final void clear() {
        this.f2669g.clear();
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10)) {
            e3.d.a(this.e, j10);
            m();
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.f2671i) {
            return;
        }
        if (this.f2673k == 2) {
            m();
            return;
        }
        if (!this.f2669g.offer(obj)) {
            this.f2668f.cancel();
            this.f2672j = new RuntimeException("Queue is full?!");
            this.f2671i = true;
        }
        m();
    }

    @Override // e8.c
    public final int h(int i10) {
        this.f2675m = true;
        return 2;
    }

    public final boolean i(boolean z9, boolean z10, x7.d dVar) {
        if (this.f2670h) {
            clear();
            return true;
        }
        if (z9) {
            Throwable th = this.f2672j;
            if (th != null) {
                clear();
                dVar.onError(th);
                this.f2667b.dispose();
                return true;
            }
            if (z10) {
                dVar.a();
                this.f2667b.dispose();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        return this.f2669g.isEmpty();
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public final void m() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f2667b.b(this);
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        if (this.f2671i) {
            a.a.s(th);
            return;
        }
        this.f2672j = th;
        this.f2671i = true;
        m();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2675m) {
            k();
        } else if (this.f2673k == 1) {
            l();
        } else {
            j();
        }
    }
}
