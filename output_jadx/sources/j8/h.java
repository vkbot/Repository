package j8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends a {
    public final e0.g c;
    public final int d;

    public h(x7.g gVar, e0.g gVar2, int i10) {
        super(gVar);
        this.c = gVar2;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.g
    public final void d(x7.h hVar) {
        z7.a aVar = c8.b.f578b;
        x7.g gVar = this.f3323b;
        boolean z9 = gVar instanceof Callable;
        e0.g gVar2 = this.c;
        if (z9) {
            try {
                Object call = ((Callable) gVar).call();
                if (call == null) {
                    hVar.b(aVar);
                    hVar.a();
                    return;
                }
                try {
                    x7.g gVar3 = (x7.g) gVar2.apply(call);
                    if (gVar3 instanceof Callable) {
                        try {
                            Object call2 = ((Callable) gVar3).call();
                            if (call2 == null) {
                                hVar.b(aVar);
                                hVar.a();
                                return;
                            } else {
                                k kVar = new k(hVar, call2);
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
                    gVar3.c(hVar);
                    return;
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    hVar.b(aVar);
                    hVar.onError(th2);
                    return;
                }
            } catch (Throwable th3) {
                com.bumptech.glide.d.v(th3);
                hVar.b(aVar);
                hVar.onError(th3);
                return;
            }
        }
        gVar.c(new g(hVar, gVar2, this.d));
    }
}
