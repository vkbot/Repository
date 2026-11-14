package x3;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.ColorUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6492a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6493b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};
    public static final int[] e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f6494f = a.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int i10;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i10 = 0;
        }
        return ColorUtils.setAlphaComponent(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(e, 0)) != 0) {
                Log.w(f6494f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }
}
