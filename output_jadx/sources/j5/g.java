package j5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends h {
    public f c;
    public a d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        a aVar = gVar.d;
        if (hashCode() != gVar.hashCode()) {
            return false;
        }
        a aVar2 = this.d;
        if ((aVar2 != null || aVar == null) && ((aVar2 == null || aVar2.equals(aVar)) && this.c.equals(gVar.c))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        a aVar = this.d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        } else {
            i10 = 0;
        }
        return this.c.f3301a.hashCode() + i10;
    }
}
