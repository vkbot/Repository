package e9;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e extends i9.b {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f2212a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2213b;
    public final Lazy c;

    public e(KClass kClass) {
        kClass.getClass();
        this.f2212a = kClass;
        this.f2213b = CollectionsKt.emptyList();
        this.c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new d(0, this));
    }

    @Override // e9.h, e9.a
    public final g9.e a() {
        return (g9.e) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f2212a + ')';
    }
}
