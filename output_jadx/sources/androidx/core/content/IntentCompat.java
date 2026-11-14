package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class IntentCompat {
    public static final String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final String EXTRA_TIME = "android.intent.extra.TIME";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        public static <T> T[] getParcelableArrayExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        @DoNotInline
        public static <T> ArrayList<T> getParcelableArrayListExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        @DoNotInline
        public static <T> T getParcelableExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        @DoNotInline
        public static <T extends Serializable> T getSerializableExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    private IntentCompat() {
    }

    @NonNull
    public static Intent createManageUnusedAppRestrictionsIntent(@NonNull Context context, @NonNull String str) {
        if (PackageManagerCompat.areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
            }
            Intent data = new Intent(PackageManagerCompat.ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", str, null));
            if (i10 >= 30) {
                return data;
            }
            return data.setPackage((String) Preconditions.checkNotNull(PackageManagerCompat.getPermissionRevocationVerifierApp(context.getPackageManager())));
        }
        androidx.navigation.b.g("Unused App Restriction features are not available on this device");
        return null;
    }

    @Nullable
    public static Parcelable[] getParcelableArrayExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<? extends Parcelable> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (Parcelable[]) Api33Impl.getParcelableArrayExtra(intent, str, cls);
        }
        return intent.getParcelableArrayExtra(str);
    }

    @Nullable
    public static <T> ArrayList<T> getParcelableArrayListExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api33Impl.getParcelableArrayListExtra(intent, str, cls);
        }
        return intent.getParcelableArrayListExtra(str);
    }

    @Nullable
    public static <T> T getParcelableExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getParcelableExtra(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @Nullable
    public static <T extends Serializable> T getSerializableExtra(@NonNull Intent intent, @Nullable String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getSerializableExtra(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @NonNull
    public static Intent makeMainSelectorActivity(@NonNull String str, @NonNull String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
