package o7;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h3 {
    public static final Logger d = Logger.getLogger(h3.class.getName());
    public static final u2 e = new u2(17);

    /* renamed from: f, reason: collision with root package name */
    public static final u2 f4544f = new u2(18);

    /* renamed from: a, reason: collision with root package name */
    public final u2 f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final u2 f4546b;
    public final InetSocketAddress c;

    public h3() {
        int i10;
        String str = System.getenv("GRPC_PROXY_EXP");
        u2 u2Var = f4544f;
        u2Var.getClass();
        this.f4545a = u2Var;
        u2 u2Var2 = e;
        u2Var2.getClass();
        this.f4546b = u2Var2;
        if (str != null) {
            String[] split = str.split(":", 2);
            if (split.length > 1) {
                i10 = Integer.parseInt(split[1]);
            } else {
                i10 = 80;
            }
            d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.c = new InetSocketAddress(split[0], i10);
            return;
        }
        this.c = null;
    }

    public final n7.u a(InetSocketAddress inetSocketAddress) {
        URL url;
        n7.u uVar;
        String str = null;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.c;
            if (inetSocketAddress2 != null) {
                return new n7.u(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = d;
            try {
                try {
                    URI uri = new URI("https", null, y0.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.f4545a.r();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> select = proxySelector.select(uri);
                    if (select.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String d10 = y0.d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.f4546b.getClass();
                        try {
                            url = new URL("https", d10, port, "");
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", d10});
                            url = null;
                        }
                        PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(d10, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i10 = n7.u.f4245f;
                        if (requestPasswordAuthentication == null) {
                            uVar = new n7.u(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            String userName = requestPasswordAuthentication.getUserName();
                            if (requestPasswordAuthentication.getPassword() != null) {
                                str = new String(requestPasswordAuthentication.getPassword());
                            }
                            uVar = new n7.u(inetSocketAddress3, inetSocketAddress, userName, str);
                        }
                        return uVar;
                    }
                } catch (URISyntaxException e6) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e6);
                    return null;
                }
            } catch (Throwable th) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
                return null;
            }
        }
        return null;
    }
}
