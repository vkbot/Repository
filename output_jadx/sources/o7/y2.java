package o7;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y2 extends n7.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4791a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4792b = new AtomicBoolean(false);
    public final Object c;
    public final /* synthetic */ n7.j0 d;

    public y2(e3 e3Var, n7.t tVar) {
        this.d = e3Var;
        o4.b.i(tVar, "subchannel");
        this.c = tVar;
    }

    @Override // n7.h0
    public final n7.f0 a(g3 g3Var) {
        switch (this.f4791a) {
            case 0:
                if (this.f4792b.compareAndSet(false, true)) {
                    n7.k1 f8 = ((a3) this.d).f4393f.f();
                    a3 a3Var = (a3) this.c;
                    Objects.requireNonNull(a3Var);
                    f8.execute(new f5.j(10, a3Var));
                }
                return n7.f0.e;
            default:
                if (this.f4792b.compareAndSet(false, true)) {
                    ((e3) this.d).f4473f.f().execute(new com.bumptech.glide.m(19, this));
                }
                return n7.f0.e;
        }
    }

    public y2(a3 a3Var, a3 a3Var2) {
        this.d = a3Var;
        this.c = a3Var2;
    }
}
