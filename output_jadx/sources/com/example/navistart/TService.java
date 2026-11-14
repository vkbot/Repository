package com.example.navistart;

import a4.g;
import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.wireguard.android.backend.GoBackend;
import d2.h;
import e0.m;
import e0.w;
import f7.c;
import h0.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TService extends VpnService {
    public static h c;
    public static View d;
    public static ImageView e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f907f;

    /* renamed from: b, reason: collision with root package name */
    public WindowManager f908b;

    public static void a(Boolean bool) {
        f907f = !bool.booleanValue();
        if (d != null) {
            if (bool.booleanValue()) {
                d.setVisibility(0);
            } else {
                d.setVisibility(8);
            }
        }
    }

    public static void b(Boolean bool) {
        if (e != null) {
            new Handler(Looper.getMainLooper()).post(new g(20, bool));
        }
    }

    public static void c(Context context) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) TService.class);
        if (b.o().loadBoolean(m.h(new byte[]{109, 82, 95, -93, 81, 37, 2, -6, 114, 65, 84, -113, 125, 51, 4, -19, 105, 86}, new byte[]{27, 34, 49, -4, 34, 64, 112, -116}), false)) {
            context.startService(intent);
        }
    }

    @Override // android.net.VpnService, android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d2.h, java.lang.Object] */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ?? obj = new Object();
        obj.f1739a = w.c(-1, m.h(new byte[]{-62, 106, 20, -80, -49, 94, -20, -104, -11, 122}, new byte[]{-106, 31, 122, -29, -86, 44, -102, -15}));
        obj.c = getApplicationContext();
        obj.q();
        c = obj;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        View view;
        super.onDestroy();
        WindowManager windowManager = this.f908b;
        if (windowManager != null && (view = d) != null) {
            try {
                windowManager.removeViewImmediate(view);
            } catch (Exception unused) {
            }
            d = null;
        }
        h hVar = c;
        if (hVar != null) {
            try {
                GoBackend goBackend = (GoBackend) hVar.d;
                if (goBackend != null) {
                    goBackend.c(1, (c) hVar.e, (r5.c) hVar.f1741f);
                } else {
                    hVar.q();
                }
            } catch (Exception unused2) {
            }
            c.getClass();
            c.i();
        }
        c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            r6 = this;
            android.view.WindowManager r0 = r6.f908b
            r1 = 0
            if (r0 == 0) goto Le
            android.view.View r2 = com.example.navistart.TService.d
            if (r2 == 0) goto Le
            r0.removeViewImmediate(r2)     // Catch: java.lang.Exception -> Lc
        Lc:
            com.example.navistart.TService.d = r1
        Le:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r6)
            r2 = 2131493150(0x7f0c011e, float:1.8609772E38)
            android.view.View r0 = r0.inflate(r2, r1)
            com.example.navistart.TService.d = r0
            r1 = 2131297761(0x7f0905e1, float:1.8213476E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.example.navistart.TService.e = r0
            e0.u1 r0 = new e0.u1
            r1 = 17
            byte[] r1 = new byte[r1]
            r1 = {x00f0: FILL_ARRAY_DATA , data: [105, -120, -60, 51, -83, 85, -126, -124, 73, -85, -28, 2, -83, 80, -114, -109, 72} // fill-array
            r2 = 8
            byte[] r3 = new byte[r2]
            r3 = {x00fe: FILL_ARRAY_DATA , data: [63, -62, -121, 103, -14, 6, -25, -10} // fill-array
            java.lang.String r1 = e0.m.h(r1, r3)
            r0.<init>(r6, r1)
            h0.b.a()
            j1.v r1 = h0.b.g()
            z0.a r1 = r1.b()
            android.view.View r3 = com.example.navistart.TService.d
            android.view.WindowManager$LayoutParams r4 = r0.c
            android.view.WindowManager r1 = r1.f(r3, r4)
            r6.f908b = r1
            android.view.View r3 = com.example.navistart.TService.d
            e0.v0 r4 = new e0.v0
            r5 = 16
            r4.<init>(r5)
            r0.a(r3, r1, r4)
            r0.d()
            d2.h r0 = com.example.navistart.TService.c
            r0.getClass()
            r1 = 0
            java.lang.Object r3 = r0.d     // Catch: java.lang.Exception -> L77
            com.wireguard.android.backend.GoBackend r3 = (com.wireguard.android.backend.GoBackend) r3     // Catch: java.lang.Exception -> L77
            if (r3 == 0) goto L77
            java.lang.Object r0 = r0.f1741f     // Catch: java.lang.Exception -> L77
            r5.c r0 = (r5.c) r0     // Catch: java.lang.Exception -> L77
            r5.c r3 = r3.c     // Catch: java.lang.Exception -> L77
            if (r3 != r0) goto L77
            r0 = 1
            goto L78
        L77:
            r0 = r1
        L78:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            b(r0)
            u0.a r0 = h0.b.o()
            r3 = 25
            byte[] r3 = new byte[r3]
            r3 = {x0106: FILL_ARRAY_DATA , data: [-96, -114, 71, 114, 19, -79, 5, 45, -128, -83, 103, 67, 19, -76, 9, 58, -127, -101, 114, 79, 63, -117, 2, 51, -109} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0118: FILL_ARRAY_DATA , data: [-10, -60, 4, 38, 76, -30, 96, 95} // fill-array
            java.lang.String r3 = e0.m.h(r3, r4)
            boolean r0 = r0.loadBoolean(r3, r1)
            if (r0 != 0) goto L9e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            a(r0)
        L9e:
            boolean r0 = com.example.navistart.TService.f907f
            if (r0 == 0) goto La9
            android.view.View r0 = com.example.navistart.TService.d
            if (r0 == 0) goto La9
            r0.setVisibility(r2)
        La9:
            u0.a r0 = h0.b.o()
            r3 = 14
            byte[] r3 = new byte[r3]
            r3 = {x0120: FILL_ARRAY_DATA , data: [-61, -118, -41, 12, -42, -99, 116, -22, -22, -119, -51, 50, -58, -122} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x012c: FILL_ARRAY_DATA , data: [-75, -6, -71, 83, -76, -14, 27, -98} // fill-array
            java.lang.String r3 = e0.m.h(r3, r4)
            boolean r0 = r0.loadBoolean(r3, r1)
            if (r0 == 0) goto Leb
            u0.a r0 = h0.b.o()
            r3 = 21
            byte[] r3 = new byte[r3]
            r3 = {x0134: FILL_ARRAY_DATA , data: [-27, 24, -101, 57, 106, -28, -128, 61, -52, 27, -127, 7, 122, -1, -80, 58, -25, 9, -127, 19, 123} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0144: FILL_ARRAY_DATA , data: [-109, 104, -11, 102, 8, -117, -17, 73} // fill-array
            java.lang.String r2 = e0.m.h(r3, r2)
            boolean r0 = r0.loadBoolean(r2, r1)
            if (r0 == 0) goto Leb
            d2.h r0 = com.example.navistart.TService.c
            java.lang.Object r2 = r0.f1739a
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = (java.util.concurrent.ScheduledThreadPoolExecutor) r2
            l7.a r3 = new l7.a
            r3.<init>(r0, r1)
            r2.execute(r3)
        Leb:
            int r7 = super.onStartCommand(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.navistart.TService.onStartCommand(android.content.Intent, int, int):int");
    }
}
