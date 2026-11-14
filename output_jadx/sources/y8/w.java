package y8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class w extends z8.c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6680a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");

    @Volatile
    private volatile Object _state;

    @Override // z8.c
    public final boolean a(z8.a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6680a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, r.f6671b);
        return true;
    }

    @Override // z8.c
    public final Continuation[] b(z8.a aVar) {
        f6680a.set(this, null);
        return z8.b.f6879a;
    }

    public final Object c(u uVar) {
        v8.e eVar = new v8.e(1, IntrinsicsKt.intercepted(uVar));
        eVar.r();
        a9.w wVar = r.f6671b;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6680a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, wVar, eVar)) {
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != wVar) {
                Result.Companion companion = Result.INSTANCE;
                eVar.resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
                break;
            }
        }
        Object q8 = eVar.q();
        if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(uVar);
        }
        if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return q8;
        }
        return Unit.INSTANCE;
    }
}
