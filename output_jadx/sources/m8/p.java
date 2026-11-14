package m8;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends x7.k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f3993b;
    public static final ScheduledExecutorService c;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f3994a;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f3993b = new k("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public p() {
        AtomicReference atomicReference = new AtomicReference();
        this.f3994a = atomicReference;
        boolean z9 = n.f3990a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f3993b);
        if (n.f3990a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // x7.k
    public final x7.j a() {
        return new o((ScheduledExecutorService) this.f3994a.get());
    }

    @Override // x7.k
    public final z7.a c(i8.p pVar) {
        l lVar = new l(pVar);
        try {
            lVar.a(((ScheduledExecutorService) this.f3994a.get()).submit(lVar));
            return lVar;
        } catch (RejectedExecutionException e) {
            a.a.s(e);
            return c8.b.f578b;
        }
    }
}
