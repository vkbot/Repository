package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f179b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, Executor executor, int i10, int i11) {
        this.f179b = i11;
        this.e = obj;
        this.c = executor;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f179b) {
            case 0:
                LocationManagerCompat.GnssMeasurementsTransport.b((LocationManagerCompat.GnssMeasurementsTransport) this.e, this.c, this.d);
                return;
            case 1:
                LocationManagerCompat.GpsStatusTransport.c((LocationManagerCompat.GpsStatusTransport) this.e, this.c, this.d);
                return;
            default:
                LocationManagerCompat.PreRGnssStatusTransport.b((LocationManagerCompat.PreRGnssStatusTransport) this.e, this.c, this.d);
                return;
        }
    }
}
