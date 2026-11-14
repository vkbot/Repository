package h8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o0 extends AtomicInteger implements x7.d, z7.a {

    /* renamed from: j, reason: collision with root package name */
    public static final n0[] f2701j = new n0[0];

    /* renamed from: k, reason: collision with root package name */
    public static final n0[] f2702k = new n0[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f2703b;
    public final int c;

    /* renamed from: g, reason: collision with root package name */
    public volatile Serializable f2705g;

    /* renamed from: h, reason: collision with root package name */
    public int f2706h;

    /* renamed from: i, reason: collision with root package name */
    public volatile e8.g f2707i;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f2704f = new AtomicReference();
    public final AtomicReference d = new AtomicReference(f2701j);
    public final AtomicBoolean e = new AtomicBoolean();

    public o0(AtomicReference atomicReference, int i10) {
        this.f2703b = atomicReference;
        this.c = i10;
    }

    @Override // x7.d
    public final void a() {
        if (this.f2705g == null) {
            this.f2705g = p8.f.f5116b;
            c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r8 = (h8.n0[]) r3.getAndSet(r2);
        r9 = r8.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 >= r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r8[r0].f2698b.a();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r9 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5.compareAndSet(r7, null) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r5.get() == r7) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Object r8, boolean r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L5d
            p8.f r1 = p8.f.f5116b
            h8.n0[] r2 = h8.o0.f2702k
            java.util.concurrent.atomic.AtomicReference r3 = r7.d
            r4 = 0
            java.util.concurrent.atomic.AtomicReference r5 = r7.f2703b
            r6 = 1
            if (r8 != r1) goto L32
            if (r9 == 0) goto L5d
        L11:
            boolean r8 = r5.compareAndSet(r7, r4)
            if (r8 == 0) goto L18
            goto L1e
        L18:
            java.lang.Object r8 = r5.get()
            if (r8 == r7) goto L11
        L1e:
            java.lang.Object r8 = r3.getAndSet(r2)
            h8.n0[] r8 = (h8.n0[]) r8
            int r9 = r8.length
        L25:
            if (r0 >= r9) goto L31
            r1 = r8[r0]
            x7.d r1 = r1.f2698b
            r1.a()
            int r0 = r0 + 1
            goto L25
        L31:
            return r6
        L32:
            p8.e r8 = (p8.e) r8
            java.lang.Throwable r8 = r8.f5115b
        L36:
            boolean r9 = r5.compareAndSet(r7, r4)
            if (r9 == 0) goto L3d
            goto L43
        L3d:
            java.lang.Object r9 = r5.get()
            if (r9 == r7) goto L36
        L43:
            java.lang.Object r9 = r3.getAndSet(r2)
            h8.n0[] r9 = (h8.n0[]) r9
            int r1 = r9.length
            if (r1 == 0) goto L59
            int r1 = r9.length
        L4d:
            if (r0 >= r1) goto L5c
            r2 = r9[r0]
            x7.d r2 = r2.f2698b
            r2.onError(r8)
            int r0 = r0 + 1
            goto L4d
        L59:
            a.a.s(r8)
        L5c:
            return r6
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.o0.b(java.lang.Object, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        r4 = r0;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        if (r8 == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.o0.c():void");
    }

    public final boolean d() {
        if (this.d.get() == f2702k) {
            return true;
        }
        return false;
    }

    @Override // z7.a
    public final void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.d;
        Object obj = atomicReference2.get();
        Object obj2 = f2702k;
        if (obj == obj2 || ((n0[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.f2703b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        o8.f.a(this.f2704f);
    }

    @Override // x7.d
    public final void e(Object obj) {
        if (this.f2706h == 0 && !this.f2707i.offer(obj)) {
            onError(new RuntimeException("Prefetch queue is full?!"));
        } else {
            c();
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.b(this.f2704f, bVar)) {
            if (bVar instanceof e8.d) {
                e8.d dVar = (e8.d) bVar;
                int h2 = dVar.h(3);
                if (h2 == 1) {
                    this.f2706h = h2;
                    this.f2707i = dVar;
                    this.f2705g = p8.f.f5116b;
                    c();
                    return;
                }
                if (h2 == 2) {
                    this.f2706h = h2;
                    this.f2707i = dVar;
                    bVar.d(this.c);
                    return;
                }
            }
            this.f2707i = new l8.a(this.c);
            bVar.d(this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(n0 n0Var) {
        n0[] n0VarArr;
        while (true) {
            AtomicReference atomicReference = this.d;
            n0[] n0VarArr2 = (n0[]) atomicReference.get();
            int length = n0VarArr2.length;
            if (length != 0) {
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (n0VarArr2[i10].equals(n0Var)) {
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
                        n0VarArr = f2701j;
                    } else {
                        n0[] n0VarArr3 = new n0[length - 1];
                        System.arraycopy(n0VarArr2, 0, n0VarArr3, 0, i10);
                        System.arraycopy(n0VarArr2, i10 + 1, n0VarArr3, i10, (length - i10) - 1);
                        n0VarArr = n0VarArr3;
                    }
                    while (!atomicReference.compareAndSet(n0VarArr2, n0VarArr)) {
                        if (atomicReference.get() != n0VarArr2) {
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

    @Override // x7.d
    public final void onError(Throwable th) {
        if (this.f2705g == null) {
            this.f2705g = new p8.e(th);
            c();
        } else {
            a.a.s(th);
        }
    }
}
