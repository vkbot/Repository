package androidx.constraintlayout.core.motion.utils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class VelocityMatrix {
    private static String sTag = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    public void applyTransform(float f8, float f10, int i10, int i11, float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = (f10 - 0.5f) * 2.0f;
        float f14 = f11 + this.mDTranslateX;
        float f15 = f12 + this.mDTranslateY;
        float f16 = (this.mDScaleX * (f8 - 0.5f) * 2.0f) + f14;
        float f17 = (this.mDScaleY * f13) + f15;
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d = radians;
        double d10 = i11 * f13;
        float sin = (((float) ((Math.sin(d) * ((-i10) * r7)) - (Math.cos(d) * d10))) * radians2) + f16;
        float cos = (radians2 * ((float) ((Math.cos(d) * (i10 * r7)) - (Math.sin(d) * d10)))) + f17;
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f8) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f8);
            this.mRotate = splineSet.get(f8);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f8) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f8);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f8);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f8) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f8);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f8);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f8) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f8);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f8) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f8);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f8);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f8) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f8);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f8);
        }
    }
}
