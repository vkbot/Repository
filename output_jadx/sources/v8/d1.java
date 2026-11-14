package v8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class d1 extends a9.m implements i0, u0, Function1 {
    public h1 e;

    @Override // v8.u0
    public final boolean b() {
        return true;
    }

    @Override // v8.u0
    public final j1 c() {
        return null;
    }

    @Override // v8.i0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 i10 = i();
        while (true) {
            Object w = i10.w();
            if (w instanceof d1) {
                if (w == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h1.f6031b;
                    k0 k0Var = a0.f6010i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(i10, w, k0Var)) {
                        if (atomicReferenceFieldUpdater2.get(i10) != w) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (!(w instanceof u0) || ((u0) w).c() == null) {
                return;
            }
            while (true) {
                Object f8 = f();
                if (!(f8 instanceof a9.r)) {
                    if (f8 == this) {
                        return;
                    }
                    f8.getClass();
                    a9.m mVar = (a9.m) f8;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a9.m.d;
                    a9.r rVar = (a9.r) atomicReferenceFieldUpdater3.get(mVar);
                    if (rVar == null) {
                        rVar = new a9.r(mVar);
                        atomicReferenceFieldUpdater3.lazySet(mVar, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = a9.m.f78b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f8, rVar)) {
                            mVar.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f8);
                } else {
                    return;
                }
            }
        }
    }

    public z0 getParent() {
        return i();
    }

    public final h1 i() {
        h1 h1Var = this.e;
        if (h1Var != null) {
            return h1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract void j(Throwable th);

    @Override // a9.m
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.a(this) + "[job@" + a0.a(i()) + ']';
    }
}
