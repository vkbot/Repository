package c2;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends t {

    /* renamed from: a, reason: collision with root package name */
    public final long f498a;

    /* renamed from: b, reason: collision with root package name */
    public final long f499b;
    public final j c;
    public final Integer d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f500f;

    public m(long j10, long j11, j jVar, Integer num, String str, ArrayList arrayList) {
        x xVar = x.f507b;
        this.f498a = j10;
        this.f499b = j11;
        this.c = jVar;
        this.d = num;
        this.e = str;
        this.f500f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof t) {
                m mVar = (m) ((t) obj);
                if (this.f498a == mVar.f498a && this.f499b == mVar.f499b && this.c.equals(mVar.c)) {
                    Integer num = mVar.d;
                    Integer num2 = this.d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = mVar.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f500f.equals(mVar.f500f)) {
                        Object obj2 = x.f507b;
                        if (obj2.equals(obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f498a;
        long j11 = this.f499b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i10 = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((i11 ^ i10) * 1000003) ^ this.f500f.hashCode()) * 1000003) ^ x.f507b.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f498a + ", requestUptimeMs=" + this.f499b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f500f + ", qosTier=" + x.f507b + "}";
    }
}
