package j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3080b;
    public final boolean c;
    public final d0 d;
    public final r e;

    /* renamed from: f, reason: collision with root package name */
    public final h.e f3081f;

    /* renamed from: g, reason: collision with root package name */
    public int f3082g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3083h;

    public x(d0 d0Var, boolean z9, boolean z10, h.e eVar, r rVar) {
        c0.g.c(d0Var, "Argument must not be null");
        this.d = d0Var;
        this.f3080b = z9;
        this.c = z10;
        this.f3081f = eVar;
        c0.g.c(rVar, "Argument must not be null");
        this.e = rVar;
    }

    public final synchronized void a() {
        if (!this.f3083h) {
            this.f3082g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // j.d0
    public final int b() {
        return this.d.b();
    }

    public final void c() {
        boolean z9;
        synchronized (this) {
            int i10 = this.f3082g;
            if (i10 > 0) {
                z9 = true;
                int i11 = i10 - 1;
                this.f3082g = i11;
                if (i11 != 0) {
                    z9 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z9) {
            this.e.e(this.f3081f, this);
        }
    }

    @Override // j.d0
    public final Class d() {
        return this.d.d();
    }

    @Override // j.d0
    public final Object get() {
        return this.d.get();
    }

    @Override // j.d0
    public final synchronized void recycle() {
        if (this.f3082g <= 0) {
            if (!this.f3083h) {
                this.f3083h = true;
                if (this.c) {
                    this.d.recycle();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3080b + ", listener=" + this.e + ", key=" + this.f3081f + ", acquired=" + this.f3082g + ", isRecycled=" + this.f3083h + ", resource=" + this.d + '}';
    }
}
