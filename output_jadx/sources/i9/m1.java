package i9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class m1 implements g9.e, l {

    /* renamed from: a, reason: collision with root package name */
    public final g9.e f2921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2922b;
    public final Set c;

    public m1(g9.e eVar) {
        eVar.getClass();
        this.f2921a = eVar;
        this.f2922b = eVar.a() + '?';
        this.c = d1.b(eVar);
    }

    @Override // g9.e
    public final String a() {
        return this.f2922b;
    }

    @Override // i9.l
    public final Set b() {
        return this.c;
    }

    @Override // g9.e
    public final boolean c() {
        return true;
    }

    @Override // g9.e
    public final int d() {
        return this.f2921a.d();
    }

    @Override // g9.e
    public final String e(int i10) {
        return this.f2921a.e(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f2921a, ((m1) obj).f2921a)) {
            return true;
        }
        return false;
    }

    @Override // g9.e
    public final g9.e f(int i10) {
        return this.f2921a.f(i10);
    }

    @Override // g9.e
    public final boolean g(int i10) {
        return this.f2921a.g(i10);
    }

    @Override // g9.e
    public final com.bumptech.glide.d getKind() {
        return this.f2921a.getKind();
    }

    public final int hashCode() {
        return this.f2921a.hashCode() * 31;
    }

    @Override // g9.e
    public final boolean isInline() {
        return this.f2921a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2921a);
        sb.append('?');
        return sb.toString();
    }
}
