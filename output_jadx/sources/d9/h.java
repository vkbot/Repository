package d9;

import i9.b1;
import i9.f1;
import i9.q1;
import i9.r1;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Typography;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1865b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, Object obj) {
        super(1);
        this.f1865b = i10;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f1865b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ((j) obj2).b();
                return Unit.INSTANCE;
            case 1:
                g9.a aVar = (g9.a) obj;
                aVar.getClass();
                StringCompanionObject.INSTANCE.getClass();
                g9.a.a(aVar, "type", q1.f2937b);
                StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
                e9.e eVar = (e9.e) obj2;
                sb.append(eVar.f2212a.getSimpleName());
                sb.append(Typography.greater);
                g9.a.a(aVar, "value", com.bumptech.glide.c.b(sb.toString(), g9.c.e, new g9.e[0], g9.i.f2517b));
                List list = eVar.f2213b;
                list.getClass();
                aVar.f2493b = list;
                return Unit.INSTANCE;
            case 2:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                g9.f fVar = (g9.f) obj2;
                sb2.append(fVar.f2508f[intValue]);
                sb2.append(": ");
                sb2.append(fVar.f2509g[intValue].a());
                return sb2.toString();
            case 3:
                g9.a aVar2 = (g9.a) obj;
                aVar2.getClass();
                List list2 = ((b1) obj2).f2871b;
                list2.getClass();
                aVar2.f2493b = list2;
                return Unit.INSTANCE;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb3 = new StringBuilder();
                f1 f1Var = (f1) obj2;
                sb3.append(f1Var.e[intValue2]);
                sb3.append(": ");
                sb3.append(f1Var.f(intValue2).a());
                return sb3.toString();
            case 5:
                g9.a aVar3 = (g9.a) obj;
                aVar3.getClass();
                r1 r1Var = (r1) obj2;
                g9.a.a(aVar3, "first", r1Var.f2940a.a());
                g9.a.a(aVar3, "second", r1Var.f2941b.a());
                g9.a.a(aVar3, "third", r1Var.c.a());
                return Unit.INSTANCE;
            default:
                Result.Companion companion = Result.INSTANCE;
                Unit unit = Unit.INSTANCE;
                ((v8.e) obj2).resumeWith(Result.m95constructorimpl(unit));
                return unit;
        }
    }
}
