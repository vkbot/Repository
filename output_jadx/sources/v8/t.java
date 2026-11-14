package v8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class t extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final s Key = new AbstractCoroutineContextKey(ContinuationInterceptor.INSTANCE, r.f6047b);

    public t() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new a9.h(this, continuation);
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return !(this instanceof r1);
    }

    public t limitedParallelism(int i10) {
        a9.a.a(i10);
        return new a9.j(this, i10);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        e eVar;
        continuation.getClass();
        a9.h hVar = (a9.h) continuation;
        hVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.h.f71i;
        do {
        } while (atomicReferenceFieldUpdater.get(hVar) == a9.a.c);
        Object obj = atomicReferenceFieldUpdater.get(hVar);
        if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.a(this);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final t plus(t tVar) {
        return tVar;
    }
}
