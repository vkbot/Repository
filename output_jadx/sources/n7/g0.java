package n7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4206a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4207b;
    public final Object c;

    public g0(List list, b bVar, Object obj) {
        o4.b.i(list, "addresses");
        this.f4206a = Collections.unmodifiableList(new ArrayList(list));
        o4.b.i(bVar, "attributes");
        this.f4207b = bVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!com.bumptech.glide.d.f(this.f4206a, g0Var.f4206a) || !com.bumptech.glide.d.f(this.f4207b, g0Var.f4207b) || !com.bumptech.glide.d.f(this.c, g0Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4206a, this.f4207b, this.c});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4206a, "addresses");
        t.c(this.f4207b, "attributes");
        t.c(this.c, "loadBalancingPolicyConfig");
        return t.toString();
    }
}
