package o7;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {
    public static final Logger e = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f4555a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.k1 f4556b;
    public r0 c;
    public l.d d;

    public j(u2 u2Var, d2 d2Var, n7.k1 k1Var) {
        this.f4555a = d2Var;
        this.f4556b = k1Var;
    }

    public final void a(com.bumptech.glide.m mVar) {
        this.f4556b.d();
        if (this.c == null) {
            this.c = u2.s();
        }
        l.d dVar = this.d;
        if (dVar != null) {
            n7.j1 j1Var = (n7.j1) dVar.c;
            if (!j1Var.d && !j1Var.c) {
                return;
            }
        }
        long a10 = this.c.a();
        this.d = this.f4556b.c(mVar, a10, TimeUnit.NANOSECONDS, this.f4555a);
        e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a10));
    }
}
