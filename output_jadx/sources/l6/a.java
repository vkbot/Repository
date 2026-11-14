package l6;

import j6.c;
import java.text.DecimalFormat;
import java.util.Map;
import z5.b;
import z5.e;
import z5.i;
import z5.k;
import z5.m;
import z5.n;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final o[] f3544b = new o[0];

    /* renamed from: a, reason: collision with root package name */
    public final c f3545a = new c(1);

    @Override // z5.k
    public final m a(b bVar, Map map) {
        int[] iArr;
        byte[] bArr;
        byte[] bArr2;
        String valueOf;
        f6.b a10 = bVar.a();
        int i10 = a10.f2343b;
        int i11 = a10.c;
        int i12 = -1;
        int i13 = i11;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            while (true) {
                int i17 = a10.d;
                if (i16 < i17) {
                    int i18 = a10.e[(i17 * i15) + i16];
                    if (i18 != 0) {
                        if (i15 < i13) {
                            i13 = i15;
                        }
                        if (i15 > i14) {
                            i14 = i15;
                        }
                        int i19 = i16 << 5;
                        if (i19 < i10) {
                            int i20 = 0;
                            while ((i18 << (31 - i20)) == 0) {
                                i20++;
                            }
                            int i21 = i20 + i19;
                            if (i21 < i10) {
                                i10 = i21;
                            }
                        }
                        if (i19 + 31 > i12) {
                            int i22 = 31;
                            while ((i18 >>> i22) == 0) {
                                i22--;
                            }
                            int i23 = i19 + i22;
                            if (i23 > i12) {
                                i12 = i23;
                            }
                        }
                    }
                    i16++;
                }
            }
        }
        if (i12 >= i10 && i14 >= i13) {
            iArr = new int[]{i10, i13, (i12 - i10) + 1, (i14 - i13) + 1};
        } else {
            iArr = null;
        }
        if (iArr != null) {
            int i24 = iArr[0];
            int i25 = iArr[1];
            int i26 = iArr[2];
            int i27 = iArr[3];
            int[] iArr2 = new int[33];
            for (int i28 = 0; i28 < 33; i28++) {
                int i29 = (((i27 / 2) + (i28 * i27)) / 33) + i25;
                for (int i30 = 0; i30 < 30; i30++) {
                    if (a10.b((((((i28 & 1) * i26) / 2) + ((i26 / 2) + (i30 * i26))) / 30) + i24, i29)) {
                        int i31 = (i30 / 32) + i28;
                        iArr2[i31] = iArr2[i31] | (1 << (i30 & 31));
                    }
                }
            }
            c cVar = this.f3545a;
            cVar.getClass();
            byte[] bArr3 = new byte[144];
            for (int i32 = 0; i32 < 33; i32++) {
                int[] iArr3 = m6.a.f3945a[i32];
                for (int i33 = 0; i33 < 30; i33++) {
                    int i34 = iArr3[i33];
                    if (i34 >= 0 && ((iArr2[(i33 / 32) + i32] >>> (i33 & 31)) & 1) != 0) {
                        int i35 = i34 / 6;
                        bArr3[i35] = (byte) (bArr3[i35] | ((byte) (1 << (5 - (i34 % 6)))));
                    }
                }
            }
            cVar.a(0, 10, 10, 0, bArr3);
            int i36 = bArr3[0] & 15;
            if (i36 != 2 && i36 != 3 && i36 != 4) {
                if (i36 == 5) {
                    cVar.a(20, 68, 56, 1, bArr3);
                    cVar.a(20, 68, 56, 2, bArr3);
                    bArr2 = new byte[78];
                    bArr = bArr3;
                } else {
                    throw e.a();
                }
            } else {
                cVar.a(20, 84, 40, 1, bArr3);
                cVar.a(20, 84, 40, 2, bArr3);
                bArr = bArr3;
                bArr2 = new byte[94];
            }
            System.arraycopy(bArr, 0, bArr2, 0, 10);
            System.arraycopy(bArr, 20, bArr2, 10, bArr2.length - 10);
            StringBuilder sb = new StringBuilder(144);
            if (i36 != 2 && i36 != 3) {
                if (i36 != 4) {
                    if (i36 == 5) {
                        sb.append(m6.a.b(bArr2, 1, 77));
                    }
                } else {
                    sb.append(m6.a.b(bArr2, 1, 93));
                }
            } else {
                if (i36 == 2) {
                    valueOf = new DecimalFormat("0000000000".substring(0, m6.a.a(bArr2, new byte[]{39, 40, 41, 42, 31, 32}))).format(m6.a.a(bArr2, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
                } else {
                    String[] strArr = m6.a.f3946b;
                    valueOf = String.valueOf(new char[]{strArr[0].charAt(m6.a.a(bArr2, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m6.a.a(bArr2, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m6.a.a(bArr2, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(m6.a.a(bArr2, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(m6.a.a(bArr2, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(m6.a.a(bArr2, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format(m6.a.a(bArr2, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
                String format2 = decimalFormat.format(m6.a.a(bArr2, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
                sb.append(m6.a.b(bArr2, 10, 84));
                if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                    sb.insert(9, valueOf + (char) 29 + format + (char) 29 + format2 + (char) 29);
                } else {
                    sb.insert(0, valueOf + (char) 29 + format + (char) 29 + format2 + (char) 29);
                }
            }
            String sb2 = sb.toString();
            String valueOf2 = String.valueOf(i36);
            m mVar = new m(sb2, bArr2, f3544b, z5.a.f6841k);
            if (valueOf2 != null) {
                mVar.b(n.d, valueOf2);
            }
            return mVar;
        }
        throw i.d;
    }

    @Override // z5.k
    public final void reset() {
    }
}
