package h6;

import l9.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f2587h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f2588i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f2589j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f2590k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f2591l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f2592m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f2593n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f2594o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2595a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2596b;
    public final b c;
    public final b d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2597f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2598g;

    static {
        a aVar = new a(67, 64, 1);
        f2589j = aVar;
        f2590k = new a(19, 16, 1);
        f2591l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f2592m = aVar2;
        f2593n = aVar2;
        f2594o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f2597f = i10;
        this.e = i11;
        this.f2598g = i12;
        this.f2595a = new int[i11];
        this.f2596b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f2595a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f2596b[this.f2595a[i15]] = i15;
        }
        this.c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new b(this, iArr);
        }
        i.a();
        return null;
    }

    public final int b(int i10) {
        if (i10 != 0) {
            return this.f2595a[(this.e - this.f2596b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f2596b;
            return this.f2595a[(iArr[i10] + iArr[i11]) % (this.e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f2597f) + ',' + this.e + ')';
    }
}
