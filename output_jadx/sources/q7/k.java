package q7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.commons.net.imap.IMAPSClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f5328b;
    public static final String[] c;
    public static final k d;

    /* renamed from: a, reason: collision with root package name */
    public final Provider f5329a;

    static {
        Object obj;
        Provider provider;
        Provider provider2;
        k kVar;
        int i10;
        Logger logger = Logger.getLogger(k.class.getName());
        f5328b = logger;
        c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i11 = 0;
        loop0: while (true) {
            obj = null;
            if (i11 < length) {
                Provider provider3 = providers[i11];
                for (String str : c) {
                    if (str.equals(provider3.getClass().getName())) {
                        logger.log(Level.FINE, "Found registered provider {0}", str);
                        provider = provider3;
                        break loop0;
                    }
                }
                i11++;
            } else {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
        }
        int i12 = 2;
        if (provider != null) {
            int i13 = 25;
            a5.h hVar = new a5.h(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i13);
            a5.h hVar2 = new a5.h(obj, "setHostname", new Class[]{String.class}, i13);
            a5.h hVar3 = new a5.h(byte[].class, "getAlpnSelectedProtocol", new Class[0], i13);
            a5.h hVar4 = new a5.h(obj, "setAlpnProtocols", new Class[]{byte[].class}, i13);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    k.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e6) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e6);
                        i12 = 3;
                    }
                    i10 = i12;
                }
            }
            i10 = 1;
            kVar = new g(hVar, hVar2, hVar3, hVar4, provider, i10);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance(IMAPSClient.DEFAULT_PROTOCOL, provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new f(0))).invoke(sSLContext.createSSLEngine(), null);
                        kVar = new h(provider4, (Method) AccessController.doPrivileged(new f(1)), (Method) AccessController.doPrivileged(new f(2)));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        kVar = new k(provider2);
                        d = kVar;
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        kVar = new i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        kVar = new k(provider2);
                        d = kVar;
                    }
                }
            } catch (NoSuchAlgorithmException e10) {
                n0.b.w(e10);
                return;
            }
        }
        d = kVar;
    }

    public k(Provider provider) {
        this.f5329a = provider;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l9.l] */
    public static byte[] b(List list) {
        ?? obj = new Object();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) list.get(i10);
            if (lVar != l.HTTP_1_0) {
                obj.m0(lVar.f5332b.length());
                obj.u0(lVar.f5332b);
            }
        }
        return obj.f0(obj.c);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
