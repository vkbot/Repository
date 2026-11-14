package androidx.core.app;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.location.LocationRequest;
import android.os.OutcomeReceiver;
import android.view.ContentInfo;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException d(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* bridge */ /* synthetic */ LocationRequest f(Object obj) {
        return (LocationRequest) obj;
    }

    public static /* bridge */ /* synthetic */ OutcomeReceiver i(Object obj) {
        return (OutcomeReceiver) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* synthetic */ ContentInfo.Builder k(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean z(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
