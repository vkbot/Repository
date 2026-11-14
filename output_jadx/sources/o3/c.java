package o3;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.transition.d;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c {
    public static Drawable a(Drawable drawable, Drawable drawable2, int i10, int i11) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i10 == -1 && (i10 = drawable2.getIntrinsicWidth()) == -1) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (i11 == -1 && (i11 = drawable2.getIntrinsicHeight()) == -1) {
            i11 = drawable.getIntrinsicHeight();
        }
        if (i10 > drawable.getIntrinsicWidth() || i11 > drawable.getIntrinsicHeight()) {
            float f8 = i10 / i11;
            if (f8 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i11 = (int) (intrinsicWidth / f8);
                i10 = intrinsicWidth;
            } else {
                i11 = drawable.getIntrinsicHeight();
                i10 = (int) (f8 * i11);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i10, i11);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static int[] c(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static ColorStateList d(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && d.q(drawable)) {
            colorStateList = d.d(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static void e(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }
}
