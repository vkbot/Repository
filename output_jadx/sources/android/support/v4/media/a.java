package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f105a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f106b;

    public a(e eVar) {
        this.f105a = new WeakReference(eVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f106b;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference weakReference2 = this.f105a;
            if (weakReference2.get() != null) {
                Bundle data = message.getData();
                android.support.v4.media.session.h.a(data);
                e eVar = (e) weakReference2.get();
                Messenger messenger = (Messenger) this.f106b.get();
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                                return;
                            }
                            android.support.v4.media.session.h.a(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS));
                            android.support.v4.media.session.h.a(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS));
                            String string = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                            data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST);
                            if (eVar.f111g == messenger) {
                                if (eVar.e.get(string) == null) {
                                    if (i.f115b) {
                                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                                        return;
                                    }
                                    return;
                                }
                                throw new ClassCastException();
                            }
                            return;
                        }
                        eVar.getClass();
                        return;
                    }
                    android.support.v4.media.session.h.a(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS));
                    data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                    eVar.getClass();
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        eVar.getClass();
                    }
                }
            }
        }
    }
}
