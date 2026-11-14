package o7;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4620b;
    public final /* synthetic */ p1 c;

    public /* synthetic */ n1(p1 p1Var, int i10) {
        this.f4620b = i10;
        this.c = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1 p1Var;
        boolean z9;
        long nextLong;
        c1 c1Var;
        boolean z10 = true;
        switch (this.f4620b) {
            case 0:
                synchronized (this.c) {
                    try {
                        p1Var = this.c;
                        if (p1Var.d != 6) {
                            p1Var.d = 6;
                        } else {
                            z10 = false;
                        }
                    } finally {
                    }
                }
                if (z10) {
                    ((p7.n) p1Var.c.c).q(n7.f1.f4201m.h("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.c) {
                    try {
                        p1 p1Var2 = this.c;
                        p1Var2.f4655f = null;
                        int i10 = p1Var2.d;
                        if (i10 == 2) {
                            p1Var2.d = 4;
                            p1Var2.e = p1Var2.f4653a.schedule(p1Var2.f4656g, p1Var2.f4659j, TimeUnit.NANOSECONDS);
                            z9 = true;
                        } else {
                            if (i10 == 3) {
                                p1Var2.f4655f = p1Var2.f4653a.schedule(p1Var2.f4657h, p1Var2.f4658i - p1Var2.f4654b.a(), TimeUnit.NANOSECONDS);
                                this.c.d = 2;
                            }
                            z9 = false;
                        }
                    } finally {
                    }
                }
                if (z9) {
                    n.p pVar = this.c.c;
                    p7.n nVar = (p7.n) pVar.c;
                    o1 o1Var = new o1(pVar);
                    m4.n nVar2 = m4.n.f3932b;
                    synchronized (nVar.f5078k) {
                        try {
                            if (nVar.f5076i != null) {
                                if (nVar.f5089y) {
                                    n7.g1 k6 = nVar.k();
                                    Logger logger = d1.f4453g;
                                    try {
                                        nVar2.execute(new c1(o1Var, k6));
                                    } catch (Throwable th) {
                                        d1.f4453g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                    }
                                    return;
                                }
                                d1 d1Var = nVar.f5088x;
                                if (d1Var != null) {
                                    nextLong = 0;
                                    z10 = false;
                                } else {
                                    nextLong = nVar.d.nextLong();
                                    i4.f fVar = (i4.f) nVar.e.r();
                                    fVar.b();
                                    d1 d1Var2 = new d1(nextLong, fVar);
                                    nVar.f5088x = d1Var2;
                                    nVar.L.getClass();
                                    d1Var = d1Var2;
                                }
                                if (z10) {
                                    nVar.f5076i.y(false, (int) (nextLong >>> 32), (int) nextLong);
                                }
                                synchronized (d1Var) {
                                    try {
                                        if (!d1Var.d) {
                                            d1Var.c.put(o1Var, nVar2);
                                            return;
                                        }
                                        n7.g1 g1Var = d1Var.e;
                                        if (g1Var != null) {
                                            c1Var = new c1(o1Var, g1Var);
                                        } else {
                                            c1Var = new c1(o1Var, d1Var.f4456f);
                                        }
                                        try {
                                            nVar2.execute(c1Var);
                                            return;
                                        } catch (Throwable th2) {
                                            d1.f4453g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                            return;
                                        }
                                    } finally {
                                    }
                                }
                            }
                            throw new IllegalStateException();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
