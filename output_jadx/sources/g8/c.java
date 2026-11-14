package g8;

import i8.r;
import x7.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements x7.a, z7.a, f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2490b;
    public z7.a c;
    public final Object d;
    public final Object e;

    public c(d dVar, x7.a aVar) {
        this.f2490b = 0;
        this.e = dVar;
        this.d = aVar;
    }

    @Override // x7.a, x7.f
    public final void a() {
        switch (this.f2490b) {
            case 0:
                x7.a aVar = (x7.a) this.d;
                d dVar = (d) this.e;
                if (this.c != c8.a.f577b) {
                    try {
                        dVar.d.run();
                        aVar.a();
                        return;
                    } catch (Throwable th) {
                        com.bumptech.glide.d.v(th);
                        aVar.onError(th);
                        return;
                    }
                }
                return;
            case 1:
                ((f) this.d).a();
                return;
            default:
                z7.a aVar2 = this.c;
                c8.a aVar3 = c8.a.f577b;
                if (aVar2 != aVar3) {
                    this.c = aVar3;
                    ((f) this.d).a();
                    return;
                }
                return;
        }
    }

    @Override // x7.a, x7.f
    public final void b(z7.a aVar) {
        switch (this.f2490b) {
            case 0:
                x7.a aVar2 = (x7.a) this.d;
                if (c8.a.e(this.c, aVar)) {
                    this.c = aVar;
                    aVar2.b(this);
                    return;
                }
                return;
            case 1:
                if (c8.a.e(this.c, aVar)) {
                    this.c = aVar;
                    ((f) this.d).b(this);
                    return;
                }
                return;
            default:
                f fVar = (f) this.d;
                if (c8.a.e(this.c, aVar)) {
                    this.c = aVar;
                    fVar.b(this);
                    return;
                }
                return;
        }
    }

    @Override // x7.f
    public void c(Object obj) {
        switch (this.f2490b) {
            case 1:
                f fVar = (f) this.d;
                try {
                    Object apply = ((b8.c) this.e).apply(obj);
                    d8.b.a(apply, "The mapper returned a null item");
                    fVar.c(apply);
                    return;
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    fVar.onError(th);
                    return;
                }
            default:
                z7.a aVar = this.c;
                c8.a aVar2 = c8.a.f577b;
                if (aVar != aVar2) {
                    try {
                        ((r) this.e).c.accept(obj);
                        this.c = aVar2;
                        ((f) this.d).c(obj);
                        return;
                    } catch (Throwable th2) {
                        com.bumptech.glide.d.v(th2);
                        d(th2);
                        return;
                    }
                }
                return;
        }
    }

    public void d(Throwable th) {
        try {
            ((r) this.e).d.accept(th);
        } catch (Throwable th2) {
            com.bumptech.glide.d.v(th2);
            th = new a8.c(th, th2);
        }
        this.c = c8.a.f577b;
        ((f) this.d).onError(th);
    }

    @Override // z7.a
    public final void dispose() {
        switch (this.f2490b) {
            case 0:
                this.c.dispose();
                return;
            case 1:
                z7.a aVar = this.c;
                this.c = c8.a.f577b;
                aVar.dispose();
                return;
            default:
                this.c.dispose();
                this.c = c8.a.f577b;
                return;
        }
    }

    @Override // x7.a, x7.f
    public final void onError(Throwable th) {
        switch (this.f2490b) {
            case 0:
                d dVar = (d) this.e;
                if (this.c == c8.a.f577b) {
                    a.a.s(th);
                    return;
                }
                try {
                    dVar.c.accept(th);
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    th = new a8.c(th, th2);
                }
                ((x7.a) this.d).onError(th);
                return;
            case 1:
                ((f) this.d).onError(th);
                return;
            default:
                if (this.c == c8.a.f577b) {
                    a.a.s(th);
                    return;
                } else {
                    d(th);
                    return;
                }
        }
    }

    public /* synthetic */ c(f fVar, Object obj, int i10) {
        this.f2490b = i10;
        this.d = fVar;
        this.e = obj;
    }
}
