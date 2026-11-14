package w3;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.math.MathUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class i {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i10;
        int i11;
        int weight;
        int i12;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = configuration.fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE) {
                i11 = configuration.fontWeightAdjustment;
                if (i11 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i12 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, MathUtils.clamp(i12 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
