package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a1 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public final e9.b f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f2865b;

    public a1(e9.b bVar) {
        this.f2864a = bVar;
        this.f2865b = new m1(bVar.a());
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return this.f2865b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        if (obj != null) {
            bVar.encodeNotNullMark();
            bVar.encodeSerializableValue(this.f2864a, obj);
        } else {
            bVar.encodeNull();
        }
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        if (routeDecoder.decodeNotNullMark()) {
            return routeDecoder.decodeSerializableValue(this.f2864a);
        }
        return routeDecoder.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a1.class == obj.getClass() && Intrinsics.areEqual(this.f2864a, ((a1) obj).f2864a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2864a.hashCode();
    }
}
