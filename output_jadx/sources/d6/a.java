package d6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import c7.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public i f1839a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1840b;

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Handler handler = this.f1840b;
        boolean z9 = false;
        float f8 = sensorEvent.values[0];
        if (f8 <= 45.0f) {
            handler.post(new c7.e(this, true, 1));
        } else if (f8 >= 450.0f) {
            handler.post(new c7.e(this, z9, 1));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
