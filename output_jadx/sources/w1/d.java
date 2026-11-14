package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f6307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f8) {
        super(1);
        this.f6307b = f8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x1.b bVar = (x1.b) obj;
        bVar.getClass();
        bVar.c = this.f6307b;
        e eVar = bVar.f6487b;
        if (eVar != null) {
            eVar.i();
        }
        return Unit.INSTANCE;
    }
}
