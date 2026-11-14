package b0;

import c0.g;
import h.e;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f263b;

    public b(Object obj) {
        g.c(obj, "Argument must not be null");
        this.f263b = obj;
    }

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.f263b.toString().getBytes(e.f2522a));
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f263b.equals(((b) obj).f263b);
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        return this.f263b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f263b + '}';
    }
}
