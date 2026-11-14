package org.apache.commons.net.pop3;

import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class ExtendedPOP3Client extends POP3SClient {
    private static final String MAC_ALGORITHM = "HmacMD5";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5");

        private final String methodName;

        AUTH_METHOD(String str) {
            this.methodName = str;
        }

        public String getAuthName() {
            return this.methodName;
        }
    }

    private String convertToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & UByte.MAX_VALUE;
            if (i10 <= 15) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i10));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean auth(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 13
            java.lang.String r1 = r7.getAuthName()
            int r0 = r6.sendCommand(r0, r1)
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L10
            goto Lb5
        L10:
            int r7 = r7.ordinal()
            r0 = 1
            if (r7 == 0) goto L81
            if (r7 == r0) goto L1b
            goto Lb5
        L1b:
            java.util.Base64$Decoder r7 = org.apache.commons.io.filefilter.f.p()
            java.lang.String r3 = r6.getReplyString()
            java.lang.String r2 = r3.substring(r2)
            java.lang.String r2 = r2.trim()
            byte[] r7 = org.apache.commons.io.filefilter.f.u(r7, r2)
            java.lang.String r2 = "HmacMD5"
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r2)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.nio.charset.Charset r5 = r6.getCharset()
            byte[] r9 = r9.getBytes(r5)
            r4.<init>(r9, r2)
            r3.init(r4)
            byte[] r7 = r3.doFinal(r7)
            java.lang.String r7 = r6.convertToHexString(r7)
            java.nio.charset.Charset r9 = r6.getCharset()
            byte[] r7 = r7.getBytes(r9)
            java.nio.charset.Charset r9 = r6.getCharset()
            byte[] r8 = r8.getBytes(r9)
            int r9 = r8.length
            int r9 = r9 + r0
            int r2 = r7.length
            int r9 = r9 + r2
            byte[] r9 = new byte[r9]
            int r2 = r8.length
            java.lang.System.arraycopy(r8, r1, r9, r1, r2)
            int r2 = r8.length
            r3 = 32
            r9[r2] = r3
            int r8 = r8.length
            int r8 = r8 + r0
            int r2 = r7.length
            java.lang.System.arraycopy(r7, r1, r9, r8, r2)
            java.util.Base64$Encoder r7 = org.apache.commons.io.filefilter.f.q()
            java.lang.String r7 = org.apache.commons.io.filefilter.f.d(r7, r9)
            int r7 = r6.sendCommand(r7)
            if (r7 != 0) goto Lb5
            goto Lb4
        L81:
            java.lang.String r7 = new java.lang.String
            java.util.Base64$Encoder r2 = org.apache.commons.io.filefilter.f.q()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\u0000"
            r3.<init>(r4)
            r3.append(r8)
            r3.append(r4)
            r3.append(r9)
            java.lang.String r8 = r3.toString()
            java.nio.charset.Charset r9 = r6.getCharset()
            byte[] r8 = r8.getBytes(r9)
            byte[] r8 = org.apache.commons.io.filefilter.f.w(r2, r8)
            java.nio.charset.Charset r9 = r6.getCharset()
            r7.<init>(r8, r9)
            int r7 = r6.sendCommand(r7)
            if (r7 != 0) goto Lb5
        Lb4:
            return r0
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.pop3.ExtendedPOP3Client.auth(org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD, java.lang.String, java.lang.String):boolean");
    }
}
