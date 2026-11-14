package h4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2580b;
    public final /* synthetic */ View c;

    public b(boolean z9, View view, View view2) {
        this.f2579a = z9;
        this.f2580b = view;
        this.c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2579a) {
            this.f2580b.setVisibility(4);
            View view = this.c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f2579a) {
            this.f2580b.setVisibility(0);
            View view = this.c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
