package j;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final y.f f3055a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3056b;

    public t(y.f fVar, Executor executor) {
        this.f3055a = fVar;
        this.f3056b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f3055a.equals(((t) obj).f3055a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3055a.hashCode();
    }
}
