package e0;

import android.location.GnssStatus;
import android.location.LocationListener;
import android.os.SystemClock;
import com.example.navistart.LocServ;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i0 extends GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationListener f1939b;

    public /* synthetic */ i0(LocationListener locationListener, int i10) {
        this.f1938a = i10;
        this.f1939b = locationListener;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        switch (this.f1938a) {
            case 0:
                int satelliteCount = gnssStatus.getSatelliteCount();
                int i10 = 0;
                for (int i11 = 0; i11 < satelliteCount; i11++) {
                    if (gnssStatus.usedInFix(i11)) {
                        i10++;
                    }
                }
                ((LocServ) this.f1939b).e = (i10 / satelliteCount) * 100.0f;
                return;
            default:
                int i12 = 0;
                for (int i13 = 0; i13 < gnssStatus.getSatelliteCount(); i13++) {
                    if (gnssStatus.usedInFix(i13)) {
                        i12++;
                    }
                }
                q0.s.f5259l = i12;
                q0.s.f5260m = SystemClock.elapsedRealtime();
                q0.s sVar = (q0.s) this.f1939b;
                if (sVar.f5262f && i12 >= 4) {
                    if (sVar.f5265i == 0) {
                        sVar.f5265i = SystemClock.elapsedRealtime();
                        return;
                    }
                    return;
                }
                sVar.f5265i = 0L;
                return;
        }
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
        switch (this.f1938a) {
            case 1:
                q0.s.f5259l = 0;
                ((q0.s) this.f1939b).f5265i = 0L;
                return;
            default:
                super.onStopped();
                return;
        }
    }
}
