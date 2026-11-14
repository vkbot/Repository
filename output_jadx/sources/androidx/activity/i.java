package androidx.activity;

import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback e(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher g(ComponentDialog componentDialog) {
        return componentDialog.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
