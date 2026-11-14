package androidx.media.session;

import ai.onnxruntime.a;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.support.v4.media.h;
import android.support.v4.media.i;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.c;
import androidx.core.content.ContextCompat;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RequiresApi(31)
    /* loaded from: classes.dex */
    public static final class Api31 {
        private Api31() {
        }

        @DoNotInline
        public static ForegroundServiceStartNotAllowedException castToForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return c.d(illegalStateException);
        }

        @DoNotInline
        public static boolean instanceOfForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return c.z(illegalStateException);
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class MediaButtonConnectionCallback extends d {
        private final Context mContext;
        private final Intent mIntent;
        private i mMediaBrowser;
        private final BroadcastReceiver.PendingResult mPendingResult;

        public MediaButtonConnectionCallback(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.mContext = context;
            this.mIntent = intent;
            this.mPendingResult = pendingResult;
        }

        private void finish() {
            Messenger messenger;
            e eVar = this.mMediaBrowser.f116a;
            h hVar = eVar.f110f;
            if (hVar != null && (messenger = eVar.f111g) != null) {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.arg1 = 1;
                    obtain.setData(null);
                    obtain.replyTo = messenger;
                    ((Messenger) hVar.c).send(obtain);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            eVar.f109b.disconnect();
            this.mPendingResult.finish();
        }

        @Override // android.support.v4.media.d
        public void onConnected() {
            android.support.v4.media.session.e eVar;
            Context context = this.mContext;
            e eVar2 = this.mMediaBrowser.f116a;
            if (eVar2.f112h == null) {
                eVar2.f112h = MediaSessionCompat$Token.q(eVar2.f109b.getSessionToken(), null);
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = eVar2.f112h;
            if (mediaSessionCompat$Token != null) {
                Collections.synchronizedSet(new HashSet());
                if (Build.VERSION.SDK_INT >= 29) {
                    eVar = new android.support.v4.media.session.e(context, mediaSessionCompat$Token);
                } else {
                    eVar = new android.support.v4.media.session.e(context, mediaSessionCompat$Token);
                }
                KeyEvent keyEvent = (KeyEvent) this.mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    eVar.f132a.dispatchMediaButtonEvent(keyEvent);
                    finish();
                    return;
                } else {
                    j1.i.k("KeyEvent may not be null");
                    return;
                }
            }
            j1.i.k("sessionToken must not be null");
        }

        @Override // android.support.v4.media.d
        public void onConnectionFailed() {
            finish();
        }

        @Override // android.support.v4.media.d
        public void onConnectionSuspended() {
            finish();
        }

        public void setMediaBrowser(i iVar) {
            this.mMediaBrowser = iVar;
        }
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j10) {
        int i10;
        if (componentName == null) {
            Log.w(TAG, "The component name of media button receiver should be provided.");
            return null;
        }
        int i11 = 0;
        if (j10 == 4) {
            i10 = WebSocketProtocol.PAYLOAD_SHORT;
        } else if (j10 == 2) {
            i10 = 127;
        } else if (j10 == 32) {
            i10 = 87;
        } else if (j10 == 16) {
            i10 = 88;
        } else if (j10 == 1) {
            i10 = 86;
        } else if (j10 == 64) {
            i10 = 90;
        } else if (j10 == 8) {
            i10 = 89;
        } else if (j10 == 512) {
            i10 = 85;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            Log.w(TAG, "Cannot build a media button pending intent with the given action: " + j10);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i10));
        intent.addFlags(268435456);
        if (Build.VERSION.SDK_INT >= 31) {
            i11 = 33554432;
        }
        return PendingIntent.getBroadcast(context, i10, intent, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (queryBroadcastReceivers.size() > 1) {
            Log.w(TAG, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
        return null;
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder x9 = a.x("Expected 1 service that handles ", str, ", found ");
        x9.append(queryIntentServices.size());
        throw new IllegalStateException(x9.toString());
    }

    public static KeyEvent handleIntent(android.support.v4.media.session.h hVar, Intent intent) {
        return null;
    }

    @RequiresApi(31)
    public void onForegroundServiceStartNotAllowedException(@NonNull Intent intent, @NonNull ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        String message;
        StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
        message = foregroundServiceStartNotAllowedException.getMessage();
        sb.append(message);
        Log.e(TAG, sb.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
            if (serviceComponentByAction != null) {
                intent.setComponent(serviceComponentByAction);
                try {
                    ContextCompat.startForegroundService(context, intent);
                    return;
                } catch (IllegalStateException e) {
                    if (Build.VERSION.SDK_INT >= 31 && Api31.instanceOfForegroundServiceStartNotAllowedException(e)) {
                        onForegroundServiceStartNotAllowedException(intent, Api31.castToForegroundServiceStartNotAllowedException(e));
                        return;
                    }
                    throw e;
                }
            }
            ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
            if (serviceComponentByAction2 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(applicationContext, intent, goAsync);
                i iVar = new i(applicationContext, serviceComponentByAction2, mediaButtonConnectionCallback);
                mediaButtonConnectionCallback.setMediaBrowser(iVar);
                Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                iVar.f116a.f109b.connect();
                return;
            }
            j1.i.l("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            return;
        }
        Log.d(TAG, "Ignore unsupported intent: " + intent);
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j10) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent == null) {
            Log.w(TAG, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j10);
    }
}
