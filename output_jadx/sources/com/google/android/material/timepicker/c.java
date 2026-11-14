package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1515a;

    public c(ClockFaceView clockFaceView) {
        this.f1515a = clockFaceView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfoCompat.setTraversalAfter((View) this.f1515a.f1491i.get(intValue - 1));
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfoCompat.setClickable(true);
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        ClockFaceView clockFaceView = this.f1515a;
        ClockHandView clockHandView = clockFaceView.e;
        Rect rect = clockFaceView.f1488f;
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(rect);
            float centerX = rect.centerX();
            float centerY = rect.centerY();
            clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.performAccessibilityAction(view, i10, bundle);
    }
}
