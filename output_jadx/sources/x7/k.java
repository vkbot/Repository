package x7;

import i8.p;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class k {
    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract j a();

    public z7.a b(p pVar) {
        return c(pVar);
    }

    public z7.a c(p pVar) {
        j a10 = a();
        i iVar = new i(pVar, a10);
        a10.a(iVar, TimeUnit.NANOSECONDS);
        return iVar;
    }
}
