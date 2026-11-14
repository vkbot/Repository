package g7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    public final int[] f2482l = new int[10];

    /* renamed from: m, reason: collision with root package name */
    public final int[] f2483m = new int[10];

    /* renamed from: n, reason: collision with root package name */
    public final int[] f2484n = new int[10];

    /* renamed from: o, reason: collision with root package name */
    public final int[] f2485o = new int[10];

    /* renamed from: p, reason: collision with root package name */
    public final int[] f2486p = new int[10];

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2474a = new int[10];
    public final int[] c = new int[10];
    public final int[] e = new int[10];

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2477g = new int[10];

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2479i = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2475b = new int[10];
    public final int[] d = new int[10];

    /* renamed from: h, reason: collision with root package name */
    public final int[] f2478h = new int[10];

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2476f = new int[10];

    /* renamed from: j, reason: collision with root package name */
    public final long[] f2480j = new long[20];

    /* renamed from: k, reason: collision with root package name */
    public final int[] f2481k = new int[20];

    public static void b(int[] iArr, int[] iArr2, int i10) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = iArr[i12];
            int i14 = (iArr2[i12] ^ i13) & i11;
            iArr[i12] = i13 ^ i14;
            iArr2[i12] = iArr2[i12] ^ i14;
        }
    }

    public static void i(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            i10 = (iArr2[i11] - iArr3[i11]) - ((i10 >> 26) & 1);
            iArr[i11] = i10 & 67108863;
        }
        int i12 = iArr[0] - ((-((i10 >> 26) & 1)) & 19);
        iArr[0] = i12 & 67108863;
        for (int i13 = 1; i13 < 10; i13++) {
            i12 = iArr[i13] - ((i12 >> 26) & 1);
            iArr[i13] = i12 & 67108863;
        }
        iArr[9] = iArr[9] & 2097151;
    }

    public final void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr2[0] + iArr3[0];
        iArr[0] = i10 & 67108863;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 = (i10 >> 26) + iArr2[i11] + iArr3[i11];
            iArr[i11] = i10 & 67108863;
        }
        h(iArr);
    }

    public final void c() {
        Arrays.fill(this.f2482l, 0);
        Arrays.fill(this.f2483m, 0);
        Arrays.fill(this.f2484n, 0);
        Arrays.fill(this.f2485o, 0);
        Arrays.fill(this.f2486p, 0);
        Arrays.fill(this.f2474a, 0);
        Arrays.fill(this.c, 0);
        Arrays.fill(this.e, 0);
        Arrays.fill(this.f2477g, 0);
        Arrays.fill(this.f2479i, 0);
        Arrays.fill(this.f2475b, 0);
        Arrays.fill(this.d, 0);
        Arrays.fill(this.f2478h, 0);
        Arrays.fill(this.f2476f, 0);
        Arrays.fill(this.f2480j, 0L);
        Arrays.fill(this.f2481k, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final void d(byte[] bArr) {
        int[] iArr;
        byte b10;
        int i10 = 31;
        int i11 = bArr[31] | 64;
        int i12 = 6;
        int i13 = 0;
        while (true) {
            int i14 = (i11 >> i12) & 1;
            int i15 = i13 ^ i14;
            int[] iArr2 = this.f2483m;
            int[] iArr3 = this.f2484n;
            b(iArr2, iArr3, i15);
            int[] iArr4 = this.f2485o;
            int[] iArr5 = this.f2486p;
            b(iArr4, iArr5, i15);
            int[] iArr6 = this.f2474a;
            a(iArr6, iArr2, iArr4);
            int[] iArr7 = this.f2475b;
            e(iArr7, iArr6, iArr6);
            int[] iArr8 = this.c;
            i(iArr8, iArr2, iArr4);
            int[] iArr9 = this.d;
            e(iArr9, iArr8, iArr8);
            int[] iArr10 = this.f2479i;
            i(iArr10, iArr7, iArr9);
            int[] iArr11 = this.e;
            a(iArr11, iArr3, iArr5);
            int[] iArr12 = this.f2477g;
            i(iArr12, iArr3, iArr5);
            int i16 = i11;
            int[] iArr13 = this.f2478h;
            e(iArr13, iArr12, iArr6);
            int[] iArr14 = this.f2476f;
            e(iArr14, iArr11, iArr8);
            a(iArr3, iArr13, iArr14);
            e(iArr3, iArr3, iArr3);
            i(iArr5, iArr13, iArr14);
            e(iArr5, iArr5, iArr5);
            e(iArr5, iArr5, this.f2482l);
            e(iArr2, iArr7, iArr9);
            long j10 = 0;
            int i17 = 0;
            while (true) {
                iArr = this.f2481k;
                if (i17 >= 10) {
                    break;
                }
                long j11 = (iArr10[i17] * 121665) + j10;
                iArr[i17] = ((int) j11) & 67108863;
                j10 = j11 >> 26;
                i17++;
                iArr2 = iArr2;
            }
            int[] iArr15 = iArr2;
            iArr[10] = ((int) j10) & 67108863;
            g(iArr4, iArr, 1);
            a(iArr4, iArr4, iArr7);
            e(iArr4, iArr4, iArr10);
            if (i12 > 0) {
                i12--;
                i11 = i16;
            } else {
                if (i10 == 0) {
                    b(iArr15, iArr3, i14);
                    b(iArr4, iArr5, i14);
                    return;
                }
                if (i10 == 1) {
                    i10--;
                    b10 = bArr[i10] & 248;
                } else {
                    i10--;
                    b10 = bArr[i10];
                }
                byte b11 = b10;
                i12 = 7;
                i11 = b11;
            }
            i13 = i14;
        }
    }

    public final void e(int[] iArr, int[] iArr2, int[] iArr3) {
        long[] jArr;
        long j10 = iArr2[0];
        int i10 = 0;
        while (true) {
            jArr = this.f2480j;
            if (i10 >= 10) {
                break;
            }
            jArr[i10] = iArr3[i10] * j10;
            i10++;
        }
        for (int i11 = 1; i11 < 10; i11++) {
            long j11 = iArr2[i11];
            for (int i12 = 0; i12 < 9; i12++) {
                int i13 = i11 + i12;
                jArr[i13] = (iArr3[i12] * j11) + jArr[i13];
            }
            jArr[i11 + 9] = j11 * iArr3[9];
        }
        long j12 = jArr[0];
        int[] iArr4 = this.f2481k;
        iArr4[0] = ((int) j12) & 67108863;
        for (int i14 = 1; i14 < 20; i14++) {
            j12 = (j12 >> 26) + jArr[i14];
            iArr4[i14] = ((int) j12) & 67108863;
        }
        g(iArr, iArr4, 10);
    }

    public final void f(int[] iArr, int[] iArr2) {
        int[] iArr3 = this.f2474a;
        e(iArr3, iArr2, iArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            e(iArr3, iArr3, iArr3);
        }
        e(iArr, iArr3, iArr2);
        for (int i11 = 0; i11 < 23; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                e(iArr3, iArr3, iArr3);
            }
            e(iArr, iArr, iArr3);
        }
        e(iArr3, iArr, iArr);
        e(iArr, iArr, iArr3);
        for (int i13 = 0; i13 < 8; i13++) {
            e(iArr3, iArr3, iArr3);
            e(iArr, iArr, iArr3);
        }
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr2);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr2);
        e(iArr, iArr, iArr);
        e(iArr, iArr, iArr2);
    }

    public final void g(int[] iArr, int[] iArr2, int i10) {
        int i11 = iArr2[9];
        int i12 = i11 >> 21;
        iArr2[9] = i11 & 2097151;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i12 + (iArr2[i14 + 10] << 5);
            int i16 = ((i15 & 67108863) * 19) + iArr2[i14] + i13;
            iArr2[i14] = i16 & 67108863;
            i12 = i15 >> 26;
            i13 = i16 >> 26;
        }
        if (i10 < 10) {
            while (i10 < 10) {
                int i17 = i13 + iArr2[i10];
                iArr2[i10] = i17 & 67108863;
                i13 = i17 >> 26;
                i10++;
            }
        }
        int i18 = iArr2[9];
        int i19 = (i18 >> 21) * 19;
        iArr2[9] = i18 & 2097151;
        for (int i20 = 0; i20 < 10; i20++) {
            int i21 = i19 + iArr2[i20];
            iArr[i20] = i21 & 67108863;
            i19 = i21 >> 26;
        }
        h(iArr);
    }

    public final void h(int[] iArr) {
        int[] iArr2;
        int i10 = 19;
        int i11 = 0;
        while (true) {
            iArr2 = this.f2481k;
            if (i11 >= 10) {
                break;
            }
            int i12 = i10 + iArr[i11];
            iArr2[i11] = 67108863 & i12;
            i10 = i12 >> 26;
            i11++;
        }
        int i13 = iArr2[9];
        int i14 = -((i13 >> 21) & 1);
        int i15 = ~i14;
        iArr2[9] = i13 & 2097151;
        for (int i16 = 0; i16 < 10; i16++) {
            iArr[i16] = (iArr[i16] & i15) | (iArr2[i16] & i14);
        }
    }
}
