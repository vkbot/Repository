package j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c0 implements d0, d0.e {

    /* renamed from: f, reason: collision with root package name */
    public static final d0.d f2975f = d0.g.a(20, new z3.f(11));

    /* renamed from: b, reason: collision with root package name */
    public final d0.h f2976b = new Object();
    public d0 c;
    public boolean d;
    public boolean e;

    public final synchronized void a() {
        this.f2976b.a();
        if (this.d) {
            this.d = false;
            if (this.e) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // j.d0
    public final int b() {
        return this.c.b();
    }

    @Override // d0.e
    public final d0.h c() {
        return this.f2976b;
    }

    @Override // j.d0
    public final Class d() {
        return this.c.d();
    }

    @Override // j.d0
    public final Object get() {
        return this.c.get();
    }

    @Override // j.d0
    public final synchronized void recycle() {
        this.f2976b.a();
        this.e = true;
        if (!this.d) {
            this.c.recycle();
            this.c = null;
            f2975f.release(this);
        }
    }
}
