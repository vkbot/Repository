package o7;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q1 implements Runnable {
    public static final Logger c = Logger.getLogger(q1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f4668b;

    public q1(Runnable runnable) {
        this.f4668b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f4668b;
        try {
            runnable.run();
        } catch (Throwable th) {
            c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = i4.g.f2776a;
            if (!(th instanceof RuntimeException)) {
                if (!(th instanceof Error)) {
                    j1.i.e(th);
                    return;
                }
                throw ((Error) th);
            }
            throw ((RuntimeException) th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f4668b + ")";
    }
}
