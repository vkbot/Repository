package i9;

import androidx.navigation.serialization.RouteDecoder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class q0 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f2934a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f2935b = new j1("kotlin.Long", g9.d.f2503j);

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2935b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeLong(((Number) obj).longValue());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return Long.valueOf(routeDecoder.decodeLong());
    }
}
