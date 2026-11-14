package w0;

import com.example.navistart.R;
import com.example.navistart.cores.BTProxy;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final z3.f f6160b;
    public final n.p c;
    public final ScheduledExecutorService d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f6161f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f6162g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f6163h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f6164i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f6165j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f6166k;

    /* renamed from: l, reason: collision with root package name */
    public String f6167l;

    /* renamed from: m, reason: collision with root package name */
    public j0 f6168m;

    /* renamed from: n, reason: collision with root package name */
    public String f6169n;

    /* renamed from: o, reason: collision with root package name */
    public int f6170o;

    /* renamed from: p, reason: collision with root package name */
    public int f6171p;

    /* renamed from: q, reason: collision with root package name */
    public int f6172q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public w0 f6173s;

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.n0, java.lang.Object] */
    public l0(z3.f fVar, n.p pVar, ScheduledExecutorService scheduledExecutorService) {
        ?? obj = new Object();
        obj.f6191a = m0.f6178b;
        List list = Collections.EMPTY_LIST;
        obj.f6192b = list;
        obj.d = list;
        obj.e = "";
        obj.f6193f = "";
        obj.f6194g = "";
        this.f6161f = obj;
        this.f6162g = new AtomicInteger();
        this.f6163h = new AtomicInteger();
        this.f6167l = "";
        this.f6169n = "";
        this.f6172q = -1;
        this.f6160b = fVar;
        this.c = pVar;
        this.d = scheduledExecutorService;
        this.e = 10000L;
    }

    public final void S() {
        if (!this.f6165j && !this.f6166k && this.f6173s == null && this.f6168m == null) {
            try {
                this.f6160b.getClass();
                String j10 = z3.f.j();
                this.f6169n = j10;
                this.f6160b.getClass();
                if (!z3.f.c(j10).isEmpty()) {
                    int i10 = this.f6170o + 1;
                    this.f6170o = i10;
                    int i11 = this.f6163h.get();
                    this.f6171p = i11;
                    z3.f fVar = this.f6160b;
                    String str = this.f6169n;
                    fVar.getClass();
                    j0 i12 = z3.f.i(str);
                    this.f6168m = i12;
                    if (i12 != null) {
                        BTProxy bTProxy = i12.f6128a;
                        this.r = false;
                        bTProxy.setListener(new i0(this, i10, i11));
                        h0(i10, i11, 0);
                        return;
                    }
                    b(k0.c, i10, i11);
                }
            } catch (Exception unused) {
                int i13 = this.f6172q;
                c0();
                V(k0.c, i13);
            }
        }
    }

    public final void V(k0 k0Var, int i10) {
        int i11;
        if (!c(i10)) {
            return;
        }
        this.f6164i = false;
        this.f6172q = -1;
        this.f6161f.c();
        x xVar = (x) this.c.c;
        xVar.r().e(e0.m.h(new byte[]{11, 74, 87, -16, 78, -99, -60, -119, 20, 64, 84, -5, 70}, new byte[]{123, 34, 56, -98, 43, -62, -76, -5}), e0.m.h(new byte[]{49, -9, 75, 36, -53, 31}, new byte[]{67, -110, 42, 87, -92, 113, -127, 14}), k0Var.name());
        if (k0Var == k0.f6136b) {
            i11 = R.string.voice_call_unsupported;
        } else if (k0Var == k0.d) {
            i11 = R.string.voice_call_timeout;
        } else {
            i11 = R.string.voice_call_unavailable;
        }
        x.f(xVar, xVar.f6282m.getString(i11));
    }

    public final void b(k0 k0Var, int i10, int i11) {
        if (!y(i10, i11)) {
            return;
        }
        int i12 = this.f6172q;
        c0();
        V(k0Var, i12);
    }

    public final boolean c(int i10) {
        if (!this.f6165j && this.f6164i && this.f6162g.get() == i10) {
            n.p pVar = this.c;
            if (((x) pVar.c).T && !((x) pVar.c).f6284o) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c0() {
        this.f6170o++;
        this.f6173s = null;
        this.r = false;
        this.f6169n = "";
        j0 j0Var = this.f6168m;
        this.f6168m = null;
        if (j0Var != null) {
            try {
                s1.x0 x0Var = j0Var.f6129b;
                try {
                    j0Var.f6128a.setListener(null);
                } finally {
                    x0Var.run();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f6165j) {
            return;
        }
        i0();
        this.f6165j = true;
        this.f6163h.incrementAndGet();
        this.d.execute(new e0(this, 0));
        this.d.shutdown();
    }

    public final synchronized void d0(String str, boolean z9) {
        if (!z9) {
            try {
                if (!this.f6167l.isEmpty()) {
                    if (this.f6167l.equalsIgnoreCase(str)) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f0(str);
    }

    public final synchronized void e0(String str) {
        String upperCase;
        try {
            if (this.f6165j) {
                return;
            }
            if (str == null) {
                upperCase = "";
            } else {
                upperCase = str.toUpperCase(Locale.ROOT);
            }
            if (!this.f6166k && !upperCase.isEmpty() && upperCase.equals(this.f6167l)) {
                synchronized (this) {
                    g0(new e0(this, 2));
                }
                return;
            }
            this.f6167l = upperCase;
            this.f6166k = false;
            int incrementAndGet = this.f6163h.incrementAndGet();
            i0();
            g0(new f0(this, incrementAndGet, 1));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f0(String str) {
        if (this.f6165j) {
            return;
        }
        if (str != null && !str.isEmpty() && !this.f6167l.isEmpty() && !this.f6167l.equalsIgnoreCase(str)) {
            return;
        }
        this.f6167l = "";
        this.f6166k = true;
        int incrementAndGet = this.f6163h.incrementAndGet();
        i0();
        g0(new f0(this, incrementAndGet, 0));
    }

    public final synchronized void g0(Runnable runnable) {
        if (!this.f6165j) {
            this.d.execute(runnable);
        }
    }

    public final void h0(final int i10, final int i11, final int i12) {
        if (y(i10, i11) && this.f6173s == null) {
            try {
                if (!j0()) {
                    b(k0.c, i10, i11);
                    return;
                }
                boolean requestContacts = this.f6168m.f6128a.requestContacts();
                this.r = requestContacts;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ScheduledExecutorService scheduledExecutorService = this.d;
                if (!requestContacts) {
                    if (i12 >= 20) {
                        b(k0.c, i10, i11);
                        return;
                    } else {
                        scheduledExecutorService.schedule(new Runnable() { // from class: w0.g0
                            @Override // java.lang.Runnable
                            public final void run() {
                                l0.this.h0(i10, i11, i12 + 1);
                            }
                        }, 500L, timeUnit);
                        return;
                    }
                }
                scheduledExecutorService.schedule(new p0.f(this, i10, i11, 1), this.e, timeUnit);
            } catch (Exception unused) {
                b(k0.c, i10, i11);
            }
        }
    }

    public final synchronized void i0() {
        this.f6162g.incrementAndGet();
        this.f6164i = false;
        g0(new e0(this, 1));
    }

    public final boolean j0() {
        String str = this.f6169n;
        this.f6160b.getClass();
        return str.equals(z3.f.j());
    }

    public final boolean y(int i10, int i11) {
        if (!this.f6165j && !this.f6166k && i10 == this.f6170o && i11 == this.f6163h.get()) {
            return true;
        }
        return false;
    }
}
