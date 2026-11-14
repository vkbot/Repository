package i8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s extends o8.c implements x7.f {
    public z7.a d;

    @Override // x7.f
    public final void a() {
        this.f4803b.a();
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        if (c8.a.e(this.d, aVar)) {
            this.d = aVar;
            this.f4803b.f(this);
        }
    }

    @Override // n9.b
    public final void cancel() {
        set(4);
        this.c = null;
        this.d.dispose();
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        this.f4803b.onError(th);
    }
}
