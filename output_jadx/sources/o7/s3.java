package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s3 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4697b;

    public /* synthetic */ s3(int i10, int i11) {
        this.f4696a = i11;
        this.f4697b = i10;
    }

    @Override // o7.v3
    public final void a(c4 c4Var) {
        switch (this.f4696a) {
            case 0:
                c4Var.f4448a.m(this.f4697b);
                return;
            default:
                c4Var.f4448a.c(this.f4697b);
                return;
        }
    }
}
