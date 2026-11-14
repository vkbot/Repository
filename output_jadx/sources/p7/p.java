package p7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends q {
    public static final a5.h d;
    public static final a5.h e;

    /* renamed from: f, reason: collision with root package name */
    public static final a5.h f5092f;

    /* renamed from: g, reason: collision with root package name */
    public static final a5.h f5093g;

    /* renamed from: h, reason: collision with root package name */
    public static final a5.h f5094h;

    /* renamed from: i, reason: collision with root package name */
    public static final a5.h f5095i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f5096j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f5097k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f5098l;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f5099m;

    /* renamed from: n, reason: collision with root package name */
    public static final Method f5100n;

    /* renamed from: o, reason: collision with root package name */
    public static final Method f5101o;

    /* renamed from: p, reason: collision with root package name */
    public static final Constructor f5102p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class<?> cls;
        Logger logger = q.f5103b;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        int i10 = 25;
        d = new a5.h(constructor, "setUseSessionTickets", new Class[]{cls2}, i10);
        e = new a5.h(constructor, "setHostname", new Class[]{String.class}, i10);
        Class<byte[]> cls3 = byte[].class;
        f5092f = new a5.h(cls3, "getAlpnSelectedProtocol", new Class[0], i10);
        f5093g = new a5.h(constructor, "setAlpnProtocols", new Class[]{byte[].class}, i10);
        f5094h = new a5.h(cls3, "getNpnSelectedProtocol", new Class[0], i10);
        f5095i = new a5.h(constructor, "setNpnProtocols", new Class[]{byte[].class}, i10);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                    } catch (ClassNotFoundException e6) {
                        e = e6;
                        method4 = null;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f5098l = method;
                    f5099m = method2;
                    f5100n = method3;
                    f5096j = method4;
                    f5097k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e12) {
                        e = e12;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        f5101o = method6;
                        f5102p = constructor;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        f5101o = method6;
                        f5102p = constructor;
                    }
                    f5101o = method6;
                    f5102p = constructor;
                } catch (NoSuchMethodException e14) {
                    e = e14;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f5098l = method;
                    f5099m = method2;
                    f5100n = method3;
                    f5096j = method4;
                    f5097k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f5101o = method6;
                    f5102p = constructor;
                }
            } catch (ClassNotFoundException e15) {
                e = e15;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f5098l = method;
                f5099m = method2;
                f5100n = method3;
                f5096j = method4;
                f5097k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f5101o = method6;
                f5102p = constructor;
            } catch (NoSuchMethodException e16) {
                e = e16;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f5098l = method;
                f5099m = method2;
                f5100n = method3;
                f5096j = method4;
                f5097k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f5101o = method6;
                f5102p = constructor;
            }
        } catch (ClassNotFoundException e17) {
            e = e17;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e18) {
            e = e18;
            method = null;
            method2 = null;
        }
        try {
            method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
        } catch (ClassNotFoundException e19) {
            e = e19;
            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
            method5 = null;
            f5098l = method;
            f5099m = method2;
            f5100n = method3;
            f5096j = method4;
            f5097k = method5;
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            f5101o = method6;
            f5102p = constructor;
        } catch (NoSuchMethodException e20) {
            e = e20;
            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
            method5 = null;
            f5098l = method;
            f5099m = method2;
            f5100n = method3;
            f5096j = method4;
            f5097k = method5;
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            f5101o = method6;
            f5102p = constructor;
        }
        f5098l = method;
        f5099m = method2;
        f5100n = method3;
        f5096j = method4;
        f5097k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e21) {
            e = e21;
            method6 = null;
        } catch (NoSuchMethodException e22) {
            e = e22;
            method6 = null;
        }
        f5101o = method6;
        f5102p = constructor;
    }

    @Override // p7.q
    public final void a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q7.l) it.next()).f5332b);
        }
        boolean z9 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (q.c(str)) {
                        Method method2 = f5096j;
                        if (method2 != null && ((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f5097k.invoke(null, sSLSocket, Boolean.TRUE);
                        } else {
                            d.q(sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f5101o;
                        if (method3 != null && (constructor = f5102p) != null) {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        } else {
                            e.q(sSLSocket, str);
                        }
                    }
                } catch (InvocationTargetException e6) {
                    n0.b.w(e6);
                    return;
                }
            } catch (IllegalAccessException e10) {
                n0.b.w(e10);
                return;
            } catch (InstantiationException e11) {
                n0.b.w(e11);
                return;
            }
        }
        Method method4 = f5100n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f5098l.invoke(sSLParameters, strArr);
                z9 = true;
            } catch (InvocationTargetException e12) {
                if (e12.getTargetException() instanceof UnsupportedOperationException) {
                    q.f5103b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                } else {
                    throw e12;
                }
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z9 && (method = f5099m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {q7.k.b(list)};
        q7.k kVar = this.f5104a;
        if (kVar.e() == 1) {
            f5093g.r(sSLSocket, objArr);
        }
        if (kVar.e() != 3) {
            f5095i.r(sSLSocket, objArr);
        } else {
            ai.onnxruntime.b.h("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    @Override // p7.q
    public final String b(SSLSocket sSLSocket) {
        Logger logger = q.f5103b;
        Method method = f5100n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e6) {
                n0.b.w(e6);
                return null;
            } catch (InvocationTargetException e10) {
                if (e10.getTargetException() instanceof UnsupportedOperationException) {
                    logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    n0.b.w(e10);
                    return null;
                }
            }
        }
        q7.k kVar = this.f5104a;
        if (kVar.e() == 1) {
            try {
                byte[] bArr = (byte[]) f5092f.r(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, q7.n.f5338b);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e11);
            }
        }
        if (kVar.e() != 3) {
            try {
                byte[] bArr2 = (byte[]) f5094h.r(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, q7.n.f5338b);
                }
            } catch (Exception e12) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e12);
            }
        }
        return null;
    }

    @Override // p7.q
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String b10 = b(sSLSocket);
        if (b10 == null) {
            return super.d(sSLSocket, str, list);
        }
        return b10;
    }
}
