package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g0 extends n8.b {

    /* renamed from: g, reason: collision with root package name */
    public final b8.c f2665g;

    public g0(x7.d dVar, r5.c cVar) {
        super(dVar);
        this.f2665g = cVar;
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
            Object apply = this.f2665g.apply(obj);
            d8.b.a(apply, "The mapper function returned a null value.");
            dVar.e(apply);
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            this.c.cancel();
            onError(th);
        }
    }

    @Override // e8.g
    public final Object poll() {
        Object poll = this.d.poll();
        if (poll != null) {
            Object apply = this.f2665g.apply(poll);
            d8.b.a(apply, "The mapper function returned a null value.");
            return apply;
        }
        return null;
    }
}
