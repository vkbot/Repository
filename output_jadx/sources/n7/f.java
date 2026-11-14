package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    public final d f4190a;

    /* renamed from: b, reason: collision with root package name */
    public final u7.g f4191b;

    public f(d dVar, u7.g gVar) {
        this.f4190a = dVar;
        o4.b.i(gVar, "interceptor");
        this.f4191b = gVar;
    }

    @Override // n7.d
    public final String e() {
        return this.f4190a.e();
    }

    @Override // n7.d
    public final t f(x0 x0Var, c cVar) {
        u7.g gVar = this.f4191b;
        gVar.getClass();
        return new u7.f(gVar, this.f4190a.f(x0Var, cVar));
    }
}
