package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.example.navistart.R;
import g4.a;
import s3.l;
import w3.c;
import z3.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: b, reason: collision with root package name */
    public final k f1357b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1358f;

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f1357b = new k();
        TypedArray d = l.d(context2, attributeSet, a3.a.f22u, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.c = d.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.e = d.getDimensionPixelOffset(2, 0);
        this.f1358f = d.getDimensionPixelOffset(1, 0);
        setDividerColor(c.a(context2, d, 0).getDefaultColor());
        d.recycle();
    }

    public int getDividerColor() {
        return this.d;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f1358f;
    }

    @Px
    public int getDividerInsetStart() {
        return this.e;
    }

    public int getDividerThickness() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int width;
        int i11;
        super.onDraw(canvas);
        boolean z9 = true;
        if (getLayoutDirection() != 1) {
            z9 = false;
        }
        if (z9) {
            i10 = this.f1358f;
        } else {
            i10 = this.e;
        }
        if (z9) {
            width = getWidth();
            i11 = this.e;
        } else {
            width = getWidth();
            i11 = this.f1358f;
        }
        int i12 = width - i11;
        int bottom = getBottom() - getTop();
        k kVar = this.f1357b;
        kVar.setBounds(i10, 0, i12, bottom);
        kVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i12 = this.c;
        if (i12 > 0 && measuredHeight != i12) {
            measuredHeight = i12;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(@ColorInt int i10) {
        if (this.d != i10) {
            this.d = i10;
            this.f1357b.q(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f1358f = i10;
    }

    public void setDividerInsetEndResource(@DimenRes int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@Px int i10) {
        this.e = i10;
    }

    public void setDividerInsetStartResource(@DimenRes int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@Px int i10) {
        if (this.c != i10) {
            this.c = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
