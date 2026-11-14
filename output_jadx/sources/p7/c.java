package p7;

import java.io.IOException;
import java.net.Socket;
import l9.e0;
import l9.j0;
import o7.m4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c implements e0 {
    public final m4 d;
    public final n e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5021f;

    /* renamed from: j, reason: collision with root package name */
    public e0 f5025j;

    /* renamed from: k, reason: collision with root package name */
    public Socket f5026k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5027l;

    /* renamed from: m, reason: collision with root package name */
    public int f5028m;

    /* renamed from: n, reason: collision with root package name */
    public int f5029n;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5020b = new Object();
    public final l9.l c = new Object();

    /* renamed from: g, reason: collision with root package name */
    public boolean f5022g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5023h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5024i = false;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l9.l] */
    public c(m4 m4Var, n nVar) {
        o4.b.i(m4Var, "executor");
        this.d = m4Var;
        this.e = nVar;
        this.f5021f = 10000;
    }

    public final void b(e0 e0Var, Socket socket) {
        boolean z9;
        if (this.f5025j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "AsyncSink's becomeConnected should only be called once.");
        o4.b.i(e0Var, "sink");
        this.f5025j = e0Var;
        this.f5026k = socket;
    }

    @Override // l9.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5024i) {
            return;
        }
        this.f5024i = true;
        this.d.execute(new com.bumptech.glide.m(23, this));
    }

    @Override // l9.e0, java.io.Flushable
    public final void flush() {
        if (!this.f5024i) {
            w7.b.c();
            try {
                synchronized (this.f5020b) {
                    if (this.f5023h) {
                        w7.b.f6413a.getClass();
                        return;
                    }
                    this.f5023h = true;
                    this.d.execute(new a(this, 1));
                    w7.b.f6413a.getClass();
                    return;
                }
            } catch (Throwable th) {
                try {
                    w7.b.f6413a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        n0.b.A("closed");
    }

    @Override // l9.e0
    public final j0 timeout() {
        return j0.NONE;
    }

    @Override // l9.e0
    public final void write(l9.l lVar, long j10) {
        o4.b.i(lVar, "source");
        if (!this.f5024i) {
            w7.b.c();
            try {
                synchronized (this.f5020b) {
                    try {
                        this.c.write(lVar, j10);
                        int i10 = this.f5029n + this.f5028m;
                        this.f5029n = i10;
                        boolean z9 = false;
                        this.f5028m = 0;
                        if (!this.f5027l && i10 > this.f5021f) {
                            this.f5027l = true;
                            z9 = true;
                        } else {
                            if (!this.f5022g && !this.f5023h && this.c.y() > 0) {
                                this.f5022g = true;
                            }
                            w7.b.f6413a.getClass();
                            return;
                        }
                        if (z9) {
                            try {
                                this.f5026k.close();
                            } catch (IOException e) {
                                this.e.n(e);
                            }
                            w7.b.f6413a.getClass();
                            return;
                        }
                        this.d.execute(new a(this, 0));
                        w7.b.f6413a.getClass();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    w7.b.f6413a.getClass();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        n0.b.A("closed");
    }
}
