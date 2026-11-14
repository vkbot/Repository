package n5;

import c7.l;
import com.bumptech.glide.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4125a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4126b;
    public final int c;

    public b(int i10, String str, long j10) {
        this.f4125a = str;
        this.f4126b = j10;
        this.c = i10;
    }

    public static l a() {
        l lVar = new l(1);
        lVar.d = 0L;
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f4125a;
                String str2 = this.f4125a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f4126b == bVar.f4126b) {
                    int i10 = bVar.c;
                    int i11 = this.c;
                    if (i11 == 0) {
                        if (i10 == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (g.a(i11, i10)) {
                        return true;
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
        int i10 = 0;
        String str = this.f4125a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f4126b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i12 = this.c;
        if (i12 != 0) {
            i10 = g.c(i12);
        }
        return i10 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f4125a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f4126b);
        sb.append(", responseCode=");
        int i10 = this.c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
