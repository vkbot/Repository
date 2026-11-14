package o7;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a3 extends n7.j0 {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f4392o = Logger.getLogger(a3.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final n7.e f4393f;

    /* renamed from: h, reason: collision with root package name */
    public h1 f4395h;

    /* renamed from: k, reason: collision with root package name */
    public l.d f4398k;

    /* renamed from: l, reason: collision with root package name */
    public n7.j f4399l;

    /* renamed from: m, reason: collision with root package name */
    public n7.j f4400m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f4401n;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f4394g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f4396i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4397j = true;

    public a3(n7.e eVar) {
        boolean z9 = false;
        n7.j jVar = n7.j.e;
        this.f4399l = jVar;
        this.f4400m = jVar;
        Logger logger = y0.f4776a;
        String str = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        str = str == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : str;
        if (!i4.d.a(str) && Boolean.parseBoolean(str)) {
            z9 = true;
        }
        this.f4401n = z9;
        this.f4393f = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, o7.h1] */
    @Override // n7.j0
    public final n7.f1 a(n7.g0 g0Var) {
        int i10;
        List list;
        List list2;
        n7.j jVar;
        List list3;
        if (this.f4399l == n7.j.f4215f) {
            return n7.f1.f4199k.h("Already shut down");
        }
        List list4 = g0Var.f4206a;
        Object obj = g0Var.f4207b;
        if (list4.isEmpty()) {
            n7.f1 h2 = n7.f1.f4201m.h("NameResolver returned no usable address. addrs=" + list4 + ", attrs=" + obj);
            c(h2);
            return h2;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (((n7.r) it.next()) == null) {
                n7.f1 h10 = n7.f1.f4201m.h("NameResolver returned address list with null endpoint. addrs=" + list4 + ", attrs=" + obj);
                c(h10);
                return h10;
            }
        }
        this.f4397j = true;
        j4.c cVar = j4.e.c;
        b1.u.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int size = list4.size();
        if (objArr.length < size) {
            objArr = Arrays.copyOf(objArr, j4.b.b(objArr.length, size));
        }
        if (list4 instanceof j4.a) {
            i10 = ((j4.a) list4).d(0, objArr);
        } else {
            int i11 = 0;
            boolean z9 = false;
            for (Object obj2 : list4) {
                obj2.getClass();
                int i12 = i11 + 1;
                if (objArr.length < i12) {
                    objArr = Arrays.copyOf(objArr, j4.b.b(objArr.length, i12));
                } else if (z9) {
                    objArr = (Object[]) objArr.clone();
                } else {
                    objArr[i11] = obj2;
                    i11++;
                }
                z9 = false;
                objArr[i11] = obj2;
                i11++;
            }
            i10 = i11;
        }
        j4.i i13 = j4.e.i(i10, objArr);
        h1 h1Var = this.f4395h;
        n7.j jVar2 = n7.j.c;
        if (h1Var == null) {
            ?? obj3 = new Object();
            if (i13 != null) {
                list3 = i13;
            } else {
                list3 = Collections.EMPTY_LIST;
            }
            obj3.f4538a = list3;
            this.f4395h = obj3;
        } else if (this.f4399l == jVar2) {
            SocketAddress a10 = h1Var.a();
            h1 h1Var2 = this.f4395h;
            if (i13 != null) {
                list2 = i13;
            } else {
                h1Var2.getClass();
                list2 = Collections.EMPTY_LIST;
            }
            h1Var2.f4538a = list2;
            h1Var2.f4539b = 0;
            h1Var2.c = 0;
            if (this.f4395h.e(a10)) {
                return n7.f1.e;
            }
            h1 h1Var3 = this.f4395h;
            h1Var3.f4539b = 0;
            h1Var3.c = 0;
        } else {
            if (i13 != null) {
                list = i13;
            } else {
                list = Collections.EMPTY_LIST;
            }
            h1Var.f4538a = list;
            h1Var.f4539b = 0;
            h1Var.c = 0;
        }
        HashMap hashMap = this.f4394g;
        HashSet hashSet = new HashSet(hashMap.keySet());
        HashSet hashSet2 = new HashSet();
        j4.c listIterator = i13.listIterator(0);
        while (listIterator.hasNext()) {
            hashSet2.addAll(((n7.r) listIterator.next()).f4239a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it2.next();
            if (!hashSet2.contains(socketAddress)) {
                ((z2) hashMap.remove(socketAddress)).f4796a.n();
            }
        }
        int size2 = hashSet.size();
        n7.j jVar3 = n7.j.f4214b;
        if (size2 != 0 && (jVar = this.f4399l) != jVar3 && jVar != jVar2) {
            n7.j jVar4 = n7.j.e;
            if (jVar == jVar4) {
                i(jVar4, new y2(this, this));
            } else if (jVar == n7.j.d) {
                g();
                e();
            }
        } else {
            this.f4399l = jVar3;
            i(jVar3, new x2(n7.f0.e));
            g();
            e();
        }
        return n7.f1.e;
    }

    @Override // n7.j0
    public final void c(n7.f1 f1Var) {
        HashMap hashMap = this.f4394g;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((z2) it.next()).f4796a.n();
        }
        hashMap.clear();
        i(n7.j.d, new x2(n7.f0.a(f1Var)));
    }

    @Override // n7.j0
    public final void e() {
        int i10;
        n7.t tVar;
        h1 h1Var = this.f4395h;
        if (h1Var != null && h1Var.c() && this.f4399l != n7.j.f4215f) {
            SocketAddress a10 = this.f4395h.a();
            HashMap hashMap = this.f4394g;
            boolean containsKey = hashMap.containsKey(a10);
            Logger logger = f4392o;
            if (containsKey) {
                tVar = ((z2) hashMap.get(a10)).f4796a;
            } else {
                w2 w2Var = new w2(this);
                n7.e0 d = n7.e0.d();
                n7.r[] rVarArr = {new n7.r(a10)};
                b1.u.c(1, "arraySize");
                long j10 = 1 + 5 + 0;
                if (j10 > 2147483647L) {
                    i10 = Integer.MAX_VALUE;
                } else if (j10 < -2147483648L) {
                    i10 = Integer.MIN_VALUE;
                } else {
                    i10 = (int) j10;
                }
                ArrayList arrayList = new ArrayList(i10);
                Collections.addAll(arrayList, rVarArr);
                d.e(arrayList);
                d.a(w2Var);
                final n7.t b10 = this.f4393f.b(d.b());
                if (b10 != null) {
                    z2 z2Var = new z2(b10, w2Var);
                    w2Var.f4764b = z2Var;
                    hashMap.put(a10, z2Var);
                    if (b10.d().f4158a.get(n7.j0.d) == null) {
                        w2Var.f4763a = n7.k.a(n7.j.c);
                    }
                    b10.p(new n7.i0() { // from class: o7.v2
                        @Override // n7.i0
                        public final void a(n7.k kVar) {
                            n7.t tVar2;
                            int i11;
                            int i12;
                            a3 a3Var = a3.this;
                            n7.e eVar = a3Var.f4393f;
                            n7.j jVar = kVar.f4220a;
                            HashMap hashMap2 = a3Var.f4394g;
                            n7.t tVar3 = b10;
                            z2 z2Var2 = (z2) hashMap2.get((SocketAddress) tVar3.b().f4239a.get(0));
                            if (z2Var2 != null && (tVar2 = z2Var2.f4796a) == tVar3 && jVar != n7.j.f4215f) {
                                n7.j jVar2 = n7.j.e;
                                if (jVar == jVar2) {
                                    eVar.y();
                                }
                                z2.a(z2Var2, jVar);
                                n7.j jVar3 = a3Var.f4399l;
                                n7.j jVar4 = n7.j.f4214b;
                                n7.j jVar5 = n7.j.d;
                                if (jVar3 == jVar5 || a3Var.f4400m == jVar5) {
                                    if (jVar != jVar4) {
                                        if (jVar == jVar2) {
                                            a3Var.e();
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                int ordinal = jVar.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal == 3) {
                                                h1 h1Var2 = a3Var.f4395h;
                                                h1Var2.f4539b = 0;
                                                h1Var2.c = 0;
                                                a3Var.f4399l = jVar2;
                                                a3Var.i(jVar2, new y2(a3Var, a3Var));
                                                return;
                                            }
                                            androidx.navigation.b.t(jVar, "Unsupported state:");
                                            return;
                                        }
                                        if (a3Var.f4395h.c() && ((z2) hashMap2.get(a3Var.f4395h.a())).f4796a == tVar3 && a3Var.f4395h.b()) {
                                            a3Var.g();
                                            a3Var.e();
                                        }
                                        h1 h1Var3 = a3Var.f4395h;
                                        if (h1Var3 != null && !h1Var3.c()) {
                                            int size = hashMap2.size();
                                            List list = a3Var.f4395h.f4538a;
                                            if (list != null) {
                                                i11 = list.size();
                                            } else {
                                                i11 = 0;
                                            }
                                            if (size >= i11) {
                                                Iterator it = hashMap2.values().iterator();
                                                while (it.hasNext()) {
                                                    if (!((z2) it.next()).d) {
                                                        return;
                                                    }
                                                }
                                                a3Var.f4399l = jVar5;
                                                a3Var.i(jVar5, new x2(n7.f0.a(kVar.f4221b)));
                                                int i13 = a3Var.f4396i + 1;
                                                a3Var.f4396i = i13;
                                                List list2 = a3Var.f4395h.f4538a;
                                                if (list2 != null) {
                                                    i12 = list2.size();
                                                } else {
                                                    i12 = 0;
                                                }
                                                if (i13 >= i12 || a3Var.f4397j) {
                                                    a3Var.f4397j = false;
                                                    a3Var.f4396i = 0;
                                                    eVar.y();
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    a3Var.g();
                                    for (z2 z2Var3 : hashMap2.values()) {
                                        if (!z2Var3.f4796a.equals(tVar2)) {
                                            z2Var3.f4796a.n();
                                        }
                                    }
                                    hashMap2.clear();
                                    n7.j jVar6 = n7.j.c;
                                    z2.a(z2Var2, jVar6);
                                    hashMap2.put((SocketAddress) tVar2.b().f4239a.get(0), z2Var2);
                                    a3Var.f4395h.e((SocketAddress) tVar3.b().f4239a.get(0));
                                    a3Var.f4399l = jVar6;
                                    a3Var.j(z2Var2);
                                    return;
                                }
                                a3Var.f4399l = jVar4;
                                a3Var.i(jVar4, new x2(n7.f0.e));
                            }
                        }
                    });
                    tVar = b10;
                } else {
                    logger.warning("Was not able to create subchannel for " + a10);
                    j1.i.l("Can't create subchannel");
                    return;
                }
            }
            int ordinal = ((z2) hashMap.get(a10)).f4797b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            tVar.l();
                            z2.a((z2) hashMap.get(a10), n7.j.f4214b);
                            h();
                            return;
                        }
                        return;
                    }
                    this.f4395h.b();
                    e();
                    return;
                }
                logger.warning("Requesting a connection even though we have a READY subchannel");
                return;
            }
            if (this.f4401n) {
                h();
            } else {
                tVar.l();
            }
        }
    }

    @Override // n7.j0
    public final void f() {
        Level level = Level.FINE;
        HashMap hashMap = this.f4394g;
        f4392o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(hashMap.size()));
        n7.j jVar = n7.j.f4215f;
        this.f4399l = jVar;
        this.f4400m = jVar;
        g();
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((z2) it.next()).f4796a.n();
        }
        hashMap.clear();
    }

    public final void g() {
        l.d dVar = this.f4398k;
        if (dVar != null) {
            dVar.j();
            this.f4398k = null;
        }
    }

    public final void h() {
        if (this.f4401n) {
            l.d dVar = this.f4398k;
            if (dVar != null) {
                n7.j1 j1Var = (n7.j1) dVar.c;
                if (!j1Var.d && !j1Var.c) {
                    return;
                }
            }
            n7.e eVar = this.f4393f;
            this.f4398k = eVar.f().c(new com.bumptech.glide.m(18, this), 250L, TimeUnit.MILLISECONDS, eVar.d());
        }
    }

    public final void i(n7.j jVar, n7.h0 h0Var) {
        if (jVar == this.f4400m && (jVar == n7.j.e || jVar == n7.j.f4214b)) {
            return;
        }
        this.f4400m = jVar;
        this.f4393f.D(jVar, h0Var);
    }

    public final void j(z2 z2Var) {
        n7.j jVar = z2Var.f4797b;
        n7.j jVar2 = n7.j.c;
        if (jVar == jVar2) {
            n7.k kVar = z2Var.c.f4763a;
            n7.j jVar3 = kVar.f4220a;
            if (jVar3 == jVar2) {
                i(jVar2, new t1(n7.f0.b(z2Var.f4796a, null)));
                return;
            }
            n7.j jVar4 = n7.j.d;
            if (jVar3 == jVar4) {
                i(jVar4, new x2(n7.f0.a(kVar.f4221b)));
            } else if (this.f4400m != jVar4) {
                i(jVar3, new x2(n7.f0.e));
            }
        }
    }
}
