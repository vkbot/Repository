package androidx.core.view;

import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Map;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ WindowInsets.Builder e() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo k(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession m(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
