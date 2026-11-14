package e0;

import android.os.SystemClock;
import android.widget.Toast;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1909b;
    public final /* synthetic */ x0.c c;

    public /* synthetic */ f(x0.c cVar, int i10) {
        this.f1909b = i10;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1909b;
        x0.c cVar = this.c;
        switch (i10) {
            case 0:
                if (cVar.c.d) {
                    cVar.e = !cVar.e;
                    cVar.k();
                    cVar.l();
                    return;
                }
                return;
            case 1:
                if (cVar.f6432f) {
                    Toast.makeText(cVar.getContext(), m.h(new byte[]{-5, 30, -121, 93, -22, 107, -19, 52, -97, 83, -25, 56, 113, 106, -48, 53, -86, 82, -37, -56, 26, 2, -66, 83, -5, 63, -121, 93, 26, 7, -66, 92, -6, 1, -122, 100, -22, 107, -19, 53, -85, 83, -23, 56, 120, 106, -37, 52, -106, 82, -37, -56, 27, 59, -66, 92, -5, 55, -121, 93, 26, 7, -65, 104, -6, 12}, new byte[]{43, -125, 87, -24, -54, -70, 110, -28}), 0).show();
                    return;
                }
                return;
            case 2:
                cVar.e = false;
                cVar.k();
                return;
            default:
                cVar.f6433g--;
                cVar.f6434h = SystemClock.uptimeMillis();
                return;
        }
    }
}
