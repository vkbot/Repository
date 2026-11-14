package com.woha.pogoda;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.h;
import com.example.navistart.R;
import com.google.protobuf.q;
import e0.j2;
import e0.m;
import e0.p3;
import e0.u1;
import e0.w;
import e0.x1;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.b;
import k7.c;
import k7.d;
import k7.e;
import kotlin.jvm.internal.ByteCompanionObject;
import n0.f;
import u0.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class WeatherService extends Service {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1686f;

    /* renamed from: g, reason: collision with root package name */
    public static Location f1687g;

    /* renamed from: h, reason: collision with root package name */
    public static c f1688h;

    /* renamed from: i, reason: collision with root package name */
    public static r5.c f1689i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile b f1690j;

    /* renamed from: k, reason: collision with root package name */
    public static Location f1691k;

    /* renamed from: l, reason: collision with root package name */
    public static String f1692l;

    /* renamed from: b, reason: collision with root package name */
    public e f1693b;
    public WindowManager c;
    public final ScheduledThreadPoolExecutor d = w.c(-1, m.h(new byte[]{-123, -36, 46, -76, 10, -37, -33, 23, -73, -53, 57, -87, 1, -37}, new byte[]{-46, -71, 79, -64, 98, -66, -83, 68}));
    public ScheduledFuture e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [k7.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [k7.c, java.lang.Object] */
    public static synchronized c a() {
        c cVar;
        synchronized (WeatherService.class) {
            try {
                String b10 = b();
                if (f1688h != null) {
                    if (!b10.equals(f1692l)) {
                    }
                    cVar = f1688h;
                }
                if (b10.equals(f.d.name())) {
                    f1688h = new Object();
                } else if (b10.equals(f.e.name())) {
                    f1688h = new Object();
                } else {
                    f1688h = new r5.c(23, new c[]{new Object(), new Object()});
                }
                f1692l = b10;
                cVar = f1688h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static String b() {
        return h0.b.o().loadString(m.h(new byte[]{-1, -59, 55, 46, -9, 101, -122, -64, -4, -38, 57, 47, -3, 97, -85, -24, -27, -47, 57, 31, -23, 114, -101}, new byte[]{-116, -75, 94, 64, -103, 0, -12, -97}), f.c.name());
    }

    public static b c() {
        if (f1690j == null) {
            f1690j = new b(m.h(new byte[]{-80, 115, -9}, new byte[]{-2, 92, -74, -13, -6, -114, -56, 84}), "", "", R.drawable.unknown);
        }
        return f1690j;
    }

    public static boolean d(double d, double d10, h hVar) {
        if (Double.isFinite(d) && Double.isFinite(d10) && d >= -90.0d && d <= 90.0d && d10 >= -180.0d && d10 <= 180.0d) {
            w.c(-1, m.h(new byte[]{0, 7, ByteCompanionObject.MIN_VALUE, 53, -117, 19, 42, -112, 50, 16, -105, 40, ByteCompanionObject.MIN_VALUE, 19}, new byte[]{87, 98, -31, 65, -29, 118, 88, -61})).execute(new j2(hVar, String.format(Locale.US, m.h(new byte[]{42, 103, -4, 19, -91, -52, -69, 40, 105}, new byte[]{15, 73, -50, 117, -119, -23, -107, 26}), Double.valueOf(d), Double.valueOf(d10))));
            return true;
        }
        return false;
    }

    public static void e(Context context) {
        if (h0.b.o().loadBoolean(m.h(new byte[]{43, 97, -40, 46, -117, -55, 84, 86, 57, 73, -16, 55, ByteCompanionObject.MIN_VALUE, -55, 100, 93, 54, 121, -31, 56}, new byte[]{88, 22, -121, 94, -28, -82, 59, 50}), false)) {
            context.startService(new Intent(context, (Class<?>) WeatherService.class));
        }
    }

    public static void g(b bVar) {
        f1690j = bVar;
        r5.c cVar = f1689i;
        if (cVar != null) {
            WeatherService weatherService = (WeatherService) cVar.c;
            if (f1690j == null) {
                f1690j = new b(m.h(new byte[]{-106, -71, -119}, new byte[]{-40, -106, -56, -87, 94, -40, -95, 72}), "", "", R.drawable.unknown);
            }
            if (!m.h(new byte[]{-3, -75, -62}, new byte[]{-77, -102, -125, -93, 113, -10, -26, -66}).equals(bVar.f3425a) && !"".equals(bVar.f3425a)) {
                f1690j.f3425a = bVar.f3425a;
            }
            if (!"".equals(bVar.f3426b)) {
                f1690j.f3426b = bVar.f3426b;
            }
            int i10 = bVar.d;
            if (i10 == -1) {
                f1690j.d = R.drawable.unknown;
            } else {
                f1690j.d = i10;
            }
            if (weatherService.f1693b != null) {
                new Handler(Looper.getMainLooper()).post(new d(weatherService, 2));
            }
        }
    }

    public static void h(boolean z9) {
        r5.c cVar = f1689i;
        if (cVar != null) {
            WeatherService weatherService = (WeatherService) cVar.c;
            Boolean valueOf = Boolean.valueOf(z9);
            if (weatherService.f1693b != null) {
                new Handler(Looper.getMainLooper()).post(new j2(14, weatherService, valueOf));
            }
        }
    }

    public final void f() {
        Boolean bool;
        Location location;
        ScheduledFuture scheduledFuture = this.e;
        boolean z9 = true;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.e.cancel(true);
        }
        StringBuilder sb = new StringBuilder();
        a o5 = h0.b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        a o9 = h0.b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            if (q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{87}, new byte[]{103, 34, -117, 17, -102, 33, 38, 30}, h0.b.o(), q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            Location location2 = f1687g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.d;
            if (location2 != null) {
                if (!b().equals(f.f4115f.name()) && (location = f1687g) != null) {
                    d(location.getLatitude(), location.getLongitude(), null);
                }
                this.e = scheduledThreadPoolExecutor.schedule(new d(this, 0), 1800000L, timeUnit);
                return;
            }
            this.e = scheduledThreadPoolExecutor.schedule(new d(this, 0), 10000L, timeUnit);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        f1686f = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f1689i = null;
        e eVar = this.f1693b;
        if (eVar != null) {
            a.a.v(this.c, eVar);
            this.f1693b = null;
        }
        f1686f = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.widget.LinearLayout, k7.e, android.view.View, android.view.ViewGroup] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        e eVar = this.f1693b;
        if (eVar != null) {
            a.a.v(this.c, eVar);
            this.f1693b = null;
        }
        u1 u1Var = new u1(this, m.h(new byte[]{-12, 18, -70, 124, 87, -93, 74, -109, -22, 18, -84}, new byte[]{-125, 119, -37, 8, 63, -58, 56, -59}));
        ?? linearLayout = new LinearLayout(this);
        linearLayout.f3430g = Boolean.FALSE;
        LayoutInflater.from(this).inflate(R.layout.weather_view, (ViewGroup) linearLayout, true);
        linearLayout.f3428b = (TextView) linearLayout.findViewById(R.id.textView38);
        linearLayout.c = (TextView) linearLayout.findViewById(R.id.textView39);
        linearLayout.d = (ImageView) linearLayout.findViewById(R.id.imageViewWeather);
        linearLayout.e = (LinearLayout) linearLayout.findViewById(R.id.viewWeatherBlock);
        linearLayout.f3429f = (ProgressBar) linearLayout.findViewById(R.id.progressBar2);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(0);
        this.f1693b = linearLayout;
        f1689i = new r5.c(24, this);
        h0.b.a();
        WindowManager f8 = h0.b.g().b().f(this.f1693b, u1Var.c);
        this.c = f8;
        u1Var.a(this.f1693b, f8, new d(this, 1));
        u1Var.d();
        f();
        return 1;
    }
}
