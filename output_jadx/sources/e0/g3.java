package e0;

import com.example.navistart.MyCarReceiver;
import com.example.navistart.VibVodActivity;
import com.example.navistart.mainview.HeatingButtonView;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1925b;
    public final /* synthetic */ VibVodActivity c;

    public /* synthetic */ g3(VibVodActivity vibVodActivity, int i10) {
        this.f1925b = i10;
        this.c = vibVodActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1925b;
        VibVodActivity vibVodActivity = this.c;
        switch (i10) {
            case 0:
                Boolean bool = VibVodActivity.f947g;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = MyCarReceiver.c;
                int i11 = h0.b.a().e().e;
                HeatingButtonView heatingButtonView = vibVodActivity.c;
                heatingButtonView.getClass();
                heatingButtonView.e = false;
                heatingButtonView.c(1);
                HeatingButtonView heatingButtonView2 = vibVodActivity.d;
                heatingButtonView2.getClass();
                heatingButtonView2.e = false;
                heatingButtonView2.c(1);
                HeatingButtonView heatingButtonView3 = vibVodActivity.e;
                heatingButtonView3.getClass();
                heatingButtonView3.e = false;
                heatingButtonView3.c(1);
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            HeatingButtonView heatingButtonView4 = vibVodActivity.e;
                            heatingButtonView4.getClass();
                            heatingButtonView4.e = true;
                            heatingButtonView4.c(3);
                            return;
                        }
                        return;
                    }
                    HeatingButtonView heatingButtonView5 = vibVodActivity.d;
                    heatingButtonView5.getClass();
                    heatingButtonView5.e = true;
                    heatingButtonView5.c(3);
                    return;
                }
                HeatingButtonView heatingButtonView6 = vibVodActivity.c;
                heatingButtonView6.getClass();
                heatingButtonView6.e = true;
                heatingButtonView6.c(3);
                return;
            case 1:
                vibVodActivity.finish();
                return;
            case 2:
                Boolean bool2 = VibVodActivity.f947g;
                vibVodActivity.u(2, Boolean.FALSE);
                return;
            case 3:
                Boolean bool3 = VibVodActivity.f947g;
                vibVodActivity.u(1, Boolean.FALSE);
                return;
            default:
                Boolean bool4 = VibVodActivity.f947g;
                vibVodActivity.u(3, Boolean.FALSE);
                return;
        }
    }
}
