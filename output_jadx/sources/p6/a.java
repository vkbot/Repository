package p6;

import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o6.b f5005a;

    /* renamed from: b, reason: collision with root package name */
    public final o6.b f5006b;
    public final o6.c c;

    public a(o6.b bVar, o6.b bVar2, o6.c cVar) {
        this.f5005a = bVar;
        this.f5006b = bVar2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5005a.equals(aVar.f5005a) && Objects.equals(this.f5006b, aVar.f5006b) && this.c.equals(aVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5005a.hashCode() ^ Objects.hashCode(this.f5006b)) ^ this.c.hashCode();
    }

    public final String toString() {
        return "[ " + this.f5005a + " , " + this.f5006b + " : " + Integer.valueOf(this.c.f4376a) + " ]";
    }
}
