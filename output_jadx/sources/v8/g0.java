package v8;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class g0 {
    public static final void a(e eVar, Continuation continuation, boolean z9) {
        Object h2;
        s1 s1Var;
        Object obj = e.f6018h.get(eVar);
        Throwable f8 = eVar.f(obj);
        if (f8 != null) {
            Result.Companion companion = Result.INSTANCE;
            h2 = ResultKt.createFailure(f8);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            h2 = eVar.h(obj);
        }
        Object m95constructorimpl = Result.m95constructorimpl(h2);
        if (z9) {
            continuation.getClass();
            a9.h hVar = (a9.h) continuation;
            Continuation continuation2 = hVar.f72f;
            Object obj2 = hVar.f74h;
            CoroutineContext coroutineContext = continuation2.get$context();
            Object b10 = a9.b0.b(coroutineContext, obj2);
            if (b10 != a9.b0.f61a) {
                s1Var = q.b(continuation2, coroutineContext, b10);
            } else {
                s1Var = null;
            }
            try {
                continuation2.resumeWith(m95constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (s1Var != null && !s1Var.M()) {
                    return;
                }
                a9.b0.a(coroutineContext, b10);
                return;
            } catch (Throwable th) {
                if (s1Var == null || s1Var.M()) {
                    a9.b0.a(coroutineContext, b10);
                }
                throw th;
            }
        }
        continuation.resumeWith(m95constructorimpl);
    }
}
