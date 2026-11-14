package j6;

import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r5.c f3313a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f3313a = new r5.c(19, h6.a.f2594o);
                return;
            case 2:
                this.f3313a = new r5.c(19, h6.a.f2591l);
                return;
            default:
                this.f3313a = new r5.c(19, h6.a.f2592m);
                return;
        }
    }

    public void a(int i10, int i11, int i12, int i13, byte[] bArr) {
        int i14;
        int i15 = i11 + i12;
        if (i13 == 0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        int[] iArr = new int[i15 / i14];
        for (int i16 = 0; i16 < i15; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i14] = bArr[i16 + i10] & UByte.MAX_VALUE;
            }
        }
        try {
            this.f3313a.f(iArr, i12 / i14);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i14];
                }
            }
        } catch (h6.c unused) {
            throw z5.c.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x033a, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038d A[LOOP:21: B:142:0x0220->B:174:0x038d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x035d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f6.d b(com.bumptech.glide.manager.s r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.b(com.bumptech.glide.manager.s, java.util.Map):f6.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0687, code lost:
    
        if (r3.length() <= 0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0689, code lost:
    
        r2.append((java.lang.CharSequence) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x068c, code lost:
    
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0697, code lost:
    
        if (r4.isEmpty() == false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0699, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x069d, code lost:
    
        return new f6.d(r0, r2, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x039e, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:148:0x038e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[LOOP:15: B:113:0x0359->B:146:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f6.d c(f6.b r25) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.c(f6.b):f6.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: c | e -> 0x0052, TryCatch #0 {c | e -> 0x0052, blocks: (B:10:0x0011, B:11:0x0026, B:13:0x002a, B:14:0x002d, B:16:0x0031, B:18:0x003b, B:20:0x0041, B:25:0x0046), top: B:9:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f6.d d(f6.b r9, java.util.Map r10) {
        /*
            r8 = this;
            com.bumptech.glide.manager.s r0 = new com.bumptech.glide.manager.s
            r0.<init>(r9)
            r9 = 0
            f6.d r9 = r8.b(r0, r10)     // Catch: z5.c -> Lb z5.e -> Lf
            return r9
        Lb:
            r1 = move-exception
            r2 = r1
            r1 = r9
            goto L11
        Lf:
            r1 = move-exception
            r2 = r9
        L11:
            r0.j()     // Catch: java.lang.Throwable -> L52
            r0.d = r9     // Catch: java.lang.Throwable -> L52
            r0.e = r9     // Catch: java.lang.Throwable -> L52
            r9 = 1
            r0.f675b = r9     // Catch: java.lang.Throwable -> L52
            r0.i()     // Catch: java.lang.Throwable -> L52
            r0.h()     // Catch: java.lang.Throwable -> L52
            java.lang.Object r9 = r0.c     // Catch: java.lang.Throwable -> L52
            f6.b r9 = (f6.b) r9     // Catch: java.lang.Throwable -> L52
            r3 = 0
        L26:
            int r4 = r9.f2343b     // Catch: java.lang.Throwable -> L52
            if (r3 >= r4) goto L46
            int r4 = r3 + 1
            r5 = r4
        L2d:
            int r6 = r9.c     // Catch: java.lang.Throwable -> L52
            if (r5 >= r6) goto L44
            boolean r6 = r9.b(r3, r5)     // Catch: java.lang.Throwable -> L52
            boolean r7 = r9.b(r5, r3)     // Catch: java.lang.Throwable -> L52
            if (r6 == r7) goto L41
            r9.a(r5, r3)     // Catch: java.lang.Throwable -> L52
            r9.a(r3, r5)     // Catch: java.lang.Throwable -> L52
        L41:
            int r5 = r5 + 1
            goto L2d
        L44:
            r3 = r4
            goto L26
        L46:
            f6.d r9 = r8.b(r0, r10)     // Catch: java.lang.Throwable -> L52
            w6.e r10 = new w6.e     // Catch: java.lang.Throwable -> L52
            r10.<init>()     // Catch: java.lang.Throwable -> L52
            r9.f2349g = r10     // Catch: java.lang.Throwable -> L52
            return r9
        L52:
            if (r1 == 0) goto L55
            throw r1
        L55:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.c.d(f6.b, java.util.Map):f6.d");
    }
}
