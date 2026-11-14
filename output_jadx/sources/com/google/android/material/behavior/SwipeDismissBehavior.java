package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import b4.f;
import e3.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public ViewDragHelper f1214a;

    /* renamed from: b, reason: collision with root package name */
    public f f1215b;
    public boolean c;
    public boolean d;
    public int e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final float f1216f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public float f1217g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f1218h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public final e f1219i = new e(this);

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9 = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.c = false;
            }
        } else {
            z9 = coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z9;
        }
        if (z9) {
            if (this.f1214a == null) {
                this.f1214a = ViewDragHelper.create(coordinatorLayout, this.f1219i);
            }
            if (!this.d && this.f1214a.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            if (a(view)) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new e3.f(this));
            }
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f1214a != null) {
            if (!this.d || motionEvent.getActionMasked() != 3) {
                this.f1214a.processTouchEvent(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
