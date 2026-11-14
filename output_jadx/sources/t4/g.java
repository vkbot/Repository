package t4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f5807a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5808b;

    public g(p pVar, boolean z9) {
        this.f5807a = pVar;
        this.f5808b = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f5807a.equals(this.f5807a) && gVar.f5808b == this.f5808b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5807a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5808b).hashCode();
    }
}
