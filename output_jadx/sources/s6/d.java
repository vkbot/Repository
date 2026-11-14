package s6;

import java.math.BigInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5722a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f5723b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    public static final BigInteger[] c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = c;
            if (i10 < bigIntegerArr2.length) {
                bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
                i10++;
            } else {
                return;
            }
        }
    }

    public static String a(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw z5.e.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r10.append(a(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(int[] r8, int r9, java.lang.StringBuilder r10) {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            r4 = r8[r1]
            if (r9 >= r4) goto L43
            if (r2 != 0) goto L43
            int r5 = r9 + 1
            r6 = r8[r9]
            r7 = 1
            if (r5 != r4) goto L15
            r2 = r7
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r6 >= r4) goto L1f
            r0[r3] = r6
            int r3 = r3 + 1
        L1d:
            r9 = r5
            goto L2e
        L1f:
            if (r6 == r4) goto L2d
            r4 = 901(0x385, float:1.263E-42)
            if (r6 == r4) goto L2d
            r4 = 928(0x3a0, float:1.3E-42)
            if (r6 == r4) goto L2d
            switch(r6) {
                case 922: goto L2d;
                case 923: goto L2d;
                case 924: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L1d
        L2d:
            r2 = r7
        L2e:
            int r4 = r3 % 15
            if (r4 == 0) goto L38
            r4 = 902(0x386, float:1.264E-42)
            if (r6 == r4) goto L38
            if (r2 == 0) goto L7
        L38:
            if (r3 <= 0) goto L7
            java.lang.String r3 = a(r0, r3)
            r10.append(r3)
            r3 = r1
            goto L7
        L43:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.d.b(int[], int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a5, code lost:
    
        if (r12 != 900) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x00ce. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x00f0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int[] r18, int r19, java.lang.StringBuilder r20) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.d.c(int[], int, java.lang.StringBuilder):int");
    }
}
