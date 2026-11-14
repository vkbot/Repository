package s1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class o0 extends ViewGroup {
    public o0(Context context) {
        super(context);
        setClipChildren(true);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FrameLayout.LayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return new FrameLayout.LayoutParams((FrameLayout.LayoutParams) layoutParams);
        }
        return new FrameLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int i15 = layoutParams2.gravity;
                    if (i15 >= 0 && (i15 & 5) == 5) {
                        paddingLeft2 = ((paddingLeft - childAt.getMeasuredWidth()) - layoutParams2.rightMargin) + paddingLeft2;
                    } else {
                        paddingLeft2 += layoutParams2.leftMargin;
                    }
                    int i16 = layoutParams2.gravity;
                    if (i16 >= 0 && (i16 & 80) == 80) {
                        paddingTop2 += (paddingTop - childAt.getMeasuredHeight()) - layoutParams2.bottomMargin;
                    } else {
                        paddingTop2 += layoutParams2.topMargin;
                    }
                }
                childAt.layout(paddingLeft2, paddingTop2, childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + paddingTop2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max = Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight());
        int max2 = Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom());
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i15 = layoutParams.width;
                if (i15 >= 0) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, BasicMeasure.EXACTLY);
                } else if (i15 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, BasicMeasure.EXACTLY);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
                }
                int i16 = layoutParams.height;
                if (i16 >= 0) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, BasicMeasure.EXACTLY);
                } else if (i16 == -1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, BasicMeasure.EXACTLY);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, Integer.MIN_VALUE);
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                i12 = Math.max(i12, childAt.getMeasuredWidth());
                i13 = Math.max(i13, childAt.getMeasuredHeight());
            }
        }
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + i12, i10), View.resolveSize(getPaddingBottom() + getPaddingTop() + i13, i11));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FrameLayout.LayoutParams(getContext(), attributeSet);
    }
}
