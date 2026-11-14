package m8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends x7.k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f3981b;
    public static final k c;
    public static final g d;
    public static final e e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3982a;

    static {
        g gVar = new g(new k("RxCachedThreadSchedulerShutdown"));
        d = gVar;
        gVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        k kVar = new k("RxCachedThreadScheduler", max, false);
        f3981b = kVar;
        c = new k("RxCachedWorkerPoolEvictor", max, false);
        e eVar = new e(0L, null, kVar);
        e = eVar;
        eVar.d.dispose();
        ScheduledFuture scheduledFuture = eVar.f3978f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public h() {
        e eVar = e;
        AtomicReference atomicReference = new AtomicReference(eVar);
        this.f3982a = atomicReference;
        e eVar2 = new e(60L, TimeUnit.SECONDS, f3981b);
        while (!atomicReference.compareAndSet(eVar, eVar2)) {
            if (atomicReference.get() != eVar) {
                eVar2.d.dispose();
                ScheduledFuture scheduledFuture = eVar2.f3978f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = eVar2.e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // x7.k
    public final x7.j a() {
        return new f((e) this.f3982a.get());
    }
}
