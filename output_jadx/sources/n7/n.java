package n7;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f4229a = Logger.getLogger(n.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final n f4230b = new Object();

    public static n b() {
        ((l1) l.f4223a).getClass();
        n nVar = (n) l1.f4227b.get();
        n nVar2 = f4230b;
        if (nVar == null) {
            nVar = nVar2;
        }
        if (nVar == null) {
            return nVar2;
        }
        return nVar;
    }

    public final n a() {
        ((l1) l.f4223a).getClass();
        ThreadLocal threadLocal = l1.f4227b;
        n nVar = (n) threadLocal.get();
        n nVar2 = f4230b;
        if (nVar == null) {
            nVar = nVar2;
        }
        threadLocal.set(this);
        if (nVar == null) {
            return nVar2;
        }
        return nVar;
    }

    public final void c(n nVar) {
        if (nVar != null) {
            l1 l1Var = (l1) l.f4223a;
            ThreadLocal threadLocal = l1.f4227b;
            l1Var.getClass();
            n nVar2 = (n) threadLocal.get();
            n nVar3 = f4230b;
            if (nVar2 == null) {
                nVar2 = nVar3;
            }
            if (nVar2 != this) {
                l1.f4226a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
            }
            if (nVar != nVar3) {
                threadLocal.set(nVar);
                return;
            } else {
                threadLocal.set(null);
                return;
            }
        }
        n0.b.n("toAttach");
    }
}
