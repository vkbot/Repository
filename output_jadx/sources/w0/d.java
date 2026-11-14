package w0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import com.example.navistart.Transport.TransportService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ Notification.Builder b(TransportService transportService, String str) {
        return new Notification.Builder(transportService, str);
    }

    public static /* synthetic */ NotificationChannel c(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder d() {
        return new AudioFocusRequest.Builder(2);
    }

    public static /* synthetic */ void g() {
    }
}
