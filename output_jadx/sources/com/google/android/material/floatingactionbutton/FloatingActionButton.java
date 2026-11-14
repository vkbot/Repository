package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import b1.u;
import b3.e;
import com.example.navistart.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j1.i;
import j4.b;
import java.util.List;
import n.p;
import q3.a;
import r3.g;
import r3.h;
import s3.d;
import s3.l;
import s3.q;
import s3.r;
import w3.c;
import z3.k;
import z3.o;
import z3.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FloatingActionButton extends r implements TintableBackgroundView, TintableImageSourceView, a, z, CoordinatorLayout.AttachedBehavior {
    public ColorStateList c;
    public PorterDuff.Mode d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1359f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1360g;

    /* renamed from: h, reason: collision with root package name */
    public int f1361h;

    /* renamed from: i, reason: collision with root package name */
    public int f1362i;

    /* renamed from: j, reason: collision with root package name */
    public int f1363j;

    /* renamed from: k, reason: collision with root package name */
    public int f1364k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1365l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f1366m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f1367n;

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatImageHelper f1368o;

    /* renamed from: p, reason: collision with root package name */
    public final b f1369p;

    /* renamed from: q, reason: collision with root package name */
    public h f1370q;

    /* JADX WARN: Type inference failed for: r5v2, types: [z3.k, r3.g] */
    public FloatingActionButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(g4.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable drawable2;
        this.f5711b = getVisibility();
        this.f1366m = new Rect();
        this.f1367n = new Rect();
        Context context2 = getContext();
        TypedArray d = l.d(context2, attributeSet, a3.a.f13j, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.c = c.a(context2, d, 1);
        this.d = q.b(d.getInt(2, -1), null);
        this.f1360g = c.a(context2, d, 32);
        this.f1361h = d.getInt(7, -1);
        this.f1362i = d.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = d.getDimensionPixelSize(3, 0);
        float dimension = d.getDimension(4, 0.0f);
        float dimension2 = d.getDimension(29, 0.0f);
        float dimension3 = d.getDimension(31, 0.0f);
        this.f1365l = d.getBoolean(36, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d.getDimensionPixelSize(30, 0));
        e a10 = e.a(context2, d, 35);
        e a11 = e.a(context2, d, 28);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a3.a.w, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        o a12 = o.b(context2, resourceId, resourceId2, o.f6793m).a();
        boolean z9 = d.getBoolean(5, false);
        setEnabled(d.getBoolean(0, true));
        d.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f1368o = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, R.attr.floatingActionButtonStyle);
        this.f1369p = new b(this);
        getImpl().g(a12);
        h impl = getImpl();
        ColorStateList colorStateList2 = this.c;
        PorterDuff.Mode mode = this.d;
        ColorStateList colorStateList3 = this.f1360g;
        FloatingActionButton floatingActionButton = impl.f5390s;
        ?? kVar = new k((o) Preconditions.checkNotNull(impl.f5376a));
        impl.f5377b = kVar;
        kVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.f5377b.setTintMode(mode);
        }
        impl.f5377b.m(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            r3.b bVar = new r3.b((o) Preconditions.checkNotNull(impl.f5376a));
            int color = ContextCompat.getColor(context3, R.color.design_fab_stroke_top_outer_color);
            int color2 = ContextCompat.getColor(context3, R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = ContextCompat.getColor(context3, R.color.design_fab_stroke_end_inner_color);
            int color4 = ContextCompat.getColor(context3, R.color.design_fab_stroke_end_outer_color);
            bVar.f5357i = color;
            bVar.f5358j = color2;
            bVar.f5359k = color3;
            bVar.f5360l = color4;
            float f8 = dimensionPixelSize;
            if (bVar.f5356h != f8) {
                bVar.f5356h = f8;
                bVar.f5353b.setStrokeWidth(f8 * 1.3333f);
                bVar.f5362n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList2 != null) {
                bVar.f5361m = colorStateList2.getColorForState(bVar.getState(), bVar.f5361m);
            }
            bVar.f5364p = colorStateList2;
            bVar.f5362n = true;
            bVar.invalidateSelf();
            impl.d = bVar;
            drawable2 = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(impl.d), (Drawable) Preconditions.checkNotNull(impl.f5377b)});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.d = null;
            drawable2 = impl.f5377b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(x3.a.b(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        impl.e = rippleDrawable;
        getImpl().f5383k = dimensionPixelSize2;
        h impl2 = getImpl();
        if (impl2.f5380h != dimension) {
            impl2.f5380h = dimension;
            impl2.e(dimension, impl2.f5381i, impl2.f5382j);
        }
        h impl3 = getImpl();
        if (impl3.f5381i != dimension2) {
            impl3.f5381i = dimension2;
            impl3.e(impl3.f5380h, dimension2, impl3.f5382j);
        }
        h impl4 = getImpl();
        if (impl4.f5382j != dimension3) {
            impl4.f5382j = dimension3;
            impl4.e(impl4.f5380h, impl4.f5381i, dimension3);
        }
        getImpl().f5386n = a10;
        getImpl().f5387o = a11;
        getImpl().f5378f = z9;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private h getImpl() {
        if (this.f1370q == null) {
            this.f1370q = new h(this, new p(8, this));
        }
        return this.f1370q;
    }

    public final int c(int i10) {
        int i11 = this.f1362i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return c(1);
        }
        return c(0);
    }

    public final void d() {
        AnimatorSet c;
        h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f5390s;
        int visibility = floatingActionButton.getVisibility();
        int i10 = impl.r;
        if (visibility == 0) {
            if (i10 == 1) {
                return;
            }
        } else if (i10 != 2) {
            return;
        }
        Animator animator = impl.f5385m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f5390s;
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            e eVar = impl.f5387o;
            if (eVar != null) {
                c = impl.b(eVar, 0.0f, 0.0f, 0.0f);
            } else {
                c = impl.c(0.0f, h.B, h.C, 0.4f, 0.4f);
            }
            c.addListener(new h4.c(impl));
            c.start();
            return;
        }
        floatingActionButton.a(4, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.e;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f1359f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    public final void f() {
        AnimatorSet c;
        float f8;
        float f10;
        h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f5390s;
        Matrix matrix = impl.f5393x;
        FloatingActionButton floatingActionButton2 = impl.f5390s;
        int visibility = floatingActionButton.getVisibility();
        int i10 = impl.r;
        boolean z9 = true;
        if (visibility != 0) {
            if (i10 == 2) {
                return;
            }
        } else if (i10 != 1) {
            return;
        }
        Animator animator = impl.f5385m;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.f5386n != null) {
            z9 = false;
        }
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            if (floatingActionButton.getVisibility() != 0) {
                float f11 = 0.0f;
                floatingActionButton.setAlpha(0.0f);
                if (z9) {
                    f8 = 0.4f;
                } else {
                    f8 = 0.0f;
                }
                floatingActionButton.setScaleY(f8);
                if (z9) {
                    f10 = 0.4f;
                } else {
                    f10 = 0.0f;
                }
                floatingActionButton.setScaleX(f10);
                if (z9) {
                    f11 = 0.4f;
                }
                impl.f5388p = f11;
                impl.a(f11, matrix);
                floatingActionButton2.setImageMatrix(matrix);
            }
            e eVar = impl.f5386n;
            if (eVar != null) {
                c = impl.b(eVar, 1.0f, 1.0f, 1.0f);
            } else {
                c = impl.c(1.0f, h.f5375z, h.A, 1.0f, 1.0f);
            }
            c.addListener(new e3.c(5, impl));
            c.start();
            return;
        }
        floatingActionButton.a(0, false);
        floatingActionButton.setAlpha(1.0f);
        floatingActionButton.setScaleY(1.0f);
        floatingActionButton.setScaleX(1.0f);
        impl.f5388p = 1.0f;
        impl.a(1.0f, matrix);
        floatingActionButton2.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.c;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f5390s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f5381i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f5382j;
    }

    @Nullable
    public Drawable getContentBackground() {
        return getImpl().e;
    }

    @Px
    public int getCustomSize() {
        return this.f1362i;
    }

    public int getExpandedComponentIdHint() {
        return this.f1369p.f3268b;
    }

    @Nullable
    public e getHideMotionSpec() {
        return getImpl().f5387o;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1360g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f1360g;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return (o) Preconditions.checkNotNull(getImpl().f5376a);
    }

    @Nullable
    public e getShowMotionSpec() {
        return getImpl().f5386n;
    }

    public int getSize() {
        return this.f1361h;
    }

    public int getSizeDimension() {
        return c(this.f1361h);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.e;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1359f;
    }

    public boolean getUseCompatPadding() {
        return this.f1365l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h impl = getImpl();
        g gVar = impl.f5377b;
        if (gVar != null) {
            u.w(impl.f5390s, gVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f5390s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f1363j = (sizeDimension - this.f1364k) / 2;
        getImpl().h();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f1366m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c4.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c4.a aVar = (c4.a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        Bundle bundle = (Bundle) Preconditions.checkNotNull((Bundle) aVar.f525b.get("expandableWidgetHelper"));
        b bVar = this.f1369p;
        bVar.getClass();
        bVar.c = bundle.getBoolean("expanded", false);
        bVar.f3268b = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.c) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.d;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        c4.a aVar = new c4.a(onSaveInstanceState);
        b bVar = this.f1369p;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.c);
        bundle.putInt("expandedComponentIdHint", bVar.f3268b);
        aVar.f525b.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f1367n;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i11 = rect.left;
            Rect rect2 = this.f1366m;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            h hVar = this.f1370q;
            if (hVar.f5378f) {
                i10 = Math.max((hVar.f5383k - hVar.f5390s.getSizeDimension()) / 2, 0);
            } else {
                i10 = 0;
            }
            int i12 = -i10;
            rect.inset(i12, i12);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            h impl = getImpl();
            g gVar = impl.f5377b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            r3.b bVar = impl.d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f5361m = colorStateList.getColorForState(bVar.getState(), bVar.f5361m);
                }
                bVar.f5364p = colorStateList;
                bVar.f5362n = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.d != mode) {
            this.d = mode;
            g gVar = getImpl().f5377b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f8) {
        h impl = getImpl();
        if (impl.f5380h != f8) {
            impl.f5380h = f8;
            impl.e(f8, impl.f5381i, impl.f5382j);
        }
    }

    public void setCompatElevationResource(@DimenRes int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f8) {
        h impl = getImpl();
        if (impl.f5381i != f8) {
            impl.f5381i = f8;
            impl.e(impl.f5380h, f8, impl.f5382j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f8) {
        h impl = getImpl();
        if (impl.f5382j != f8) {
            impl.f5382j = f8;
            impl.e(impl.f5380h, impl.f5381i, f8);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@Px int i10) {
        if (i10 >= 0) {
            if (i10 != this.f1362i) {
                this.f1362i = i10;
                requestLayout();
                return;
            }
            return;
        }
        i.k("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        g gVar = getImpl().f5377b;
        if (gVar != null) {
            gVar.p(f8);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        if (z9 != getImpl().f5378f) {
            getImpl().f5378f = z9;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i10) {
        this.f1369p.f3268b = i10;
    }

    public void setHideMotionSpec(@Nullable e eVar) {
        getImpl().f5387o = eVar;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(e.b(i10, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            h impl = getImpl();
            float f8 = impl.f5388p;
            impl.f5388p = f8;
            Matrix matrix = impl.f5393x;
            impl.a(f8, matrix);
            impl.f5390s.setImageMatrix(matrix);
            if (this.e != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        this.f1368o.setImageResource(i10);
        e();
    }

    public void setMaxImageSize(int i10) {
        this.f1364k = i10;
        h impl = getImpl();
        if (impl.f5389q != i10) {
            impl.f5389q = i10;
            float f8 = impl.f5388p;
            impl.f5388p = f8;
            Matrix matrix = impl.f5393x;
            impl.a(f8, matrix);
            impl.f5390s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f1360g != colorStateList) {
            this.f1360g = colorStateList;
            h impl = getImpl();
            ColorStateList colorStateList2 = this.f1360g;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(x3.a.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(x3.a.b(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f8) {
        super.setScaleX(f8);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f8) {
        super.setScaleY(f8);
        getImpl().getClass();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z9) {
        h impl = getImpl();
        impl.f5379g = z9;
        impl.h();
    }

    @Override // z3.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        getImpl().g(oVar);
    }

    public void setShowMotionSpec(@Nullable e eVar) {
        getImpl().f5386n = eVar;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(e.b(i10, getContext()));
    }

    public void setSize(int i10) {
        this.f1362i = 0;
        if (i10 != this.f1361h) {
            this.f1361h = i10;
            requestLayout();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            e();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f1359f != mode) {
            this.f1359f = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f8) {
        super.setTranslationX(f8);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f8) {
        super.setTranslationY(f8);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f8) {
        super.setTranslationZ(f8);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f1365l != z9) {
            this.f1365l = z9;
            getImpl().h();
        }
    }

    @Override // s3.r, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f1371a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1372b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.f14k);
            this.f1372b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.f1372b || layoutParams.getAnchorId() != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f1371a == null) {
                this.f1371a = new Rect();
            }
            Rect rect = this.f1371a;
            d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean b(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
            if (!this.f1372b || layoutParams.getAnchorId() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f1366m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z9;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    z9 = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
                } else {
                    z9 = false;
                }
                if (z9) {
                    b(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z9;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = dependencies.get(i13);
                if (view2 instanceof AppBarLayout) {
                    if (a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                        z9 = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior;
                    } else {
                        z9 = false;
                    }
                    if (z9 && b(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i10);
            Rect rect = floatingActionButton.f1366m;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin) {
                    i11 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) {
                    i11 = -rect.left;
                } else {
                    i11 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    ViewCompat.offsetTopAndBottom(floatingActionButton, i12);
                }
                if (i11 != 0) {
                    ViewCompat.offsetLeftAndRight(floatingActionButton, i11);
                }
            }
            return true;
        }

        public BaseBehavior() {
            this.f1372b = true;
        }
    }

    public void setRippleColor(@ColorInt int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }
}
