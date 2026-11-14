package f6;

import z5.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e {
    public static final byte[] e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final z5.g f2350a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2351b = e;
    public final int[] c = new int[32];
    public b d;

    public e(z5.g gVar) {
        this.f2350a = gVar;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            if (i14 > i10) {
                i12 = i13;
                i10 = i14;
            }
            if (i14 > i11) {
                i11 = i14;
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 - i12;
            int i19 = iArr[i17] * i18 * i18;
            if (i19 > i16) {
                i15 = i17;
                i16 = i19;
            }
        }
        if (i12 <= i15) {
            int i20 = i12;
            i12 = i15;
            i15 = i20;
        }
        if (i12 - i15 > length / 16) {
            int i21 = i12 - 1;
            int i22 = -1;
            int i23 = i21;
            while (i21 > i15) {
                int i24 = i21 - i15;
                int i25 = (i11 - iArr[i21]) * (i12 - i21) * i24 * i24;
                if (i25 > i22) {
                    i23 = i21;
                    i22 = i25;
                }
                i21--;
            }
            return i23 << 3;
        }
        throw i.d;
    }
}
