package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f117b;

    /* JADX WARN: Type inference failed for: r4v2, types: [android.support.v4.media.session.a, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        c cVar;
        e eVar = (e) this.f117b.get();
        if (eVar != null && bundle != null) {
            synchronized (eVar.f133b) {
                try {
                    MediaSessionCompat$Token mediaSessionCompat$Token = eVar.e;
                    IBinder binder = BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER");
                    int i11 = b.c;
                    if (binder == null) {
                        cVar = null;
                    } else {
                        IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.c");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                            cVar = (c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.c = binder;
                            cVar = obj;
                        }
                    }
                    synchronized (mediaSessionCompat$Token.f120b) {
                        mediaSessionCompat$Token.d = cVar;
                    }
                    MediaSessionCompat$Token mediaSessionCompat$Token2 = eVar.e;
                    VersionedParcelable versionedParcelable = ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
                    synchronized (mediaSessionCompat$Token2.f120b) {
                        mediaSessionCompat$Token2.e = versionedParcelable;
                    }
                    ArrayList arrayList = eVar.c;
                    if (eVar.e.r() != null) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                        } else if (it.next() != null) {
                            n0.b.a();
                        } else {
                            eVar.d.put(null, new d());
                            throw null;
                        }
                    }
                } finally {
                }
            }
        }
    }
}
