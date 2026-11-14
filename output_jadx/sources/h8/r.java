package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r implements x7.d, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final x7.f f2710b;
    public n9.b c;
    public long d;
    public boolean e;

    public r(x7.f fVar) {
        this.f2710b = fVar;
    }

    @Override // x7.d
    public final void a() {
        this.c = o8.f.f4806b;
        if (!this.e) {
            this.e = true;
            this.f2710b.a();
        }
    }

    @Override // z7.a
    public final void dispose() {
        this.c.cancel();
        this.c = o8.f.f4806b;
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.e) {
            return;
        }
        long j10 = this.d;
        if (j10 == 0) {
            this.e = true;
            this.c.cancel();
            this.c = o8.f.f4806b;
            this.f2710b.c(obj);
            return;
        }
        this.d = j10 + 1;
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.c, bVar)) {
            this.c = bVar;
            this.f2710b.b(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        if (this.e) {
            a.a.s(th);
            return;
        }
        this.e = true;
        this.c = o8.f.f4806b;
        this.f2710b.onError(th);
    }
}
