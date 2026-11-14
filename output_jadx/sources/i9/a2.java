package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.ULong;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a2 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final a2 f2866a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f2867b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i9.a2] */
    static {
        LongCompanionObject.INSTANCE.getClass();
        f2867b = d1.a("kotlin.ULong", q0.f2934a);
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2867b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeInline(f2867b).encodeLong(((ULong) obj).getData());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return ULong.m263boximpl(ULong.m269constructorimpl(routeDecoder.decodeInline(f2867b).decodeLong()));
    }
}
