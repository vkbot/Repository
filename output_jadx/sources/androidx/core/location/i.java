package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182b;
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i10) {
        this.f182b = i10;
        this.c = locationListenerTransport;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f182b) {
            case 0:
                this.c.lambda$onLocationChanged$1((List) this.d);
                return;
            default:
                this.c.lambda$onLocationChanged$0((Location) this.d);
                return;
        }
    }
}
