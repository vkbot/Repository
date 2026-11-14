package v8;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a extends h1 implements Continuation, x {
    public final CoroutineContext d;

    public a(CoroutineContext coroutineContext, boolean z9) {
        super(z9);
        z((z0) coroutineContext.get(y0.f6058b));
        this.d = coroutineContext.plus(this);
    }

    @Override // v8.h1
    public final void E(Object obj) {
        boolean z9;
        if (obj instanceof k) {
            k kVar = (k) obj;
            Throwable th = kVar.f6037a;
            if (k.f6036b.get(kVar) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            J(z9, th);
            return;
        }
        K(obj);
    }

    public final void L(int i10, a aVar, Function2 function2) {
        int c = com.bumptech.glide.g.c(i10);
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(this);
                        try {
                            CoroutineContext coroutineContext = this.d;
                            Object b10 = a9.b0.b(coroutineContext, null);
                            try {
                                Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(aVar, probeCoroutineCreated);
                                if (invoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    probeCoroutineCreated.resumeWith(Result.m95constructorimpl(invoke));
                                    return;
                                }
                                return;
                            } finally {
                                a9.b0.a(coroutineContext, b10);
                            }
                        } catch (Throwable th) {
                            Result.Companion companion = Result.INSTANCE;
                            probeCoroutineCreated.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(th)));
                            return;
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ContinuationKt.startCoroutine(function2, aVar, this);
                return;
            }
            return;
        }
        b9.a.a(function2, aVar, this);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.d;
    }

    @Override // v8.x
    public final CoroutineContext getCoroutineContext() {
        return this.d;
    }

    @Override // v8.h1
    public final String n() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m98exceptionOrNullimpl = Result.m98exceptionOrNullimpl(obj);
        if (m98exceptionOrNullimpl != null) {
            obj = new k(false, m98exceptionOrNullimpl);
        }
        Object B = B(obj);
        if (B == a0.d) {
            return;
        }
        j(B);
    }

    @Override // v8.h1
    public final void y(a8.a aVar) {
        w.a(aVar, this.d);
    }

    public void K(Object obj) {
    }

    public void J(boolean z9, Throwable th) {
    }
}
