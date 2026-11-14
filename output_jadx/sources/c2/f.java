package c2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements x4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f471a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final x4.c f472b = x4.c.a("requestTimeMs");
    public static final x4.c c = x4.c.a("requestUptimeMs");
    public static final x4.c d = x4.c.a("clientInfo");
    public static final x4.c e = x4.c.a("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final x4.c f473f = x4.c.a("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final x4.c f474g = x4.c.a("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final x4.c f475h = x4.c.a("qosTier");

    @Override // x4.a
    public final void a(Object obj, Object obj2) {
        x4.e eVar = (x4.e) obj2;
        m mVar = (m) ((t) obj);
        eVar.a(f472b, mVar.f498a);
        eVar.a(c, mVar.f499b);
        eVar.d(d, mVar.c);
        eVar.d(e, mVar.d);
        eVar.d(f473f, mVar.e);
        eVar.d(f474g, mVar.f500f);
        eVar.d(f475h, x.f507b);
    }
}
