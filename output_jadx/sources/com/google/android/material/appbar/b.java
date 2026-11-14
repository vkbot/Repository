package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1194b;
    public final /* synthetic */ AppBarLayout.BaseBehavior c;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.f1193a = appBarLayout;
        this.f1194b = coordinatorLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f1193a;
        if (appBarLayout.getTotalScrollRange() != 0) {
            CoordinatorLayout coordinatorLayout = this.f1194b;
            AppBarLayout.BaseBehavior baseBehavior = this.c;
            View f8 = AppBarLayout.BaseBehavior.f(baseBehavior, coordinatorLayout);
            if (f8 != null) {
                int childCount = appBarLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (((c3.c) appBarLayout.getChildAt(i10).getLayoutParams()).f512a != 0) {
                        if (baseBehavior.c() != (-appBarLayout.getTotalScrollRange())) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                        }
                        if (baseBehavior.c() != 0) {
                            if (f8.canScrollVertically(-1)) {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                    accessibilityNodeInfoCompat.setScrollable(true);
                                    return;
                                }
                                return;
                            }
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        AppBarLayout appBarLayout = this.f1193a;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 == 8192) {
            AppBarLayout.BaseBehavior baseBehavior = this.c;
            if (baseBehavior.c() != 0) {
                View f8 = AppBarLayout.BaseBehavior.f(baseBehavior, this.f1194b);
                if (f8.canScrollVertically(-1)) {
                    int i11 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        baseBehavior.i(this.f1194b, this.f1193a, f8, i11, new int[]{0, 0});
                        return true;
                    }
                } else {
                    appBarLayout.setExpanded(true);
                    return true;
                }
            }
            return false;
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
