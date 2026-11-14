package x8;

import a9.w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import v8.a1;
import v8.f1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class g extends v8.a implements f {
    public final b e;

    public g(CoroutineContext coroutineContext, b bVar) {
        super(coroutineContext, true);
        this.e = bVar;
    }

    public final void M(d9.h hVar) {
        b bVar = this.e;
        bVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f6515k;
        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, hVar)) {
            if (atomicReferenceFieldUpdater.get(bVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(bVar);
                    w wVar = d.f6531q;
                    if (obj == wVar) {
                        w wVar2 = d.r;
                        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, wVar, wVar2)) {
                            if (atomicReferenceFieldUpdater.get(bVar) != wVar) {
                                break;
                            }
                        }
                        hVar.invoke(bVar.m());
                        return;
                    }
                    if (obj == d.r) {
                        j1.i.l("Another handler was already registered and successfully invoked");
                        return;
                    } else {
                        org.apache.commons.net.ftp.a.c(obj, "Another handler is already registered: ");
                        return;
                    }
                }
            }
        }
    }

    @Override // v8.h1, v8.z0
    public final void c(CancellationException cancellationException) {
        Object w = w();
        if (!(w instanceof v8.k)) {
            if (!(w instanceof f1) || !((f1) w).e()) {
                if (cancellationException == null) {
                    cancellationException = new a1(n(), null, this);
                }
                l(cancellationException);
            }
        }
    }

    @Override // x8.r
    public final Object e(Object obj) {
        return this.e.e(obj);
    }

    @Override // x8.r
    public final Object f(Object obj, Continuation continuation) {
        return this.e.f(obj, continuation);
    }

    @Override // v8.h1
    public final void l(CancellationException cancellationException) {
        this.e.h(true, cancellationException);
        k(cancellationException);
    }
}
