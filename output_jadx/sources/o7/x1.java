package o7;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class x1 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final n.p f4769b;
    public Executor c;

    public x1(n.p pVar) {
        o4.b.i(pVar, "executorPool");
        this.f4769b = pVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        synchronized (this) {
            try {
                if (this.c == null) {
                    Executor executor2 = (Executor) s4.a((r4) this.f4769b.c);
                    Executor executor3 = this.c;
                    if (executor2 != null) {
                        this.c = executor2;
                    } else {
                        throw new NullPointerException(e3.d.l("%s.getObject()", executor3));
                    }
                }
                executor = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        executor.execute(runnable);
    }
}
