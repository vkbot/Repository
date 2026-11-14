package i9;

import androidx.navigation.serialization.RouteDecoder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e0 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f2885a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f2886b = new j1("kotlin.Float", g9.d.f2501h);

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2886b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeFloat(((Number) obj).floatValue());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return Float.valueOf(routeDecoder.decodeFloat());
    }
}
