package o7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g2 extends n7.e {
    public static final Method F;

    /* renamed from: b, reason: collision with root package name */
    public final n.p f4517b;
    public final n.p c;
    public final ArrayList d;
    public final n7.b1 e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4518f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4519g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4520h;

    /* renamed from: i, reason: collision with root package name */
    public final n7.q f4521i;

    /* renamed from: j, reason: collision with root package name */
    public final n7.i f4522j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4523k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4524l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4525m;

    /* renamed from: n, reason: collision with root package name */
    public final long f4526n;

    /* renamed from: o, reason: collision with root package name */
    public final long f4527o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4528p;

    /* renamed from: q, reason: collision with root package name */
    public final n7.x f4529q;
    public final boolean r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4530s;
    public final boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4531u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4532v;
    public final boolean w;

    /* renamed from: x, reason: collision with root package name */
    public final p7.f f4533x;

    /* renamed from: y, reason: collision with root package name */
    public final p7.f f4534y;

    /* renamed from: z, reason: collision with root package name */
    public static final Logger f4516z = Logger.getLogger(g2.class.getName());
    public static final long A = 1800000;
    public static final long B = 1000;
    public static final n.p C = new n.p(5, y0.f4788p);
    public static final n7.q D = n7.q.d;
    public static final n7.i E = n7.i.f4211b;

    static {
        Method method;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            f4516z.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            method = null;
            F = method;
        } catch (NoSuchMethodException e6) {
            f4516z.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            method = null;
            F = method;
        }
        F = method;
    }

    public g2(String str, p7.f fVar, p7.f fVar2) {
        n7.b1 b1Var;
        n.p pVar = C;
        this.f4517b = pVar;
        this.c = pVar;
        this.d = new ArrayList();
        Logger logger = n7.b1.d;
        synchronized (n7.b1.class) {
            try {
                if (n7.b1.e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z9 = q0.f4667a;
                        arrayList.add(q0.class);
                    } catch (ClassNotFoundException e) {
                        n7.b1.d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<n7.a1> h2 = n7.t.h(n7.a1.class, Collections.unmodifiableList(arrayList), n7.a1.class.getClassLoader(), new n7.h(9));
                    if (h2.isEmpty()) {
                        n7.b1.d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    n7.b1.e = new n7.b1();
                    for (n7.a1 a1Var : h2) {
                        n7.b1.d.fine("Service loader found " + a1Var);
                        n7.b1 b1Var2 = n7.b1.e;
                        synchronized (b1Var2) {
                            a1Var.getClass();
                            b1Var2.f4162b.add(a1Var);
                        }
                    }
                    n7.b1.e.a();
                }
                b1Var = n7.b1.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = b1Var;
        this.f4518f = new ArrayList();
        this.f4520h = "pick_first";
        this.f4521i = D;
        this.f4522j = E;
        this.f4523k = A;
        this.f4524l = 5;
        this.f4525m = 5;
        this.f4526n = 16777216L;
        this.f4527o = FileUtils.ONE_MB;
        this.f4528p = true;
        this.f4529q = n7.x.e;
        this.r = true;
        this.f4530s = true;
        this.t = true;
        this.f4531u = true;
        this.f4532v = true;
        this.w = true;
        o4.b.i(str, TypedValues.AttributesType.S_TARGET);
        this.f4519g = str;
        this.f4533x = fVar;
        this.f4534y = fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n7.m0 E() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.g2.E():n7.m0");
    }
}
