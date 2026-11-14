package f5;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioRecord;
import android.os.Build;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.LounchB;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import com.example.navistart.cores.ColorText;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialProber;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.w1;
import n7.j1;
import o7.a3;
import o7.g4;
import o7.h4;
import s1.q0;
import s1.x0;
import w0.b1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2294b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj) {
        this.f2294b = i10;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        List<UsbSerialDriver> findAllDrivers;
        UsbSerialDriver usbSerialDriver;
        int i11;
        BluetoothAdapter defaultAdapter;
        Object[] objArr;
        int cargetvent;
        int i12 = 11;
        boolean z9 = false;
        int i13 = 0;
        z9 = false;
        switch (this.f2294b) {
            case 0:
                k kVar = (k) this.c;
                boolean z10 = kVar.c;
                if ((!z10 || !kVar.d) && z10) {
                    z9 = true;
                }
                kVar.c = z9;
                return;
            case 1:
                g0.e eVar = (g0.e) this.c;
                eVar.setVisibility(0);
                eVar.setAlpha(0.0f);
                eVar.setScaleX(0.8f);
                eVar.setScaleY(0.8f);
                eVar.setPivotX(eVar.getWidth() / 2.0f);
                eVar.setPivotY(eVar.getHeight() / 2.0f);
                ViewPropertyAnimator viewPropertyAnimator = eVar.f2422h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(300L).start();
                    return;
                }
                return;
            case 2:
                h0.b.w(((h0.b) this.c).j().run(), ColorText.RED);
                return;
            case 3:
                MaterialButton.a((MaterialButton) this.c);
                return;
            case 4:
                ((AccessibilityNodeInfo) this.c).performAction(16);
                return;
            case 5:
                b1.m mVar = (b1.m) this.c;
                ((k2.h) ((l2.c) mVar.f305f)).c0(new androidx.fragment.app.h(16, mVar));
                return;
            case 6:
                ((CarouselLayoutManager) this.c).requestLayout();
                return;
            case 7:
                m0.e0 e0Var = (m0.e0) this.c;
                String str = m0.e0.A;
                e0Var.z();
                RecyclerView recyclerView = e0Var.f3659l;
                if (recyclerView != null) {
                    recyclerView.post(new c7.e(e0Var, z9, 7));
                    return;
                }
                return;
            case 8:
                w1 w1Var = (w1) this.c;
                w1Var.f3885b.scrollToPosition(w1Var.f3886f.size() - 1);
                return;
            case 9:
                o7.j jVar = (o7.j) this.c;
                l.d dVar = jVar.d;
                if (dVar != null) {
                    j1 j1Var = (j1) dVar.c;
                    if (!j1Var.d && !j1Var.c) {
                        dVar.j();
                    }
                }
                jVar.c = null;
                return;
            case 10:
                ((a3) this.c).e();
                return;
            case 11:
                h4 h4Var = ((g4) this.c).e;
                h4Var.c.a(new com.bumptech.glide.m(22, h4Var));
                return;
            case 12:
                q0.p pVar = (q0.p) this.c;
                while (pVar.d.get()) {
                    if (!pVar.e) {
                        try {
                            if (q0.p.c().booleanValue()) {
                                pVar.e = true;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    long j10 = pVar.f5229h;
                    if (pVar.f5227f && pVar.f5228g && j10 > 0 && System.currentTimeMillis() - j10 > 4000 && !pVar.f5230i) {
                        pVar.f5230i = true;
                        pVar.f5226b.g();
                        MockGpsService mockGpsService = pVar.f5226b;
                        String string = pVar.f5225a.getString(R.string.mock_gps_connected_stale);
                        String a10 = pVar.a();
                        mockGpsService.getClass();
                        MockGpsService.j(string, a10, true);
                    }
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            case 13:
                q0.r rVar = (q0.r) this.c;
                Context context = rVar.f5246a;
                MockGpsService mockGpsService2 = rVar.f5247b;
                while (rVar.d.get()) {
                    if (!rVar.f5258p) {
                        try {
                            if (q0.r.c().booleanValue()) {
                                rVar.f5258p = true;
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    String g10 = rVar.g();
                    if (g10 == null) {
                        String str2 = rVar.f5251i;
                        String a11 = rVar.a();
                        mockGpsService2.getClass();
                        MockGpsService.j(str2, a11, false);
                        mockGpsService2.h();
                        try {
                            Thread.sleep(1500L);
                        } catch (InterruptedException unused4) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        if (rVar.f5256n > 0) {
                            i10 = rVar.f5256n;
                        } else {
                            i10 = rVar.f5249g;
                        }
                        String f8 = rVar.f(i10, g10);
                        try {
                            try {
                                String string2 = context.getString(R.string.mock_gps_connecting);
                                mockGpsService2.getClass();
                                MockGpsService.j(string2, f8, false);
                                rVar.e(g10, f8);
                            } catch (IOException e) {
                                String string3 = context.getString(R.string.mock_gps_unavailable, e.getMessage());
                                mockGpsService2.getClass();
                                MockGpsService.j(string3, f8, false);
                                Log.d(rVar.f5252j, e0.m.h(new byte[]{-77, 104, -7, 44, -12, 36, -4, 95, -79, 94, -76, 51, -27, 36, -82, 56, -108, 99, -11, 53, -31, 40, -80, 121, -125, 97, -15, 121, -96}, new byte[]{-31, 13, -108, 67, ByteCompanionObject.MIN_VALUE, 65, -36, 24}) + e.getMessage());
                            }
                            try {
                                Thread.sleep(1500L);
                            } catch (InterruptedException unused5) {
                                Thread.currentThread().interrupt();
                            }
                        } finally {
                            rVar.d();
                            mockGpsService2.h();
                        }
                    }
                }
                return;
            case 14:
                q0.t tVar = (q0.t) this.c;
                UsbManager usbManager = tVar.c;
                Context context2 = tVar.f5271a;
                MockGpsService mockGpsService3 = tVar.f5272b;
                while (tVar.e.get()) {
                    if (!tVar.f5278k) {
                        try {
                            if (q0.t.c().booleanValue()) {
                                tVar.f5278k = true;
                            }
                        } catch (Exception unused6) {
                        }
                    }
                    if (usbManager == null) {
                        String string4 = context2.getString(R.string.mock_gps_usb_host_unavailable);
                        String a12 = tVar.a();
                        mockGpsService3.getClass();
                        MockGpsService.j(string4, a12, false);
                        mockGpsService3.h();
                        try {
                            Thread.sleep(1500L);
                        } catch (InterruptedException unused7) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        UsbManager usbManager2 = tVar.c;
                        if (usbManager2 == null || (findAllDrivers = UsbSerialProber.getDefaultProber().findAllDrivers(usbManager2)) == null || findAllDrivers.isEmpty()) {
                            usbSerialDriver = null;
                        } else {
                            usbSerialDriver = findAllDrivers.get(0);
                        }
                        if (usbSerialDriver == null) {
                            String string5 = context2.getString(R.string.mock_gps_usb_not_found);
                            String a13 = tVar.a();
                            mockGpsService3.getClass();
                            MockGpsService.j(string5, a13, false);
                            mockGpsService3.h();
                            try {
                                Thread.sleep(1500L);
                            } catch (InterruptedException unused8) {
                                Thread.currentThread().interrupt();
                            }
                        } else {
                            UsbDevice device = usbSerialDriver.getDevice();
                            String f10 = tVar.f(device);
                            if (!usbManager.hasPermission(device)) {
                                if (Build.VERSION.SDK_INT >= 31) {
                                    i11 = 167772160;
                                } else {
                                    i11 = 134217728;
                                }
                                Intent intent = new Intent(q0.t.f5270o);
                                intent.setPackage(context2.getPackageName());
                                usbManager.requestPermission(device, PendingIntent.getBroadcast(context2, 0, intent, i11));
                                String string6 = context2.getString(R.string.mock_gps_usb_permission_request);
                                mockGpsService3.getClass();
                                MockGpsService.j(string6, f10, false);
                                mockGpsService3.h();
                                try {
                                    Thread.sleep(3000L);
                                } catch (InterruptedException unused9) {
                                    Thread.currentThread().interrupt();
                                }
                            } else {
                                try {
                                    try {
                                        tVar.e(usbSerialDriver, f10);
                                    } catch (IOException e6) {
                                        String string7 = context2.getString(R.string.mock_gps_usb_unavailable, e6.getMessage());
                                        mockGpsService3.getClass();
                                        MockGpsService.j(string7, f10, false);
                                        Log.d(q0.t.f5269n, e0.m.h(new byte[]{-72, -81, -98, 125, -80, -126, 1, -30, -104, -110, -67, 43, -106, -69, 62, -93, -113, -112, -71, 103, -41}, new byte[]{-19, -4, -36, 93, -9, -46, 82, -62}) + e6.getMessage());
                                    }
                                    try {
                                        Thread.sleep(1500L);
                                    } catch (InterruptedException unused10) {
                                        Thread.currentThread().interrupt();
                                    }
                                } finally {
                                    tVar.d();
                                    mockGpsService3.h();
                                }
                            }
                        }
                    }
                }
                return;
            case 15:
                b1.m mVar2 = (b1.m) this.c;
                ((t1.j) mVar2.d).d((LounchB) mVar2.f305f);
                return;
            case 16:
                ((s1.b) this.c).a();
                return;
            case 17:
                final s1.f0 f0Var = (s1.f0) this.c;
                q0 q0Var = f0Var.c;
                int i14 = q0Var.F;
                int i15 = q0Var.G;
                int i16 = q0Var.H;
                int i17 = q0Var.I;
                try {
                    h0.b.a();
                    i14 = q0.w(h0.b.d().cargetheat(1));
                    h0.b.a();
                    i15 = q0.w(h0.b.d().cargetvent(1));
                    h0.b.a();
                    i16 = q0.w(h0.b.d().cargetheat(2));
                    h0.b.a();
                    i17 = q0.w(h0.b.d().cargetvent(2));
                } catch (Throwable unused11) {
                }
                final int i18 = i14;
                final int i19 = i15;
                final int i20 = i16;
                final int i21 = i17;
                q0Var.r.post(new Runnable() { // from class: s1.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0 f0Var2 = f0.this;
                        int i22 = i18;
                        int i23 = i19;
                        int i24 = i20;
                        int i25 = i21;
                        if (f0Var2.c.E) {
                            return;
                        }
                        q0 q0Var2 = f0Var2.c;
                        q0Var2.F = i22;
                        q0Var2.G = i23;
                        q0Var2.H = i24;
                        q0Var2.I = i25;
                        q0Var2.C();
                        f0Var2.c.r.removeCallbacks(f0Var2);
                        f0Var2.c.r.postDelayed(f0Var2, 3000L);
                    }
                });
                return;
            case 18:
                ((t1.a) this.c).c.setVisibility(8);
                return;
            case 19:
                t1.k kVar2 = (t1.k) this.c;
                kVar2.f5784b.d(kVar2.d);
                return;
            case 20:
                w0.g gVar = (w0.g) this.c;
                try {
                    AudioRecord audioRecord = gVar.e;
                    if (audioRecord != null && audioRecord.getRecordingState() == 3) {
                        AudioRecord audioRecord2 = gVar.e;
                        byte[] bArr = gVar.f6096j;
                        int read = audioRecord2.read(bArr, 0, bArr.length, 1);
                        if (read <= 0) {
                            String str3 = gVar.r;
                            if (str3 != null && !str3.trim().isEmpty() && System.currentTimeMillis() >= gVar.f6104s) {
                                String str4 = gVar.r;
                                gVar.r = "";
                                gVar.f6104s = 0L;
                                gVar.i(str4);
                                return;
                            }
                            return;
                        }
                        if (w0.g.f6088u != w0.b.d) {
                            gVar.j(w0.b.c);
                        }
                        gVar.m(gVar.k(read));
                        String str5 = gVar.r;
                        if (str5 != null && !str5.trim().isEmpty() && System.currentTimeMillis() >= gVar.f6104s) {
                            String str6 = gVar.r;
                            gVar.r = "";
                            gVar.f6104s = 0L;
                            gVar.i(str6);
                            return;
                        }
                        return;
                    }
                    gVar.n();
                    return;
                } catch (Exception unused12) {
                    gVar.n();
                    return;
                }
            case 21:
                Toast.makeText(((w0.x) ((n.p) this.c).c).f6282m, R.string.voice_call_failed, 1).show();
                return;
            case 22:
                b1 b1Var = (b1) this.c;
                synchronized (b1Var) {
                    try {
                        if (!b1Var.e) {
                            int i22 = b1Var.f6067f;
                            try {
                                defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                            } catch (Exception unused13) {
                                Log.d(e0.m.h(new byte[]{13, -47, -86, -78, 82, 59, -64, 7, 53, -37, -127, -66, 88, 0}, new byte[]{91, -66, -61, -47, 55, 107, -88, 104}), e0.m.h(new byte[]{117, 56, -36, 121, -53, 58, 73, -117, 76, 62, -38, 99, -57, 123, 86, -33, 93, 34, -48, 45, -41, 53, 68, -35, 93, 63, -39, 108, -64, 55, 64, -112, 28, 55, -62, 108, -53, 47, 76, -59, 91, 118, -42, 98, -52, 53, 64, -56, 72, 63, -38, 99, -126, 62, 83, -50, 82, 34, -107, 98, -48, 123, 70, -54, 80, 58, -107, ByteCompanionObject.MAX_VALUE, -57, 42, 80, -50, 79, 34}, new byte[]{60, 86, -75, 13, -94, 91, 37, -85}));
                                return;
                            }
                            if (defaultAdapter != null) {
                                if (!defaultAdapter.isEnabled()) {
                                    synchronized (b1Var) {
                                        try {
                                            if (!b1Var.e && i22 == b1Var.f6067f) {
                                                b1Var.c.f0("");
                                            }
                                        } finally {
                                        }
                                    }
                                    return;
                                }
                                Method declaredMethod = BluetoothDevice.class.getDeclaredMethod(e0.m.h(new byte[]{-92, -110, -96, 119, -56, -5, -22, -36, -71, -124, -121}, new byte[]{-51, -31, -29, 24, -90, -107, -113, -65}), null);
                                ArrayList arrayList = new ArrayList();
                                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                                    BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                                    if (bluetoothClass != null && bluetoothClass.getMajorDeviceClass() == 512) {
                                        objArr = true;
                                    } else {
                                        objArr = false;
                                    }
                                    if (objArr != false && Boolean.TRUE.equals(declaredMethod.invoke(bluetoothDevice, null))) {
                                        arrayList.add(bluetoothDevice.getAddress());
                                    }
                                }
                                synchronized (b1Var) {
                                    try {
                                        if (!b1Var.e && i22 == b1Var.f6067f && arrayList.size() == 1) {
                                            b1Var.c.e0((String) arrayList.get(0));
                                        }
                                    } finally {
                                    }
                                }
                                return;
                                Log.d(e0.m.h(new byte[]{13, -47, -86, -78, 82, 59, -64, 7, 53, -37, -127, -66, 88, 0}, new byte[]{91, -66, -61, -47, 55, 107, -88, 104}), e0.m.h(new byte[]{117, 56, -36, 121, -53, 58, 73, -117, 76, 62, -38, 99, -57, 123, 86, -33, 93, 34, -48, 45, -41, 53, 68, -35, 93, 63, -39, 108, -64, 55, 64, -112, 28, 55, -62, 108, -53, 47, 76, -59, 91, 118, -42, 98, -52, 53, 64, -56, 72, 63, -38, 99, -126, 62, 83, -50, 82, 34, -107, 98, -48, 123, 70, -54, 80, 58, -107, ByteCompanionObject.MAX_VALUE, -57, 42, 80, -50, 79, 34}, new byte[]{60, 86, -75, 13, -94, 91, 37, -85}));
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 23:
                ((LinearLayout) this.c).performClick();
                return;
            default:
                t1.l lVar = (t1.l) this.c;
                HashMap hashMap = new HashMap();
                x0.c cVar = (x0.c) lVar.c;
                ArrayList arrayList2 = cVar.c.f6485u;
                int size = arrayList2.size();
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    x0.m mVar3 = (x0.m) obj;
                    if (x0.c.i(mVar3)) {
                        try {
                            if (x0.c.h(mVar3)) {
                                h0.b.a();
                                cargetvent = h0.b.d().cargetheat(x0.c.n(mVar3));
                            } else {
                                h0.b.a();
                                cargetvent = h0.b.d().cargetvent(x0.c.n(mVar3));
                            }
                            if (cargetvent >= 1 && cargetvent <= 4) {
                                hashMap.put(mVar3.f6460a, Integer.valueOf(cargetvent - 1));
                            }
                        } catch (Exception e10) {
                            Log.w(e0.m.h(new byte[]{-83, 118, -30, -5, 102, 33, 4, 3, -103, 102, -26, -19}, new byte[]{-2, 3, -110, -98, 20, 118, 109, 103}), e0.m.h(new byte[]{88, -79, -80, -57, -100, -105, 123, -98, 111}, new byte[]{11, -44, -47, -77, -68, -27, 30, -1}), e10);
                        }
                    }
                }
                cVar.f6431b.post(new x0(i12, lVar, hashMap));
                return;
        }
    }
}
