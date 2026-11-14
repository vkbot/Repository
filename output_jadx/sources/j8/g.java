package j8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends AtomicInteger implements z7.a, x7.h {

    /* renamed from: p, reason: collision with root package name */
    public static final f[] f3331p = new f[0];

    /* renamed from: q, reason: collision with root package name */
    public static final f[] f3332q = new f[0];

    /* renamed from: b, reason: collision with root package name */
    public final x7.h f3333b;
    public final e0.g c;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public volatile e8.f f3334f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f3335g;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f3337i;

    /* renamed from: k, reason: collision with root package name */
    public z7.a f3339k;

    /* renamed from: l, reason: collision with root package name */
    public long f3340l;

    /* renamed from: m, reason: collision with root package name */
    public long f3341m;

    /* renamed from: n, reason: collision with root package name */
    public int f3342n;

    /* renamed from: o, reason: collision with root package name */
    public int f3343o;

    /* renamed from: h, reason: collision with root package name */
    public final p8.b f3336h = new AtomicReference();
    public final int d = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f3338j = new AtomicReference(f3331p);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicReference, p8.b] */
    public g(x7.h hVar, e0.g gVar, int i10) {
        this.f3333b = hVar;
        this.c = gVar;
        this.e = i10;
    }

    @Override // x7.h
    public final void a() {
        if (this.f3335g) {
            return;
        }
        this.f3335g = true;
        f();
    }

    @Override // x7.h
    public final void b(z7.a aVar) {
        if (c8.a.e(this.f3339k, aVar)) {
            this.f3339k = aVar;
            this.f3333b.b(this);
        }
    }

    public final boolean c() {
        if (!this.f3337i) {
            if (((Throwable) this.f3336h.get()) != null) {
                d();
                p8.b bVar = this.f3336h;
                bVar.getClass();
                Throwable b10 = p8.d.b(bVar);
                if (b10 != p8.d.f5114a) {
                    this.f3333b.onError(b10);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        f[] fVarArr;
        this.f3339k.dispose();
        AtomicReference atomicReference = this.f3338j;
        f[] fVarArr2 = (f[]) atomicReference.get();
        f[] fVarArr3 = f3332q;
        if (fVarArr2 == fVarArr3 || (fVarArr = (f[]) atomicReference.getAndSet(fVarArr3)) == fVarArr3) {
            return false;
        }
        for (f fVar : fVarArr) {
            fVar.getClass();
            c8.a.a(fVar);
        }
        return true;
    }

    @Override // z7.a
    public final void dispose() {
        if (!this.f3337i) {
            this.f3337i = true;
            if (d()) {
                p8.b bVar = this.f3336h;
                bVar.getClass();
                Throwable b10 = p8.d.b(bVar);
                if (b10 != null && b10 != p8.d.f5114a) {
                    a.a.s(b10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (decrementAndGet() == 0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.g.e(java.lang.Object):void");
    }

    public final void f() {
        if (getAndIncrement() == 0) {
            g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.g.g():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(f fVar) {
        f[] fVarArr;
        while (true) {
            AtomicReference atomicReference = this.f3338j;
            f[] fVarArr2 = (f[]) atomicReference.get();
            int length = fVarArr2.length;
            if (length != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (fVarArr2[i10] == fVar) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    if (length == 1) {
                        fVarArr = f3331p;
                    } else {
                        f[] fVarArr3 = new f[length - 1];
                        System.arraycopy(fVarArr2, 0, fVarArr3, 0, i10);
                        System.arraycopy(fVarArr2, i10 + 1, fVarArr3, i10, (length - i10) - 1);
                        fVarArr = fVarArr3;
                    }
                    while (!atomicReference.compareAndSet(fVarArr2, fVarArr)) {
                        if (atomicReference.get() != fVarArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // x7.h
    public final void onError(Throwable th) {
        if (this.f3335g) {
            a.a.s(th);
            return;
        }
        p8.b bVar = this.f3336h;
        bVar.getClass();
        if (p8.d.a(bVar, th)) {
            this.f3335g = true;
            f();
        } else {
            a.a.s(th);
        }
    }
}
