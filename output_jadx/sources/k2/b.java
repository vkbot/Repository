package k2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3385a;

    /* renamed from: b, reason: collision with root package name */
    public final d2.j f3386b;
    public final d2.i c;

    public b(long j10, d2.j jVar, d2.i iVar) {
        this.f3385a = j10;
        this.f3386b = jVar;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f3385a == bVar.f3385a && this.f3386b.equals(bVar.f3386b) && this.c.equals(bVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f3385a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f3386b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f3385a + ", transportContext=" + this.f3386b + ", event=" + this.c + "}";
    }
}
