package ai.onnxruntime;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ NotificationChannel g(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup h(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* synthetic */ JobWorkItem j(Intent intent) {
        return new JobWorkItem(intent);
    }
}
