package f4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.example.navistart.R;
import w3.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends AppCompatTextView {
    public static int a(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i12, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            } else {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (b.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, a3.a.f26z);
            int a10 = a(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (a10 >= 0) {
                setLineHeight(a10);
            }
        }
    }
}
