package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q3 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4684b;

    public /* synthetic */ q3(int i10, Object obj) {
        this.f4683a = i10;
        this.f4684b = obj;
    }

    @Override // o7.v3
    public final void a(c4 c4Var) {
        switch (this.f4683a) {
            case 0:
                c4Var.f4448a.a((n7.h) this.f4684b);
                return;
            case 1:
                c4Var.f4448a.n((n7.o) this.f4684b);
                return;
            default:
                c4Var.f4448a.g((n7.q) this.f4684b);
                return;
        }
    }
}
