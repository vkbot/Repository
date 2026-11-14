package s6;

import n.p;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final p f5725a = new p(11);

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s6.c a(s6.e r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.g.a(s6.e):s6.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0401, code lost:
    
        throw z5.e.a();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x0450. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x02f0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x02f3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x045c A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v31, types: [byte[], java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, r6.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f6.d b(int[] r26, int[] r27, int r28) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.g.b(int[], int[], int):f6.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[EDGE_INSN: B:32:0x0060->B:33:0x0060 BREAK  A[LOOP:2: B:20:0x0045->B:28:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s6.a c(f6.b r19, int r20, int r21, boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.g.c(f6.b, int, int, boolean, int, int, int, int):s6.a");
    }

    public static e d(f6.b bVar, c cVar, o oVar, boolean z9, int i10, int i11) {
        int i12;
        int i13;
        boolean z10 = z9;
        e eVar = new e(cVar, z9);
        int i14 = 0;
        while (i14 < 2) {
            if (i14 == 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            int i15 = i12;
            int i16 = (int) oVar.f6875a;
            int i17 = (int) oVar.f6876b;
            while (i17 <= cVar.f5721i && i17 >= cVar.f5720h) {
                a c = c(bVar, 0, bVar.f2343b, z10, i16, i17, i10, i11);
                if (c != null) {
                    ((a[]) eVar.d)[eVar.x(i17)] = c;
                    if (z9) {
                        i13 = c.f5713b;
                    } else {
                        i13 = c.c;
                    }
                    i16 = i13;
                }
                i17 += i15;
                z10 = z9;
            }
            i14++;
            z10 = z9;
        }
        return eVar;
    }
}
