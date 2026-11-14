package i9;

import androidx.navigation.serialization.RouteDecoder;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class q1 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f2936a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f2937b = new j1("kotlin.String", g9.d.f2505l);

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2937b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        String str = (String) obj;
        str.getClass();
        bVar.encodeString(str);
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return routeDecoder.decodeString();
    }
}
