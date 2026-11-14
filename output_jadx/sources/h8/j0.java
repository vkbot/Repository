package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j0 extends h0 {

    /* renamed from: n, reason: collision with root package name */
    public final x7.d f2681n;

    public j0(x7.d dVar, x7.j jVar, int i10) {
        super(jVar, i10);
        this.f2681n = dVar;
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.f2668f, bVar)) {
            this.f2668f = bVar;
            if (bVar instanceof e8.d) {
                e8.d dVar = (e8.d) bVar;
                int h2 = dVar.h(7);
                if (h2 == 1) {
                    this.f2673k = 1;
                    this.f2669g = dVar;
                    this.f2671i = true;
                    this.f2681n.f(this);
                    return;
                }
                if (h2 == 2) {
                    this.f2673k = 2;
                    this.f2669g = dVar;
                    this.f2681n.f(this);
                    bVar.d(this.c);
                    return;
                }
            }
            this.f2669g = new l8.a(this.c);
            this.f2681n.f(this);
            bVar.d(this.c);
        }
    }

    @Override // h8.h0
    public final void j() {
        boolean z9;
        x7.d dVar = this.f2681n;
        e8.g gVar = this.f2669g;
        long j10 = this.f2674l;
        int i10 = 1;
        while (true) {
            long j11 = this.e.get();
            while (j10 != j11) {
                boolean z10 = this.f2671i;
                try {
                    Object poll = gVar.poll();
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
                        j10++;
                        if (j10 == this.d) {
                            if (j11 != Long.MAX_VALUE) {
                                j11 = this.e.addAndGet(-j10);
                            }
                            this.f2668f.d(j10);
                            j10 = 0;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    this.f2668f.cancel();
                    gVar.clear();
                    dVar.onError(th);
                    this.f2667b.dispose();
                    return;
                }
            }
            if (j10 != j11 || !i(this.f2671i, gVar.isEmpty(), dVar)) {
                int i11 = get();
                if (i10 == i11) {
                    this.f2674l = j10;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            } else {
                return;
            }
        }
    }

    @Override // h8.h0
    public final void k() {
        int i10 = 1;
        while (!this.f2670h) {
            boolean z9 = this.f2671i;
            this.f2681n.e(null);
            if (z9) {
                Throwable th = this.f2672j;
                x7.d dVar = this.f2681n;
                if (th != null) {
                    dVar.onError(th);
                } else {
                    dVar.a();
                }
                this.f2667b.dispose();
                return;
            }
            i10 = addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
        }
    }

    @Override // h8.h0
    public final void l() {
        x7.d dVar = this.f2681n;
        e8.g gVar = this.f2669g;
        long j10 = this.f2674l;
        int i10 = 1;
        while (true) {
            long j11 = this.e.get();
            while (j10 != j11) {
                try {
                    Object poll = gVar.poll();
                    if (!this.f2670h) {
                        if (poll == null) {
                            dVar.a();
                            this.f2667b.dispose();
                            return;
                        } else {
                            dVar.e(poll);
                            j10++;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    this.f2668f.cancel();
                    dVar.onError(th);
                    this.f2667b.dispose();
                    return;
                }
            }
            if (!this.f2670h) {
                if (gVar.isEmpty()) {
                    dVar.a();
                    this.f2667b.dispose();
                    return;
                }
                int i11 = get();
                if (i10 == i11) {
                    this.f2674l = j10;
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    i10 = i11;
                }
            } else {
                return;
            }
        }
    }

    @Override // e8.g
    public final Object poll() {
        Object poll = this.f2669g.poll();
        if (poll != null && this.f2673k != 1) {
            long j10 = this.f2674l + 1;
            if (j10 == this.d) {
                this.f2674l = 0L;
                this.f2668f.d(j10);
                return poll;
            }
            this.f2674l = j10;
        }
        return poll;
    }
}
