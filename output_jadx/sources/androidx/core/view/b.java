package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.core.view.DifferentialMotionFlingController;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements DifferentialMotionFlingController.FlingVelocityThresholdCalculator, DifferentialMotionFlingController.DifferentialVelocityProvider {
    @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
    public void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        DifferentialMotionFlingController.calculateFlingVelocityThresholds(context, iArr, motionEvent, i10);
    }

    @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
    public float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        float currentVelocity;
        currentVelocity = DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i10);
        return currentVelocity;
    }
}
