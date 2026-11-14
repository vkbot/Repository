package g3;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f2447b;

    public d(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f2447b = bottomSheetBehavior;
        this.f2446a = i10;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f2447b.k(this.f2446a);
        return true;
    }
}
