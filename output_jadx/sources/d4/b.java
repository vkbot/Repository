package d4;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1798b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f1797a = i10;
        this.f1798b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1797a) {
            case 0:
                ((TabLayout) this.f1798b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 1:
                ((TextInputLayout) this.f1798b).f1482x0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z3.k kVar = ((BottomSheetBehavior) this.f1798b).f1232i;
                if (kVar != null) {
                    kVar.r(floatValue);
                    return;
                }
                return;
        }
    }
}
