package n6;

import java.util.Map;
import z5.m;
import z5.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4142b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};
    public static final int[][] d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    public static final int[][] e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    public int f4143a = -1;

    public static int g(int[] iArr) {
        float f8 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < 20; i11++) {
            float d10 = h.d(iArr, e[i11], 0.5f);
            if (d10 < f8) {
                i10 = i11;
                f8 = d10;
            } else if (d10 == f8) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw z5.i.d;
    }

    public static int[] h(int i10, f6.a aVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i11 = aVar.c;
        int i12 = i10;
        boolean z9 = false;
        int i13 = 0;
        while (i10 < i11) {
            if (aVar.d(i10) != z9) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 == length - 1) {
                    if (h.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                } else {
                    i13++;
                }
                iArr2[i13] = 1;
                z9 = !z9;
            }
            i10++;
        }
        throw z5.i.d;
    }

    @Override // n6.h
    public final m b(int i10, f6.a aVar, Map map) {
        int[] h2;
        int[] iArr;
        boolean z9;
        int i11 = aVar.c;
        int e6 = aVar.e(0);
        if (e6 != i11) {
            int[] h10 = h(e6, aVar, c);
            int i12 = h10[1];
            int i13 = h10[0];
            this.f4143a = (i12 - i13) / 4;
            i(aVar, i13);
            int[][] iArr2 = d;
            aVar.i();
            try {
                int i14 = aVar.c;
                int e10 = aVar.e(0);
                if (e10 != i14) {
                    try {
                        h2 = h(e10, aVar, iArr2[0]);
                    } catch (z5.i unused) {
                        h2 = h(e10, aVar, iArr2[1]);
                    }
                    i(aVar, h2[0]);
                    int i15 = h2[0];
                    int i16 = aVar.c;
                    h2[0] = i16 - h2[1];
                    h2[1] = i16 - i15;
                    aVar.i();
                    StringBuilder sb = new StringBuilder(20);
                    int i17 = h10[1];
                    int i18 = h2[0];
                    int[] iArr3 = new int[10];
                    int[] iArr4 = new int[5];
                    int[] iArr5 = new int[5];
                    while (i17 < i18) {
                        h.e(i17, aVar, iArr3);
                        for (int i19 = 0; i19 < 5; i19++) {
                            int i20 = i19 * 2;
                            iArr4[i19] = iArr3[i20];
                            iArr5[i19] = iArr3[i20 + 1];
                        }
                        sb.append((char) (g(iArr4) + 48));
                        sb.append((char) (g(iArr5) + 48));
                        for (int i21 = 0; i21 < 10; i21++) {
                            i17 += iArr3[i21];
                        }
                    }
                    String sb2 = sb.toString();
                    if (map != null) {
                        iArr = (int[]) map.get(z5.d.f6852g);
                    } else {
                        iArr = null;
                    }
                    if (iArr == null) {
                        iArr = f4142b;
                    }
                    int length = sb2.length();
                    int length2 = iArr.length;
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        if (i22 < length2) {
                            int i24 = iArr[i22];
                            if (length == i24) {
                                z9 = true;
                                break;
                            }
                            if (i24 > i23) {
                                i23 = i24;
                            }
                            i22++;
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    if (!z9 && length > i23) {
                        z9 = true;
                    }
                    if (z9) {
                        float f8 = i10;
                        return new m(sb2, null, new o[]{new o(h10[1], f8), new o(h2[0], f8)}, z5.a.f6840j);
                    }
                    throw z5.e.a();
                }
                throw z5.i.d;
            } catch (Throwable th) {
                aVar.i();
                throw th;
            }
        }
        throw z5.i.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(f6.a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f4143a
            int r0 = r0 * 10
            int r0 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.d(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            z5.i r3 = z5.i.d
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.f.i(f6.a, int):void");
    }
}
