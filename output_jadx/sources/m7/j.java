package m7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;
import e0.m;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3959a;

    /* renamed from: b, reason: collision with root package name */
    public final WifiManager f3960b;
    public final r5.c c;
    public final boolean d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3961f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3962g;

    /* renamed from: h, reason: collision with root package name */
    public int f3963h;

    /* renamed from: i, reason: collision with root package name */
    public int f3964i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3965j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3966k;

    /* renamed from: l, reason: collision with root package name */
    public final b1.c f3967l = new b1.c(5, this);

    /* renamed from: m, reason: collision with root package name */
    public final i f3968m = new i(this, 0);

    public j(Context context, WifiManager wifiManager, boolean z9, int i10, long j10, long j11) {
        this.f3959a = context;
        this.f3960b = wifiManager;
        r5.c cVar = new r5.c(22, false);
        cVar.c = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
        this.c = cVar;
        this.d = z9;
        this.f3963h = i10;
        this.e = j10;
        this.f3961f = j11;
        this.f3962g = 5000L;
        this.f3964i = wifiManager.getWifiState();
    }

    public final void a() {
        if (this.d && k.a(this.f3960b)) {
            this.f3966k = true;
            Log.d(m.h(new byte[]{-108, 56, -90, 113, 39, 7, 31, 52, -81, 52, -120, 125, 31, 24, 29, 33}, new byte[]{-61, 81, -64, 24, 115, 104, 120, 83}), m.h(new byte[]{8, 80, -17, 113, -111, -47, -67, -103, 41, 76, -69, 99, -126, -54, -96, -49, 37, 19, -69, 102, -120, -51, -88, -37, 44, 86, -11, 101, -63, -1, -103, -103, 34, 90, -3, 109, -109, -37, -23, -36, 46, 94, -7, 110, -120, -48, -82, -103, 23, 86, -74, 68, -120, -98, -86, -43, 41, 90, -11, 118, -63, -45, -90, -35, 37}, new byte[]{64, 63, -101, 2, -31, -66, -55, -71}));
            ConnectivityManager connectivityManager = (ConnectivityManager) this.c.c;
            try {
                Method method = connectivityManager.getClass().getMethod(m.h(new byte[]{81, -56, -117, -120, 37, -74, -13, 85, 71, -50, -115, -106, 22}, new byte[]{34, -68, -28, -8, 113, -45, -121, Base64.padSymbol}), Integer.TYPE);
                if (method != null) {
                    method.invoke(connectivityManager, 0);
                }
            } catch (Exception unused) {
            }
            e(this.f3962g);
            return;
        }
        c();
        e(this.e);
    }

    public final void b() {
        Handler handler = k.f3970b;
        handler.removeCallbacks(this.f3968m);
        if (this.d) {
            final WifiManager wifiManager = this.f3960b;
            k.b(wifiManager);
            final int i10 = 0;
            handler.postDelayed(new Runnable() { // from class: m7.h
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            k.b(wifiManager);
                            return;
                        default:
                            k.b(wifiManager);
                            return;
                    }
                }
            }, 2500L);
            final int i11 = 1;
            handler.postDelayed(new Runnable() { // from class: m7.h
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            k.b(wifiManager);
                            return;
                        default:
                            k.b(wifiManager);
                            return;
                    }
                }
            }, 6000L);
        }
        synchronized (k.class) {
            if (k.c == this) {
                k.d();
            }
        }
    }

    public final void c() {
        WifiManager wifiManager = this.f3960b;
        this.f3964i = wifiManager.getWifiState();
        String h2 = m.h(new byte[]{13, -60, 98, 84, -79, 63, -121, -42, 54, -56, 76, 88, -119, 32, -123, -61}, new byte[]{90, -83, 4, Base64.padSymbol, -27, 80, -32, -79});
        StringBuilder sb = new StringBuilder();
        sb.append(m.h(new byte[]{-11, -40, 31, Base64.padSymbol, 41, 38, 35, -72, -16, -44, 67, 14, 37, 117, 50, -10, -58, -33, 2, 45, 40, 104}, new byte[]{-89, -67, 110, 72, 76, 85, 87, -104}));
        boolean z9 = this.d;
        sb.append(z9);
        sb.append(m.h(new byte[]{-60, 124, -73, 98, 68, 19, -41, -95, -100, 15, -96, 118, 66, 4, -113}, new byte[]{-24, 92, -44, 23, 54, 97, -78, -49}));
        sb.append(this.f3964i);
        sb.append(m.h(new byte[]{46, 125, 28, 86, -33, -31, -23, 51, 113, 15, 11, 94, -54, -6, -18, 63, 108, 58, 83}, new byte[]{2, 93, 110, 51, -85, -109, ByteCompanionObject.MIN_VALUE, 86}));
        sb.append(this.f3963h);
        Log.d(h2, sb.toString());
        wifiManager.setWifiEnabled(z9);
    }

    public final void d() {
        i iVar = this.f3968m;
        boolean z9 = this.d;
        long j10 = this.e;
        boolean z10 = this.f3966k;
        WifiManager wifiManager = this.f3960b;
        if (z10) {
            if (!k.a(wifiManager)) {
                this.f3966k = false;
                c();
                e(j10);
                return;
            } else {
                Log.w(m.h(new byte[]{112, -89, -54, -48, -109, -90, 89, -115, 75, -85, -28, -36, -85, -71, 91, -104}, new byte[]{39, -50, -84, -71, -57, -55, 62, -22}), m.h(new byte[]{-25, 68, -86, -78, -103, -25, 12, 41, -53, 66, -70, -31, -121, -25, 12, 41, -53, 66, -83, -96, -117, -28, 29, 41, -58, 69, -2, -75, ByteCompanionObject.MIN_VALUE, -27, 29, 37, -113, 72, -79, -81, -99, -31, 22, 124, -58, 69, -71, -31, -98, -31, 12, 97, -113, 88, -86, -96, -121, -20, 25, 123, -53, 11, -119, -88, -60, -50, 17, 41, -54, 69, -65, -93, -123, -19}, new byte[]{-81, 43, -34, -63, -23, -120, 120, 9}));
                this.f3966k = false;
                c();
                e(j10);
                return;
            }
        }
        int wifiState = wifiManager.getWifiState();
        if (!this.d ? wifiState == 1 : wifiState == 3) {
            b();
            return;
        }
        int i10 = this.f3963h;
        if (i10 <= 0) {
            k.f3970b.removeCallbacks(iVar);
            Log.e(m.h(new byte[]{55, 124, -54, -117, 7, 39, -61, -91, 12, 112, -28, -121, 63, 56, -63, -80}, new byte[]{96, 21, -84, -30, 83, 72, -92, -62}), m.h(new byte[]{4, -102, -87, -28, -120, 29, 39, 76, 52, -108, -24, -57, -63, 91, 50, 74, 63, -106, -32, -116, -63, 73, 50, 81, 52, -106, -16, -25, -113, 92, 49, 79, 54, -105, -71}, new byte[]{83, -13, -124, -94, -31, Base64.padSymbol, 83, 35}) + z9 + m.h(new byte[]{-103, 35, -4, -112, 27, -83, 98, -51, -45, 106, -61, -123, 9, -83, 80, -103}, new byte[]{-75, 3, -112, -15, 104, -39, 53, -92}) + this.f3964i);
            synchronized (k.class) {
                if (k.c == this) {
                    k.d();
                }
            }
            return;
        }
        this.f3963h = i10 - 1;
        Log.w(m.h(new byte[]{118, -84, -65, -24, -93, 77, 105, 125, 77, -96, -111, -28, -101, 82, 107, 104}, new byte[]{33, -59, -39, -127, -9, 34, 14, 26}), m.h(new byte[]{33, 67, -24, -12, 88, 3, 108, 79, 17, 77, -87, -41, 17, 80, 108, 85, 21, 65, -23, -110, 67, 86, 118, 78, 31, 68, -94, -110, 66, 76, 126, 84, 86, 88, -96, -58, 67, 90, 54, 0, 2, 75, -73, -43, 84, 87, 93, 78, 23, 72, -87, -41, 85, 30}, new byte[]{118, 42, -59, -78, 49, 35, 24, 32}) + z9 + m.h(new byte[]{17, 18, -51, -99, -26, -28, 97, -18, 78, 96, -38, -107, -13, -1, 102, -30, 83, 85, -126}, new byte[]{Base64.padSymbol, 50, -65, -8, -110, -106, 8, -117}) + this.f3963h);
        Handler handler = k.f3970b;
        handler.removeCallbacks(iVar);
        if (z9) {
            this.f3966k = false;
            wifiManager.setWifiEnabled(false);
            handler.postDelayed(new i(this, 1), this.f3961f);
        } else {
            c();
        }
        e(j10);
    }

    public final void e(long j10) {
        Handler handler = k.f3970b;
        i iVar = this.f3968m;
        handler.removeCallbacks(iVar);
        handler.postDelayed(iVar, j10);
    }
}
