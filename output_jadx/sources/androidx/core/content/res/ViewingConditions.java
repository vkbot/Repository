package androidx.core.content.res;

import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f8, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.mN = f8;
        this.mAw = f10;
        this.mNbb = f11;
        this.mNcb = f12;
        this.mC = f13;
        this.mNc = f14;
        this.mRgbD = fArr;
        this.mFl = f15;
        this.mFlRoot = f16;
        this.mZ = f17;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f8, float f10, float f11, boolean z9) {
        float lerp;
        float exp;
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = (fArr3[1] * f14) + f13;
        float f16 = fArr[2];
        float f17 = (fArr3[2] * f16) + f15;
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f14) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f19 = (f16 * fArr5[2]) + (f14 * fArr5[1]) + (f12 * fArr5[0]);
        float f20 = (f11 / 10.0f) + 0.8f;
        if (f20 >= 0.9d) {
            lerp = CamUtils.lerp(0.59f, 0.69f, (f20 - 0.9f) * 10.0f);
        } else {
            lerp = CamUtils.lerp(0.525f, 0.59f, (f20 - 0.8f) * 10.0f);
        }
        float f21 = lerp;
        if (z9) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f8) - 42.0f) / 92.0f)) * 0.2777778f)) * f20;
        }
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp};
        float f22 = 1.0f / ((5.0f * f8) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float cbrt = (0.1f * f24 * f24 * ((float) Math.cbrt(f8 * 5.0d))) + (f23 * f8);
        float yFromLStar = CamUtils.yFromLStar(f10) / fArr[1];
        double d10 = yFromLStar;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f19) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f21, f20, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.mZ;
    }
}
