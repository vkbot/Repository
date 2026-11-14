package o7;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m4 implements Executor, Runnable {
    public static final Logger e = Logger.getLogger(m4.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final p4 f4617f;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4618b;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public volatile int d = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [o7.p4] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r1;
        try {
            r1 = new k4(AtomicIntegerFieldUpdater.newUpdater(m4.class, "d"));
        } catch (Throwable th) {
            e.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            r1 = new Object();
        }
        f4617f = r1;
    }

    public m4(Executor executor) {
        o4.b.i(executor, "'executor' must not be null.");
        this.f4618b = executor;
    }

    public final void a(Runnable runnable) {
        p4 p4Var = f4617f;
        if (p4Var.p(this)) {
            try {
                this.f4618b.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.c.remove(runnable);
                }
                p4Var.q(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o4.b.i(runnable, "'r' must not be null.");
        this.c.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4 p4Var = f4617f;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e6) {
                    e.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e6);
                }
            } catch (Throwable th) {
                p4Var.q(this);
                throw th;
            }
        }
        p4Var.q(this);
        if (!concurrentLinkedQueue.isEmpty()) {
            a(null);
        }
    }
}
