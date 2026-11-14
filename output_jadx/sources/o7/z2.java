package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final n7.t f4796a;
    public final w2 c;
    public boolean d = false;

    /* renamed from: b, reason: collision with root package name */
    public n7.j f4797b = n7.j.e;

    public z2(n7.t tVar, w2 w2Var) {
        this.f4796a = tVar;
        this.c = w2Var;
    }

    public static void a(z2 z2Var, n7.j jVar) {
        z2Var.f4797b = jVar;
        if (jVar != n7.j.c && jVar != n7.j.d) {
            if (jVar == n7.j.e) {
                z2Var.d = false;
                return;
            }
            return;
        }
        z2Var.d = true;
    }
}
