package com.example.navistart;

import a.a;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.location.Location;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import b1.t;
import com.example.navistart.SpeedBoardService;
import com.example.navistart.cores.HUDMassageObj;
import com.github.anastr.speedviewlib.ImageSpeedometer;
import com.google.protobuf.q;
import e0.m;
import e0.p3;
import e0.r2;
import e0.v0;
import e0.w;
import e0.x1;
import h0.b;
import h0.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import v0.f;
import v0.h;
import v0.i;
import v1.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SpeedBoardService extends Service implements c {

    /* renamed from: g, reason: collision with root package name */
    public static WindowManager f886g;

    /* renamed from: h, reason: collision with root package name */
    public static WindowManager f887h;

    /* renamed from: i, reason: collision with root package name */
    public static h f888i;

    /* renamed from: j, reason: collision with root package name */
    public static h f889j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f890k = m.h(new byte[]{27, 16, 18, -31, -7, 14, -40, -105, 55, 4, 56, -31, -7, 0, -57, -68, 24, 21, 34, -9, -26, 12, -61, -102, 9, 56, 37, -25, -23}, new byte[]{104, 103, 77, -110, -115, 111, -86, -29});

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f891b = w.c(-1, m.h(new byte[]{125, 92, 30, -86, -116, 15, 124, -14, 92, 72, 40, -86, -102, 59, 122, -16, 75}, new byte[]{46, 44, 123, -49, -24, 77, 19, -109}));
    public ScheduledFuture c;
    public final r2 d;
    public final r2 e;

    /* renamed from: f, reason: collision with root package name */
    public final r2 f892f;

    /* JADX WARN: Type inference failed for: r0v4, types: [e0.r2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [e0.r2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [e0.r2] */
    public SpeedBoardService() {
        final int i10 = 0;
        this.d = new Observer() { // from class: e0.r2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i10) {
                    case 0:
                        Integer num = (Integer) obj;
                        WindowManager windowManager = SpeedBoardService.f886g;
                        if (num != null) {
                            int intValue = num.intValue();
                            v0.h hVar = SpeedBoardService.f888i;
                            if (hVar != null) {
                                hVar.setSpeed(intValue);
                            }
                            v0.h hVar2 = SpeedBoardService.f889j;
                            if (hVar2 != null) {
                                hVar2.setSpeed(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            SpeedBoardService.a(hUDMassageObj);
                            return;
                        } else {
                            WindowManager windowManager2 = SpeedBoardService.f886g;
                            return;
                        }
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            v0.h hVar3 = SpeedBoardService.f888i;
                            if (hVar3 != null) {
                                hVar3.f(location);
                            }
                            v0.h hVar4 = SpeedBoardService.f889j;
                            if (hVar4 != null) {
                                hVar4.f(location);
                                return;
                            }
                            return;
                        }
                        WindowManager windowManager3 = SpeedBoardService.f886g;
                        return;
                }
            }
        };
        final int i11 = 1;
        this.e = new Observer() { // from class: e0.r2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i11) {
                    case 0:
                        Integer num = (Integer) obj;
                        WindowManager windowManager = SpeedBoardService.f886g;
                        if (num != null) {
                            int intValue = num.intValue();
                            v0.h hVar = SpeedBoardService.f888i;
                            if (hVar != null) {
                                hVar.setSpeed(intValue);
                            }
                            v0.h hVar2 = SpeedBoardService.f889j;
                            if (hVar2 != null) {
                                hVar2.setSpeed(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            SpeedBoardService.a(hUDMassageObj);
                            return;
                        } else {
                            WindowManager windowManager2 = SpeedBoardService.f886g;
                            return;
                        }
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            v0.h hVar3 = SpeedBoardService.f888i;
                            if (hVar3 != null) {
                                hVar3.f(location);
                            }
                            v0.h hVar4 = SpeedBoardService.f889j;
                            if (hVar4 != null) {
                                hVar4.f(location);
                                return;
                            }
                            return;
                        }
                        WindowManager windowManager3 = SpeedBoardService.f886g;
                        return;
                }
            }
        };
        final int i12 = 2;
        this.f892f = new Observer() { // from class: e0.r2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (i12) {
                    case 0:
                        Integer num = (Integer) obj;
                        WindowManager windowManager = SpeedBoardService.f886g;
                        if (num != null) {
                            int intValue = num.intValue();
                            v0.h hVar = SpeedBoardService.f888i;
                            if (hVar != null) {
                                hVar.setSpeed(intValue);
                            }
                            v0.h hVar2 = SpeedBoardService.f889j;
                            if (hVar2 != null) {
                                hVar2.setSpeed(intValue);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        HUDMassageObj hUDMassageObj = (HUDMassageObj) obj;
                        if (hUDMassageObj != null) {
                            SpeedBoardService.a(hUDMassageObj);
                            return;
                        } else {
                            WindowManager windowManager2 = SpeedBoardService.f886g;
                            return;
                        }
                    default:
                        Location location = (Location) obj;
                        if (location != null) {
                            v0.h hVar3 = SpeedBoardService.f888i;
                            if (hVar3 != null) {
                                hVar3.f(location);
                            }
                            v0.h hVar4 = SpeedBoardService.f889j;
                            if (hVar4 != null) {
                                hVar4.f(location);
                                return;
                            }
                            return;
                        }
                        WindowManager windowManager3 = SpeedBoardService.f886g;
                        return;
                }
            }
        };
    }

    public static void a(HUDMassageObj hUDMassageObj) {
        h hVar = f888i;
        if (hVar != null) {
            hVar.setHudMassageObj(hUDMassageObj);
        }
        h hVar2 = f889j;
        if (hVar2 != null) {
            hVar2.setHudMassageObj(hUDMassageObj);
        }
    }

    public static void b(Context context) {
        if (b.o().loadBoolean(f890k, false)) {
            context.startService(new Intent(context.getApplicationContext(), (Class<?>) SpeedBoardService.class));
        }
    }

    public final void c() {
        h hVar;
        h hVar2;
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.c.cancel(true);
        }
        h hVar3 = f888i;
        if (hVar3 != null) {
            hVar3.b();
        }
        h hVar4 = f889j;
        if (hVar4 != null) {
            hVar4.b();
        }
        WindowManager windowManager = f886g;
        if (windowManager != null && (hVar2 = f888i) != null) {
            a.v(windowManager, hVar2.getView());
        }
        WindowManager windowManager2 = f887h;
        if (windowManager2 != null && (hVar = f889j) != null) {
            a.v(windowManager2, hVar.getView());
        }
    }

    @Override // h0.c
    public final void d() {
        c();
        b.f2544q = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        v1.c d = d.a().d();
        d.f5923a.observeForever(this.d);
        d.d.observeForever(this.e);
        d.f5926g.observeForever(this.f892f);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        v1.c d = d.a().d();
        d.f5923a.removeObserver(this.d);
        d.d.removeObserver(this.e);
        d.f5926g.removeObserver(this.f892f);
        super.onDestroy();
        c();
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [android.widget.FrameLayout, com.example.navistart.SpeedBoard.PPSView] */
    /* JADX WARN: Type inference failed for: r2v33, types: [v0.d, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Boolean bool;
        h iVar;
        f fVar;
        c();
        Display[] displays = ((DisplayManager) getApplicationContext().getSystemService(m.h(new byte[]{100, 52, 110, 42, -121, 103, Base64.padSymbol}, new byte[]{0, 93, 29, 90, -21, 6, 68, 39}))).getDisplays();
        b.a();
        int priDisplayID = b.n().getPriDisplayID();
        boolean z9 = true;
        if (priDisplayID > -1 && displays.length > priDisplayID) {
            f886g = (WindowManager) getApplicationContext().createDisplayContext(displays[priDisplayID]).getSystemService(m.h(new byte[]{124, -121, 12, 6, -65, -125}, new byte[]{11, -18, 98, 98, -48, -12, 91, -87}));
            b.a();
            switch (b.p().f3381a) {
                case 0:
                    fVar = new f(this);
                    break;
                case 1:
                    fVar = new f(this);
                    break;
                case 2:
                    ?? frameLayout = new FrameLayout(this);
                    frameLayout.k(R.layout.pps_view2, this);
                    fVar = frameLayout;
                    break;
                case 3:
                    fVar = new f(this);
                    break;
                case 4:
                    ?? frameLayout2 = new FrameLayout(this);
                    View.inflate(this, R.layout.pps_view_col, frameLayout2);
                    frameLayout2.f5915b = (ImageSpeedometer) frameLayout2.findViewById(R.id.imageSpeedometer);
                    frameLayout2.c = (ImageSpeedometer) frameLayout2.findViewById(R.id.imageSpeedometerrpm);
                    frameLayout2.setBackgroundColor(0);
                    ImageSpeedometer imageSpeedometer = frameLayout2.f5915b;
                    if (imageSpeedometer != null) {
                        imageSpeedometer.setMaxSpeed(220);
                        frameLayout2.f5915b.setStartDegree(135);
                        frameLayout2.f5915b.setEndDegree(405);
                        frameLayout2.f5915b.setImageSpeedometer(R.drawable.pri3_spd);
                    }
                    frameLayout2.setBackgroundColor(0);
                    ImageSpeedometer imageSpeedometer2 = frameLayout2.c;
                    fVar = frameLayout2;
                    if (imageSpeedometer2 != null) {
                        imageSpeedometer2.setMaxSpeed(8);
                        frameLayout2.c.setStartDegree(135);
                        frameLayout2.c.setEndDegree(405);
                        frameLayout2.c.setImageSpeedometer(R.drawable.pri3_rpm);
                        fVar = frameLayout2;
                        break;
                    }
                    break;
                case 5:
                    fVar = new f(this);
                    break;
                default:
                    fVar = new f(this);
                    break;
            }
            f888i = fVar;
            if (!(fVar instanceof f)) {
                try {
                    f886g.addView(fVar.getView(), f888i.getLayParams());
                    f888i.setBackgroundColor(0);
                    ScheduledFuture scheduledFuture = this.c;
                    if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                        this.c.cancel(true);
                    }
                    this.c = this.f891b.scheduleWithFixedDelay(new v0(15, this), 10L, f888i.d(), TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }
        b.a();
        int hUDDisplayID = b.n().getHUDDisplayID();
        if (hUDDisplayID > -1 && displays.length > hUDDisplayID) {
            f887h = (WindowManager) getApplicationContext().createDisplayContext(displays[hUDDisplayID]).getSystemService(m.h(new byte[]{14, 64, -71, 103, 72, -66}, new byte[]{121, 41, -41, 3, 39, -55, -54, -101}));
            b.a();
            switch (b.p().f3381a) {
                case 0:
                    iVar = new i(this, new t(m.h(new byte[]{-86, -27, 91, 72, ByteCompanionObject.MIN_VALUE, -41, 91, -48, -115, -7, 111, 89, -86, -46, 109}, new byte[]{-25, -100, 12, 45, -30, -121, 41, -65}), m.h(new byte[]{51, -44, -36, 111, -18, -33, -89, -79, 20, -56, -24, 126, -60, -38, -111, -127, 45, -56, -1, 126, -27, -31, -78, -83, 33, -26, -18, 115}, new byte[]{126, -83, -117, 10, -116, -113, -43, -34}), m.h(new byte[]{50, -103, -18, 120, 54, 1, 36, 38, 62, -119, -20}, new byte[]{86, -4, -120, 25, 67, 109, 80, 121})));
                    break;
                case 1:
                    iVar = new f(this);
                    break;
                case 2:
                    iVar = new f(this);
                    break;
                case 3:
                    iVar = new f(this);
                    break;
                case 4:
                    iVar = new f(this);
                    break;
                case 5:
                    iVar = new i(this, new t(m.h(new byte[]{123, -111, -27, 26, 75, 52, 28, -72, 92, -115, -47, 11, 97, 49, 42}, new byte[]{54, -24, -78, ByteCompanionObject.MAX_VALUE, 41, 100, 110, -41}), m.h(new byte[]{-9, -123, 20, -77, -30, -86, -106, -18, -48, -103, 32, -94, -56, -81, -96, -34, -23, -103, 55, -94, -23, -108, -125, -14, -27, -73, 38, -81}, new byte[]{-70, -4, 67, -42, ByteCompanionObject.MIN_VALUE, -6, -28, -127}), m.h(new byte[]{-121, 49, -22, -121, 70, 109, 47, 48, -117, 33, -24}, new byte[]{-29, 84, -116, -26, 51, 1, 91, 111})));
                    break;
                default:
                    iVar = new i(this, new t(m.h(new byte[]{-43, -71, 57, 125, 118, Base64.padSymbol, 79, -4, -14, -91, 13, 108, 92, 56, 121}, new byte[]{-104, -64, 110, 24, 20, 109, Base64.padSymbol, -109}), m.h(new byte[]{58, 47, -107, -55, -57, -119, -42, -121, 29, 51, -95, -40, -19, -116, -32, -73, 36, 51, -74, -40, -52, -73, -61, -101, 40, 29, -89, -43}, new byte[]{119, 86, -62, -84, -91, -39, -92, -24}), m.h(new byte[]{-82, -98, 118, 89, Base64.padSymbol, 111, -92, -30, -94, -114, 116}, new byte[]{-54, -5, 16, 56, 72, 3, -48, -67})));
                    break;
            }
            f889j = iVar;
            if (!(iVar instanceof f)) {
                try {
                    f887h.addView(iVar.getView(), f889j.getLayParams());
                    f889j.setBackgroundColor(0);
                } catch (Exception unused2) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        u0.a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        u0.a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            if (q.d(Long.MAX_VALUE, b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{-18}, new byte[]{-34, -40, -11, 80, -65, -57, ByteCompanionObject.MIN_VALUE, 25}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            h hVar = f888i;
            if (hVar != null) {
                hVar.a();
            }
            h hVar2 = f889j;
            if (hVar2 != null) {
                hVar2.a();
            }
        }
        b.f2544q = this;
        return super.onStartCommand(intent, i10, i11);
    }
}
