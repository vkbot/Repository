package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h1 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f4210b;
    public final v0 c;
    public final boolean d;

    public h1(f1 f1Var, v0 v0Var) {
        super(f1.c(f1Var), f1Var.c);
        this.f4210b = f1Var;
        this.c = v0Var;
        this.d = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.d) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }
}
