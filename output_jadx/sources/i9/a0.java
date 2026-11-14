package i9;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a0 extends f1 {

    /* renamed from: l, reason: collision with root package name */
    public final g9.c f2862l;

    /* renamed from: m, reason: collision with root package name */
    public final Lazy f2863m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String str, int i10) {
        super(str, null, i10);
        str.getClass();
        this.f2862l = g9.c.f2498f;
        this.f2863m = LazyKt.lazy(new z(i10, str, this));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof g9.e)) {
                g9.e eVar = (g9.e) obj;
                if (eVar.getKind() != g9.c.f2498f || !Intrinsics.areEqual(this.f2892a, eVar.a()) || !Intrinsics.areEqual(d1.b(this), d1.b(eVar))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // i9.f1, g9.e
    public final g9.e f(int i10) {
        return ((g9.e[]) this.f2863m.getValue())[i10];
    }

    @Override // i9.f1, g9.e
    public final com.bumptech.glide.d getKind() {
        return this.f2862l;
    }

    @Override // i9.f1
    public final int hashCode() {
        int i10;
        int hashCode = this.f2892a.hashCode();
        g9.g gVar = new g9.g(this);
        int i11 = 1;
        while (gVar.hasNext()) {
            int i12 = i11 * 31;
            String str = (String) gVar.next();
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return (hashCode * 31) + i11;
    }

    @Override // i9.f1
    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(new g9.h(this), ", ", this.f2892a + '(', ")", 0, null, null, 56, null);
        return joinToString$default;
    }
}
