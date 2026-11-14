package l9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class g extends j0 {
    public static final c Companion = new Object();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static g head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private g next;
    private long timeoutAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [l9.c, java.lang.Object] */
    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        condition = newCondition;
        IDLE_TIMEOUT_MILLIS = 60000L;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public static final long access$remainingNanos(g gVar, long j10) {
        return gVar.timeoutAt - j10;
    }

    @PublishedApi
    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l9.g, java.lang.Object] */
    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        c cVar = Companion;
        cVar.getClass();
        cVar.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                this.inQueue = true;
                if (head == null) {
                    head = new Object();
                    Thread thread = new Thread("Okio Watchdog");
                    thread.setDaemon(true);
                    thread.start();
                }
                long nanoTime = System.nanoTime();
                if (timeoutNanos != 0 && hasDeadline) {
                    this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (timeoutNanos != 0) {
                    this.timeoutAt = timeoutNanos + nanoTime;
                } else if (hasDeadline) {
                    this.timeoutAt = deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long access$remainingNanos = access$remainingNanos(this, nanoTime);
                g gVar = head;
                gVar.getClass();
                while (gVar.next != null) {
                    g gVar2 = gVar.next;
                    gVar2.getClass();
                    if (access$remainingNanos < access$remainingNanos(gVar2, nanoTime)) {
                        break;
                    }
                    gVar = gVar.next;
                    gVar.getClass();
                }
                this.next = gVar.next;
                gVar.next = this;
                if (gVar == head) {
                    Companion.getClass();
                    condition.signal();
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean exit() {
        c cVar = Companion;
        cVar.getClass();
        cVar.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.inQueue) {
                this.inQueue = false;
                for (g gVar = head; gVar != null; gVar = gVar.next) {
                    if (gVar.next == this) {
                        gVar.next = this.next;
                        this.next = null;
                        return false;
                    }
                }
                reentrantLock.unlock();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final e0 sink(e0 e0Var) {
        e0Var.getClass();
        return new e(this, e0Var);
    }

    public final g0 source(g0 g0Var) {
        g0Var.getClass();
        return new f(this, g0Var);
    }

    public final <T> T withTimeout(Function0<? extends T> function0) {
        function0.getClass();
        enter();
        try {
            try {
                T invoke = function0.invoke();
                InlineMarker.finallyStart(1);
                if (!exit()) {
                    InlineMarker.finallyEnd(1);
                    return invoke;
                }
                throw access$newTimeoutException(null);
            } catch (IOException e) {
                if (!exit()) {
                    throw e;
                }
                throw access$newTimeoutException(e);
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public void timedOut() {
    }
}
