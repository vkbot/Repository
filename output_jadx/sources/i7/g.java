package i7;

import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.example.navistart.LocServ;
import com.example.navistart.R;
import com.example.navistart.cores.HUDMassageObj;
import com.woha.atir.CameraInfoView;
import e0.p3;
import e0.u1;
import e0.x1;
import java.util.LinkedList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: o, reason: collision with root package name */
    public static double f2788o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2789a = true;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2790b = e0.w.c(-1, e0.m.h(new byte[]{113, 84, 5, 10, -57, -63, -121, 80, 99, 80, 11, 15}, new byte[]{48, 56, 100, 120, -86, -88, -23, 55}));
    public ScheduledFuture c;
    public final LocServ d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f2791f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f2792g;

    /* renamed from: h, reason: collision with root package name */
    public WindowManager f2793h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f2794i;

    /* renamed from: j, reason: collision with root package name */
    public CameraInfoView f2795j;

    /* renamed from: k, reason: collision with root package name */
    public w f2796k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2797l;

    /* renamed from: m, reason: collision with root package name */
    public s0.c f2798m;

    /* renamed from: n, reason: collision with root package name */
    public long f2799n;

    public g(LocServ locServ) {
        new Handler(Looper.getMainLooper());
        this.e = new Object();
        this.f2791f = new LinkedList();
        this.f2792g = new Handler(Looper.getMainLooper());
        this.f2794i = Boolean.TRUE;
        new LinkedList();
        this.f2797l = true;
        this.f2799n = System.currentTimeMillis();
        this.d = locServ;
        d();
    }

    public static Boolean a() {
        StringBuilder sb = new StringBuilder();
        u0.a o5 = h0.b.o();
        byte[] bArr = e0.m.f1973j;
        String[] strArr = p3.f2001a;
        com.google.protobuf.q.s(bArr, o5, "", sb);
        com.google.protobuf.q.r(new byte[]{108, 105, 99, 116, 95, 114, 105, 117, 101}, sb);
        String g10 = com.google.protobuf.q.g(sb, x1.f2066q);
        u0.a o9 = h0.b.o();
        byte[] bArr2 = e0.m.f1969f;
        if (com.google.protobuf.q.w(bArr2, o9, "", g10)) {
            boolean z9 = true;
            if (com.google.protobuf.q.d(Long.MAX_VALUE, h0.b.a().j()) >= Long.parseLong(new String(com.google.protobuf.q.x(new byte[]{-107}, new byte[]{-91, -86, -123, -59, 95, 15, 0, 124}, h0.b.o(), com.google.protobuf.q.h(e0.m.f1970g, h0.b.o(), new String(bArr2)), 0)))) {
                z9 = false;
            }
            return Boolean.valueOf(z9);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        if (r10 > i7.g.f2788o) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(i7.a r9, double r10, double r12, java.util.ArrayList r14) {
        /*
            u0.a r0 = h0.b.o()
            r1 = 19
            byte[] r1 = new byte[r1]
            r1 = {x00b0: FILL_ARRAY_DATA , data: [51, -92, 122, 120, 13, -16, 14, 12, 33, -92, 100, 115, 12, -21, 2, 8, 63, -74, 113} // fill-array
            r2 = 8
            byte[] r3 = new byte[r2]
            r3 = {x00be: FILL_ARRAY_DATA , data: [126, -27, 34, 39, 73, -71, 93, 88} // fill-array
            java.lang.String r1 = e0.m.h(r1, r3)
            r3 = 50
            int r0 = r0.loadInt(r1, r3)
            double r0 = (double) r0
            i7.g.f2788o = r0
            double r3 = r9.f2780b
            i7.x r9 = r9.f2779a
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r4 = 1
            if (r3 <= 0) goto L55
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2e
            goto Lac
        L2e:
            u0.a r0 = h0.b.o()
            r1 = 15
            byte[] r1 = new byte[r1]
            r1 = {x00c6: FILL_ARRAY_DATA , data: [-106, -97, 40, -88, 40, 24, -63, -72, -97, -119, 39, -69, 58, 26, -55} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x00d2: FILL_ARRAY_DATA , data: [-37, -42, 102, -9, 123, 72, -124, -3} // fill-array
            java.lang.String r1 = e0.m.h(r1, r2)
            r2 = 30
            int r0 = r0.loadInt(r1, r2)
            double r0 = (double) r0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = r9.e
            double r0 = (double) r0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 >= 0) goto L55
            goto Lac
        L55:
            double r12 = r9.f2838b
            double r0 = r9.c
            int r9 = r14.size()
            r2 = 2
            if (r9 >= r2) goto L61
            goto La3
        L61:
            int r9 = r14.size()
            int r9 = r9 - r4
            java.lang.Object r9 = r14.get(r9)
            android.location.Location r9 = (android.location.Location) r9
            int r3 = r14.size()
            int r3 = r3 - r2
            java.lang.Object r14 = r14.get(r3)
            android.location.Location r14 = (android.location.Location) r14
            double r2 = r9.getLatitude()
            double r5 = r14.getLatitude()
            double r2 = r2 - r5
            double r5 = r9.getLongitude()
            double r7 = r14.getLongitude()
            double r5 = r5 - r7
            double r7 = r9.getLatitude()
            double r12 = r12 - r7
            double r7 = r9.getLongitude()
            double r0 = r0 - r7
            double r2 = r2 * r12
            double r5 = r5 * r0
            double r5 = r5 + r2
            r12 = 0
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 >= 0) goto La3
            double r12 = i7.g.f2788o
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto La3
            goto Lac
        La3:
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto Lad
        Lac:
            return r4
        Lad:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.g.f(i7.a, double, double, java.util.ArrayList):boolean");
    }

    public final void b(a aVar) {
        synchronized (this.e) {
            try {
                if (!this.f2791f.stream().anyMatch(new c(0, this, aVar))) {
                    this.f2791f.add(aVar);
                    ScheduledFuture scheduledFuture = this.c;
                    if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                        this.c.cancel(true);
                    }
                    this.c = this.f2790b.scheduleWithFixedDelay(new e(this, 2), 10L, 1000L, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.f2792g.post(new e(this, 1));
        HUDMassageObj hUDMassageObj = new HUDMassageObj();
        hUDMassageObj.AradarOn = Boolean.FALSE;
        hUDMassageObj.hudSenderType = HUDMassageObj.HudSenderType.ARAD;
        hUDMassageObj.aradarSenderType = HUDMassageObj.AradarSenderType.GENARADAR;
        hUDMassageObj.v_mTurnType = -1;
        hUDMassageObj.v_mTurnDis = 0;
        hUDMassageObj.v_mNextRoad = " ";
        h0.b.a();
        h0.b.i().e(hUDMassageObj);
        this.f2789a = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.woha.atir.CameraInfoView, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v6, types: [i7.w, android.view.View] */
    public final void d() {
        LocServ locServ = this.d;
        s0.c cVar = new s0.c(locServ);
        this.f2798m = cVar;
        cVar.d = false;
        cVar.f5459b = cVar.f5458a.load(locServ, R.raw.sky_call_connecting, 1);
        u1 u1Var = new u1(locServ, e0.m.h(new byte[]{-101, -30, 32, -116, -20, 53, -74, -26, -116, -25, 36, -119}, new byte[]{-38, -114, 65, -2, -127, 98, -33, -120}));
        u1 u1Var2 = new u1(locServ, e0.m.h(new byte[]{-64, -109, -69, -68, 25, -82, 18, -36, -14, -106, -75, -90, 1, -108, 42, -52, -28}, new byte[]{-109, -6, -36, -46, 120, -62, 67, -87}));
        ?? linearLayout = new LinearLayout(locServ);
        linearLayout.a(locServ);
        this.f2795j = linearLayout;
        ?? view = new View(locServ);
        view.c = 8;
        view.d = 2.5f;
        view.e = 0.5f;
        view.f2832f = 0.5f;
        view.f2833g = 20.0f;
        view.f2834h = 14.0f;
        view.f2835i = false;
        view.f2836j = 0L;
        this.f2796k = view;
        h0.b.a();
        this.f2793h = h0.b.g().b().f(this.f2795j, u1Var.c);
        h0.b.a();
        h0.b.g().b().f(this.f2796k, u1Var2.c);
        u1Var.a(this.f2795j, this.f2793h, new e(this, 0));
        u1Var.d();
        u1Var2.a(this.f2796k, this.f2793h, null);
        u1Var2.d();
    }

    public final void e() {
        SoundPool soundPool;
        WindowManager windowManager = this.f2793h;
        if (windowManager != null) {
            a.a.v(windowManager, this.f2795j);
            a.a.v(this.f2793h, this.f2796k);
        }
        s0.c cVar = this.f2798m;
        if (cVar != null && (soundPool = cVar.f5458a) != null) {
            soundPool.release();
            cVar.f5458a = null;
        }
    }

    public final void g() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.c.cancel(true);
        }
    }
}
