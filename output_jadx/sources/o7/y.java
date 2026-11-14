package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public String f4774a;

    /* renamed from: b, reason: collision with root package name */
    public n7.b f4775b;
    public n7.u c;

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f4774a.equals(yVar.f4774a) && this.f4775b.equals(yVar.f4775b) && com.bumptech.glide.d.f(null, null) && com.bumptech.glide.d.f(this.c, yVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4774a, this.f4775b, null, this.c});
    }
}
