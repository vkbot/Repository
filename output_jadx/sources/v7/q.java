package v7;

import java.util.concurrent.atomic.AtomicLong;
import n7.f1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f5977b;

    public q(r rVar) {
        this.f5977b = rVar;
    }

    @Override // n7.e
    public final void B(f1 f1Var) {
        k kVar = this.f5977b.f5978a;
        boolean f8 = f1Var.f();
        o oVar = kVar.f5964a;
        if (oVar.e == null && oVar.f5974f == null) {
            return;
        }
        l.d dVar = kVar.f5965b;
        if (f8) {
            ((AtomicLong) dVar.c).getAndIncrement();
        } else {
            ((AtomicLong) dVar.d).getAndIncrement();
        }
    }
}
