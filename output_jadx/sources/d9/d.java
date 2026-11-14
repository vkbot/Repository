package d9;

import i9.s0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d extends Lambda implements Function3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1861b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(3);
        this.f1861b = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            return new s0(2, this.f1861b, obj2);
        }
        n0.b.a();
        return null;
    }
}
