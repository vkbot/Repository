package j8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends x7.g {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3349b;
    public final e0.g c;

    public l(Object obj, e0.g gVar) {
        this.f3349b = obj;
        this.c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.g
    public final void d(x7.h hVar) {
        z7.a aVar = c8.b.f578b;
        try {
            x7.g gVar = (x7.g) this.c.apply(this.f3349b);
            if (gVar instanceof Callable) {
                try {
                    Object call = ((Callable) gVar).call();
                    if (call == null) {
                        hVar.b(aVar);
                        hVar.a();
                        return;
                    } else {
                        k kVar = new k(hVar, call);
                        hVar.b(kVar);
                        kVar.run();
                        return;
                    }
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    hVar.b(aVar);
                    hVar.onError(th);
                    return;
                }
            }
            gVar.c(hVar);
        } catch (Throwable th2) {
            hVar.b(aVar);
            hVar.onError(th2);
        }
    }
}
