package q7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends k {
    public final Method e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f5322f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f5323g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f5324h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f5325i;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.e = method;
        this.f5322f = method2;
        this.f5323g = method3;
        this.f5324h = cls;
        this.f5325i = cls2;
    }

    @Override // q7.k
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f5323g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            k.f5328b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // q7.k
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) list.get(i10);
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f5332b);
            }
        }
        try {
            this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{this.f5324h, this.f5325i}, new j(arrayList)));
        } catch (IllegalAccessException e) {
            j1.i.e(e);
        } catch (InvocationTargetException e6) {
            j1.i.e(e6);
        }
    }

    @Override // q7.k
    public final String d(SSLSocket sSLSocket) {
        try {
            j jVar = (j) Proxy.getInvocationHandler(this.f5322f.invoke(null, sSLSocket));
            boolean z9 = jVar.f5327b;
            if (!z9 && jVar.c == null) {
                k.f5328b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z9) {
                return null;
            }
            return jVar.c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // q7.k
    public final int e() {
        return 1;
    }
}
