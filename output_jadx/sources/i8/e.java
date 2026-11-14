package i8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements x7.f, z7.a, x7.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2847b;
    public final x7.f c;
    public final b8.d d;
    public z7.a e;

    public /* synthetic */ e(x7.f fVar, b8.d dVar, int i10) {
        this.f2847b = i10;
        this.c = fVar;
        this.d = dVar;
    }

    @Override // x7.f
    public void a() {
        this.c.a();
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        switch (this.f2847b) {
            case 0:
                if (c8.a.e(this.e, aVar)) {
                    this.e = aVar;
                    this.c.b(this);
                    return;
                }
                return;
            default:
                if (c8.a.e(this.e, aVar)) {
                    this.e = aVar;
                    this.c.b(this);
                    return;
                }
                return;
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        switch (this.f2847b) {
            case 0:
                x7.f fVar = this.c;
                try {
                    if (this.d.test(obj)) {
                        fVar.c(obj);
                        return;
                    } else {
                        fVar.a();
                        return;
                    }
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    fVar.onError(th);
                    return;
                }
            default:
                x7.f fVar2 = this.c;
                try {
                    if (this.d.test(obj)) {
                        fVar2.c(obj);
                        return;
                    } else {
                        fVar2.a();
                        return;
                    }
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    fVar2.onError(th2);
                    return;
                }
        }
    }

    @Override // z7.a
    public final void dispose() {
        switch (this.f2847b) {
            case 0:
                z7.a aVar = this.e;
                this.e = c8.a.f577b;
                aVar.dispose();
                return;
            default:
                z7.a aVar2 = this.e;
                this.e = c8.a.f577b;
                aVar2.dispose();
                return;
        }
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        switch (this.f2847b) {
            case 0:
                this.c.onError(th);
                return;
            default:
                this.c.onError(th);
                return;
        }
    }
}
