package f5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements b8.c, b8.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f2284b;
    public final /* synthetic */ j5.b c;

    public /* synthetic */ g0(i0 i0Var, j5.b bVar) {
        this.f2284b = i0Var;
        this.c = bVar;
    }

    @Override // b8.c
    public Object apply(Object obj) {
        i0 i0Var = this.f2284b;
        i0Var.getClass();
        this.c.getClass();
        c0 s5 = d0.s();
        s5.c();
        d0.n((d0) s5.c);
        i0Var.f2293b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        s5.c();
        d0.o((d0) s5.c, currentTimeMillis);
        return ((f0) obj).o((d0) s5.a());
    }

    @Override // b8.d
    public boolean test(Object obj) {
        d0 d0Var = (d0) obj;
        this.f2284b.f2293b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - d0Var.q();
        j5.b bVar = this.c;
        if (currentTimeMillis > bVar.f3292b || d0Var.r() < bVar.f3291a) {
            return true;
        }
        return false;
    }
}
