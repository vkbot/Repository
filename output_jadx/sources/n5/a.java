package n5;

import com.bumptech.glide.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4124b;
    public final String c;
    public final b d;
    public final int e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f4123a = str;
        this.f4124b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = aVar.f4123a;
                String str2 = this.f4123a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                String str3 = aVar.f4124b;
                String str4 = this.f4124b;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = aVar.c;
                String str6 = this.c;
                if (str6 == null) {
                    if (str5 != null) {
                        return false;
                    }
                } else if (!str6.equals(str5)) {
                    return false;
                }
                b bVar = aVar.d;
                b bVar2 = this.d;
                if (bVar2 == null) {
                    if (bVar != null) {
                        return false;
                    }
                } else if (!bVar2.equals(bVar)) {
                    return false;
                }
                int i10 = aVar.e;
                int i11 = this.e;
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
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        String str = this.f4123a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f4124b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        b bVar = this.d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        int i15 = this.e;
        if (i15 != 0) {
            i10 = g.c(i15);
        }
        return i10 ^ i14;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f4123a);
        sb.append(", fid=");
        sb.append(this.f4124b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        int i10 = this.e;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "null";
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
