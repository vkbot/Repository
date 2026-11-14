package c5;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f526a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f527b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f526a = str;
            this.f527b = arrayList;
        } else {
            n0.b.n("Null userAgent");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f526a.equals(aVar.f526a) && this.f527b.equals(aVar.f527b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f526a.hashCode() ^ 1000003) * 1000003) ^ this.f527b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f526a + ", usedDates=" + this.f527b + "}";
    }
}
