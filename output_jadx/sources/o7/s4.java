package o7;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s4 {
    public static final s4 d = new s4(new u2(19));

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f4698a = new IdentityHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final u2 f4699b;
    public ScheduledExecutorService c;

    public s4(u2 u2Var) {
        this.f4699b = u2Var;
    }

    public static Object a(r4 r4Var) {
        Object obj;
        s4 s4Var = d;
        synchronized (s4Var) {
            try {
                q4 q4Var = (q4) s4Var.f4698a.get(r4Var);
                if (q4Var == null) {
                    q4Var = new q4(r4Var.create());
                    s4Var.f4698a.put(r4Var, q4Var);
                }
                ScheduledFuture scheduledFuture = q4Var.c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    q4Var.c = null;
                }
                q4Var.f4686b++;
                obj = q4Var.f4685a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(r4 r4Var, Object obj) {
        boolean z9;
        boolean z10;
        s4 s4Var = d;
        synchronized (s4Var) {
            try {
                q4 q4Var = (q4) s4Var.f4698a.get(r4Var);
                if (q4Var != null) {
                    boolean z11 = false;
                    if (obj == q4Var.f4685a) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o4.b.d("Releasing the wrong instance", z9);
                    if (q4Var.f4686b > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o4.b.m(z10, "Refcount has already reached zero");
                    int i10 = q4Var.f4686b - 1;
                    q4Var.f4686b = i10;
                    if (i10 == 0) {
                        if (q4Var.c == null) {
                            z11 = true;
                        }
                        o4.b.m(z11, "Destroy task already scheduled");
                        if (s4Var.c == null) {
                            s4Var.f4699b.getClass();
                            s4Var.c = Executors.newSingleThreadScheduledExecutor(y0.e("grpc-shared-destroyer-%d"));
                        }
                        q4Var.c = s4Var.c.schedule(new q1(new m0.r0(4, s4Var, q4Var, r4Var, obj)), 1L, TimeUnit.SECONDS);
                    }
                } else {
                    throw new IllegalArgumentException("No cached instance found for " + r4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
