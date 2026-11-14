package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v extends n8.b implements e8.a {

    /* renamed from: g, reason: collision with root package name */
    public final b8.d f2714g;

    public v(x7.d dVar, b8.d dVar2) {
        super(dVar);
        this.f2714g = dVar2;
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (!g(obj)) {
            this.c.d(1L);
        }
    }

    @Override // e8.a
    public final boolean g(Object obj) {
        if (this.e) {
            return false;
        }
        int i10 = this.f4266f;
        x7.d dVar = this.f4265b;
        if (i10 != 0) {
            dVar.e(null);
            return true;
        }
        try {
            boolean test = this.f2714g.test(obj);
            if (test) {
                dVar.e(obj);
            }
            return test;
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            this.c.cancel();
            onError(th);
            return true;
        }
    }

    @Override // e8.g
    public final Object poll() {
        e8.d dVar = this.d;
        while (true) {
            Object poll = dVar.poll();
            if (poll == null) {
                return null;
            }
            if (this.f2714g.test(poll)) {
                return poll;
            }
            if (this.f4266f == 2) {
                dVar.d(1L);
            }
        }
    }
}
