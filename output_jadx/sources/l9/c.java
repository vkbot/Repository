package l9;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c {
    public static g a() {
        long j10;
        long j11;
        g gVar = g.head;
        gVar.getClass();
        g gVar2 = gVar.next;
        if (gVar2 == null) {
            long nanoTime = System.nanoTime();
            Condition condition = g.condition;
            j10 = g.IDLE_TIMEOUT_MILLIS;
            condition.await(j10, TimeUnit.MILLISECONDS);
            g gVar3 = g.head;
            gVar3.getClass();
            if (gVar3.next == null) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                j11 = g.IDLE_TIMEOUT_NANOS;
                if (nanoTime2 >= j11) {
                    return g.head;
                }
            }
            return null;
        }
        long access$remainingNanos = g.access$remainingNanos(gVar2, System.nanoTime());
        if (access$remainingNanos <= 0) {
            g gVar4 = g.head;
            gVar4.getClass();
            gVar4.next = gVar2.next;
            gVar2.next = null;
            return gVar2;
        }
        g.condition.await(access$remainingNanos, TimeUnit.NANOSECONDS);
        return null;
    }
}
