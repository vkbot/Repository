package u6;

import f6.b;
import java.util.ArrayList;
import java.util.Arrays;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5898a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5899b = {6, 2, 7, 3};
    public static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};
    public static final int[] d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(b bVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = bVar.c;
        if (i10 > 0) {
            int i11 = bVar.f2343b;
            o[] oVarArr = new o[8];
            int i12 = 0;
            int i13 = 0;
            o[] c10 = c(bVar, i10, i11, 0, 0, c);
            for (int i14 = 0; i14 < 4; i14++) {
                oVarArr[f5898a[i14]] = c10[i14];
            }
            o oVar = oVarArr[4];
            if (oVar != null) {
                i13 = (int) oVar.f6875a;
                i12 = (int) oVar.f6876b;
            }
            o[] c11 = c(bVar, i10, i11, i12, i13, d);
            for (int i15 = 0; i15 < 4; i15++) {
                oVarArr[f5899b[i15]] = c11[i15];
            }
            if (oVarArr[0] != null || oVarArr[3] != null) {
                arrayList.add(oVarArr);
            }
        }
        return arrayList;
    }

    public static int[] b(b bVar, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.b(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z9 = false;
        while (i10 < i12) {
            if (bVar.b(i10, i11) != z9) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 == length - 1) {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                } else {
                    i16++;
                }
                iArr2[i16] = 1;
                z9 = !z9;
            }
            i10++;
        }
        if (i16 == length - 1 && d(iArr2, iArr) < 0.42f) {
            return new int[]{i15, i10 - 1};
        }
        return null;
    }

    public static o[] c(b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        boolean z9;
        int[] b10;
        o[] oVarArr = new o[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i15 = i12;
        while (true) {
            if (i15 < i10) {
                int[] b11 = b(bVar, i13, i15, i11, iArr2, iArr3);
                if (b11 != null) {
                    int[] iArr4 = b11;
                    while (true) {
                        i14 = i15;
                        if (i14 <= 0 || (b10 = b(bVar, i13, i14 - 1, i11, iArr, iArr3)) == null) {
                            break;
                        }
                        iArr4 = b10;
                    }
                    float f8 = i14;
                    oVarArr[0] = new o(iArr4[0], f8);
                    oVarArr[1] = new o(iArr4[1], f8);
                    z9 = true;
                } else {
                    i15 += 5;
                    iArr2 = iArr;
                }
            } else {
                i14 = i15;
                z9 = false;
                break;
            }
        }
        int i16 = i14 + 1;
        if (z9) {
            int[] iArr5 = {(int) oVarArr[0].f6875a, (int) oVarArr[1].f6875a};
            int i17 = i16;
            int i18 = 0;
            while (i17 < i10) {
                int[] b12 = b(bVar, iArr5[0], i17, i11, iArr, iArr3);
                if (b12 != null && Math.abs(iArr5[0] - b12[0]) < 5 && Math.abs(iArr5[1] - b12[1]) < 5) {
                    iArr5 = b12;
                    i18 = 0;
                } else {
                    if (i18 > 25) {
                        break;
                    }
                    i18++;
                }
                i17++;
            }
            i16 = i17 - (i18 + 1);
            float f10 = i16;
            oVarArr[2] = new o(iArr5[0], f10);
            oVarArr[3] = new o(iArr5[1], f10);
        }
        if (i16 - i14 < 10) {
            Arrays.fill(oVarArr, (Object) null);
        }
        return oVarArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        float f8;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 >= i11) {
            float f10 = i10;
            float f11 = f10 / i11;
            float f12 = 0.8f * f11;
            float f13 = 0.0f;
            for (int i13 = 0; i13 < length; i13++) {
                float f14 = iArr2[i13] * f11;
                float f15 = iArr[i13];
                if (f15 > f14) {
                    f8 = f15 - f14;
                } else {
                    f8 = f14 - f15;
                }
                if (f8 > f12) {
                    return Float.POSITIVE_INFINITY;
                }
                f13 += f8;
            }
            return f13 / f10;
        }
        return Float.POSITIVE_INFINITY;
    }
}
