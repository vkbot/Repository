package v7;

import java.util.concurrent.ScheduledExecutorService;
import n7.e0;
import n7.h0;
import n7.k1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a extends n7.e {
    @Override // n7.e
    public void D(n7.j jVar, h0 h0Var) {
        E().D(jVar, h0Var);
    }

    public abstract n7.e E();

    @Override // n7.e
    public n7.t b(e0 e0Var) {
        return E().b(e0Var);
    }

    @Override // n7.e
    public final n7.e c() {
        return E().c();
    }

    @Override // n7.e
    public final ScheduledExecutorService d() {
        return E().d();
    }

    @Override // n7.e
    public final k1 f() {
        return E().f();
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(E(), "delegate");
        return t.toString();
    }

    @Override // n7.e
    public final void y() {
        E().y();
    }
}
