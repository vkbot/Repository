package com.example.navistart;

import a1.a;
import a4.g;
import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import androidx.fragment.app.h;
import e0.h0;
import e0.i0;
import e0.w;
import h0.b;
import i7.m;
import java.util.Calendar;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class LocServ extends Service implements LocationListener {

    /* renamed from: h, reason: collision with root package name */
    public static h f736h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f737i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f738j;

    /* renamed from: k, reason: collision with root package name */
    public static LocationManager f739k;

    /* renamed from: l, reason: collision with root package name */
    public static byte[] f740l;

    /* renamed from: m, reason: collision with root package name */
    public static JSONObject f741m;

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f742n;
    public ScheduledFuture c;
    public m d;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f743b = w.c(-1, e0.m.h(new byte[]{42, -38, 93, -95, 102, 2, 24}, new byte[]{102, -75, 62, -14, 3, 112, 110, 83}));
    public float e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public long f744f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final i0 f745g = new i0(this, 0);

    static {
        Boolean bool = Boolean.FALSE;
        f737i = bool;
        f738j = false;
        f739k = null;
        f740l = null;
        f741m = null;
        f742n = bool;
    }

    public static void a(Location location) {
        try {
            f741m.put(e0.m.h(new byte[]{126, 82, -120, -126, 30, -67, 123, -66}, new byte[]{18, 51, -4, -21, 106, -56, 31, -37}), location.getLatitude());
            f741m.put(e0.m.h(new byte[]{-36, 76, 55, 113, -106, -30, 33, 122, -43}, new byte[]{-80, 35, 89, 22, -1, -106, 84, 30}), location.getLongitude());
            f741m.put(e0.m.h(new byte[]{7, -9, -64, -126, -3, 51, 43, -124}, new byte[]{102, -108, -93, -9, -113, 82, 72, -3}), location.getAccuracy());
            f741m.put(e0.m.h(new byte[]{-13, -107, 22, 5, 21, 101, -8, -121}, new byte[]{-110, -7, 98, 108, 97, 16, -100, -30}), location.getAltitude());
            f741m.put(e0.m.h(new byte[]{-51, -55, -63, 64, 39, 43, 106}, new byte[]{-81, -84, -96, 50, 78, 69, 13, -119}), location.getBearing());
            f741m.put(e0.m.h(new byte[]{-58, 108, 41, -92, -114}, new byte[]{-75, 28, 76, -63, -22, 65, 108, -96}), location.getSpeed());
            JSONObject jSONObject = new JSONObject();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(location.getTime());
            jSONObject.put(e0.m.h(new byte[]{0, 85, 15, -72}, new byte[]{121, 48, 110, -54, 122, -85, ByteCompanionObject.MIN_VALUE, 57}), calendar.get(1));
            jSONObject.put(e0.m.h(new byte[]{-84, -63, 91, -62, 83}, new byte[]{-63, -82, 53, -74, 59, 4, -54, -77}), calendar.get(2));
            jSONObject.put(e0.m.h(new byte[]{-15, 2, -49}, new byte[]{-107, 99, -74, 33, -108, -15, 16, 79}), calendar.get(5));
            jSONObject.put(e0.m.h(new byte[]{-47, 125, -19, 98}, new byte[]{-71, 18, -104, 16, -53, -77, 11, -74}), calendar.get(11));
            jSONObject.put(e0.m.h(new byte[]{-102, 125, 39, 113, -107, 113}, new byte[]{-9, 20, 73, 4, -31, 20, -73, -1}), calendar.get(12));
            jSONObject.put(e0.m.h(new byte[]{72, 39, -13, -99, -81, 85}, new byte[]{59, 66, -112, -14, -63, 49, -50, -94}), calendar.get(13));
            f741m.put(e0.m.h(new byte[]{71, 78, -28, -57}, new byte[]{51, 39, -119, -94, 113, -47, -73, 34}), jSONObject);
            f741m.put(e0.m.h(new byte[]{Base64.padSymbol, -84, -72, -59, 30}, new byte[]{91, -59, -64, -96, 122, 51, -63, 97}), true);
            Bundle extras = location.getExtras();
            if (extras != null) {
                String string = extras.getString(e0.m.h(new byte[]{1, -123, -88, -72, 36, -107, -50, -84, 4, -70, -103, -89, 22}, new byte[]{64, -24, -55, -56, 101, -32, -70, -61}));
                if (string == null) {
                    if (!f738j) {
                        Log.i(e0.m.h(new byte[]{-32, 20, -30, 92, -98, -11, -56, -70, -62, 54}, new byte[]{-89, 68, -79, 17, -1, -101, -87, -35}), e0.m.h(new byte[]{55, 65, -100, -81, -47, -86, 34, -102, 52, 69, -106, -75, -97, -124, 59, -37, 47, 97, -102, -5, -48, -127, 4, -22, 48, 83}, new byte[]{95, 32, -17, -113, -65, -59, 86, -70}));
                        f738j = true;
                        return;
                    }
                    return;
                }
                try {
                    f741m.put(e0.m.h(new byte[]{123, -126, -32, 85, -87}, new byte[]{8, -14, -123, 48, -51, 108, 33, 109}), new JSONObject(string).getDouble(e0.m.h(new byte[]{107, ByteCompanionObject.MAX_VALUE, -98, -38, -122}, new byte[]{24, 15, -5, -65, -30, 62, -21, 40})) / 3.6d);
                } catch (JSONException unused) {
                    Log.i(e0.m.h(new byte[]{-74, 75, -118, 95, -110, 109, -84, 52, -108, 105}, new byte[]{-15, 27, -39, 18, -13, 3, -51, 83}), e0.m.h(new byte[]{-39, 111, -102, -82, 59, 85, -100, 18, -64, 121, -43, -90, 122, 76, -111, 5, -41}, new byte[]{-77, 28, -11, -64, 27, 37, -3, 96}));
                }
            }
        } catch (Exception unused2) {
        }
    }

    public final void b() {
        Location location;
        if (!f737i.booleanValue()) {
            if (f740l == null) {
                f740l = new byte[512];
            }
            try {
                if (PermissionChecker.checkCallingOrSelfPermission(this, e0.m.h(new byte[]{-83, 43, 103, -26, -11, -11, -79, -59, -68, 32, 113, -7, -13, -17, -90, -126, -93, 43, 45, -43, -39, -33, -112, -72, -97, 26, 64, -37, -37, -50, -122, -82, -109, 9, 76, -41, -37, -56, -100, -92, -126}, new byte[]{-52, 69, 3, -108, -102, -100, -43, -21})) == 0) {
                    if (f739k == null) {
                        f739k = (LocationManager) getSystemService(e0.m.h(new byte[]{76, 46, 69, 19, -118, -66, -123, -38}, new byte[]{32, 65, 38, 114, -2, -41, -22, -76}));
                    }
                    if (f739k.isProviderEnabled(e0.m.h(new byte[]{0, -80, 115}, new byte[]{103, -64, 0, -62, -23, -90, 67, 108}))) {
                        f741m = new JSONObject();
                        try {
                            location = f739k.getLastKnownLocation(e0.m.h(new byte[]{-4, 79, -75}, new byte[]{-101, 63, -58, -19, 76, -102, ByteCompanionObject.MIN_VALUE, 50}));
                        } catch (Exception unused) {
                            location = null;
                        }
                        if (location != null) {
                            a(location);
                        }
                        try {
                            try {
                                f739k.requestLocationUpdates(e0.m.h(new byte[]{123, -119, 19}, new byte[]{28, -7, 96, 91, -65, -35, 55, 62}), 1000L, 0.0f, this, Looper.getMainLooper());
                                f739k.registerGnssStatusCallback(this.f745g);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            f737i = Boolean.TRUE;
                        } catch (Exception unused4) {
                        }
                    }
                }
            } catch (Exception unused5) {
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.c.cancel(true);
        }
        LocationManager locationManager = f739k;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
            f739k.unregisterGnssStatusCallback(this.f745g);
        }
        m mVar = this.d;
        if (mVar != null) {
            mVar.e.e();
            this.d = null;
            f736h = null;
        }
        f737i = Boolean.FALSE;
        this.f743b.schedule(new h0(this, 0), 10000L, TimeUnit.MILLISECONDS);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f743b;
        b.a();
        d.a().d().f5926g.postValue(location);
        try {
            scheduledThreadPoolExecutor.execute(new g(9, location));
        } catch (Exception unused) {
        }
        if (f742n.booleanValue() && this.d == null) {
            this.d = new m(this);
            f736h = new h(6, this);
        }
        scheduledThreadPoolExecutor.execute(new a(15, this, location));
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        i7.g gVar;
        b();
        f742n = Boolean.valueOf(b.o().loadString(e0.m.h(new byte[]{97, 64, -39, -51, -114, 1, 35, -122, 115, 66, -47, -57, -127, 22, 14, -87, 96, 95}, new byte[]{18, 48, -80, -93, -32, 100, 81, -39}), e0.m.h(new byte[]{107, -107, 111, -30, -86, -41, -68, -95, 100, -86, 75}, new byte[]{37, -6, 27, -67, -8, -94, -46, -2})).equals(n0.a.e.name()));
        if (!f737i.booleanValue()) {
            stopSelf();
        }
        ScheduledFuture scheduledFuture = this.c;
        int i12 = 1;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.c.cancel(true);
        }
        this.c = this.f743b.schedule(new h0(this, i12), 30000L, TimeUnit.MILLISECONDS);
        m mVar = this.d;
        if (mVar != null && (gVar = mVar.e) != null) {
            gVar.e();
            gVar.d();
        }
        return super.onStartCommand(intent, i10, i11);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
