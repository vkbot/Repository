package e3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import e4.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2106b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj) {
        this.f2106b = i10;
        this.c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f2106b) {
            case 0:
            case 1:
                return;
            default:
                p pVar = (p) this.c;
                AccessibilityManager accessibilityManager = pVar.f2165u;
                if (pVar.f2166v != null && accessibilityManager != null && pVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(pVar.f2166v);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.f2106b) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.c;
                a aVar = hideBottomViewOnScrollBehavior.f1201h;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.f1200g) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f1201h = null;
                    return;
                }
                return;
            case 1:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.c;
                a aVar2 = hideViewOnScrollBehavior.c;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.f1206b) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.c = null;
                    return;
                }
                return;
            default:
                p pVar = (p) this.c;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = pVar.f2166v;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = pVar.f2165u) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
