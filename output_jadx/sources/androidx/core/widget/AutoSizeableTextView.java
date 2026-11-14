package androidx.core.widget;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface AutoSizeableTextView {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 27) {
            z9 = true;
        } else {
            z9 = false;
        }
        PLATFORM_SUPPORTS_AUTOSIZE = z9;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13);

    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10);

    void setAutoSizeTextTypeWithDefaults(int i10);
}
