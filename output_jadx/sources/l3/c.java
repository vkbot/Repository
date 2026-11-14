package l3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.example.navistart.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends ExploreByTouchHelper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f3494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f3494a = chip;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final int getVirtualViewAt(float f8, float f10) {
        RectF closeIconTouchBounds;
        Rect rect = Chip.t;
        Chip chip = this.f3494a;
        if (chip.d()) {
            closeIconTouchBounds = chip.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(f8, f10)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void getVisibleVirtualViews(List list) {
        e eVar;
        list.add(0);
        Rect rect = Chip.t;
        Chip chip = this.f3494a;
        if (chip.d() && (eVar = chip.f1279b) != null && eVar.V && chip.e != null) {
            list.add(1);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
        boolean z9 = false;
        if (i11 == 16) {
            Chip chip = this.f3494a;
            if (i10 == 0) {
                return chip.performClick();
            }
            if (i10 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.e;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z9 = true;
                }
                if (chip.f1290p) {
                    chip.f1289o.sendEventForVirtualView(1, 1);
                }
            }
        }
        return z9;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z9;
        Chip chip = this.f3494a;
        e eVar = chip.f1279b;
        if (eVar != null && eVar.f3496b0) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfoCompat.setCheckable(z9);
        accessibilityNodeInfoCompat.setClickable(chip.isClickable());
        accessibilityNodeInfoCompat.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfoCompat.setText(chip.getText());
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Rect closeIconTouchBoundsInt;
        CharSequence charSequence = "";
        if (i10 == 1) {
            Chip chip = this.f3494a;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfoCompat.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfoCompat.setBoundsInParent(closeIconTouchBoundsInt);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(chip.isEnabled());
            accessibilityNodeInfoCompat.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription("");
        accessibilityNodeInfoCompat.setBoundsInParent(Chip.t);
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public final void onVirtualViewKeyboardFocusChanged(int i10, boolean z9) {
        int[] iArr;
        Chip chip = this.f3494a;
        if (i10 == 1) {
            chip.f1284j = z9;
        }
        e eVar = chip.f1279b;
        boolean z10 = chip.f1284j;
        boolean z11 = false;
        if (eVar.W != null) {
            if (z10) {
                iArr = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
            } else {
                iArr = e.Q0;
            }
            z11 = eVar.W(iArr);
        }
        if (z11) {
            chip.refreshDrawableState();
        }
    }
}
