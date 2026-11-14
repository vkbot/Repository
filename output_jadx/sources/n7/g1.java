package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g1 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final f1 f4208b;
    public final boolean c;

    public g1(f1 f1Var) {
        super(f1.c(f1Var), f1Var.c);
        this.f4208b = f1Var;
        this.c = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.c) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }
}
