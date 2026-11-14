package e3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2105b;
    public final /* synthetic */ CoordinatorLayout.Behavior c;

    public /* synthetic */ a(CoordinatorLayout.Behavior behavior, View view, int i10) {
        this.f2104a = i10;
        this.c = behavior;
        this.f2105b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z9) {
        switch (this.f2104a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.c;
                if (z9 && hideBottomViewOnScrollBehavior.f1203j == 1) {
                    hideBottomViewOnScrollBehavior.a(this.f2105b);
                    return;
                }
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.c;
                if (hideViewOnScrollBehavior.d && z9 && hideViewOnScrollBehavior.f1212k == 1) {
                    hideViewOnScrollBehavior.b(this.f2105b);
                    return;
                }
                return;
        }
    }
}
