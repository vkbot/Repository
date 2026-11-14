package com.example.navistart.MockGPS;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.example.navistart.R;
import e0.m;
import h0.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import q0.e;
import q0.f;
import q0.g;
import q0.h;
import q0.q;
import q0.s;
import u0.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MockGpsService extends Service {
    public static volatile Context F;
    public static volatile boolean G;
    public static volatile long H;

    /* renamed from: x, reason: collision with root package name */
    public static volatile String f821x;

    /* renamed from: z, reason: collision with root package name */
    public static volatile boolean f823z;

    /* renamed from: b, reason: collision with root package name */
    public e f824b;
    public h c;
    public s d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f806f = m.h(new byte[]{-11, -22, -53, -14, -65, -16, 57, -42, -57, -10, -57, -20, -110, -12, 44, -6, -20, -4, -40, -4}, new byte[]{-104, -123, -88, -103, -32, -105, 73, -91});

    /* renamed from: g, reason: collision with root package name */
    public static final String f807g = m.h(new byte[]{86, 95, -114, -29, -34, 83, 32, -35, 100, 88, -126, -5, -11}, new byte[]{59, 48, -19, -120, -127, 52, 80, -82});

    /* renamed from: h, reason: collision with root package name */
    public static final String f808h = m.h(new byte[]{-83, 120, 40, -69, 79, -121, 95, 20, -97, 103, 36, -94, 100}, new byte[]{-64, 23, 75, -48, 16, -32, 47, 103});

    /* renamed from: i, reason: collision with root package name */
    public static final String f809i = m.h(new byte[]{66, -118, 107, 119, -119, -16, 8, 97, 112, -124, 125, 104, -71, -56, 30, 115, 67, -119, 106, 125, -75, -4}, new byte[]{47, -27, 8, 28, -42, -105, 120, 18});

    /* renamed from: j, reason: collision with root package name */
    public static final String f810j = m.h(new byte[]{-21, -89, -82, -38, -69, 125, -88, 37, -21}, new byte[]{-101, -49, -63, -76, -34, 34, -55, 85});

    /* renamed from: k, reason: collision with root package name */
    public static final String f811k = m.h(new byte[]{125, -26, -96, 23, -13, 114, 114, 99, ByteCompanionObject.MAX_VALUE, -28, -116, 33, -17, 100}, new byte[]{26, -106, -45, 72, ByteCompanionObject.MIN_VALUE, 23, 0, 21});

    /* renamed from: l, reason: collision with root package name */
    public static final String f812l = m.h(new byte[]{-33, -66, 113}, new byte[]{-86, -51, 19, -62, -84, 34, 85, -39});

    /* renamed from: m, reason: collision with root package name */
    public static final String f813m = m.h(new byte[]{63, -96, Base64.padSymbol, -45, -110}, new byte[]{82, -49, 89, -74, -1, 31, -4, 30});

    /* renamed from: n, reason: collision with root package name */
    public static final String f814n = m.h(new byte[]{89, -125, -64, -48, -94, 22, 12, 39, 113, -98, -43, -46, -122, 3}, new byte[]{20, -20, -93, -69, -27, 102, ByteCompanionObject.MAX_VALUE, 116});

    /* renamed from: o, reason: collision with root package name */
    public static final String f815o = m.h(new byte[]{Base64.padSymbol, -2, -80, 113, 110, -28, -23, -23, 3, -2, -90, 104, 74, -47, -27, -62, 9, -31, -74}, new byte[]{112, -111, -45, 26, 41, -76, -70, -74});

    /* renamed from: p, reason: collision with root package name */
    public static final String f816p = m.h(new byte[]{-14, -88, -61, 34, -89, 39, 64, -19, -41, -88, -45, Base64.padSymbol}, new byte[]{-65, -57, -96, 73, -32, 119, 19, -78});

    /* renamed from: q, reason: collision with root package name */
    public static final String f817q = m.h(new byte[]{83, -45, -81, 89, 62, -98, -111, 98, 110, -45, -66, 70}, new byte[]{30, -68, -52, 50, 121, -50, -62, Base64.padSymbol});
    public static final String r = m.h(new byte[]{ByteCompanionObject.MIN_VALUE, 107, -91, -35, -93, 57, 99, -48, -84, 113, -78, -39, -105, 29, 81, -3, -71}, new byte[]{-51, 4, -58, -74, -28, 105, 48, -113});

    /* renamed from: s, reason: collision with root package name */
    public static final String f818s = m.h(new byte[]{33, 116, -82, 55, -121, -4, -105, 41, 13, 110, -71, 51, -97, -54, -91, 26, 0, 121, -84, 63, -85}, new byte[]{108, 27, -51, 92, -64, -84, -60, 118});
    public static final AtomicBoolean t = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicBoolean f819u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f820v = new AtomicBoolean(false);
    public static volatile String w = m.h(new byte[]{23, -63, -33, 35, -71, -69, -20, 124, 23}, new byte[]{103, -87, -80, 77, -36, -28, -115, 12});

    /* renamed from: y, reason: collision with root package name */
    public static volatile int f822y = 8887;
    public static volatile String A = "";
    public static volatile String B = "";
    public static volatile String C = "";
    public static volatile String D = "";
    public static volatile String E = "";

    public static int a(String str) {
        if (f811k.equals(str)) {
            return 8887;
        }
        if (f812l.equals(str)) {
            return 460800;
        }
        if (!f813m.equals(str)) {
            return 8887;
        }
        return 11010;
    }

    public static void b(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            F = applicationContext;
            if (G) {
                return;
            }
            A = applicationContext.getString(R.string.mock_gps_source_phone_app);
            B = applicationContext.getString(R.string.mock_gps_status_stopped);
            C = applicationContext.getString(R.string.mock_gps_auto_wifi_gateway, 8887);
            D = applicationContext.getString(R.string.mock_gps_no_packets);
            E = applicationContext.getString(R.string.mock_gps_mock_system);
            G = true;
        }
    }

    public static boolean c(int i10, String str) {
        if (f812l.equals(str)) {
            if (i10 < 1200 || i10 > 921600) {
                return false;
            }
            return true;
        }
        if (i10 <= 0 || i10 > 65535) {
            return false;
        }
        return true;
    }

    public static g d(Context context) {
        b(context);
        String str = f815o;
        String str2 = f810j;
        try {
            str2 = b.o().loadString(str, str2);
        } catch (Exception unused) {
        }
        String f8 = f(str2);
        String str3 = "";
        try {
            str3 = b.o().loadString(f816p, "");
        } catch (Exception unused2) {
        }
        String str4 = f817q;
        int a10 = a(f8);
        try {
            a10 = b.o().loadInt(str4, a10);
        } catch (Exception unused3) {
        }
        try {
            b.o().loadBoolean(f818s, false);
        } catch (Exception unused4) {
        }
        return e(a10, f8, str3);
    }

    public static g e(int i10, String str, String str2) {
        String f8 = f(str);
        if (!c(i10, f8)) {
            i10 = a(f8);
        }
        String str3 = null;
        if (str2 != null) {
            String trim = str2.trim();
            if (!trim.isEmpty()) {
                str3 = trim;
            }
        }
        return new g(f8, str3, i10);
    }

    public static String f(String str) {
        String str2 = f811k;
        if (str2.equals(str)) {
            return str2;
        }
        String str3 = f812l;
        if (str3.equals(str)) {
            return str3;
        }
        String str4 = f813m;
        if (str4.equals(str)) {
            return str4;
        }
        String str5 = f810j;
        str5.equals(str);
        return str5;
    }

    public static void j(String str, String str2, boolean z9) {
        if (!t.get()) {
            return;
        }
        f819u.set(z9);
        B = str;
        C = str2;
    }

    public static void k(g gVar) {
        try {
            b.o().saveString(f815o, gVar.f5193b);
            a o5 = b.o();
            String str = f816p;
            String str2 = gVar.c;
            if (str2 == null) {
                str2 = "";
            }
            o5.saveString(str, str2);
            b.o().saveInt(f817q, gVar.d);
            b.o().saveBoolean(f818s, false);
        } catch (Exception unused) {
        }
    }

    public static void l(String str) {
        f820v.set(false);
        H = 0L;
        E = str;
    }

    public static void m(Context context) {
        g d = d(context);
        String str = d.f5193b;
        String str2 = d.c;
        int i10 = d.d;
        try {
            b.o().loadBoolean(f818s, false);
        } catch (Exception unused) {
        }
        n(context, i10, str, str2);
    }

    public static void n(Context context, int i10, String str, String str2) {
        b(context);
        g e = e(i10, str, str2);
        k(e);
        Intent intent = new Intent(context, (Class<?>) MockGpsService.class);
        intent.putExtra(f806f, e.f5193b);
        String str3 = e.c;
        if (str3 != null && !str3.isEmpty()) {
            intent.putExtra(f807g, str3);
        }
        intent.putExtra(f808h, e.d);
        intent.putExtra(f809i, false);
        context.startService(intent);
    }

    public final void g() {
        e eVar = this.f824b;
        if (eVar != null) {
            eVar.d();
        }
        l(getString(R.string.mock_gps_mock_stale));
    }

    public final void h() {
        e eVar = this.f824b;
        if (eVar != null) {
            eVar.d();
        }
        l(getString(R.string.mock_gps_mock_peer_lost));
    }

    public final void i(q qVar) {
        String string;
        Float f8 = qVar.e;
        if (f8 == null) {
            string = getString(R.string.mock_gps_accuracy_na);
        } else {
            string = getString(R.string.mock_gps_accuracy_m, f8);
        }
        Double valueOf = Double.valueOf(qVar.f5236a);
        Double valueOf2 = Double.valueOf(qVar.f5237b);
        String str = qVar.f5245m;
        int i10 = qVar.f5240h;
        Float f10 = qVar.e;
        if (i10 <= 0 && (i10 = qVar.f5242j) <= 0 && (i10 = qVar.f5241i) <= 0) {
            if (f10 != null && f10.floatValue() <= 10.0f) {
                i10 = 10;
            } else if (f10 != null && f10.floatValue() <= 30.0f) {
                i10 = 6;
            } else {
                i10 = 4;
            }
        }
        D = getString(R.string.mock_gps_packet_format, valueOf, valueOf2, string, str, Integer.valueOf(i10));
        if (f823z && !this.e) {
            return;
        }
        e eVar = this.f824b;
        if (eVar != null) {
            synchronized (eVar) {
                if (eVar.b()) {
                    try {
                        Iterator it = eVar.f5190b.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            eVar.f5189a.setTestProviderLocation(str2, e.a(qVar, str2));
                        }
                        f820v.set(true);
                        H = System.currentTimeMillis();
                        E = getString(R.string.mock_gps_mock_active, A);
                        Log.d(f814n, m.h(new byte[]{7, -80, -25, -25, 90, 55, -49, -63, 5, -122, -86, -23, 94, 34, -125, -17, 48, -79}, new byte[]{85, -43, -118, -120, 46, 82, -17, -122}));
                        return;
                    } catch (IllegalArgumentException | SecurityException e) {
                        Log.w(e.c, m.h(new byte[]{-93, 66, -119, 47, -70, 105, 74, 121, -112, 83, -117, 56, -11, 112, 5, 123, -117, 3, -117, 46, -74, 124, 30, 113, -113, 77}, new byte[]{-32, 35, -25, 65, -43, 29, 106, 24}), e);
                        eVar.d();
                    }
                }
            }
        }
        l(getString(R.string.mock_gps_mock_not_applied));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        b(this);
        this.f824b = new e(this);
        this.d = new s(this, new f(0, this));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        t.set(false);
        f819u.set(false);
        l(getString(R.string.mock_gps_mock_system));
        B = getString(R.string.mock_gps_status_stopped);
        h hVar = this.c;
        if (hVar != null) {
            hVar.stop();
            this.c = null;
        }
        s sVar = this.d;
        if (sVar != null) {
            sVar.a();
        }
        e eVar = this.f824b;
        if (eVar != null) {
            eVar.d();
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.MockGPS.MockGpsService.onStartCommand(android.content.Intent, int, int):int");
    }
}
