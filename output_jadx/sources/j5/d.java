package j5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3296b;

    public d(l lVar, String str) {
        this.f3295a = lVar;
        this.f3296b = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (hashCode() == dVar.hashCode() && this.f3295a.equals(dVar.f3295a) && this.f3296b.equals(dVar.f3296b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3296b.hashCode() + this.f3295a.hashCode();
    }
}
