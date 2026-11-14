package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x8.o;
import x8.q;
import x8.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx8/q;", "Landroid/graphics/Rect;", "", "<anonymous>", "(Lx8/q;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements Function2<q, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, Continuation<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> continuation) {
        super(2, continuation);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(q qVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Rect trackPipAnimationHintView$positionInWindow;
        if (i10 == i14 && i12 == i16 && i11 == i15 && i13 == i17) {
            return;
        }
        view.getClass();
        trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
        ((x8.g) qVar).e(trackPipAnimationHintView$positionInWindow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$1(q qVar, View view) {
        Rect trackPipAnimationHintView$positionInWindow;
        trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
        ((x8.g) qVar).e(trackPipAnimationHintView$positionInWindow);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, continuation);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q qVar, Continuation<? super Unit> continuation) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(qVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1, android.view.View$OnAttachStateChangeListener] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Rect trackPipAnimationHintView$positionInWindow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                j1.i.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final q qVar = (q) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.m
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(q.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.n
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(q.this, view);
                }
            };
            final ?? r52 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v9) {
                    Rect trackPipAnimationHintView$positionInWindow2;
                    v9.getClass();
                    r rVar = q.this;
                    trackPipAnimationHintView$positionInWindow2 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
                    ((x8.g) rVar).e(trackPipAnimationHintView$positionInWindow2);
                    view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v9) {
                    v9.getClass();
                    v9.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    v9.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (this.$view.isAttachedToWindow()) {
                trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view);
                ((x8.g) qVar).e(trackPipAnimationHintView$positionInWindow);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r52);
            final View view2 = this.$view;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    view2.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                    view2.removeOnAttachStateChangeListener(r52);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (o.a(qVar, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
