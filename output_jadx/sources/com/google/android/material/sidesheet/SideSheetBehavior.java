package com.google.android.material.sidesheet;

import a3.a;
import a4.d;
import a4.f;
import a4.h;
import ai.onnxruntime.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import b1.u;
import com.bumptech.glide.g;
import com.example.navistart.R;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j1.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.commons.net.ftp.FTPReply;
import w3.c;
import z3.k;
import z3.n;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public u f1400a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1401b;
    public final ColorStateList c;
    public final o d;
    public final h e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1402f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1403g;

    /* renamed from: h, reason: collision with root package name */
    public int f1404h;

    /* renamed from: i, reason: collision with root package name */
    public ViewDragHelper f1405i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1406j;

    /* renamed from: k, reason: collision with root package name */
    public final float f1407k;

    /* renamed from: l, reason: collision with root package name */
    public int f1408l;

    /* renamed from: m, reason: collision with root package name */
    public int f1409m;

    /* renamed from: n, reason: collision with root package name */
    public int f1410n;

    /* renamed from: o, reason: collision with root package name */
    public int f1411o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f1412p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f1413q;
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f1414s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f1415u;

    /* renamed from: v, reason: collision with root package name */
    public final d f1416v;

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new h(this);
        this.f1403g = true;
        this.f1404h = 5;
        this.f1407k = 0.1f;
        this.r = -1;
        this.f1415u = new LinkedHashSet();
        this.f1416v = new d(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.F);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = o.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.f1413q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f1413q = null;
            WeakReference weakReference2 = this.f1412p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.d;
        if (oVar != null) {
            k kVar = new k(oVar);
            this.f1401b = kVar;
            kVar.m(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f1401b.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1401b.setTint(typedValue.data);
            }
        }
        this.f1402f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f1403g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void a(int i10) {
        View view;
        int i11;
        if (this.f1404h != i10) {
            this.f1404h = i10;
            WeakReference weakReference = this.f1412p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            if (this.f1404h == 5) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (view.getVisibility() != i11) {
                view.setVisibility(i11);
            }
            Iterator it = this.f1415u.iterator();
            if (!it.hasNext()) {
                d();
                return;
            }
            throw g.b(it);
        }
    }

    public final boolean b() {
        if (this.f1405i != null) {
            if (this.f1403g || this.f1404h == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c(View view, int i10, boolean z9) {
        int j10;
        if (i10 != 3) {
            if (i10 == 5) {
                j10 = this.f1400a.k();
            } else {
                i.k(ai.onnxruntime.a.e(i10, "Invalid state to get outer edge offset: "));
                return;
            }
        } else {
            j10 = this.f1400a.j();
        }
        ViewDragHelper viewDragHelper = this.f1405i;
        if (viewDragHelper != null && (!z9 ? viewDragHelper.smoothSlideViewTo(view, j10, view.getTop()) : viewDragHelper.settleCapturedViewAt(j10, view.getTop()))) {
            a(2);
            this.e.a(i10);
        } else {
            a(i10);
        }
    }

    public final void d() {
        View view;
        WeakReference weakReference = this.f1412p;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            final int i10 = 5;
            if (this.f1404h != 5) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: a4.b
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    public final boolean perform(View view2, AccessibilityViewCommand.CommandArguments commandArguments) {
                        String str;
                        int i11 = i10;
                        if (i11 != 1 && i11 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.f1412p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.f1412p.get();
                                c cVar = new c(sideSheetBehavior, i11, 0);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(cVar);
                                    return true;
                                }
                                cVar.run();
                                return true;
                            }
                            sideSheetBehavior.a(i11);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i11 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(ai.onnxruntime.a.p(sb, str, " should not be set externally."));
                    }
                });
            }
            final int i11 = 3;
            if (this.f1404h != 3) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new AccessibilityViewCommand() { // from class: a4.b
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    public final boolean perform(View view2, AccessibilityViewCommand.CommandArguments commandArguments) {
                        String str;
                        int i112 = i11;
                        if (i112 != 1 && i112 != 2) {
                            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                            WeakReference weakReference2 = sideSheetBehavior.f1412p;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                View view3 = (View) sideSheetBehavior.f1412p.get();
                                c cVar = new c(sideSheetBehavior, i112, 0);
                                ViewParent parent = view3.getParent();
                                if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                                    view3.post(cVar);
                                    return true;
                                }
                                cVar.run();
                                return true;
                            }
                            sideSheetBehavior.a(i112);
                            return true;
                        }
                        StringBuilder sb = new StringBuilder("STATE_");
                        if (i112 == 1) {
                            str = "DRAGGING";
                        } else {
                            str = "SETTLING";
                        }
                        throw new IllegalArgumentException(ai.onnxruntime.a.p(sb, str, " should not be set externally."));
                    }
                });
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f1412p = null;
        this.f1405i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f1412p = null;
        this.f1405i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ViewCompat.getAccessibilityPaneTitle(view) != null) && this.f1403g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f1414s) != null) {
                velocityTracker.recycle();
                this.f1414s = null;
            }
            if (this.f1414s == null) {
                this.f1414s = VelocityTracker.obtain();
            }
            this.f1414s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.f1406j) {
                    this.f1406j = false;
                    return false;
                }
            } else {
                this.t = (int) motionEvent.getX();
            }
            if (!this.f1406j && (viewDragHelper = this.f1405i) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        this.f1406j = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View view2;
        View view3;
        int i12;
        int i13;
        View findViewById;
        int i14;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i15 = 0;
        if (this.f1412p == null) {
            this.f1412p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            com.bumptech.glide.d.q(context, R.attr.motionDurationMedium2, 300);
            com.bumptech.glide.d.q(context, R.attr.motionDurationShort3, FTPReply.FILE_STATUS_OK);
            com.bumptech.glide.d.q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            k kVar = this.f1401b;
            if (kVar != null) {
                view.setBackground(kVar);
                float f8 = this.f1402f;
                if (f8 == -1.0f) {
                    f8 = view.getElevation();
                }
                this.f1401b.p(f8);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(view, colorStateList);
                }
            }
            if (this.f1404h == 5) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            if (view.getVisibility() != i14) {
                view.setVisibility(i14);
            }
            d();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ViewCompat.getAccessibilityPaneTitle(view) == null) {
                ViewCompat.setAccessibilityPaneTitle(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity, i10) == 3) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        u uVar = this.f1400a;
        if (uVar == null || uVar.p() != i11) {
            CoordinatorLayout.LayoutParams layoutParams = null;
            o oVar = this.d;
            if (i11 == 0) {
                this.f1400a = new a4.a(this, 1);
                if (oVar != null) {
                    WeakReference weakReference = this.f1412p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        n g10 = oVar.g();
                        g10.f6786f = new z3.a(0.0f);
                        g10.f6787g = new z3.a(0.0f);
                        o a10 = g10.a();
                        k kVar2 = this.f1401b;
                        if (kVar2 != null) {
                            kVar2.setShapeAppearanceModel(a10);
                        }
                    }
                }
            } else if (i11 == 1) {
                this.f1400a = new a4.a(this, 0);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f1412p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        n g11 = oVar.g();
                        g11.e = new z3.a(0.0f);
                        g11.f6788h = new z3.a(0.0f);
                        o a11 = g11.a();
                        k kVar3 = this.f1401b;
                        if (kVar3 != null) {
                            kVar3.setShapeAppearanceModel(a11);
                        }
                    }
                }
            } else {
                i.k(ai.onnxruntime.a.f(i11, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                return false;
            }
        }
        if (this.f1405i == null) {
            this.f1405i = ViewDragHelper.create(coordinatorLayout, this.f1416v);
        }
        int n10 = this.f1400a.n(view);
        coordinatorLayout.onLayoutChild(view, i10);
        this.f1409m = coordinatorLayout.getWidth();
        this.f1410n = this.f1400a.o(coordinatorLayout);
        this.f1408l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i12 = this.f1400a.a(marginLayoutParams);
        } else {
            i12 = 0;
        }
        this.f1411o = i12;
        int i16 = this.f1404h;
        if (i16 != 1 && i16 != 2) {
            if (i16 != 3) {
                if (i16 == 5) {
                    i15 = this.f1400a.k();
                } else {
                    b.b(this.f1404h, "Unexpected value: ");
                    return false;
                }
            }
        } else {
            i15 = n10 - this.f1400a.n(view);
        }
        ViewCompat.offsetLeftAndRight(view, i15);
        if (this.f1413q == null && (i13 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i13)) != null) {
            this.f1413q = new WeakReference(findViewById);
        }
        Iterator it = this.f1415u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                n0.b.a();
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        if (fVar.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, view, fVar.getSuperState());
        }
        int i10 = fVar.f33b;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f1404h = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1404h == 1 && actionMasked == 0) {
            return true;
        }
        if (b()) {
            this.f1405i.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f1414s) != null) {
            velocityTracker.recycle();
            this.f1414s = null;
        }
        if (this.f1414s == null) {
            this.f1414s = VelocityTracker.obtain();
        }
        this.f1414s.addMovement(motionEvent);
        if (b() && actionMasked == 2 && !this.f1406j && b() && Math.abs(this.t - motionEvent.getX()) > this.f1405i.getTouchSlop()) {
            this.f1405i.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f1406j;
    }

    public SideSheetBehavior() {
        this.e = new h(this);
        this.f1403g = true;
        this.f1404h = 5;
        this.f1407k = 0.1f;
        this.r = -1;
        this.f1415u = new LinkedHashSet();
        this.f1416v = new d(this);
    }
}
