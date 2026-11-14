package l9;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class d extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        g a10;
        while (true) {
            try {
                g.Companion.getClass();
                reentrantLock = g.lock;
                reentrantLock.lock();
                try {
                    a10 = c.a();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (a10 == g.head) {
                g.head = null;
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (a10 != null) {
                a10.timedOut();
            }
        }
    }
}
