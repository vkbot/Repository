package m8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends x7.j {
    public final e c;
    public final g d;
    public final AtomicBoolean e = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final c8.c f3980b = new c8.c(1);

    public f(e eVar) {
        g gVar;
        g gVar2;
        this.c = eVar;
        if (eVar.d.c) {
            gVar2 = h.d;
            this.d = gVar2;
        }
        while (true) {
            if (!eVar.c.isEmpty()) {
                gVar = (g) eVar.c.poll();
                if (gVar != null) {
                    break;
                }
            } else {
                gVar = new g(eVar.f3979g);
                eVar.d.a(gVar);
                break;
            }
        }
        gVar2 = gVar;
        this.d = gVar2;
    }

    @Override // x7.j
    public final z7.a a(Runnable runnable, TimeUnit timeUnit) {
        if (this.f3980b.c) {
            return c8.b.f578b;
        }
        return this.d.c(runnable, TimeUnit.NANOSECONDS, this.f3980b);
    }

    @Override // z7.a
    public final void dispose() {
        if (this.e.compareAndSet(false, true)) {
            this.f3980b.dispose();
            e eVar = this.c;
            eVar.getClass();
            long nanoTime = System.nanoTime() + eVar.f3977b;
            g gVar = this.d;
            gVar.d = nanoTime;
            eVar.c.offer(gVar);
        }
    }
}
