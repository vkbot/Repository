package org.apache.commons.io;

import java.time.Duration;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
final class ThreadMonitor implements Runnable {
    private final Thread thread;
    private final Duration timeout;

    private ThreadMonitor(Thread thread, Duration duration) {
        this.thread = thread;
        this.timeout = duration;
    }

    public static Thread start(Thread thread, Duration duration) {
        boolean isZero;
        boolean isNegative;
        isZero = duration.isZero();
        if (!isZero) {
            isNegative = duration.isNegative();
            if (!isNegative) {
                Thread thread2 = new Thread(new ThreadMonitor(thread, duration), "ThreadMonitor");
                thread2.setDaemon(true);
                thread2.start();
                return thread2;
            }
            return null;
        }
        return null;
    }

    public static void stop(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ThreadUtils.sleep(this.timeout);
            this.thread.interrupt();
        } catch (InterruptedException unused) {
        }
    }

    public static Thread start(Duration duration) {
        return start(Thread.currentThread(), duration);
    }
}
