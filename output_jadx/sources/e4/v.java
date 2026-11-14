package e4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2193b;
    public ColorStateList c;
    public final /* synthetic */ w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.d = wVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        w wVar = this.d;
        ColorStateList colorStateList2 = wVar.f2198i;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (wVar.f2197h != 0 && wVar.f2198i != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ColorUtils.compositeColors(wVar.f2198i.getColorForState(iArr3, 0), wVar.f2197h), ColorUtils.compositeColors(wVar.f2198i.getColorForState(iArr2, 0), wVar.f2197h), wVar.f2197h});
        }
        this.f2193b = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            w wVar = this.d;
            Drawable drawable = null;
            if (wVar.getText().toString().contentEquals(textView.getText()) && wVar.f2197h != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(wVar.f2197h);
                if (this.c != null) {
                    colorDrawable.setTintList(this.f2193b);
                    drawable = new RippleDrawable(this.c, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
