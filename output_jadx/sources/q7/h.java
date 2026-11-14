package q7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends k {
    public final Method e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f5321f;

    public h(Provider provider, Method method, Method method2) {
        super(provider);
        this.e = method;
        this.f5321f = method2;
    }

    @Override // q7.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f5332b);
            }
        }
        try {
            this.e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            n0.b.w(e);
        } catch (InvocationTargetException e6) {
            n0.b.w(e6);
        }
    }

    @Override // q7.k
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f5321f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            n0.b.w(e);
            return null;
        } catch (InvocationTargetException e6) {
            n0.b.w(e6);
            return null;
        }
    }

    @Override // q7.k
    public final int e() {
        return 1;
    }
}
