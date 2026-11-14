package n7;

import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4217b = new a("internal:health-checking-config");
    public static final h c = new h(5);
    public static final a d = new a("internal:has-health-check-producer-listener");
    public static final a e = new a("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f4218a;

    public f1 a(g0 g0Var) {
        List list = g0Var.f4206a;
        if (list.isEmpty() && !b()) {
            f1 h2 = f1.f4201m.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + g0Var.f4207b);
            c(h2);
            return h2;
        }
        int i10 = this.f4218a;
        this.f4218a = i10 + 1;
        if (i10 == 0) {
            d(g0Var);
        }
        this.f4218a = 0;
        return f1.e;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(f1 f1Var);

    public void d(g0 g0Var) {
        int i10 = this.f4218a;
        this.f4218a = i10 + 1;
        if (i10 == 0) {
            a(g0Var);
        }
        this.f4218a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
