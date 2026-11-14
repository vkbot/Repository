package h8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 extends o8.a implements x7.d {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2636b;
    public final b8.c c;
    public final int d;
    public final int e;

    /* renamed from: g, reason: collision with root package name */
    public n9.b f2638g;

    /* renamed from: h, reason: collision with root package name */
    public e8.g f2639h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f2640i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f2641j;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f2643l;

    /* renamed from: m, reason: collision with root package name */
    public int f2644m;

    /* renamed from: n, reason: collision with root package name */
    public int f2645n;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f2642k = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f2637f = new AtomicLong();

    public b0(x7.d dVar, c5.e eVar, int i10) {
        this.f2636b = dVar;
        this.c = eVar;
        this.d = i10;
        this.e = i10 - (i10 >> 2);
    }

    @Override // x7.d
    public final void a() {
        if (this.f2640i) {
            return;
        }
        this.f2640i = true;
        j();
    }

    @Override // n9.b
    public final void cancel() {
        if (!this.f2641j) {
            this.f2641j = true;
            this.f2638g.cancel();
            if (getAndIncrement() == 0) {
                this.f2639h.clear();
            }
        }
    }

    @Override // e8.g
    public final void clear() {
        this.f2643l = null;
        this.f2639h.clear();
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10)) {
            e3.d.a(this.f2637f, j10);
            j();
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.f2640i) {
            return;
        }
        if (this.f2645n == 0 && !this.f2639h.offer(obj)) {
            onError(new RuntimeException("Queue is full?!"));
        } else {
            j();
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.f2638g, bVar)) {
            this.f2638g = bVar;
            if (bVar instanceof e8.d) {
                e8.d dVar = (e8.d) bVar;
                int h2 = dVar.h(3);
                if (h2 == 1) {
                    this.f2645n = h2;
                    this.f2639h = dVar;
                    this.f2640i = true;
                    this.f2636b.f(this);
                    return;
                }
                if (h2 == 2) {
                    this.f2645n = h2;
                    this.f2639h = dVar;
                    this.f2636b.f(this);
                    bVar.d(this.d);
                    return;
                }
            }
            this.f2639h = new l8.a(this.d);
            this.f2636b.f(this);
            bVar.d(this.d);
        }
    }

    @Override // e8.c
    public final int h(int i10) {
        if (this.f2645n == 1) {
            return 1;
        }
        return 0;
    }

    public final boolean i(boolean z9, boolean z10, x7.d dVar, e8.g gVar) {
        if (this.f2641j) {
            this.f2643l = null;
            gVar.clear();
            return true;
        }
        if (z9) {
            if (((Throwable) this.f2642k.get()) != null) {
                Throwable b10 = p8.d.b(this.f2642k);
                this.f2643l = null;
                gVar.clear();
                dVar.onError(b10);
                return true;
            }
            if (z10) {
                dVar.a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (this.f2643l == null && this.f2639h.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        if (r6 == null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.b0.j():void");
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        if (!this.f2640i && p8.d.a(this.f2642k, th)) {
            this.f2640i = true;
            j();
        } else {
            a.a.s(th);
        }
    }

    @Override // e8.g
    public final Object poll() {
        Iterator it = this.f2643l;
        while (true) {
            if (it == null) {
                Object poll = this.f2639h.poll();
                if (poll == null) {
                    return null;
                }
                it = ((Iterable) this.c.apply(poll)).iterator();
                if (!it.hasNext()) {
                    it = null;
                } else {
                    this.f2643l = it;
                    break;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        d8.b.a(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.f2643l = null;
        }
        return next;
    }
}
