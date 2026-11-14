package o7;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class q2 implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public b1 f4669b;
    public int c;
    public final t4 d;
    public final w4 e;

    /* renamed from: f, reason: collision with root package name */
    public n7.h f4670f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f4671g;

    /* renamed from: h, reason: collision with root package name */
    public int f4672h;

    /* renamed from: i, reason: collision with root package name */
    public int f4673i;

    /* renamed from: j, reason: collision with root package name */
    public int f4674j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4675k;

    /* renamed from: l, reason: collision with root package name */
    public b0 f4676l;

    /* renamed from: m, reason: collision with root package name */
    public b0 f4677m;

    /* renamed from: n, reason: collision with root package name */
    public long f4678n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4679o;

    /* renamed from: p, reason: collision with root package name */
    public int f4680p;

    /* renamed from: q, reason: collision with root package name */
    public int f4681q;
    public boolean r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f4682s;

    public q2(b1 b1Var, int i10, t4 t4Var, w4 w4Var) {
        n7.h hVar = n7.h.c;
        this.f4673i = 1;
        this.f4674j = 5;
        this.f4677m = new b0();
        this.f4679o = false;
        this.f4680p = -1;
        this.r = false;
        this.f4682s = false;
        this.f4669b = b1Var;
        this.f4670f = hVar;
        this.c = i10;
        this.d = t4Var;
        o4.b.i(w4Var, "transportTracer");
        this.e = w4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r8.f4673i == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r0.a(r3);
        r8.f4681q += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r8.f4673i == 2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S() {
        /*
            r8 = this;
            o7.t4 r0 = r8.d
            r1 = 2
            r2 = 0
            o7.b0 r3 = r8.f4676l     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L12
            o7.b0 r3 = new o7.b0     // Catch: java.lang.Throwable -> L10
            r3.<init>()     // Catch: java.lang.Throwable -> L10
            r8.f4676l = r3     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L5b
        L12:
            r3 = r2
        L13:
            int r4 = r8.f4674j     // Catch: java.lang.Throwable -> L48
            o7.b0 r5 = r8.f4676l     // Catch: java.lang.Throwable -> L48
            int r5 = r5.d     // Catch: java.lang.Throwable -> L48
            int r4 = r4 - r5
            if (r4 <= 0) goto L4d
            o7.b0 r5 = r8.f4677m     // Catch: java.lang.Throwable -> L48
            int r5 = r5.d     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L37
            if (r3 <= 0) goto L36
            o7.b1 r4 = r8.f4669b
            r4.a(r3)
            int r4 = r8.f4673i
            if (r4 != r1) goto L36
        L2d:
            long r4 = (long) r3
            r0.a(r4)
            int r0 = r8.f4681q
            int r0 = r0 + r3
            r8.f4681q = r0
        L36:
            return r2
        L37:
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + r4
            o7.b0 r5 = r8.f4676l     // Catch: java.lang.Throwable -> L48
            o7.b0 r6 = r8.f4677m     // Catch: java.lang.Throwable -> L48
            o7.c r4 = r6.S(r4)     // Catch: java.lang.Throwable -> L48
            r5.i0(r4)     // Catch: java.lang.Throwable -> L48
            goto L13
        L48:
            r2 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L5b
        L4d:
            r2 = 1
            if (r3 <= 0) goto L5a
            o7.b1 r4 = r8.f4669b
            r4.a(r3)
            int r4 = r8.f4673i
            if (r4 != r1) goto L5a
            goto L2d
        L5a:
            return r2
        L5b:
            if (r2 <= 0) goto L6f
            o7.b1 r4 = r8.f4669b
            r4.a(r2)
            int r4 = r8.f4673i
            if (r4 != r1) goto L6f
            long r4 = (long) r2
            r0.a(r4)
            int r0 = r8.f4681q
            int r0 = r0 + r2
            r8.f4681q = r0
        L6f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.q2.S():boolean");
    }

    public final void b() {
        String str;
        if (this.f4679o) {
            return;
        }
        boolean z9 = true;
        this.f4679o = true;
        while (!this.f4682s && this.f4678n > 0 && S()) {
            try {
                int c = com.bumptech.glide.g.c(this.f4673i);
                if (c != 0) {
                    if (c == 1) {
                        c();
                        this.f4678n--;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid state: ");
                        int i10 = this.f4673i;
                        if (i10 != 1) {
                            if (i10 != 2) {
                                str = "null";
                            } else {
                                str = "BODY";
                            }
                        } else {
                            str = "HEADER";
                        }
                        sb.append(str);
                        throw new AssertionError(sb.toString());
                    }
                } else {
                    y();
                }
            } catch (Throwable th) {
                this.f4679o = false;
                throw th;
            }
        }
        if (this.f4682s) {
            close();
            this.f4679o = false;
            return;
        }
        if (this.r) {
            if (this.f4677m.d != 0) {
                z9 = false;
            }
            if (z9) {
                close();
            }
        }
        this.f4679o = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [o7.i3, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o7.o2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [o7.i3, java.io.InputStream] */
    public final void c() {
        p2 p2Var;
        int i10 = this.f4680p;
        long j10 = this.f4681q;
        t4 t4Var = this.d;
        for (n7.e eVar : t4Var.f4728a) {
            eVar.i(i10, j10);
        }
        this.f4681q = 0;
        if (this.f4675k) {
            n7.h hVar = this.f4670f;
            if (hVar != n7.h.c) {
                try {
                    b0 b0Var = this.f4676l;
                    j3 j3Var = k3.f4596a;
                    ?? inputStream = new InputStream();
                    o4.b.i(b0Var, "buffer");
                    inputStream.f4552b = b0Var;
                    GZIPInputStream gZIPInputStream = inputStream;
                    switch (hVar.f4209b) {
                        case 0:
                            break;
                        default:
                            gZIPInputStream = new GZIPInputStream(inputStream);
                            break;
                    }
                    p2Var = new p2(gZIPInputStream, this.c, t4Var);
                } catch (IOException e) {
                    n0.b.w(e);
                    return;
                }
            } else {
                throw n7.f1.f4200l.h("Can't decode compressed gRPC message as compression not configured").a();
            }
        } else {
            long j11 = this.f4676l.d;
            for (n7.e eVar2 : t4Var.f4728a) {
                eVar2.k(j11);
            }
            b0 b0Var2 = this.f4676l;
            j3 j3Var2 = k3.f4596a;
            ?? inputStream2 = new InputStream();
            o4.b.i(b0Var2, "buffer");
            inputStream2.f4552b = b0Var2;
            p2Var = inputStream2;
        }
        this.f4676l.getClass();
        this.f4676l = null;
        b1 b1Var = this.f4669b;
        ?? obj = new Object();
        obj.f4631b = p2Var;
        b1Var.f4420j.k(obj);
        this.f4673i = 1;
        this.f4674j = 5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z9;
        if (isClosed()) {
            return;
        }
        b0 b0Var = this.f4676l;
        if (b0Var != null && b0Var.d > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            b0 b0Var2 = this.f4677m;
            if (b0Var2 != null) {
                b0Var2.close();
            }
            b0 b0Var3 = this.f4676l;
            if (b0Var3 != null) {
                b0Var3.close();
            }
            this.f4677m = null;
            this.f4676l = null;
            this.f4669b.c(z9);
        } catch (Throwable th) {
            this.f4677m = null;
            this.f4676l = null;
            throw th;
        }
    }

    public final boolean isClosed() {
        if (this.f4677m == null) {
            return true;
        }
        return false;
    }

    public final void y() {
        boolean z9;
        int e02 = this.f4676l.e0();
        if ((e02 & TelnetCommand.DONT) == 0) {
            if ((e02 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f4675k = z9;
            b0 b0Var = this.f4676l;
            b0Var.b(4);
            int e03 = b0Var.e0() | (b0Var.e0() << 24) | (b0Var.e0() << 16) | (b0Var.e0() << 8);
            this.f4674j = e03;
            if (e03 >= 0 && e03 <= this.c) {
                int i10 = this.f4680p + 1;
                this.f4680p = i10;
                for (n7.e eVar : this.d.f4728a) {
                    eVar.h(i10);
                }
                w4 w4Var = this.e;
                ((r1) w4Var.d).a();
                ((u2) w4Var.c).q();
                this.f4673i = 2;
                return;
            }
            n7.f1 f1Var = n7.f1.f4198j;
            Locale locale = Locale.US;
            throw f1Var.h("gRPC message exceeds maximum size " + this.c + ": " + e03).a();
        }
        throw n7.f1.f4200l.h("gRPC frame header malformed: reserved bits not zero").a();
    }
}
