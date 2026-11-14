package o7;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4625a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4626b;

    public n4(String str, Map map) {
        o4.b.i(str, "policyName");
        this.f4625a = str;
        o4.b.i(map, "rawConfigValue");
        this.f4626b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n4) {
            n4 n4Var = (n4) obj;
            if (this.f4625a.equals(n4Var.f4625a) && this.f4626b.equals(n4Var.f4626b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4625a, this.f4626b});
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.c(this.f4625a, "policyName");
        t.c(this.f4626b, "rawConfigValue");
        return t.toString();
    }
}
