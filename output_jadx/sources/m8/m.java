package m8;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends AtomicReferenceArray implements Runnable, Callable, z7.a {
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f3988f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f3989b;

    public m(Runnable runnable, c8.c cVar) {
        super(3);
        this.f3989b = runnable;
        lazySet(0, cVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f3988f) {
                if (obj == d) {
                    future.cancel(false);
                    return;
                } else if (obj == e) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // z7.a
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z9;
        while (true) {
            Object obj6 = get(1);
            obj = f3988f;
            if (obj6 == obj || obj6 == (obj4 = d) || obj6 == (obj5 = e)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z9);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = c) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((c8.c) obj2).b(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean compareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = e;
        Object obj5 = d;
        Object obj6 = c;
        Object obj7 = f3988f;
        lazySet(2, Thread.currentThread());
        try {
            this.f3989b.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((c8.c) obj2).b(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((c8.c) obj2).b(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
