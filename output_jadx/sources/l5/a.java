package l5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3523b;
    public final long c;

    public a(String str, long j10, long j11) {
        this.f3522a = str;
        this.f3523b = j10;
        this.c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3522a.equals(aVar.f3522a) && this.f3523b == aVar.f3523b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3522a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f3523b;
        long j11 = this.c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f3522a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f3523b);
        sb.append(", tokenCreationTimestamp=");
        return ai.onnxruntime.a.n(sb, this.c, "}");
    }
}
