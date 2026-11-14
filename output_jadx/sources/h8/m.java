package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends n8.a {

    /* renamed from: g, reason: collision with root package name */
    public final b8.b f2689g;

    /* renamed from: h, reason: collision with root package name */
    public final b8.b f2690h;

    /* renamed from: i, reason: collision with root package name */
    public final b8.a f2691i;

    /* renamed from: j, reason: collision with root package name */
    public final b8.a f2692j;

    public m(e8.a aVar, e0.g gVar, z3.f fVar, w7.c cVar, w7.c cVar2) {
        super(aVar);
        this.f2689g = gVar;
        this.f2690h = fVar;
        this.f2691i = cVar;
        this.f2692j = cVar2;
    }

    @Override // n8.a, x7.d
    public final void a() {
        if (this.e) {
            return;
        }
        try {
            this.f2691i.run();
            this.e = true;
            this.f4263b.a();
            try {
                this.f2692j.run();
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                a.a.s(th);
            }
        } catch (Throwable th2) {
            b(th2);
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.e) {
            return;
        }
        int i10 = this.f4264f;
        e8.a aVar = this.f4263b;
        if (i10 != 0) {
            aVar.e(null);
            return;
        }
        try {
            this.f2689g.accept(obj);
            aVar.e(obj);
        } catch (Throwable th) {
            b(th);
        }
    }

    @Override // e8.a
    public final boolean g(Object obj) {
        if (this.e) {
            return false;
        }
        try {
            this.f2689g.accept(obj);
            return this.f4263b.g(obj);
        } catch (Throwable th) {
            b(th);
            return false;
        }
    }

    @Override // n8.a, x7.d
    public final void onError(Throwable th) {
        e8.a aVar = this.f4263b;
        if (this.e) {
            a.a.s(th);
            return;
        }
        this.e = true;
        try {
            this.f2690h.accept(th);
            aVar.onError(th);
        } catch (Throwable th2) {
            com.bumptech.glide.d.v(th2);
            aVar.onError(new a8.c(th, th2));
        }
        try {
            this.f2692j.run();
        } catch (Throwable th3) {
            com.bumptech.glide.d.v(th3);
            a.a.s(th3);
        }
    }

    @Override // e8.g
    public final Object poll() {
        a8.c cVar;
        b8.b bVar = this.f2690h;
        try {
            Object poll = this.d.poll();
            b8.a aVar = this.f2692j;
            if (poll != null) {
                try {
                    this.f2689g.accept(poll);
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
            if (this.f4264f == 1) {
                this.f2691i.run();
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
