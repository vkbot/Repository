package w3;

import android.content.Context;
import android.util.TypedValue;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b {
    public static TypedValue a(int i10, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i10, boolean z9) {
        TypedValue a10 = a(i10, context);
        if (a10 != null && a10.type == 18) {
            if (a10.data != 0) {
                return true;
            }
            return false;
        }
        return z9;
    }

    public static TypedValue c(Context context, String str, int i10) {
        TypedValue a10 = a(i10, context);
        if (a10 != null) {
            return a10;
        }
        n0.b.v("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i10)});
        return null;
    }
}
