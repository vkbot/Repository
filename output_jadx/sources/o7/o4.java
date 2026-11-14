package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final n7.k0 f4632a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4633b;

    public o4(n7.k0 k0Var, Object obj) {
        this.f4632a = k0Var;
        this.f4633b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o4.class == obj.getClass()) {
            o4 o4Var = (o4) obj;
            if (com.bumptech.glide.d.f(this.f4632a, o4Var.f4632a) && com.bumptech.glide.d.f(this.f4633b, o4Var.f4633b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4632a, this.f4633b});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4632a, "provider");
        t.c(this.f4633b, "config");
        return t.toString();
    }
}
