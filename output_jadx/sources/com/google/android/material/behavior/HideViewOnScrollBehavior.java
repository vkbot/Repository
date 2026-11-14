package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.g;
import com.example.navistart.R;
import e3.a;
import e3.b;
import e3.c;
import e3.d;
import j1.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public d f1205a;

    /* renamed from: b, reason: collision with root package name */
    public AccessibilityManager f1206b;
    public a c;
    public final boolean d;
    public final LinkedHashSet e;

    /* renamed from: f, reason: collision with root package name */
    public int f1207f;

    /* renamed from: g, reason: collision with root package name */
    public int f1208g;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f1209h;

    /* renamed from: i, reason: collision with root package name */
    public TimeInterpolator f1210i;

    /* renamed from: j, reason: collision with root package name */
    public int f1211j;

    /* renamed from: k, reason: collision with root package name */
    public int f1212k;

    /* renamed from: l, reason: collision with root package name */
    public ViewPropertyAnimator f1213l;

    public HideViewOnScrollBehavior() {
        this.d = true;
        this.e = new LinkedHashSet();
        this.f1211j = 0;
        this.f1212k = 2;
    }

    public final void a(int i10) {
        int i11;
        d dVar = this.f1205a;
        if (dVar != null) {
            switch (dVar.f2110a) {
                case 0:
                    i11 = 1;
                    break;
                case 1:
                    i11 = 2;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            if (i11 == i10) {
                return;
            }
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f1205a = new d(1);
                    return;
                } else {
                    i.k(ai.onnxruntime.a.f(i10, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.f1205a = new d(0);
            return;
        }
        this.f1205a = new d(2);
    }

    public final void b(View view) {
        if (this.f1212k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1213l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1212k = 2;
        Iterator it = this.e.iterator();
        if (!it.hasNext()) {
            this.f1205a.getClass();
            this.f1213l = this.f1205a.k(0, view).setInterpolator(this.f1209h).setDuration(this.f1207f).setListener(new c(1, this));
            return;
        }
        throw g.b(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int measuredHeight;
        int i11;
        int i12;
        if (this.f1206b == null) {
            this.f1206b = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1206b;
        if (accessibilityManager != null && this.c == null) {
            a aVar = new a(this, view, 1);
            this.c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new b(1, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = ((CoordinatorLayout.LayoutParams) view.getLayoutParams()).gravity;
        if (i13 != 80 && i13 != 81) {
            int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            a(i12);
        } else {
            a(1);
        }
        switch (this.f1205a.f2110a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i11 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i11 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i11 = marginLayoutParams.rightMargin;
                break;
        }
        this.f1211j = measuredHeight + i11;
        this.f1207f = com.bumptech.glide.d.q(view.getContext(), R.attr.motionDurationLong2, FTPReply.DATA_CONNECTION_OPEN);
        this.f1208g = com.bumptech.glide.d.q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f1209h = com.bumptech.glide.d.r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b3.a.d);
        this.f1210i = com.bumptech.glide.d.r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b3.a.c);
        return super.onLayoutChild(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i11 > 0) {
            if (this.f1212k != 1) {
                if (!this.d || (accessibilityManager = this.f1206b) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f1213l;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f1212k = 1;
                    Iterator it = this.e.iterator();
                    if (!it.hasNext()) {
                        this.f1213l = this.f1205a.k(this.f1211j, view).setInterpolator(this.f1210i).setDuration(this.f1208g).setListener(new c(1, this));
                        return;
                    }
                    throw g.b(it);
                }
                return;
            }
            return;
        }
        if (i11 < 0) {
            b(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = new LinkedHashSet();
        this.f1211j = 0;
        this.f1212k = 2;
    }
}
