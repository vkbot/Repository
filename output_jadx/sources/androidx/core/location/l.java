package androidx.core.location;

import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f185b;
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ l(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i10) {
        this.f185b = i10;
        this.c = preRGnssStatusTransport;
        this.d = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f185b) {
            case 0:
                this.c.lambda$onStopped$1(this.d);
                return;
            default:
                this.c.lambda$onStarted$0(this.d);
                return;
        }
    }
}
