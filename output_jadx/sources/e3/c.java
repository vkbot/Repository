package e3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import e4.l;
import r3.h;
import w1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2108b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f2107a = i10;
        this.f2108b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2107a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f2108b).f1204k = null;
                return;
            case 1:
                ((HideViewOnScrollBehavior) this.f2108b).f1213l = null;
                return;
            case 2:
                l lVar = (l) this.f2108b;
                lVar.p();
                lVar.r.start();
                return;
            case 3:
                ((ExpandableTransformationBehavior) this.f2108b).f1521b = null;
                return;
            case 4:
                super.onAnimationEnd(animator);
                ((l0.a) this.f2108b).f3490b = true;
                return;
            case 5:
                h hVar = (h) this.f2108b;
                hVar.r = 0;
                hVar.f5385m = null;
                return;
            default:
                animator.getClass();
                i iVar = (i) this.f2108b;
                if (!iVar.r) {
                    iVar.l();
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2107a) {
            case 5:
                h hVar = (h) this.f2108b;
                hVar.f5390s.a(0, false);
                hVar.r = 2;
                hVar.f5385m = animator;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
