package r5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5396b;

    public a(String str, String str2) {
        this.f5395a = str;
        if (str2 != null) {
            this.f5396b = str2;
        } else {
            n0.b.n("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f5395a.equals(aVar.f5395a) && this.f5396b.equals(aVar.f5396b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f5395a.hashCode() ^ 1000003) * 1000003) ^ this.f5396b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f5395a);
        sb.append(", version=");
        return ai.onnxruntime.a.p(sb, this.f5396b, "}");
    }
}
