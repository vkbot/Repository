package i8;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends AtomicInteger implements x7.f, e8.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.h f2858b;
    public Object c;
    public z7.a d;

    public t(x7.h hVar) {
        this.f2858b = hVar;
    }

    @Override // x7.f
    public final void a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f2858b.a();
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        if (c8.a.e(this.d, aVar)) {
            this.d = aVar;
            this.f2858b.b(this);
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        int i10 = get();
        if ((i10 & 54) == 0) {
            x7.h hVar = this.f2858b;
            if (i10 == 8) {
                this.c = obj;
                lazySet(16);
                hVar.e(null);
            } else {
                lazySet(2);
                hVar.e(obj);
            }
            if (get() != 4) {
                hVar.a();
            }
        }
    }

    @Override // e8.g
    public final void clear() {
        lazySet(32);
        this.c = null;
    }

    @Override // z7.a
    public final void dispose() {
        set(4);
        this.c = null;
        this.d.dispose();
    }

    @Override // e8.c
    public final int h(int i10) {
        lazySet(8);
        return 2;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        if ((get() & 54) != 0) {
            a.a.s(th);
        } else {
            lazySet(2);
            this.f2858b.onError(th);
        }
    }

    @Override // e8.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.c;
        this.c = null;
        lazySet(32);
        return obj;
    }
}
