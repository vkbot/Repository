package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CircularPropagation extends VisibilityPropagation {
    private float mPropagationSpeed = 3.0f;

    private static float distance(float f8, float f10, float f11, float f12) {
        float f13 = f11 - f8;
        float f14 = f12 - f10;
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(@NonNull ViewGroup viewGroup, @NonNull Transition transition, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i10;
        int round;
        int i11;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 != null && getViewVisibility(transitionValues) != 0) {
            transitionValues = transitionValues2;
            i10 = 1;
        } else {
            i10 = -1;
        }
        int viewX = getViewX(transitionValues);
        int viewY = getViewY(transitionValues);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            i11 = epicenter.centerX();
            round = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r5[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r5[1]);
            i11 = round2;
        }
        float distance = distance(viewX, viewY, i11, round) / distance(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i10)) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f8) {
        if (f8 != 0.0f) {
            this.mPropagationSpeed = f8;
        } else {
            i.k("propagationSpeed may not be 0");
        }
    }
}
