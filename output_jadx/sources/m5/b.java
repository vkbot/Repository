package m5;

import com.bumptech.glide.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3939a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3940b;
    public final String c;
    public final String d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3941f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3942g;

    public b(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f3939a = str;
        this.f3940b = i10;
        this.c = str2;
        this.d = str3;
        this.e = j10;
        this.f3941f = j11;
        this.f3942g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.c = this.f3939a;
        aVar.f3935b = this.f3940b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f3937g = Long.valueOf(this.e);
        aVar.f3938h = Long.valueOf(this.f3941f);
        aVar.f3936f = this.f3942g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f3939a;
                String str2 = this.f3939a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (g.a(this.f3940b, bVar.f3940b)) {
                    String str3 = bVar.c;
                    String str4 = this.c;
                    if (str4 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str4.equals(str3)) {
                        return false;
                    }
                    String str5 = bVar.d;
                    String str6 = this.d;
                    if (str6 == null) {
                        if (str5 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str5)) {
                        return false;
                    }
                    if (this.e == bVar.e && this.f3941f == bVar.f3941f) {
                        String str7 = bVar.f3942g;
                        String str8 = this.f3942g;
                        if (str8 == null) {
                            if (str7 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (str8.equals(str7)) {
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
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f3939a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c = (((hashCode ^ 1000003) * 1000003) ^ g.c(this.f3940b)) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        long j10 = this.e;
        int i13 = (i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f3941f;
        int i14 = (i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f3942g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f3939a);
        sb.append(", registrationStatus=");
        int i10 = this.f3940b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f3941f);
        sb.append(", fisError=");
        return ai.onnxruntime.a.p(sb, this.f3942g, "}");
    }
}
