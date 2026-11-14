package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q extends d0 {
    public final /* synthetic */ n7.f1 d;
    public final /* synthetic */ n7.v0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a5.h f4666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a5.h hVar, n7.f1 f1Var, n7.v0 v0Var) {
        super(0, ((t) hVar.e).f4703h);
        this.f4666f = hVar;
        this.d = f1Var;
        this.e = v0Var;
    }

    @Override // o7.d0
    public final void b() {
        w7.b.c();
        try {
            w7.b.a();
            w7.a aVar = w7.b.f6413a;
            aVar.getClass();
            c();
            aVar.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        n7.f1 f1Var = this.d;
        n7.v0 v0Var = this.e;
        n7.f1 f1Var2 = (n7.f1) this.f4666f.d;
        n7.v0 v0Var2 = v0Var;
        if (f1Var2 != null) {
            f1Var = f1Var2;
            v0Var2 = new Object();
        }
        ((t) this.f4666f.e).f4708m = true;
        try {
            ((n7.e) this.f4666f.c).o(f1Var, v0Var2);
            ((t) this.f4666f.e).s();
            b1.m mVar = ((t) this.f4666f.e).f4702g;
            if (f1Var.f()) {
                ((r1) mVar.e).a();
            } else {
                ((r1) mVar.f305f).a();
            }
        } catch (Throwable th) {
            ((t) this.f4666f.e).s();
            b1.m mVar2 = ((t) this.f4666f.e).f4702g;
            if (f1Var.f()) {
                ((r1) mVar2.e).a();
            } else {
                ((r1) mVar2.f305f).a();
            }
            throw th;
        }
    }
}
