package o7;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f2 extends n7.m0 implements n7.z {

    /* renamed from: c0, reason: collision with root package name */
    public static final Logger f4482c0 = Logger.getLogger(f2.class.getName());

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f4483d0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: e0, reason: collision with root package name */
    public static final n7.f1 f4484e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final n7.f1 f4485f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final l2 f4486g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final s1 f4487h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final g0 f4488i0;
    public final HashSet A;
    public LinkedHashSet B;
    public final Object C;
    public final HashSet D;
    public final l0 E;
    public final b1.m F;
    public final AtomicBoolean G;
    public boolean H;
    public volatile boolean I;
    public final CountDownLatch J;
    public final u2 K;
    public final b1.m L;
    public final o M;
    public final m N;
    public final n7.x O;
    public final c2 P;
    public l2 Q;
    public boolean R;
    public final boolean S;
    public final f T;
    public final long U;
    public final long V;
    public final boolean W;
    public final n7.h X;
    public final e1 Y;
    public final c0.h Z;

    /* renamed from: a, reason: collision with root package name */
    public final n7.a0 f4489a;

    /* renamed from: a0, reason: collision with root package name */
    public final n3 f4490a0;

    /* renamed from: b, reason: collision with root package name */
    public final String f4491b;

    /* renamed from: b0, reason: collision with root package name */
    public int f4492b0;
    public final n7.b1 c;
    public final m5.a d;
    public final w4 e;

    /* renamed from: f, reason: collision with root package name */
    public final l f4493f;

    /* renamed from: g, reason: collision with root package name */
    public final d2 f4494g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f4495h;

    /* renamed from: i, reason: collision with root package name */
    public final n.p f4496i;

    /* renamed from: j, reason: collision with root package name */
    public final x1 f4497j;

    /* renamed from: k, reason: collision with root package name */
    public final x1 f4498k;

    /* renamed from: l, reason: collision with root package name */
    public final u2 f4499l;

    /* renamed from: m, reason: collision with root package name */
    public final n7.k1 f4500m;

    /* renamed from: n, reason: collision with root package name */
    public final n7.q f4501n;

    /* renamed from: o, reason: collision with root package name */
    public final n7.i f4502o;

    /* renamed from: p, reason: collision with root package name */
    public final u2 f4503p;

    /* renamed from: q, reason: collision with root package name */
    public final long f4504q;
    public final c0.h r;

    /* renamed from: s, reason: collision with root package name */
    public final u2 f4505s;
    public final n7.d t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4506u;

    /* renamed from: v, reason: collision with root package name */
    public h4 f4507v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public y1 f4508x;

    /* renamed from: y, reason: collision with root package name */
    public volatile n7.h0 f4509y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4510z;

    /* JADX WARN: Type inference failed for: r0v7, types: [o7.s1, java.lang.Object] */
    static {
        n7.f1 f1Var = n7.f1.f4201m;
        f1Var.h("Channel shutdownNow invoked");
        f4484e0 = f1Var.h("Channel shutdown invoked");
        f4485f0 = f1Var.h("Subchannel shutdown invoked");
        f4486g0 = new l2(null, new HashMap(), new HashMap(), null, null, null);
        f4487h0 = new Object();
        f4488i0 = new g0(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [n7.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, c0.h] */
    public f2(g2 g2Var, p7.g gVar, u2 u2Var, n.p pVar, u2 u2Var2, ArrayList arrayList) {
        int i10;
        boolean z9;
        u2 u2Var3 = u2.d;
        n7.k1 k1Var = new n7.k1(new u1(this));
        this.f4500m = k1Var;
        ?? obj = new Object();
        obj.f435b = new ArrayList();
        obj.c = n7.j.e;
        this.r = obj;
        this.A = new HashSet(16, 0.75f);
        this.C = new Object();
        this.D = new HashSet(1, 0.75f);
        this.F = new b1.m(this);
        this.G = new AtomicBoolean(false);
        this.J = new CountDownLatch(1);
        this.f4492b0 = 1;
        this.Q = f4486g0;
        this.R = false;
        this.T = new f(1);
        this.X = n7.o.e;
        n.p pVar2 = new n.p(4, this);
        this.Y = new e1(this, 1);
        this.Z = new c0.h(this);
        String str = g2Var.f4519g;
        o4.b.i(str, TypedValues.AttributesType.S_TARGET);
        this.f4491b = str;
        n7.a0 a0Var = new n7.a0(n7.a0.d.incrementAndGet(), "Channel", str);
        this.f4489a = a0Var;
        this.f4499l = u2Var3;
        n.p pVar3 = g2Var.f4517b;
        o4.b.i(pVar3, "executorPool");
        this.f4496i = pVar3;
        Executor executor = (Executor) s4.a((r4) pVar3.c);
        o4.b.i(executor, "executor");
        this.f4495h = executor;
        n.p pVar4 = g2Var.c;
        o4.b.i(pVar4, "offloadExecutorPool");
        x1 x1Var = new x1(pVar4);
        this.f4498k = x1Var;
        l lVar = new l(gVar, x1Var);
        this.f4493f = lVar;
        d2 d2Var = new d2(gVar.e);
        this.f4494g = d2Var;
        o oVar = new o(a0Var, u2Var3.q(), ai.onnxruntime.a.m("Channel for '", str, "'"));
        this.M = oVar;
        m mVar = new m(oVar, u2Var3);
        this.N = mVar;
        h3 h3Var = y0.f4785m;
        boolean z10 = g2Var.f4528p;
        this.W = z10;
        w4 w4Var = new w4(g2Var.f4520h);
        this.e = w4Var;
        n7.b1 b1Var = g2Var.e;
        this.c = b1Var;
        i4 i4Var = new i4(z10, g2Var.f4524l, g2Var.f4525m, w4Var);
        int i11 = g2Var.f4534y.f5034a.f5051h;
        int c = com.bumptech.glide.g.c(i11);
        if (c != 0) {
            if (c == 1) {
                i10 = 80;
            } else {
                j1.i.e(kotlin.collections.unsigned.a.h(i11).concat(" not handled"));
                i10 = 0;
            }
        } else {
            i10 = 443;
        }
        Integer valueOf = Integer.valueOf(i10);
        h3Var.getClass();
        m5.a aVar = new m5.a(valueOf, h3Var, k1Var, i4Var, d2Var, mVar, x1Var);
        this.d = aVar;
        lVar.f4597b.getClass();
        this.f4507v = i(str, b1Var, aVar, Collections.singleton(InetSocketAddress.class));
        this.f4497j = new x1(pVar);
        l0 l0Var = new l0(executor, k1Var);
        this.E = l0Var;
        l0Var.b(pVar2);
        this.f4505s = u2Var;
        boolean z11 = g2Var.r;
        this.S = z11;
        c2 c2Var = new c2(this, this.f4507v.e());
        this.P = c2Var;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            c2Var = new n7.f(c2Var, (u7.g) obj2);
        }
        this.t = c2Var;
        this.f4506u = new ArrayList(g2Var.f4518f);
        o4.b.i(u2Var2, "stopwatchSupplier");
        this.f4503p = u2Var2;
        long j10 = g2Var.f4523k;
        if (j10 == -1) {
            this.f4504q = j10;
        } else {
            if (j10 >= g2.B) {
                z9 = true;
            } else {
                z9 = false;
            }
            o4.b.g(z9, "invalid idleTimeoutMillis %s", j10);
            this.f4504q = g2Var.f4523k;
        }
        this.f4490a0 = new n3(new com.bumptech.glide.m(14, this), k1Var, lVar.f4597b.e, (i4.f) u2Var2.r());
        n7.q qVar = g2Var.f4521i;
        o4.b.i(qVar, "decompressorRegistry");
        this.f4501n = qVar;
        n7.i iVar = g2Var.f4522j;
        o4.b.i(iVar, "compressorRegistry");
        this.f4502o = iVar;
        this.V = g2Var.f4526n;
        this.U = g2Var.f4527o;
        this.K = new u2(16);
        this.L = new b1.m(11);
        n7.x xVar = g2Var.f4529q;
        xVar.getClass();
        this.O = xVar;
        if (!z11) {
            this.R = true;
        }
    }

    public static void g(f2 f2Var) {
        if (!f2Var.I && f2Var.G.get() && f2Var.A.isEmpty() && f2Var.D.isEmpty()) {
            f2Var.N.m(2, "Terminated");
            n.p pVar = f2Var.f4496i;
            s4.b((r4) pVar.c, f2Var.f4495h);
            x1 x1Var = f2Var.f4497j;
            synchronized (x1Var) {
                Executor executor = x1Var.c;
                if (executor != null) {
                    s4.b((r4) x1Var.f4769b.c, executor);
                    x1Var.c = null;
                }
            }
            x1 x1Var2 = f2Var.f4498k;
            synchronized (x1Var2) {
                Executor executor2 = x1Var2.c;
                if (executor2 != null) {
                    s4.b((r4) x1Var2.f4769b.c, executor2);
                    x1Var2.c = null;
                }
            }
            f2Var.f4493f.close();
            f2Var.I = true;
            f2Var.J.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Type inference failed for: r7v0, types: [i4.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o7.h4 i(java.lang.String r9, n7.b1 r10, m5.a r11, java.util.Collection r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.f2.i(java.lang.String, n7.b1, m5.a, java.util.Collection):o7.h4");
    }

    @Override // n7.z
    public final n7.a0 c() {
        return this.f4489a;
    }

    @Override // n7.d
    public final String e() {
        return this.t.e();
    }

    @Override // n7.d
    public final n7.t f(n7.x0 x0Var, n7.c cVar) {
        return this.t.f(x0Var, cVar);
    }

    public final void h() {
        this.f4500m.d();
        if (!this.G.get() && !this.f4510z) {
            if (!((Set) this.Y.f3353b).isEmpty()) {
                this.f4490a0.f4623f = false;
            } else {
                j();
            }
            if (this.f4508x == null) {
                this.N.m(2, "Exiting idle mode");
                y1 y1Var = new y1(this);
                w4 w4Var = this.e;
                w4Var.getClass();
                y1Var.f4790b = new b1.m(w4Var, y1Var);
                this.f4508x = y1Var;
                this.f4507v.A(new z1(this, y1Var, this.f4507v));
                this.w = true;
            }
        }
    }

    public final void j() {
        long j10 = this.f4504q;
        if (j10 == -1) {
            return;
        }
        n3 n3Var = this.f4490a0;
        n3Var.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
        long a10 = n3Var.d.a() + nanos;
        n3Var.f4623f = true;
        if (a10 - n3Var.e < 0 || n3Var.f4624g == null) {
            ScheduledFuture scheduledFuture = n3Var.f4624g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            n3Var.f4624g = n3Var.f4621a.schedule(new m3(n3Var, 1), nanos, TimeUnit.NANOSECONDS);
        }
        n3Var.e = a10;
    }

    public final void k(boolean z9) {
        boolean z10;
        this.f4500m.d();
        if (z9) {
            o4.b.m(this.w, "nameResolver is not started");
            if (this.f4508x != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            o4.b.m(z10, "lbHelper is null");
        }
        h4 h4Var = this.f4507v;
        if (h4Var != null) {
            h4Var.z();
            this.w = false;
            if (z9) {
                String str = this.f4491b;
                n7.b1 b1Var = this.c;
                m5.a aVar = this.d;
                this.f4493f.f4597b.getClass();
                this.f4507v = i(str, b1Var, aVar, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f4507v = null;
            }
        }
        y1 y1Var = this.f4508x;
        if (y1Var != null) {
            b1.m mVar = y1Var.f4790b;
            ((n7.j0) mVar.d).f();
            mVar.d = null;
            this.f4508x = null;
        }
        this.f4509y = null;
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.b(this.f4489a.c, "logId");
        t.c(this.f4491b, TypedValues.AttributesType.S_TARGET);
        return t.toString();
    }
}
