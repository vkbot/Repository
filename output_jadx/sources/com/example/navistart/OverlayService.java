package com.example.navistart;

import a4.g;
import android.animation.ValueAnimator;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.view.WindowManager;
import b1.c;
import com.example.navistart.mainview.FireballView;
import e0.e2;
import e0.m;
import e0.w;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import t1.a;
import w0.a0;
import w0.b;
import w0.b0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class OverlayService extends Service implements b0 {

    /* renamed from: f, reason: collision with root package name */
    public static volatile OverlayService f865f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f866g;

    /* renamed from: b, reason: collision with root package name */
    public a f869b;
    public ScheduledFuture d;

    /* renamed from: i, reason: collision with root package name */
    public static final String f868i = m.h(new byte[]{-66, -39, 108, -101, 99, -103, 29, 126, -83, -38, 100, -101, 104, ByteCompanionObject.MIN_VALUE, 10, 122, -82, -62, 96, -57, 114, -49, 14, 102, -77, -104, 82, -59, 111, -126, 20, Base64.padSymbol, -101, -39, 98, -64, 117}, new byte[]{-35, -74, 1, -75, 6, -31, 124, 19});

    /* renamed from: h, reason: collision with root package name */
    public static b f867h = b.f6065b;
    public final ScheduledThreadPoolExecutor c = w.c(-1, m.h(new byte[]{-46, -34, 48, 73, 62, -51, 101, -124, -8, -38, 35, 82, 49, -55}, new byte[]{-99, -88, 85, 59, 82, -84, 28, -41}));
    public final c e = new c(4, this);

    public static void c(Context context) {
        if (h0.b.o().loadBoolean(m.h(new byte[]{-60, 25, 44, 84, 111, 91, 107, 117, -18, 29, 63, 79, 96, 95, 65, 82, -22, 29, Base64.padSymbol}, new byte[]{-117, 111, 73, 38, 3, 58, 18, 38}), false)) {
            context.startService(new Intent(context.getApplicationContext(), (Class<?>) OverlayService.class));
        }
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.d.cancel(false);
        }
    }

    public final void b() {
        if (!f866g) {
            h0.b.a();
            h0.b.q().d();
            if (!a0.e()) {
                this.f869b.a(true);
                f866g = true;
                MediaPlayer create = MediaPlayer.create(this, R.raw.pop_402324);
                create.setOnCompletionListener(new d6.b(1));
                create.start();
            }
        }
        a();
        if (a0.e()) {
            return;
        }
        this.d = this.c.schedule(new g(17, this), 15000L, TimeUnit.MILLISECONDS);
    }

    public final void d() {
        if (f866g) {
            f866g = false;
            h0.b.a();
            h0.b.q().a();
            a aVar = this.f869b;
            if (aVar != null) {
                aVar.a(false);
                this.f869b.setText("");
            }
            if (!a0.e()) {
                MediaPlayer create = MediaPlayer.create(this, R.raw.shredder_switch_01_422056);
                create.setOnCompletionListener(new d6.b(1));
                create.start();
            }
            if (h0.b.o().loadBoolean(m.h(new byte[]{-23, 66, -76, 42, 44, 66, -69, -50, -20, 83, -87, 16, 18, 90, -72, -8, -55, 101}, new byte[]{-102, 50, -35, 117, 77, 41, -49, -89}), false)) {
                h0.b.a();
                h0.b.q().b();
            }
        }
    }

    public final void e() {
        a aVar = this.f869b;
        if (aVar != null) {
            FireballView fireballView = aVar.e;
            ValueAnimator valueAnimator = fireballView.f1012b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                fireballView.f1012b.removeAllListeners();
                fireballView.f1012b.removeAllUpdateListeners();
            }
            aVar.f5748g.removeCallbacksAndMessages(null);
            WindowManager windowManager = aVar.f5746b;
            if (windowManager != null) {
                a.a.v(windowManager, aVar);
            }
            aVar.f5747f = null;
        }
        this.f869b = null;
    }

    @Override // w0.b0
    public final void i(String str) {
        this.c.execute(new e2(this, a0.e(), str, 0));
    }

    @Override // w0.b0
    public final void m(b bVar) {
        if (bVar != f867h) {
            f867h = bVar;
            a aVar = this.f869b;
            if (aVar != null) {
                aVar.setStatusSpickView(bVar);
            }
        }
        if (a0.e() && bVar == b.d && !f866g) {
            f866g = true;
            a();
            a aVar2 = this.f869b;
            if (aVar2 != null) {
                aVar2.a(true);
            }
        }
        if (bVar != b.d && f866g) {
            f866g = false;
            a();
            a aVar3 = this.f869b;
            if (aVar3 != null) {
                aVar3.a(false);
                this.f869b.setText("");
            }
            if (h0.b.o().loadBoolean(m.h(new byte[]{-7, -95, -64, 4, 109, 9, -108, 30, -4, -80, -35, 62, 83, 17, -105, 40, -39, -122}, new byte[]{-118, -47, -87, 91, 12, 98, -32, 119}), false)) {
                h0.b.a();
                h0.b.q().b();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f865f = this;
        String str = a0.f6061a;
        synchronized (a0.class) {
            ArrayList arrayList = a0.e;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
        }
        Si.a(this);
        IntentFilter intentFilter = new IntentFilter(f868i);
        int i10 = Build.VERSION.SDK_INT;
        c cVar = this.e;
        if (i10 >= 33) {
            registerReceiver(cVar, intentFilter, 2);
        } else {
            registerReceiver(cVar, intentFilter);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (f865f == this) {
            f865f = null;
        }
        super.onDestroy();
        String str = a0.f6061a;
        synchronized (a0.class) {
            a0.e.remove(this);
        }
        e();
        c(this);
        unregisterReceiver(this.e);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        b bVar;
        e();
        a aVar = new a(this, f867h);
        this.f869b = aVar;
        String str = a0.f6061a;
        synchronized (a0.class) {
            if (a0.d != null) {
                bVar = a0.d.e();
            } else {
                bVar = w0.c.f6069a;
            }
        }
        aVar.setStatusSpickView(bVar);
        return super.onStartCommand(intent, i10, i11);
    }
}
