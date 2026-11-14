package n7;

import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k1 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f4222b;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicReference d = new AtomicReference();

    public k1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4222b = uncaughtExceptionHandler;
    }

    public final void a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        do {
            Thread currentThread = Thread.currentThread();
            do {
                atomicReference = this.d;
                if (atomicReference.compareAndSet(null, currentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.f4222b.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        o4.b.i(runnable, "runnable is null");
        this.c.add(runnable);
    }

    public final l.d c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        j1 j1Var = new j1(runnable);
        return new l.d(j1Var, scheduledExecutorService.schedule(new c3.e(this, j1Var, runnable, 1), j10, timeUnit));
    }

    public final void d() {
        boolean z9;
        if (Thread.currentThread() == this.d.get()) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
