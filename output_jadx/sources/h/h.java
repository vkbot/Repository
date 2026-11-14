package h;

import androidx.collection.ArrayMap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    public final c0.c f2525b = new ArrayMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f2525b.getSize(); i10++) {
            g gVar = (g) this.f2525b.keyAt(i10);
            Object valueAt = this.f2525b.valueAt(i10);
            f fVar = gVar.f2524b;
            if (gVar.d == null) {
                gVar.d = gVar.c.getBytes(e.f2522a);
            }
            fVar.a(gVar.d, valueAt, messageDigest);
        }
    }

    public final Object c(g gVar) {
        c0.c cVar = this.f2525b;
        if (cVar.containsKey(gVar)) {
            return cVar.get(gVar);
        }
        return gVar.f2523a;
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f2525b.equals(((h) obj).f2525b);
        }
        return false;
    }

    @Override // h.e
    public final int hashCode() {
        return this.f2525b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f2525b + '}';
    }
}
