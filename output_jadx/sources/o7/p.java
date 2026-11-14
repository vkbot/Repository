package o7;

import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class p extends d0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ a5.h e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a5.h hVar, n7.v0 v0Var) {
        super(0, ((t) hVar.e).f4703h);
        this.e = hVar;
        this.f4634f = v0Var;
    }

    @Override // o7.d0
    public final void b() {
        switch (this.d) {
            case 0:
                a5.h hVar = this.e;
                w7.b.c();
                try {
                    w7.b.a();
                    w7.b.f6413a.getClass();
                    if (((n7.f1) hVar.d) == null) {
                        try {
                            ((n7.e) hVar.c).p((n7.v0) this.f4634f);
                        } catch (Throwable th) {
                            n7.f1 h2 = n7.f1.f4194f.g(th).h("Failed to read headers");
                            hVar.d = h2;
                            ((t) hVar.e).f4707l.h(h2);
                        }
                    }
                    w7.b.f6413a.getClass();
                    return;
                } finally {
                    try {
                        w7.b.f6413a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            default:
                w7.b.c();
                try {
                    w7.b.a();
                    w7.a aVar = w7.b.f6413a;
                    aVar.getClass();
                    c();
                    aVar.getClass();
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
        }
    }

    public void c() {
        o2 o2Var = (o2) this.f4634f;
        a5.h hVar = this.e;
        t tVar = (t) hVar.e;
        if (((n7.f1) hVar.d) != null) {
            Logger logger = y0.f4776a;
            while (true) {
                InputStream a10 = o2Var.a();
                if (a10 != null) {
                    y0.b(a10);
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                try {
                    InputStream a11 = o2Var.a();
                    if (a11 != null) {
                        try {
                            ((n7.e) hVar.c).q(tVar.d.b(a11));
                            a11.close();
                        } catch (Throwable th) {
                            y0.b(a11);
                            throw th;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = y0.f4776a;
                    while (true) {
                        InputStream a12 = o2Var.a();
                        if (a12 != null) {
                            y0.b(a12);
                        } else {
                            n7.f1 h2 = n7.f1.f4194f.g(th2).h("Failed to read message.");
                            hVar.d = h2;
                            tVar.f4707l.h(h2);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a5.h hVar, o2 o2Var) {
        super(0, ((t) hVar.e).f4703h);
        this.e = hVar;
        this.f4634f = o2Var;
    }
}
