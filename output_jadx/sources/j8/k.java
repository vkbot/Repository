package j8;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends AtomicInteger implements e8.b, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final x7.h f3348b;
    public final Object c;

    public k(x7.h hVar, Object obj) {
        this.f3348b = hVar;
        this.c = obj;
    }

    @Override // e8.g
    public final void clear() {
        lazySet(3);
    }

    @Override // z7.a
    public final void dispose() {
        set(3);
    }

    @Override // e8.c
    public final int h(int i10) {
        lazySet(1);
        return 1;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (get() != 1) {
            return true;
        }
        return false;
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // e8.g
    public final Object poll() {
        if (get() == 1) {
            lazySet(3);
            return this.c;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.c;
            x7.h hVar = this.f3348b;
            hVar.e(obj);
            if (get() == 2) {
                lazySet(3);
                hVar.a();
            }
        }
    }
}
