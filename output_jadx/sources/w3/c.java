package w3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i10);
    }

    public static ColorStateList b(Context context, TintTypedArray tintTypedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (tintTypedArray.hasValue(i10) && (resourceId = tintTypedArray.getResourceId(i10, 0)) != 0 && (colorStateList = AppCompatResources.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return tintTypedArray.getColorStateList(i10);
    }

    public static Drawable c(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawable;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (drawable = AppCompatResources.getDrawable(context, resourceId)) != null) {
            return drawable;
        }
        return typedArray.getDrawable(i10);
    }

    public static boolean d(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
