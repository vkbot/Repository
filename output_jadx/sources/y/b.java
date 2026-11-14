package y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6556a;

    /* renamed from: b, reason: collision with root package name */
    public final d f6557b;
    public volatile c c;
    public volatile c d;
    public int e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f6558f = 3;

    public b(Object obj, d dVar) {
        this.f6556a = obj;
        this.f6557b = dVar;
    }

    @Override // y.d, y.c
    public final boolean a() {
        boolean z9;
        synchronized (this.f6556a) {
            try {
                if (!this.c.a() && !this.d.a()) {
                    z9 = false;
                }
                z9 = true;
            } finally {
            }
        }
        return z9;
    }

    @Override // y.d
    public final void b(c cVar) {
        synchronized (this.f6556a) {
            try {
                if (!cVar.equals(this.d)) {
                    this.e = 5;
                    if (this.f6558f != 1) {
                        this.f6558f = 1;
                        this.d.i();
                    }
                    return;
                }
                this.f6558f = 5;
                d dVar = this.f6557b;
                if (dVar != null) {
                    dVar.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.d
    public final void c(c cVar) {
        synchronized (this.f6556a) {
            try {
                if (cVar.equals(this.c)) {
                    this.e = 4;
                } else if (cVar.equals(this.d)) {
                    this.f6558f = 4;
                }
                d dVar = this.f6557b;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.c
    public final void clear() {
        synchronized (this.f6556a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f6558f != 3) {
                    this.f6558f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.c
    public final void d() {
        synchronized (this.f6556a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.d();
                }
                if (this.f6558f == 1) {
                    this.f6558f = 2;
                    this.d.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.d
    public final boolean e(c cVar) {
        boolean z9;
        synchronized (this.f6556a) {
            d dVar = this.f6557b;
            if (dVar != null && !dVar.e(this)) {
                z9 = false;
            }
            z9 = true;
        }
        return z9;
    }

    @Override // y.d
    public final boolean f(c cVar) {
        boolean z9;
        synchronized (this.f6556a) {
            d dVar = this.f6557b;
            if ((dVar == null || dVar.f(this)) && cVar.equals(this.c)) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // y.d
    public final boolean g(c cVar) {
        boolean z9;
        boolean z10;
        int i10;
        synchronized (this.f6556a) {
            d dVar = this.f6557b;
            z9 = false;
            if (dVar == null || dVar.g(this)) {
                if (this.e != 5) {
                    z10 = cVar.equals(this.c);
                } else if (cVar.equals(this.d) && ((i10 = this.f6558f) == 4 || i10 == 5)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z9 = true;
                }
            }
        }
        return z9;
    }

    @Override // y.d
    public final d getRoot() {
        d dVar;
        synchronized (this.f6556a) {
            try {
                d dVar2 = this.f6557b;
                if (dVar2 != null) {
                    dVar = dVar2.getRoot();
                } else {
                    dVar = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // y.c
    public final boolean h() {
        boolean z9;
        synchronized (this.f6556a) {
            try {
                if (this.e == 3 && this.f6558f == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // y.c
    public final void i() {
        synchronized (this.f6556a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.c
    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6556a) {
            try {
                z9 = true;
                if (this.e != 1 && this.f6558f != 1) {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // y.c
    public final boolean j() {
        boolean z9;
        synchronized (this.f6556a) {
            try {
                if (this.e != 4 && this.f6558f != 4) {
                    z9 = false;
                }
                z9 = true;
            } finally {
            }
        }
        return z9;
    }

    @Override // y.c
    public final boolean k(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.c.k(bVar.c) && this.d.k(bVar.d)) {
                return true;
            }
        }
        return false;
    }
}
