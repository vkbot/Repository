package e4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2120b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f2119a = i10;
        this.f2120b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2119a) {
            case 1:
                this.f2120b.f2168b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2119a) {
            case 0:
                this.f2120b.f2168b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
