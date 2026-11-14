package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class u0 implements c0 {
    @Override // o7.n2
    public void a(n7.f1 f1Var) {
        e().a(f1Var);
    }

    @Override // o7.n2
    public final Runnable b(m2 m2Var) {
        return e().b(m2Var);
    }

    @Override // n7.z
    public final n7.a0 c() {
        return e().c();
    }

    public abstract c0 e();

    @Override // o7.c0
    public final n7.b getAttributes() {
        return e().getAttributes();
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(e(), "delegate");
        return t.toString();
    }
}
