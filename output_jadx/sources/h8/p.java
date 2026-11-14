package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends o8.c implements x7.d {
    public n9.b d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2708f;

    @Override // x7.d
    public final void a() {
        if (!this.f2708f) {
            this.f2708f = true;
            this.f4803b.a();
        }
    }

    @Override // n9.b
    public final void cancel() {
        set(4);
        this.c = null;
        this.d.cancel();
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.f2708f) {
            return;
        }
        long j10 = this.e;
        if (j10 == 0) {
            this.f2708f = true;
            this.d.cancel();
            i(obj);
            return;
        }
        this.e = j10 + 1;
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.d, bVar)) {
            this.d = bVar;
            this.f4803b.f(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        if (this.f2708f) {
            a.a.s(th);
        } else {
            this.f2708f = true;
            this.f4803b.onError(th);
        }
    }
}
