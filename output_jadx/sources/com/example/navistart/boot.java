package com.example.navistart;

import android.app.ActivityOptions;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import b1.c;
import c5.h;
import com.example.navistart.AllWidgetServices;
import com.example.navistart.LocServ;
import com.example.navistart.LounchB;
import com.example.navistart.MainActivity;
import com.example.navistart.MockGPS.MockGpsService;
import com.example.navistart.Notik;
import com.example.navistart.OverlayService;
import com.example.navistart.Si;
import com.example.navistart.SpeedBoardService;
import com.example.navistart.TService;
import com.example.navistart.boot;
import com.example.navistart.punto;
import com.woha.pogoda.WeatherService;
import e0.d0;
import e0.m;
import e0.n3;
import e0.p3;
import e0.v;
import e0.w;
import e0.x1;
import e0.z2;
import h0.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j;
import u0.a;
import w0.d;
import y5.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class boot extends Service {

    /* renamed from: u, reason: collision with root package name */
    public static boolean f953u = false;

    /* renamed from: b, reason: collision with root package name */
    public Notification.Builder f954b;
    public final Boolean c;
    public final v d;
    public ScheduledFuture e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f955f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f956g;

    /* renamed from: h, reason: collision with root package name */
    public IntentFilter f957h;

    /* renamed from: i, reason: collision with root package name */
    public IntentFilter f958i;

    /* renamed from: j, reason: collision with root package name */
    public IntentFilter f959j;

    /* renamed from: k, reason: collision with root package name */
    public IntentFilter f960k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f961l;

    /* renamed from: m, reason: collision with root package name */
    public Context f962m;

    /* renamed from: n, reason: collision with root package name */
    public Intent f963n;

    /* renamed from: o, reason: collision with root package name */
    public c f964o;

    /* renamed from: p, reason: collision with root package name */
    public MyCarReceiver f965p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f966q;
    public n3 r;

    /* renamed from: s, reason: collision with root package name */
    public NotificationManager f967s;
    public boolean t;

    public boot() {
        Boolean bool = Boolean.TRUE;
        this.c = bool;
        this.d = w.b(1000L, m.h(new byte[]{-119, -102, 7, 24}, new byte[]{-21, -11, 104, 108, -66, 99, 105, -91}));
        this.f955f = w.c(-1, null);
        m.h(new byte[]{-54, -124, 54, 2, -49, -20, 107, 3, -62, -124, 62, 17, -23, -1}, new byte[]{-93, -22, 95, 118, -116, -115, 25, 78});
        this.f961l = bool;
        this.f967s = null;
        this.t = false;
    }

    public static boolean b(Context context) {
        byte[] bArr = m.f1974k;
        String[] strArr = p3.f2001a;
        return !new String(bArr).equals(c(context));
    }

    public static String c(Context context) {
        String str = null;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    byte[] bArr = m.f1971h;
                    String[] strArr = p3.f2001a;
                    MessageDigest messageDigest = MessageDigest.getInstance(new String(bArr));
                    messageDigest.update(signature.toByteArray());
                    str = Base64.encodeToString(messageDigest.digest(), 0);
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static String d(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), m.h(new byte[]{95, -10, 37, 79, 83, -66, 27, -26, 87, -4}, new byte[]{62, -104, 65, kotlin.io.encoding.Base64.padSymbol, 60, -41, ByteCompanionObject.MAX_VALUE, -71}));
    }

    public static String e(String str) {
        try {
            byte[] bArr = m.f1972i;
            String[] strArr = p3.f2001a;
            byte[] digest = MessageDigest.getInstance(new String(bArr)).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b10 : digest) {
                sb.append(Integer.toString((b10 & UByte.MAX_VALUE) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m.h(new byte[]{90, 59}, new byte[]{63, 86, 125, 38, -119, -40, 44, 67}), e(b.o().loadString(d(this.f962m), "") + d(this.f962m)));
        jSONObject.put(m.h(new byte[]{-104, 1}, new byte[]{-15, 101, -1, -117, -94, -118, 8, -127}), d(this.f962m));
        jSONObject.put(m.h(new byte[]{-88, -48}, new byte[]{-37, -72, 18, 105, -86, 69, -117, -70}), e(d(this.f962m)));
        String h2 = m.h(new byte[]{119, 25}, new byte[]{7, 112, -75, 5, 97, 29, 112, -109});
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        jSONObject.put(h2, o5.loadString(new String(bArr), ""));
        jSONObject.put(m.h(new byte[]{-114, -30}, new byte[]{-19, -113, -59, 115, 111, -121, -24, -89}), m.h(new byte[]{99, 89}, new byte[]{17, 44, 85, -113, -104, -93, 124, -36}));
        return jSONObject;
    }

    public final void f() {
        boolean w = MainActivity.w();
        Boolean bool = this.c;
        if (w && bool.booleanValue()) {
            throw null;
        }
        if (MainActivity.v(this.f962m) && bool.booleanValue()) {
            this.f963n.toString();
        }
        this.f963n = new Intent(m.h(new byte[]{-15, -44, -112, -79, -34, -115, 36, -45, -7, -44, ByteCompanionObject.MIN_VALUE, -90, -33, -112, 110, -100, -13, -50, -99, -84, -33, -54, 20, -76, -35, -1, -85, -105, -8, -89, 11}, new byte[]{-112, -70, -12, -61, -79, -28, 64, -3}));
        new MyCarReceiver().onReceive(this.f962m, this.f963n);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [android.content.BroadcastReceiver, e0.n3] */
    @Override // android.app.Service
    public final void onCreate() {
        Context context;
        super.onCreate();
        f953u = true;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (this.f967s == null) {
                this.f967s = (NotificationManager) getSystemService(m.h(new byte[]{27, 112, 4, 3, -127, 85, -47, -106, 1, 118, 31, 4}, new byte[]{117, 31, 112, 106, -25, 60, -78, -9}));
            }
            if (!this.t) {
                d.g();
                NotificationChannel d = h.d(m.h(new byte[]{91, -67, -42, -106, -54, -4, -53, 69, 97, -113, -59, -115, -17, -31, -55, 82}, new byte[]{21, -36, -96, -1, -103, -120, -86, 55}), m.h(new byte[]{-126, 86, -3, 63, -11, -73, 121, 124, -82, 83}, new byte[]{-64, 55, -98, 84, -110, -59, 22, 9}));
                d.enableLights(true);
                d.setLightColor(-16776961);
                d.setShowBadge(true);
                this.f967s.createNotificationChannel(d);
                this.t = true;
            }
            this.f954b = h.c(getApplicationContext(), m.h(new byte[]{59, -124, -73, -115, -89, 69, 125, -109, 1, -74, -92, -106, -126, 88, ByteCompanionObject.MAX_VALUE, -124}, new byte[]{117, -27, -63, -28, -12, 49, 28, -31}));
        } else {
            this.f954b = new Notification.Builder(getApplicationContext());
        }
        startForeground(1, this.f954b.build());
        if (!pusk(c(this)) && this.f961l.booleanValue()) {
            context = this.f962m;
        } else {
            context = this;
        }
        this.f962m = context;
        this.f964o = new c();
        IntentFilter intentFilter = new IntentFilter();
        this.f957h = intentFilter;
        b.a();
        intentFilter.addAction(b.l().b());
        c cVar = this.f964o;
        IntentFilter intentFilter2 = this.f957h;
        if (i10 >= 33) {
            registerReceiver(cVar, intentFilter2, 2);
        } else {
            registerReceiver(cVar, intentFilter2);
        }
        this.f965p = new MyCarReceiver();
        IntentFilter intentFilter3 = new IntentFilter();
        this.f958i = intentFilter3;
        intentFilter3.addAction(m.h(new byte[]{-38, -95, 63, -86, 47, -38, 26, -119, -46, -95, 47, -67, 46, -57, 80, -58, -40, -69, 50, -73, 46, -99, 45, -28, -23, -118, 30, -106, 31, -4, 48}, new byte[]{-69, -49, 91, -40, 64, -77, 126, -89}));
        this.f958i.addAction(m.h(new byte[]{-78, -108, 78, 58, -57, -86, -120, -68, -79, -106, 95, 45, -36, -84, -125, -26, -69, -44, 78, 45, -34, -86, -113, -9, -3, -101, 73, 60, -63, -84, -126, -68, -110, -71, 102, 23, -21, -116, -94, -36, -106, -71, 126, 13, -20}, new byte[]{-45, -6, 42, 72, -88, -61, -20, -110}));
        this.f958i.addAction(m.h(new byte[]{2, ByteCompanionObject.MAX_VALUE, 88, -69, 26, 27, -93, 91, 10, ByteCompanionObject.MAX_VALUE, 72, -84, 27, 6, -23, 20, 0, 101, 85, -90, 27, 92, -108, 54, 49, 84, 121, -121, 42, kotlin.io.encoding.Base64.padSymbol, -127, 51}, new byte[]{99, 17, 60, -55, 117, 114, -57, 117}));
        this.f958i.addAction(m.h(new byte[]{-124, -5, -92, 95, -58, -115, -127, 82, -116, -5, -76, 72, -57, -112, -53, 29, -122, -31, -87, 66, -57, -54, -80, 47, -96, -57, -97, 125, -5, -95, -74, 57, -85, -63}, new byte[]{-27, -107, -64, 45, -87, -28, -27, 124}));
        MyCarReceiver myCarReceiver = this.f965p;
        IntentFilter intentFilter4 = this.f958i;
        if (i10 >= 33) {
            registerReceiver(myCarReceiver, intentFilter4, 2);
        } else {
            registerReceiver(myCarReceiver, intentFilter4);
        }
        this.f966q = new d0(this.f962m);
        IntentFilter intentFilter5 = new IntentFilter();
        this.f959j = intentFilter5;
        intentFilter5.addAction(m.h(new byte[]{-57, -70, 65, 53, -22, 116, -27, 46, -49, -70, 81, 34, -21, 105, -81, 97, -59, -96, 76, 40, -21, 51, -30, 97, -44, -117, 86, 62, -10, 105, -28, 109, -7, -77, 64, 52, -15, 104, -13, 101, -7, -71, 74, 35, -32}, new byte[]{-90, -44, 37, 71, -123, 29, -127, 0}));
        d0 d0Var = this.f966q;
        IntentFilter intentFilter6 = this.f959j;
        if (i10 >= 33) {
            registerReceiver(d0Var, intentFilter6, 2);
        } else {
            registerReceiver(d0Var, intentFilter6);
        }
        ?? broadcastReceiver = new BroadcastReceiver();
        broadcastReceiver.f1987a = true;
        this.r = broadcastReceiver;
        IntentFilter intentFilter7 = new IntentFilter();
        this.f960k = intentFilter7;
        intentFilter7.addAction(m.h(new byte[]{123, 5, 95, 90, 50, 76, -32, 25, 71, 89, 28, 92, 41, 64, -15, 10}, new byte[]{34, 43, 50, 59, 92, 41, -107, 111}));
        this.f960k.addAction(m.h(new byte[]{-78, -20, -65, 18, 90, -40, 1, -25, -114, -80, -4, 5, 93, -50}, new byte[]{-21, -62, -46, 115, 52, -67, 116, -111}));
        n3 n3Var = this.r;
        IntentFilter intentFilter8 = this.f960k;
        if (i10 >= 33) {
            registerReceiver(n3Var, intentFilter8, 2);
        } else {
            registerReceiver(n3Var, intentFilter8);
        }
        d0.d(this.f962m);
        byte[] bArr = punto.f1066v;
        String str = z2.f2092a;
        punto.f1065u = new String(bArr);
        d0.d(this.f962m);
        if (b(this.f962m) && this.c.booleanValue()) {
            throw null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f953u = false;
        j.b();
        c cVar = this.f964o;
        if (cVar != null) {
            unregisterReceiver(cVar);
        }
        MyCarReceiver myCarReceiver = this.f965p;
        if (myCarReceiver != null) {
            unregisterReceiver(myCarReceiver);
        }
        d0 d0Var = this.f966q;
        if (d0Var != null) {
            unregisterReceiver(d0Var);
        }
        n3 n3Var = this.r;
        if (n3Var != null) {
            unregisterReceiver(n3Var);
        }
        Intent intent = new Intent(this.f962m.getApplicationContext(), (Class<?>) boot.class);
        intent.putExtra(m.h(new byte[]{-10}, new byte[]{-110, 34, ByteCompanionObject.MAX_VALUE, 19, -70, -10, -23, 119}), -1);
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Bundle bundle;
        int i12;
        Intent launchIntentForPackage;
        ActivityOptions launchDisplayId;
        final int i13 = 8;
        final int i14 = 0;
        boolean loadBoolean = b.o().loadBoolean(m.h(new byte[]{40, 94, -44, -65, 34, 94, 77, -34, 46, 114, -39, -92, 25, 90, 98, -53, 51, 76, -45, -95, 24, 91}, new byte[]{93, 45, -79, -51, 125, 63, kotlin.io.encoding.Base64.padSymbol, -82}), false);
        boolean b10 = b(this.f962m);
        Boolean bool = this.c;
        if (b10 && bool.booleanValue()) {
            throw null;
        }
        final int i15 = 10;
        try {
            b.a();
            b.r().Ping(m.h(new byte[]{2, -42, 52, -19, 87, 105, 126, 0, 10, -36}, new byte[]{99, -72, 80, -97, 56, 0, 26, 95}));
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        a o5 = b.o();
        byte[] bArr = m.e;
        String[] strArr = p3.f2001a;
        o5.saveString(new String(bArr), x1.f2066q);
        d0.d(this.f962m);
        final int i16 = 1;
        if (!loadBoolean) {
            j.b();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            final int i17 = 3;
            if (bundle != null && (i12 = bundle.getInt(m.h(new byte[]{12}, new byte[]{104, 23, -69, 126, -121, -50, -33, -103}))) > -1) {
                String loadString = b.o().loadString(m.h(new byte[]{105, -105, 63}, new byte[]{25, -4, 88, 31, -34, -83, -126, -17}), m.h(new byte[]{33, 53, -68, 30, 69, -64, 3, 91, 43, 110, -21, 6, 74, -54, 2, 70, kotlin.io.encoding.Base64.padSymbol, 33, -28, 14}, new byte[]{83, 64, -110, 103, 36, -82, 103, 62}));
                Display[] displays = ((DisplayManager) getApplicationContext().getSystemService(m.h(new byte[]{-51, 12, 25, 6, 83, 84, -115}, new byte[]{-87, 101, 106, 118, 63, 53, -12, -119}))).getDisplays();
                if (displays.length > 1 && (launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(loadString)) != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        launchDisplayId = ActivityOptions.makeBasic().setLaunchDisplayId(displays[i12].getDisplayId());
                        k.u(this, launchIntentForPackage, launchDisplayId.toBundle());
                    }
                    Log.e(m.h(new byte[]{kotlin.io.encoding.Base64.padSymbol, 14, -95, 64}, new byte[]{ByteCompanionObject.MAX_VALUE, 65, -18, 20, 117, 15, -93, -61}), m.h(new byte[]{-27, 42, -92, -36, -55, -127, 65, 37, -62, 55, -77, -57, -55, -40}, new byte[]{-74, 94, -59, -82, -67, -95, 0, 70}));
                }
            }
            d0.d(this.f962m);
            final int i18 = 2;
            com.bumptech.glide.m mVar = new com.bumptech.glide.m(i18, this);
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.e.cancel(false);
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v vVar = this.d;
            this.e = vVar.f2052b.schedule(mVar, 20000L, timeUnit);
            f();
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i19 = i13;
                    boot bootVar = this.c;
                    switch (i19) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            final int i19 = 9;
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i19;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i15;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i14;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i16;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i18;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i17;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            final int i20 = 4;
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i20;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            final int i21 = 5;
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i21;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
            final int i22 = 6;
            vVar.execute(new Runnable(this) { // from class: e0.o3
                public final /* synthetic */ boot c;

                {
                    this.c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i192 = i22;
                    boot bootVar = this.c;
                    switch (i192) {
                        case 0:
                            Context context = bootVar.f962m;
                            boolean z9 = false;
                            try {
                                z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                            } catch (Exception unused) {
                            }
                            if (z9) {
                                MockGpsService.m(context);
                                return;
                            }
                            return;
                        case 1:
                            WeatherService.e(bootVar.f962m);
                            return;
                        case 2:
                            TService.c(bootVar.f962m);
                            return;
                        case 3:
                            AllWidgetServices.c(bootVar.f962m);
                            return;
                        case 4:
                            Notik.g(bootVar.f962m);
                            return;
                        case 5:
                            OverlayService.c(bootVar.f962m);
                            return;
                        case 6:
                            SpeedBoardService.b(bootVar.f962m);
                            return;
                        case 7:
                            Boolean bool2 = bootVar.c;
                            if (MainActivity.w() && bool2.booleanValue()) {
                                throw null;
                            }
                            if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                                bootVar.f963n.toString();
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject = bootVar.a();
                            } catch (JSONException unused2) {
                            }
                            Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                            h0.b.a();
                            h0.b.m().newCall(build).enqueue(new z3.f(5));
                            return;
                        case 8:
                            Si.a(bootVar.f962m);
                            return;
                        case 9:
                            LounchB.c(bootVar.f962m);
                            return;
                        default:
                            Context context2 = bootVar.f962m;
                            androidx.fragment.app.h hVar = LocServ.f736h;
                            context2.startService(new Intent(context2, (Class<?>) LocServ.class));
                            return;
                    }
                }
            });
        } else {
            Context context = this.f962m;
            String str = j.f4976l;
            new Handler(Looper.getMainLooper()).post(new androidx.profileinstaller.c(context.getApplicationContext(), 9));
        }
        d0.d(this.f962m);
        ScheduledFuture scheduledFuture2 = this.f956g;
        if (scheduledFuture2 != null && !scheduledFuture2.isCancelled()) {
            this.f956g.cancel(true);
        }
        if (b(this.f962m) && bool.booleanValue()) {
            throw null;
        }
        final int i23 = 7;
        this.f956g = this.f955f.scheduleWithFixedDelay(new Runnable(this) { // from class: e0.o3
            public final /* synthetic */ boot c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i192 = i23;
                boot bootVar = this.c;
                switch (i192) {
                    case 0:
                        Context context2 = bootVar.f962m;
                        boolean z9 = false;
                        try {
                            z9 = h0.b.o().loadBoolean(MockGpsService.r, false);
                        } catch (Exception unused) {
                        }
                        if (z9) {
                            MockGpsService.m(context2);
                            return;
                        }
                        return;
                    case 1:
                        WeatherService.e(bootVar.f962m);
                        return;
                    case 2:
                        TService.c(bootVar.f962m);
                        return;
                    case 3:
                        AllWidgetServices.c(bootVar.f962m);
                        return;
                    case 4:
                        Notik.g(bootVar.f962m);
                        return;
                    case 5:
                        OverlayService.c(bootVar.f962m);
                        return;
                    case 6:
                        SpeedBoardService.b(bootVar.f962m);
                        return;
                    case 7:
                        Boolean bool2 = bootVar.c;
                        if (MainActivity.w() && bool2.booleanValue()) {
                            throw null;
                        }
                        if (MainActivity.v(bootVar.f962m) && bool2.booleanValue()) {
                            bootVar.f963n.toString();
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject = bootVar.a();
                        } catch (JSONException unused2) {
                        }
                        Request build = new Request.Builder().url(m.h(new byte[]{94, 15, -109, -102, 95, -67, 67, -42}, new byte[]{54, 123, -25, -22, 44, -121, 108, -7}) + punto.f1065u).post(RequestBody.create(jSONObject.toString(), MediaType.parse(m.h(new byte[]{ByteCompanionObject.MIN_VALUE, -38, 90, 72, -85, ByteCompanionObject.MIN_VALUE, -110, -43, -120, -59, 68, 11, -88, -112, -100, -49, -38, -118, 73, 76, -93, -111, ByteCompanionObject.MIN_VALUE, -60, -107, -105, 95, 80, -92, -50, -53}, new byte[]{-31, -86, 42, 36, -62, -29, -13, -95})))).addHeader(m.h(new byte[]{-24, -83, -72, 93, 48, 122, -43, -75, -1, -69, -90, 76}, new byte[]{-85, -62, -42, 41, 85, 20, -95, -104}), m.h(new byte[]{-84, -93, 24, 101, 42, -108, -123, -122, -92, -68, 6, 38, 41, -124, -117, -100}, new byte[]{-51, -45, 104, 9, 67, -9, -28, -14})).addHeader(m.h(new byte[]{-31, 62, -127, 73, -75, 70}, new byte[]{-96, 93, -30, 44, -59, 50, 27, 108}), m.h(new byte[]{112, -44, 101, -78, 64, 28, 103, 14, 120, -53, 123, -15, 67, 12, 105, 20}, new byte[]{17, -92, 21, -34, 41, ByteCompanionObject.MAX_VALUE, 6, 122})).build();
                        h0.b.a();
                        h0.b.m().newCall(build).enqueue(new z3.f(5));
                        return;
                    case 8:
                        Si.a(bootVar.f962m);
                        return;
                    case 9:
                        LounchB.c(bootVar.f962m);
                        return;
                    default:
                        Context context22 = bootVar.f962m;
                        androidx.fragment.app.h hVar = LocServ.f736h;
                        context22.startService(new Intent(context22, (Class<?>) LocServ.class));
                        return;
                }
            }
        }, 10L, 100000L, TimeUnit.MILLISECONDS);
        return 1;
    }

    public native boolean pusk(String str);
}
