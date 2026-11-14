package j5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3292b;

    public b(long j10, long j11) {
        this.f3291a = j10;
        this.f3292b = j11;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f3291a == bVar.f3291a && this.f3292b == bVar.f3292b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j10 = this.f3291a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 430065837) * 1000003;
        long j11 = this.f3292b;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateLimit{limiterKey=APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY, limit=");
        sb.append(this.f3291a);
        sb.append(", timeToLiveMillis=");
        return ai.onnxruntime.a.n(sb, this.f3292b, "}");
    }
}
