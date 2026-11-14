package o7;

import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p0 extends n7.e {
    public static final Logger t;

    /* renamed from: u, reason: collision with root package name */
    public static final Set f4635u;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f4636v;
    public static final boolean w;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f4637x;

    /* renamed from: y, reason: collision with root package name */
    public static String f4638y;

    /* renamed from: b, reason: collision with root package name */
    public final h3 f4639b;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4640f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4641g;

    /* renamed from: h, reason: collision with root package name */
    public final r4 f4642h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4643i;

    /* renamed from: j, reason: collision with root package name */
    public final n7.k1 f4644j;

    /* renamed from: k, reason: collision with root package name */
    public final i4.f f4645k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4646l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4647m;

    /* renamed from: n, reason: collision with root package name */
    public Executor f4648n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4649o;

    /* renamed from: p, reason: collision with root package name */
    public final i4 f4650p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4651q;
    public n7.t r;
    public final Random c = new Random();

    /* renamed from: s, reason: collision with root package name */
    public volatile int f4652s = 1;
    public final AtomicReference d = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(p0.class.getName());
        t = logger;
        f4635u = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f4636v = Boolean.parseBoolean(property);
        w = Boolean.parseBoolean(property2);
        f4637x = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("o7.l1", true, p0.class.getClassLoader()).asSubclass(l1.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e6) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e6);
            }
        } catch (ClassCastException e10) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e10);
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e11);
        }
    }

    public p0(String str, m5.a aVar, r4 r4Var, i4.f fVar, boolean z9) {
        boolean z10;
        o4.b.i(aVar, "args");
        this.f4642h = r4Var;
        URI create = URI.create("//".concat(str));
        if (create.getHost() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o4.b.e("Invalid DNS name: %s", z10, str);
        String authority = create.getAuthority();
        if (authority != null) {
            this.e = authority;
            this.f4640f = create.getHost();
            if (create.getPort() == -1) {
                this.f4641g = aVar.f3935b;
            } else {
                this.f4641g = create.getPort();
            }
            h3 h3Var = (h3) aVar.c;
            o4.b.i(h3Var, "proxyDetector");
            this.f4639b = h3Var;
            long j10 = 0;
            if (!z9) {
                String property = System.getProperty("networkaddress.cache.ttl");
                long j11 = 30;
                if (property != null) {
                    try {
                        j11 = Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                        t.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                    }
                }
                if (j11 > 0) {
                    j10 = TimeUnit.SECONDS.toNanos(j11);
                } else {
                    j10 = j11;
                }
            }
            this.f4643i = j10;
            this.f4645k = fVar;
            n7.k1 k1Var = (n7.k1) aVar.d;
            o4.b.i(k1Var, "syncContext");
            this.f4644j = k1Var;
            x1 x1Var = (x1) aVar.f3938h;
            this.f4648n = x1Var;
            this.f4649o = x1Var == null;
            i4 i4Var = (i4) aVar.e;
            o4.b.i(i4Var, "serviceConfigParser");
            this.f4650p = i4Var;
            return;
        }
        n0.b.n(e3.d.l("nameUri (%s) doesn't have an authority", create));
        throw null;
    }

    public static Map F(Map map, Random random, String str) {
        boolean z9;
        for (Map.Entry entry : map.entrySet()) {
            y5.k.z("Bad key: %s", f4635u.contains(entry.getKey()), entry);
        }
        List f8 = p4.f("clientLanguage", map);
        if (f8 != null && !f8.isEmpty()) {
            Iterator it = f8.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double h2 = p4.h("percentage", map);
        if (h2 != null) {
            int intValue = h2.intValue();
            if (intValue >= 0 && intValue <= 100) {
                z9 = true;
            } else {
                z9 = false;
            }
            y5.k.z("Bad percentage: %s", z9, h2);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List f10 = p4.f("clientHostname", map);
        if (f10 != null && !f10.isEmpty()) {
            Iterator it2 = f10.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map j10 = p4.j("serviceConfig", map);
        if (j10 != null) {
            return j10;
        }
        throw new a8.a(String.format("key '%s' missing in '%s'", map, "serviceConfig"), 1);
    }

    public static ArrayList G() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.startsWith("grpc_config=")) {
                t.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            } else {
                String substring = str.substring(12);
                Logger logger = m1.f4615a;
                w5.a aVar = new w5.a(new StringReader(substring));
                try {
                    Object a10 = m1.a(aVar);
                    if (a10 instanceof List) {
                        List list2 = (List) a10;
                        p4.a(list2);
                        arrayList.addAll(list2);
                    } else {
                        throw new ClassCastException("wrong type " + a10);
                    }
                } finally {
                    try {
                        aVar.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // n7.e
    public final void A(n7.t tVar) {
        boolean z9;
        if (this.r == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "already started");
        if (this.f4649o) {
            this.f4648n = (Executor) s4.a(this.f4642h);
        }
        this.r = tVar;
        H();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a5.h E() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.p0.E():a5.h");
    }

    public final void H() {
        if (!this.f4651q && !this.f4647m) {
            if (this.f4646l) {
                long j10 = this.f4643i;
                if (j10 != 0 && (j10 <= 0 || this.f4645k.a() <= j10)) {
                    return;
                }
            }
            this.f4651q = true;
            this.f4648n.execute(new e0(this, this.r));
        }
    }

    public final List I() {
        try {
            try {
                int i10 = this.f4652s;
                String str = this.f4640f;
                if (i10 != 0) {
                    List unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                    ArrayList arrayList = new ArrayList(unmodifiableList.size());
                    Iterator it = unmodifiableList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new n7.r(new InetSocketAddress((InetAddress) it.next(), this.f4641g)));
                    }
                    return Collections.unmodifiableList(arrayList);
                }
                throw null;
            } catch (Exception e) {
                Object obj = i4.g.f2776a;
                if (!(e instanceof RuntimeException)) {
                    throw new RuntimeException(e);
                }
                throw ((RuntimeException) e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                t.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }

    @Override // n7.e
    public final String e() {
        return this.e;
    }

    @Override // n7.e
    public final void x() {
        boolean z9;
        if (this.r != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "not started");
        H();
    }

    @Override // n7.e
    public final void z() {
        if (!this.f4647m) {
            this.f4647m = true;
            Executor executor = this.f4648n;
            if (executor != null && this.f4649o) {
                s4.b(this.f4642h, executor);
                this.f4648n = null;
            }
        }
    }
}
