package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.example.navistart.R;
import e3.a;
import e3.b;
import e3.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1197a;

    /* renamed from: b, reason: collision with root package name */
    public int f1198b;
    public int c;
    public TimeInterpolator d;
    public TimeInterpolator e;

    /* renamed from: f, reason: collision with root package name */
    public int f1199f;

    /* renamed from: g, reason: collision with root package name */
    public AccessibilityManager f1200g;

    /* renamed from: h, reason: collision with root package name */
    public a f1201h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1202i;

    /* renamed from: j, reason: collision with root package name */
    public int f1203j;

    /* renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f1204k;

    public HideBottomViewOnScrollBehavior() {
        this.f1197a = new LinkedHashSet();
        this.f1199f = 0;
        this.f1202i = true;
        this.f1203j = 2;
    }

    public final void a(View view) {
        if (this.f1203j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f1204k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f1203j = 2;
        Iterator it = this.f1197a.iterator();
        if (!it.hasNext()) {
            this.f1204k = view.animate().translationY(0).setInterpolator(this.d).setDuration(this.f1198b).setListener(new c(0, this));
            return;
        }
        throw g.b(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f1199f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f1198b = d.q(view.getContext(), R.attr.motionDurationLong2, FTPReply.DATA_CONNECTION_OPEN);
        this.c = d.q(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.d = d.r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b3.a.d);
        this.e = d.r(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, b3.a.c);
        if (this.f1200g == null) {
            this.f1200g = (AccessibilityManager) ContextCompat.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f1200g;
        if (accessibilityManager != null && this.f1201h == null) {
            a aVar = new a(this, view, 0);
            this.f1201h = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new b(0, this));
        }
        return super.onLayoutChild(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i11 > 0) {
            if (this.f1203j != 1) {
                if (!this.f1202i || (accessibilityManager = this.f1200g) == null || !accessibilityManager.isTouchExplorationEnabled()) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f1204k;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        view.clearAnimation();
                    }
                    this.f1203j = 1;
                    Iterator it = this.f1197a.iterator();
                    if (!it.hasNext()) {
                        this.f1204k = view.animate().translationY(this.f1199f).setInterpolator(this.e).setDuration(this.c).setListener(new c(0, this));
                        return;
                    }
                    throw g.b(it);
                }
                return;
            }
            return;
        }
        if (i11 < 0) {
            a(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1197a = new LinkedHashSet();
        this.f1199f = 0;
        this.f1202i = true;
        this.f1203j = 2;
    }
}
