package d1;

import android.content.Context;
import com.google.protobuf.q;
import e0.m;
import e0.p3;
import e0.x1;
import j1.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.net.tftp.TFTP;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final String f1714b;
    public final int c;
    public final b d;
    public Socket e;

    static {
        m.h(new byte[]{-124, -89, 74, -5, -1, -62, -35, -27, -124}, new byte[]{-75, -107, 125, -43, -49, -20, -19, -53});
    }

    public a(Context context, String str) {
        KeyPair generateKeyPair;
        byte[] encoded;
        FileOutputStream fileOutputStream;
        byte[] encoded2;
        b bVar;
        S();
        String trim = str.trim();
        if (!trim.isEmpty()) {
            this.f1714b = trim;
            this.c = 5555;
            File file = new File(context.getFilesDir(), m.h(new byte[]{-106, 70, -1}, new byte[]{-9, 34, -99, -85, 49, 74, 0, 20}));
            if (!file.exists() && !file.mkdirs()) {
                n0.b.A(m.h(new byte[]{47, 88, -8, 57, -92, -42, 38, -57, 75, 21, -104, 92, 63, -41, 27, -58, 126, 20, -92, -84, 85, -122, 117, -87, 47, 114, -8, 56, 84, -73, 116, -107, 46, 73, 8, 93, 1, -42, 37, -57, 79, 21, -107, 92, 60, -41, 30, -57, 71, 20, -95, 92, 49, 39, -28, 83, -67, -24, -8, 54, 84, -68, 116, -103, 46, 66, -8, 60}, new byte[]{-1, -59, 40, -116, -124, 7, -91, 23}));
                throw null;
            }
            byte[] bArr = b.f1715b;
            File file2 = new File(file, m.h(new byte[]{17, 66, 4, ByteCompanionObject.MIN_VALUE, -31, 105}, new byte[]{112, 38, 102, -21, -124, 16, 43, 41}));
            File file3 = new File(file, m.h(new byte[]{-32, 46, -58, -1, -48, -3, -55, 0, -12, 40}, new byte[]{-127, 74, -92, -108, -75, -124, -25, 112}));
            try {
                try {
                    if (file2.isFile() && file3.isFile()) {
                        try {
                            KeyFactory keyFactory = KeyFactory.getInstance(m.h(new byte[]{-98, 118, 55}, new byte[]{-52, 37, 118, 53, 63, 99, 72, 36}));
                            bVar = new b(new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(b.a(file3))), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(b.a(file2)))));
                        } catch (IOException | GeneralSecurityException unused) {
                        }
                        this.d = bVar;
                        return;
                    }
                    fileOutputStream.write(encoded2);
                    fileOutputStream.close();
                    bVar = new b(generateKeyPair);
                    this.d = bVar;
                    return;
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                fileOutputStream.write(encoded);
                fileOutputStream.close();
                encoded2 = generateKeyPair.getPublic().getEncoded();
                fileOutputStream = new FileOutputStream(file3);
            } catch (Throwable th2) {
                throw th2;
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(m.h(new byte[]{118, 31, 87}, new byte[]{36, 76, 22, 100, 73, 23, -34, -11}));
            keyPairGenerator.initialize(2048);
            generateKeyPair = keyPairGenerator.generateKeyPair();
            encoded = generateKeyPair.getPrivate().getEncoded();
            fileOutputStream = new FileOutputStream(file2);
        } else {
            i.k(m.h(new byte[]{-15, 5, -117, 85, 22, 38, 67, -81, -15, 47, -118, 101, 22, 38, -77, -53, -111, 71, -17, 54, 70, 67, 38, -54, -96, -73, 26, -93, -124}, new byte[]{33, -105, 91, -25, -58, -109, -109, 27}));
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void S() {
        /*
            r0 = 8
            java.lang.Boolean r1 = c()     // Catch: java.lang.Exception -> L73
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L73
            if (r1 == 0) goto L73
            h0.b.a()     // Catch: java.lang.Exception -> L73
            u0.a r1 = h0.b.o()     // Catch: java.lang.Exception -> L73
            byte[] r2 = e0.m.f1969f     // Catch: java.lang.Exception -> L73
            java.lang.String[] r3 = e0.p3.f2001a     // Catch: java.lang.Exception -> L73
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Exception -> L73
            r3.<init>(r2)     // Catch: java.lang.Exception -> L73
            byte[] r2 = e0.m.f1970g     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L73
            r4.<init>(r2)     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = r1.loadString(r3, r4)     // Catch: java.lang.Exception -> L73
            u0.a r2 = h0.b.o()     // Catch: java.lang.Exception -> L73
            r3 = 1
            byte[] r4 = new byte[r3]     // Catch: java.lang.Exception -> L73
            r5 = 0
            r6 = -9
            r4[r5] = r6     // Catch: java.lang.Exception -> L73
            byte[] r6 = new byte[r0]     // Catch: java.lang.Exception -> L73
            r6 = {x0092: FILL_ARRAY_DATA , data: [-57, -14, 11, 47, 90, -86, 92, -75} // fill-array     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = e0.m.h(r4, r6)     // Catch: java.lang.Exception -> L73
            java.lang.String r1 = r2.loadString(r1, r4)     // Catch: java.lang.Exception -> L73
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L73
            byte[] r1 = android.util.Base64.decode(r1, r5)     // Catch: java.lang.Exception -> L73
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L73
            r2.<init>(r1, r4)     // Catch: java.lang.Exception -> L73
            long r1 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L73
            h0.b r4 = h0.b.a()     // Catch: java.lang.Exception -> L73
            com.example.navistart.cores.InterC r4 = r4.j()     // Catch: java.lang.Exception -> L73
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L73
            java.lang.Long r4 = r4.l(r6)     // Catch: java.lang.Exception -> L73
            long r6 = r4.longValue()     // Catch: java.lang.Exception -> L73
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L6d
            goto L6e
        L6d:
            r3 = r5
        L6e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L73
            goto L75
        L73:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L75:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7c
            return
        L7c:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r2 = 85
            byte[] r2 = new byte[r2]
            r2 = {x009a: FILL_ARRAY_DATA , data: [-38, -5, 102, 41, 77, -97, 95, 88, -38, -35, 102, 38, 76, -95, 94, 98, 42, -80, 11, 65, 41, 57, 95, 93, -38, -38, 103, 19, 76, -95, 95, 95, -38, -35, 102, 33, -68, -55, 55, 61, -79, -80, 14, -79, 77, -104, 94, 109, -38, -34, 102, 43, -68, -55, 58, 60, -101, 64, 102, 37, 76, -84, 95, 84, -37, -31, 103, 19, 76, -85, 95, 85, -37, -17, -106, 65, 36, -56, 14, 60, -120, -79, 39, 65, 38} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x00ca: FILL_ARRAY_DATA , data: [10, 96, -74, -111, -100, 25, -113, -19} // fill-array
            java.lang.String r0 = e0.m.h(r2, r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a.S():void");
    }

    public static Boolean c() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        return Boolean.valueOf(q.g(sb, x1.f2066q).equals(h0.b.o().loadString(new String(m.f1969f), "")));
    }

    public final String V(String str) {
        int i10;
        int i11;
        boolean z9 = false;
        c.d(this.e.getOutputStream(), c.f1720i, 1, 0, (m.h(new byte[]{-88, Base64.padSymbol, -62, ByteCompanionObject.MAX_VALUE, 12, -85}, new byte[]{-37, 85, -89, 19, 96, -111, -98, -78}) + str + "\u0000").getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i12 = 0;
        while (true) {
            c b10 = c.b(this.e.getInputStream());
            i10 = b10.f1723b;
            int i13 = b10.c;
            int i14 = b10.f1722a;
            int i15 = c.f1719h;
            if (i14 == i15 && i13 == 1) {
                z9 = true;
            } else if (i14 == c.f1721j && i13 == 1) {
                byteArrayOutputStream.write(b10.d);
                c.d(this.e.getOutputStream(), i15, 1, i10, null);
            } else {
                i11 = c.f1717f;
                if (i14 == i11 && i13 == 1) {
                    break;
                }
            }
            i12 = i10;
        }
        if (z9) {
            OutputStream outputStream = this.e.getOutputStream();
            if (i12 == 0) {
                i12 = i10;
            }
            c.d(outputStream, i11, 1, i12, null);
            return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
        }
        n0.b.A(m.h(new byte[]{-110, -29, 36, 22, -10, -105, -17, 117, 3, 29, -74, -115, -10, -105, -18, 74, 3, 31, -74, -115, 6, -7, -119, 39, 99, 119, -39, -25, -91, -8, -65, 39, 105, -121, -74, -116, -10, -105, -18, 75, 3, 23, -74, -117, -10, -99, -17, 124}, new byte[]{-45, -89, 102, 54, 38, 41, 62, -9}));
        return null;
    }

    public final void b() {
        c.d(this.e.getOutputStream(), c.f1718g, 16777216, 4096, m.h(new byte[]{69, 8, 26, -1, 21, -123, -99}, new byte[]{45, 103, 105, -117, 47, -65, -99, -101}).getBytes(StandardCharsets.UTF_8));
        boolean z9 = false;
        while (true) {
            c b10 = c.b(this.e.getInputStream());
            int i10 = b10.f1722a;
            if (i10 == c.f1718g) {
                return;
            }
            int i11 = c.e;
            if (i10 != i11 || b10.f1723b != 1) {
                break;
            }
            Socket socket = this.e;
            b bVar = this.d;
            if (!z9) {
                OutputStream outputStream = socket.getOutputStream();
                byte[] bArr = b10.d;
                bVar.getClass();
                Cipher cipher = Cipher.getInstance(m.h(new byte[]{105, 56, -82, -5, -62, 62, 24, -45, 117, 4, -65, -75, -29, 25, 51, -110, 92}, new byte[]{59, 107, -17, -44, -121, 125, 90, -4}));
                cipher.init(1, bVar.f1716a.getPrivate());
                cipher.update(b.f1715b);
                c.d(outputStream, i11, 2, 0, cipher.doFinal(bArr));
                z9 = true;
            } else {
                OutputStream outputStream2 = socket.getOutputStream();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) bVar.f1716a.getPublic();
                BigInteger bigInteger = BigInteger.ZERO;
                BigInteger bit = bigInteger.setBit(32);
                BigInteger modulus = rSAPublicKey.getModulus();
                BigInteger modPow = bigInteger.setBit(2048).modPow(BigInteger.valueOf(2L), modulus);
                int intValue = modulus.remainder(bit).modInverse(bit).negate().intValue();
                ByteBuffer order = ByteBuffer.allocate(524).order(ByteOrder.LITTLE_ENDIAN);
                order.putInt(64);
                order.putInt(intValue);
                int i12 = 0;
                while (i12 < 64) {
                    BigInteger[] divideAndRemainder = modulus.divideAndRemainder(bit);
                    BigInteger bigInteger2 = divideAndRemainder[0];
                    order.putInt(divideAndRemainder[1].intValue());
                    i12++;
                    modulus = bigInteger2;
                }
                int i13 = 0;
                while (i13 < 64) {
                    BigInteger[] divideAndRemainder2 = modPow.divideAndRemainder(bit);
                    BigInteger bigInteger3 = divideAndRemainder2[0];
                    order.putInt(divideAndRemainder2[1].intValue());
                    i13++;
                    modPow = bigInteger3;
                }
                order.putInt(rSAPublicKey.getPublicExponent().intValue());
                c.d(outputStream2, i11, 3, 0, q.i(new byte[]{-16, ByteCompanionObject.MIN_VALUE, 21, 122, 87, 125, -42, -122, -68, -103, 54, 122, 75, 109, -53, -122, -71, -114, 118}, new byte[]{-48, -22, 118, 27, 37, 9, -71, -23}, ai.onnxruntime.a.u(android.util.Base64.encodeToString(order.array(), 2))).getBytes(StandardCharsets.UTF_8));
            }
        }
        n0.b.A(m.h(new byte[]{119, 31, -57, 24, 52, 48, -45, -46, 119, 58, -57, 25, 52, 62, -45, -39, 119, 63, -58, 38, 52, 55, 35, -76, 25, 83, -107, 125, 86, 94, -74, -75, 37, -94, 86, -23, -90, -82, -45, -37, 118, 2, -57, 21, -60, 94, -68, -76, 25, 82, -93, 125, 94, 94, -72, -75, 41, 83, -112, 125, 81, 94, -66, -76, 31, 82, -81}, new byte[]{-89, -126, 23, -83, -28, -114, 3, 100}));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Socket socket = this.e;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            this.e = null;
        }
    }

    public final String y(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            S();
            Socket socket = new Socket();
            this.e = socket;
            socket.connect(new InetSocketAddress(this.f1714b, this.c), TFTP.DEFAULT_TIMEOUT);
            this.e.setSoTimeout(30000);
            try {
                try {
                    b();
                    return V(trim);
                } catch (SocketTimeoutException e) {
                    throw new IOException(m.h(new byte[]{-35, 87, -98, -85, -86, 65, -14, -14, -35, 117, -97, -111, -85, 125, 2, -105, -65, 30, -49, -6, -50, 19, -98, -106, -126, -17, -97, -108, -85, 117, -14, -1, -35, 123, -97, -102, -85, 126, -14, -1, -36, 64, 111, 107, 63, -127, 12, 103, -35, 80, -98, -86, -85, 125, -14, -11, -35, 122, -98, -86, -86, 79, -13, -59, -35, 122, 111, -6, -53, 19, -106, -106, -115, 31, -6, -5, -6, -29, -14, -1, 45, 31, -16, -6, -59, 19, -106, -106, -113, 31, -3, -6, -50, 18, -94, -105, -69, 31, -5, -6, -50, 19, -97, -105, -75, 31, -6, 10, 41, -112, 99, 106, -35, 117, -97, -111, -86, 77, -13, -64, -35, ByteCompanionObject.MAX_VALUE, 97}, new byte[]{13, -49, 79, 42, 123, -61, 34, 71}), e);
                }
            } finally {
                close();
            }
        }
        i.k(m.h(new byte[]{-3, -123, 49, 12, -77, -100, 121, -75, -3, -81, 48, 60, -77, -100, -119, -47, -105, -57, 95, 110, -33, -7, 25, -47, -112, -57, 85, 111, -32}, new byte[]{45, 23, -31, -66, 99, 41, -87, 1}));
        return null;
    }
}
