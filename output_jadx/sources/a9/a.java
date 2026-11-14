package a9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import v8.h1;
import v8.l0;
import v8.q1;
import v8.s1;
import v8.y0;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f57a = new w("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final w f58b = new w("UNDEFINED", 0);
    public static final w c = new w("REUSABLE_CLAIMED", 0);
    public static final w d = new w("CONDITION_FALSE", 0);

    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        l9.i.d(ai.onnxruntime.a.e(i10, "Expected positive parallelism level, but got "));
    }

    public static final u b(Object obj) {
        if (obj != d.f65a) {
            return (u) obj;
        }
        j1.i.l("Does not contain segment");
        return null;
    }

    public static final void c(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = f.f69a.iterator();
        while (it.hasNext()) {
            try {
                ((w8.b) ((v8.v) it.next())).y(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ExceptionsKt.addSuppressed(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            ExceptionsKt.addSuppressed(th, new g(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        if (obj == d.f65a) {
            return true;
        }
        return false;
    }

    public static final Object e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(Object obj, Continuation continuation) {
        Object kVar;
        s1 s1Var;
        if (continuation instanceof h) {
            h hVar = (h) continuation;
            v8.t tVar = hVar.e;
            Continuation continuation2 = hVar.f72f;
            Throwable m98exceptionOrNullimpl = Result.m98exceptionOrNullimpl(obj);
            if (m98exceptionOrNullimpl == null) {
                kVar = obj;
            } else {
                kVar = new v8.k(false, m98exceptionOrNullimpl);
            }
            if (tVar.isDispatchNeeded(continuation2.get$context())) {
                hVar.f73g = kVar;
                hVar.d = 1;
                tVar.dispatch(continuation2.get$context(), hVar);
                return;
            }
            l0 a10 = q1.a();
            if (a10.f6040b >= 4294967296L) {
                hVar.f73g = kVar;
                hVar.d = 1;
                ArrayDeque arrayDeque = a10.d;
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    a10.d = arrayDeque;
                }
                arrayDeque.addLast(hVar);
                return;
            }
            a10.S(true);
            try {
                z0 z0Var = (z0) continuation2.get$context().get(y0.f6058b);
                if (z0Var != null && !z0Var.b()) {
                    CancellationException s5 = ((h1) z0Var).s();
                    hVar.c(kVar, s5);
                    hVar.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(s5)));
                } else {
                    Object obj2 = hVar.f74h;
                    CoroutineContext coroutineContext = continuation2.get$context();
                    Object b10 = b0.b(coroutineContext, obj2);
                    if (b10 != b0.f61a) {
                        s1Var = v8.q.b(continuation2, coroutineContext, b10);
                    } else {
                        s1Var = null;
                    }
                    try {
                        continuation2.resumeWith(obj);
                        Unit unit = Unit.INSTANCE;
                    } finally {
                        if (s1Var == null || s1Var.M()) {
                            b0.a(coroutineContext, b10);
                        }
                    }
                }
                do {
                } while (a10.V());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        continuation.resumeWith(obj);
    }

    public static final long h(long j10, long j11, long j12, String str) {
        String str2;
        int i10 = x.f89a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j10;
        }
        Long longOrNull = StringsKt.toLongOrNull(str2);
        if (longOrNull != null) {
            long longValue = longOrNull.longValue();
            if (j11 <= longValue && longValue <= j12) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int i(int i10, int i11, String str) {
        int i12;
        if ((i11 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = 2097150;
        }
        return (int) h(i10, 1, i12, str);
    }
}
