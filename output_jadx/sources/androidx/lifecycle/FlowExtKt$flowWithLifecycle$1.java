package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
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
import x8.q;
import x8.r;
import y8.f;
import y8.g;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lx8/q;", "", "<anonymous>", "(Lx8/q;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Function2<q, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ f $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lv8/x;", "", "<anonymous>", "(Lv8/x;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<x, Continuation<? super Unit>, Object> {
        final /* synthetic */ q $$this$callbackFlow;
        final /* synthetic */ f $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, q qVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_flowWithLifecycle = fVar;
            this.$$this$callbackFlow = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(xVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
                f fVar = this.$this_flowWithLifecycle;
                final q qVar = this.$$this$callbackFlow;
                g gVar = new g() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // y8.g
                    public final Object emit(T t, Continuation<? super Unit> continuation) {
                        Object f8 = ((x8.g) q.this).e.f(t, continuation);
                        if (f8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return f8;
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (fVar.collect(gVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, f fVar, Continuation<? super FlowExtKt$flowWithLifecycle$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q qVar, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$flowWithLifecycle$1) create(qVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r rVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                rVar = (q) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                i.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            q qVar = (q) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, qVar, null);
            this.L$0 = qVar;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            rVar = qVar;
        }
        ((x8.g) rVar).e.h(false, null);
        return Unit.INSTANCE;
    }
}
