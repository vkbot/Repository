package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.UShort;
import kotlin.jvm.internal.ShortCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d2 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final d2 f2881a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f2882b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.d2] */
    static {
        ShortCompanionObject.INSTANCE.getClass();
        f2882b = d1.a("kotlin.UShort", p1.f2932a);
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2882b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeInline(f2882b).encodeShort(((UShort) obj).getData());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return UShort.m370boximpl(UShort.m376constructorimpl(routeDecoder.decodeInline(f2882b).decodeShort()));
    }
}
