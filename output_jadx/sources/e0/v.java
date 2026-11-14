package e0;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2052b;
    public final long c;
    public long d = 0;

    public v(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j10) {
        this.f2052b = scheduledThreadPoolExecutor;
        this.c = j10;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f2052b.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f2052b.getQueue().size() < 30) {
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(0L, this.d - currentTimeMillis);
            this.f2052b.schedule(runnable, max, TimeUnit.MILLISECONDS);
            this.d = currentTimeMillis + max + this.c;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f2052b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f2052b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f2052b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f2052b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f2052b.schedule(runnable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f2052b.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f2052b.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f2052b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f2052b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f2052b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f2052b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f2052b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return this.f2052b.schedule(callable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f2052b.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f2052b.submit(runnable);
    }
}
