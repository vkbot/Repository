package e0;

import com.example.navistart.cores.HUDMassageObj;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2081b;
    public final /* synthetic */ a0 c;

    public /* synthetic */ y(a0 a0Var, int i10) {
        this.f2081b = i10;
        this.c = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2081b) {
            case 0:
                a0 a0Var = this.c;
                a0Var.f1882b = Boolean.valueOf(h0.b.o().loadBoolean(m.h(new byte[]{4, 99, 6, -48, 82}, new byte[]{84, 17, 105, -125, 5, 81, -115, 95}), false));
                a0Var.d();
                if (a0Var.f1882b.booleanValue() && a0.f1877i.booleanValue() && a0.f1878j.booleanValue()) {
                    a0Var.g();
                }
                synchronized (a0Var) {
                    try {
                        ScheduledFuture scheduledFuture = a0.f1876h;
                        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                            a0.f1876h.cancel(true);
                        }
                        a0.f1876h = a0Var.f1881a.scheduleWithFixedDelay(new y(a0Var, 2), 10L, 100L, TimeUnit.MILLISECONDS);
                    } finally {
                    }
                }
                return;
            case 1:
                a0 a0Var2 = this.c;
                if (a0.f1878j.booleanValue() && a0.f1877i.booleanValue()) {
                    synchronized (a0Var2) {
                        h0.b.a();
                        h0.b.a();
                        h0.b.r().StopHUD();
                        h0.b.o().saveBoolean(m.h(new byte[]{63, 34, 64, 97, -101}, new byte[]{111, 80, 47, 50, -52, 19, -7, -65}), false);
                    }
                    h0.b.o().saveBoolean(m.h(new byte[]{43, -58, 58, 115, 30}, new byte[]{123, -76, 85, 32, 73, 78, 55, -59}), false);
                    return;
                }
                return;
            default:
                a0 a0Var3 = this.c;
                HUDMassageObj hUDMassageObj = (HUDMassageObj) a0Var3.c.poll();
                if (hUDMassageObj != null) {
                    synchronized (a0Var3) {
                        if (hUDMassageObj.equals(a0.f1879k)) {
                            int i10 = a0.f1880l;
                            if (i10 > 0) {
                                a0.f1880l = i10 - 1;
                            } else {
                                return;
                            }
                        } else {
                            if (HUDMassageObj.HudSenderType.ARAD.equals(hUDMassageObj.hudSenderType)) {
                                a0.f1880l = 3;
                            }
                            if (HUDMassageObj.HudSenderType.NAVI.equals(hUDMassageObj.hudSenderType)) {
                                a0.f1880l = 0;
                            }
                            a0.f1879k = hUDMassageObj.copy(hUDMassageObj);
                        }
                        a0Var3.f1882b = Boolean.valueOf(h0.b.o().loadBoolean(m.h(new byte[]{-3, -93, -41, 48, 43}, new byte[]{-83, -47, -72, 99, 124, 100, 11, 82}), false));
                        String obj = n0.a.valueOf(a0Var3.f1884g).c.toString();
                        if (HUDMassageObj.HudSenderType.NAVI.equals(hUDMassageObj.hudSenderType)) {
                            if (a0Var3.f1883f) {
                                a0Var3.c(hUDMassageObj, Boolean.valueOf(a0Var3.e));
                            }
                            h0.b.a();
                            h0.b.a();
                            k1.a p9 = h0.b.p();
                            if (p9 != null) {
                                p9.a(hUDMassageObj);
                            }
                        } else if (HUDMassageObj.HudSenderType.ARAD.equals(hUDMassageObj.hudSenderType) && obj.equals(hUDMassageObj.aradarSenderType.toString())) {
                            a0Var3.b(hUDMassageObj, Boolean.valueOf(a0Var3.d), Boolean.valueOf(a0Var3.e));
                            h0.b.a();
                            h0.b.a();
                            k1.a p10 = h0.b.p();
                            if (p10 != null) {
                                p10.a(hUDMassageObj);
                            }
                        }
                        return;
                    }
                }
                return;
        }
    }
}
