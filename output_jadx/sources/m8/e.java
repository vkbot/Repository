package m8;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f3977b;
    public final ConcurrentLinkedQueue c;
    public final c8.c d;
    public final ScheduledExecutorService e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledFuture f3978f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadFactory f3979g;

    public e(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
        long j11;
        e eVar;
        ScheduledExecutorService scheduledExecutorService;
        ScheduledFuture<?> scheduledFuture;
        if (timeUnit != null) {
            j11 = timeUnit.toNanos(j10);
        } else {
            j11 = 0;
        }
        long j12 = j11;
        this.f3977b = j12;
        this.c = new ConcurrentLinkedQueue();
        this.d = new c8.c(1);
        this.f3979g = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, h.c);
            eVar = this;
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(eVar, j12, j12, TimeUnit.NANOSECONDS);
        } else {
            eVar = this;
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        eVar.e = scheduledExecutorService;
        eVar.f3978f = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.d <= nanoTime) {
                    if (concurrentLinkedQueue.remove(gVar)) {
                        this.d.c(gVar);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
