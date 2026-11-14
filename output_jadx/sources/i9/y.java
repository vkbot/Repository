package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.time.Duration;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class y implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f2963a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f2964b = new j1("kotlin.time.Duration", g9.d.f2505l);

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2964b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeString(Duration.m1457toIsoStringimpl(((Duration) obj).getRawValue()));
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return Duration.m1417boximpl(Duration.INSTANCE.m1512parseIsoStringUwyO8pc(routeDecoder.decodeString()));
    }
}
