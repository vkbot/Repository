package e0;

import com.example.navistart.MainActivity;
import com.example.navistart.MyCarReceiver;
import com.example.navistart.SpeedBoardService;
import com.example.navistart.TService;
import com.example.navistart.cores.HUDMassageObj;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.hoho.android.usbserial.driver.UsbId;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2053b;

    public /* synthetic */ v0(int i10) {
        this.f2053b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 1;
        switch (this.f2053b) {
            case 0:
                String str = MainActivity.f750e1;
                h0.b.a();
                h0.b.i().d();
                return;
            case 1:
                h0.b.a();
                h0.b.a();
                h0.b.n().setMusicStatus(true);
                return;
            case 2:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().carsetheat(1, 1);
                return;
            case 3:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().carsetheat(1, 2);
                return;
            case 4:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().rulheatonoff(Boolean.TRUE);
                return;
            case 5:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor4 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().rulheatonoff(Boolean.FALSE);
                return;
            case 6:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor5 = MyCarReceiver.c;
                try {
                    h0.b.a();
                    if (h0.b.c() != null) {
                        h0.b.c().OpenProPri();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 7:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor6 = MyCarReceiver.c;
                try {
                    h0.b.a();
                    if (h0.b.c() != null) {
                        h0.b.c().OpenCustomPPPri();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 8:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor7 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().zadheatonoff(Boolean.TRUE);
                return;
            case 9:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor8 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().zadheatonoff(Boolean.FALSE);
                return;
            case 10:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor9 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().lobheatonoff(Boolean.TRUE);
                return;
            case 11:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor10 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().lobheatonoff(Boolean.FALSE);
                return;
            case 12:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor11 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().carsetvent(1, 1);
                return;
            case 13:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor12 = MyCarReceiver.c;
                h0.b.a();
                h0.b.d().carsetvent(1, 2);
                return;
            case 14:
                int i11 = o2.f1993b;
                return;
            case 15:
                v0.h hVar = SpeedBoardService.f888i;
                if (hVar != null) {
                    hVar.c();
                }
                v0.h hVar2 = SpeedBoardService.f889j;
                if (hVar2 != null) {
                    hVar2.c();
                    return;
                }
                return;
            case 16:
                d2.h hVar3 = TService.c;
                ((ScheduledThreadPoolExecutor) hVar3.f1739a).execute(new l7.a(hVar3, i10));
                return;
            case 17:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f1130a;
                return;
            case 18:
                try {
                    h0.b.a();
                    if (h0.b.c() != null) {
                        h0.b.c().OpenCustomPPPri();
                        return;
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 19:
                try {
                    h0.b.a();
                    if (h0.b.c() != null) {
                        h0.b.c().OpenProPri();
                        return;
                    }
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 20:
                try {
                    h0.b.a();
                    if (h0.b.c() != null) {
                        h0.b.c().OpenCustomPPPri();
                        return;
                    }
                    return;
                } catch (Exception unused5) {
                    return;
                }
            case 21:
                try {
                    h0.b.a();
                    if (h0.b.c() != null) {
                        h0.b.c().OpenProPri();
                        return;
                    }
                    return;
                } catch (Exception unused6) {
                    return;
                }
            case 22:
                String str2 = m0.e2.f3676j;
                HUDMassageObj hUDMassageObj = new HUDMassageObj();
                hUDMassageObj.AradarOn = Boolean.TRUE;
                hUDMassageObj.hudSenderType = HUDMassageObj.HudSenderType.ARAD;
                hUDMassageObj.aradarSenderType = HUDMassageObj.AradarSenderType.GENARADAR;
                hUDMassageObj.v_mTurnType = 14;
                hUDMassageObj.v_mTurnDis = 100000;
                hUDMassageObj.v_mRemainDis = FTPReply.FILE_ACTION_PENDING;
                hUDMassageObj.v_mNextRoad = "100".concat(m.h(new byte[]{123, -117, 38, 1, 64, -83, -36}, new byte[]{-85, 49, -10, -67, 111, 124, 91, -38}));
                hUDMassageObj.setspeedlimit(100);
                h0.b.a();
                h0.b.i().e(hUDMassageObj);
                return;
            case 23:
                String str3 = m0.e2.f3676j;
                HUDMassageObj hUDMassageObj2 = new HUDMassageObj();
                hUDMassageObj2.AradarOn = Boolean.FALSE;
                hUDMassageObj2.hudSenderType = HUDMassageObj.HudSenderType.ARAD;
                hUDMassageObj2.aradarSenderType = HUDMassageObj.AradarSenderType.GENARADAR;
                hUDMassageObj2.v_mTurnType = -1;
                hUDMassageObj2.v_mTurnDis = 0;
                hUDMassageObj2.v_mNextRoad = " ";
                h0.b.a();
                h0.b.i().e(hUDMassageObj2);
                return;
            case 24:
                String str4 = m0.e2.f3676j;
                HUDMassageObj hUDMassageObj3 = new HUDMassageObj();
                hUDMassageObj3.NaviOn = Boolean.TRUE;
                hUDMassageObj3.hudSenderType = HUDMassageObj.HudSenderType.NAVI;
                hUDMassageObj3.v_mTurnType = 3;
                hUDMassageObj3.v_mTurnDis = UsbId.SILABS_CP2102;
                hUDMassageObj3.v_mRemainDis = 800;
                hUDMassageObj3.v_mNextRoad = m.h(new byte[]{-116, -104, 100, -89}, new byte[]{-40, -35, 55, -13, -44, -53, 70, 116});
                hUDMassageObj3.setspeedlimit(60);
                h0.b.a();
                h0.b.i().e(hUDMassageObj3);
                return;
            case 25:
                String str5 = m0.e2.f3676j;
                HUDMassageObj hUDMassageObj4 = new HUDMassageObj();
                hUDMassageObj4.NaviOn = Boolean.FALSE;
                hUDMassageObj4.hudSenderType = HUDMassageObj.HudSenderType.NAVI;
                hUDMassageObj4.aradarSenderType = HUDMassageObj.AradarSenderType.GENARADAR;
                hUDMassageObj4.v_mTurnType = -1;
                hUDMassageObj4.v_mTurnDis = 0;
                hUDMassageObj4.v_mNextRoad = " ";
                h0.b.a();
                h0.b.i().e(hUDMassageObj4);
                return;
            default:
                p0.j jVar = p0.j.f4977m;
                if (jVar != null) {
                    jVar.a();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ v0(int i10, Object obj) {
        this.f2053b = i10;
    }
}
