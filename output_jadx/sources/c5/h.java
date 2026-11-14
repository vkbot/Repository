package c5;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.view.autofill.AutofillId;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ Instant B() {
        return Instant.now();
    }

    public static /* synthetic */ Notification.Builder c(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ AutofillId g(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ Path i(File file) {
        return file.toPath();
    }

    public static /* bridge */ /* synthetic */ byte[] z(Path path) {
        return Files.readAllBytes(path);
    }
}
