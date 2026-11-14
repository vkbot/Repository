package a5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f37a;

    public a(int i10) {
        this.f37a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f37a == dVar.tag() && c.f39b.equals(dVar.intEncoding())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f37a) + (c.f39b.hashCode() ^ 2041407134);
    }

    @Override // a5.d
    public final c intEncoding() {
        return c.f39b;
    }

    @Override // a5.d
    public final int tag() {
        return this.f37a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f37a + "intEncoding=" + c.f39b + ')';
    }
}
