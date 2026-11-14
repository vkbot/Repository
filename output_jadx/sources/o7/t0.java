package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4713a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4714b;
    public final Object c;

    public t0(n7.f1 f1Var, v vVar) {
        o4.b.d("error must not be OK", !f1Var.f());
        this.f4714b = f1Var;
        this.c = vVar;
    }

    @Override // n7.z
    public final n7.a0 c() {
        switch (this.f4713a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((n2) this.c).c();
        }
    }

    @Override // o7.x
    public final u d(n7.x0 x0Var, n7.v0 v0Var, n7.c cVar, n7.e[] eVarArr) {
        int i10 = this.f4713a;
        Object obj = this.c;
        Object obj2 = this.f4714b;
        switch (i10) {
            case 0:
                return new s0((n7.f1) obj2, (v) obj, eVarArr);
            default:
                n7.c cVar2 = n7.c.f4163h;
                o4.b.i(cVar, "callOptions cannot be null");
                boolean z9 = false;
                n7.e a10 = ((n7.g) obj2).a(new j4.b(cVar, 0, false), v0Var);
                if (eVarArr[eVarArr.length - 1] == y0.f4787o) {
                    z9 = true;
                }
                o4.b.m(z9, "lb tracer already assigned");
                eVarArr[eVarArr.length - 1] = a10;
                return ((n2) obj).d(x0Var, v0Var, cVar, eVarArr);
        }
    }

    public t0(n7.g gVar, n2 n2Var) {
        this.f4714b = gVar;
        this.c = n2Var;
    }
}
