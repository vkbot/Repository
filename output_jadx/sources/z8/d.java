package z8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import v8.h0;
import v8.q;
import v8.x;
import y8.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f6881b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y8.g d;
    public final /* synthetic */ l.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y8.g gVar, l.d dVar, Continuation continuation) {
        super(2, continuation);
        this.d = gVar;
        this.e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.d, this.e, continuation);
        dVar.c = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((x) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [v8.a, x8.p, x8.g] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f6881b;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                j1.i.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            x xVar = (x) this.c;
            l.d dVar = this.e;
            CoroutineContext coroutineContext = (CoroutineContext) dVar.c;
            e eVar = new e(dVar, null);
            x8.b a10 = x8.j.a(-2, 1);
            CoroutineContext a11 = q.a(xVar.getCoroutineContext(), coroutineContext, true);
            c9.d dVar2 = h0.f6029a;
            if (a11 != dVar2 && a11.get(ContinuationInterceptor.INSTANCE) == null) {
                a11 = a11.plus(dVar2);
            }
            ?? gVar = new x8.g(a11, a10);
            gVar.L(3, gVar, eVar);
            this.f6881b = 1;
            Object c = r.c(this.d, gVar, true, this);
            if (c != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                c = Unit.INSTANCE;
            }
            if (c == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
