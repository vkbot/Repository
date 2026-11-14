package v8;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class s0 extends r0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6049b;

    public s0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f6049b = executor;
        Method method2 = a9.c.f63a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = a9.c.f63a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f6049b;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f6049b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            z0 z0Var = (z0) coroutineContext.get(y0.f6058b);
            if (z0Var != null) {
                z0Var.c(cancellationException);
            }
            h0.f6030b.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s0) && ((s0) obj).f6049b == this.f6049b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6049b);
    }

    @Override // v8.t
    public final String toString() {
        return this.f6049b.toString();
    }
}
