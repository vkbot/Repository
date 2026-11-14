package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n extends n8.b {

    /* renamed from: g, reason: collision with root package name */
    public final b8.b f2694g;

    /* renamed from: h, reason: collision with root package name */
    public final b8.b f2695h;

    /* renamed from: i, reason: collision with root package name */
    public final b8.a f2696i;

    /* renamed from: j, reason: collision with root package name */
    public final b8.a f2697j;

    public n(x7.d dVar, e0.g gVar, z3.f fVar, w7.c cVar, w7.c cVar2) {
        super(dVar);
        this.f2694g = gVar;
        this.f2695h = fVar;
        this.f2696i = cVar;
        this.f2697j = cVar2;
    }

    @Override // n8.b, x7.d
    public final void a() {
        if (this.e) {
            return;
        }
        try {
            this.f2696i.run();
            this.e = true;
            this.f4265b.a();
            try {
                this.f2697j.run();
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                a.a.s(th);
            }
        } catch (Throwable th2) {
            com.bumptech.glide.d.v(th2);
            this.c.cancel();
            onError(th2);
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.e) {
            return;
        }
        int i10 = this.f4266f;
        x7.d dVar = this.f4265b;
        if (i10 != 0) {
            dVar.e(null);
            return;
        }
        try {
            this.f2694g.accept(obj);
            dVar.e(obj);
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            this.c.cancel();
            onError(th);
        }
    }

    @Override // n8.b, x7.d
    public final void onError(Throwable th) {
        x7.d dVar = this.f4265b;
        if (this.e) {
            a.a.s(th);
            return;
        }
        this.e = true;
        try {
            this.f2695h.accept(th);
            dVar.onError(th);
        } catch (Throwable th2) {
            com.bumptech.glide.d.v(th2);
            dVar.onError(new a8.c(th, th2));
        }
        try {
            this.f2697j.run();
        } catch (Throwable th3) {
            com.bumptech.glide.d.v(th3);
            a.a.s(th3);
        }
    }

    @Override // e8.g
    public final Object poll() {
        a8.c cVar;
        b8.b bVar = this.f2695h;
        try {
            Object poll = this.d.poll();
            b8.a aVar = this.f2697j;
            if (poll != null) {
                try {
                    this.f2694g.accept(poll);
                    aVar.run();
                    return poll;
                } catch (Throwable th) {
                    try {
                        com.bumptech.glide.d.v(th);
                        try {
                            bVar.accept(th);
                            p8.c cVar2 = p8.d.f5114a;
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw th;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        aVar.run();
                        throw th2;
                    }
                }
            }
            if (this.f4266f == 1) {
                this.f2696i.run();
                aVar.run();
            }
            return poll;
        } catch (Throwable th3) {
            com.bumptech.glide.d.v(th3);
            try {
                bVar.accept(th3);
                p8.c cVar3 = p8.d.f5114a;
                if (th3 instanceof Exception) {
                    throw th3;
                }
                throw th3;
            } finally {
            }
        }
    }
}
