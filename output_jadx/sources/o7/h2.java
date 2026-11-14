package o7;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h2 extends WeakReference {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f4540f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: g, reason: collision with root package name */
    public static final RuntimeException f4541g;

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f4542a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f4543b;
    public final String c;
    public final SoftReference d;
    public final AtomicBoolean e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f4541g = runtimeException;
    }

    public h2(i2 i2Var, f2 f2Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(i2Var, referenceQueue);
        RuntimeException runtimeException;
        this.e = new AtomicBoolean();
        if (f4540f) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = f4541g;
        }
        this.d = new SoftReference(runtimeException);
        this.c = f2Var.toString();
        this.f4542a = referenceQueue;
        this.f4543b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            h2 h2Var = (h2) referenceQueue.poll();
            if (h2Var != null) {
                SoftReference softReference = h2Var.d;
                RuntimeException runtimeException = (RuntimeException) softReference.get();
                super.clear();
                h2Var.f4543b.remove(h2Var);
                softReference.clear();
                if (!h2Var.e.get()) {
                    Level level = Level.SEVERE;
                    Logger logger = i2.d;
                    if (logger.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{h2Var.c});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f4543b.remove(this);
        this.d.clear();
        a(this.f4542a);
    }
}
