package h8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m0 implements n9.a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f2693b;
    public final int c;

    public m0(AtomicReference atomicReference, int i10) {
        this.f2693b = atomicReference;
        this.c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0008, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(x7.d r8) {
        /*
            r7 = this;
            h8.n0 r0 = new h8.n0
            r0.<init>(r8)
            r8.f(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f2693b
            java.lang.Object r8 = r8.get()
            h8.o0 r8 = (h8.o0) r8
            if (r8 == 0) goto L1b
            boolean r1 = r8.d()
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r3 = r8
            goto L2d
        L1b:
            h8.o0 r1 = new h8.o0
            java.util.concurrent.atomic.AtomicReference r2 = r7.f2693b
            int r3 = r7.c
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference r2 = r7.f2693b
        L26:
            boolean r3 = r2.compareAndSet(r8, r1)
            if (r3 == 0) goto L67
            r3 = r1
        L2d:
            java.util.concurrent.atomic.AtomicReference r4 = r3.d
        L2f:
            java.lang.Object r8 = r4.get()
            r5 = r8
            h8.n0[] r5 = (h8.n0[]) r5
            h8.n0[] r8 = h8.o0.f2702k
            if (r5 != r8) goto L3b
            goto L8
        L3b:
            int r8 = r5.length
            int r1 = r8 + 1
            h8.n0[] r6 = new h8.n0[r1]
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r6, r1, r8)
            r6[r8] = r0
        L46:
            boolean r8 = r4.compareAndSet(r5, r6)
            if (r8 == 0) goto L60
            long r1 = r0.get()
            r4 = -9223372036854775808
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 != 0) goto L5a
            r3.h(r0)
            goto L5c
        L5a:
            r0.c = r3
        L5c:
            r3.c()
            return
        L60:
            java.lang.Object r8 = r4.get()
            if (r8 == r5) goto L46
            goto L2f
        L67:
            java.lang.Object r3 = r2.get()
            if (r3 == r8) goto L26
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.m0.a(x7.d):void");
    }
}
