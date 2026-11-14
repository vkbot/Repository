package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import j1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DialogCompat {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static <T> T requireViewById(Dialog dialog, int i10) {
            return (T) dialog.requireViewById(i10);
        }
    }

    private DialogCompat() {
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) Api28Impl.requireViewById(dialog, i10);
        }
        View findViewById = dialog.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        i.k("ID does not reference a View inside this Dialog");
        return null;
    }
}
