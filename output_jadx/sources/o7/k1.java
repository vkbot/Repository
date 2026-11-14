package o7;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k1 implements n7.z {

    /* renamed from: a, reason: collision with root package name */
    public final n7.a0 f4577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4578b;
    public final u2 c;
    public final w4 d;
    public final z e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f4579f;

    /* renamed from: g, reason: collision with root package name */
    public final n7.x f4580g;

    /* renamed from: h, reason: collision with root package name */
    public final b1.m f4581h;

    /* renamed from: i, reason: collision with root package name */
    public final n7.e f4582i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4583j;

    /* renamed from: k, reason: collision with root package name */
    public final n7.k1 f4584k;

    /* renamed from: l, reason: collision with root package name */
    public final h1 f4585l;

    /* renamed from: m, reason: collision with root package name */
    public volatile List f4586m;

    /* renamed from: n, reason: collision with root package name */
    public r0 f4587n;

    /* renamed from: o, reason: collision with root package name */
    public final i4.f f4588o;

    /* renamed from: p, reason: collision with root package name */
    public l.d f4589p;

    /* renamed from: q, reason: collision with root package name */
    public l.d f4590q;
    public n2 r;

    /* renamed from: u, reason: collision with root package name */
    public g1 f4592u;

    /* renamed from: v, reason: collision with root package name */
    public volatile g1 f4593v;

    /* renamed from: x, reason: collision with root package name */
    public n7.f1 f4594x;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4591s = new ArrayList();
    public final e1 t = new e1(this, 0);
    public volatile n7.k w = n7.k.a(n7.j.e);

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, o7.h1] */
    public k1(List list, String str, u2 u2Var, l lVar, ScheduledExecutorService scheduledExecutorService, u2 u2Var2, n7.k1 k1Var, w4 w4Var, n7.x xVar, b1.m mVar, o oVar, n7.a0 a0Var, n7.e eVar, ArrayList arrayList) {
        o4.b.i(list, "addressGroups");
        o4.b.d("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o4.b.i(it.next(), "addressGroups contains null entry");
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f4586m = unmodifiableList;
        ?? obj = new Object();
        obj.f4538a = unmodifiableList;
        this.f4585l = obj;
        this.f4578b = str;
        this.c = u2Var;
        this.e = lVar;
        this.f4579f = scheduledExecutorService;
        this.f4588o = (i4.f) u2Var2.r();
        this.f4584k = k1Var;
        this.d = w4Var;
        this.f4580g = xVar;
        this.f4581h = mVar;
        o4.b.i(oVar, "channelTracer");
        o4.b.i(a0Var, "logId");
        this.f4577a = a0Var;
        o4.b.i(eVar, "channelLogger");
        this.f4582i = eVar;
        this.f4583j = arrayList;
    }

    public static void e(k1 k1Var, n7.j jVar) {
        k1Var.f4584k.d();
        k1Var.g(n7.k.a(jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [o7.j1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o7.y, java.lang.Object] */
    public static void f(k1 k1Var) {
        boolean z9;
        SocketAddress socketAddress;
        n7.u uVar;
        h1 h1Var = k1Var.f4585l;
        n7.k1 k1Var2 = k1Var.f4584k;
        k1Var2.d();
        if (k1Var.f4589p == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        o4.b.m(z9, "Should have no reconnectTask scheduled");
        if (h1Var.f4539b == 0 && h1Var.c == 0) {
            i4.f fVar = k1Var.f4588o;
            fVar.f2774a = false;
            fVar.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((n7.r) h1Var.f4538a.get(h1Var.f4539b)).f4239a.get(h1Var.c);
        if (socketAddress2 instanceof n7.u) {
            uVar = (n7.u) socketAddress2;
            socketAddress = uVar.c;
        } else {
            socketAddress = socketAddress2;
            uVar = null;
        }
        n7.b bVar = ((n7.r) h1Var.f4538a.get(h1Var.f4539b)).f4240b;
        String str = (String) bVar.f4158a.get(n7.r.d);
        ?? obj = new Object();
        obj.f4774a = "unknown-authority";
        obj.f4775b = n7.b.f4157b;
        if (str == null) {
            str = k1Var.f4578b;
        }
        o4.b.i(str, "authority");
        obj.f4774a = str;
        obj.f4775b = bVar;
        obj.c = uVar;
        ?? obj2 = new Object();
        obj2.f4558b = k1Var.f4577a;
        g1 g1Var = new g1(k1Var.e.I(socketAddress, obj, obj2), k1Var.f4581h);
        obj2.f4558b = g1Var.c();
        k1Var.f4592u = g1Var;
        k1Var.f4591s.add(g1Var);
        Runnable b10 = g1Var.b(new com.bumptech.glide.manager.t(k1Var, g1Var));
        if (b10 != null) {
            k1Var2.b(b10);
        }
        k1Var.f4582i.n(2, "Started transport {0}", obj2.f4558b);
    }

    public static String h(n7.f1 f1Var) {
        StringBuilder sb = new StringBuilder();
        n7.e1 e1Var = f1Var.f4204a;
        Throwable th = f1Var.c;
        sb.append(e1Var);
        String str = f1Var.f4205b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // n7.z
    public final n7.a0 c() {
        return this.f4577a;
    }

    public final void g(n7.k kVar) {
        boolean z9;
        this.f4584k.d();
        if (this.w.f4220a != kVar.f4220a) {
            if (this.w.f4220a != n7.j.f4215f) {
                z9 = true;
            } else {
                z9 = false;
            }
            o4.b.m(z9, "Cannot transition out of SHUTDOWN to " + kVar);
            this.w = kVar;
            ((n7.i0) this.d.c).a(kVar);
        }
    }

    public final String toString() {
        com.bumptech.glide.manager.s t = com.bumptech.glide.c.t(this);
        t.b(this.f4577a.c, "logId");
        t.c(this.f4586m, "addressGroups");
        return t.toString();
    }
}
