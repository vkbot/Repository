package b3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f340a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final FastOutSlowInInterpolator f341b = new FastOutSlowInInterpolator();
    public static final FastOutLinearInInterpolator c = new FastOutLinearInInterpolator();
    public static final LinearOutSlowInInterpolator d = new LinearOutSlowInInterpolator();
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f8, float f10, float f11) {
        return ai.onnxruntime.a.b(f10, f8, f11, f8);
    }

    public static float b(float f8, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f8;
        }
        if (f13 >= f12) {
            return f10;
        }
        return a(f8, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(float f8, int i10, int i11) {
        return Math.round(f8 * (i11 - i10)) + i10;
    }
}
