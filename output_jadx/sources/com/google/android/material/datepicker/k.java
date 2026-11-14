package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1311a;

    public k(n nVar) {
        this.f1311a = nVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String string;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        n nVar = this.f1311a;
        if (nVar.f1322m.getVisibility() == 0) {
            string = nVar.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            string = nVar.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, string));
    }
}
