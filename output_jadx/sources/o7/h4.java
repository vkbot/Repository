package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h4 extends n7.e {
    public static final n7.a e = new n7.a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: b, reason: collision with root package name */
    public final n7.e f4547b;
    public final j c;
    public final n7.k1 d;

    public h4(p0 p0Var, j jVar, n7.k1 k1Var) {
        this.f4547b = p0Var;
        this.c = jVar;
        this.d = k1Var;
    }

    @Override // n7.e
    public final void A(n7.t tVar) {
        this.f4547b.A(new g4(this, tVar));
    }

    @Override // n7.e
    public String e() {
        return this.f4547b.e();
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4547b, "delegate");
        return t.toString();
    }

    @Override // n7.e
    public final void x() {
        this.f4547b.x();
    }

    @Override // n7.e
    public final void z() {
        this.f4547b.z();
        j jVar = this.c;
        n7.k1 k1Var = jVar.f4556b;
        k1Var.d();
        k1Var.execute(new f5.j(9, jVar));
    }
}
