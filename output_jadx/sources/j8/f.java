package j8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends AtomicReference implements x7.h {

    /* renamed from: b, reason: collision with root package name */
    public final long f3329b;
    public final g c;
    public volatile boolean d;
    public volatile e8.g e;

    /* renamed from: f, reason: collision with root package name */
    public int f3330f;

    public f(g gVar, long j10) {
        this.f3329b = j10;
        this.c = gVar;
    }

    @Override // x7.h
    public final void a() {
        this.d = true;
        this.c.f();
    }

    @Override // x7.h
    public final void b(z7.a aVar) {
        if (c8.a.d(this, aVar) && (aVar instanceof e8.b)) {
            e8.b bVar = (e8.b) aVar;
            int h2 = bVar.h(7);
            if (h2 == 1) {
                this.f3330f = h2;
                this.e = bVar;
                this.d = true;
                this.c.f();
                return;
            }
            if (h2 == 2) {
                this.f3330f = h2;
                this.e = bVar;
            }
        }
    }

    @Override // x7.h
    public final void e(Object obj) {
        int i10 = this.f3330f;
        g gVar = this.c;
        if (i10 == 0) {
            if (gVar.get() == 0 && gVar.compareAndSet(0, 1)) {
                gVar.f3333b.e(obj);
                if (gVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                e8.g gVar2 = this.e;
                if (gVar2 == null) {
                    gVar2 = new l8.b(gVar.e);
                    this.e = gVar2;
                }
                gVar2.offer(obj);
                if (gVar.getAndIncrement() != 0) {
                    return;
                }
            }
            gVar.g();
            return;
        }
        gVar.f();
    }

    @Override // x7.h
    public final void onError(Throwable th) {
        p8.b bVar = this.c.f3336h;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            g gVar = this.c;
            gVar.getClass();
            gVar.d();
            this.d = true;
            this.c.f();
            return;
        }
        a.a.s(th);
    }
}
