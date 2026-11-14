package k4;

import j1.i;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class e {
    public static final c d = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final b e;

    /* renamed from: a, reason: collision with root package name */
    public final a f3423a;

    /* renamed from: b, reason: collision with root package name */
    public final Character f3424b;
    public volatile e c;

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public e(a aVar, Character ch) {
        boolean z9;
        aVar.getClass();
        this.f3423a = aVar;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = aVar.f3419g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z9 = false;
                o4.b.e("Padding character %s was already in alphabet", z9, ch);
                this.f3424b = ch;
            }
        }
        z9 = true;
        o4.b.e("Padding character %s was already in alphabet", z9, ch);
        this.f3424b = ch;
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((this.f3423a.d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b10 = b(bArr, g(str));
            if (b10 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b10];
            System.arraycopy(bArr, 0, bArr2, 0, b10);
            return bArr2;
        } catch (d e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) {
        CharSequence g10 = g(charSequence);
        int length = g10.length();
        a aVar = this.f3423a;
        boolean[] zArr = aVar.f3420h;
        int i10 = aVar.d;
        int i11 = aVar.e;
        if (zArr[length % i11]) {
            int i12 = 0;
            for (int i13 = 0; i13 < g10.length(); i13 += i11) {
                long j10 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    j10 <<= i10;
                    if (i13 + i15 < g10.length()) {
                        j10 |= aVar.a(g10.charAt(i14 + i13));
                        i14++;
                    }
                }
                int i16 = aVar.f3418f;
                int i17 = (i16 * 8) - (i14 * i10);
                int i18 = (i16 - 1) * 8;
                while (i18 >= i17) {
                    bArr[i12] = (byte) ((j10 >>> i18) & 255);
                    i18 -= 8;
                    i12++;
                }
            }
            return i12;
        }
        throw new IOException("Invalid input length " + g10.length());
    }

    public final String c(byte[] bArr) {
        int length = bArr.length;
        o4.b.k(0, length, bArr.length);
        a aVar = this.f3423a;
        int i10 = aVar.e;
        int i11 = aVar.f3418f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(a.a.i(length, i11) * i10);
        try {
            e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e6) {
            i.e(e6);
            return null;
        }
    }

    public final void d(StringBuilder sb, byte[] bArr, int i10, int i11) {
        boolean z9;
        o4.b.k(i10, i10 + i11, bArr.length);
        a aVar = this.f3423a;
        int i12 = aVar.f3418f;
        int i13 = aVar.d;
        int i14 = 0;
        if (i11 <= i12) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.f(z9);
        long j10 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j10 = (j10 | (bArr[i10 + i15] & UByte.MAX_VALUE)) << 8;
        }
        int i16 = ((i11 + 1) * 8) - i13;
        while (i14 < i11 * 8) {
            sb.append(aVar.f3417b[((int) (j10 >>> (i16 - i14))) & aVar.c]);
            i14 += i13;
        }
        Character ch = this.f3424b;
        if (ch != null) {
            while (i14 < aVar.f3418f * 8) {
                sb.append(ch.charValue());
                i14 += i13;
            }
        }
    }

    public void e(StringBuilder sb, byte[] bArr, int i10) {
        int i11 = 0;
        o4.b.k(0, i10, bArr.length);
        while (i11 < i10) {
            a aVar = this.f3423a;
            d(sb, bArr, i11, Math.min(aVar.f3418f, i10 - i11));
            i11 += aVar.f3418f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f3423a.equals(eVar.f3423a) && Objects.equals(this.f3424b, eVar.f3424b)) {
                return true;
            }
        }
        return false;
    }

    public e f(a aVar, Character ch) {
        return new e(aVar, ch);
    }

    public final CharSequence g(CharSequence charSequence) {
        Character ch = this.f3424b;
        if (ch == null) {
            return charSequence;
        }
        char charValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == charValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final e h() {
        int i10;
        boolean z9;
        boolean z10;
        e eVar = this.c;
        if (eVar == null) {
            a aVar = this.f3423a;
            char[] cArr = aVar.f3417b;
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                char c = cArr[i11];
                if (c >= 'a' && c <= 'z') {
                    int length2 = cArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            char c10 = cArr[i12];
                            if (c10 >= 'A' && c10 <= 'Z') {
                                z9 = true;
                                break;
                            }
                            i12++;
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    o4.b.m(!z9, "Cannot call upperCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i13 = 0; i13 < cArr.length; i13++) {
                        char c11 = cArr[i13];
                        if (c11 >= 'a' && c11 <= 'z') {
                            c11 = (char) (c11 ^ ' ');
                        }
                        cArr2[i13] = c11;
                    }
                    a aVar2 = new a(ai.onnxruntime.a.p(new StringBuilder(), aVar.f3416a, ".upperCase()"), cArr2);
                    if (aVar.f3421i) {
                        byte[] bArr = aVar2.f3419g;
                        if (!aVar2.f3421i) {
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            for (i10 = 65; i10 <= 90; i10++) {
                                int i14 = i10 | 32;
                                byte b10 = bArr[i10];
                                byte b11 = bArr[i14];
                                if (b10 == -1) {
                                    copyOf[i10] = b11;
                                } else {
                                    if (b11 == -1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    char c12 = (char) i10;
                                    char c13 = (char) i14;
                                    if (z10) {
                                        copyOf[i14] = b10;
                                    } else {
                                        i.l(e3.d.l("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                        return null;
                                    }
                                }
                            }
                            aVar = new a(ai.onnxruntime.a.p(new StringBuilder(), aVar2.f3416a, ".ignoreCase()"), aVar2.f3417b, copyOf, true);
                        }
                    }
                    aVar = aVar2;
                } else {
                    i11++;
                }
            }
            if (aVar == this.f3423a) {
                eVar = this;
            } else {
                eVar = f(aVar, this.f3424b);
            }
            this.c = eVar;
        }
        return eVar;
    }

    public final int hashCode() {
        return this.f3423a.hashCode() ^ Objects.hashCode(this.f3424b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        a aVar = this.f3423a;
        sb.append(aVar);
        if (8 % aVar.d != 0) {
            Character ch = this.f3424b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public e(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
