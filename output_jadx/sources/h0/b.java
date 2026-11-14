package h0;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import b1.m;
import com.example.navistart.MainActivity;
import com.example.navistart.MyApplication;
import com.example.navistart.cores.AreaDisplayProxy;
import com.example.navistart.cores.CarCmdProxy;
import com.example.navistart.cores.ColorText;
import com.example.navistart.cores.InterC;
import com.example.navistart.cores.ProBroProxy;
import com.example.navistart.cores.ProLanProxy;
import d2.h;
import e0.a0;
import e0.c0;
import e0.e2;
import e0.p;
import e0.w;
import e0.x1;
import f5.j;
import j1.v;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import l.d;
import okhttp3.OkHttpClient;
import p2.e;
import u3.p.c00008;
import w0.y;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b {
    public static u0.a d;
    public static w7.c e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile b f2533f;

    /* renamed from: g, reason: collision with root package name */
    public static e f2534g;

    /* renamed from: h, reason: collision with root package name */
    public static a f2535h;

    /* renamed from: i, reason: collision with root package name */
    public static a0 f2536i;

    /* renamed from: j, reason: collision with root package name */
    public static h f2537j;

    /* renamed from: k, reason: collision with root package name */
    public static x1 f2538k;

    /* renamed from: l, reason: collision with root package name */
    public static d f2539l;

    /* renamed from: m, reason: collision with root package name */
    public static InterC f2540m;

    /* renamed from: n, reason: collision with root package name */
    public static c0 f2541n;

    /* renamed from: o, reason: collision with root package name */
    public static j0.c f2542o;

    /* renamed from: q, reason: collision with root package name */
    public static ContextWrapper f2544q;

    /* renamed from: a, reason: collision with root package name */
    public p f2547a;

    /* renamed from: b, reason: collision with root package name */
    public m f2548b;
    public static final String c = e0.m.h(new byte[]{-68, 75, -43, 8, 41, 39, 81, 39, -102, 88}, new byte[]{-1, 42, -89, 69, 72, 73, 48, 64});

    /* renamed from: p, reason: collision with root package name */
    public static final Object f2543p = new Object();
    public static final ScheduledThreadPoolExecutor r = w.c(-1, e0.m.h(new byte[]{-92, 103, 112, -64, 22, 51, -20, 126, -120, 106, 88, -33, 8}, new byte[]{-23, 30, 49, -80, 102, 95, -123, 29}));

    /* renamed from: s, reason: collision with root package name */
    public static final Object f2545s = new Object();
    public static volatile CountDownLatch t = new CountDownLatch(1);

    /* renamed from: u, reason: collision with root package name */
    public static volatile boolean f2546u = false;

    public b(Context context, boolean z9) {
        o();
        try {
            com.bumptech.glide.d.f616b = context;
            b();
            j();
            f();
            com.bumptech.glide.d.c = j();
            this.f2547a = new p();
            t();
            if (f2535h == null) {
                f2535h = new a(context, this.f2547a.f1995a);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r;
            scheduledThreadPoolExecutor.execute(new e2(this, context, z9, 1));
            this.f2548b = new m(context);
            i();
            k();
            scheduledThreadPoolExecutor.execute(new j(2, this));
        } catch (Exception unused) {
        }
    }

    public static b a() {
        b bVar;
        boolean z9 = false;
        while (true) {
            try {
                t.await();
                bVar = f2533f;
            } catch (InterruptedException unused) {
                z9 = true;
            }
            if (bVar != null) {
                break;
            }
            synchronized (b.class) {
                s(false);
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return bVar;
    }

    public static AreaDisplayProxy c() {
        AreaDisplayProxy areaDisplayProxy;
        a aVar = f2535h;
        synchronized (aVar) {
            try {
                if (aVar.e == null) {
                    aVar.e = (AreaDisplayProxy) aVar.f2531h.f4066g.create(aVar.f2527a);
                }
                areaDisplayProxy = aVar.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return areaDisplayProxy;
    }

    public static CarCmdProxy d() {
        CarCmdProxy carCmdProxy;
        a aVar = f2535h;
        synchronized (aVar) {
            try {
                if (aVar.f2528b == null) {
                    aVar.f2528b = (CarCmdProxy) aVar.f2531h.c.create(aVar.f2527a);
                }
                carCmdProxy = aVar.f2528b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return carCmdProxy;
    }

    public static j0.c f() {
        synchronized (f2543p) {
            try {
                if (f2542o == null) {
                    Log.d(c, e0.m.h(new byte[]{125, 56, 108, 40, -3, 79, 33, -93, 125, 28, 107, 27, -52, 79, 28, -82, 106}, new byte[]{19, 93, 27, 107, -100, Base64.padSymbol, 115, -42}));
                    f2542o = new j0.c(h());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2542o;
    }

    public static v g() {
        v vVar;
        a aVar = f2535h;
        synchronized (aVar) {
            try {
                if (aVar.f2532i == null) {
                    aVar.f2532i = aVar.f2531h.f4068i;
                }
                vVar = aVar.f2532i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public static Context h() {
        if (e == null) {
            w7.c cVar = new w7.c(7);
            System.loadLibrary(e0.m.h(new byte[]{-8, -53, 43}, new byte[]{-101, -93, 78, -8, -37, 75, -27, 8}));
            e = cVar;
        }
        return MyApplication.c;
    }

    public static a0 i() {
        synchronized (f2543p) {
            try {
                if (f2536i == null) {
                    Log.d(c, e0.m.h(new byte[]{-1, 124, 13, -113, -8, -29, 81, 106, -1, 120, 29, -94, -33}, new byte[]{-111, 25, 122, -57, -83, -89, 28, 11}));
                    f2536i = new a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2536i;
    }

    public static x1 k() {
        synchronized (f2543p) {
            try {
                if (f2538k == null) {
                    Log.d(c, e0.m.h(new byte[]{-109, -35, 12, -98, -95, 25, -90, -9, -76, -42, 29, -68, -124, 24, -96, -20, -124}, new byte[]{-3, -72, 123, -45, -44, 106, -49, -108}));
                    f2538k = new x1(h());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2538k;
    }

    public static i0.b l() {
        i0.b bVar;
        a aVar = f2535h;
        synchronized (aVar) {
            try {
                if (aVar.f2529f == null) {
                    aVar.f2529f = (i0.b) aVar.f2531h.f4065f.create();
                }
                bVar = aVar.f2529f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static OkHttpClient m() {
        c0 c0Var;
        synchronized (b.class) {
            try {
                if (f2541n == null) {
                    f2541n = new c0();
                }
                c0Var = f2541n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var.f1893a;
    }

    public static ProLanProxy n() {
        ProLanProxy proLanProxy;
        a aVar = f2535h;
        synchronized (aVar) {
            try {
                if (aVar.c == null) {
                    aVar.c = (ProLanProxy) aVar.f2531h.d.create(aVar.f2527a);
                }
                proLanProxy = aVar.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return proLanProxy;
    }

    public static u0.a o() {
        synchronized (f2543p) {
            try {
                if (d == null) {
                    Log.d(c, e0.m.h(new byte[]{8, 80, -36, 93, -33, -68, 2, 101, 8, 82, -40, 106, -22, -70, 25, 116, 31}, new byte[]{102, 53, -85, 14, -70, -56, 118, 12}));
                    d = new u0.a(h());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d;
    }

    public static k1.a p() {
        k1.a aVar;
        a aVar2 = f2535h;
        synchronized (aVar2) {
            try {
                if (aVar2.f2530g == null) {
                    aVar2.f2530g = (k1.a) aVar2.f2531h.f4067h.create();
                }
                aVar = aVar2.f2530g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static y q() {
        return w0.a0.c(h());
    }

    public static ProBroProxy r() {
        ProBroProxy proBroProxy;
        a aVar = f2535h;
        synchronized (aVar) {
            try {
                if (aVar.d == null) {
                    aVar.d = (ProBroProxy) aVar.f2531h.e.create(aVar.f2527a);
                }
                proBroProxy = aVar.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return proBroProxy;
    }

    public static synchronized void s(boolean z9) {
        synchronized (b.class) {
            try {
                if (f2533f == null && !f2546u) {
                    if (t.getCount() == 0) {
                        t = new CountDownLatch(1);
                    }
                    f2546u = true;
                    r.execute(new c7.e(z9, t));
                }
            } finally {
            }
        }
    }

    public static void v(String str) {
        a();
        h hVar = f2537j;
        hVar.getClass();
        hVar.p(str, ColorText.BLACK);
    }

    public static void w(String str, ColorText colorText) {
        a();
        f2537j.p(str, colorText);
    }

    public static synchronized void x(boolean z9) {
        synchronized (b.class) {
            t = new CountDownLatch(1);
            f2546u = false;
            f2533f = null;
            s(z9);
        }
    }

    public final h b() {
        synchronized (this) {
            synchronized (f2543p) {
                try {
                    if (f2537j == null) {
                        Log.d(c, e0.m.h(new byte[]{-49, -101, 57, 23, 52, 119, 12, -18, -58, -103, 43, 36}, new byte[]{-95, -2, 78, 86, 68, 7, 64, -127}));
                        f2537j = new h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f2537j;
    }

    public final p e() {
        synchronized (f2543p) {
            try {
                if (this.f2547a == null) {
                    this.f2547a = new p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f2547a;
    }

    public final InterC j() {
        synchronized (this) {
            if (f2540m == null) {
                synchronized (b.class) {
                    try {
                        if (f2540m == null) {
                            if (f2539l == null) {
                                f2539l = new d(h(), 9);
                            }
                            d dVar = f2539l;
                            InterC interC = (InterC) ((c00008) dVar.d).getP((Context) dVar.c);
                            f2540m = interC;
                            if (f2534g == null && interC != null) {
                                e eVar = new e(7);
                                f2534g = eVar;
                                interC.set(eVar);
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        return f2540m;
    }

    public final void t() {
        p pVar = this.f2547a;
        String loadString = d.loadString(e0.m.h(new byte[]{80, 32, -25, 68, -63, -125, 83, 107, ByteCompanionObject.MAX_VALUE, 4}, new byte[]{19, 97, -75, 20, -77, -20, 53, 2}), null);
        pVar.getClass();
        if (loadString == null || loadString.isEmpty() || com.bumptech.glide.d.i(n0.c.class, loadString) == null) {
            loadString = n0.c.values()[0].name();
        }
        pVar.f1995a = (n0.c) com.bumptech.glide.d.i(n0.c.class, loadString);
        this.f2547a.e = d.loadInt(e0.m.h(new byte[]{50, -124, -117, -105, 29, -42, 57, -106, 39, -105, -123}, new byte[]{70, -31, -32, -31, 114, -78, 102, -27}), 1);
        this.f2547a.d = d.loadInt(e0.m.h(new byte[]{19, -26, -5, -74, 0, -108, 53, -17, 42, -30, -27, -82}, new byte[]{94, -121, -120, -34, 95, -6, 84, -99}), 0);
    }

    public final void u() {
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (MainActivity.w()) {
            InterC j10 = j();
            if (j10 != null) {
                z11 = j10.bi();
            } else {
                z11 = false;
            }
            if (z11) {
                throw null;
            }
        }
        if (MainActivity.v(h())) {
            InterC j11 = j();
            if (j11 != null) {
                z10 = j11.bi();
            } else {
                z10 = false;
            }
            if (z10) {
                throw null;
            }
        }
        a();
        p pVar = this.f2547a;
        if (o().loadBoolean(e0.m.h(new byte[]{19, 79, -79, 39, -51, 102, -93, -107, 59, 86, -118, 46, -5}, new byte[]{82, 58, -59, 72, -99, 20, -52, -13}), false)) {
            i10 = 1;
        } else {
            i10 = d().getvod();
            if (i10 <= 0) {
                i10 = o().loadInt(e0.m.h(new byte[]{46, -114, 4, 17, -12, -40, -33, -111, 59, -99, 10}, new byte[]{90, -21, 111, 103, -101, -68, ByteCompanionObject.MIN_VALUE, -30}), 1);
            }
        }
        o().saveInt(e0.m.h(new byte[]{113, -111, 53, -96, 83, -77, 72, 88, 100, -126, 59}, new byte[]{5, -12, 94, -42, 60, -41, 23, 43}), i10);
        pVar.e = i10;
        this.f2547a.c = d().getstatengin();
        this.f2547a.d = d().getouttemp();
        if (d.loadBoolean(e0.m.h(new byte[]{-54, 49, -42, 29, 31, 44, -71, -78, -42, 59, -38, 22, 31, 58, -93}, new byte[]{-125, 117, -119, 94, 94, 126, -26, -31}) + d.loadInt(e0.m.h(new byte[]{-93, -96, 88, 27, -126, ByteCompanionObject.MIN_VALUE, 63, 69, -74, -77, 86}, new byte[]{-41, -59, 51, 109, -19, -28, 96, 54}), 1), false)) {
            this.f2547a.f1996b = d().getsun();
        }
        if (this.f2547a.c.booleanValue()) {
            this.f2547a.f1997f = d().getSpeed();
        }
        if (MainActivity.w()) {
            InterC j12 = j();
            if (j12 != null) {
                z9 = j12.bi();
            } else {
                z9 = false;
            }
            if (z9) {
                throw null;
            }
        }
        if (MainActivity.v(h())) {
            InterC j13 = j();
            if (j13 != null) {
                z12 = j13.bi();
            }
            if (z12) {
                throw null;
            }
        }
    }
}
