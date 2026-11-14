package o7;

import java.lang.Thread;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f4730a;

    public u1(f2 f2Var) {
        this.f4730a = f2Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = f2.f4482c0;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        f2 f2Var = this.f4730a;
        sb.append(f2Var.f4489a);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (f2Var.f4510z) {
            return;
        }
        f2Var.f4510z = true;
        n3 n3Var = f2Var.f4490a0;
        n3Var.f4623f = false;
        ScheduledFuture scheduledFuture = n3Var.f4624g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            n3Var.f4624g = null;
        }
        f2Var.k(false);
        t1 t1Var = new t1(th);
        f2Var.f4509y = t1Var;
        f2Var.E.g(t1Var);
        f2Var.P.h(null);
        f2Var.N.m(4, "PANIC! Entering TRANSIENT_FAILURE");
        f2Var.r.c(n7.j.d);
    }
}
