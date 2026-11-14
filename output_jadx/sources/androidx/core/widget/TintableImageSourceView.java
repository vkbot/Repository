package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface TintableImageSourceView {
    @Nullable
    ColorStateList getSupportImageTintList();

    @Nullable
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@Nullable ColorStateList colorStateList);

    void setSupportImageTintMode(@Nullable PorterDuff.Mode mode);
}
