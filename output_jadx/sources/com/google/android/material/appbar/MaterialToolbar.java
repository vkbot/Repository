package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import b1.u;
import java.util.ArrayList;
import java.util.Collections;
import s3.m;
import s3.n;
import z3.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: g, reason: collision with root package name */
    public static final ImageView.ScaleType[] f1188g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: b, reason: collision with root package name */
    public Integer f1189b;
    public boolean c;
    public boolean d;
    public ImageView.ScaleType e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f1190f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = androidx.appcompat.R.attr.toolbarStyle
            r0 = 2132018428(0x7f1404fc, float:1.9675162E38)
            android.content.Context r7 = g4.a.a(r7, r8, r3, r0)
            r6.<init>(r7, r8, r3)
            android.content.Context r0 = r6.getContext()
            r7 = 0
            int[] r5 = new int[r7]
            int[] r2 = a3.a.B
            r4 = 2132018428(0x7f1404fc, float:1.9675162E38)
            r1 = r8
            android.content.res.TypedArray r8 = s3.l.d(r0, r1, r2, r3, r4, r5)
            r1 = 2
            boolean r2 = r8.hasValue(r1)
            r3 = -1
            if (r2 == 0) goto L2c
            int r1 = r8.getColor(r1, r3)
            r6.setNavigationIconTint(r1)
        L2c:
            r1 = 4
            boolean r1 = r8.getBoolean(r1, r7)
            r6.c = r1
            r1 = 3
            boolean r1 = r8.getBoolean(r1, r7)
            r6.d = r1
            r1 = 1
            int r1 = r8.getInt(r1, r3)
            if (r1 < 0) goto L4a
            android.widget.ImageView$ScaleType[] r2 = com.google.android.material.appbar.MaterialToolbar.f1188g
            int r3 = r2.length
            if (r1 >= r3) goto L4a
            r1 = r2[r1]
            r6.e = r1
        L4a:
            boolean r1 = r8.hasValue(r7)
            if (r1 == 0) goto L5a
            boolean r1 = r8.getBoolean(r7, r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.f1190f = r1
        L5a:
            r8.recycle()
            android.graphics.drawable.Drawable r8 = r6.getBackground()
            if (r8 != 0) goto L68
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            goto L6c
        L68:
            android.content.res.ColorStateList r7 = o3.c.d(r8)
        L6c:
            if (r7 == 0) goto L83
            z3.k r8 = new z3.k
            r8.<init>()
            r8.q(r7)
            r8.m(r0)
            float r7 = r6.getElevation()
            r8.p(r7)
            r6.setBackground(r8)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, BasicMeasure.EXACTLY), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.e;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f1189b;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof k) {
            u.w(this, (k) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z9, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.c || this.d) {
            ArrayList a10 = n.a(this, getTitle());
            boolean isEmpty = a10.isEmpty();
            m mVar = n.f5709a;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(a10, mVar);
            }
            ArrayList a11 = n.a(this, getSubtitle());
            if (a11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(a11, mVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.c && textView != null) {
                    a(textView, pair);
                }
                if (this.d && textView2 != null) {
                    a(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f1190f;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.e;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof k) {
            ((k) background).p(f8);
        }
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.f1190f;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        this.f1190f = Boolean.valueOf(z9);
        requestLayout();
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.e != scaleType) {
            this.e = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f1189b != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            drawable.setTint(this.f1189b.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i10) {
        this.f1189b = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.d != z9) {
            this.d = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.c != z9) {
            this.c = z9;
            requestLayout();
        }
    }
}
