package p7;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import n7.f1;
import o7.p1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final l.d f5070b;
    public final r7.h c;
    public boolean d;
    public final /* synthetic */ n e;

    public m(n nVar, r7.h hVar) {
        this.e = nVar;
        Level level = Level.FINE;
        this.f5070b = new l.d(6);
        this.d = true;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        f1 f1Var;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (true) {
            try {
                boolean b10 = this.c.b(this);
                nVar = this.e;
                if (!b10) {
                    break;
                }
                p1 p1Var = nVar.F;
                if (p1Var != null) {
                    p1Var.a();
                }
            } catch (Throwable th) {
                try {
                    n nVar2 = this.e;
                    r7.a aVar = r7.a.PROTOCOL_ERROR;
                    f1 g10 = f1.f4200l.h("error in frame handler").g(th);
                    Map map = n.P;
                    nVar2.r(0, aVar, g10);
                    try {
                        this.c.close();
                    } catch (IOException e) {
                        e = e;
                        n.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                    } catch (RuntimeException e6) {
                        if (!"bio == null".equals(e6.getMessage())) {
                            throw e6;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        this.c.close();
                    } catch (IOException e10) {
                        n.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e10);
                    } catch (RuntimeException e11) {
                        if (!"bio == null".equals(e11.getMessage())) {
                            throw e11;
                        }
                    }
                    this.e.f5075h.l();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (nVar.f5078k) {
            f1Var = this.e.f5087v;
        }
        if (f1Var == null) {
            f1Var = f1.f4201m.h("End of stream or IOException");
        }
        this.e.r(0, r7.a.INTERNAL_ERROR, f1Var);
        try {
            this.c.close();
        } catch (IOException e12) {
            e = e12;
            n.Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
        } catch (RuntimeException e13) {
            if (!"bio == null".equals(e13.getMessage())) {
                throw e13;
            }
        }
        this.e.f5075h.l();
        Thread.currentThread().setName(name);
    }
}
