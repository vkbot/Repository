package o7;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o {
    public static final Logger c = Logger.getLogger(n7.e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Object f4627a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final n7.a0 f4628b;

    public o(n7.a0 a0Var, long j10, String str) {
        this.f4628b = a0Var;
        b(new n7.w(str.concat(" created"), n7.v.f4247b, j10, null));
    }

    public static void a(n7.a0 a0Var, Level level, String str) {
        Logger logger = c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + a0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(n7.w wVar) {
        Level level;
        int ordinal = wVar.f4251b.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                level = Level.FINEST;
            } else {
                level = Level.FINE;
            }
        } else {
            level = Level.FINER;
        }
        synchronized (this.f4627a) {
        }
        a(this.f4628b, level, wVar.f4250a);
    }
}
