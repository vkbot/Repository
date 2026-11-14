package m4;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class m implements o {
    public static final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f3928f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.c f3929g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3930h;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3931b;
    public volatile d c;
    public volatile l d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.bumptech.glide.c] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    static {
        boolean z9;
        Throwable th;
        ?? eVar;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        e = z9;
        f3928f = Logger.getLogger(m.class.getName());
        Throwable th2 = null;
        try {
            th = null;
            eVar = new Object();
        } catch (Error | RuntimeException e6) {
            th = e6;
            try {
                eVar = new e(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m.class, l.class, "d"), AtomicReferenceFieldUpdater.newUpdater(m.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "b"));
            } catch (Error | RuntimeException e10) {
                th2 = e10;
                eVar = new Object();
            }
        }
        f3929g = eVar;
        if (th2 != null) {
            Logger logger = f3928f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f3930h = new Object();
    }

    public static void c(m mVar, boolean z9) {
        for (l l10 = f3929g.l(mVar); l10 != null; l10 = l10.f3927b) {
            Thread thread = l10.f3926a;
            if (thread != null) {
                l10.f3926a = null;
                LockSupport.unpark(thread);
            }
        }
        if (z9) {
            mVar.g();
        }
        d k6 = f3929g.k(mVar);
        d dVar = null;
        while (k6 != null) {
            d dVar2 = k6.c;
            k6.c = dVar;
            dVar = k6;
            k6 = dVar2;
        }
        while (dVar != null) {
            d dVar3 = dVar.c;
            Runnable runnable = dVar.f3919a;
            Objects.requireNonNull(runnable);
            Executor executor = dVar.f3920b;
            Objects.requireNonNull(executor);
            d(runnable, executor);
            dVar = dVar3;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f3928f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof c)) {
                if (obj == f3930h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f3918a);
        }
        Throwable th = ((a) obj).f3917a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(m mVar) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = mVar.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object f8 = f(this);
            sb.append("SUCCESS, result=[");
            b(sb, f8);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        }
    }

    @Override // m4.o
    public final void addListener(Runnable runnable, Executor executor) {
        d dVar;
        d dVar2 = d.d;
        o4.b.i(executor, "Executor was null.");
        if (!isDone() && (dVar = this.c) != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (f3929g.c(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.c;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        a aVar;
        Object obj = this.f3931b;
        if (obj == null) {
            if (e) {
                aVar = new a(z9, new CancellationException("Future.cancel() was called."));
            } else {
                if (z9) {
                    aVar = a.f3916b;
                } else {
                    aVar = a.c;
                }
                Objects.requireNonNull(aVar);
            }
            if (f3929g.d(this, obj, aVar)) {
                c(this, z9);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        long j11;
        long j12;
        boolean z9;
        l lVar = l.c;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f3931b;
            if (obj != null) {
                return e(obj);
            }
            long j13 = 0;
            if (nanos > 0) {
                j11 = System.nanoTime() + nanos;
            } else {
                j11 = 0;
            }
            if (nanos >= 1000) {
                l lVar2 = this.d;
                if (lVar2 != lVar) {
                    l lVar3 = new l();
                    while (true) {
                        com.bumptech.glide.c cVar = f3929g;
                        cVar.q(lVar3, lVar2);
                        if (cVar.e(this, lVar2, lVar3)) {
                            j12 = j13;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3931b;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = j11 - System.nanoTime();
                                } else {
                                    i(lVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(lVar3);
                        } else {
                            long j14 = j13;
                            lVar2 = this.d;
                            if (lVar2 == lVar) {
                                break;
                            }
                            j13 = j14;
                        }
                    }
                }
                Object obj3 = this.f3931b;
                Objects.requireNonNull(obj3);
                return e(obj3);
            }
            j12 = 0;
            while (nanos > j12) {
                Object obj4 = this.f3931b;
                if (obj4 != null) {
                    return e(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j11 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String mVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j12) {
                String concat = str.concat(" (plus ");
                long j15 = -nanos;
                long convert = timeUnit.convert(j15, TimeUnit.NANOSECONDS);
                long nanos2 = j15 - timeUnit.toNanos(convert);
                if (convert != j12 && nanos2 <= 1000) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (convert > j12) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z9) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z9) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(ai.onnxruntime.a.D(str, " for ", mVar));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(l lVar) {
        lVar.f3926a = null;
        while (true) {
            l lVar2 = this.d;
            if (lVar2 != l.c) {
                l lVar3 = null;
                while (lVar2 != null) {
                    l lVar4 = lVar2.f3927b;
                    if (lVar2.f3926a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f3927b = lVar4;
                        if (lVar3.f3926a == null) {
                            break;
                        }
                    } else if (!f3929g.e(this, lVar2, lVar4)) {
                        break;
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3931b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f3931b != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f3931b instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                str = h();
                if (i4.d.a(str)) {
                    str = null;
                }
            } catch (RuntimeException | StackOverflowError e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void g() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        l lVar = l.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3931b;
            if (obj2 != null) {
                return e(obj2);
            }
            l lVar2 = this.d;
            if (lVar2 != lVar) {
                l lVar3 = new l();
                do {
                    com.bumptech.glide.c cVar = f3929g;
                    cVar.q(lVar3, lVar2);
                    if (cVar.e(this, lVar2, lVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3931b;
                            } else {
                                i(lVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    lVar2 = this.d;
                } while (lVar2 != lVar);
            }
            Object obj3 = this.f3931b;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
