package a2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5a;

    public a(String str) {
        if (str != null) {
            this.f5a = str;
        } else {
            n0.b.n("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f5a.equals(((a) obj).f5a);
    }

    public final int hashCode() {
        return this.f5a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ai.onnxruntime.a.p(new StringBuilder("Encoding{name=\""), this.f5a, "\"}");
    }
}
