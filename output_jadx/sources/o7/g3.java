package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final n7.c f4535a;

    /* renamed from: b, reason: collision with root package name */
    public final n7.v0 f4536b;
    public final n7.x0 c;

    public g3(n7.x0 x0Var, n7.v0 v0Var, n7.c cVar) {
        o4.b.i(x0Var, "method");
        this.c = x0Var;
        o4.b.i(v0Var, "headers");
        this.f4536b = v0Var;
        o4.b.i(cVar, "callOptions");
        this.f4535a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g3.class == obj.getClass()) {
            g3 g3Var = (g3) obj;
            if (com.bumptech.glide.d.f(this.f4535a, g3Var.f4535a) && com.bumptech.glide.d.f(this.f4536b, g3Var.f4536b) && com.bumptech.glide.d.f(this.c, g3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4535a, this.f4536b, this.c});
    }

    public final String toString() {
        return "[method=" + this.c + " headers=" + this.f4536b + " callOptions=" + this.f4535a + "]";
    }
}
