package f5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2277a;

    /* renamed from: b, reason: collision with root package name */
    public final l5.a f2278b;

    public d(String str, l5.a aVar) {
        if (str != null) {
            this.f2277a = str;
            if (aVar != null) {
                this.f2278b = aVar;
                return;
            } else {
                n0.b.n("Null installationTokenResult");
                throw null;
            }
        }
        n0.b.n("Null installationId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f2277a.equals(dVar.f2277a) && this.f2278b.equals(dVar.f2278b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2277a.hashCode() ^ 1000003) * 1000003) ^ this.f2278b.hashCode();
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.f2277a + ", installationTokenResult=" + this.f2278b + "}";
    }
}
