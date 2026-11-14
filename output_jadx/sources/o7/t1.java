package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t1 extends n7.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4715a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final n7.f0 f4716b;

    public t1(Throwable th) {
        n7.f1 g10 = n7.f1.f4200l.h("Panic! This is a bug!").g(th);
        n7.f0 f0Var = n7.f0.e;
        o4.b.d("drop status shouldn't be OK", !g10.f());
        this.f4716b = new n7.f0(null, null, g10, true);
    }

    @Override // n7.h0
    public final n7.f0 a(g3 g3Var) {
        switch (this.f4715a) {
            case 0:
                return this.f4716b;
            default:
                return this.f4716b;
        }
    }

    public final String toString() {
        switch (this.f4715a) {
            case 0:
                com.bumptech.glide.manager.s sVar = new com.bumptech.glide.manager.s(t1.class.getSimpleName());
                sVar.c(this.f4716b, "panicPickResult");
                return sVar.toString();
            default:
                return "FixedResultPicker(" + this.f4716b + ")";
        }
    }

    public t1(n7.f0 f0Var) {
        o4.b.i(f0Var, "result");
        this.f4716b = f0Var;
    }
}
