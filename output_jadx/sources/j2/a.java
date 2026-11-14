package j2;

import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m2.a f3241a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3242b;

    public a(m2.a aVar, HashMap hashMap) {
        this.f3241a = aVar;
        this.f3242b = hashMap;
    }

    public final long a(a2.b bVar, long j10, int i10) {
        long j11;
        long d = j10 - this.f3241a.d();
        b bVar2 = (b) this.f3242b.get(bVar);
        long j12 = bVar2.f3243a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), d), bVar2.f3244b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f3241a.equals(aVar.f3241a) && this.f3242b.equals(aVar.f3242b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f3241a.hashCode() ^ 1000003) * 1000003) ^ this.f3242b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f3241a + ", values=" + this.f3242b + "}";
    }
}
