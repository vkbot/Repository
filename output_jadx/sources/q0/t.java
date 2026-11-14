package q0;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import android.os.Build;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.R;
import com.hoho.android.usbserial.driver.UsbSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialPort;
import com.hoho.android.usbserial.driver.UsbSerialProber;
import e0.p3;
import e0.x1;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final String f5268m = e0.m.h(new byte[]{Base64.padSymbol, 43, 76}, new byte[]{72, 88, 46, -94, 33, -94, -1, -125});

    /* renamed from: n, reason: collision with root package name */
    public static final String f5269n = e0.m.h(new byte[]{-95, -89, -105, 87, -121, -17, -30, -6, -127, -90, -106, 117}, new byte[]{-12, -44, -11, 16, -9, -100, -79, -107});

    /* renamed from: o, reason: collision with root package name */
    public static final String f5270o = e0.m.h(new byte[]{18, -73, 77, 113, -8, 21, 110, -119, 1, -76, 69, 113, -13, 12, 121, -115, 2, -84, 65, 45, -23, 67, 66, -117, 18, -77, 103, 15, -50, 67, 90, -73, 51, -121, 112, 26, -49, 32, 70, -73, 34, -111, 111, 17}, new byte[]{113, -40, 32, 95, -99, 109, 15, -28});

    /* renamed from: a, reason: collision with root package name */
    public final Context f5271a;

    /* renamed from: b, reason: collision with root package name */
    public final MockGpsService f5272b;
    public final UsbManager c;
    public final ExecutorService d = Executors.newSingleThreadExecutor();
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final n f5273f = new n(e0.m.h(new byte[]{56, 54, -12, -36, 115, 19, -94, 58}, new byte[]{86, 91, -111, -67, 44, 102, -47, 88}));

    /* renamed from: g, reason: collision with root package name */
    public final b1.c f5274g = new b1.c(6, this);

    /* renamed from: h, reason: collision with root package name */
    public volatile int f5275h = 460800;

    /* renamed from: i, reason: collision with root package name */
    public volatile UsbSerialPort f5276i;

    /* renamed from: j, reason: collision with root package name */
    public volatile UsbDeviceConnection f5277j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f5278k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5279l;

    public t(MockGpsService mockGpsService, MockGpsService mockGpsService2) {
        Context applicationContext = mockGpsService.getApplicationContext();
        this.f5271a = applicationContext;
        this.f5272b = mockGpsService2;
        this.c = (UsbManager) applicationContext.getSystemService(e0.m.h(new byte[]{-42, -67, 5}, new byte[]{-93, -50, 103, 60, 20, 98, -15, 73}));
    }

    public static Boolean c() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-71}, new byte[]{-119, 23, 119, -127, 7, -7, 2, -110}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    @Override // q0.h
    public final String a() {
        List<UsbSerialDriver> findAllDrivers;
        UsbManager usbManager = this.c;
        UsbSerialDriver usbSerialDriver = null;
        if (usbManager != null && (findAllDrivers = UsbSerialProber.getDefaultProber().findAllDrivers(usbManager)) != null && !findAllDrivers.isEmpty()) {
            usbSerialDriver = findAllDrivers.get(0);
        }
        if (usbSerialDriver == null) {
            return this.f5271a.getString(R.string.mock_gps_usb_serial_target, Integer.valueOf(this.f5275h));
        }
        return f(usbSerialDriver.getDevice());
    }

    @Override // q0.h
    public final void b(j.i iVar) {
        int i10 = iVar.f3015b;
        if (i10 >= 1200 && i10 <= 921600) {
            this.f5275h = i10;
        }
    }

    public final void d() {
        UsbSerialPort usbSerialPort = this.f5276i;
        this.f5276i = null;
        if (usbSerialPort != null) {
            try {
                usbSerialPort.close();
            } catch (IOException unused) {
            }
        }
        UsbDeviceConnection usbDeviceConnection = this.f5277j;
        this.f5277j = null;
        if (usbDeviceConnection != null) {
            usbDeviceConnection.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
    
        if (r2 == r4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.hoho.android.usbserial.driver.UsbSerialDriver r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.t.e(com.hoho.android.usbserial.driver.UsbSerialDriver, java.lang.String):void");
    }

    public final String f(UsbDevice usbDevice) {
        Context context = this.f5271a;
        if (usbDevice == null) {
            return context.getString(R.string.mock_gps_usb_serial_target, Integer.valueOf(this.f5275h));
        }
        return context.getString(R.string.mock_gps_usb_device_target, Integer.valueOf(usbDevice.getVendorId()), Integer.valueOf(usbDevice.getProductId()), Integer.valueOf(this.f5275h));
    }

    @Override // q0.h
    public final String getTitle() {
        return this.f5271a.getString(R.string.mock_gps_source_usb);
    }

    @Override // q0.h
    public final String getType() {
        return f5268m;
    }

    @Override // q0.h
    public final void start() {
        if (!this.e.compareAndSet(false, true)) {
            return;
        }
        if (!this.f5278k) {
            try {
                if (c().booleanValue()) {
                    this.f5278k = true;
                }
            } catch (Exception unused) {
            }
        }
        b1.c cVar = this.f5274g;
        if (!this.f5279l) {
            IntentFilter intentFilter = new IntentFilter(f5270o);
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f5271a;
            if (i10 >= 33) {
                context.registerReceiver(cVar, intentFilter, 4);
            } else {
                context.registerReceiver(cVar, intentFilter);
            }
            this.f5279l = true;
        }
        this.d.execute(new f5.j(14, this));
    }

    @Override // q0.h
    public final void stop() {
        this.e.set(false);
        d();
        if (this.f5279l) {
            try {
                this.f5271a.unregisterReceiver(this.f5274g);
            } catch (IllegalArgumentException unused) {
            }
            this.f5279l = false;
        }
        this.d.shutdownNow();
    }
}
