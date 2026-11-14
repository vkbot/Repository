package androidx.core.content.res;

import ai.onnxruntime.a;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class CamUtils {
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    public static int intFromLStar(float f8) {
        float f10;
        boolean z9;
        float f11;
        if (f8 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f12 = (f8 + 16.0f) / 116.0f;
        if (f8 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f8 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z9) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float lStarFromInt(int i10) {
        return lStarFromY(yFromInt(i10));
    }

    public static float lStarFromY(float f8) {
        float f10 = f8 / 100.0f;
        if (f10 <= 0.008856452f) {
            return f10 * 903.2963f;
        }
        return (((float) Math.cbrt(f10)) * 116.0f) - 16.0f;
    }

    public static float lerp(float f8, float f10, float f11) {
        return a.b(f10, f8, f11, f8);
    }

    public static float linearized(int i10) {
        float pow;
        float f8 = i10 / 255.0f;
        if (f8 <= 0.04045f) {
            pow = f8 / 12.92f;
        } else {
            pow = (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static void xyzFromInt(int i10, @NonNull float[] fArr) {
        float linearized = linearized(Color.red(i10));
        float linearized2 = linearized(Color.green(i10));
        float linearized3 = linearized(Color.blue(i10));
        float[][] fArr2 = SRGB_TO_XYZ;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[2] * linearized3) + (fArr3[1] * linearized2) + (fArr3[0] * linearized);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[2] * linearized3) + (fArr4[1] * linearized2) + (fArr4[0] * linearized);
        float[] fArr5 = fArr2[2];
        fArr[2] = (linearized3 * fArr5[2]) + (linearized2 * fArr5[1]) + (linearized * fArr5[0]);
    }

    public static float yFromInt(int i10) {
        float linearized = linearized(Color.red(i10));
        float linearized2 = linearized(Color.green(i10));
        float linearized3 = linearized(Color.blue(i10));
        float[] fArr = SRGB_TO_XYZ[1];
        return (linearized3 * fArr[2]) + (linearized2 * fArr[1]) + (linearized * fArr[0]);
    }

    public static float yFromLStar(float f8) {
        float f10;
        if (f8 > 8.0f) {
            f10 = (float) Math.pow((f8 + 16.0d) / 116.0d, 3.0d);
        } else {
            f10 = f8 / 903.2963f;
        }
        return f10 * 100.0f;
    }
}
