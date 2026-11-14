package i8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends AtomicReference implements x7.f, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final x7.f f2851b;
    public final b8.c c;
    public z7.a d;

    public j(x7.f fVar, b8.c cVar) {
        this.f2851b = fVar;
        this.c = cVar;
    }

    @Override // x7.f
    public final void a() {
        this.f2851b.a();
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        if (c8.a.e(this.d, aVar)) {
            this.d = aVar;
            this.f2851b.b(this);
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        try {
            Object apply = this.c.apply(obj);
            d8.b.a(apply, "The mapper returned a null MaybeSource");
            x7.e eVar = (x7.e) apply;
            if (!c8.a.b((z7.a) get())) {
                eVar.c(new r5.c(20, this));
            }
        } catch (Exception e) {
            com.bumptech.glide.d.v(e);
            this.f2851b.onError(e);
        }
    }

    @Override // z7.a
    public final void dispose() {
        c8.a.a(this);
        this.d.dispose();
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        this.f2851b.onError(th);
    }
}
