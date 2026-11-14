package android.support.v4.media;

import android.media.browse.MediaBrowser;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d {
    final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new b(this);
    c mConnectionCallbackInternal;

    public abstract void onConnected();

    public abstract void onConnectionFailed();

    public abstract void onConnectionSuspended();

    public void setInternalConnectionCallback(c cVar) {
        this.mConnectionCallbackInternal = cVar;
    }
}
