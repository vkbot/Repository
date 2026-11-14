package i8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends x7.e implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f2852b;

    public l(Callable callable) {
        this.f2852b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2852b.call();
    }

    @Override // x7.e
    public final void d(x7.f fVar) {
        c8.d dVar = new c8.d(d8.b.f1858b);
        fVar.b(dVar);
        if (!dVar.c()) {
            try {
                Object call = this.f2852b.call();
                if (!dVar.c()) {
                    if (call == null) {
                        fVar.a();
                    } else {
                        fVar.c(call);
                    }
                }
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                if (!dVar.c()) {
                    fVar.onError(th);
                } else {
                    a.a.s(th);
                }
            }
        }
    }
}
