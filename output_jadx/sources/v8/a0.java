package v8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a9.w f6005a = new a9.w("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a9.w f6006b = new a9.w("CLOSED_EMPTY", 0);
    public static final a9.w c = new a9.w("COMPLETING_ALREADY", 0);
    public static final a9.w d = new a9.w("COMPLETING_WAITING_CHILDREN", 0);
    public static final a9.w e = new a9.w("COMPLETING_RETRY", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final a9.w f6007f = new a9.w("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a9.w f6008g = new a9.w("SEALED", 0);

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f6009h = new k0(false);

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f6010i = new k0(true);

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final e b(Continuation continuation) {
        e eVar;
        e eVar2;
        if (!(continuation instanceof a9.h)) {
            return new e(1, continuation);
        }
        a9.h hVar = (a9.h) continuation;
        a9.w wVar = a9.a.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.h.f71i;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            eVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, wVar);
                eVar2 = null;
                break;
            }
            if (obj instanceof e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, wVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                eVar2 = (e) obj;
                break loop0;
            }
            if (obj != wVar && !(obj instanceof Throwable)) {
                org.apache.commons.net.ftp.a.c(obj, "Inconsistent state ");
                return null;
            }
        }
        if (eVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e.f6018h;
            Object obj2 = atomicReferenceFieldUpdater2.get(eVar2);
            if ((obj2 instanceof j) && ((j) obj2).d != null) {
                eVar2.o();
            } else {
                e.f6017g.set(eVar2, 536870911);
                atomicReferenceFieldUpdater2.set(eVar2, b.f6012b);
                eVar = eVar2;
            }
            if (eVar != null) {
                return eVar;
            }
        }
        return new e(2, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [v8.a, v8.n1] */
    public static n1 c(x xVar, w8.c cVar, Function2 function2, int i10) {
        CoroutineContext coroutineContext = cVar;
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext a10 = q.a(xVar.getCoroutineContext(), coroutineContext, true);
        c9.d dVar = h0.f6029a;
        if (a10 != dVar && a10.get(ContinuationInterceptor.INSTANCE) == null) {
            a10 = a10.plus(dVar);
        }
        ?? aVar = new a(a10, true);
        aVar.L(1, aVar, function2);
        return aVar;
    }

    public static final String d(Continuation continuation) {
        Object m95constructorimpl;
        if (continuation instanceof a9.h) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m95constructorimpl = Result.m95constructorimpl(continuation + '@' + a(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m95constructorimpl = Result.m95constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m98exceptionOrNullimpl(m95constructorimpl) != null) {
            m95constructorimpl = continuation.getClass().getName() + '@' + a(continuation);
        }
        return (String) m95constructorimpl;
    }

    public static final Object e(t tVar, Function2 function2, Continuation continuation) {
        CoroutineContext a10;
        Object w;
        u0 u0Var;
        CoroutineContext coroutineContext = continuation.get$context();
        if (!((Boolean) tVar.fold(Boolean.FALSE, p.f6044b)).booleanValue()) {
            a10 = coroutineContext.plus(tVar);
        } else {
            a10 = q.a(coroutineContext, tVar, false);
        }
        z0 z0Var = (z0) a10.get(y0.f6058b);
        if (z0Var != null && !z0Var.b()) {
            throw ((h1) z0Var).s();
        }
        if (a10 == coroutineContext) {
            a9.t tVar2 = new a9.t(continuation, a10);
            w = b1.u.y(tVar2, tVar2, function2);
        } else {
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            boolean areEqual = Intrinsics.areEqual(a10.get(companion), coroutineContext.get(companion));
            v0 v0Var = null;
            if (areEqual) {
                s1 s1Var = new s1(continuation, a10);
                CoroutineContext coroutineContext2 = s1Var.d;
                Object b10 = a9.b0.b(coroutineContext2, null);
                try {
                    Object y9 = b1.u.y(s1Var, s1Var, function2);
                    a9.b0.a(coroutineContext2, b10);
                    w = y9;
                } catch (Throwable th) {
                    a9.b0.a(coroutineContext2, b10);
                    throw th;
                }
            } else {
                a9.t tVar3 = new a9.t(continuation, a10);
                b9.a.a(function2, tVar3, tVar3);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0.f6021f;
                while (true) {
                    int i10 = atomicIntegerFieldUpdater.get(tVar3);
                    if (i10 != 0) {
                        if (i10 == 2) {
                            w = tVar3.w();
                            if (w instanceof v0) {
                                v0Var = (v0) w;
                            }
                            if (v0Var != null && (u0Var = v0Var.f6054a) != null) {
                                w = u0Var;
                            }
                            if (w instanceof k) {
                                throw ((k) w).f6037a;
                            }
                        } else {
                            j1.i.l("Already suspended");
                            return null;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(tVar3, 0, 1)) {
                        w = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        break;
                    }
                }
            }
        }
        if (w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return w;
    }
}
