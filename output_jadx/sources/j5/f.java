package j5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3301a;

    public f(String str) {
        this.f3301a = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f) {
                String str = ((f) obj).f3301a;
                String str2 = this.f3301a;
                if (str2.hashCode() == str.hashCode() && str2.equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3301a.hashCode();
    }
}
