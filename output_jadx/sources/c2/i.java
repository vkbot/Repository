package c2;

import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f487a;

    public i(ArrayList arrayList) {
        this.f487a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            return this.f487a.equals(((i) ((p) obj)).f487a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f487a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f487a + "}";
    }
}
