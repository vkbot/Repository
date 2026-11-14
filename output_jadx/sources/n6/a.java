package n6;

import java.util.Arrays;
import java.util.Map;
import z5.m;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends h {
    public static final char[] d = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f4129f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f4130a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public int[] f4131b = new int[80];
    public int c = 0;

    public static boolean g(char[] cArr, char c) {
        if (cArr != null) {
            for (char c10 : cArr) {
                if (c10 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // n6.h
    public final m b(int i10, f6.a aVar, Map map) {
        int i11;
        int[] iArr;
        int i12;
        Arrays.fill(this.f4131b, 0);
        this.c = 0;
        int f8 = aVar.f(0);
        int i13 = aVar.c;
        if (f8 < i13) {
            int i14 = 1;
            int i15 = 0;
            boolean z9 = true;
            while (f8 < i13) {
                if (aVar.d(f8) != z9) {
                    i15++;
                } else {
                    int[] iArr2 = this.f4131b;
                    int i16 = this.c;
                    iArr2[i16] = i15;
                    int i17 = i16 + 1;
                    this.c = i17;
                    if (i17 >= iArr2.length) {
                        int[] iArr3 = new int[i17 << 1];
                        System.arraycopy(iArr2, 0, iArr3, 0, i17);
                        this.f4131b = iArr3;
                    }
                    z9 = !z9;
                    i15 = 1;
                }
                f8++;
            }
            int[] iArr4 = this.f4131b;
            int i18 = this.c;
            iArr4[i18] = i15;
            int i19 = i18 + 1;
            this.c = i19;
            if (i19 >= iArr4.length) {
                int[] iArr5 = new int[i19 << 1];
                System.arraycopy(iArr4, 0, iArr5, 0, i19);
                this.f4131b = iArr5;
            }
            int i20 = 1;
            while (i20 < this.c) {
                int h2 = h(i20);
                if (h2 != -1) {
                    char[] cArr = d;
                    char c = cArr[h2];
                    char[] cArr2 = f4129f;
                    if (g(cArr2, c)) {
                        int i21 = 0;
                        for (int i22 = i20; i22 < i20 + 7; i22++) {
                            i21 += this.f4131b[i22];
                        }
                        if (i20 == i14 || this.f4131b[i20 - 1] >= i21 / 2) {
                            StringBuilder sb = this.f4130a;
                            sb.setLength(0);
                            int i23 = i20;
                            while (true) {
                                int h10 = h(i23);
                                if (h10 != -1) {
                                    sb.append((char) h10);
                                    i11 = i23 + 8;
                                    if ((sb.length() <= i14 || !g(cArr2, cArr[h10])) && i11 < this.c) {
                                        i23 = i11;
                                        i14 = i14;
                                    }
                                } else {
                                    throw z5.i.d;
                                }
                            }
                            int i24 = i23 + 7;
                            int i25 = this.f4131b[i24];
                            int i26 = 0;
                            for (int i27 = -8; i27 < -1; i27++) {
                                i26 += this.f4131b[i11 + i27];
                            }
                            if (i11 < this.c && i25 < i26 / 2) {
                                throw z5.i.d;
                            }
                            int[] iArr6 = new int[4];
                            iArr6[0] = 0;
                            iArr6[i14] = 0;
                            iArr6[2] = 0;
                            iArr6[3] = 0;
                            int[] iArr7 = new int[4];
                            iArr7[0] = 0;
                            iArr7[i14] = 0;
                            iArr7[2] = 0;
                            iArr7[3] = 0;
                            int length = sb.length() - i14;
                            int i28 = i20;
                            int i29 = 0;
                            while (true) {
                                char charAt = sb.charAt(i29);
                                iArr = e;
                                int i30 = iArr[charAt];
                                int i31 = 6;
                                while (i31 >= 0) {
                                    int i32 = (i31 & 1) + ((i30 & 1) << 1);
                                    iArr6[i32] = iArr6[i32] + this.f4131b[i28 + i31];
                                    iArr7[i32] = iArr7[i32] + 1;
                                    i30 >>= 1;
                                    i31--;
                                    i14 = i14;
                                }
                                int i33 = i14;
                                if (i29 >= length) {
                                    break;
                                }
                                i28 += 8;
                                i29++;
                                i14 = i33;
                            }
                            float[] fArr = new float[4];
                            float[] fArr2 = new float[4];
                            int i34 = 0;
                            for (int i35 = 2; i34 < i35; i35 = 2) {
                                fArr2[i34] = 0.0f;
                                int i36 = i34 + 2;
                                float f10 = iArr6[i36];
                                float f11 = iArr7[i36];
                                float f12 = ((f10 / f11) + (iArr6[i34] / iArr7[i34])) / 2.0f;
                                fArr2[i36] = f12;
                                fArr[i34] = f12;
                                fArr[i36] = ((f10 * 2.0f) + 1.5f) / f11;
                                i34++;
                            }
                            int i37 = i20;
                            int i38 = 0;
                            loop8: while (true) {
                                int i39 = iArr[sb.charAt(i38)];
                                for (int i40 = 6; i40 >= 0; i40--) {
                                    int i41 = (i40 & 1) + ((i39 & 1) << 1);
                                    float f13 = this.f4131b[i37 + i40];
                                    if (f13 < fArr2[i41] || f13 > fArr[i41]) {
                                        break loop8;
                                    }
                                    i39 >>= 1;
                                }
                                if (i38 < length) {
                                    i37 += 8;
                                    i38++;
                                } else {
                                    for (int i42 = 0; i42 < sb.length(); i42++) {
                                        sb.setCharAt(i42, cArr[sb.charAt(i42)]);
                                    }
                                    if (g(cArr2, sb.charAt(0))) {
                                        if (g(cArr2, sb.charAt(sb.length() - 1))) {
                                            if (sb.length() > 3) {
                                                if (map != null && map.containsKey(z5.d.f6855j)) {
                                                    i12 = 0;
                                                } else {
                                                    sb.deleteCharAt(sb.length() - 1);
                                                    i12 = 0;
                                                    sb.deleteCharAt(0);
                                                }
                                                int i43 = i12;
                                                while (i12 < i20) {
                                                    i43 += this.f4131b[i12];
                                                    i12++;
                                                }
                                                float f14 = i43;
                                                while (i20 < i24) {
                                                    i43 += this.f4131b[i20];
                                                    i20++;
                                                }
                                                float f15 = i10;
                                                return new m(sb.toString(), null, new o[]{new o(f14, f15), new o(i43, f15)}, z5.a.c);
                                            }
                                            throw z5.i.d;
                                        }
                                        throw z5.i.d;
                                    }
                                    throw z5.i.d;
                                }
                            }
                            throw z5.i.d;
                        }
                    }
                }
                i20 += 2;
                i14 = i14;
            }
            throw z5.i.d;
        }
        throw z5.i.d;
    }

    public final int h(int i10) {
        int i11;
        int i12 = i10 + 7;
        if (i12 < this.c) {
            int[] iArr = this.f4131b;
            int i13 = Integer.MAX_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = 0;
            for (int i17 = i10; i17 < i12; i17 += 2) {
                int i18 = iArr[i17];
                if (i18 < i15) {
                    i15 = i18;
                }
                if (i18 > i16) {
                    i16 = i18;
                }
            }
            int i19 = (i15 + i16) / 2;
            int i20 = 0;
            for (int i21 = i10 + 1; i21 < i12; i21 += 2) {
                int i22 = iArr[i21];
                if (i22 < i13) {
                    i13 = i22;
                }
                if (i22 > i20) {
                    i20 = i22;
                }
            }
            int i23 = (i13 + i20) / 2;
            int i24 = 128;
            int i25 = 0;
            for (int i26 = 0; i26 < 7; i26++) {
                if ((i26 & 1) == 0) {
                    i11 = i19;
                } else {
                    i11 = i23;
                }
                i24 >>= 1;
                if (iArr[i10 + i26] > i11) {
                    i25 |= i24;
                }
            }
            while (true) {
                int[] iArr2 = e;
                if (i14 < iArr2.length) {
                    if (iArr2[i14] == i25) {
                        return i14;
                    }
                    i14++;
                } else {
                    return -1;
                }
            }
        } else {
            return -1;
        }
    }
}
