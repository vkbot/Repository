package c3;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g extends h {
    public final Rect c;
    public final Rect d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f519f;

    public g() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // c3.h
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout d = AppBarLayout.ScrollingViewBehavior.d(coordinatorLayout.getDependencies(view));
        if (d != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int bottom = d.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int bottom2 = ((d.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, bottom2);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.getSystemWindowInsetLeft() + rect.left;
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            int i11 = layoutParams.gravity;
            if (i11 == 0) {
                i11 = 8388659;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.d;
            Gravity.apply(i11, measuredWidth, measuredHeight, rect, rect2, i10);
            int c = c(d);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.e = rect2.top - d.getBottom();
            return;
        }
        coordinatorLayout.onLayoutChild(view, i10);
        this.e = 0;
    }

    public final int c(View view) {
        int i10;
        int i11;
        if (this.f519f == 0) {
            return 0;
        }
        float f8 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof AppBarLayout.BaseBehavior) {
                i10 = ((AppBarLayout.BaseBehavior) behavior).c();
            } else {
                i10 = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f8 = (i10 / i11) + 1.0f;
            }
        }
        int i12 = this.f519f;
        return MathUtils.clamp((int) (f8 * i12), 0, i12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        AppBarLayout d;
        int i14;
        WindowInsetsCompat lastWindowInsets;
        int i15 = view.getLayoutParams().height;
        if ((i15 == -1 || i15 == -2) && (d = AppBarLayout.ScrollingViewBehavior.d(coordinatorLayout.getDependencies(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                if (d.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int totalScrollRange = d.getTotalScrollRange() + size;
            int measuredHeight = d.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                totalScrollRange -= measuredHeight;
            }
            if (i15 == -1) {
                i14 = BasicMeasure.EXACTLY;
            } else {
                i14 = Integer.MIN_VALUE;
            }
            coordinatorLayout.onMeasureChild(view, i10, i11, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i14), i13);
            return true;
        }
        return false;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
