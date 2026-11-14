package u7;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends ConcurrentLinkedQueue implements Executor {
    public static final Logger c = Logger.getLogger(c.class.getName());
    public static final Object d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5902b;

    public final void a() {
        if (!Thread.interrupted()) {
            Runnable runnable = (Runnable) poll();
            if (runnable == null) {
                this.f5902b = Thread.currentThread();
                do {
                    try {
                        Runnable runnable2 = (Runnable) poll();
                        if (runnable2 == null) {
                            LockSupport.park(this);
                        } else {
                            this.f5902b = null;
                            runnable = runnable2;
                        }
                    } catch (Throwable th) {
                        this.f5902b = null;
                        throw th;
                    }
                } while (!Thread.interrupted());
                throw new InterruptedException();
            }
            do {
                try {
                    runnable.run();
                } catch (Throwable th2) {
                    c.log(Level.WARNING, "Runnable threw exception", th2);
                }
                runnable = (Runnable) poll();
            } while (runnable != null);
            return;
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        add(runnable);
        Object obj = this.f5902b;
        if (obj != d) {
            LockSupport.unpark((Thread) obj);
        } else if (remove(runnable) && e.f5905b) {
            throw new RejectedExecutionException();
        }
    }

    public final void shutdown() {
        this.f5902b = d;
        while (true) {
            Runnable runnable = (Runnable) poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    c.log(Level.WARNING, "Runnable threw exception", th);
                }
            } else {
                return;
            }
        }
    }
}
