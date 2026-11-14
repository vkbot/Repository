package p8;

import java.io.Serializable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f5115b;

    public e(Throwable th) {
        this.f5115b = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f5115b;
        Throwable th = this.f5115b;
        if (th != obj2) {
            if (th == null || !th.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5115b.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f5115b + "]";
    }
}
