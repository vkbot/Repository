package com.google.protobuf;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f1639a;

    static {
        t1 t1Var;
        if (s1.e && s1.d && !c.a()) {
            t1Var = new t1(1);
        } else {
            t1Var = new t1(0);
        }
        f1639a = t1Var;
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return d(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return c(b10, bArr[i10]);
        }
        if (b10 > -12) {
            return -1;
        }
        return b10;
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new u1(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int c(int i10, int i11) {
        if (i10 <= -12 && i11 <= -65) {
            return i10 ^ (i11 << 8);
        }
        return -1;
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 <= -12 && i11 <= -65 && i12 <= -65) {
            return (i10 ^ (i11 << 8)) ^ (i12 << 16);
        }
        return -1;
    }
}
