package l9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class j0 {
    public static final i0 Companion = new Object();

    @JvmField
    public static final j0 NONE = new Object();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public final void awaitSignal(Condition condition) {
        condition.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j10 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j10 = System.nanoTime() - nanoTime;
            }
            if (j10 < timeoutNanos) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public j0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public j0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final j0 deadline(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j10 > 0) {
            return deadlineNanoTime(timeUnit.toNanos(j10) + System.nanoTime());
        }
        i.d(ai.onnxruntime.a.h(j10, "duration <= 0: "));
        return null;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        j1.i.l("No deadline");
        return 0L;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(j0 j0Var, Function0<? extends T> function0) {
        j0Var.getClass();
        function0.getClass();
        long timeoutNanos = timeoutNanos();
        i0 i0Var = Companion;
        long timeoutNanos2 = j0Var.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        i0Var.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (j0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), j0Var.deadlineNanoTime()));
            }
            try {
                return function0.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                timeout(timeoutNanos, timeUnit);
                if (j0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                InlineMarker.finallyEnd(1);
            }
        }
        if (j0Var.hasDeadline()) {
            deadlineNanoTime(j0Var.deadlineNanoTime());
        }
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            timeout(timeoutNanos, timeUnit);
            if (j0Var.hasDeadline()) {
                clearDeadline();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public void throwIfReached() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public j0 timeout(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j10 >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j10);
            return this;
        }
        i.d(ai.onnxruntime.a.h(j10, "timeout < 0: "));
        return null;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) {
        obj.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j10 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j11 = timeoutNanos / 1000000;
                obj.wait(j11, (int) (timeoutNanos - (1000000 * j11)));
                j10 = System.nanoTime() - nanoTime;
            }
            if (j10 < timeoutNanos) {
            } else {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public j0 deadlineNanoTime(long j10) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j10;
        return this;
    }
}
