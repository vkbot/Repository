package p7;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import o7.y0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f5103b;
    public static final q c;

    /* renamed from: a, reason: collision with root package name */
    public final q7.k f5104a;

    static {
        q qVar;
        Logger logger = Logger.getLogger(q.class.getName());
        f5103b = logger;
        q7.k kVar = q7.k.d;
        ClassLoader classLoader = q.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e6) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e6);
                qVar = new q(kVar);
            }
        }
        qVar = new q(kVar);
        c = qVar;
    }

    public q(q7.k kVar) {
        o4.b.i(kVar, "platform");
        this.f5104a = kVar;
    }

    public static boolean c(String str) {
        boolean z9;
        if (str.contains("_")) {
            return false;
        }
        try {
            if (y0.a(str).getAuthority().indexOf(64) == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            o4.b.e("Userinfo must not be present on authority: '%s'", z9, str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.f5104a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f5104a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        q7.k kVar = this.f5104a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b10 = b(sSLSocket);
            if (b10 != null) {
                return b10;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            kVar.a(sSLSocket);
        }
    }
}
