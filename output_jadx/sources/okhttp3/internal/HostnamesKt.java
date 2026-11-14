package okhttp3.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int indexOf$default;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, 127) < 0) {
                indexOf$default = StringsKt__StringsKt.indexOf$default(" #%/:?@[\\]", charAt, 0, false, 6, (Object) null);
                if (indexOf$default != -1) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        if (i13 != i12 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r10, int r11, int r12) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            if (r11 >= r12) goto L76
            if (r4 != r0) goto Lf
            goto L7a
        Lf:
            int r7 = r11 + 2
            if (r7 > r12) goto L27
            java.lang.String r8 = "::"
            boolean r8 = kotlin.text.StringsKt.K(r11, r10, r8)
            if (r8 == 0) goto L27
            if (r5 == r3) goto L1f
            goto L7a
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r7 != r12) goto L25
            goto L76
        L25:
            r6 = r7
            goto L49
        L27:
            if (r4 == 0) goto L33
            java.lang.String r7 = ":"
            boolean r7 = kotlin.text.StringsKt.K(r11, r10, r7)
            if (r7 == 0) goto L35
            int r11 = r11 + 1
        L33:
            r6 = r11
            goto L49
        L35:
            java.lang.String r7 = "."
            boolean r11 = kotlin.text.StringsKt.K(r11, r10, r7)
            if (r11 == 0) goto L7a
            int r11 = r4 + (-2)
            boolean r10 = decodeIpv4Suffix(r10, r6, r12, r1, r11)
            if (r10 != 0) goto L46
            goto L7a
        L46:
            int r4 = r4 + 2
            goto L76
        L49:
            r7 = r2
            r11 = r6
        L4b:
            if (r11 >= r12) goto L5d
            char r8 = r10.charAt(r11)
            int r8 = okhttp3.internal.Util.parseHexDigit(r8)
            if (r8 == r3) goto L5d
            int r7 = r7 << 4
            int r7 = r7 + r8
            int r11 = r11 + 1
            goto L4b
        L5d:
            int r8 = r11 - r6
            if (r8 == 0) goto L7a
            r9 = 4
            if (r8 <= r9) goto L65
            goto L7a
        L65:
            int r8 = r4 + 1
            int r9 = r7 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r8] = r7
            goto L9
        L76:
            if (r4 == r0) goto L88
            if (r5 != r3) goto L7c
        L7a:
            r10 = 0
            return r10
        L7c:
            int r10 = r4 - r5
            int r11 = 16 - r10
            java.lang.System.arraycopy(r1, r5, r1, r11, r10)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L88:
            java.net.InetAddress r10 = java.net.InetAddress.getByAddress(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l9.l] */
    private static final String inet6AddressToAscii(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        ?? obj = new Object();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                obj.m0(58);
                i11 += i13;
                if (i11 == 16) {
                    obj.m0(58);
                }
            } else {
                if (i11 > 0) {
                    obj.m0(58);
                }
                obj.o0((Util.and(bArr[i11], 255) << 8) | Util.and(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return obj.h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toCanonicalHost(java.lang.String r4) {
        /*
            r4.getClass()
            java.lang.String r0 = ":"
            boolean r0 = kotlin.text.StringsKt.o(r4, r0)
            if (r0 == 0) goto L62
            java.lang.String r0 = "["
            boolean r0 = kotlin.text.StringsKt.M(r4, r0)
            if (r0 == 0) goto L26
            java.lang.String r0 = "]"
            boolean r0 = kotlin.text.StringsKt.r(r4, r0)
            if (r0 == 0) goto L26
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            java.net.InetAddress r0 = decodeIpv6(r4, r1, r0)
            goto L2f
        L26:
            int r0 = r4.length()
            r1 = 0
            java.net.InetAddress r0 = decodeIpv6(r4, r1, r0)
        L2f:
            if (r0 != 0) goto L32
            goto L84
        L32:
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L40
            java.lang.String r4 = inet6AddressToAscii(r1)
            return r4
        L40:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L49
            java.lang.String r4 = r0.getHostAddress()
            return r4
        L49:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.<init>(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L62:
            java.lang.String r4 = java.net.IDN.toASCII(r4)     // Catch: java.lang.IllegalArgumentException -> L84
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L84
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L84
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L84
            java.lang.String r4 = r4.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L84
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L84
            int r0 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L84
            if (r0 != 0) goto L7c
            goto L84
        L7c:
            boolean r0 = containsInvalidHostnameAsciiCodes(r4)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r0 == 0) goto L83
            goto L84
        L83:
            return r4
        L84:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.toCanonicalHost(java.lang.String):java.lang.String");
    }
}
