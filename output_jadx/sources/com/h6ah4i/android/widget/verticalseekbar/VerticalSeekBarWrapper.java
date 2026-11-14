package com.h6ah4i.android.widget.verticalseekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class VerticalSeekBarWrapper extends FrameLayout {
    public VerticalSeekBarWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    private VerticalSeekBar getChildSeekBar() {
        View view;
        if (getChildCount() > 0) {
            view = getChildAt(0);
        } else {
            view = null;
        }
        if (!(view instanceof VerticalSeekBar)) {
            return null;
        }
        return (VerticalSeekBar) view;
    }

    public final void a(int i10, int i11) {
        boolean z9;
        float max;
        VerticalSeekBar childSeekBar = getChildSeekBar();
        if (childSeekBar != null) {
            if (ViewCompat.getLayoutDirection(this) == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int rotationAngle = childSeekBar.getRotationAngle();
            int measuredWidth = childSeekBar.getMeasuredWidth();
            int measuredHeight = childSeekBar.getMeasuredHeight();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            float max2 = (Math.max(0, i10 - paddingRight) - measuredHeight) * 0.5f;
            ViewGroup.LayoutParams layoutParams = childSeekBar.getLayoutParams();
            int i12 = i11 - paddingBottom;
            layoutParams.width = Math.max(0, i12);
            layoutParams.height = -2;
            childSeekBar.setLayoutParams(layoutParams);
            if (z9) {
                max = 0.0f;
            } else {
                max = Math.max(0, i12);
            }
            childSeekBar.setPivotX(max);
            childSeekBar.setPivotY(0.0f);
            if (rotationAngle != 90) {
                if (rotationAngle == 270) {
                    childSeekBar.setRotation(270.0f);
                    if (z9) {
                        childSeekBar.setTranslationX(max2);
                        childSeekBar.setTranslationY(measuredWidth);
                        return;
                    } else {
                        childSeekBar.setTranslationX(-(measuredHeight + max2));
                        childSeekBar.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            childSeekBar.setRotation(90.0f);
            if (z9) {
                childSeekBar.setTranslationX(measuredHeight + max2);
                childSeekBar.setTranslationY(0.0f);
            } else {
                childSeekBar.setTranslationX(-max2);
                childSeekBar.setTranslationY(measuredWidth);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z9;
        int measuredWidth;
        int measuredHeight;
        VerticalSeekBar childSeekBar = getChildSeekBar();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (childSeekBar != null && mode != 1073741824) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingRight), mode);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - paddingBottom), mode2);
            VerticalSeekBar childSeekBar2 = getChildSeekBar();
            if (childSeekBar2 != null) {
                z9 = childSeekBar2.c();
            } else {
                z9 = false;
            }
            if (z9) {
                childSeekBar.measure(makeMeasureSpec2, makeMeasureSpec);
                measuredWidth = childSeekBar.getMeasuredHeight();
                measuredHeight = childSeekBar.getMeasuredWidth();
            } else {
                childSeekBar.measure(makeMeasureSpec, makeMeasureSpec2);
                measuredWidth = childSeekBar.getMeasuredWidth();
                measuredHeight = childSeekBar.getMeasuredHeight();
            }
            setMeasuredDimension(View.resolveSizeAndState(measuredWidth + paddingRight, i10, 0), View.resolveSizeAndState(measuredHeight + paddingBottom, i11, 0));
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        boolean z9;
        VerticalSeekBar childSeekBar = getChildSeekBar();
        if (childSeekBar != null) {
            z9 = childSeekBar.c();
        } else {
            z9 = false;
        }
        if (z9) {
            VerticalSeekBar childSeekBar2 = getChildSeekBar();
            if (childSeekBar2 != null) {
                childSeekBar2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i11 - (getPaddingBottom() + getPaddingTop())), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(Math.max(0, i10 - (getPaddingRight() + getPaddingLeft())), Integer.MIN_VALUE));
            }
            a(i10, i11);
            super.onSizeChanged(i10, i11, i12, i13);
            return;
        }
        VerticalSeekBar childSeekBar3 = getChildSeekBar();
        if (childSeekBar3 != null) {
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childSeekBar3.getLayoutParams();
            layoutParams.width = -2;
            int i14 = i11 - paddingBottom;
            layoutParams.height = Math.max(0, i14);
            childSeekBar3.setLayoutParams(layoutParams);
            childSeekBar3.measure(0, 0);
            int measuredWidth = childSeekBar3.getMeasuredWidth();
            int i15 = i10 - paddingRight;
            childSeekBar3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i15), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(0, i14), BasicMeasure.EXACTLY));
            layoutParams.gravity = 51;
            layoutParams.leftMargin = (Math.max(0, i15) - measuredWidth) / 2;
            childSeekBar3.setLayoutParams(layoutParams);
        }
        super.onSizeChanged(i10, i11, i12, i13);
    }
}
