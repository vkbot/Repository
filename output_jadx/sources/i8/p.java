package i8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends AtomicReference implements x7.f, z7.a, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final x7.f f2856b;
    public final x7.k c;
    public Object d;
    public Throwable e;

    public p(x7.f fVar, x7.k kVar) {
        this.f2856b = fVar;
        this.c = kVar;
    }

    @Override // x7.f
    public final void a() {
        c8.a.c(this, this.c.b(this));
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        if (c8.a.d(this, aVar)) {
            this.f2856b.b(this);
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        this.d = obj;
        c8.a.c(this, this.c.b(this));
    }

    @Override // z7.a
    public final void dispose() {
        c8.a.a(this);
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        this.e = th;
        c8.a.c(this, this.c.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.e;
        x7.f fVar = this.f2856b;
        if (th != null) {
            this.e = null;
            fVar.onError(th);
            return;
        }
        Object obj = this.d;
        if (obj != null) {
            this.d = null;
            fVar.c(obj);
        } else {
            fVar.a();
        }
    }
}
