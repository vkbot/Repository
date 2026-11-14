package u7;

import a9.w;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.f1;
import n7.g1;
import n7.h1;
import n7.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f5904a = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f5905b;
    public static final w c;

    static {
        boolean z9;
        if (!i4.d.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            z9 = true;
        } else {
            z9 = false;
        }
        f5905b = z9;
        c = new w("internal-stub-type", 3);
    }

    public static void a(t tVar, Throwable th) {
        try {
            tVar.a(null, th);
        } catch (Error | RuntimeException e) {
            f5904a.log(Level.SEVERE, "RuntimeException encountered while closing call", e);
        }
        if (!(th instanceof RuntimeException)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new AssertionError(th);
        }
        throw ((RuntimeException) th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [n7.v0, java.lang.Object] */
    public static a b(t tVar, y5.g gVar) {
        a aVar = new a(tVar);
        tVar.o(new d(aVar), new Object());
        tVar.k();
        try {
            tVar.m(gVar);
            tVar.g();
            return aVar;
        } catch (Error | RuntimeException e) {
            a(tVar, e);
            throw null;
        }
    }

    public static Object c(a aVar) {
        try {
            return aVar.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw f1.f4194f.h("Thread interrupted").g(e).a();
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            o4.b.i(cause, "t");
            for (Throwable th = cause; th != null; th = th.getCause()) {
                if (!(th instanceof g1)) {
                    if (th instanceof h1) {
                        h1 h1Var = (h1) th;
                        throw new h1(h1Var.f4210b, h1Var.c);
                    }
                } else {
                    throw new h1(((g1) th).f4208b, null);
                }
            }
            throw f1.f4195g.h("unexpected exception").g(cause).a();
        }
    }
}
