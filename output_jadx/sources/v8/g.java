package v8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class g extends b1 {

    /* renamed from: f, reason: collision with root package name */
    public final e f6027f;

    public g(e eVar) {
        this.f6027f = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // v8.d1
    public final void j(Throwable th) {
        CancellationException s5 = i().s();
        e eVar = this.f6027f;
        if (eVar.v()) {
            Continuation continuation = eVar.e;
            continuation.getClass();
            a9.h hVar = (a9.h) continuation;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.h.f71i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                a9.w wVar = a9.a.c;
                if (Intrinsics.areEqual(obj, wVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, wVar, s5)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != wVar) {
                            break;
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
            }
        }
        eVar.n(s5);
        if (!eVar.v()) {
            eVar.o();
        }
    }
}
