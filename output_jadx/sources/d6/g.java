package d6;

import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final CaptureActivity f1847a;
    public final b7.g e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1849f;
    public boolean c = false;

    /* renamed from: b, reason: collision with root package name */
    public final b1.c f1848b = new b1.c(1, this);
    public final Handler d = new Handler();

    public g(CaptureActivity captureActivity, b7.g gVar) {
        this.f1847a = captureActivity;
        this.e = gVar;
    }

    public final void a() {
        this.d.removeCallbacksAndMessages(null);
        if (this.c) {
            this.f1847a.unregisterReceiver(this.f1848b);
            this.c = false;
        }
    }
}
