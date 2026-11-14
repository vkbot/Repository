package o7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r extends d0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a5.h hVar) {
        super(0, ((t) hVar.e).f4703h);
        this.e = hVar;
    }

    @Override // o7.d0
    public final void b() {
        List list;
        switch (this.d) {
            case 0:
                a5.h hVar = (a5.h) this.e;
                w7.b.c();
                try {
                    w7.b.a();
                    w7.b.f6413a.getClass();
                    if (((n7.f1) hVar.d) == null) {
                        try {
                            ((n7.e) hVar.c).r();
                        } catch (Throwable th) {
                            n7.f1 h2 = n7.f1.f4194f.g(th).h("Failed to call onReady.");
                            hVar.d = h2;
                            ((t) hVar.e).f4707l.h(h2);
                        }
                    }
                    w7.b.f6413a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        w7.b.f6413a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 1:
                ((b2) this.e).t();
                return;
            default:
                i0 i0Var = (i0) this.e;
                i0Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (i0Var) {
                        try {
                            if (i0Var.d.isEmpty()) {
                                i0Var.d = null;
                                i0Var.c = true;
                                return;
                            } else {
                                list = i0Var.d;
                                i0Var.d = arrayList;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b2 b2Var, i0 i0Var) {
        super(0, b2Var.f4429f);
        this.e = i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b2 b2Var, n7.n nVar) {
        super(0, nVar);
        this.e = b2Var;
    }
}
