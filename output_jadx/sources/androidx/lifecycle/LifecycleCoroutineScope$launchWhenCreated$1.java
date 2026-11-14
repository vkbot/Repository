package androidx.lifecycle;

import j1.i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import v8.x;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv8/x;", "", "<anonymous>", "(Lv8/x;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements Function2<x, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<x, Continuation<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, Function2<? super x, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super LifecycleCoroutineScope$launchWhenCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.this$0, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x xVar, Continuation<? super Unit> continuation) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create(xVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                i.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Function2<x, Continuation<? super Unit>, Object> function2 = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenCreated(lifecycle, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
