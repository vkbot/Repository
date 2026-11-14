package androidx.lifecycle;

import a9.q;
import androidx.lifecycle.Lifecycle;
import c9.d;
import j1.i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import v8.a0;
import v8.h0;
import v8.x;
import w8.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv8/x;", "", "<anonymous>", "(Lv8/x;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<x, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<x, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv8/x;", "", "<anonymous>", "(Lv8/x;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<x, Continuation<? super Unit>, Object> {
        final /* synthetic */ x $$this$coroutineScope;
        final /* synthetic */ Function2<x, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, x xVar, Function2<? super x, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = xVar;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(xVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, androidx.lifecycle.LifecycleObserver] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L36
                if (r1 != r3) goto L2f
                java.lang.Object r0 = r12.L$5
                kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                java.lang.Object r0 = r12.L$4
                v8.x r0 = (v8.x) r0
                java.lang.Object r0 = r12.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r12.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r12.L$1
                r1 = r0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r0 = r12.L$0
                r3 = r0
                kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L2b
                goto La1
            L2b:
                r0 = move-exception
                r13 = r0
                goto Lb8
            L2f:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                j1.i.l(r13)
                r13 = 0
                return r13
            L36:
                kotlin.ResultKt.throwOnFailure(r13)
                androidx.lifecycle.Lifecycle r13 = r12.$this_repeatOnLifecycle
                androidx.lifecycle.Lifecycle$State r13 = r13.getState()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r13 != r1) goto L46
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            L46:
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                r5.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r13 = r12.$state     // Catch: java.lang.Throwable -> L99
                androidx.lifecycle.Lifecycle r11 = r12.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> L99
                v8.x r6 = r12.$$this$coroutineScope     // Catch: java.lang.Throwable -> L99
                kotlin.jvm.functions.Function2<v8.x, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r10 = r12.$block     // Catch: java.lang.Throwable -> L99
                r12.L$0 = r5     // Catch: java.lang.Throwable -> L99
                r12.L$1 = r1     // Catch: java.lang.Throwable -> L99
                r12.L$2 = r13     // Catch: java.lang.Throwable -> L99
                r12.L$3 = r11     // Catch: java.lang.Throwable -> L99
                r12.L$4 = r6     // Catch: java.lang.Throwable -> L99
                r12.L$5 = r10     // Catch: java.lang.Throwable -> L99
                r12.label = r3     // Catch: java.lang.Throwable -> L99
                v8.e r8 = new v8.e     // Catch: java.lang.Throwable -> L99
                kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r12)     // Catch: java.lang.Throwable -> L99
                r8.<init>(r3, r4)     // Catch: java.lang.Throwable -> L99
                r8.r()     // Catch: java.lang.Throwable -> L99
                androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.INSTANCE     // Catch: java.lang.Throwable -> L99
                androidx.lifecycle.Lifecycle$Event r4 = r3.upTo(r13)     // Catch: java.lang.Throwable -> L99
                androidx.lifecycle.Lifecycle$Event r7 = r3.downFrom(r13)     // Catch: java.lang.Throwable -> L99
                d9.e r9 = new d9.e     // Catch: java.lang.Throwable -> L99
                r9.<init>()     // Catch: java.lang.Throwable -> L99
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r3 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L99
                r3.<init>()     // Catch: java.lang.Throwable -> L99
                r1.element = r3     // Catch: java.lang.Throwable -> L99
                r11.addObserver(r3)     // Catch: java.lang.Throwable -> L99
                java.lang.Object r13 = r8.q()     // Catch: java.lang.Throwable -> L99
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L99
                if (r13 != r3) goto L9d
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)     // Catch: java.lang.Throwable -> L99
                goto L9d
            L99:
                r0 = move-exception
                r13 = r0
                r3 = r5
                goto Lb8
            L9d:
                if (r13 != r0) goto La0
                return r0
            La0:
                r3 = r5
            La1:
                T r13 = r3.element
                v8.z0 r13 = (v8.z0) r13
                if (r13 == 0) goto Laa
                r13.c(r2)
            Laa:
                T r13 = r1.element
                androidx.lifecycle.LifecycleEventObserver r13 = (androidx.lifecycle.LifecycleEventObserver) r13
                if (r13 == 0) goto Lb5
                androidx.lifecycle.Lifecycle r0 = r12.$this_repeatOnLifecycle
                r0.removeObserver(r13)
            Lb5:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            Lb8:
                T r0 = r3.element
                v8.z0 r0 = (v8.z0) r0
                if (r0 == 0) goto Lc1
                r0.c(r2)
            Lc1:
                T r0 = r1.element
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto Lcc
                androidx.lifecycle.Lifecycle r1 = r12.$this_repeatOnLifecycle
                r1.removeObserver(r0)
            Lcc:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super x, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> continuation) {
        super(2, continuation);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x xVar, Continuation<? super Unit> continuation) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(xVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
            x xVar = (x) this.L$0;
            d dVar = h0.f6029a;
            c cVar = q.f85a.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, xVar, this.$block, null);
            this.label = 1;
            if (a0.e(cVar, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
