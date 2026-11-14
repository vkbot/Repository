package o7;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends n7.t {

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f4700s = Logger.getLogger(t.class.getName());
    public static final double t;
    public final n7.x0 d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4701f;

    /* renamed from: g, reason: collision with root package name */
    public final b1.m f4702g;

    /* renamed from: h, reason: collision with root package name */
    public final n7.n f4703h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ScheduledFuture f4704i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4705j;

    /* renamed from: k, reason: collision with root package name */
    public n7.c f4706k;

    /* renamed from: l, reason: collision with root package name */
    public u f4707l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f4708m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4709n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4710o;

    /* renamed from: p, reason: collision with root package name */
    public final c0.h f4711p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f4712q;
    public n7.q r = n7.q.d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        t = 1000000000 * 1.0d;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public t(n7.x0 x0Var, Executor executor, n7.c cVar, c0.h hVar, ScheduledExecutorService scheduledExecutorService, b1.m mVar) {
        n7.i iVar = n7.i.f4211b;
        this.d = x0Var;
        String str = x0Var.f4256b;
        System.identityHashCode(this);
        w7.b.f6413a.getClass();
        if (executor == m4.n.f3932b) {
            this.e = new Object();
            this.f4701f = true;
        } else {
            this.e = new m4(executor);
            this.f4701f = false;
        }
        this.f4702g = mVar;
        this.f4703h = n7.n.b();
        n7.w0 w0Var = x0Var.f4255a;
        this.f4705j = w0Var == n7.w0.f4252b || w0Var == n7.w0.c;
        this.f4706k = cVar;
        this.f4711p = hVar;
        this.f4712q = scheduledExecutorService;
    }

    @Override // n7.t
    public final void a(String str, Throwable th) {
        w7.b.c();
        try {
            w7.b.a();
            r(str, th);
            w7.b.f6413a.getClass();
        } catch (Throwable th2) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // n7.t
    public final void g() {
        boolean z9;
        w7.b.c();
        try {
            w7.b.a();
            if (this.f4707l != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            o4.b.m(z9, "Not started");
            o4.b.m(!this.f4709n, "call was cancelled");
            o4.b.m(!this.f4710o, "call already half-closed");
            this.f4710o = true;
            this.f4707l.i();
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // n7.t
    public final void k() {
        boolean z9;
        w7.b.c();
        try {
            w7.b.a();
            if (this.f4707l != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            o4.b.m(z9, "Not started");
            this.f4707l.request();
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // n7.t
    public final void m(y5.g gVar) {
        w7.b.c();
        try {
            w7.b.a();
            t(gVar);
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // n7.t
    public final void o(n7.e eVar, n7.v0 v0Var) {
        w7.b.c();
        try {
            w7.b.a();
            u(eVar, v0Var);
            w7.b.f6413a.getClass();
        } catch (Throwable th) {
            try {
                w7.b.f6413a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void r(String str, Throwable th) {
        n7.f1 h2;
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f4700s.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f4709n) {
            return;
        }
        this.f4709n = true;
        try {
            if (this.f4707l != null) {
                n7.f1 f1Var = n7.f1.f4194f;
                if (str != null) {
                    h2 = f1Var.h(str);
                } else {
                    h2 = f1Var.h("Call cancelled without message");
                }
                if (th != null) {
                    h2 = h2.g(th);
                }
                this.f4707l.h(h2);
            }
            s();
        } catch (Throwable th2) {
            s();
            throw th2;
        }
    }

    public final void s() {
        this.f4703h.getClass();
        ScheduledFuture scheduledFuture = this.f4704i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void t(y5.g gVar) {
        boolean z9;
        if (this.f4707l != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "Not started");
        o4.b.m(!this.f4709n, "call was cancelled");
        o4.b.m(!this.f4710o, "call was half-closed");
        try {
            u uVar = this.f4707l;
            if (uVar instanceof v1) {
                ((v1) uVar).t(gVar);
            } else {
                t7.b bVar = this.d.d;
                bVar.getClass();
                uVar.f(new t7.a(gVar, bVar.f5828a));
            }
            if (!this.f4705j) {
                this.f4707l.flush();
            }
        } catch (Error e) {
            this.f4707l.h(n7.f1.f4194f.h("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e6) {
            this.f4707l.h(n7.f1.f4194f.g(e6).h("Failed to stream message"));
        }
    }

    public final String toString() {
        com.bumptech.glide.manager.s t3 = com.bumptech.glide.c.t(this);
        t3.c(this.d, "method");
        return t3.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0058, code lost:
    
        if ((r14.c - r13.c) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(n7.e r20, n7.v0 r21) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.t.u(n7.e, n7.v0):void");
    }
}
