package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import b1.u;
import g4.a;
import i3.c;
import s3.l;
import z3.h;
import z3.k;
import z3.n;
import z3.o;
import z3.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, z {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1272f = {R.attr.state_checkable};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1273g = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f1274h = {com.example.navistart.R.attr.state_dragged};

    /* renamed from: b, reason: collision with root package name */
    public final c f1275b;
    public final boolean c;
    public boolean d;
    public boolean e;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.example.navistart.R.attr.materialCardViewStyle, com.example.navistart.R.style.Widget_MaterialComponents_CardView), attributeSet, com.example.navistart.R.attr.materialCardViewStyle);
        this.d = false;
        this.e = false;
        this.c = true;
        TypedArray d = l.d(getContext(), attributeSet, a3.a.f21s, com.example.navistart.R.attr.materialCardViewStyle, com.example.navistart.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f1275b = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        k kVar = cVar.c;
        kVar.q(cardBackgroundColor);
        cVar.f2752b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.l();
        MaterialCardView materialCardView = cVar.f2751a;
        ColorStateList a10 = w3.c.a(materialCardView.getContext(), d, 11);
        cVar.f2761n = a10;
        if (a10 == null) {
            cVar.f2761n = ColorStateList.valueOf(-1);
        }
        cVar.f2755h = d.getDimensionPixelSize(12, 0);
        boolean z9 = d.getBoolean(0, false);
        cVar.f2765s = z9;
        materialCardView.setLongClickable(z9);
        cVar.f2759l = w3.c.a(materialCardView.getContext(), d, 6);
        cVar.g(w3.c.c(materialCardView.getContext(), d, 2));
        cVar.f2753f = d.getDimensionPixelSize(5, 0);
        cVar.e = d.getDimensionPixelSize(4, 0);
        cVar.f2754g = d.getInteger(3, 8388661);
        ColorStateList a11 = w3.c.a(materialCardView.getContext(), d, 7);
        cVar.f2758k = a11;
        if (a11 == null) {
            cVar.f2758k = ColorStateList.valueOf(m3.a.a(androidx.appcompat.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList a12 = w3.c.a(materialCardView.getContext(), d, 1);
        a12 = a12 == null ? ColorStateList.valueOf(0) : a12;
        k kVar2 = cVar.d;
        kVar2.q(a12);
        RippleDrawable rippleDrawable = cVar.f2762o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f2758k);
        }
        kVar.p(materialCardView.getCardElevation());
        float f8 = cVar.f2755h;
        ColorStateList colorStateList = cVar.f2761n;
        kVar2.c.f6756k = f8;
        kVar2.invalidateSelf();
        h hVar = kVar2.c;
        if (hVar.e != colorStateList) {
            hVar.e = colorStateList;
            kVar2.onStateChange(kVar2.getState());
        }
        materialCardView.setBackgroundInternal(cVar.d(kVar));
        Drawable c = cVar.j() ? cVar.c() : kVar2;
        cVar.f2756i = c;
        materialCardView.setForeground(cVar.d(c));
        d.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f1275b.c.getBounds());
        return rectF;
    }

    public final void a() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (cVar = this.f1275b).f2762o) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i10 = bounds.bottom;
            cVar.f2762o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            cVar.f2762o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public final void b(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f1275b.c.c.d;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f1275b.d.c.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f1275b.f2757j;
    }

    public int getCheckedIconGravity() {
        return this.f1275b.f2754g;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f1275b.e;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f1275b.f2753f;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f1275b.f2759l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f1275b.f2752b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f1275b.f2752b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f1275b.f2752b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f1275b.f2752b.top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f1275b.c.c.f6755j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f1275b.c.k();
    }

    public ColorStateList getRippleColor() {
        return this.f1275b.f2758k;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.f1275b.f2760m;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f1275b.f2761n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f1275b.f2761n;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f1275b.f2755h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f1275b;
        cVar.k();
        u.w(this, cVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f1275b;
        if (cVar != null && cVar.f2765s) {
            View.mergeDrawableStates(onCreateDrawableState, f1272f);
        }
        if (this.d) {
            View.mergeDrawableStates(onCreateDrawableState, f1273g);
        }
        if (this.e) {
            View.mergeDrawableStates(onCreateDrawableState, f1274h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f1275b;
        if (cVar != null && cVar.f2765s) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.d);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f1275b.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.c) {
            c cVar = this.f1275b;
            if (!cVar.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i10) {
        this.f1275b.c.q(ColorStateList.valueOf(i10));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f8) {
        super.setCardElevation(f8);
        c cVar = this.f1275b;
        cVar.c.p(cVar.f2751a.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1275b.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        kVar.q(colorStateList);
    }

    public void setCheckable(boolean z9) {
        this.f1275b.f2765s = z9;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (this.d != z9) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f1275b.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f1275b;
        if (cVar.f2754g != i10) {
            cVar.f2754g = i10;
            MaterialCardView materialCardView = cVar.f2751a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int i10) {
        this.f1275b.e = i10;
    }

    public void setCheckedIconMarginResource(@DimenRes int i10) {
        if (i10 != -1) {
            this.f1275b.e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        this.f1275b.g(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setCheckedIconSize(@Dimension int i10) {
        this.f1275b.f2753f = i10;
    }

    public void setCheckedIconSizeResource(@DimenRes int i10) {
        if (i10 != 0) {
            this.f1275b.f2753f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        c cVar = this.f1275b;
        cVar.f2759l = colorStateList;
        Drawable drawable = cVar.f2757j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z9) {
        super.setClickable(z9);
        c cVar = this.f1275b;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void setContentPadding(int i10, int i11, int i12, int i13) {
        c cVar = this.f1275b;
        cVar.f2752b.set(i10, i11, i12, i13);
        cVar.l();
    }

    public void setDragged(boolean z9) {
        if (this.e != z9) {
            this.e = z9;
            refreshDrawableState();
            a();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f8) {
        super.setMaxCardElevation(f8);
        this.f1275b.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z9) {
        super.setPreventCornerOverlap(z9);
        c cVar = this.f1275b;
        cVar.m();
        cVar.l();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        c cVar = this.f1275b;
        cVar.c.r(f8);
        k kVar = cVar.d;
        if (kVar != null) {
            kVar.r(f8);
        }
        k kVar2 = cVar.f2764q;
        if (kVar2 != null) {
            kVar2.r(f8);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f8) {
        super.setRadius(f8);
        c cVar = this.f1275b;
        n g10 = cVar.f2760m.g();
        g10.e = new z3.a(f8);
        g10.f6786f = new z3.a(f8);
        g10.f6787g = new z3.a(f8);
        g10.f6788h = new z3.a(f8);
        cVar.h(g10.a());
        cVar.f2756i.invalidateSelf();
        if (cVar.i() || (cVar.f2751a.getPreventCornerOverlap() && !cVar.c.n())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        c cVar = this.f1275b;
        cVar.f2758k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f2762o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), i10);
        c cVar = this.f1275b;
        cVar.f2758k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f2762o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // z3.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        setClipToOutline(oVar.f(getBoundsAsRectF()));
        this.f1275b.h(oVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f1275b;
        if (cVar.f2761n != colorStateList) {
            cVar.f2761n = colorStateList;
            k kVar = cVar.d;
            kVar.c.f6756k = cVar.f2755h;
            kVar.invalidateSelf();
            h hVar = kVar.c;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                kVar.onStateChange(kVar.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(@Dimension int i10) {
        c cVar = this.f1275b;
        if (i10 != cVar.f2755h) {
            cVar.f2755h = i10;
            k kVar = cVar.d;
            ColorStateList colorStateList = cVar.f2761n;
            kVar.c.f6756k = i10;
            kVar.invalidateSelf();
            h hVar = kVar.c;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                kVar.onStateChange(kVar.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z9) {
        super.setUseCompatPadding(z9);
        c cVar = this.f1275b;
        cVar.m();
        cVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f1275b;
        if (cVar != null && cVar.f2765s && isEnabled()) {
            this.d = !this.d;
            refreshDrawableState();
            a();
            cVar.f(this.d, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f1275b.c.q(colorStateList);
    }

    public void setOnCheckedChangeListener(@Nullable i3.a aVar) {
    }

    public void setStrokeColor(@ColorInt int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }
}
