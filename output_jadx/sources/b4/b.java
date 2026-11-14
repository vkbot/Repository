package b4;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f349a;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f349a) {
            case 0:
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                throw null;
            default:
                ((Integer) valueAnimator.getAnimatedValue()).intValue();
                throw null;
        }
    }
}
