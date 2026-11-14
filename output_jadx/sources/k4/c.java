package k4;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends e {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // k4.e
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence g10 = g(charSequence);
        int length = g10.length();
        a aVar = this.f3423a;
        if (aVar.f3420h[length % aVar.e]) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < g10.length()) {
                int i12 = i10 + 2;
                int a10 = (aVar.a(g10.charAt(i10 + 1)) << 12) | (aVar.a(g10.charAt(i10)) << 18);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (a10 >>> 16);
                if (i12 < g10.length()) {
                    int i14 = i10 + 3;
                    int a11 = a10 | (aVar.a(g10.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((a11 >>> 8) & 255);
                    if (i14 < g10.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((a11 | aVar.a(g10.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }
        throw new IOException("Invalid input length " + g10.length());
    }

    @Override // k4.e
    public final void e(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        o4.b.k(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i11] & UByte.MAX_VALUE) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & UByte.MAX_VALUE);
            a aVar = this.f3423a;
            char[] cArr = aVar.f3417b;
            char[] cArr2 = aVar.f3417b;
            sb.append(cArr[i15 >>> 18]);
            sb.append(cArr2[(i15 >>> 12) & 63]);
            sb.append(cArr2[(i15 >>> 6) & 63]);
            sb.append(cArr2[i15 & 63]);
        }
        if (i11 < i10) {
            d(sb, bArr, i11, i10 - i11);
        }
    }

    @Override // k4.e
    public final e f(a aVar, Character ch) {
        return new c(aVar, ch);
    }

    public c(a aVar, Character ch) {
        super(aVar, ch);
        o4.b.f(aVar.f3417b.length == 64);
    }
}
