package p7;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import l9.g0;
import l9.z;
import n7.a0;
import n7.f1;
import n7.g1;
import n7.v0;
import n7.w0;
import n7.x0;
import o7.c0;
import o7.c1;
import o7.d1;
import o7.e1;
import o7.m2;
import o7.m4;
import o7.o1;
import o7.p1;
import o7.p4;
import o7.t4;
import o7.u2;
import o7.w4;
import o7.y0;
import org.apache.commons.net.SocketClient;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n implements c0 {
    public static final Map P;
    public static final Logger Q;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public int C;
    public final LinkedList D;
    public final q7.c E;
    public p1 F;
    public boolean G;
    public long H;
    public long I;
    public final com.bumptech.glide.m J;
    public final int K;
    public final w4 L;
    public final e1 M;
    public final n7.u N;
    public final int O;

    /* renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f5071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5072b;
    public final String c;
    public final Random d;
    public final u2 e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5073f;

    /* renamed from: g, reason: collision with root package name */
    public final r7.j f5074g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.manager.t f5075h;

    /* renamed from: i, reason: collision with root package name */
    public d f5076i;

    /* renamed from: j, reason: collision with root package name */
    public b7.p f5077j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5078k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f5079l;

    /* renamed from: m, reason: collision with root package name */
    public int f5080m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f5081n;

    /* renamed from: o, reason: collision with root package name */
    public final Executor f5082o;

    /* renamed from: p, reason: collision with root package name */
    public final m4 f5083p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f5084q;
    public final int r;

    /* renamed from: s, reason: collision with root package name */
    public int f5085s;
    public m t;

    /* renamed from: u, reason: collision with root package name */
    public n7.b f5086u;

    /* renamed from: v, reason: collision with root package name */
    public f1 f5087v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public d1 f5088x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5089y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5090z;

    static {
        EnumMap enumMap = new EnumMap(r7.a.class);
        f1 f1Var = f1.f4200l;
        enumMap.put((EnumMap) r7.a.NO_ERROR, (r7.a) f1Var.h("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) r7.a.PROTOCOL_ERROR, (r7.a) f1Var.h("Protocol error"));
        enumMap.put((EnumMap) r7.a.INTERNAL_ERROR, (r7.a) f1Var.h("Internal error"));
        enumMap.put((EnumMap) r7.a.FLOW_CONTROL_ERROR, (r7.a) f1Var.h("Flow control error"));
        enumMap.put((EnumMap) r7.a.STREAM_CLOSED, (r7.a) f1Var.h("Stream closed"));
        enumMap.put((EnumMap) r7.a.FRAME_TOO_LARGE, (r7.a) f1Var.h("Frame too large"));
        enumMap.put((EnumMap) r7.a.REFUSED_STREAM, (r7.a) f1.f4201m.h("Refused stream"));
        enumMap.put((EnumMap) r7.a.CANCEL, (r7.a) f1.f4194f.h("Cancelled"));
        enumMap.put((EnumMap) r7.a.COMPRESSION_ERROR, (r7.a) f1Var.h("Compression error"));
        enumMap.put((EnumMap) r7.a.CONNECT_ERROR, (r7.a) f1Var.h("Connect error"));
        enumMap.put((EnumMap) r7.a.ENHANCE_YOUR_CALM, (r7.a) f1.f4198j.h("Enhance your calm"));
        enumMap.put((EnumMap) r7.a.INADEQUATE_SECURITY, (r7.a) f1.f4197i.h("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(n.class.getName());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r7.j, java.lang.Object] */
    public n(g gVar, InetSocketAddress inetSocketAddress, String str, n7.b bVar, n7.u uVar, com.bumptech.glide.m mVar) {
        u2 u2Var = y0.r;
        ?? obj = new Object();
        this.d = new Random();
        Object obj2 = new Object();
        this.f5078k = obj2;
        this.f5081n = new HashMap();
        this.C = 0;
        this.D = new LinkedList();
        this.M = new e1(this, 2);
        this.O = 30000;
        o4.b.i(inetSocketAddress, "address");
        this.f5071a = inetSocketAddress;
        this.f5072b = str;
        this.r = gVar.f5039i;
        this.f5073f = gVar.f5043m;
        Executor executor = gVar.c;
        o4.b.i(executor, "executor");
        this.f5082o = executor;
        this.f5083p = new m4(gVar.c);
        ScheduledExecutorService scheduledExecutorService = gVar.e;
        o4.b.i(scheduledExecutorService, "scheduledExecutorService");
        this.f5084q = scheduledExecutorService;
        this.f5080m = 3;
        this.A = SocketFactory.getDefault();
        this.B = gVar.f5037g;
        q7.c cVar = gVar.f5038h;
        o4.b.i(cVar, "connectionSpec");
        this.E = cVar;
        o4.b.i(u2Var, "stopwatchFactory");
        this.e = u2Var;
        this.f5074g = obj;
        this.c = "grpc-java-okhttp/1.62.2";
        this.N = uVar;
        this.J = mVar;
        this.K = gVar.f5044n;
        gVar.f5036f.getClass();
        this.L = new w4();
        this.f5079l = a0.a(n.class, inetSocketAddress.toString());
        n7.b bVar2 = n7.b.f4157b;
        n7.a aVar = p4.f4665b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(aVar, bVar);
        for (Map.Entry entry : bVar2.f4158a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((n7.a) entry.getKey(), entry.getValue());
            }
        }
        this.f5086u = new n7.b(identityHashMap);
        synchronized (obj2) {
        }
    }

    public static void e(n nVar, String str) {
        r7.a aVar = r7.a.PROTOCOL_ERROR;
        nVar.r(0, aVar, v(aVar).b(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, l9.l] */
    public static Socket f(n nVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        Socket createSocket;
        String str3;
        int i10;
        String str4;
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = nVar.A;
            if (address != null) {
                createSocket = socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            } else {
                createSocket = socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            }
            try {
                createSocket.setTcpNoDelay(true);
                createSocket.setSoTimeout(nVar.O);
                g0 h2 = l9.b.h(createSocket);
                z a10 = l9.b.a(l9.b.g(createSocket));
                l.d g10 = nVar.g(inetSocketAddress, str, str2);
                n.p pVar = (n.p) g10.d;
                s7.a aVar = (s7.a) g10.c;
                Locale locale = Locale.US;
                a10.A("CONNECT " + aVar.f5726a + ":" + aVar.f5727b + " HTTP/1.1");
                a10.A(SocketClient.NETASCII_EOL);
                String[] strArr = (String[]) pVar.c;
                String[] strArr2 = (String[]) pVar.c;
                int length = strArr.length / 2;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    if (i12 >= 0 && i12 < strArr2.length) {
                        str3 = strArr2[i12];
                        a10.A(str3);
                        a10.A(": ");
                        i10 = i12 + 1;
                        if (i10 >= 0 && i10 < strArr2.length) {
                            str4 = strArr2[i10];
                            a10.A(str4);
                            a10.A(SocketClient.NETASCII_EOL);
                        }
                        str4 = null;
                        a10.A(str4);
                        a10.A(SocketClient.NETASCII_EOL);
                    }
                    str3 = null;
                    a10.A(str3);
                    a10.A(": ");
                    i10 = i12 + 1;
                    if (i10 >= 0) {
                        str4 = strArr2[i10];
                        a10.A(str4);
                        a10.A(SocketClient.NETASCII_EOL);
                    }
                    str4 = null;
                    a10.A(str4);
                    a10.A(SocketClient.NETASCII_EOL);
                }
                a10.A(SocketClient.NETASCII_EOL);
                a10.flush();
                c7.l b10 = c7.l.b(o(h2));
                int i13 = b10.f575b;
                do {
                } while (!o(h2).equals(""));
                if (i13 >= 200 && i13 < 300) {
                    createSocket.setSoTimeout(0);
                    return createSocket;
                }
                ?? obj = new Object();
                try {
                    createSocket.shutdownOutput();
                    h2.read(obj, 1024L);
                } catch (IOException e) {
                    obj.u0("Unable to read body: " + e.toString());
                }
                try {
                    createSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new g1(f1.f4201m.h("Response returned from proxy was not successful (expected 2xx, got " + i13 + " " + ((String) b10.d) + "). Response body:\n" + obj.h0()));
            } catch (IOException e6) {
                e = e6;
                socket = createSocket;
                if (socket != null) {
                    y0.b(socket);
                }
                throw new g1(f1.f4201m.h("Failed trying to connect with proxy").g(e));
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l9.l] */
    public static String o(g0 g0Var) {
        long j10;
        ?? obj = new Object();
        do {
            long read = g0Var.read(obj, 1L);
            j10 = obj.c;
            if (read == -1) {
                throw new EOFException("\\n not found: " + obj.f(j10).d());
            }
        } while (obj.V(j10 - 1) != 10);
        return obj.p(Long.MAX_VALUE);
    }

    public static f1 v(r7.a aVar) {
        f1 f1Var = (f1) P.get(aVar);
        if (f1Var != null) {
            return f1Var;
        }
        return f1.f4195g.h("Unknown http2 error code: " + aVar.f5414b);
    }

    @Override // o7.n2
    public final void a(f1 f1Var) {
        synchronized (this.f5078k) {
            try {
                if (this.f5087v != null) {
                    return;
                }
                this.f5087v = f1Var;
                this.f5075h.k(f1Var);
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.n2
    public final Runnable b(m2 m2Var) {
        this.f5075h = (com.bumptech.glide.manager.t) m2Var;
        if (this.G) {
            p1 p1Var = new p1(new n.p(3, this), this.f5084q, this.H, this.I);
            this.F = p1Var;
            synchronized (p1Var) {
            }
        }
        c cVar = new c(this.f5083p, this);
        r7.j jVar = this.f5074g;
        z zVar = new z(cVar);
        jVar.getClass();
        b bVar = new b(cVar, new r7.i(zVar));
        synchronized (this.f5078k) {
            d dVar = new d(this, bVar);
            this.f5076i = dVar;
            this.f5077j = new b7.p(this, dVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f5083p.execute(new c3.e(this, countDownLatch, cVar, 5));
        try {
            p();
            countDownLatch.countDown();
            this.f5083p.execute(new com.bumptech.glide.m(25, this));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // n7.z
    public final a0 c() {
        return this.f5079l;
    }

    @Override // o7.x
    public final o7.u d(x0 x0Var, v0 v0Var, n7.c cVar, n7.e[] eVarArr) {
        k kVar;
        o4.b.i(x0Var, "method");
        o4.b.i(v0Var, "headers");
        n7.b bVar = this.f5086u;
        t4 t4Var = new t4(eVarArr);
        for (n7.e eVar : eVarArr) {
            eVar.C(bVar, v0Var);
        }
        synchronized (this.f5078k) {
            kVar = new k(x0Var, v0Var, this.f5076i, this, this.f5077j, this.f5078k, this.r, this.f5073f, this.f5072b, this.c, t4Var, this.L, cVar);
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0134 A[ADDED_TO_REGION, EDGE_INSN: B:133:0x0134->B:54:0x0134 BREAK  A[LOOP:2: B:30:0x0090->B:52:0x015f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019f  */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, l9.l] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, l9.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.d g(java.net.InetSocketAddress r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.n.g(java.net.InetSocketAddress, java.lang.String, java.lang.String):l.d");
    }

    @Override // o7.c0
    public final n7.b getAttributes() {
        return this.f5086u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i10, f1 f1Var, o7.v vVar, boolean z9, r7.a aVar, v0 v0Var) {
        synchronized (this.f5078k) {
            try {
                k kVar = (k) this.f5081n.remove(Integer.valueOf(i10));
                if (kVar != null) {
                    if (aVar != null) {
                        this.f5076i.S(i10, r7.a.CANCEL);
                    }
                    if (f1Var != null) {
                        kVar.f5066m.g(f1Var, vVar, z9, v0Var != null ? v0Var : new Object());
                    }
                    if (!s()) {
                        u();
                        m(kVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v[] i() {
        v[] vVarArr;
        v vVar;
        synchronized (this.f5078k) {
            vVarArr = new v[this.f5081n.size()];
            Iterator it = this.f5081n.values().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int i11 = i10 + 1;
                j jVar = ((k) it.next()).f5066m;
                synchronized (jVar.w) {
                    vVar = jVar.J;
                }
                vVarArr[i10] = vVar;
                i10 = i11;
            }
        }
        return vVarArr;
    }

    public final int j() {
        URI a10 = y0.a(this.f5072b);
        if (a10.getPort() != -1) {
            return a10.getPort();
        }
        return this.f5071a.getPort();
    }

    public final g1 k() {
        synchronized (this.f5078k) {
            try {
                f1 f1Var = this.f5087v;
                if (f1Var != null) {
                    return new g1(f1Var);
                }
                return new g1(f1.f4201m.h("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(int i10) {
        boolean z9;
        synchronized (this.f5078k) {
            if (i10 < this.f5080m) {
                z9 = true;
                if ((i10 & 1) == 1) {
                }
            }
            z9 = false;
        }
        return z9;
    }

    public final void m(k kVar) {
        if (this.f5090z && this.D.isEmpty() && this.f5081n.isEmpty()) {
            this.f5090z = false;
            p1 p1Var = this.F;
            if (p1Var != null) {
                synchronized (p1Var) {
                    int i10 = p1Var.d;
                    if (i10 == 2 || i10 == 3) {
                        p1Var.d = 1;
                    }
                    if (p1Var.d == 4) {
                        p1Var.d = 5;
                    }
                }
            }
        }
        if (kVar.d) {
            this.M.d(kVar, false);
        }
    }

    public final void n(Exception exc) {
        r(0, r7.a.INTERNAL_ERROR, f1.f4201m.g(exc));
    }

    public final void p() {
        synchronized (this.f5078k) {
            try {
                d dVar = this.f5076i;
                dVar.getClass();
                try {
                    dVar.c.c();
                } catch (IOException e) {
                    dVar.f5030b.n(e);
                }
                j.i iVar = new j.i(4);
                iVar.c(7, this.f5073f);
                d dVar2 = this.f5076i;
                dVar2.d.F(2, iVar);
                try {
                    dVar2.c.c0(iVar);
                } catch (IOException e6) {
                    dVar2.f5030b.n(e6);
                }
                if (this.f5073f > 65535) {
                    this.f5076i.V(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [n7.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [n7.v0, java.lang.Object] */
    public final void q(f1 f1Var) {
        a(f1Var);
        synchronized (this.f5078k) {
            try {
                Iterator it = this.f5081n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((k) entry.getValue()).f5066m.h(f1Var, false, new Object());
                    m((k) entry.getValue());
                }
                for (k kVar : this.D) {
                    kVar.f5066m.g(f1Var, o7.v.e, true, new Object());
                    m(kVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [n7.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [n7.v0, java.lang.Object] */
    public final void r(int i10, r7.a aVar, f1 f1Var) {
        synchronized (this.f5078k) {
            try {
                if (this.f5087v == null) {
                    this.f5087v = f1Var;
                    this.f5075h.k(f1Var);
                }
                if (aVar != null && !this.w) {
                    this.w = true;
                    this.f5076i.c(aVar, new byte[0]);
                }
                Iterator it = this.f5081n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i10) {
                        it.remove();
                        ((k) entry.getValue()).f5066m.g(f1Var, o7.v.c, false, new Object());
                        m((k) entry.getValue());
                    }
                }
                for (k kVar : this.D) {
                    kVar.f5066m.g(f1Var, o7.v.e, true, new Object());
                    m(kVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s() {
        boolean z9 = false;
        while (true) {
            LinkedList linkedList = this.D;
            if (linkedList.isEmpty() || this.f5081n.size() >= this.C) {
                break;
            }
            t((k) linkedList.poll());
            z9 = true;
        }
        return z9;
    }

    public final void t(k kVar) {
        boolean z9;
        boolean z10;
        boolean f8;
        if (kVar.f5066m.K == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "StreamId already assigned");
        this.f5081n.put(Integer.valueOf(this.f5080m), kVar);
        if (!this.f5090z) {
            this.f5090z = true;
            p1 p1Var = this.F;
            if (p1Var != null) {
                p1Var.b();
            }
        }
        if (kVar.d) {
            this.M.d(kVar, true);
        }
        j jVar = kVar.f5066m;
        int i10 = this.f5080m;
        if (jVar.K == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jVar.K = i10;
            b7.p pVar = jVar.F;
            jVar.J = new v(pVar, i10, pVar.f420b, jVar);
            j jVar2 = jVar.L.f5066m;
            if (jVar2.f4420j != null) {
                synchronized (jVar2.f4415b) {
                    o4.b.m(!jVar2.f4416f, "Already allocated");
                    jVar2.f4416f = true;
                }
                synchronized (jVar2.f4415b) {
                    f8 = jVar2.f();
                }
                if (f8) {
                    jVar2.f4420j.j();
                }
                w4 w4Var = jVar2.c;
                w4Var.getClass();
                ((u2) w4Var.c).q();
                if (jVar.H) {
                    d dVar = jVar.E;
                    boolean z11 = jVar.L.f5069p;
                    int i11 = jVar.K;
                    ArrayList arrayList = jVar.f5058x;
                    dVar.getClass();
                    try {
                        r7.i iVar = dVar.c.f5019b;
                        synchronized (iVar) {
                            if (!iVar.f5436f) {
                                iVar.c(z11, i11, arrayList);
                            } else {
                                throw new IOException("closed");
                            }
                        }
                    } catch (IOException e) {
                        dVar.f5030b.n(e);
                    }
                    for (n7.e eVar : jVar.L.f5064k.f4728a) {
                        eVar.s();
                    }
                    jVar.f5058x = null;
                    l9.l lVar = jVar.f5059y;
                    if (lVar.c > 0) {
                        jVar.F.c(jVar.f5060z, jVar.J, lVar, jVar.A);
                    }
                    jVar.H = false;
                }
                w0 w0Var = kVar.f5062i.f4255a;
                if ((w0Var != w0.f4252b && w0Var != w0.c) || kVar.f5069p) {
                    this.f5076i.flush();
                }
                int i12 = this.f5080m;
                if (i12 >= 2147483645) {
                    this.f5080m = Integer.MAX_VALUE;
                    r(Integer.MAX_VALUE, r7.a.NO_ERROR, f1.f4201m.h("Stream ids exhausted"));
                    return;
                } else {
                    this.f5080m = i12 + 2;
                    return;
                }
            }
            throw new IllegalStateException();
        }
        j1.i.l(e3.d.l("the stream has been started with id %s", Integer.valueOf(i10)));
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.b(this.f5079l.c, "logId");
        t.c(this.f5071a, "address");
        return t.toString();
    }

    public final void u() {
        if (this.f5087v != null && this.f5081n.isEmpty() && this.D.isEmpty() && !this.f5089y) {
            this.f5089y = true;
            p1 p1Var = this.F;
            if (p1Var != null) {
                synchronized (p1Var) {
                    try {
                        if (p1Var.d != 6) {
                            p1Var.d = 6;
                            ScheduledFuture scheduledFuture = p1Var.e;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            ScheduledFuture scheduledFuture2 = p1Var.f4655f;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(false);
                                p1Var.f4655f = null;
                            }
                        }
                    } finally {
                    }
                }
            }
            d1 d1Var = this.f5088x;
            if (d1Var != null) {
                g1 k6 = k();
                synchronized (d1Var) {
                    try {
                        if (!d1Var.d) {
                            d1Var.d = true;
                            d1Var.e = k6;
                            LinkedHashMap linkedHashMap = d1Var.c;
                            d1Var.c = null;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                try {
                                    ((Executor) entry.getValue()).execute(new c1((o1) entry.getKey(), k6));
                                } catch (Throwable th) {
                                    d1.f4453g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                }
                            }
                        }
                    } finally {
                    }
                }
                this.f5088x = null;
            }
            if (!this.w) {
                this.w = true;
                this.f5076i.c(r7.a.NO_ERROR, new byte[0]);
            }
            this.f5076i.close();
        }
    }
}
