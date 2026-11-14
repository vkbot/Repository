package o6;

import n6.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a extends h {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4372b;
    public final int[] e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4373f;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4371a = new int[4];
    public final float[] c = new float[4];
    public final float[] d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f4372b = iArr;
        this.e = new int[iArr.length / 2];
        this.f4373f = new int[iArr.length / 2];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f8 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f10 = fArr[i11];
            if (f10 < f8) {
                i10 = i11;
                f8 = f10;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void h(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f8 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f10 = fArr[i11];
            if (f10 > f8) {
                i10 = i11;
                f8 = f10;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean i(int[] iArr) {
        float f8 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f8 >= 0.7916667f && f8 <= 0.89285713f) {
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
                if (i12 < i10) {
                    i10 = i12;
                }
            }
            if (i11 < i10 * 10) {
                return true;
            }
        }
        return false;
    }
}
