package j5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f3307a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3308b;

    public l(String str, String str2) {
        this.f3307a = str;
        this.f3308b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        String str = lVar.f3307a;
        if (hashCode() != lVar.hashCode()) {
            return false;
        }
        String str2 = this.f3307a;
        if ((str2 != null || str == null) && ((str2 == null || str2.equals(str)) && this.f3308b.equals(lVar.f3308b))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3308b;
        String str2 = this.f3307a;
        if (str2 != null) {
            return str.hashCode() + str2.hashCode();
        }
        return str.hashCode();
    }
}
