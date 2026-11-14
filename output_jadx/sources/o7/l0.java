package o7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l0 implements n2 {
    public final Executor c;
    public final n7.k1 d;
    public j0 e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f4600f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f4601g;

    /* renamed from: h, reason: collision with root package name */
    public n.p f4602h;

    /* renamed from: j, reason: collision with root package name */
    public n7.f1 f4604j;

    /* renamed from: k, reason: collision with root package name */
    public n7.h0 f4605k;

    /* renamed from: l, reason: collision with root package name */
    public long f4606l;

    /* renamed from: a, reason: collision with root package name */
    public final n7.a0 f4598a = n7.a0.a(l0.class, null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f4599b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Collection f4603i = new LinkedHashSet();

    public l0(Executor executor, n7.k1 k1Var) {
        this.c = executor;
        this.d = k1Var;
    }

    @Override // o7.n2
    public final void a(n7.f1 f1Var) {
        j0 j0Var;
        synchronized (this.f4599b) {
            try {
                if (this.f4604j != null) {
                    return;
                }
                this.f4604j = f1Var;
                this.d.b(new e0(5, this, f1Var));
                if (!f() && (j0Var = this.f4601g) != null) {
                    this.d.b(j0Var);
                    this.f4601g = null;
                }
                this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o7.n2
    public final Runnable b(m2 m2Var) {
        n.p pVar = (n.p) m2Var;
        this.f4602h = pVar;
        this.e = new j0(pVar, 0);
        this.f4600f = new j0(pVar, 1);
        this.f4601g = new j0(pVar, 2);
        return null;
    }

    @Override // n7.z
    public final n7.a0 c() {
        return this.f4598a;
    }

    @Override // o7.x
    public final u d(n7.x0 x0Var, n7.v0 v0Var, n7.c cVar, n7.e[] eVarArr) {
        u s0Var;
        try {
            g3 g3Var = new g3(x0Var, v0Var, cVar);
            n7.h0 h0Var = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f4599b) {
                    n7.f1 f1Var = this.f4604j;
                    if (f1Var != null) {
                        s0Var = new s0(f1Var, v.f4733b, eVarArr);
                        break;
                    }
                    n7.h0 h0Var2 = this.f4605k;
                    if (h0Var2 == null) {
                        s0Var = e(g3Var, eVarArr);
                        break;
                    }
                    if (h0Var != null && j10 == this.f4606l) {
                        s0Var = e(g3Var, eVarArr);
                        break;
                    }
                    j10 = this.f4606l;
                    x f8 = y0.f(h0Var2.a(g3Var), Boolean.TRUE.equals(cVar.e));
                    if (f8 != null) {
                        s0Var = f8.d(g3Var.c, g3Var.f4536b, g3Var.f4535a, eVarArr);
                        break;
                    }
                    h0Var = h0Var2;
                }
            }
            return s0Var;
        } finally {
            this.d.a();
        }
    }

    public final k0 e(g3 g3Var, n7.e[] eVarArr) {
        int size;
        k0 k0Var = new k0(this, g3Var, eVarArr);
        this.f4603i.add(k0Var);
        synchronized (this.f4599b) {
            size = this.f4603i.size();
        }
        if (size == 1) {
            this.d.b(this.e);
        }
        for (n7.e eVar : eVarArr) {
            eVar.a();
        }
        return k0Var;
    }

    public final boolean f() {
        boolean z9;
        synchronized (this.f4599b) {
            z9 = !this.f4603i.isEmpty();
        }
        return z9;
    }

    public final void g(n7.h0 h0Var) {
        j0 j0Var;
        m0 m0Var;
        boolean z9;
        synchronized (this.f4599b) {
            this.f4605k = h0Var;
            this.f4606l++;
            if (h0Var != null && f()) {
                ArrayList arrayList = new ArrayList(this.f4603i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    k0 k0Var = (k0) obj;
                    n7.f0 a10 = h0Var.a(k0Var.f4573k);
                    n7.c cVar = k0Var.f4573k.f4535a;
                    x f8 = y0.f(a10, Boolean.TRUE.equals(cVar.e));
                    if (f8 != null) {
                        Executor executor = this.c;
                        Executor executor2 = cVar.f4165b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        n7.n nVar = k0Var.f4574l;
                        n7.n a11 = nVar.a();
                        try {
                            g3 g3Var = k0Var.f4573k;
                            u d = f8.d(g3Var.c, g3Var.f4536b, g3Var.f4535a, k0Var.f4575m);
                            synchronized (k0Var) {
                                try {
                                    m0Var = null;
                                    if (k0Var.d == null) {
                                        o4.b.i(d, "stream");
                                        u uVar = k0Var.d;
                                        if (uVar == null) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        o4.b.l("realStream already set to %s", z9, uVar);
                                        k0Var.d = d;
                                        k0Var.f4571i = System.nanoTime();
                                        w wVar = k0Var.c;
                                        if (wVar == null) {
                                            k0Var.f4568f = null;
                                            k0Var.f4567b = true;
                                        }
                                        if (wVar != null) {
                                            k0Var.k(wVar);
                                            m0Var = new m0(k0Var, 2);
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (m0Var != null) {
                                executor.execute(m0Var);
                            }
                            arrayList2.add(k0Var);
                        } finally {
                            nVar.c(a11);
                        }
                    }
                }
                synchronized (this.f4599b) {
                    try {
                        if (!f()) {
                            return;
                        }
                        this.f4603i.removeAll(arrayList2);
                        if (this.f4603i.isEmpty()) {
                            this.f4603i = new LinkedHashSet();
                        }
                        if (!f()) {
                            this.d.b(this.f4600f);
                            if (this.f4604j != null && (j0Var = this.f4601g) != null) {
                                this.d.b(j0Var);
                                this.f4601g = null;
                            }
                        }
                        this.d.a();
                    } finally {
                    }
                }
            }
        }
    }
}
