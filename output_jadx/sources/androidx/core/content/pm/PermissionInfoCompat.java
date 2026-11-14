package androidx.core.content.pm;

import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class PermissionInfoCompat {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static int getProtection(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @DoNotInline
        public static int getProtectionFlags(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface Protection {
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
    }

    public static int getProtection(@NonNull PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getProtection(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    public static int getProtectionFlags(@NonNull PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getProtectionFlags(permissionInfo);
        }
        return permissionInfo.protectionLevel & (-16);
    }
}
