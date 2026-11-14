package p7;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5106a = Collections.unmodifiableList(Arrays.asList(q7.l.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i10, q7.c cVar) {
        String[] strArr;
        q7.l lVar;
        String str2;
        o4.b.i(sSLSocketFactory, "sslSocketFactory");
        o4.b.i(socket, "socket");
        o4.b.i(cVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        String[] strArr2 = cVar.f5309b;
        List list = null;
        if (strArr2 != null) {
            strArr = (String[]) q7.n.a(strArr2, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        String[] strArr3 = (String[]) q7.n.a(cVar.c, sSLSocket.getEnabledProtocols());
        q7.b bVar = new q7.b(cVar);
        if (bVar.f5306a) {
            if (strArr == null) {
                bVar.f5307b = null;
            } else {
                bVar.f5307b = (String[]) strArr.clone();
            }
            if (bVar.f5306a) {
                if (strArr3 == null) {
                    bVar.c = null;
                } else {
                    bVar.c = (String[]) strArr3.clone();
                }
                q7.c cVar2 = new q7.c(bVar);
                sSLSocket.setEnabledProtocols(cVar2.c);
                String[] strArr4 = cVar2.f5309b;
                if (strArr4 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr4);
                }
                q qVar = q.c;
                boolean z9 = cVar.d;
                List list2 = f5106a;
                if (z9) {
                    list = list2;
                }
                String d = qVar.d(sSLSocket, str, list);
                if (d.equals("http/1.0")) {
                    lVar = q7.l.HTTP_1_0;
                } else if (d.equals("http/1.1")) {
                    lVar = q7.l.HTTP_1_1;
                } else if (d.equals("h2")) {
                    lVar = q7.l.HTTP_2;
                } else if (d.equals("spdy/3.1")) {
                    lVar = q7.l.SPDY_3;
                } else {
                    n0.b.A("Unexpected protocol: ".concat(d));
                    return null;
                }
                o4.b.l("Only " + list2 + " are supported, but negotiated protocol is %s", list2.contains(lVar), d);
                q7.e eVar = q7.e.f5314a;
                if (str.startsWith("[") && str.endsWith("]")) {
                    str2 = str.substring(1, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (eVar.verify(str2, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
            }
            j1.i.l("no TLS versions for cleartext connections");
            return null;
        }
        j1.i.l("no cipher suites for cleartext connections");
        return null;
    }
}
