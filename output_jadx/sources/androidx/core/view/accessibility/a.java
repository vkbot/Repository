package androidx.core.view.accessibility;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaSessionManager.RemoteUserInfo d(int i10, int i11, String str) {
        return new MediaSessionManager.RemoteUserInfo(str, i10, i11);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout h(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean s(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
