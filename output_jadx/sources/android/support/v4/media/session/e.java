package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController f132a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f133b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public e(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.c);
        this.f132a = mediaController;
        if (mediaSessionCompat$Token.r() == null) {
            ?? resultReceiver = new ResultReceiver(null);
            resultReceiver.f117b = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }
}
