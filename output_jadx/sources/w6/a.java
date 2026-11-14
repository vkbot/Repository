package w6;

import b7.s;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6394a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static void a(s sVar, StringBuilder sb, int i10, boolean z9) {
        while (i10 > 1) {
            if (sVar.a() >= 11) {
                int b10 = sVar.b(11);
                sb.append(f(b10 / 45));
                sb.append(f(b10 % 45));
                i10 -= 2;
            } else {
                throw z5.e.a();
            }
        }
        if (i10 == 1) {
            if (sVar.a() >= 6) {
                sb.append(f(sVar.b(6)));
            } else {
                throw z5.e.a();
            }
        }
        if (z9) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i11 = length + 1;
                        if (sb.charAt(i11) == '%') {
                            sb.deleteCharAt(i11);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r5 == 2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015f, code lost:
    
        if ((r17 * 10) >= r24) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(b7.s r22, java.lang.StringBuilder r23, int r24, f6.c r25, java.util.ArrayList r26, java.util.Map r27) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.a.b(b7.s, java.lang.StringBuilder, int, f6.c, java.util.ArrayList, java.util.Map):void");
    }

    public static void c(s sVar, StringBuilder sb, int i10) {
        int i11;
        if (i10 * 13 <= sVar.a()) {
            byte[] bArr = new byte[i10 * 2];
            int i12 = 0;
            while (i10 > 0) {
                int b10 = sVar.b(13);
                int i13 = (b10 % 96) | ((b10 / 96) << 8);
                if (i13 < 2560) {
                    i11 = 41377;
                } else {
                    i11 = 42657;
                }
                int i14 = i13 + i11;
                bArr[i12] = (byte) (i14 >> 8);
                bArr[i12 + 1] = (byte) i14;
                i12 += 2;
                i10--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw z5.e.a();
            }
        }
        throw z5.e.a();
    }

    public static void d(s sVar, StringBuilder sb, int i10) {
        int i11;
        if (i10 * 13 <= sVar.a()) {
            byte[] bArr = new byte[i10 * 2];
            int i12 = 0;
            while (i10 > 0) {
                int b10 = sVar.b(13);
                int i13 = (b10 % 192) | ((b10 / 192) << 8);
                if (i13 < 7936) {
                    i11 = 33088;
                } else {
                    i11 = 49472;
                }
                int i14 = i13 + i11;
                bArr[i12] = (byte) (i14 >> 8);
                bArr[i12 + 1] = (byte) i14;
                i12 += 2;
                i10--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw z5.e.a();
            }
        }
        throw z5.e.a();
    }

    public static void e(s sVar, StringBuilder sb, int i10) {
        while (i10 >= 3) {
            if (sVar.a() >= 10) {
                int b10 = sVar.b(10);
                if (b10 < 1000) {
                    sb.append(f(b10 / 100));
                    sb.append(f((b10 / 10) % 10));
                    sb.append(f(b10 % 10));
                    i10 -= 3;
                } else {
                    throw z5.e.a();
                }
            } else {
                throw z5.e.a();
            }
        }
        if (i10 == 2) {
            if (sVar.a() >= 7) {
                int b11 = sVar.b(7);
                if (b11 < 100) {
                    sb.append(f(b11 / 10));
                    sb.append(f(b11 % 10));
                    return;
                }
                throw z5.e.a();
            }
            throw z5.e.a();
        }
        if (i10 == 1) {
            if (sVar.a() >= 4) {
                int b12 = sVar.b(4);
                if (b12 < 10) {
                    sb.append(f(b12));
                    return;
                }
                throw z5.e.a();
            }
            throw z5.e.a();
        }
    }

    public static char f(int i10) {
        char[] cArr = f6394a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw z5.e.a();
    }
}
