package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastWidthSize = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonBarLayout);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.mAllowStacking);
        }
    }

    private int getNextVisibleChildIndex(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean isStacked() {
        return this.mStacked;
    }

    private void setStacked(boolean z9) {
        int i10;
        int i11;
        if (this.mStacked != z9) {
            if (!z9 || this.mAllowStacking) {
                this.mStacked = z9;
                setOrientation(z9 ? 1 : 0);
                if (z9) {
                    i10 = GravityCompat.END;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z9) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z9;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (!isStacked() && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z9 = true;
        } else {
            i12 = i10;
            z9 = false;
        }
        super.onMeasure(i12, i11);
        if (this.mAllowStacking && !isStacked() && (getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
            setStacked(true);
            z9 = true;
        }
        if (z9) {
            super.onMeasure(i10, i11);
        }
        int nextVisibleChildIndex = getNextVisibleChildIndex(0);
        if (nextVisibleChildIndex >= 0) {
            View childAt = getChildAt(nextVisibleChildIndex);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (isStacked()) {
                int nextVisibleChildIndex2 = getNextVisibleChildIndex(nextVisibleChildIndex + 1);
                if (nextVisibleChildIndex2 >= 0) {
                    i13 = getChildAt(nextVisibleChildIndex2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i13 = measuredHeight;
                }
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        if (ViewCompat.getMinimumHeight(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z9) {
        if (this.mAllowStacking != z9) {
            this.mAllowStacking = z9;
            if (!z9 && isStacked()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
