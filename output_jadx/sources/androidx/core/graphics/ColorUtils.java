package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.CamColor;
import androidx.core.view.ViewCompat;
import androidx.navigation.b;
import j1.i;
import java.util.Objects;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static Color compositeColors(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = (1.0f - alpha) * color2.alpha();
                int componentCount = color2.getComponentCount() - 1;
                float f8 = alpha + alpha2;
                components2[componentCount] = f8;
                if (f8 > 0.0f) {
                    alpha /= f8;
                    alpha2 /= f8;
                }
                for (int i10 = 0; i10 < componentCount; i10++) {
                    components2[i10] = (components2[i10] * alpha2) + (components[i10] * alpha);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            StringBuilder sb = new StringBuilder("Color models must match (");
            sb.append(color.getModel());
            ColorSpace.Model model = color2.getModel();
            sb.append(" vs. ");
            sb.append(model);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private ColorUtils() {
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] fArr) {
        int round;
        int round2;
        int round3;
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float abs = (1.0f - Math.abs((f11 * 2.0f) - 1.0f)) * f10;
        float f12 = f11 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f8 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f8) / 60) {
            case 0:
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                round3 = Math.round(f12 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                round3 = Math.round(f12 * 255.0f);
                break;
            case 2:
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs + f12) * 255.0f);
                round3 = Math.round((abs2 + f12) * 255.0f);
                break;
            case 3:
                round = Math.round(f12 * 255.0f);
                round2 = Math.round((abs2 + f12) * 255.0f);
                round3 = Math.round((abs + f12) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                round3 = Math.round((abs + f12) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f12) * 255.0f);
                round2 = Math.round(f12 * 255.0f);
                round3 = Math.round((abs2 + f12) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(constrain(round, 0, 255), constrain(round2, 0, 255), constrain(round3, 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, to = 100.0d) double d, @FloatRange(from = -128.0d, to = 127.0d) double d10, @FloatRange(from = -128.0d, to = 127.0d) double d11) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d, d10, d11, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, to = 100.0d) double d, @FloatRange(from = -128.0d, to = 127.0d) double d10, @FloatRange(from = -128.0d, to = 127.0d) double d11, @NonNull double[] dArr) {
        double d12;
        double d13 = (d + 16.0d) / 116.0d;
        double d14 = (d10 / 500.0d) + d13;
        double d15 = d13 - (d11 / 200.0d);
        double pow = Math.pow(d14, 3.0d);
        if (pow <= XYZ_EPSILON) {
            pow = ((d14 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        if (d > 7.9996247999999985d) {
            d12 = Math.pow(d13, 3.0d);
        } else {
            d12 = d / XYZ_KAPPA;
        }
        double pow2 = Math.pow(d15, 3.0d);
        if (pow2 <= XYZ_EPSILON) {
            pow2 = ((d15 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = pow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = d12 * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = pow2 * XYZ_WHITE_REFERENCE_Z;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = 0.0d, to = 360.0d, toInclusive = false) float f8, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f10, @FloatRange(from = 0.0d, to = 100.0d) float f11) {
        return CamColor.toColor(f8, f10, f11);
    }

    public static void RGBToHSL(@IntRange(from = 0, to = 255) int i10, @IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @NonNull float[] fArr) {
        float f8;
        float abs;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float f12 = i12 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min;
        float f14 = (max + min) / 2.0f;
        if (max == min) {
            f8 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f10) {
                f8 = ((f11 - f12) / f13) % 6.0f;
            } else if (max == f11) {
                f8 = ((f12 - f10) / f13) + 2.0f;
            } else {
                f8 = 4.0f + ((f10 - f11) / f13);
            }
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (f8 * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = constrain(f15, 0.0f, 360.0f);
        fArr[1] = constrain(abs, 0.0f, 1.0f);
        fArr[2] = constrain(f14, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, to = 255) int i10, @IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @NonNull double[] dArr) {
        RGBToXYZ(i10, i11, i12, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = 255) int i10, @IntRange(from = 0, to = 255) int i11, @IntRange(from = 0, to = 255) int i12, @NonNull double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d = i10 / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d10 = i11 / 255.0d;
            if (d10 < 0.04045d) {
                pow2 = d10 / 12.92d;
            } else {
                pow2 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            double d11 = i12 / 255.0d;
            if (d11 < 0.04045d) {
                pow3 = d11 / 12.92d;
            } else {
                pow3 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * XYZ_WHITE_REFERENCE_Y;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * XYZ_WHITE_REFERENCE_Y;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * XYZ_WHITE_REFERENCE_Y;
            return;
        }
        i.k("outXyz must have a length of 3.");
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = 100.0d) double d10, @FloatRange(from = 0.0d, to = 108.883d) double d11) {
        double d12;
        double d13;
        double d14;
        double d15 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d))) / XYZ_WHITE_REFERENCE_Y;
        double d16 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d))) / XYZ_WHITE_REFERENCE_Y;
        double d17 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d))) / XYZ_WHITE_REFERENCE_Y;
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        return Color.rgb(constrain((int) Math.round(d12 * 255.0d), 0, 255), constrain((int) Math.round(d13 * 255.0d), 0, 255), constrain((int) Math.round(d14 * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = 100.0d) double d10, @FloatRange(from = 0.0d, to = 108.883d) double d11, @NonNull double[] dArr) {
        if (dArr.length == 3) {
            double pivotXyzComponent = pivotXyzComponent(d / XYZ_WHITE_REFERENCE_X);
            double pivotXyzComponent2 = pivotXyzComponent(d10 / XYZ_WHITE_REFERENCE_Y);
            double pivotXyzComponent3 = pivotXyzComponent(d11 / XYZ_WHITE_REFERENCE_Z);
            dArr[0] = Math.max(0.0d, (116.0d * pivotXyzComponent2) - 16.0d);
            dArr[1] = (pivotXyzComponent - pivotXyzComponent2) * 500.0d;
            dArr[2] = (pivotXyzComponent2 - pivotXyzComponent3) * 200.0d;
            return;
        }
        i.k("outLab must have a length of 3.");
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        float f10 = 1.0f - f8;
        return Color.argb((int) ((Color.alpha(i11) * f8) + (Color.alpha(i10) * f10)), (int) ((Color.red(i11) * f8) + (Color.red(i10) * f10)), (int) ((Color.green(i11) * f8) + (Color.green(i10) * f10)), (int) ((Color.blue(i11) * f8) + (Color.blue(i10) * f10)));
    }

    public static void blendHSL(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, to = 1.0d) float f8, @NonNull float[] fArr3) {
        if (fArr3.length == 3) {
            float f10 = 1.0f - f8;
            fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f8);
            fArr3[1] = (fArr2[1] * f8) + (fArr[1] * f10);
            fArr3[2] = (fArr2[2] * f8) + (fArr[2] * f10);
            return;
        }
        i.k("result must have a length of 3.");
    }

    public static void blendLAB(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, to = 1.0d) double d, @NonNull double[] dArr3) {
        if (dArr3.length == 3) {
            double d10 = 1.0d - d;
            dArr3[0] = (dArr2[0] * d) + (dArr[0] * d10);
            dArr3[1] = (dArr2[1] * d) + (dArr[1] * d10);
            dArr3[2] = (dArr2[2] * d) + (dArr[2] * d10);
            return;
        }
        i.k("outResult must have a length of 3.");
    }

    public static double calculateContrast(@ColorInt int i10, @ColorInt int i11) {
        if (Color.alpha(i11) == 255) {
            if (Color.alpha(i10) < 255) {
                i10 = compositeColors(i10, i11);
            }
            double calculateLuminance = calculateLuminance(i10) + 0.05d;
            double calculateLuminance2 = calculateLuminance(i11) + 0.05d;
            return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
        }
        b.o(Integer.toHexString(i11), "background can not be translucent: #");
        return 0.0d;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i10) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i10, tempDouble3Array);
        return tempDouble3Array[1] / XYZ_WHITE_REFERENCE_Y;
    }

    public static int calculateMinimumAlpha(@ColorInt int i10, @ColorInt int i11, float f8) {
        int i12 = 255;
        if (Color.alpha(i11) == 255) {
            double d = f8;
            if (calculateContrast(setAlphaComponent(i10, 255), i11) < d) {
                return -1;
            }
            int i13 = 0;
            for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
                int i15 = (i13 + i12) / 2;
                if (calculateContrast(setAlphaComponent(i10, i15), i11) < d) {
                    i13 = i15;
                } else {
                    i12 = i15;
                }
            }
            return i12;
        }
        b.o(Integer.toHexString(i11), "background can not be translucent: #");
        return 0;
    }

    @VisibleForTesting
    public static float circularInterpolate(float f8, float f10, float f11) {
        if (Math.abs(f10 - f8) > 180.0f) {
            if (f10 > f8) {
                f8 += 360.0f;
            } else {
                f10 += 360.0f;
            }
        }
        return (((f10 - f8) * f11) + f8) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i10, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void colorToLAB(@ColorInt int i10, @NonNull double[] dArr) {
        RGBToLAB(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static void colorToM3HCT(@ColorInt int i10, @NonNull @Size(3) float[] fArr) {
        CamColor.getM3HCTfromColor(i10, fArr);
    }

    public static void colorToXYZ(@ColorInt int i10, @NonNull double[] dArr) {
        RGBToXYZ(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    private static int compositeAlpha(int i10, int i11) {
        return 255 - (((255 - i10) * (255 - i11)) / 255);
    }

    public static int compositeColors(@ColorInt int i10, @ColorInt int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i10), alpha2, Color.red(i11), alpha, compositeAlpha), compositeComponent(Color.green(i10), alpha2, Color.green(i11), alpha, compositeAlpha), compositeComponent(Color.blue(i10), alpha2, Color.blue(i11), alpha, compositeAlpha));
    }

    private static int compositeComponent(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    private static float constrain(float f8, float f10, float f11) {
        if (f8 < f10) {
            return f10;
        }
        return Math.min(f8, f11);
    }

    public static double distanceEuclidean(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    private static double pivotXyzComponent(double d) {
        if (d > XYZ_EPSILON) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return ((d * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i10, @IntRange(from = 0, to = 255) int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
        }
        i.k("alpha must be between 0 and 255.");
        return 0;
    }

    private static int constrain(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : Math.min(i10, i12);
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color color, @NonNull Color color2) {
        return Api26Impl.compositeColors(color, color2);
    }
}
