package c2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: a, reason: collision with root package name */
    public final h f488a;

    public j(h hVar) {
        this.f488a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                Object obj2 = q.f504b;
                if (obj2.equals(obj2)) {
                    if (this.f488a.equals(((j) rVar).f488a)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((q.f504b.hashCode() ^ 1000003) * 1000003) ^ this.f488a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + q.f504b + ", androidClientInfo=" + this.f488a + "}";
    }
}
