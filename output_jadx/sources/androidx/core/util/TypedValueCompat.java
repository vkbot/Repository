package androidx.core.util;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import j1.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(34)
    /* loaded from: classes.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static float deriveDimension(int i10, float f8, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i10, f8, displayMetrics);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i10, float f8, @NonNull DisplayMetrics displayMetrics) {
        float f10;
        float f11;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i10, f8, displayMetrics);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                float f12 = displayMetrics.xdpi;
                                if (f12 == 0.0f) {
                                    return 0.0f;
                                }
                                f10 = f8 / f12;
                                f11 = INCHES_PER_MM;
                            } else {
                                i.k(ai.onnxruntime.a.e(i10, "Invalid unitToConvertTo "));
                                return 0.0f;
                            }
                        } else {
                            float f13 = displayMetrics.xdpi;
                            if (f13 == 0.0f) {
                                return 0.0f;
                            }
                            return f8 / f13;
                        }
                    } else {
                        float f14 = displayMetrics.xdpi;
                        if (f14 == 0.0f) {
                            return 0.0f;
                        }
                        f10 = f8 / f14;
                        f11 = INCHES_PER_PT;
                    }
                    return f10 / f11;
                }
                float f15 = displayMetrics.scaledDensity;
                if (f15 == 0.0f) {
                    return 0.0f;
                }
                return f8 / f15;
            }
            float f16 = displayMetrics.density;
            if (f16 == 0.0f) {
                return 0.0f;
            }
            return f8 / f16;
        }
        return f8;
    }

    public static float dpToPx(float f8, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f8, displayMetrics);
    }

    public static int getUnitFromComplexDimension(int i10) {
        return i10 & 15;
    }

    public static float pxToDp(float f8, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(1, f8, displayMetrics);
    }

    public static float pxToSp(float f8, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(2, f8, displayMetrics);
    }

    public static float spToPx(float f8, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f8, displayMetrics);
    }
}
