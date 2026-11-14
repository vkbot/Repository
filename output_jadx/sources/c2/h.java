package c2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f478a;

    /* renamed from: b, reason: collision with root package name */
    public final String f479b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f480f;

    /* renamed from: g, reason: collision with root package name */
    public final String f481g;

    /* renamed from: h, reason: collision with root package name */
    public final String f482h;

    /* renamed from: i, reason: collision with root package name */
    public final String f483i;

    /* renamed from: j, reason: collision with root package name */
    public final String f484j;

    /* renamed from: k, reason: collision with root package name */
    public final String f485k;

    /* renamed from: l, reason: collision with root package name */
    public final String f486l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f478a = num;
        this.f479b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f480f = str5;
        this.f481g = str6;
        this.f482h = str7;
        this.f483i = str8;
        this.f484j = str9;
        this.f485k = str10;
        this.f486l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f478a.equals(((h) aVar).f478a)) {
                    if (this.f479b.equals(((h) aVar).f479b)) {
                        if (this.c.equals(((h) aVar).c)) {
                            if (this.d.equals(((h) aVar).d)) {
                                if (this.e.equals(((h) aVar).e)) {
                                    if (this.f480f.equals(((h) aVar).f480f)) {
                                        if (this.f481g.equals(((h) aVar).f481g)) {
                                            if (this.f482h.equals(((h) aVar).f482h)) {
                                                if (this.f483i.equals(((h) aVar).f483i)) {
                                                    if (this.f484j.equals(((h) aVar).f484j)) {
                                                        if (this.f485k.equals(((h) aVar).f485k)) {
                                                            if (this.f486l.equals(((h) aVar).f486l)) {
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
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
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
        return ((((((((((((((((((((((this.f478a.hashCode() ^ 1000003) * 1000003) ^ this.f479b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f480f.hashCode()) * 1000003) ^ this.f481g.hashCode()) * 1000003) ^ this.f482h.hashCode()) * 1000003) ^ this.f483i.hashCode()) * 1000003) ^ this.f484j.hashCode()) * 1000003) ^ this.f485k.hashCode()) * 1000003) ^ this.f486l.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f478a);
        sb.append(", model=");
        sb.append(this.f479b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f480f);
        sb.append(", manufacturer=");
        sb.append(this.f481g);
        sb.append(", fingerprint=");
        sb.append(this.f482h);
        sb.append(", locale=");
        sb.append(this.f483i);
        sb.append(", country=");
        sb.append(this.f484j);
        sb.append(", mccMnc=");
        sb.append(this.f485k);
        sb.append(", applicationBuild=");
        return ai.onnxruntime.a.p(sb, this.f486l, "}");
    }
}
