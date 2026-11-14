package h8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z extends AtomicInteger implements x7.d, n9.b {

    /* renamed from: b, reason: collision with root package name */
    public final x7.d f2734b;
    public final int c;

    /* renamed from: h, reason: collision with root package name */
    public final b8.c f2737h;

    /* renamed from: j, reason: collision with root package name */
    public n9.b f2739j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f2740k;
    public final AtomicLong d = new AtomicLong();
    public final c8.c e = new c8.c(1);

    /* renamed from: g, reason: collision with root package name */
    public final p8.b f2736g = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f2735f = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f2738i = new AtomicReference();

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.atomic.AtomicReference, p8.b] */
    public z(x7.d dVar, b8.c cVar, int i10) {
        this.f2734b = dVar;
        this.f2737h = cVar;
        this.c = i10;
    }

    @Override // x7.d
    public final void a() {
        this.f2735f.decrementAndGet();
        c();
    }

    public final void b() {
        l8.b bVar = (l8.b) this.f2738i.get();
        if (bVar != null) {
            bVar.clear();
        }
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // n9.b
    public final void cancel() {
        this.f2740k = true;
        this.f2739j.cancel();
        this.e.dispose();
    }

    @Override // n9.b
    public final void d(long j10) {
        if (o8.f.c(j10)) {
            e3.d.a(this.d, j10);
            c();
        }
    }

    @Override // x7.d
    public final void e(Object obj) {
        try {
            Object apply = this.f2737h.apply(obj);
            d8.b.a(apply, "The mapper returned a null MaybeSource");
            x7.e eVar = (x7.e) apply;
            this.f2735f.getAndIncrement();
            i8.b bVar = new i8.b(this);
            if (!this.f2740k && this.e.a(bVar)) {
                eVar.c(bVar);
            }
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            this.f2739j.cancel();
            onError(th);
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.f2739j, bVar)) {
            this.f2739j = bVar;
            this.f2734b.f(this);
            int i10 = this.c;
            if (i10 == Integer.MAX_VALUE) {
                bVar.d(Long.MAX_VALUE);
            } else {
                bVar.d(i10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r10 != r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r17.f2740k == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (((java.lang.Throwable) r17.f2736g.get()) == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r2.get() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        r7 = (l8.b) r3.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (r7.isEmpty() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        r2 = r17.f2736g;
        r2.getClass();
        r2 = p8.d.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r2 = r17.f2736g;
        r2.getClass();
        r2 = p8.d.b(r2);
        b();
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007f, code lost:
    
        b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        if (r10 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        e3.d.p(r17.d, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        if (r17.c == Integer.MAX_VALUE) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
    
        r17.f2739j.d(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        r5 = addAndGet(-r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.z.h():void");
    }

    public final l8.b i() {
        while (true) {
            AtomicReference atomicReference = this.f2738i;
            l8.b bVar = (l8.b) atomicReference.get();
            if (bVar != null) {
                return bVar;
            }
            l8.b bVar2 = new l8.b(x7.b.f6507b);
            while (!atomicReference.compareAndSet(null, bVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return bVar2;
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        this.f2735f.decrementAndGet();
        p8.b bVar = this.f2736g;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            this.e.dispose();
            c();
        } else {
            a.a.s(th);
        }
    }
}
