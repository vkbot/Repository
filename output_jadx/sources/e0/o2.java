package e0;

import java.lang.Thread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o2 extends ScheduledThreadPoolExecutor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1993b = 0;

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        String name;
        super.afterExecute(runnable, th);
        if (!isShutdown()) {
            if (th == null && (runnable instanceof Future)) {
                try {
                    Future future = (Future) runnable;
                    if (future.isDone() && !future.isCancelled()) {
                        future.get();
                    }
                } catch (InterruptedException | CancellationException unused) {
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
            if (th != null) {
                if (runnable instanceof n2) {
                    name = ((n2) runnable).c;
                } else {
                    name = Thread.currentThread().getName();
                }
                int i10 = 14;
                try {
                    th.addSuppressed(new Throwable(m.h(new byte[]{-126, -106, -7, -88, -65, -4, 56, -117, -123, -106, -11, -82, -78, -50}, new byte[]{-51, -60, -80, -17, -10, -78, 103, -33}) + name));
                } catch (Throwable unused2) {
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    try {
                        defaultUncaughtExceptionHandler.uncaughtException(new Thread(new v0(i10), name), th);
                        return;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                }
                th.printStackTrace();
            }
        }
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        super.execute(new n2(runnable));
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.schedule(new n2(runnable), j10, timeUnit);
    }
}
