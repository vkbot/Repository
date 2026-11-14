package o7;

import androidx.core.app.NotificationCompat;
import java.nio.charset.Charset;
import java.util.Locale;
import okhttp3.internal.http2.Header;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: u, reason: collision with root package name */
    public static final n7.t0 f4413u = n7.b0.a(Header.RESPONSE_STATUS_UTF8, new u2(15));

    /* renamed from: a, reason: collision with root package name */
    public q2 f4414a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4415b = new Object();
    public final w4 c;
    public final q2 d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4416f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4417g;

    /* renamed from: h, reason: collision with root package name */
    public final t4 f4418h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4419i;

    /* renamed from: j, reason: collision with root package name */
    public w f4420j;

    /* renamed from: k, reason: collision with root package name */
    public n7.q f4421k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4422l;

    /* renamed from: m, reason: collision with root package name */
    public m0.r0 f4423m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f4424n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4425o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4426p;

    /* renamed from: q, reason: collision with root package name */
    public n7.f1 f4427q;
    public n7.v0 r;

    /* renamed from: s, reason: collision with root package name */
    public Charset f4428s;
    public boolean t;

    public b1(int i10, t4 t4Var, w4 w4Var) {
        o4.b.i(w4Var, "transportTracer");
        this.c = w4Var;
        q2 q2Var = new q2(this, i10, t4Var, w4Var);
        this.d = q2Var;
        this.f4414a = q2Var;
        this.f4421k = n7.q.d;
        this.f4422l = false;
        this.f4418h = t4Var;
    }

    public static Charset d(n7.v0 v0Var) {
        String str = (String) v0Var.c(y0.f4781i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return i4.b.f2771b;
    }

    public static n7.f1 i(n7.v0 v0Var) {
        char charAt;
        Integer num = (Integer) v0Var.c(f4413u);
        if (num == null) {
            return n7.f1.f4200l.h("Missing HTTP status code");
        }
        String str = (String) v0Var.c(y0.f4781i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return y0.g(num.intValue()).b("invalid content-type: " + str);
    }

    public abstract void a(int i10);

    public final void b(n7.f1 f1Var, v vVar, n7.v0 v0Var) {
        if (!this.f4419i) {
            this.f4419i = true;
            t4 t4Var = this.f4418h;
            if (t4Var.f4729b.compareAndSet(false, true)) {
                for (n7.e eVar : t4Var.f4728a) {
                    eVar.B(f1Var);
                }
            }
            if (this.c != null) {
                f1Var.f();
            }
            this.f4420j.b(f1Var, vVar, v0Var);
        }
    }

    public abstract void c(boolean z9);

    public final void e(n7.v0 v0Var) {
        n7.h hVar;
        n7.h hVar2 = n7.h.c;
        o4.b.m(!this.f4425o, "Received headers on closed stream");
        for (n7.e eVar : this.f4418h.f4728a) {
            eVar.g();
        }
        String str = (String) v0Var.c(y0.d);
        if (str != null) {
            n7.p pVar = (n7.p) this.f4421k.f4237a.get(str);
            if (pVar != null) {
                hVar = pVar.f4233a;
            } else {
                hVar = null;
            }
            if (hVar == null) {
                ((p7.j) this).m(n7.f1.f4200l.h("Can't find decompressor for ".concat(str)).a());
                return;
            } else if (hVar != hVar2) {
                q2 q2Var = this.f4414a;
                q2Var.getClass();
                o4.b.m(true, "Already set full stream decompressor");
                q2Var.f4670f = hVar;
            }
        }
        this.f4420j.l(v0Var);
    }

    public final boolean f() {
        boolean z9;
        synchronized (this.f4415b) {
            try {
                if (this.f4416f && this.e < 32768 && !this.f4417g) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } finally {
            }
        }
        return z9;
    }

    public final void g(n7.f1 f1Var, v vVar, boolean z9, n7.v0 v0Var) {
        boolean z10;
        o4.b.i(f1Var, NotificationCompat.CATEGORY_STATUS);
        if (this.f4425o && !z9) {
            return;
        }
        this.f4425o = true;
        this.f4426p = f1Var.f();
        synchronized (this.f4415b) {
            try {
                this.f4417g = true;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw th;
            }
        }
        if (this.f4422l) {
            this.f4423m = null;
            b(f1Var, vVar, v0Var);
            return;
        }
        this.f4423m = new m0.r0(1, this, f1Var, vVar, v0Var);
        q2 q2Var = this.f4414a;
        if (z9) {
            q2Var.close();
            return;
        }
        if (!q2Var.isClosed()) {
            if (q2Var.f4677m.d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                q2Var.close();
            } else {
                q2Var.r = true;
            }
        }
    }

    public final void h(n7.f1 f1Var, boolean z9, n7.v0 v0Var) {
        g(f1Var, v.f4733b, z9, v0Var);
    }
}
