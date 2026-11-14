package o7;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y1 extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public b1.m f4790b;
    public final /* synthetic */ f2 c;

    public y1(f2 f2Var) {
        this.c = f2Var;
    }

    @Override // n7.e
    public final void D(n7.j jVar, n7.h0 h0Var) {
        n7.k1 k1Var = this.c.f4500m;
        k1Var.d();
        o4.b.i(jVar, "newState");
        o4.b.i(h0Var, "newPicker");
        k1Var.execute(new c3.e(this, h0Var, jVar, 4));
    }

    @Override // n7.e
    public final n7.t b(n7.e0 e0Var) {
        f2 f2Var = this.c;
        f2Var.f4500m.d();
        o4.b.m(!f2Var.H, "Channel is being terminated");
        return new e2(f2Var, e0Var);
    }

    @Override // n7.e
    public final n7.e c() {
        return this.c.N;
    }

    @Override // n7.e
    public final ScheduledExecutorService d() {
        return this.c.f4494g;
    }

    @Override // n7.e
    public final n7.k1 f() {
        return this.c.f4500m;
    }

    @Override // n7.e
    public final void y() {
        n7.k1 k1Var = this.c.f4500m;
        k1Var.d();
        k1Var.execute(new com.bumptech.glide.m(15, this));
    }
}
