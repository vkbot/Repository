package x8;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f6536a;

    public h(Throwable th) {
        this.f6536a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (Intrinsics.areEqual(this.f6536a, ((h) obj).f6536a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6536a.hashCode();
    }

    @Override // x8.i
    public final String toString() {
        return "Closed(" + this.f6536a + ')';
    }
}
