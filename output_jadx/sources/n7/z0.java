package n7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4261a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4262b;
    public final y0 c;

    public z0(List list, b bVar, y0 y0Var) {
        this.f4261a = Collections.unmodifiableList(new ArrayList(list));
        o4.b.i(bVar, "attributes");
        this.f4262b = bVar;
        this.c = y0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (!com.bumptech.glide.d.f(this.f4261a, z0Var.f4261a) || !com.bumptech.glide.d.f(this.f4262b, z0Var.f4262b) || !com.bumptech.glide.d.f(this.c, z0Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4261a, this.f4262b, this.c});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4261a, "addresses");
        t.c(this.f4262b, "attributes");
        t.c(this.c, "serviceConfig");
        return t.toString();
    }
}
