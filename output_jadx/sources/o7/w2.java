package o7;

import java.util.logging.Level;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w2 implements n7.i0 {

    /* renamed from: a, reason: collision with root package name */
    public n7.k f4763a = n7.k.a(n7.j.e);

    /* renamed from: b, reason: collision with root package name */
    public z2 f4764b;
    public final /* synthetic */ a3 c;

    public w2(a3 a3Var) {
        this.c = a3Var;
    }

    @Override // n7.i0
    public final void a(n7.k kVar) {
        a3.f4392o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{kVar, this.f4764b.f4796a});
        this.f4763a = kVar;
        a3 a3Var = this.c;
        if (a3Var.f4395h.c() && ((z2) a3Var.f4394g.get(a3Var.f4395h.a())).c == this) {
            a3Var.j(this.f4764b);
        }
    }
}
