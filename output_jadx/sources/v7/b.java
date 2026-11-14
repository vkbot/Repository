package v7;

import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b extends n7.t {
    @Override // n7.t
    public final List c() {
        return r().c();
    }

    @Override // n7.t
    public final n7.e e() {
        return r().e();
    }

    @Override // n7.t
    public final Object f() {
        return r().f();
    }

    @Override // n7.t
    public final void l() {
        r().l();
    }

    @Override // n7.t
    public void n() {
        r().n();
    }

    @Override // n7.t
    public void q(List list) {
        r().q(list);
    }

    public abstract n7.t r();

    public String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(r(), "delegate");
        return t.toString();
    }
}
