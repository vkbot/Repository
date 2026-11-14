package i8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q extends AtomicReference implements x7.f, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final x7.f f2857b;
    public final d8.a c;
    public final boolean d = true;

    public q(x7.f fVar, d8.a aVar) {
        this.f2857b = fVar;
        this.c = aVar;
    }

    @Override // x7.f
    public final void a() {
        this.f2857b.a();
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        if (c8.a.d(this, aVar)) {
            this.f2857b.b(this);
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        this.f2857b.c(obj);
    }

    @Override // z7.a
    public final void dispose() {
        c8.a.a(this);
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        boolean z9 = this.d;
        x7.f fVar = this.f2857b;
        if (!z9 && !(th instanceof Exception)) {
            fVar.onError(th);
            return;
        }
        try {
            Object obj = this.c.c;
            d8.b.a(obj, "The resumeFunction returned a null MaybeSource");
            x7.e eVar = (x7.e) obj;
            c8.a.c(this, null);
            eVar.c(new android.support.v4.media.h((Object) fVar, (Object) this, false, 16));
        } catch (Throwable th2) {
            com.bumptech.glide.d.v(th2);
            fVar.onError(new a8.c(th, th2));
        }
    }
}
