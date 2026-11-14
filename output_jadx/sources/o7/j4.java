package o7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j4 implements Executor {
    public static final Logger d = Logger.getLogger(j4.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public boolean f4564b;
    public ArrayDeque c;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    d.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                }
            } else {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o4.b.i(runnable, "'task' must not be null.");
        if (!this.f4564b) {
            this.f4564b = true;
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                try {
                    d.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                    if (this.c != null) {
                        a();
                    }
                    this.f4564b = false;
                    return;
                } finally {
                    if (this.c != null) {
                        a();
                    }
                    this.f4564b = false;
                }
            }
        }
        if (this.c == null) {
            this.c = new ArrayDeque(4);
        }
        this.c.add(runnable);
    }
}
