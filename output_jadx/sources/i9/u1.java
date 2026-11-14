package i9;

import androidx.navigation.serialization.RouteDecoder;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class u1 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f2950a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f2951b;

    /* JADX WARN: Type inference failed for: r0v0, types: [i9.u1, java.lang.Object] */
    static {
        ByteCompanionObject.INSTANCE.getClass();
        f2951b = d1.a("kotlin.UByte", j.f2908a);
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return f2951b;
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        bVar.encodeInline(f2951b).encodeByte(((UByte) obj).getData());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        return UByte.m107boximpl(UByte.m113constructorimpl(routeDecoder.decodeInline(f2951b).decodeByte()));
    }
}
