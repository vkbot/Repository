package com.example.navistart;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.IBinder;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import b1.m;
import com.example.navistart.LounchB;
import com.example.navistart.ModernMainActivity;
import e0.u1;
import h0.b;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import r0.a;
import r0.e;
import r5.c;
import t1.j;
import t1.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class LounchB extends Service {

    /* renamed from: g, reason: collision with root package name */
    public static WindowManager f746g;

    /* renamed from: h, reason: collision with root package name */
    public static c f747h;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f748b;
    public j c;
    public m d;
    public k e;

    /* renamed from: f, reason: collision with root package name */
    public a f749f;

    public static void c(Context context) {
        if (!b.o().loadBoolean(e0.m.h(new byte[]{-124, -123, Base64.padSymbol, 7, -28, -39, -12, -57, -70, -97, 45}, new byte[]{-56, -22, 72, 105, -121, -79, -74, -109}), false) && !b.o().loadBoolean(e0.m.h(new byte[]{23, 10, -57, 47, 94, -28, 44, -11, 59, 31, -19, 54, 95, -25, 54}, new byte[]{100, 125, -104, 66, 43, -120, 88, -100}), false)) {
            return;
        }
        context.startService(new Intent(context.getApplicationContext(), (Class<?>) LounchB.class));
    }

    public final void a() {
        Display[] displays = ((DisplayManager) getSystemService(e0.m.h(new byte[]{57, 27, 26, -58, -52, -127, -113}, new byte[]{93, 114, 105, -74, -96, -32, -10, -117}))).getDisplays();
        b.a();
        if (b.n().getGuDisplayID() > -1) {
            int length = displays.length;
        }
    }

    public final void b(boolean z9) {
        j jVar;
        j jVar2;
        int i10;
        int i11;
        j jVar3 = this.c;
        int i12 = 8;
        if (jVar3 != null) {
            if (z9) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            jVar3.setVisibility(i11);
        }
        m mVar = this.d;
        if (mVar != null && (jVar2 = (j) mVar.d) != null) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jVar2.setVisibility(i10);
        }
        k kVar = this.e;
        if (kVar != null && (jVar = kVar.f5784b) != null) {
            if (z9) {
                i12 = 0;
            }
            jVar.setVisibility(i12);
        }
    }

    public final void d() {
        try {
            a.a.v(f746g, this.c);
            m mVar = this.d;
            if (mVar != null) {
                mVar.d();
                WindowManager windowManager = (WindowManager) mVar.c;
                if (windowManager != null) {
                    a.a.v(windowManager, (j) mVar.d);
                }
            }
            k kVar = this.e;
            if (kVar != null) {
                kVar.a();
                WindowManager windowManager2 = kVar.f5783a;
                if (windowManager2 != null) {
                    a.a.v(windowManager2, kVar.f5784b);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        f747h = new c(7, this);
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f747h = null;
        WindowManager windowManager = f746g;
        if (windowManager != null) {
            a.a.v(windowManager, this.f748b);
            this.f748b.removeAllViews();
            this.f748b.requestLayout();
            this.f748b.invalidate();
            this.f748b = null;
            d();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        int i12;
        a();
        try {
            a.a.v(f746g, this.f748b);
        } catch (Exception unused) {
        }
        u1 u1Var = new u1(this, e0.m.h(new byte[]{-6, 16, Base64.padSymbol, 110, 51, -43, 26}, new byte[]{-74, ByteCompanionObject.MAX_VALUE, 72, 0, 80, -67, 88, 62}));
        this.f748b = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.lounchb, (ViewGroup) null);
        b.a();
        WindowManager f8 = b.g().b().f(this.f748b, u1Var.c);
        f746g = f8;
        final int i13 = 1;
        u1Var.a(this.f748b, f8, new Runnable(this) { // from class: e0.j0
            public final /* synthetic */ LounchB c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Boolean bool;
                int i14 = i13;
                LounchB lounchB = this.c;
                switch (i14) {
                    case 0:
                        lounchB.c.d(lounchB);
                        return;
                    default:
                        WindowManager windowManager = LounchB.f746g;
                        StringBuilder sb = new StringBuilder();
                        u0.a o5 = h0.b.o();
                        byte[] bArr = m.f1973j;
                        String[] strArr = p3.f2001a;
                        com.google.protobuf.q.s(bArr, o5, "", sb);
                        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
                        u0.a o9 = h0.b.o();
                        byte[] bArr2 = m.f1969f;
                        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
                            boolean z9 = true;
                            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-6}, new byte[]{-54, Base64.padSymbol, 91, -11, -9, -54, 43, -84}, h0.b.o(), com.google.protobuf.q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                z9 = false;
                            }
                            bool = Boolean.valueOf(z9);
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (bool.booleanValue()) {
                            h0.b.a();
                            h0.b.f().k(m.h(new byte[]{-101, 74, -121, 113, 13, 26, -27, -85, -92, 64, -122, 64, 0, 23, -48}, new byte[]{-41, 37, -14, 31, 110, 114, -89, -12}));
                            return;
                        } else {
                            y5.k.u(lounchB, new Intent(lounchB, (Class<?>) ModernMainActivity.class).addFlags(268435456), null);
                            return;
                        }
                }
            }
        });
        u1Var.d();
        final int i14 = 0;
        boolean loadBoolean = b.o().loadBoolean(e0.m.h(new byte[]{-69, -78, -50, 104, -113, -11, -108, -15, -123, -88, -34}, new byte[]{-9, -35, -69, 6, -20, -99, -42, -91}), false);
        RelativeLayout relativeLayout = this.f748b;
        if (relativeLayout != null) {
            if (loadBoolean) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            relativeLayout.setVisibility(i12);
        }
        d();
        this.f749f = new a(this);
        this.c = new j(this);
        u1 u1Var2 = new u1(this, e0.m.h(new byte[]{-107, -29, -88, -93, 83, 0, -119, -75, -116, -30, -85, -71, 101, 41, -94, -91, -113}, new byte[]{-8, -106, -60, -41, 58, 95, -53, -64}));
        b.a();
        z0.a b10 = b.g().b();
        j jVar = this.c;
        b.a();
        WindowManager g10 = b10.g(jVar, b.n().getGuDisplayID(), u1Var2.c);
        f746g = g10;
        u1Var2.a(this.c, g10, new Runnable(this) { // from class: e0.j0
            public final /* synthetic */ LounchB c;

            {
                this.c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Boolean bool;
                int i142 = i14;
                LounchB lounchB = this.c;
                switch (i142) {
                    case 0:
                        lounchB.c.d(lounchB);
                        return;
                    default:
                        WindowManager windowManager = LounchB.f746g;
                        StringBuilder sb = new StringBuilder();
                        u0.a o5 = h0.b.o();
                        byte[] bArr = m.f1973j;
                        String[] strArr = p3.f2001a;
                        com.google.protobuf.q.s(bArr, o5, "", sb);
                        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
                        String g102 = com.google.protobuf.q.g(sb, x1.f2066q);
                        u0.a o9 = h0.b.o();
                        byte[] bArr2 = m.f1969f;
                        if (com.google.protobuf.q.w(bArr2, o9, "", g102)) {
                            boolean z9 = true;
                            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-6}, new byte[]{-54, Base64.padSymbol, 91, -11, -9, -54, 43, -84}, h0.b.o(), com.google.protobuf.q.h(m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                                z9 = false;
                            }
                            bool = Boolean.valueOf(z9);
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (bool.booleanValue()) {
                            h0.b.a();
                            h0.b.f().k(m.h(new byte[]{-101, 74, -121, 113, 13, 26, -27, -85, -92, 64, -122, 64, 0, 23, -48}, new byte[]{-41, 37, -14, 31, 110, 114, -89, -12}));
                            return;
                        } else {
                            y5.k.u(lounchB, new Intent(lounchB, (Class<?>) ModernMainActivity.class).addFlags(268435456), null);
                            return;
                        }
                }
            }
        });
        u1Var2.d();
        this.d = new m(this);
        b.a();
        this.e = new k(this, b.n().getZaPassDisplayID(), e0.m.h(new byte[]{Base64.padSymbol, -125, ByteCompanionObject.MAX_VALUE, -29, -20, 32, -11, 3, 36, -126, 124, -7, -38, 9, -34, 19, 39, -87, 105, -10, -31}, new byte[]{80, -10, 19, -105, -123, ByteCompanionObject.MAX_VALUE, -73, 118}));
        b(b.o().loadBoolean(e0.m.h(new byte[]{52, -15, -14, -42, -113, -111, -77, -73, 24, -28, -40, -49, -114, -110, -87}, new byte[]{71, -122, -83, -69, -6, -3, -57, -34}), false));
        this.c.e(new a4.c(this, 0, 4), new a4.c(this, 1, 4), new a4.c(this, 2, 4), new a4.c(this, 3, 4), new a4.c(this, 4, 4), new a4.c(this, 5, 4), new a4.c(this, 6, 4), new a4.c(this, 7, 4));
        this.c.setImageRun(e.a(this));
        return super.onStartCommand(intent, i10, i11);
    }
}
