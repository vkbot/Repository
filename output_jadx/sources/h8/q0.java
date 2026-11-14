package h8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q0 extends x7.b {
    public final Object c;
    public final b8.c d;

    public q0(Object obj, b8.c cVar) {
        this.c = obj;
        this.d = cVar;
    }

    @Override // x7.b
    public final void e(x7.d dVar) {
        try {
            Object apply = this.d.apply(this.c);
            d8.b.a(apply, "The mapper returned a null Publisher");
            n9.a aVar = (n9.a) apply;
            if (aVar instanceof Callable) {
                try {
                    Object call = ((Callable) aVar).call();
                    if (call == null) {
                        o8.d.a(dVar);
                        return;
                    } else {
                        dVar.f(new o8.e(call, dVar));
                        return;
                    }
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    o8.d.b(th, dVar);
                    return;
                }
            }
            aVar.a(dVar);
        } catch (Throwable th2) {
            o8.d.b(th2, dVar);
        }
    }
}
