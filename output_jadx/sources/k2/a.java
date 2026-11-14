package k2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3382f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f3383a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3384b;
    public final int c;
    public final long d;
    public final int e;

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f3383a = j10;
        this.f3384b = i10;
        this.c = i11;
        this.d = j11;
        this.e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3383a == aVar.f3383a && this.f3384b == aVar.f3384b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3383a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f3384b) * 1000003) ^ this.c) * 1000003;
        long j11 = this.d;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f3383a);
        sb.append(", loadBatchSize=");
        sb.append(this.f3384b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return ai.onnxruntime.a.o(sb, "}", this.e);
    }
}
