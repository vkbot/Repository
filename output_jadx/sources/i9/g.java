package i9;

import androidx.navigation.serialization.RouteDecoder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class g implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2900a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f2901b = new j1("kotlin.Boolean", g9.d.d);

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2901b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeBoolean(((Boolean) obj).booleanValue());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return Boolean.valueOf(routeDecoder.decodeBoolean());
    }
}
