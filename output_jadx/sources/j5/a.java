package j5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3290b;

    public a(String str, d dVar) {
        this.f3289a = str;
        this.f3290b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        d dVar = aVar.f3290b;
        String str = aVar.f3289a;
        if (hashCode() != aVar.hashCode()) {
            return false;
        }
        String str2 = this.f3289a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        d dVar2 = this.f3290b;
        if ((dVar2 == null && dVar == null) || (dVar2 != null && dVar2.equals(dVar))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f3289a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        d dVar = this.f3290b;
        if (dVar != null) {
            i11 = dVar.hashCode();
        }
        return i10 + i11;
    }
}
