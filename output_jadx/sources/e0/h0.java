package e0;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.example.navistart.LocServ;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1932b;
    public final /* synthetic */ LocServ c;

    public /* synthetic */ h0(LocServ locServ, int i10) {
        this.f1932b = i10;
        this.c = locServ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1932b;
        LocServ locServ = this.c;
        switch (i10) {
            case 0:
                androidx.fragment.app.h hVar = LocServ.f736h;
                Context applicationContext = locServ.getApplicationContext();
                applicationContext.startService(new Intent(applicationContext, (Class<?>) LocServ.class));
                return;
            case 1:
                androidx.fragment.app.h hVar2 = LocServ.f736h;
                if (System.currentTimeMillis() - locServ.f744f > 30000) {
                    LocationManager locationManager = LocServ.f739k;
                    if (locationManager != null) {
                        locationManager.removeUpdates(locServ);
                    }
                    LocServ.f737i = Boolean.FALSE;
                    locServ.f743b.execute(new h0(locServ, 2));
                    return;
                }
                return;
            default:
                locServ.b();
                return;
        }
    }
}
