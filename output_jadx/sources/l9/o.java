package l9;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class o implements Serializable, Comparable {
    public static final o e = new o(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3578b;
    public transient int c;
    public transient String d;

    public o(byte[] bArr) {
        bArr.getClass();
        this.f3578b = bArr;
    }

    public static final o g(byte... bArr) {
        bArr.getClass();
        return new o(Arrays.copyOf(bArr, bArr.length));
    }

    public String a() {
        byte[] bArr = a.f3557a;
        byte[] bArr2 = this.f3578b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr2[i10];
            int i12 = i10 + 2;
            byte b11 = bArr2[i10 + 1];
            i10 += 3;
            byte b12 = bArr2[i12];
            bArr3[i11] = bArr[(b10 & UByte.MAX_VALUE) >> 2];
            bArr3[i11 + 1] = bArr[((b10 & 3) << 4) | ((b11 & UByte.MAX_VALUE) >> 4)];
            int i13 = i11 + 3;
            bArr3[i11 + 2] = bArr[((b11 & 15) << 2) | ((b12 & UByte.MAX_VALUE) >> 6)];
            i11 += 4;
            bArr3[i13] = bArr[b12 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i14 = i10 + 1;
                byte b13 = bArr2[i10];
                byte b14 = bArr2[i14];
                bArr3[i11] = bArr[(b13 & UByte.MAX_VALUE) >> 2];
                bArr3[i11 + 1] = bArr[((b13 & 3) << 4) | ((b14 & UByte.MAX_VALUE) >> 4)];
                bArr3[i11 + 2] = bArr[(b14 & 15) << 2];
                bArr3[i11 + 3] = Base64.padSymbol;
            }
        } else {
            byte b15 = bArr2[i10];
            bArr3[i11] = bArr[(b15 & UByte.MAX_VALUE) >> 2];
            bArr3[i11 + 1] = bArr[(b15 & 3) << 4];
            bArr3[i11 + 2] = Base64.padSymbol;
            bArr3[i11 + 3] = Base64.padSymbol;
        }
        return new String(bArr3, Charsets.UTF_8);
    }

    public o b(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f3578b, 0, c());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new o(digest);
    }

    public int c() {
        return this.f3578b.length;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        oVar.getClass();
        int c = c();
        int c10 = oVar.c();
        int min = Math.min(c, c10);
        for (int i10 = 0; i10 < min; i10++) {
            int f8 = f(i10) & UByte.MAX_VALUE;
            int f10 = oVar.f(i10) & UByte.MAX_VALUE;
            if (f8 != f10) {
                if (f8 < f10) {
                    return -1;
                }
                return 1;
            }
        }
        if (c == c10) {
            return 0;
        }
        if (c < c10) {
            return -1;
        }
        return 1;
    }

    public String d() {
        byte[] bArr = this.f3578b;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = m9.b.f3997a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public byte[] e() {
        return this.f3578b;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                int c = oVar.c();
                byte[] bArr = this.f3578b;
                if (c == bArr.length && oVar.h(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public byte f(int i10) {
        return this.f3578b[i10];
    }

    public boolean h(int i10, int i11, int i12, byte[] bArr) {
        bArr.getClass();
        if (i10 >= 0) {
            byte[] bArr2 = this.f3578b;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (bArr2[i13 + i10] == bArr[i13 + i11]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.c;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f3578b);
        this.c = hashCode;
        return hashCode;
    }

    public boolean i(o oVar, int i10) {
        oVar.getClass();
        return oVar.h(0, 0, i10, this.f3578b);
    }

    public o j() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f3578b;
            if (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i10] = (byte) (b10 + 32);
                    for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                        byte b11 = copyOf[i11];
                        if (b11 >= 65 && b11 <= 90) {
                            copyOf[i11] = (byte) (b11 + 32);
                        }
                    }
                    return new o(copyOf);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public byte[] k() {
        byte[] bArr = this.f3578b;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String l() {
        String str = this.d;
        if (str == null) {
            byte[] e6 = e();
            e6.getClass();
            String str2 = new String(e6, Charsets.UTF_8);
            this.d = str2;
            return str2;
        }
        return str;
    }

    public void m(int i10, l lVar) {
        lVar.m1558write(this.f3578b, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0138, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0177, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x017e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0170, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0144, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b9, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0100, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.o.toString():java.lang.String");
    }
}
