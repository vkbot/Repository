package x4;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f6495a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f6496b;

    public c(String str, Map map) {
        this.f6495a = str;
        this.f6496b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f6495a.equals(cVar.f6495a) && this.f6496b.equals(cVar.f6496b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6496b.hashCode() + (this.f6495a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f6495a + ", properties=" + this.f6496b.values() + "}";
    }
}
