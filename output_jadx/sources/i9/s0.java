package i9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class s0 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2942b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10, Object obj, Object obj2) {
        super(1);
        this.f2942b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2942b) {
            case 0:
                g9.a aVar = (g9.a) obj;
                aVar.getClass();
                g9.a.a(aVar, "key", ((e9.b) this.c).a());
                g9.a.a(aVar, "value", ((e9.b) this.d).a());
                return Unit.INSTANCE;
            case 1:
                g9.a aVar2 = (g9.a) obj;
                aVar2.getClass();
                g9.a.a(aVar2, "first", ((e9.b) this.c).a());
                g9.a.a(aVar2, "second", ((e9.b) this.d).a());
                return Unit.INSTANCE;
            default:
                ((d9.e) this.c).c(this.d);
                return Unit.INSTANCE;
        }
    }
}
