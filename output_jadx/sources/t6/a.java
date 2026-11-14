package t6;

import l.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {
    public static final a e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5825a = new int[929];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5826b = new int[929];
    public final d c;
    public final d d;

    public a() {
        int i10 = 1;
        for (int i11 = 0; i11 < 929; i11++) {
            this.f5825a[i11] = i10;
            i10 = (i10 * 3) % 929;
        }
        for (int i12 = 0; i12 < 928; i12++) {
            this.f5826b[this.f5825a[i12]] = i12;
        }
        this.c = new d(this, new int[]{0});
        this.d = new d(this, new int[]{1});
    }

    public final int a(int i10, int i11) {
        return (i10 + i11) % 929;
    }

    public final int b(int i10) {
        if (i10 != 0) {
            return this.f5825a[928 - this.f5826b[i10]];
        }
        throw new ArithmeticException();
    }

    public final int c(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f5826b;
            return this.f5825a[(iArr[i10] + iArr[i11]) % 928];
        }
        return 0;
    }
}
