package c2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o extends w {

    /* renamed from: a, reason: collision with root package name */
    public final v f502a;

    /* renamed from: b, reason: collision with root package name */
    public final u f503b;

    public o(v vVar, u uVar) {
        this.f502a = vVar;
        this.f503b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            v vVar = this.f502a;
            if (vVar != null ? vVar.equals(((o) wVar).f502a) : ((o) wVar).f502a == null) {
                u uVar = this.f503b;
                if (uVar != null ? uVar.equals(((o) wVar).f503b) : ((o) wVar).f503b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        v vVar = this.f502a;
        if (vVar == null) {
            hashCode = 0;
        } else {
            hashCode = vVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        u uVar = this.f503b;
        if (uVar != null) {
            i10 = uVar.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f502a + ", mobileSubtype=" + this.f503b + "}";
    }
}
