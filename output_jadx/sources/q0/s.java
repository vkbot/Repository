package q0;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.example.navistart.MockGPS.MockGpsService;
import e0.i0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s implements LocationListener {

    /* renamed from: l, reason: collision with root package name */
    public static volatile int f5259l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile long f5260m;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f5261b;
    public final f c;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5262f;

    /* renamed from: g, reason: collision with root package name */
    public long f5263g;

    /* renamed from: h, reason: collision with root package name */
    public long f5264h;

    /* renamed from: i, reason: collision with root package name */
    public long f5265i;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.m f5266j = new com.bumptech.glide.m(27, this);

    /* renamed from: k, reason: collision with root package name */
    public final i0 f5267k = new i0(this, 1);

    public s(MockGpsService mockGpsService, f fVar) {
        this.f5261b = (LocationManager) mockGpsService.getSystemService(e0.m.h(new byte[]{-103, 101, -41, -29, 5, -38, -38, -56}, new byte[]{-11, 10, -76, -126, 113, -77, -75, -90}));
        this.c = fVar;
    }

    public final void a() {
        LocationManager locationManager = this.f5261b;
        if (!this.e) {
            return;
        }
        this.e = false;
        this.d.removeCallbacks(this.f5266j);
        try {
            locationManager.removeUpdates(this);
            locationManager.unregisterGnssStatusCallback(this.f5267k);
        } catch (RuntimeException unused) {
        }
        this.f5262f = false;
        this.f5265i = 0L;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (!location.isFromMockProvider()) {
            this.f5264h = SystemClock.elapsedRealtime();
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
