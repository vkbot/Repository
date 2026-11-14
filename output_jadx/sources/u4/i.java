package u4;

import d2.o;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f5880g = Logger.getLogger(i.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5881b;
    public final ArrayDeque c = new ArrayDeque();
    public int d = 1;
    public long e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final a9.i f5882f = new a9.i(this);

    public i(Executor executor) {
        r2.a.b(executor);
        this.f5881b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        r2.a.b(runnable);
        synchronized (this.c) {
            int i10 = this.d;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.e;
                o oVar = new o(runnable, 2);
                this.c.add(oVar);
                this.d = 2;
                try {
                    this.f5881b.execute(this.f5882f);
                    if (this.d == 2) {
                        synchronized (this.c) {
                            try {
                                if (this.e == j10 && this.d == 2) {
                                    this.d = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.c) {
                        try {
                            int i11 = this.d;
                            boolean z9 = true;
                            if ((i11 != 1 && i11 != 2) || !this.c.removeLastOccurrence(oVar)) {
                                z9 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z9) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.c.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f5881b + "}";
    }
}
