package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.UInt;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class x1 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final x1 f2961a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f2962b;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.x1, java.lang.Object] */
    static {
        IntCompanionObject.INSTANCE.getClass();
        f2962b = d1.a("kotlin.UInt", l0.f2916a);
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2962b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeInline(f2962b).encodeInt(((UInt) obj).getData());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return UInt.m184boximpl(UInt.m190constructorimpl(routeDecoder.decodeInline(f2962b).decodeInt()));
    }
}
