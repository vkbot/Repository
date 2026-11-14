package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, Executor executor, Object obj2, int i10) {
        this.f178b = i10;
        this.d = obj;
        this.c = executor;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f178b) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.d).lambda$onGnssMeasurementsReceived$0(this.c, (GnssMeasurementsEvent) this.e);
                return;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.d).lambda$onGpsStatusChanged$3(this.c, (GnssStatusCompat) this.e);
                return;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.d).lambda$onSatelliteStatusChanged$3(this.c, (GnssStatus) this.e);
                return;
        }
    }
}
