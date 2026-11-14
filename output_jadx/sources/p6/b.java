package p6;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5008b;

    public b(ArrayList arrayList, int i10) {
        this.f5007a = new ArrayList(arrayList);
        this.f5008b = i10;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && this.f5007a.equals(((b) obj).f5007a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5007a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return "{ " + this.f5007a + " }";
    }
}
