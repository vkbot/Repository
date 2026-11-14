package m8;

import h8.h0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class j extends x7.j {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f3985b;
    public volatile boolean c;

    public j(ThreadFactory threadFactory) {
        boolean z9 = n.f3990a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (n.f3990a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            n.d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f3985b = newScheduledThreadPool;
    }

    @Override // x7.j
    public final z7.a a(Runnable runnable, TimeUnit timeUnit) {
        if (this.c) {
            return c8.b.f578b;
        }
        return c(runnable, timeUnit, null);
    }

    @Override // x7.j
    public final void b(h0 h0Var) {
        a(h0Var, null);
    }

    public final m c(Runnable runnable, TimeUnit timeUnit, c8.c cVar) {
        m mVar = new m(runnable, cVar);
        if (cVar != null && !cVar.a(mVar)) {
            return mVar;
        }
        try {
            mVar.a(this.f3985b.submit((Callable) mVar));
            return mVar;
        } catch (RejectedExecutionException e) {
            if (cVar != null) {
                cVar.c(mVar);
            }
            a.a.s(e);
            return mVar;
        }
    }

    @Override // z7.a
    public final void dispose() {
        if (!this.c) {
            this.c = true;
            this.f3985b.shutdownNow();
        }
    }
}
