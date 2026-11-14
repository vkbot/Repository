package a9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import v8.f0;
import v8.l0;
import v8.q1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class h extends f0 implements CoroutineStackFrame, Continuation {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f71i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");

    @Volatile
    private volatile Object _reusableCancellableContinuation;
    public final v8.t e;

    /* renamed from: f, reason: collision with root package name */
    public final Continuation f72f;

    /* renamed from: g, reason: collision with root package name */
    public Object f73g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f74h;

    public h(v8.t tVar, Continuation continuation) {
        super(-1);
        this.e = tVar;
        this.f72f = continuation;
        this.f73g = a.f58b;
        Object fold = continuation.get$context().fold(0, b0.f62b);
        fold.getClass();
        this.f74h = fold;
    }

    @Override // v8.f0
    public final void c(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof v8.l)) {
        } else {
            throw null;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f72f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f72f.get$context();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v8.f0
    public final Object j() {
        Object obj = this.f73g;
        this.f73g = a.f58b;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object kVar;
        Continuation continuation = this.f72f;
        CoroutineContext coroutineContext = continuation.get$context();
        Throwable m98exceptionOrNullimpl = Result.m98exceptionOrNullimpl(obj);
        if (m98exceptionOrNullimpl == null) {
            kVar = obj;
        } else {
            kVar = new v8.k(false, m98exceptionOrNullimpl);
        }
        v8.t tVar = this.e;
        if (tVar.isDispatchNeeded(coroutineContext)) {
            this.f73g = kVar;
            this.d = 0;
            tVar.dispatch(coroutineContext, this);
            return;
        }
        l0 a10 = q1.a();
        if (a10.f6040b >= 4294967296L) {
            this.f73g = kVar;
            this.d = 0;
            ArrayDeque arrayDeque = a10.d;
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                a10.d = arrayDeque;
            }
            arrayDeque.addLast(this);
            return;
        }
        a10.S(true);
        try {
            CoroutineContext coroutineContext2 = continuation.get$context();
            Object b10 = b0.b(coroutineContext2, this.f74h);
            try {
                continuation.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                do {
                } while (a10.V());
            } finally {
                b0.a(coroutineContext2, b10);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.e + ", " + v8.a0.d(this.f72f) + ']';
    }

    @Override // v8.f0
    public final Continuation e() {
        return this;
    }
}
