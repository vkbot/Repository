package e3;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2113a;

    public f(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2113a = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = this.f2113a;
        boolean z9 = false;
        if (!swipeDismissBehavior.a(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z9 = true;
        }
        int i10 = swipeDismissBehavior.e;
        if ((i10 == 0 && z9) || (i10 == 1 && !z9)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        ViewCompat.offsetLeftAndRight(view, width);
        view.setAlpha(0.0f);
        b4.f fVar = swipeDismissBehavior.f1215b;
        if (fVar != null) {
            fVar.a(view);
        }
        return true;
    }
}
