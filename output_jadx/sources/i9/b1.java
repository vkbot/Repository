package i9;

import androidx.navigation.serialization.RouteDecoder;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b1 implements e9.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2870a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2871b;
    public final Lazy c;

    public b1(Unit unit) {
        unit.getClass();
        this.f2870a = unit;
        this.f2871b = CollectionsKt.emptyList();
        this.c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new e9.d(3, this));
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return (g9.e) this.c.getValue();
    }

    @Override // e9.h
    public final void b(h9.b bVar, Object obj) {
        obj.getClass();
        bVar.beginStructure(a()).endStructure(a());
    }

    @Override // e9.a
    public final Object c(RouteDecoder routeDecoder) {
        int decodeElementIndex;
        g9.e a10 = a();
        h9.c beginStructure = routeDecoder.beginStructure(a10);
        if (beginStructure.decodeSequentially() || (decodeElementIndex = beginStructure.decodeElementIndex(a())) == -1) {
            Unit unit = Unit.INSTANCE;
            beginStructure.endStructure(a10);
            return this.f2870a;
        }
        throw new IllegalArgumentException(ai.onnxruntime.a.e(decodeElementIndex, "Unexpected index "));
    }
}
