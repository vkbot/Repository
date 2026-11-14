package y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final d f6579a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6580b;
    public volatile f c;
    public volatile c d;
    public int e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f6581f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6582g;

    public g(Object obj, d dVar) {
        this.f6580b = obj;
        this.f6579a = dVar;
    }

    @Override // y.d, y.c
    public final boolean a() {
        boolean z9;
        synchronized (this.f6580b) {
            try {
                if (!this.d.a() && !this.c.a()) {
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
        synchronized (this.f6580b) {
            try {
                if (!cVar.equals(this.c)) {
                    this.f6581f = 5;
                    return;
                }
                this.e = 5;
                d dVar = this.f6579a;
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
        synchronized (this.f6580b) {
            try {
                if (cVar.equals(this.d)) {
                    this.f6581f = 4;
                    return;
                }
                this.e = 4;
                d dVar = this.f6579a;
                if (dVar != null) {
                    dVar.c(this);
                }
                if (!kotlin.collections.unsigned.a.a(this.f6581f)) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.c
    public final void clear() {
        synchronized (this.f6580b) {
            this.f6582g = false;
            this.e = 3;
            this.f6581f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // y.c
    public final void d() {
        synchronized (this.f6580b) {
            try {
                if (!kotlin.collections.unsigned.a.a(this.f6581f)) {
                    this.f6581f = 2;
                    this.d.d();
                }
                if (!kotlin.collections.unsigned.a.a(this.e)) {
                    this.e = 2;
                    this.c.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.d
    public final boolean e(c cVar) {
        boolean z9;
        synchronized (this.f6580b) {
            try {
                d dVar = this.f6579a;
                if ((dVar != null && !dVar.e(this)) || (!cVar.equals(this.c) && this.e == 4)) {
                    z9 = false;
                }
                z9 = true;
            } finally {
            }
        }
        return z9;
    }

    @Override // y.d
    public final boolean f(c cVar) {
        boolean z9;
        synchronized (this.f6580b) {
            try {
                d dVar = this.f6579a;
                if ((dVar == null || dVar.f(this)) && cVar.equals(this.c) && this.e != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // y.d
    public final boolean g(c cVar) {
        boolean z9;
        synchronized (this.f6580b) {
            try {
                d dVar = this.f6579a;
                if ((dVar == null || dVar.g(this)) && cVar.equals(this.c) && !a()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    @Override // y.d
    public final d getRoot() {
        d dVar;
        synchronized (this.f6580b) {
            try {
                d dVar2 = this.f6579a;
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
        synchronized (this.f6580b) {
            if (this.e == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // y.c
    public final void i() {
        synchronized (this.f6580b) {
            try {
                this.f6582g = true;
                try {
                    if (this.e != 4 && this.f6581f != 1) {
                        this.f6581f = 1;
                        this.d.i();
                    }
                    if (this.f6582g && this.e != 1) {
                        this.e = 1;
                        this.c.i();
                    }
                    this.f6582g = false;
                } catch (Throwable th) {
                    this.f6582g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y.c
    public final boolean isRunning() {
        boolean z9;
        synchronized (this.f6580b) {
            z9 = true;
            if (this.e != 1) {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // y.c
    public final boolean j() {
        boolean z9;
        synchronized (this.f6580b) {
            if (this.e == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override // y.c
    public final boolean k(c cVar) {
        if (cVar instanceof g) {
            g gVar = (g) cVar;
            if (this.c == null) {
                if (gVar.c != null) {
                    return false;
                }
            } else if (!this.c.k(gVar.c)) {
                return false;
            }
            if (this.d == null) {
                if (gVar.d == null) {
                    return true;
                }
                return false;
            }
            if (this.d.k(gVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
