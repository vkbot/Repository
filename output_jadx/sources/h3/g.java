package h3;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f2577a;

    public g(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f2577a = materialButtonToggleGroup;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        int i11 = MaterialButtonToggleGroup.r;
        if (view instanceof MaterialButton) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                MaterialButtonToggleGroup materialButtonToggleGroup = this.f2577a;
                if (i12 >= materialButtonToggleGroup.getChildCount()) {
                    break;
                }
                if (materialButtonToggleGroup.getChildAt(i12) == view) {
                    i10 = i13;
                    break;
                }
                if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i12).getVisibility() != 8) {
                    i13++;
                }
                i12++;
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i10, 1, false, ((MaterialButton) view).f1255m));
        }
        i10 = -1;
        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i10, 1, false, ((MaterialButton) view).f1255m));
    }
}
