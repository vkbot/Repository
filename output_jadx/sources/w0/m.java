package w0;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6176a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6177b;
    public final int c;

    public /* synthetic */ m(HashMap hashMap, int i10, int i11) {
        this.f6176a = i11;
        this.f6177b = hashMap;
        this.c = i10;
    }

    public final int[] a(String str) {
        int i10;
        double[] dArr;
        int i11;
        double[] dArr2;
        int i12;
        int i13;
        int i14 = this.f6176a;
        HashMap hashMap = this.f6177b;
        int i15 = this.c;
        int i16 = 0;
        double d = Double.NEGATIVE_INFINITY;
        switch (i14) {
            case 0:
                String str2 = e0.m.h(new byte[]{89, -114, -66}, new byte[]{-69, 24, 63, Base64.padSymbol, -4, 40, 102, -56}) + Normalizer.normalize(str, Normalizer.Form.NFKC).trim().replaceAll(e0.m.h(new byte[]{-57, -111, -83}, new byte[]{-101, -30, -122, 20, -83, 103, 85, -96}), " ").replace(' ', (char) 9601);
                int length = str2.length();
                int i17 = length + 1;
                double[] dArr3 = new double[i17];
                int[] iArr = new int[i17];
                int[] iArr2 = new int[i17];
                double d10 = Double.NEGATIVE_INFINITY;
                Arrays.fill(dArr3, Double.NEGATIVE_INFINITY);
                Arrays.fill(iArr, -1);
                dArr3[0] = 0.0d;
                int i18 = 0;
                while (i18 < length) {
                    if (dArr3[i18] == d10) {
                        i10 = i16;
                        dArr = dArr3;
                    } else {
                        int min = Math.min(length, i18 + i15);
                        int i19 = i18 + 1;
                        int i20 = i16;
                        while (i19 <= min) {
                            n nVar = (n) hashMap.get(str2.substring(i18, i19));
                            if (nVar == null) {
                                i11 = i16;
                                dArr2 = dArr3;
                            } else {
                                i11 = i16;
                                dArr2 = dArr3;
                                double d11 = dArr3[i18] + nVar.f6190b;
                                if (d11 > dArr2[i19]) {
                                    dArr2[i19] = d11;
                                    iArr[i19] = i18;
                                    iArr2[i19] = nVar.f6189a;
                                }
                                i20 = 1;
                            }
                            i19++;
                            dArr3 = dArr2;
                            i16 = i11;
                        }
                        i10 = i16;
                        dArr = dArr3;
                        if (i20 == 0) {
                            int charCount = Character.charCount(str2.codePointAt(i18)) + i18;
                            double d12 = dArr[i18] - 100.0d;
                            if (d12 >= dArr[charCount]) {
                                dArr[charCount] = d12;
                                iArr[charCount] = i18;
                                iArr2[charCount] = 3;
                            }
                        }
                    }
                    i18++;
                    dArr3 = dArr;
                    i16 = i10;
                    d10 = Double.NEGATIVE_INFINITY;
                }
                int i21 = i16;
                ArrayList arrayList = new ArrayList();
                while (length > 0 && iArr[length] >= 0) {
                    arrayList.add(Integer.valueOf(iArr2[length]));
                    length = iArr[length];
                }
                Collections.reverse(arrayList);
                int min2 = Math.min(64, arrayList.size() + 2);
                int[] iArr3 = new int[min2];
                iArr3[i21] = i21;
                int i22 = i21;
                int max = Math.max(i22, min2 - 2);
                while (true) {
                    int i23 = i22;
                    if (i23 < max) {
                        i22 = i23 + 1;
                        iArr3[i22] = ((Integer) arrayList.get(i23)).intValue();
                    } else {
                        if (min2 > 1) {
                            iArr3[min2 - 1] = 2;
                        }
                        return iArr3;
                    }
                }
            default:
                String str3 = e0.m.h(new byte[]{48, 95, -90}, new byte[]{-46, -55, 39, 78, 66, -108, -27, -49}) + Normalizer.normalize(str, Normalizer.Form.NFKC).trim().replaceAll(e0.m.h(new byte[]{110, -31, 124}, new byte[]{50, -110, 87, 72, 16, 119, 95, -1}), " ").replace(' ', (char) 9601);
                int length2 = str3.length();
                int i24 = length2 + 1;
                double[] dArr4 = new double[i24];
                int[] iArr4 = new int[i24];
                int[] iArr5 = new int[i24];
                Arrays.fill(dArr4, Double.NEGATIVE_INFINITY);
                Arrays.fill(iArr4, -1);
                dArr4[0] = 0.0d;
                int i25 = 0;
                while (i25 < length2) {
                    if (dArr4[i25] == d) {
                        i12 = i25;
                    } else {
                        int min3 = Math.min(length2, i25 + i15);
                        int i26 = i25 + 1;
                        boolean z9 = false;
                        while (i26 <= min3) {
                            w wVar = (w) hashMap.get(str3.substring(i25, i26));
                            if (wVar == null) {
                                i13 = i25;
                            } else {
                                i13 = i25;
                                double d13 = dArr4[i25] + wVar.f6255b;
                                if (d13 > dArr4[i26]) {
                                    dArr4[i26] = d13;
                                    iArr4[i26] = i13;
                                    iArr5[i26] = wVar.f6254a;
                                }
                                z9 = true;
                            }
                            i26++;
                            i25 = i13;
                        }
                        i12 = i25;
                        if (!z9) {
                            int charCount2 = Character.charCount(str3.codePointAt(i12)) + i12;
                            double d14 = dArr4[i12] - 100.0d;
                            if (d14 >= dArr4[charCount2]) {
                                dArr4[charCount2] = d14;
                                iArr4[charCount2] = i12;
                                iArr5[charCount2] = 3;
                            }
                        }
                    }
                    i25 = i12 + 1;
                    d = Double.NEGATIVE_INFINITY;
                }
                ArrayList arrayList2 = new ArrayList();
                while (length2 > 0 && iArr4[length2] >= 0) {
                    arrayList2.add(Integer.valueOf(iArr5[length2]));
                    length2 = iArr4[length2];
                }
                Collections.reverse(arrayList2);
                int min4 = Math.min(64, arrayList2.size() + 2);
                int[] iArr6 = new int[min4];
                iArr6[0] = 0;
                int max2 = Math.max(0, min4 - 2);
                while (i16 < max2) {
                    int i27 = i16 + 1;
                    iArr6[i27] = ((Integer) arrayList2.get(i16)).intValue();
                    i16 = i27;
                }
                if (min4 > 1) {
                    iArr6[min4 - 1] = 2;
                }
                return iArr6;
        }
    }
}
