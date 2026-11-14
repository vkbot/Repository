package n7;

import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements u0, r0 {
    public static final h c = new h(0);
    public static final byte[] d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4209b;

    public h(SSLSession sSLSession) {
        this.f4209b = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e) {
            x.d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e);
        }
    }

    public String a() {
        switch (this.f4209b) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    @Override // n7.u0
    /* renamed from: b, reason: collision with other method in class */
    public byte[] mo1561b(Object obj) {
        switch (this.f4209b) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(i4.b.f2771b);
                int i10 = 0;
                while (i10 < bytes.length) {
                    byte b10 = bytes[i10];
                    if (b10 >= 32 && b10 < 126 && b10 != 37) {
                        i10++;
                    } else {
                        byte[] bArr = new byte[((bytes.length - i10) * 3) + i10];
                        if (i10 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i10);
                        }
                        int i11 = i10;
                        while (i10 < bytes.length) {
                            byte b11 = bytes[i10];
                            if (b11 >= 32 && b11 < 126 && b11 != 37) {
                                bArr[i11] = b11;
                                i11++;
                            } else {
                                bArr[i11] = 37;
                                byte[] bArr2 = d;
                                bArr[i11 + 1] = bArr2[(b11 >> 4) & 15];
                                bArr[i11 + 2] = bArr2[b11 & 15];
                                i11 += 3;
                            }
                            i10++;
                        }
                        return Arrays.copyOf(bArr, i11);
                    }
                }
                return bytes;
            default:
                return ((f1) obj).f4204a.c;
        }
    }

    public int c(Object obj) {
        switch (this.f4209b) {
            case 6:
                ((k0) obj).getClass();
                return 5;
            case 7:
                ((p7.i) ((n0) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, p7.i.class.getClassLoader());
                    return 8;
                } catch (Exception unused) {
                    return 3;
                }
            default:
                ((a1) obj).getClass();
                return 5;
        }
    }

    @Override // n7.u0
    public Object k(byte[] bArr) {
        int i10;
        byte b10;
        switch (this.f4209b) {
            case 1:
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b11 = bArr[i11];
                    if (b11 < 32 || b11 >= 126 || (b11 == 37 && i11 + 2 < bArr.length)) {
                        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                        int i12 = 0;
                        while (i12 < bArr.length) {
                            if (bArr[i12] == 37 && i12 + 2 < bArr.length) {
                                try {
                                    allocate.put((byte) Integer.parseInt(new String(bArr, i12 + 1, 2, i4.b.f2770a), 16));
                                    i12 += 3;
                                } catch (NumberFormatException unused) {
                                }
                            }
                            allocate.put(bArr[i12]);
                            i12++;
                        }
                        return new String(allocate.array(), 0, allocate.position(), i4.b.f2771b);
                    }
                }
                return new String(bArr, 0);
            default:
                char c10 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return f1.e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                        i10 = (b10 - 48) * 10;
                        c10 = 1;
                    }
                    return f1.f4195g.h("Unknown code ".concat(new String(bArr, i4.b.f2770a)));
                }
                i10 = 0;
                byte b12 = bArr[c10];
                if (b12 >= 48 && b12 <= 57) {
                    int i13 = (b12 - 48) + i10;
                    List list = f1.d;
                    if (i13 < list.size()) {
                        return (f1) list.get(i13);
                    }
                }
                return f1.f4195g.h("Unknown code ".concat(new String(bArr, i4.b.f2770a)));
        }
    }

    public String toString() {
        switch (this.f4209b) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    @Override // n7.r0
    public Object j(String str) {
        return str;
    }

    public /* synthetic */ h(int i10) {
        this.f4209b = i10;
    }

    @Override // n7.r0
    public String b(Object obj) {
        return (String) obj;
    }
}
