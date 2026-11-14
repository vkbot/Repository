package g4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2452a = {R.attr.theme, androidx.appcompat.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2453b = {com.example.navistart.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i10, int i11) {
        return b(context, attributeSet, new int[0], i10, i11);
    }

    public static Context b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        boolean z9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2453b, i10, i11);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i12 = iArr2[0];
        if ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == i12) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i12 != 0 && !z9) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i12);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    iArr3[i13] = obtainStyledAttributes2.getResourceId(i13, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArr3[i14];
                if (i15 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(i15, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2452a);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                contextThemeWrapper.getTheme().applyStyle(resourceId, true);
            }
            return contextThemeWrapper;
        }
        return context;
    }
}
