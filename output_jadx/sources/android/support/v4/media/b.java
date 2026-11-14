package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f107a;

    public b(d dVar) {
        this.f107a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.support.v4.media.session.a, java.lang.Object] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.c cVar;
        d dVar = this.f107a;
        c cVar2 = dVar.mConnectionCallbackInternal;
        if (cVar2 != null) {
            e eVar = (e) cVar2;
            a aVar = eVar.d;
            MediaBrowser mediaBrowser = eVar.f109b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    int i10 = 0;
                    Object[] objArr = 0;
                    extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                    IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                    if (binder != null) {
                        Bundle bundle = eVar.c;
                        h hVar = new h(i10, (boolean) (objArr == true ? 1 : 0));
                        hVar.c = new Messenger(binder);
                        hVar.d = bundle;
                        eVar.f110f = hVar;
                        Messenger messenger = new Messenger(aVar);
                        eVar.f111g = messenger;
                        aVar.getClass();
                        aVar.f106b = new WeakReference(messenger);
                        try {
                            h hVar2 = eVar.f110f;
                            Context context = eVar.f108a;
                            Messenger messenger2 = eVar.f111g;
                            hVar2.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                            bundle2.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
                            bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, (Bundle) hVar2.d);
                            Message obtain = Message.obtain();
                            obtain.what = 6;
                            obtain.arg1 = 1;
                            obtain.setData(bundle2);
                            obtain.replyTo = messenger2;
                            ((Messenger) hVar2.c).send(obtain);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER);
                    int i11 = android.support.v4.media.session.b.c;
                    if (binder2 == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.c");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.media.session.c)) {
                            cVar = (android.support.v4.media.session.c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.c = binder2;
                            cVar = obj;
                        }
                    }
                    if (cVar != null) {
                        eVar.f112h = MediaSessionCompat$Token.q(mediaBrowser.getSessionToken(), cVar);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        dVar.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.f107a.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        d dVar = this.f107a;
        c cVar = dVar.mConnectionCallbackInternal;
        if (cVar != null) {
            e eVar = (e) cVar;
            eVar.f110f = null;
            eVar.f111g = null;
            eVar.f112h = null;
            a aVar = eVar.d;
            aVar.getClass();
            aVar.f106b = new WeakReference(null);
        }
        dVar.onConnectionSuspended();
    }
}
