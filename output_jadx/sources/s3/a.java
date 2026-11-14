package s3;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5654b;

    public /* synthetic */ a(int i10, View view) {
        this.f5653a = i10;
        this.f5654b = view;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f5653a) {
            case 0:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f5654b).f1374b);
                return;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        switch (this.f5653a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.f5654b;
                accessibilityNodeInfoCompat.setCheckable(checkableImageButton.c);
                accessibilityNodeInfoCompat.setChecked(checkableImageButton.f1374b);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(((NavigationMenuItemView) this.f5654b).f1379j);
                return;
        }
    }
}
