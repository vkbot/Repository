package k4;

import java.io.IOException;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: f, reason: collision with root package name */
    public final char[] f3422f;

    public b(a aVar) {
        super(aVar, (Character) null);
        boolean z9;
        this.f3422f = new char[512];
        char[] cArr = aVar.f3417b;
        if (cArr.length == 16) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.f(z9);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f3422f;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override // k4.e
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                char charAt = charSequence.charAt(i10);
                a aVar = this.f3423a;
                bArr[i11] = (byte) ((aVar.a(charAt) << 4) | aVar.a(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        throw new IOException("Invalid input length " + charSequence.length());
    }

    @Override // k4.e
    public final void e(StringBuilder sb, byte[] bArr, int i10) {
        o4.b.k(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & UByte.MAX_VALUE;
            char[] cArr = this.f3422f;
            sb.append(cArr[i12]);
            sb.append(cArr[i12 | 256]);
        }
    }

    @Override // k4.e
    public final e f(a aVar, Character ch) {
        return new b(aVar);
    }
}
