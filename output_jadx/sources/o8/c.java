package o8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f4803b;
    public Object c;

    public c(x7.d dVar) {
        this.f4803b = dVar;
    }

    public void c(Object obj) {
        i(obj);
    }

    @Override // e8.g
    public final void clear() {
        lazySet(32);
        this.c = null;
    }

    @Override // n9.b
    public final void d(long j10) {
        Object obj;
        if (!f.c(j10)) {
            return;
        }
        do {
            int i10 = get();
            if ((i10 & (-2)) == 0) {
                if (i10 == 1) {
                    if (compareAndSet(1, 3) && (obj = this.c) != null) {
                        this.c = null;
                        x7.d dVar = this.f4803b;
                        dVar.e(obj);
                        if (get() != 4) {
                            dVar.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    @Override // e8.c
    public final int h(int i10) {
        lazySet(8);
        return 2;
    }

    public final void i(Object obj) {
        int i10 = get();
        do {
            x7.d dVar = this.f4803b;
            if (i10 == 8) {
                this.c = obj;
                lazySet(16);
                dVar.e(obj);
                if (get() != 4) {
                    dVar.a();
                    return;
                }
                return;
            }
            if ((i10 & (-3)) == 0) {
                if (i10 == 2) {
                    lazySet(3);
                    dVar.e(obj);
                    if (get() != 4) {
                        dVar.a();
                        return;
                    }
                    return;
                }
                this.c = obj;
                if (compareAndSet(0, 1)) {
                    return;
                } else {
                    i10 = get();
                }
            } else {
                return;
            }
        } while (i10 != 4);
        this.c = null;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // e8.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.c;
        this.c = null;
        return obj;
    }
}
