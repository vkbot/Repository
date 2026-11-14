package o7;

import java.util.HashSet;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4480b;
    public final /* synthetic */ b2 c;

    public /* synthetic */ f0(b2 b2Var, int i10) {
        this.f4480b = i10;
        this.c = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4480b) {
            case 0:
                this.c.f4432i.k();
                return;
            case 1:
                this.c.f4432i.g();
                return;
            default:
                b2 b2Var = this.c;
                LinkedHashSet linkedHashSet = b2Var.f4440q.d.B;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(b2Var);
                    if (this.c.f4440q.d.B.isEmpty()) {
                        f2 f2Var = this.c.f4440q.d;
                        f2Var.Y.d(f2Var.C, false);
                        f2 f2Var2 = this.c.f4440q.d;
                        f2Var2.B = null;
                        if (f2Var2.G.get()) {
                            b1.m mVar = this.c.f4440q.d.F;
                            n7.f1 f1Var = f2.f4484e0;
                            synchronized (mVar.c) {
                                try {
                                    if (((n7.f1) mVar.e) == null) {
                                        mVar.e = f1Var;
                                        boolean isEmpty = ((HashSet) mVar.d).isEmpty();
                                        if (isEmpty) {
                                            ((f2) mVar.f305f).E.a(f1Var);
                                        }
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
