package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserProtocol;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f108a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaBrowser f109b;
    public final Bundle c;
    public final a d = new a(this);
    public final ArrayMap e = new ArrayMap();

    /* renamed from: f, reason: collision with root package name */
    public h f110f;

    /* renamed from: g, reason: collision with root package name */
    public Messenger f111g;

    /* renamed from: h, reason: collision with root package name */
    public MediaSessionCompat$Token f112h;

    public e(Context context, ComponentName componentName, d dVar) {
        this.f108a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        bundle.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
        dVar.setInternalConnectionCallback(this);
        this.f109b = new MediaBrowser(context, componentName, dVar.mConnectionCallbackFwk, bundle);
    }
}
