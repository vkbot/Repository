package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.DeprecatedSinceApi;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class NotificationSideChannelStub extends android.support.v4.app.b {
        public NotificationSideChannelStub() {
            attachInterface(this, android.support.v4.app.c.f95a);
        }

        @Override // android.support.v4.app.c
        public void cancel(String str, int i10, String str2) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i10, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.c
        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.c
        public void notify(String str, int i10, String str2, Notification notification) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i10, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void cancel(String str, int i10, String str2);

    public abstract void cancelAll(String str);

    public void checkPermission(int i10, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i10)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i10 + " is not authorized for package " + str);
    }

    public abstract void notify(String str, int i10, String str2, Notification notification);

    @Override // android.app.Service
    @DeprecatedSinceApi(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL);
        return null;
    }
}
