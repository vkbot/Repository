package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x2 extends n7.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4770a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4771b;

    public x2(n7.f0 f0Var) {
        o4.b.i(f0Var, "result");
        this.f4771b = f0Var;
    }

    @Override // n7.h0
    public final n7.f0 a(g3 g3Var) {
        switch (this.f4770a) {
            case 0:
                return (n7.f0) this.f4771b;
            default:
                return n7.f0.a((n7.f1) this.f4771b);
        }
    }

    public String toString() {
        switch (this.f4770a) {
            case 0:
                com.bumptech.glide.manager.s sVar = new com.bumptech.glide.manager.s(x2.class.getSimpleName());
                sVar.c((n7.f0) this.f4771b, "result");
                return sVar.toString();
            default:
                return super.toString();
        }
    }

    public x2(n7.f1 f1Var) {
        this.f4771b = f1Var;
    }
}
