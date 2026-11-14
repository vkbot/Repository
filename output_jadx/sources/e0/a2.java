package e0;

import com.example.navistart.MyCarReceiver;
import com.example.navistart.VJCT;
import com.example.navistart.cores.CarCmdProxy;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1886b;
    public final /* synthetic */ String c;

    public /* synthetic */ a2(String str, int i10) {
        this.f1886b = i10;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1886b;
        String str = this.c;
        switch (i10) {
            case 0:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = MyCarReceiver.c;
                h0.b.a();
                CarCmdProxy d = h0.b.d();
                u0.a o5 = h0.b.o();
                StringBuilder u8 = ai.onnxruntime.a.u(str);
                u8.append(m.h(new byte[]{-68, 26, -91, -52, 9}, new byte[]{-29, 87, -22, -97, 65, 118, -111, 50}));
                u8.append(MyCarReceiver.f848o);
                d.carsetheat(o5.loadInt(u8.toString(), 2) + 1, 2);
                return;
            case 1:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = MyCarReceiver.c;
                h0.b.a();
                CarCmdProxy d10 = h0.b.d();
                u0.a o9 = h0.b.o();
                StringBuilder u9 = ai.onnxruntime.a.u(str);
                u9.append(m.h(new byte[]{-100, 29, 112, 25, -23}, new byte[]{-61, 80, 63, 74, -95, 33, 80, -13}));
                u9.append(MyCarReceiver.f848o);
                d10.carsetvent(o9.loadInt(u9.toString(), 2) + 1, 1);
                return;
            case 2:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = MyCarReceiver.c;
                h0.b.a();
                CarCmdProxy d11 = h0.b.d();
                u0.a o10 = h0.b.o();
                StringBuilder u10 = ai.onnxruntime.a.u(str);
                u10.append(m.h(new byte[]{-26, -124, -100, 63, -17}, new byte[]{-71, -55, -45, 108, -89, -121, 118, 86}));
                u10.append(MyCarReceiver.f848o);
                d11.carsetvent(o10.loadInt(u10.toString(), 2) + 1, 2);
                return;
            case 3:
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor4 = MyCarReceiver.c;
                h0.b.a();
                CarCmdProxy d12 = h0.b.d();
                u0.a o11 = h0.b.o();
                StringBuilder u11 = ai.onnxruntime.a.u(str);
                u11.append(m.h(new byte[]{-120, -63, 91, -85, ByteCompanionObject.MIN_VALUE}, new byte[]{-41, -116, 20, -8, -56, -24, -3, -55}));
                u11.append(MyCarReceiver.f848o);
                d12.carsetheat(o11.loadInt(u11.toString(), 2) + 1, 1);
                return;
            case 4:
                VJCT.f943i.setText(str);
                return;
            default:
                VJCT.f942h.setText(str);
                return;
        }
    }
}
