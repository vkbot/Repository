package v7;

import java.util.concurrent.atomic.AtomicLong;
import n7.f1;
import n7.v0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends n7.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n7.e f5976b;
    public final /* synthetic */ r c;

    public p(r rVar, n7.e eVar) {
        this.c = rVar;
        this.f5976b = eVar;
    }

    @Override // n7.e
    public final void B(f1 f1Var) {
        k kVar = this.c.f5978a;
        boolean f8 = f1Var.f();
        o oVar = kVar.f5964a;
        if (oVar.e != null || oVar.f5974f != null) {
            l.d dVar = kVar.f5965b;
            if (f8) {
                ((AtomicLong) dVar.c).getAndIncrement();
            } else {
                ((AtomicLong) dVar.d).getAndIncrement();
            }
        }
        this.f5976b.B(f1Var);
    }

    @Override // n7.e
    public final void C(n7.b bVar, v0 v0Var) {
        this.f5976b.C(bVar, v0Var);
    }

    @Override // n7.e
    public final void a() {
        this.f5976b.a();
    }

    @Override // n7.e
    public final void g() {
        this.f5976b.g();
    }

    @Override // n7.e
    public final void h(int i10) {
        this.f5976b.h(i10);
    }

    @Override // n7.e
    public final void i(int i10, long j10) {
        this.f5976b.i(i10, j10);
    }

    @Override // n7.e
    public final void j(v0 v0Var) {
        this.f5976b.j(v0Var);
    }

    @Override // n7.e
    public final void k(long j10) {
        this.f5976b.k(j10);
    }

    @Override // n7.e
    public final void l(long j10) {
        this.f5976b.l(j10);
    }

    @Override // n7.e
    public final void s() {
        this.f5976b.s();
    }

    @Override // n7.e
    public final void t(int i10) {
        this.f5976b.t(i10);
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f5976b, "delegate");
        return t.toString();
    }

    @Override // n7.e
    public final void u(int i10, long j10, long j11) {
        this.f5976b.u(i10, j10, j11);
    }

    @Override // n7.e
    public final void v(long j10) {
        this.f5976b.v(j10);
    }

    @Override // n7.e
    public final void w(long j10) {
        this.f5976b.w(j10);
    }
}
