package k4;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3416a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f3417b;
    public final int c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3418f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f3419g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f3420h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3421i;

    public a(String str, char[] cArr, byte[] bArr, boolean z9) {
        this.f3416a = str;
        cArr.getClass();
        this.f3417b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int o5 = a.a.o(length);
            this.d = o5;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(o5);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.e = i10;
            this.f3418f = o5 >> numberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.f3419g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f3418f; i11++) {
                int i12 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[a.a.i(i11 * 8, i12)] = true;
            }
            this.f3420h = zArr;
            this.f3421i = z9;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final int a(char c) {
        if (c <= 127) {
            byte b10 = this.f3419g[c];
            if (b10 == -1) {
                if (c > ' ' && c != 127) {
                    throw new IOException("Unrecognized character: " + c);
                }
                throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            return b10;
        }
        throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3421i == aVar.f3421i && Arrays.equals(this.f3417b, aVar.f3417b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f3417b);
        if (this.f3421i) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f3416a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4b
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            if (r7 == 0) goto L38
            r7 = r1[r5]
            if (r7 != r2) goto L1c
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 == 0) goto L25
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L25:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Duplicate character: %s"
            java.lang.String r9 = e3.d.l(r10, r9)
            j1.i.k(r9)
            r9 = 0
            throw r9
        L38:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r9 = e3.d.l(r10, r9)
            j1.i.k(r9)
            r9 = 0
            throw r9
        L4b:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a.<init>(java.lang.String, char[]):void");
    }
}
