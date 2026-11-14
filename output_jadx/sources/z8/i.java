package z8;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v8.h1;
import v8.y0;
import v8.z0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class i extends ContinuationImpl implements y8.g {

    /* renamed from: b, reason: collision with root package name */
    public final y8.g f6886b;
    public final CoroutineContext c;
    public final int d;
    public CoroutineContext e;

    /* renamed from: f, reason: collision with root package name */
    public Continuation f6887f;

    public i(y8.g gVar, CoroutineContext coroutineContext) {
        super(g.f6884b, EmptyCoroutineContext.INSTANCE);
        this.f6886b = gVar;
        this.c = coroutineContext;
        this.d = ((Number) coroutineContext.fold(0, h.f6885b)).intValue();
    }

    public final Object c(Continuation continuation, Object obj) {
        CoroutineContext coroutineContext = continuation.get$context();
        z0 z0Var = (z0) coroutineContext.get(y0.f6058b);
        if (z0Var != null && !z0Var.b()) {
            throw ((h1) z0Var).s();
        }
        CoroutineContext coroutineContext2 = this.e;
        if (coroutineContext2 != coroutineContext) {
            if (!(coroutineContext2 instanceof f)) {
                if (((Number) coroutineContext.fold(0, new l(this))).intValue() == this.d) {
                    this.e = coroutineContext;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.c + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((f) coroutineContext2).f6883b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f6887f = continuation;
        Function3 function3 = k.f6889a;
        y8.g gVar = this.f6886b;
        gVar.getClass();
        Object invoke = function3.invoke(gVar, obj, this);
        if (!Intrinsics.areEqual(invoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.f6887f = null;
        }
        return invoke;
    }

    @Override // y8.g
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object c = c(continuation, obj);
            if (c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (c == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return c;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.e = new f(th, continuation.get$context());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f6887f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        CoroutineContext coroutineContext = this.e;
        if (coroutineContext == null) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable m98exceptionOrNullimpl = Result.m98exceptionOrNullimpl(obj);
        if (m98exceptionOrNullimpl != null) {
            this.e = new f(m98exceptionOrNullimpl, get$context());
        }
        Continuation continuation = this.f6887f;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }
}
