package d2;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1743b;
    public final l c;
    public final long d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f1744f;

    public i(String str, Integer num, l lVar, long j10, long j11, HashMap hashMap) {
        this.f1742a = str;
        this.f1743b = num;
        this.c = lVar;
        this.d = j10;
        this.e = j11;
        this.f1744f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f1744f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f1744f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d2.h, java.lang.Object] */
    public final h c() {
        ?? obj = new Object();
        String str = this.f1742a;
        if (str != null) {
            obj.f1739a = str;
            obj.f1740b = this.f1743b;
            l lVar = this.c;
            if (lVar != null) {
                obj.c = lVar;
                obj.d = Long.valueOf(this.d);
                obj.e = Long.valueOf(this.e);
                obj.f1741f = new HashMap(this.f1744f);
                return obj;
            }
            n0.b.n("Null encodedPayload");
            return null;
        }
        n0.b.n("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f1742a.equals(iVar.f1742a)) {
                Integer num = iVar.f1743b;
                Integer num2 = this.f1743b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(iVar.c) && this.d == iVar.d && this.e == iVar.e && this.f1744f.equals(iVar.f1744f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1742a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1743b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j10 = this.d;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f1744f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1742a + ", code=" + this.f1743b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f1744f + "}";
    }
}
