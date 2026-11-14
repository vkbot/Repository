package e1;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import e0.m;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2094a = m.h(new byte[]{48, 52, -94, 81, -16, -52, -65, -11, 34, 54, -86, 91, -1, -37, -110, -38, 49, 43}, new byte[]{67, 68, -53, 63, -98, -87, -51, -86});

    /* renamed from: b, reason: collision with root package name */
    public static final String f2095b = m.h(new byte[]{-86, 106, 24, 35, -23, -2, 110, -73, -99, 111, 29, 51, -14, -6, 108, -74}, new byte[]{-62, 31, 124, 80, -103, -101, 11, -45});
    public static final String c = m.h(new byte[]{93, 36, 12, -78, 60, -4, -117, 33, 80, 38, 31, -44, 58, -52, -65, 22, 121, 8}, new byte[]{60, 77, 126, -100, 111, -120, -7, 68});
    public static final r5.c d = new r5.c(9);
    public static final b e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static long f2096f = 0;

    public static boolean a(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        if (accessibilityNodeInfo != null && str != null && !str.isEmpty()) {
            CharSequence packageName = accessibilityNodeInfo.getPackageName();
            if (packageName != null && str.equals(packageName.toString())) {
                return true;
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = null;
                try {
                    accessibilityNodeInfo2 = accessibilityNodeInfo.getChild(i10);
                    if (a(accessibilityNodeInfo2, str)) {
                        c(accessibilityNodeInfo2);
                        return true;
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    c(accessibilityNodeInfo2);
                    throw th;
                }
                c(accessibilityNodeInfo2);
            }
        }
        return false;
    }

    public static AccessibilityNodeInfo b(AccessibilityService accessibilityService, AccessibilityEvent accessibilityEvent, String str) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        try {
            List<AccessibilityWindowInfo> windows = accessibilityService.getWindows();
            if (windows != null && !windows.isEmpty()) {
                for (AccessibilityWindowInfo accessibilityWindowInfo : windows) {
                    if (accessibilityWindowInfo != null) {
                        try {
                            accessibilityNodeInfo = accessibilityWindowInfo.getRoot();
                            try {
                                if (a(accessibilityNodeInfo, str)) {
                                    break;
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            accessibilityNodeInfo = null;
                        }
                        c(accessibilityNodeInfo);
                    }
                }
            }
        } catch (Exception unused3) {
        }
        accessibilityNodeInfo = null;
        if (accessibilityNodeInfo != null) {
            return accessibilityNodeInfo;
        }
        AccessibilityNodeInfo source = accessibilityEvent.getSource();
        if (a(source, str)) {
            return source;
        }
        c(source);
        AccessibilityNodeInfo rootInActiveWindow = accessibilityService.getRootInActiveWindow();
        if (a(rootInActiveWindow, str)) {
            return rootInActiveWindow;
        }
        c(rootInActiveWindow);
        return null;
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            try {
                accessibilityNodeInfo.recycle();
            } catch (Exception unused) {
            }
        }
    }
}
