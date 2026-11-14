package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e0 implements x7.h, n9.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2660b;
    public z7.a c;

    public e0(x7.d dVar) {
        this.f2660b = dVar;
    }

    @Override // x7.h
    public final void a() {
        this.f2660b.a();
    }

    @Override // x7.h
    public final void b(z7.a aVar) {
        this.c = aVar;
        this.f2660b.f(this);
    }

    @Override // n9.b
    public final void cancel() {
        this.c.dispose();
    }

    @Override // x7.h
    public final void e(Object obj) {
        this.f2660b.e(obj);
    }

    @Override // x7.h
    public final void onError(Throwable th) {
        this.f2660b.onError(th);
    }

    @Override // n9.b
    public final void d(long j10) {
    }
}
