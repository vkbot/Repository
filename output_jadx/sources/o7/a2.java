package o7;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a2 extends n7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f4391a;

    public a2(c2 c2Var) {
        this.f4391a = c2Var;
    }

    @Override // n7.d
    public final String e() {
        return this.f4391a.f4446b;
    }

    @Override // n7.d
    public final n7.t f(n7.x0 x0Var, n7.c cVar) {
        ScheduledExecutorService scheduledExecutorService;
        f2 f2Var = this.f4391a.d;
        Logger logger = f2.f4482c0;
        Executor executor = cVar.f4165b;
        if (executor == null) {
            executor = f2Var.f4495h;
        }
        c0.h hVar = f2Var.Z;
        if (f2Var.I) {
            scheduledExecutorService = null;
        } else {
            scheduledExecutorService = this.f4391a.d.f4493f.f4597b.e;
        }
        t tVar = new t(x0Var, executor, cVar, hVar, scheduledExecutorService, this.f4391a.d.L);
        tVar.r = this.f4391a.d.f4501n;
        return tVar;
    }
}
