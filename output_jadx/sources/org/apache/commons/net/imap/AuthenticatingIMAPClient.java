package org.apache.commons.net.imap;

import javax.net.ssl.SSLContext;
import kotlin.UByte;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class AuthenticatingIMAPClient extends IMAPSClient {
    private static final String MAC_ALGORITHM = "HmacMD5";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5"),
        LOGIN("LOGIN"),
        XOAUTH("XOAUTH"),
        XOAUTH2("XOAUTH2");

        private final String authName;

        AUTH_METHOD(String str) {
            this.authName = str;
        }

        public String getAuthName() {
            return this.authName;
        }
    }

    public AuthenticatingIMAPClient() {
        this(IMAPSClient.DEFAULT_PROTOCOL, false);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x010b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean auth(org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.AUTHENTICATE
            java.lang.String r1 = r7.getAuthName()
            int r0 = r6.sendCommand(r0, r1)
            boolean r0 = org.apache.commons.net.imap.IMAPReply.isContinuation(r0)
            r1 = 0
            if (r0 != 0) goto L13
            goto L10c
        L13:
            int r7 = r7.ordinal()
            r0 = 1
            if (r7 == 0) goto Lda
            r2 = 2
            if (r7 == r0) goto L6d
            r3 = 3
            if (r7 == r2) goto L36
            if (r7 == r3) goto L27
            r9 = 4
            if (r7 == r9) goto L27
            goto L10c
        L27:
            int r7 = r6.sendData(r8)
            if (r7 != 0) goto L32
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.setState(r8)
        L32:
            if (r7 != 0) goto L10c
            goto L10b
        L36:
            java.util.Base64$Encoder r7 = org.apache.commons.io.filefilter.f.q()
            java.nio.charset.Charset r2 = r6.getCharset()
            byte[] r8 = r8.getBytes(r2)
            java.lang.String r7 = org.apache.commons.io.filefilter.f.d(r7, r8)
            int r7 = r6.sendData(r7)
            if (r7 == r3) goto L4e
            goto L10c
        L4e:
            java.util.Base64$Encoder r7 = org.apache.commons.io.filefilter.f.q()
            java.nio.charset.Charset r8 = r6.getCharset()
            byte[] r8 = r9.getBytes(r8)
            java.lang.String r7 = org.apache.commons.io.filefilter.f.d(r7, r8)
            int r7 = r6.sendData(r7)
            if (r7 != 0) goto L69
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.setState(r8)
        L69:
            if (r7 != 0) goto L10c
            goto L10b
        L6d:
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
            int r7 = r6.sendData(r7)
            if (r7 != 0) goto Ld7
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.setState(r8)
        Ld7:
            if (r7 != 0) goto L10c
            goto L10b
        Lda:
            java.util.Base64$Encoder r7 = org.apache.commons.io.filefilter.f.q()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\u0000"
            r2.<init>(r3)
            r2.append(r8)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r8 = r2.toString()
            java.nio.charset.Charset r9 = r6.getCharset()
            byte[] r8 = r8.getBytes(r9)
            java.lang.String r7 = org.apache.commons.io.filefilter.f.d(r7, r8)
            int r7 = r6.sendData(r7)
            if (r7 != 0) goto L109
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.setState(r8)
        L109:
            if (r7 != 0) goto L10c
        L10b:
            return r0
        L10c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.imap.AuthenticatingIMAPClient.auth(org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD, java.lang.String, java.lang.String):boolean");
    }

    public boolean authenticate(AUTH_METHOD auth_method, String str, String str2) {
        return auth(auth_method, str, str2);
    }

    public AuthenticatingIMAPClient(boolean z9) {
        this(IMAPSClient.DEFAULT_PROTOCOL, z9);
    }

    public AuthenticatingIMAPClient(boolean z9, SSLContext sSLContext) {
        this(IMAPSClient.DEFAULT_PROTOCOL, z9, sSLContext);
    }

    public AuthenticatingIMAPClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public AuthenticatingIMAPClient(String str) {
        this(str, false);
    }

    public AuthenticatingIMAPClient(String str, boolean z9) {
        this(str, z9, null);
    }

    public AuthenticatingIMAPClient(String str, boolean z9, SSLContext sSLContext) {
        super(str, z9, sSLContext);
    }
}
