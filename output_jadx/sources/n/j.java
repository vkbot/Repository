package n;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f4023a;

    public j(String str) {
        this.f4023a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f4023a.equals(((j) obj).f4023a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4023a.hashCode();
    }

    public final String toString() {
        return ai.onnxruntime.a.p(new StringBuilder("StringHeaderFactory{value='"), this.f4023a, "'}");
    }
}
