package j2;

import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3244b;
    public final Set c;

    public b(long j10, long j11, Set set) {
        this.f3243a = j10;
        this.f3244b = j11;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f3243a == bVar.f3243a && this.f3244b == bVar.f3244b && this.c.equals(bVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3243a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f3244b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f3243a + ", maxAllowedDelay=" + this.f3244b + ", flags=" + this.c + "}";
    }
}
