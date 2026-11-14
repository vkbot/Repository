package d4;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1803b;
    public final /* synthetic */ h c;

    public g(h hVar, View view, View view2) {
        this.c = hVar;
        this.f1802a = view;
        this.f1803b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.f1802a, this.f1803b, valueAnimator.getAnimatedFraction());
    }
}
