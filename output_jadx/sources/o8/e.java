package o8;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends AtomicInteger implements e8.d {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4805b;
    public final x7.d c;

    public e(Object obj, x7.d dVar) {
        this.c = dVar;
        this.f4805b = obj;
    }

    @Override // n9.b
    public final void cancel() {
        lazySet(2);
    }

    @Override // e8.g
    public final void clear() {
        lazySet(1);
    }

    @Override // n9.b
    public final void d(long j10) {
        if (f.c(j10) && compareAndSet(0, 1)) {
            Object obj = this.f4805b;
            x7.d dVar = this.c;
            dVar.e(obj);
            if (get() != 2) {
                dVar.a();
            }
        }
    }

    @Override // e8.c
    public final int h(int i10) {
        return 1;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (get() != 0) {
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
        if (get() == 0) {
            lazySet(1);
            return this.f4805b;
        }
        return null;
    }
}
