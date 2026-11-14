package h4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import r3.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2581a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2582b;
    public final /* synthetic */ Object c;

    public c(View view, boolean z9) {
        this.f2582b = z9;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2581a) {
            case 1:
                this.f2582b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2581a) {
            case 0:
                if (!this.f2582b) {
                    ((View) this.c).setVisibility(4);
                    return;
                }
                return;
            default:
                h hVar = (h) this.c;
                hVar.r = 0;
                hVar.f5385m = null;
                if (!this.f2582b) {
                    hVar.f5390s.a(4, false);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f2581a) {
            case 0:
                if (this.f2582b) {
                    ((View) this.c).setVisibility(0);
                    return;
                }
                return;
            default:
                h hVar = (h) this.c;
                hVar.f5390s.a(0, false);
                hVar.r = 1;
                hVar.f5385m = animator;
                this.f2582b = false;
                return;
        }
    }

    public c(h hVar) {
        this.c = hVar;
    }
}
