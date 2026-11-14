package f7;

import e0.s3;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final Optional f2381b;
    public final Optional c;
    public final Optional d;
    public final g7.b e;

    public j(s3 s3Var) {
        this.f2380a = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) s3Var.c));
        this.f2381b = (Optional) s3Var.d;
        this.c = (Optional) s3Var.e;
        this.d = (Optional) s3Var.f2029f;
        g7.b bVar = (g7.b) s3Var.f2030g;
        Objects.requireNonNull(bVar, "Peers must have a public key");
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f2380a.equals(jVar.f2380a) || !this.f2381b.equals(jVar.f2381b) || !this.c.equals(jVar.c) || !this.d.equals(jVar.d) || !this.e.equals(jVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.f2381b.hashCode() + ((this.f2380a.hashCode() + 31) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(Peer ");
        sb.append(this.e.d());
        this.f2381b.ifPresent(new g(sb, 2));
        sb.append(')');
        return sb.toString();
    }
}
