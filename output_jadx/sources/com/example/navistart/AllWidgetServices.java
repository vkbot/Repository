package com.example.navistart;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.google.protobuf.q;
import e0.d;
import e0.e;
import e0.f;
import e0.h;
import e0.m;
import e0.p3;
import e0.u1;
import e0.x1;
import h0.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import s1.n;
import s1.u0;
import u0.a;
import x0.c;
import x0.o;
import x0.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AllWidgetServices extends Service {

    /* renamed from: g, reason: collision with root package name */
    public static volatile AllWidgetServices f693g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f694h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f695i;
    public WindowManager c;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f696b = new Handler(Looper.getMainLooper());
    public final Boolean d = Boolean.TRUE;
    public final HashMap e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f697f = new HashMap();

    public static void c(Context context) {
        context.startService(new Intent(context.getApplicationContext(), (Class<?>) AllWidgetServices.class));
    }

    public final void a() {
        if (b.o().loadBoolean(m.h(new byte[]{122, -76, 33, -80, -3, 16, 107, -78, 109, -90, 52, -95, -4, 16, 121, -75, 104, -93, Base64.padSymbol, -80, -21}, new byte[]{9, -63, 81, -43, -113, 79, 28, -37}), false)) {
            Display[] displays = ((DisplayManager) getSystemService(m.h(new byte[]{32, 101, 55, 62, -10, -47, 96}, new byte[]{68, 12, 68, 78, -102, -80, 25, 59}))).getDisplays();
            ArrayList a10 = p.a();
            int size = a10.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = a10.get(i10);
                i10++;
                o oVar = (o) obj;
                if (oVar.c) {
                    int i11 = -1;
                    for (int i12 = 0; i12 < displays.length; i12++) {
                        if (displays[i12].getDisplayId() == oVar.f6474h) {
                            i11 = i12;
                        }
                    }
                    if (i11 >= 0) {
                        Context createDisplayContext = createDisplayContext(displays[i11]);
                        String str = m.h(new byte[]{44, -96, -60, -8, -14, -95, -3, -74, 25, -97, -51, -35, -19, -84, -7, -74, 30, -109, -5, -38, -21, -96, -24, -116}, new byte[]{109, -52, -88, -81, -101, -59, -102, -45}) + oVar.f6470a;
                        c cVar = new c(createDisplayContext, oVar, false, false);
                        u1 u1Var = new u1(createDisplayContext, str);
                        b.a();
                        WindowManager g10 = b.g().b().g(cVar, i11, u1Var.c);
                        this.e.put(str, cVar);
                        this.f697f.put(cVar, g10);
                        u1Var.a(cVar, g10, new f(cVar, 0));
                        cVar.f6441o = u1Var;
                        cVar.k();
                        b.o().saveBoolean(str.concat(m.h(new byte[]{92, 12, 44}, new byte[]{3, 67, 66, 78, -86, -32, -46, 5})), true);
                        cVar.setVisibility(8);
                        b(cVar, str);
                    }
                }
            }
        }
    }

    public final void b(View view, String str) {
        Boolean bool;
        if (f695i) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        a o5 = b.o();
        byte[] bArr = m.f1973j;
        String[] strArr = p3.f2001a;
        q.s(bArr, o5, "", sb);
        q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = q.g(sb, x1.f2066q);
        a o9 = b.o();
        byte[] bArr2 = m.f1969f;
        if (q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (q.d(Long.MAX_VALUE, b.a().j()) >= Long.parseLong(new String(q.x(new byte[]{-4}, new byte[]{-52, -89, 35, 41, 10, -44, -34, 5}, b.o(), q.h(m.f1970g, b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            a o10 = b.o();
            StringBuilder u8 = ai.onnxruntime.a.u(str);
            u8.append(m.h(new byte[]{-24, -78, 48}, new byte[]{-73, -3, 94, -29, -87, -24, -43, -3}));
            if (o10.loadBoolean(u8.toString(), false)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
        if (MainActivity.w() && this.d.booleanValue()) {
            str.getClass();
        }
        if (MainActivity.v(this) && this.d.booleanValue()) {
            throw null;
        }
    }

    public final void d() {
        HashMap hashMap = this.f697f;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                a.a.v((WindowManager) entry.getValue(), (View) entry.getKey());
            }
        }
        hashMap.clear();
        this.e.clear();
    }

    public final void e(h hVar, boolean z9) {
        boolean z10;
        View view = (View) this.e.get(m.h(new byte[]{6, 62, 50, 90, 117, 34, 108, 59, 51, 1, 59, ByteCompanionObject.MAX_VALUE, 106, 47, 104, 59, 52, 13}, new byte[]{71, 82, 94, 13, 28, 70, 11, 94}).concat(hVar.f1931b));
        if (!f695i && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != null) {
            if (z10) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
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
        f693g = this;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (f693g == this) {
            f693g = null;
        }
        super.onDestroy();
        d();
        MainActivity.i1 = this;
        c(getApplicationContext());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        Runnable eVar;
        d();
        h[] values = h.values();
        int length = values.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            Runnable runnable = null;
            if (i13 >= length) {
                break;
            }
            h hVar = values[i13];
            String concat = m.h(new byte[]{36, 121, 51, 33, -80, -106, -108, 5, 17, 70, 58, 4, -81, -101, -112, 5, 22, 74}, new byte[]{101, 21, 95, 118, -39, -14, -13, 96}).concat(hVar.f1931b);
            View view = (View) hVar.c.create(this);
            this.e.put(concat, view);
            if (view != null) {
                u1 u1Var = new u1(this, concat);
                b.a();
                WindowManager f8 = b.g().b().f(view, u1Var.c);
                this.c = f8;
                this.f697f.put(view, f8);
                boolean z9 = view instanceof u0;
                if (z9) {
                    u0 u0Var = (u0) view;
                    WindowManager windowManager = this.c;
                    WindowManager.LayoutParams layoutParams = u1Var.c;
                    u0Var.f5624l = windowManager;
                    u0Var.f5625m = layoutParams;
                    layoutParams.flags = (layoutParams.flags | 256) & (-513);
                    if (b.o().loadInt(m.h(new byte[]{-13, -45, 40, 78, 92, 74, 106, -124, -58, -20, 33, 107, 67, 71, 110, -124, -63, -32, 23, 112, 91, 73, 97, -124, -27, -42, 42, 125, 90, 89, 85}, new byte[]{-78, -65, 68, 25, 53, 46, 13, -31}), Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                        layoutParams.x = u0Var.e(8) + u0Var.o().left;
                        layoutParams.y = u0Var.e(8) + u0Var.o().top;
                    }
                    u0Var.h();
                }
                boolean z10 = view instanceof n;
                if (z10) {
                    n nVar = (n) view;
                    WindowManager windowManager2 = this.c;
                    WindowManager.LayoutParams layoutParams2 = u1Var.c;
                    nVar.f5565j = windowManager2;
                    nVar.f5566k = layoutParams2;
                }
                if (z10) {
                    eVar = new d((n) view, i12);
                } else {
                    if (z9) {
                        eVar = new e((u0) view, 0);
                    }
                    u1Var.a(view, this.c, runnable);
                    u1Var.d();
                    view.setVisibility(8);
                    b(view, concat);
                }
                runnable = eVar;
                u1Var.a(view, this.c, runnable);
                u1Var.d();
                view.setVisibility(8);
                b(view, concat);
            }
            i13++;
        }
        if (MainActivity.w() && this.d.booleanValue()) {
            throw null;
        }
        if (MainActivity.v(this) && this.d.booleanValue()) {
            throw null;
        }
        MainActivity.i1 = this;
        e(h.f1928h, f694h);
        a();
        return super.onStartCommand(intent, i10, i11);
    }
}
