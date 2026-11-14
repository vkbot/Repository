package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends b.d {
    @Override // b.d
    public final void q(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.h.b(bundle);
        }
        if (i10 == 0) {
            if (bundle != null) {
                if (bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                    Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
