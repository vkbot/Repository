package ai.onnxruntime.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class PowerInfoReceiver extends BroadcastReceiver {
    private final HttpClient m_parent;

    public PowerInfoReceiver(HttpClient httpClient) {
        this.m_parent = httpClient;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z9;
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        boolean z10 = false;
        if (intExtra != 2 && intExtra != 5) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = intent.getBooleanExtra("battery_low", false);
        }
        this.m_parent.onPowerChange(z9, z10);
    }
}
