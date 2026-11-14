package i8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements x7.f, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final x7.m f2853b;
    public z7.a c;

    public m(x7.m mVar) {
        this.f2853b = mVar;
    }

    @Override // x7.f
    public final void a() {
        this.c = c8.a.f577b;
        this.f2853b.c(Boolean.TRUE);
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        if (c8.a.e(this.c, aVar)) {
            this.c = aVar;
            this.f2853b.b(this);
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        this.c = c8.a.f577b;
        this.f2853b.c(Boolean.FALSE);
    }

    @Override // z7.a
    public final void dispose() {
        this.c.dispose();
        this.c = c8.a.f577b;
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        this.c = c8.a.f577b;
        this.f2853b.onError(th);
    }
}
