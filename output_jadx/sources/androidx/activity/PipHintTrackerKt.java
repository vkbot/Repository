package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, Continuation<? super Unit> continuation) {
        Object collect = new l.d((Function2) new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new y8.g() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            public final Object emit(Rect rect, Continuation<? super Unit> continuation2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return Unit.INSTANCE;
            }

            @Override // y8.g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
            }
        }, continuation);
        if (collect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
