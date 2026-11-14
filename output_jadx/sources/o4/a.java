package o4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4351a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4352b;
    public final long c;

    public a(long j10, long j11, long j12) {
        this.f4351a = j10;
        this.f4352b = j11;
        this.c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4351a == aVar.f4351a && this.f4352b == aVar.f4352b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4351a;
        long j11 = this.f4352b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f4351a);
        sb.append(", elapsedRealtime=");
        sb.append(this.f4352b);
        sb.append(", uptimeMillis=");
        return ai.onnxruntime.a.n(sb, this.c, "}");
    }
}
