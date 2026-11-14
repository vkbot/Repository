package m8;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends AtomicReference implements Callable, z7.a {
    public static final FutureTask d;
    public static final FutureTask e;

    /* renamed from: b, reason: collision with root package name */
    public final i8.p f3987b;
    public Thread c;

    static {
        b4.e eVar = d8.b.f1858b;
        d = new FutureTask(eVar, null);
        e = new FutureTask(eVar, null);
    }

    public l(i8.p pVar) {
        this.f3987b = pVar;
    }

    public final void a(Future future) {
        Future future2;
        boolean z9;
        do {
            future2 = (Future) get();
            if (future2 != d) {
                if (future2 == e) {
                    if (this.c != Thread.currentThread()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    future.cancel(z9);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = d;
        this.c = Thread.currentThread();
        try {
            this.f3987b.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.c = null;
        }
    }

    @Override // z7.a
    public final void dispose() {
        FutureTask futureTask;
        boolean z9;
        Future future = (Future) get();
        if (future != d && future != (futureTask = e) && compareAndSet(future, futureTask) && future != null) {
            if (this.c != Thread.currentThread()) {
                z9 = true;
            } else {
                z9 = false;
            }
            future.cancel(z9);
        }
    }
}
