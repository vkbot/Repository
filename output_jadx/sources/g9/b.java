package g9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final KClass f2497b;
    public final String c;

    public b(f fVar, KClass kClass) {
        kClass.getClass();
        this.f2496a = fVar;
        this.f2497b = kClass;
        this.c = fVar.f2506a + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    @Override // g9.e
    public final String a() {
        return this.c;
    }

    @Override // g9.e
    public final boolean c() {
        return false;
    }

    @Override // g9.e
    public final int d() {
        return this.f2496a.c;
    }

    @Override // g9.e
    public final String e(int i10) {
        return this.f2496a.f2508f[i10];
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && Intrinsics.areEqual(this.f2496a, bVar.f2496a) && Intrinsics.areEqual(bVar.f2497b, this.f2497b)) {
            return true;
        }
        return false;
    }

    @Override // g9.e
    public final e f(int i10) {
        return this.f2496a.f2509g[i10];
    }

    @Override // g9.e
    public final boolean g(int i10) {
        return this.f2496a.f2511i[i10];
    }

    @Override // g9.e
    public final com.bumptech.glide.d getKind() {
        return this.f2496a.f2507b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.f2497b.hashCode() * 31);
    }

    @Override // g9.e
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f2497b + ", original: " + this.f2496a + ')';
    }
}
