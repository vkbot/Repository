package v8;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class e extends f0 implements d, CoroutineStackFrame, u1 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6017g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_decisionAndIndex");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6018h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6019i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_parentHandle");

    @Volatile
    private volatile int _decisionAndIndex;

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;
    public final Continuation e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineContext f6020f;

    public e(int i10, Continuation continuation) {
        super(i10);
        this.e = continuation;
        this.f6020f = continuation.get$context();
        this._decisionAndIndex = 536870911;
        this._state = b.f6012b;
    }

    public static void w(l1 l1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + l1Var + ", already has " + obj).toString());
    }

    public static Object z(l1 l1Var, Object obj, int i10, Function1 function1) {
        j0 j0Var;
        if (obj instanceof k) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (function1 == null && !(l1Var instanceof j0)) {
            return obj;
        }
        if (l1Var instanceof j0) {
            j0Var = (j0) l1Var;
        } else {
            j0Var = null;
        }
        return new j(obj, j0Var, function1, (CancellationException) null, 16);
    }

    @Override // v8.d
    public final a9.w a(Object obj, Function1 function1) {
        a9.w wVar = a0.f6005a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6018h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof l1) {
                Object z9 = z((l1) obj2, obj, this.d, function1);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, z9)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    o();
                }
                return wVar;
            }
            return null;
        }
    }

    @Override // v8.u1
    public final void b(a9.u uVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f6017g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                j1.i.l("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        u(uVar);
    }

    @Override // v8.f0
    public final void c(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6018h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof l1)) {
                if (!(obj2 instanceof k)) {
                    if (obj2 instanceof j) {
                        j jVar = (j) obj2;
                        if (jVar.e == null) {
                            j a10 = j.a(jVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            j0 j0Var = jVar.f6034b;
                            if (j0Var != null) {
                                k(j0Var, cancellationException);
                            }
                            Function1 function1 = jVar.c;
                            if (function1 != null) {
                                l(function1, cancellationException);
                                return;
                            }
                            return;
                        }
                        j1.i.l("Must be called at most once");
                        return;
                    }
                    cancellationException2 = cancellationException;
                    j jVar2 = new j(obj2, (j0) null, (Function1) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                j1.i.l("Not completed");
                return;
            }
        }
    }

    @Override // v8.d
    public final void d(Object obj, Function1 function1) {
        y(obj, this.d, function1);
    }

    @Override // v8.f0
    public final Continuation e() {
        return this.e;
    }

    @Override // v8.f0
    public final Throwable f(Object obj) {
        Throwable f8 = super.f(obj);
        if (f8 != null) {
            return f8;
        }
        return null;
    }

    @Override // v8.d
    public final void g(Object obj) {
        p(this.d);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final CoroutineContext get$context() {
        return this.f6020f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v8.f0
    public final Object h(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).f6033a;
        }
        return obj;
    }

    @Override // v8.f0
    public final Object j() {
        return f6018h.get(this);
    }

    public final void k(j0 j0Var, Throwable th) {
        try {
            j0Var.a(th);
        } catch (Throwable th2) {
            w.a(new a8.a("Exception in invokeOnCancellation handler for " + this, 6, th2), this.f6020f);
        }
    }

    public final void l(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            w.a(new a8.a("Exception in resume onCancellation handler for " + this, 6, th2), this.f6020f);
        }
    }

    public final void m(a9.u uVar, Throwable th) {
        CoroutineContext coroutineContext = this.f6020f;
        int i10 = f6017g.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                uVar.g(i10, coroutineContext);
                return;
            } catch (Throwable th2) {
                w.a(new a8.a("Exception in invokeOnCancellation handler for " + this, 6, th2), coroutineContext);
                return;
            }
        }
        j1.i.l("The index for Segment.onCancellation(..) is broken");
    }

    public final void n(Throwable th) {
        boolean z9;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6018h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof l1)) {
                return;
            }
            if (!(obj instanceof j0) && !(obj instanceof a9.u)) {
                z9 = false;
            } else {
                z9 = true;
            }
            f fVar = new f(this, th, z9);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, fVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            l1 l1Var = (l1) obj;
            if (l1Var instanceof j0) {
                k((j0) obj, th);
            } else if (l1Var instanceof a9.u) {
                m((a9.u) obj, th);
            }
            if (!v()) {
                o();
            }
            p(this.d);
            return;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6019i;
        i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
        if (i0Var == null) {
            return;
        }
        i0Var.dispose();
        atomicReferenceFieldUpdater.set(this, k1.f6039b);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z9;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f6017g;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    boolean z11 = false;
                    if (i10 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    Continuation continuation = this.e;
                    if (!z9 && (continuation instanceof a9.h)) {
                        if (i10 != 1 && i10 != 2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i13 = this.d;
                        if (i13 == 1 || i13 == 2) {
                            z11 = true;
                        }
                        if (z10 == z11) {
                            a9.h hVar = (a9.h) continuation;
                            t tVar = hVar.e;
                            CoroutineContext coroutineContext = hVar.f72f.get$context();
                            if (tVar.isDispatchNeeded(coroutineContext)) {
                                tVar.dispatch(coroutineContext, this);
                                return;
                            }
                            l0 a10 = q1.a();
                            if (a10.f6040b >= 4294967296L) {
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
                                g0.a(this, continuation, true);
                                do {
                                } while (a10.V());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    g0.a(this, continuation, z9);
                    return;
                }
                j1.i.l("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, BasicMeasure.EXACTLY + (536870911 & i11)));
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        z0 z0Var;
        boolean v9 = v();
        do {
            atomicIntegerFieldUpdater = f6017g;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    if (v9) {
                        x();
                    }
                    Object obj = f6018h.get(this);
                    if (!(obj instanceof k)) {
                        int i12 = this.d;
                        if ((i12 == 1 || i12 == 2) && (z0Var = (z0) this.f6020f.get(y0.f6058b)) != null && !z0Var.b()) {
                            CancellationException s5 = ((h1) z0Var).s();
                            c(obj, s5);
                            throw s5;
                        }
                        return h(obj);
                    }
                    throw ((k) obj).f6037a;
                }
                j1.i.l("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((i0) f6019i.get(this)) == null) {
            s();
        }
        if (v9) {
            x();
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final void r() {
        i0 s5 = s();
        if (s5 != null && !(f6018h.get(this) instanceof l1)) {
            s5.dispose();
            f6019i.set(this, k1.f6039b);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable m98exceptionOrNullimpl = Result.m98exceptionOrNullimpl(obj);
        if (m98exceptionOrNullimpl != null) {
            obj = new k(false, m98exceptionOrNullimpl);
        }
        y(obj, this.d, null);
    }

    public final i0 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z0 z0Var = (z0) this.f6020f.get(y0.f6058b);
        if (z0Var == null) {
            return null;
        }
        i0 a10 = x0.a(z0Var, new g(this), 2);
        do {
            atomicReferenceFieldUpdater = f6019i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, a10)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return a10;
    }

    public final void t(Function1 function1) {
        j0 j0Var;
        if (function1 instanceof j0) {
            j0Var = (j0) function1;
        } else {
            j0Var = new j0(1, function1);
        }
        u(j0Var);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(a0.d(this.e));
        sb.append("){");
        Object obj = f6018h.get(this);
        if (obj instanceof l1) {
            str = "Active";
        } else if (obj instanceof f) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(a0.a(this));
        return sb.toString();
    }

    public final void u(l1 l1Var) {
        boolean z9;
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6018h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z11 = true;
            if (obj instanceof j0) {
                z9 = true;
            } else {
                z9 = obj instanceof a9.u;
            }
            if (!z9) {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    if (k.f6036b.compareAndSet(kVar, 0, 1)) {
                        if (obj instanceof f) {
                            Throwable th = kVar.f6037a;
                            if (l1Var instanceof j0) {
                                k((j0) l1Var, th);
                                return;
                            } else {
                                m((a9.u) l1Var, th);
                                return;
                            }
                        }
                        return;
                    }
                    w(l1Var, obj);
                    throw null;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    if (jVar.f6034b == null) {
                        if (!(l1Var instanceof a9.u)) {
                            j0 j0Var = (j0) l1Var;
                            Throwable th2 = jVar.e;
                            if (th2 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                k(j0Var, th2);
                                return;
                            }
                            j a10 = j.a(jVar, j0Var, null, 29);
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a10)) {
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    z11 = false;
                                    break;
                                }
                            }
                            if (z11) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        w(l1Var, obj);
                        throw null;
                    }
                } else if (!(l1Var instanceof a9.u)) {
                    j jVar2 = new j(obj, (j0) l1Var, (Function1) null, (CancellationException) null, 28);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, jVar2)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                w(l1Var, obj);
                throw null;
            }
        }
    }

    public final boolean v() {
        if (this.d == 2) {
            Continuation continuation = this.e;
            continuation.getClass();
            a9.h hVar = (a9.h) continuation;
            hVar.getClass();
            if (a9.h.f71i.get(hVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x() {
        a9.h hVar;
        Continuation continuation = this.e;
        Throwable th = null;
        if (continuation instanceof a9.h) {
            hVar = (a9.h) continuation;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.h.f71i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                a9.w wVar = a9.a.c;
                if (obj != wVar) {
                    if (!(obj instanceof Throwable)) {
                        org.apache.commons.net.ftp.a.c(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            j1.i.k("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, wVar, this)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != wVar) {
                        break;
                    }
                }
            }
            if (th != null) {
                o();
                n(th);
            }
        }
    }

    public final void y(Object obj, int i10, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6018h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof l1) {
                Object z9 = z((l1) obj2, obj, i10, function1);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, z9)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    o();
                }
                p(i10);
                return;
            }
            if (obj2 instanceof f) {
                f fVar = (f) obj2;
                if (f.c.compareAndSet(fVar, 0, 1)) {
                    if (function1 != null) {
                        l(function1, fVar.f6037a);
                        return;
                    }
                    return;
                }
            }
            org.apache.commons.net.ftp.a.c(obj, "Already resumed, but proposed with update ");
            return;
        }
    }
}
