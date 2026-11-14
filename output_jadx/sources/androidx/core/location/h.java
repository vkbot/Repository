package androidx.core.location;

import androidx.core.location.LocationManagerCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f181b;
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport c;
    public final /* synthetic */ String d;

    public /* synthetic */ h(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i10) {
        this.f181b = i10;
        this.c = locationListenerTransport;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f181b) {
            case 0:
                this.c.lambda$onProviderEnabled$4(this.d);
                return;
            default:
                this.c.lambda$onProviderDisabled$5(this.d);
                return;
        }
    }
}
