package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.h;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import b1.u;
import c3.f;
import c3.g;
import c3.j;
import com.example.navistart.R;
import com.google.android.material.appbar.AppBarLayout;
import j1.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import s3.l;
import z3.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int B = 0;
    public Behavior A;

    /* renamed from: b, reason: collision with root package name */
    public int f1164b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1165f;

    /* renamed from: g, reason: collision with root package name */
    public int f1166g;

    /* renamed from: h, reason: collision with root package name */
    public WindowInsetsCompat f1167h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1168i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1169j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1170k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1171l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f1172m;

    /* renamed from: n, reason: collision with root package name */
    public int f1173n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f1174o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f1175p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f1176q;
    public final ArrayList r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f1177s;
    public final long t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f1178u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f1179v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f1180x;

    /* renamed from: y, reason: collision with root package name */
    public Integer f1181y;

    /* renamed from: z, reason: collision with root package name */
    public final float f1182z;

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(g4.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f1166g = 0;
        this.r = new ArrayList();
        this.f1177s = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d = l.d(context3, attributeSet, j.f524a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (d.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d.getResourceId(0, 0)));
            }
            d.recycle();
            TypedArray d10 = l.d(context2, attributeSet, a3.a.f7a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.f1172m = w3.c.a(context2, d10, 6);
            this.t = com.bumptech.glide.d.q(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f1178u = com.bumptech.glide.d.r(context2, R.attr.motionEasingStandardInterpolator, b3.a.f340a);
            if (d10.hasValue(4)) {
                d(d10.getBoolean(4, false), false, false);
            }
            if (d10.hasValue(3)) {
                j.a(this, d10.getDimensionPixelSize(3, 0));
            }
            setBackground(d10.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (d10.hasValue(2)) {
                    setKeyboardNavigationCluster(d10.getBoolean(2, false));
                }
                if (d10.hasValue(1)) {
                    setTouchscreenBlocksFocus(d10.getBoolean(1, false));
                }
            }
            this.f1182z = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f1171l = d10.getBoolean(5, false);
            this.f1173n = d10.getResourceId(7, -1);
            setStatusBarForeground(d10.getDrawable(8));
            d10.recycle();
            ViewCompat.setOnApplyWindowInsetsListener(this, new r5.c(4, this));
        } catch (Throwable th) {
            d.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c3.c, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [c3.c, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [c3.c, android.widget.LinearLayout$LayoutParams] */
    public static c3.c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ?? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f512a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f512a = 1;
            return layoutParams3;
        }
        ?? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams4.f512a = 1;
        return layoutParams4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c3.c, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c3.c generateLayoutParams(AttributeSet attributeSet) {
        h hVar;
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.f512a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.f8b);
        layoutParams.f512a = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            hVar = null;
        } else {
            hVar = new h(3);
        }
        layoutParams.f513b = hVar;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void c() {
        d dVar;
        Behavior behavior = this.A;
        if (behavior != null && this.c != -1 && this.f1166g == 0) {
            dVar = behavior.j(AbsSavedState.EMPTY_STATE, this);
        } else {
            dVar = null;
        }
        this.c = -1;
        this.d = -1;
        this.e = -1;
        if (dVar != null) {
            Behavior behavior2 = this.A;
            if (behavior2.f1186m == null) {
                behavior2.f1186m = dVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c3.c;
    }

    public final void d(boolean z9, boolean z10, boolean z11) {
        int i10;
        int i11;
        if (z9) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int i12 = 0;
        if (z10) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i10 | i11;
        if (z11) {
            i12 = 8;
        }
        this.f1166g = i13 | i12;
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1180x != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f1164b);
            this.f1180x.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1180x;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z9) {
        float f8;
        float f10;
        if (!this.f1168i && this.f1170k != z9) {
            this.f1170k = z9;
            refreshDrawableState();
            if (getBackground() instanceof k) {
                float f11 = 0.0f;
                if (this.f1172m != null) {
                    if (z9) {
                        f10 = 0.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (z9) {
                        f11 = 1.0f;
                    }
                    g(f10, f11);
                    return true;
                }
                if (this.f1171l) {
                    float f12 = this.f1182z;
                    if (z9) {
                        f8 = 0.0f;
                    } else {
                        f8 = f12;
                    }
                    if (z9) {
                        f11 = f12;
                    }
                    g(f8, f11);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean f(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f1174o == null && (i10 = this.f1173n) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f1173n);
            }
            if (view2 != null) {
                this.f1174o = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f1174o;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g(float f8, float f10) {
        ValueAnimator valueAnimator = this.f1175p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f10);
        this.f1175p = ofFloat;
        ofFloat.setDuration(this.t);
        this.f1175p.setInterpolator(this.f1178u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f1176q;
        if (animatorUpdateListener != null) {
            this.f1175p.addUpdateListener(animatorUpdateListener);
        }
        this.f1175p.start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, c3.c, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f512a = 1;
        return layoutParams;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.A = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int minimumHeight;
        int i11 = this.d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c3.c cVar = (c3.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = cVar.f512a;
                if ((i13 & 5) == 5) {
                    int i14 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i13 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i10 = i14 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i10 = Math.min(i10, measuredHeight - getTopInset());
                        }
                        i12 += i10;
                    }
                    i10 = minimumHeight + i14;
                    if (childCount == 0) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                    i12 += i10;
                } else if (i12 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i12);
        this.d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.e;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c3.c cVar = (c3.c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i13 = cVar.f512a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    i12 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.e = max;
        return max;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.f1173n;
    }

    @Nullable
    public k getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof k) {
            return (k) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i10;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i11 = (minimumHeight * 2) + topInset;
            if (i11 < getHeight()) {
                return i11;
            }
            return minimumHeight + topInset;
        }
        int childCount = getChildCount();
        if (childCount >= 1) {
            i10 = getChildAt(childCount - 1).getMinimumHeight();
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            int i12 = (i10 * 2) + topInset;
            if (i12 < getHeight()) {
                return i12;
            }
            return i10 + topInset;
        }
        return getHeight() / 3;
    }

    public int getPendingAction() {
        return this.f1166g;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.f1180x;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f1167h;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.c;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c3.c cVar = (c3.c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = cVar.f512a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i12;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    i14 -= getTopInset();
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    i12 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof k) {
            u.w(this, (k) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f1179v == null) {
            this.f1179v = new int[4];
        }
        int[] iArr = this.f1179v;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z9 = this.f1169j;
        if (z9) {
            i11 = R.attr.state_liftable;
        } else {
            i11 = -2130904330;
        }
        iArr[0] = i11;
        if (z9 && this.f1170k) {
            i12 = R.attr.state_lifted;
        } else {
            i12 = -2130904331;
        }
        iArr[1] = i12;
        if (z9) {
            i13 = R.attr.state_collapsible;
        } else {
            i13 = -2130904326;
        }
        iArr[2] = i13;
        if (z9 && this.f1170k) {
            i14 = R.attr.state_collapsed;
        } else {
            i14 = -2130904325;
        }
        iArr[3] = i14;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f1174o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1174o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        boolean z10 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    ViewCompat.offsetTopAndBottom(getChildAt(childCount), topInset);
                }
            }
        }
        c();
        this.f1165f = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((c3.c) getChildAt(i14).getLayoutParams()).c != null) {
                this.f1165f = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f1180x;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f1168i) {
            if (!this.f1171l) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount3) {
                        int i16 = ((c3.c) getChildAt(i15).getLayoutParams()).f512a;
                        if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                            break;
                        } else {
                            i15++;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (this.f1169j != z10) {
                this.f1169j = z10;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = MathUtils.clamp(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        final k kVar;
        ColorStateList colorStateList;
        int i10;
        Context context = getContext();
        final Integer num = null;
        if (drawable instanceof k) {
            kVar = (k) drawable;
        } else {
            ColorStateList d = o3.c.d(drawable);
            if (d == null) {
                kVar = null;
            } else {
                k kVar2 = new k();
                kVar2.q(d);
                kVar = kVar2;
            }
        }
        if (kVar != null && (colorStateList = kVar.c.d) != null) {
            this.w = colorStateList.getDefaultColor();
            final ColorStateList colorStateList2 = this.f1172m;
            if (colorStateList2 != null) {
                Context context2 = getContext();
                TypedValue a10 = w3.b.a(R.attr.colorSurface, context2);
                if (a10 != null) {
                    int i11 = a10.resourceId;
                    if (i11 != 0) {
                        i10 = ContextCompat.getColor(context2, i11);
                    } else {
                        i10 = a10.data;
                    }
                    num = Integer.valueOf(i10);
                }
                this.f1176q = new ValueAnimator.AnimatorUpdateListener() { // from class: c3.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num2;
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        LinkedHashSet linkedHashSet = appBarLayout.f1177s;
                        ArrayList arrayList = appBarLayout.r;
                        int c = m3.a.c(((Float) valueAnimator.getAnimatedValue()).floatValue(), appBarLayout.w, colorStateList2.getDefaultColor());
                        ColorStateList valueOf = ColorStateList.valueOf(c);
                        k kVar3 = kVar;
                        kVar3.q(valueOf);
                        if (appBarLayout.f1180x != null && (num2 = appBarLayout.f1181y) != null && num2.equals(num)) {
                            appBarLayout.f1180x.setTint(c);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                if (obj == null) {
                                    if (kVar3.c.d != null) {
                                        throw null;
                                    }
                                } else {
                                    n0.b.a();
                                    return;
                                }
                            }
                        }
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                throw com.bumptech.glide.g.b(it);
                            }
                        }
                    }
                };
            } else {
                kVar.m(context);
                this.f1176q = new ValueAnimator.AnimatorUpdateListener() { // from class: c3.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i12 = AppBarLayout.B;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        kVar.p(floatValue);
                        AppBarLayout appBarLayout = AppBarLayout.this;
                        Drawable drawable2 = appBarLayout.f1180x;
                        if (drawable2 instanceof k) {
                            ((k) drawable2).p(floatValue);
                        }
                        Iterator it = appBarLayout.r.iterator();
                        if (!it.hasNext()) {
                            Iterator it2 = appBarLayout.f1177s.iterator();
                            if (!it2.hasNext()) {
                                return;
                            } else {
                                throw com.bumptech.glide.g.b(it2);
                            }
                        }
                        throw com.bumptech.glide.g.b(it);
                    }
                };
            }
            drawable = kVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof k) {
            ((k) background).p(f8);
        }
    }

    public void setExpanded(boolean z9) {
        d(z9, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z9) {
        this.f1171l = z9;
    }

    public void setLiftOnScrollColor(@Nullable ColorStateList colorStateList) {
        if (this.f1172m != colorStateList) {
            this.f1172m = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.f1173n = -1;
        if (view == null) {
            WeakReference weakReference = this.f1174o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1174o = null;
            return;
        }
        this.f1174o = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i10) {
        this.f1173n = i10;
        WeakReference weakReference = this.f1174o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f1174o = null;
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f1168i = z9;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
        } else {
            i.k("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setPendingAction(int i10) {
        this.f1166g = i10;
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2;
        boolean z9;
        Drawable drawable3 = this.f1180x;
        if (drawable3 != drawable) {
            Integer num = null;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            } else {
                drawable2 = null;
            }
            this.f1180x = drawable2;
            if (drawable2 instanceof k) {
                num = Integer.valueOf(((k) drawable2).w);
            } else {
                ColorStateList d = o3.c.d(drawable2);
                if (d != null) {
                    num = Integer.valueOf(d.getDefaultColor());
                }
            }
            this.f1181y = num;
            Drawable drawable4 = this.f1180x;
            boolean z10 = false;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f1180x.setState(getDrawableState());
                }
                DrawableCompat.setLayoutDirection(this.f1180x, getLayoutDirection());
                Drawable drawable5 = this.f1180x;
                if (getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawable5.setVisible(z9, false);
                this.f1180x.setCallback(this);
            }
            if (this.f1180x != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(@DrawableRes int i10) {
        setStatusBarForeground(AppCompatResources.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f8) {
        j.a(this, f8);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z9;
        super.setVisibility(i10);
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable = this.f1180x;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1180x) {
            return false;
        }
        return true;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends f {

        /* renamed from: j, reason: collision with root package name */
        public int f1183j;

        /* renamed from: k, reason: collision with root package name */
        public int f1184k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f1185l;

        /* renamed from: m, reason: collision with root package name */
        public d f1186m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f1187n;

        public BaseBehavior() {
            this.f515f = -1;
            this.f517h = -1;
        }

        public static View f(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View h(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z9) {
            View view;
            boolean z10;
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 < childCount) {
                    view = appBarLayout.getChildAt(i12);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i13 = ((c3.c) view.getLayoutParams()).f512a;
                if ((i13 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z10 = true;
                    if (i11 > 0) {
                    }
                }
            }
            z10 = false;
            if (appBarLayout.f1171l) {
                z10 = appBarLayout.f(h(coordinatorLayout));
            }
            boolean e = appBarLayout.e(z10);
            if (!z9) {
                if (e) {
                    List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
                    int size = dependents.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i14).getLayoutParams()).getBehavior();
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).f519f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // c3.f
        public final int c() {
            return a() + this.f1183j;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x015e  */
        @Override // c3.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int d(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public final void g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int height;
            int abs = Math.abs(c() - i10);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int c = c();
            ValueAnimator valueAnimator = this.f1185l;
            if (c == i10) {
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1185l.cancel();
                    return;
                }
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f1185l = valueAnimator2;
                valueAnimator2.setInterpolator(b3.a.e);
                this.f1185l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.f1185l.setDuration(Math.min(height, 600));
            this.f1185l.setIntValues(c, i10);
            this.f1185l.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void i(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L2b
                if (r12 >= 0) goto L11
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                int r1 = r10.getDownNestedPreScrollRange()
                int r1 = r1 + r0
            Le:
                r6 = r0
                r7 = r1
                goto L18
            L11:
                int r0 = r10.getUpNestedPreScrollRange()
                int r0 = -r0
                r1 = 0
                goto Le
            L18:
                if (r6 == r7) goto L2b
                int r0 = r8.c()
                int r5 = r0 - r12
                r2 = r8
                r3 = r9
                r4 = r10
                int r9 = r2.d(r3, r4, r5, r6, r7)
                r10 = 1
                r13[r10] = r9
                goto L2c
            L2b:
                r4 = r10
            L2c:
                boolean r9 = r4.f1171l
                if (r9 == 0) goto L37
                boolean r9 = r4.f(r11)
                r4.e(r9)
            L37:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.i(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.customview.view.AbsSavedState, com.google.android.material.appbar.d] */
        public final d j(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z9;
            boolean z10;
            int a10 = a();
            int childCount = appBarLayout.getChildCount();
            boolean z11 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + a10;
                if (childAt.getTop() + a10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    ?? absSavedState = new AbsSavedState(parcelable);
                    if (a10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    absSavedState.c = z9;
                    if (!z9 && (-a10) >= appBarLayout.getTotalScrollRange()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    absSavedState.f1195b = z10;
                    absSavedState.d = i10;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z11 = true;
                    }
                    absSavedState.f1196f = z11;
                    absSavedState.e = bottom / childAt.getHeight();
                    return absSavedState;
                }
            }
            return null;
        }

        public final void k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int c = c() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = appBarLayout.getChildAt(i10);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    c3.c cVar = (c3.c) childAt.getLayoutParams();
                    if ((cVar.f512a & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    int i11 = -c;
                    if (top <= i11 && bottom >= i11) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                c3.c cVar2 = (c3.c) childAt2.getLayoutParams();
                int i12 = cVar2.f512a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i13 -= appBarLayout.getTopInset();
                    }
                    if ((i12 & 2) == 2) {
                        i14 += childAt2.getMinimumHeight();
                    } else if ((i12 & 5) == 5) {
                        int minimumHeight = childAt2.getMinimumHeight() + i14;
                        if (c < minimumHeight) {
                            i13 = minimumHeight;
                        } else {
                            i14 = minimumHeight;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        i13 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (c < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    g(coordinatorLayout, appBarLayout, MathUtils.clamp(i13 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // c3.h, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z9;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            d dVar = this.f1186m;
            if (dVar != null && (pendingAction & 8) == 0) {
                if (dVar.f1195b) {
                    e(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (dVar.c) {
                    e(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(dVar.d);
                    int i11 = -childAt.getBottom();
                    if (this.f1186m.f1196f) {
                        round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i11;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f1186m.e) + i11;
                    }
                    e(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i12 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z9) {
                        g(coordinatorLayout, appBarLayout, i12);
                    } else {
                        e(coordinatorLayout, appBarLayout, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z9) {
                        g(coordinatorLayout, appBarLayout, 0);
                    } else {
                        e(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f1166g = 0;
            this.f1186m = null;
            int clamp = MathUtils.clamp(a(), -appBarLayout.getTotalScrollRange(), 0);
            c3.i iVar = this.f520a;
            if (iVar != null) {
                if (iVar.c != clamp) {
                    iVar.c = clamp;
                    iVar.b();
                }
            } else {
                this.f521b = clamp;
            }
            l(coordinatorLayout, appBarLayout, a(), 0, true);
            appBarLayout.f1164b = a();
            if (!appBarLayout.willNotDraw()) {
                appBarLayout.postInvalidateOnAnimation();
            }
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.onMeasureChild(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            i(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i13 < 0) {
                int i15 = -appBarLayout.getDownNestedScrollRange();
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = d(coordinatorLayout2, appBarLayout, c() - i13, i15, 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i13 == 0 && !ViewCompat.hasAccessibilityDelegate(coordinatorLayout2)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout2, new b(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof d) {
                d dVar = (d) parcelable;
                this.f1186m = dVar;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, dVar.getSuperState());
            } else {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.f1186m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            d j10 = j(onSaveInstanceState, appBarLayout);
            if (j10 == null) {
                return onSaveInstanceState;
            }
            return j10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            boolean z9;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i10 & 2) != 0 && (appBarLayout.f1171l || appBarLayout.f1170k || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && (valueAnimator = this.f1185l) != null) {
                valueAnimator.cancel();
            }
            this.f1187n = null;
            this.f1184k = i11;
            return z9;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1184k == 0 || i10 == 1) {
                k(coordinatorLayout, appBarLayout);
                if (appBarLayout.f1171l) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f1187n = new WeakReference(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f515f = -1;
            this.f517h = -1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c3.c, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f512a = 1;
        return layoutParams;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends g {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.D);
            this.f519f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public static AppBarLayout d(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.offsetTopAndBottom(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f1183j) + this.e) - c(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f1171l) {
                    appBarLayout.e(appBarLayout.f(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout d = d(coordinatorLayout.getDependencies(view));
            if (d != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    d.d(false, !z9, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }
}
