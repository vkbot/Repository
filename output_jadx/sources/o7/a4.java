package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4402b;
    public final /* synthetic */ c4 c;
    public final /* synthetic */ w4 d;

    public /* synthetic */ a4(w4 w4Var, c4 c4Var, int i10) {
        this.f4402b = i10;
        this.d = w4Var;
        this.c = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4402b;
        w4 w4Var = this.d;
        switch (i10) {
            case 0:
                ((v1) w4Var.d).c.execute(new com.bumptech.glide.m(21, this));
                return;
            default:
                v1 v1Var = (v1) w4Var.d;
                n7.q0 q0Var = v1.F;
                v1Var.p(this.c);
                return;
        }
    }
}
