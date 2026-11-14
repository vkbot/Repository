package androidx.core.view;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* bridge */ /* synthetic */ Insets d(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getHiddenStateInsets();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener f(Object obj) {
        return (WindowInsetsController.OnControllableInsetsChangedListener) obj;
    }

    public static /* bridge */ /* synthetic */ void j(WindowInsetsAnimationController windowInsetsAnimationController, Insets insets, float f8, float f10) {
        windowInsetsAnimationController.setInsetsAndAlpha(insets, f8, f10);
    }

    public static /* bridge */ /* synthetic */ boolean q(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.isCancelled();
    }
}
