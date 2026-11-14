package t4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p f5809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5810b;
    public final int c;

    public h(p pVar, int i10, int i11) {
        e3.d.c(pVar, "Null dependency anInterface.");
        this.f5809a = pVar;
        this.f5810b = i10;
        this.c = i11;
    }

    public static h a(Class cls) {
        return new h(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5809a.equals(hVar.f5809a) && this.f5810b == hVar.f5810b && this.c == hVar.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5809a.hashCode() ^ 1000003) * 1000003) ^ this.f5810b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5809a);
        sb.append(", type=");
        int i10 = this.f5810b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i11 = this.c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    j1.i.e(ai.onnxruntime.a.e(i11, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return ai.onnxruntime.a.p(sb, str2, "}");
    }

    public h(int i10, int i11, Class cls) {
        this(p.a(cls), i10, i11);
    }
}
