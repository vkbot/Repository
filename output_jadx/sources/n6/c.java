package n6;

import java.util.Arrays;
import java.util.Map;
import org.apache.commons.net.nntp.NNTPReply;
import z5.m;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends h {
    public static final int[] d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, NNTPReply.SERVICE_DISCONTINUED, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4133a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f4134b = new StringBuilder(20);
    public final int[] c = new int[9];

    public c(boolean z9) {
        this.f4133a = z9;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if ((i19 << 1) >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    @Override // n6.h
    public final m b(int i10, f6.a aVar, Map map) {
        int i11;
        char c;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f4134b;
        sb.setLength(0);
        int i12 = aVar.c;
        int e = aVar.e(0);
        int length = iArr.length;
        boolean z9 = false;
        int i13 = 0;
        int i14 = e;
        while (e < i12) {
            boolean z10 = true;
            if (aVar.d(e) != z9) {
                iArr[i13] = iArr[i13] + 1;
            } else {
                if (i13 == length - 1) {
                    if (g(iArr) == 148 && aVar.h(Math.max(0, i14 - ((e - i14) / 2)), i14)) {
                        int e6 = aVar.e(new int[]{i14, e}[1]);
                        int i15 = aVar.c;
                        while (true) {
                            h.e(e6, aVar, iArr);
                            int g10 = g(iArr);
                            if (g10 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    if (i16 < 43) {
                                        if (d[i16] == g10) {
                                            c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16);
                                            break;
                                        }
                                        i16++;
                                    } else if (g10 == 148) {
                                        c = '*';
                                    } else {
                                        throw z5.i.d;
                                    }
                                }
                                sb.append(c);
                                boolean z11 = z10;
                                int i17 = e6;
                                for (int i18 : iArr) {
                                    i17 += i18;
                                }
                                int e10 = aVar.e(i17);
                                if (c == '*') {
                                    sb.setLength(sb.length() - 1);
                                    int i19 = 0;
                                    for (int i20 : iArr) {
                                        i19 += i20;
                                    }
                                    int i21 = (e10 - e6) - i19;
                                    if (e10 != i15 && (i21 << 1) < i19) {
                                        throw z5.i.d;
                                    }
                                    if (this.f4133a) {
                                        int length2 = sb.length() - 1;
                                        int i22 = 0;
                                        for (int i23 = 0; i23 < length2; i23++) {
                                            i22 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i23));
                                        }
                                        if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i22 % 43)) {
                                            sb.setLength(length2);
                                        } else {
                                            throw z5.c.a();
                                        }
                                    }
                                    if (sb.length() != 0) {
                                        float f8 = (r5[z11 ? 1 : 0] + r5[0]) / 2.0f;
                                        float f10 = (i19 / 2.0f) + e6;
                                        float f11 = i10;
                                        return new m(sb.toString(), null, new o[]{new o(f8, f11), new o(f10, f11)}, z5.a.d);
                                    }
                                    throw z5.i.d;
                                }
                                z10 = z11 ? 1 : 0;
                                e6 = e10;
                            } else {
                                throw z5.i.d;
                            }
                        }
                    } else {
                        i11 = 1;
                        i14 += iArr[0] + iArr[1];
                        int i24 = i13 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i24);
                        iArr[i24] = 0;
                        iArr[i13] = 0;
                        i13--;
                    }
                } else {
                    i11 = 1;
                    i13++;
                }
                iArr[i13] = i11;
                z9 = !z9;
            }
            e++;
        }
        throw z5.i.d;
    }
}
