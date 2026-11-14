package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.Metadata;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController$startAnimations$3 implements Animation.AnimationListener {
    final /* synthetic */ DefaultSpecialEffectsController.AnimationInfo $animationInfo;
    final /* synthetic */ SpecialEffectsController.Operation $operation;
    final /* synthetic */ View $viewToAnimate;
    final /* synthetic */ DefaultSpecialEffectsController this$0;

    public DefaultSpecialEffectsController$startAnimations$3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, DefaultSpecialEffectsController.AnimationInfo animationInfo) {
        this.$operation = operation;
        this.this$0 = defaultSpecialEffectsController;
        this.$viewToAnimate = view;
        this.$animationInfo = animationInfo;
    }

    public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController defaultSpecialEffectsController, View view, DefaultSpecialEffectsController.AnimationInfo animationInfo) {
        defaultSpecialEffectsController.getClass();
        animationInfo.getClass();
        defaultSpecialEffectsController.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.this$0.getContainer().post(new d(this.this$0, this.$viewToAnimate, this.$animationInfo, 0));
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        animation.getClass();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + this.$operation + " has reached onAnimationStart.");
        }
    }
}
