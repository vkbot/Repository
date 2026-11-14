package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t3 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y5.g f4726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f4727b;

    public t3(v1 v1Var, y5.g gVar) {
        this.f4727b = v1Var;
        this.f4726a = gVar;
    }

    @Override // o7.v3
    public final void a(c4 c4Var) {
        u uVar = c4Var.f4448a;
        t7.b bVar = this.f4727b.f4735b.d;
        bVar.getClass();
        uVar.f(new t7.a(this.f4726a, bVar.f5828a));
        c4Var.f4448a.flush();
    }
}
