package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface WrappedDrawable {
    Drawable getWrappedDrawable();

    void setWrappedDrawable(Drawable drawable);
}
