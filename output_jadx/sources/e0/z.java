package e0;

import com.example.navistart.NLService;
import com.example.navistart.cores.HUDMassageObj;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2088b;
    public final /* synthetic */ HUDMassageObj c;

    public /* synthetic */ z(HUDMassageObj hUDMassageObj, int i10) {
        this.f2088b = i10;
        this.c = hUDMassageObj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2088b) {
            case 0:
                HUDMassageObj hUDMassageObj = this.c;
                if (a0.f1878j.booleanValue() && a0.f1877i.booleanValue()) {
                    h0.b.a();
                    h0.b.r().SendInfoHUD(hUDMassageObj);
                    return;
                }
                return;
            default:
                HUDMassageObj hUDMassageObj2 = this.c;
                ScheduledExecutorService scheduledExecutorService = NLService.e;
                try {
                    h0.b.a();
                    h0.b.i().e(hUDMassageObj2);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
