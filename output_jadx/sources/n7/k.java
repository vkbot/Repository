package n7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f4220a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f4221b;

    public k(j jVar, f1 f1Var) {
        this.f4220a = jVar;
        o4.b.i(f1Var, "status is null");
        this.f4221b = f1Var;
    }

    public static k a(j jVar) {
        boolean z9;
        if (jVar != j.d) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.d("state is TRANSIENT_ERROR. Use forError() instead", z9);
        return new k(jVar, f1.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f4220a.equals(kVar.f4220a) || !this.f4221b.equals(kVar.f4221b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4220a.hashCode() ^ this.f4221b.hashCode();
    }

    public final String toString() {
        f1 f1Var = this.f4221b;
        boolean f8 = f1Var.f();
        j jVar = this.f4220a;
        if (f8) {
            return jVar.toString();
        }
        return jVar + "(" + f1Var + ")";
    }
}
