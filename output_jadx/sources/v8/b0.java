package v8;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.ranges.RangesKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b0 extends n0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h, reason: collision with root package name */
    public static final b0 f6013h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f6014i;

    /* JADX WARN: Type inference failed for: r0v0, types: [v8.b0, v8.n0, v8.l0] */
    static {
        Long l10;
        ?? n0Var = new n0();
        f6013h = n0Var;
        n0Var.S(false);
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f6014i = TimeUnit.MILLISECONDS.toNanos(l10.longValue());
    }

    @Override // v8.o0
    public final Thread c0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "v8.b0");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // v8.n0
    public final void d0(Runnable runnable) {
        if (debugStatus != 4) {
            super.d0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void g0() {
        boolean z9;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return;
        }
        debugStatus = 3;
        n0.e.set(this, null);
        n0.f6042f.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        Thread thread;
        boolean z10;
        q1.f6046a.set(this);
        Thread thread2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            _thread = null;
                            g0();
                            if (!e0()) {
                                c0();
                                return;
                            }
                            return;
                        }
                        debugStatus = 1;
                        notifyAll();
                        long j10 = Long.MAX_VALUE;
                        while (true) {
                            Thread.interrupted();
                            long f02 = f0();
                            if (f02 == Long.MAX_VALUE) {
                                long nanoTime = System.nanoTime();
                                if (j10 == Long.MAX_VALUE) {
                                    j10 = f6014i + nanoTime;
                                }
                                thread = thread2;
                                long j11 = j10 - nanoTime;
                                if (j11 <= 0) {
                                    _thread = thread;
                                    g0();
                                    if (!e0()) {
                                        c0();
                                        return;
                                    }
                                    return;
                                }
                                f02 = RangesKt.coerceAtMost(f02, j11);
                            } else {
                                thread = thread2;
                                j10 = Long.MAX_VALUE;
                            }
                            if (f02 > 0) {
                                int i11 = debugStatus;
                                if (i11 != 2 && i11 != 3) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    _thread = thread;
                                    g0();
                                    if (!e0()) {
                                        c0();
                                        return;
                                    }
                                    return;
                                }
                                LockSupport.parkNanos(this, f02);
                            }
                            thread2 = thread;
                        }
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    _thread = null;
                    g0();
                    if (!e0()) {
                        c0();
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // v8.n0, v8.l0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
