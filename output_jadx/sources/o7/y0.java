package o7;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4776a = Logger.getLogger(y0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f4777b = Collections.unmodifiableSet(EnumSet.of(n7.e1.OK, n7.e1.INVALID_ARGUMENT, n7.e1.NOT_FOUND, n7.e1.ALREADY_EXISTS, n7.e1.FAILED_PRECONDITION, n7.e1.ABORTED, n7.e1.OUT_OF_RANGE, n7.e1.DATA_LOSS));
    public static final n7.q0 c;
    public static final n7.q0 d;
    public static final n7.t0 e;

    /* renamed from: f, reason: collision with root package name */
    public static final n7.q0 f4778f;

    /* renamed from: g, reason: collision with root package name */
    public static final n7.t0 f4779g;

    /* renamed from: h, reason: collision with root package name */
    public static final n7.q0 f4780h;

    /* renamed from: i, reason: collision with root package name */
    public static final n7.q0 f4781i;

    /* renamed from: j, reason: collision with root package name */
    public static final n7.q0 f4782j;

    /* renamed from: k, reason: collision with root package name */
    public static final n7.q0 f4783k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f4784l;

    /* renamed from: m, reason: collision with root package name */
    public static final h3 f4785m;

    /* renamed from: n, reason: collision with root package name */
    public static final a9.w f4786n;

    /* renamed from: o, reason: collision with root package name */
    public static final w0 f4787o;

    /* renamed from: p, reason: collision with root package name */
    public static final u2 f4788p;

    /* renamed from: q, reason: collision with root package name */
    public static final u2 f4789q;
    public static final u2 r;

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, o7.w0] */
    static {
        Charset.forName("US-ASCII");
        c = new n7.q0("grpc-timeout", new u2(14));
        n7.h hVar = n7.v0.d;
        d = new n7.q0("grpc-encoding", hVar);
        e = n7.b0.a("grpc-accept-encoding", new u2(13));
        f4778f = new n7.q0("content-encoding", hVar);
        f4779g = n7.b0.a("accept-encoding", new u2(13));
        f4780h = new n7.q0("content-length", hVar);
        f4781i = new n7.q0("content-type", hVar);
        f4782j = new n7.q0("te", hVar);
        f4783k = new n7.q0("user-agent", hVar);
        i4.a.c.getClass();
        f4784l = 20000000000L;
        f4785m = new h3();
        f4786n = new a9.w("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 3);
        f4787o = new Object();
        f4788p = new u2(10);
        f4789q = new u2(11);
        r = new u2(12);
    }

    public static URI a(String str) {
        String str2;
        o4.b.i(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e6) {
                e = e6;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e10) {
            e = e10;
            str2 = str;
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e6) {
            f4776a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e6);
        }
    }

    public static n7.e[] c(n7.c cVar, n7.v0 v0Var, int i10, boolean z9) {
        List list = cVar.d;
        int size = list.size();
        n7.e[] eVarArr = new n7.e[size + 1];
        n7.c cVar2 = n7.c.f4163h;
        j4.b bVar = new j4.b(cVar, i10, z9);
        for (int i11 = 0; i11 < list.size(); i11++) {
            eVarArr[i11] = ((n7.g) list.get(i11)).a(bVar, v0Var);
        }
        eVarArr[size] = f4787o;
        return eVarArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static m4.p e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new m4.p(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o7.x f(n7.f0 r6, boolean r7) {
        /*
            n7.t r0 = r6.f4192a
            n7.f1 r1 = r6.c
            r2 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r0.f()
            o7.k1 r0 = (o7.k1) r0
            o7.g1 r3 = r0.f4593v
            if (r3 == 0) goto L12
            goto L1e
        L12:
            n7.k1 r3 = r0.f4584k
            o7.f1 r4 = new o7.f1
            r5 = 1
            r4.<init>(r0, r5)
            r3.execute(r4)
        L1d:
            r3 = r2
        L1e:
            if (r3 == 0) goto L2b
            n7.g r6 = r6.f4193b
            if (r6 != 0) goto L25
            return r3
        L25:
            o7.t0 r7 = new o7.t0
            r7.<init>(r6, r3)
            return r7
        L2b:
            boolean r0 = r1.f()
            if (r0 != 0) goto L4f
            boolean r6 = r6.d
            if (r6 == 0) goto L41
            o7.t0 r6 = new o7.t0
            n7.f1 r7 = h(r1)
            o7.v r0 = o7.v.d
            r6.<init>(r7, r0)
            return r6
        L41:
            if (r7 != 0) goto L4f
            o7.t0 r6 = new o7.t0
            n7.f1 r7 = h(r1)
            o7.v r0 = o7.v.f4733b
            r6.<init>(r7, r0)
            return r6
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.y0.f(n7.f0, boolean):o7.x");
    }

    public static n7.f1 g(int i10) {
        n7.e1 e1Var;
        if (i10 >= 100 && i10 < 200) {
            e1Var = n7.e1.INTERNAL;
        } else {
            if (i10 != 400) {
                if (i10 != 401) {
                    if (i10 != 403) {
                        if (i10 != 404) {
                            if (i10 != 429) {
                                if (i10 != 431) {
                                    switch (i10) {
                                        case 502:
                                        case 503:
                                        case 504:
                                            break;
                                        default:
                                            e1Var = n7.e1.UNKNOWN;
                                            break;
                                    }
                                }
                            }
                            e1Var = n7.e1.UNAVAILABLE;
                        } else {
                            e1Var = n7.e1.UNIMPLEMENTED;
                        }
                    } else {
                        e1Var = n7.e1.PERMISSION_DENIED;
                    }
                } else {
                    e1Var = n7.e1.UNAUTHENTICATED;
                }
            }
            e1Var = n7.e1.INTERNAL;
        }
        return e1Var.a().h("HTTP status code " + i10);
    }

    public static n7.f1 h(n7.f1 f1Var) {
        boolean z9;
        if (f1Var != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.f(z9);
        if (f4777b.contains(f1Var.f4204a)) {
            return n7.f1.f4200l.h("Inappropriate status code from control plane: " + f1Var.f4204a + " " + f1Var.f4205b).g(f1Var.c);
        }
        return f1Var;
    }
}
