package m3;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import w3.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {
    public static int a(int i10, View view) {
        Context context = view.getContext();
        TypedValue c = b.c(view.getContext(), view.getClass().getCanonicalName(), i10);
        int i11 = c.resourceId;
        if (i11 != 0) {
            return ContextCompat.getColor(context, i11);
        }
        return c.data;
    }

    public static int b(Context context, int i10, int i11) {
        Integer num;
        int i12;
        TypedValue a10 = b.a(i10, context);
        if (a10 != null) {
            int i13 = a10.resourceId;
            if (i13 != 0) {
                i12 = ContextCompat.getColor(context, i13);
            } else {
                i12 = a10.data;
            }
            num = Integer.valueOf(i12);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i11;
    }

    public static int c(float f8, int i10, int i11) {
        return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i11, Math.round(Color.alpha(i11) * f8)), i10);
    }
}
