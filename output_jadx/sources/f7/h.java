package f7;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2374a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f2375b;
    public final Set c;
    public final Set d;
    public final Set e;

    /* renamed from: f, reason: collision with root package name */
    public final android.support.v4.media.h f2376f;

    /* renamed from: g, reason: collision with root package name */
    public final Optional f2377g;

    /* renamed from: h, reason: collision with root package name */
    public final Optional f2378h;

    public h(f5.i iVar) {
        this.f2374a = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) iVar.f2287b));
        this.f2375b = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) iVar.c));
        this.c = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) iVar.d));
        this.d = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) iVar.e));
        this.e = Collections.unmodifiableSet(new LinkedHashSet((LinkedHashSet) iVar.f2288f));
        android.support.v4.media.h hVar = (android.support.v4.media.h) iVar.f2289g;
        Objects.requireNonNull(hVar, "Interfaces must have a private key");
        this.f2376f = hVar;
        this.f2377g = (Optional) iVar.f2290h;
        this.f2378h = (Optional) iVar.f2291i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f2374a.equals(hVar.f2374a) || !this.f2375b.equals(hVar.f2375b) || !this.c.equals(hVar.c) || !this.d.equals(hVar.d) || !this.e.equals(hVar.e) || !this.f2376f.equals(hVar.f2376f) || !this.f2377g.equals(hVar.f2377g) || !this.f2378h.equals(hVar.f2378h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2378h.hashCode() + ((this.f2377g.hashCode() + ((this.f2376f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f2375b.hashCode() + ((this.f2374a.hashCode() + 31) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(Interface ");
        sb.append(((g7.b) this.f2376f.d).d());
        this.f2377g.ifPresent(new g(sb, 0));
        sb.append(')');
        return sb.toString();
    }
}
