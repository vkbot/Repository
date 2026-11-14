package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s0 extends u2 {
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final n7.f1 f4692f;

    /* renamed from: g, reason: collision with root package name */
    public final v f4693g;

    /* renamed from: h, reason: collision with root package name */
    public final n7.e[] f4694h;

    public s0(n7.f1 f1Var, v vVar, n7.e[] eVarArr) {
        super(0);
        o4.b.d("error must not be OK", !f1Var.f());
        this.f4692f = f1Var;
        this.f4693g = vVar;
        this.f4694h = eVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [n7.v0, java.lang.Object] */
    @Override // o7.u2, o7.u
    public final void d(w wVar) {
        o4.b.m(!this.e, "already started");
        this.e = true;
        n7.e[] eVarArr = this.f4694h;
        int length = eVarArr.length;
        int i10 = 0;
        while (true) {
            n7.f1 f1Var = this.f4692f;
            if (i10 < length) {
                eVarArr[i10].B(f1Var);
                i10++;
            } else {
                wVar.b(f1Var, this.f4693g, new Object());
                return;
            }
        }
    }

    @Override // o7.u2, o7.u
    public final void e(i7.i iVar) {
        iVar.b(this.f4692f, "error");
        iVar.b(this.f4693g, "progress");
    }
}
