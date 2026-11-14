package h8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b extends AtomicInteger implements x7.d, n9.b {
    public final b8.c c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public n9.b f2628f;

    /* renamed from: g, reason: collision with root package name */
    public int f2629g;

    /* renamed from: h, reason: collision with root package name */
    public e8.g f2630h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f2631i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f2632j;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f2634l;

    /* renamed from: m, reason: collision with root package name */
    public int f2635m;

    /* renamed from: b, reason: collision with root package name */
    public final e f2627b = new e(this);

    /* renamed from: k, reason: collision with root package name */
    public final p8.b f2633k = new AtomicReference();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.atomic.AtomicReference, p8.b] */
    public b(b8.c cVar, int i10) {
        this.c = cVar;
        this.d = i10;
        this.e = i10;
    }

    @Override // x7.d
    public final void a() {
        this.f2631i = true;
        b();
    }

    public abstract void b();

    public abstract void c(Throwable th);

    @Override // x7.d
    public final void e(Object obj) {
        if (this.f2635m != 2 && !this.f2630h.offer(obj)) {
            this.f2628f.cancel();
            onError(new IllegalStateException("Queue full?!"));
        } else {
            b();
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.f2628f, bVar)) {
            this.f2628f = bVar;
            if (bVar instanceof e8.d) {
                e8.d dVar = (e8.d) bVar;
                int h2 = dVar.h(3);
                if (h2 == 1) {
                    this.f2635m = h2;
                    this.f2630h = dVar;
                    this.f2631i = true;
                    i();
                    b();
                    return;
                }
                if (h2 == 2) {
                    this.f2635m = h2;
                    this.f2630h = dVar;
                    i();
                    bVar.d(this.d);
                    return;
                }
            }
            this.f2630h = new l8.a(this.d);
            i();
            bVar.d(this.d);
        }
    }

    public abstract void h(Object obj);

    public abstract void i();
}
