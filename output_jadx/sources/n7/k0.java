package n7;

import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class k0 {
    public abstract String a();

    public abstract j0 b(e eVar);

    public abstract y0 c(Map map);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(a(), "policy");
        t.e("priority", String.valueOf(5));
        t.d("available", true);
        return t.toString();
    }
}
