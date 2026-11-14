package j;

import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements h.e {

    /* renamed from: b, reason: collision with root package name */
    public final h.e f2983b;
    public final h.e c;

    public e(h.e eVar, h.e eVar2) {
        this.f2983b = eVar;
        this.c = eVar2;
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        this.f2983b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f2983b.equals(eVar.f2983b) && this.c.equals(eVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        return this.c.hashCode() + (this.f2983b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f2983b + ", signature=" + this.c + '}';
    }
}
