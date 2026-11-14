package p7;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
import o7.c0;
import o7.j1;
import o7.r4;
import o7.s4;
import o7.u2;
import o7.y;
import o7.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: b, reason: collision with root package name */
    public final n.p f5035b;
    public final Executor c;
    public final n.p d;
    public final ScheduledExecutorService e;

    /* renamed from: f, reason: collision with root package name */
    public final u2 f5036f;

    /* renamed from: g, reason: collision with root package name */
    public final SSLSocketFactory f5037g;

    /* renamed from: h, reason: collision with root package name */
    public final q7.c f5038h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5039i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5040j;

    /* renamed from: k, reason: collision with root package name */
    public final o7.e f5041k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5042l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5043m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5044n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5045o;

    public g(n.p pVar, n.p pVar2, SSLSocketFactory sSLSocketFactory, q7.c cVar, int i10, boolean z9, long j10, long j11, int i11, int i12, u2 u2Var) {
        this.f5035b = pVar;
        this.c = (Executor) s4.a((r4) pVar.c);
        this.d = pVar2;
        this.e = (ScheduledExecutorService) s4.a((r4) pVar2.c);
        this.f5037g = sSLSocketFactory;
        this.f5038h = cVar;
        this.f5039i = i10;
        this.f5040j = z9;
        this.f5041k = new o7.e(j10);
        this.f5042l = j11;
        this.f5043m = i11;
        this.f5044n = i12;
        o4.b.i(u2Var, "transportTracerFactory");
        this.f5036f = u2Var;
    }

    @Override // o7.z
    public final c0 I(SocketAddress socketAddress, y yVar, j1 j1Var) {
        if (!this.f5045o) {
            o7.e eVar = this.f5041k;
            long j10 = eVar.f4463b.get();
            n nVar = new n(this, (InetSocketAddress) socketAddress, yVar.f4774a, yVar.f4775b, yVar.c, new com.bumptech.glide.m(24, new o7.d(eVar, j10)));
            if (this.f5040j) {
                nVar.G = true;
                nVar.H = j10;
                nVar.I = this.f5042l;
            }
            return nVar;
        }
        j1.i.l("The transport factory is closed.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5045o) {
            return;
        }
        this.f5045o = true;
        s4.b((r4) this.f5035b.c, this.c);
        s4.b((r4) this.d.c, this.e);
    }
}
