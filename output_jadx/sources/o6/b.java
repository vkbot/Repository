package o6;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4375b;

    public b(int i10, int i11) {
        this.f4374a = i10;
        this.f4375b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4374a != bVar.f4374a || this.f4375b != bVar.f4375b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4374a ^ this.f4375b;
    }

    public final String toString() {
        return this.f4374a + "(" + this.f4375b + ')';
    }
}
