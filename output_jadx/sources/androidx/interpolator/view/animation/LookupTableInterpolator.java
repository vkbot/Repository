package androidx.interpolator.view.animation;

import ai.onnxruntime.a;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int min = Math.min((int) ((fArr.length - 1) * f8), fArr.length - 2);
        float f10 = this.mStepSize;
        float f11 = (f8 - (min * f10)) / f10;
        float[] fArr2 = this.mValues;
        float f12 = fArr2[min];
        return a.b(fArr2[min + 1], f12, f11, f12);
    }
}
