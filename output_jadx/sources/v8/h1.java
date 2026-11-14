package v8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class h1 implements z0, m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6031b = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_parentHandle");

    @Volatile
    private volatile Object _parentHandle;

    @Volatile
    private volatile Object _state;

    public h1(boolean z9) {
        k0 k0Var;
        if (z9) {
            k0Var = a0.f6010i;
        } else {
            k0Var = a0.f6009h;
        }
        this._state = k0Var;
    }

    public static i C(a9.m mVar) {
        while (mVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.m.c;
            a9.m d = mVar.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(mVar);
                while (true) {
                    mVar = (a9.m) obj;
                    if (!mVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVar);
                }
            } else {
                mVar = d;
            }
        }
        while (true) {
            mVar = mVar.g();
            if (!mVar.h()) {
                if (mVar instanceof i) {
                    return (i) mVar;
                }
                if (mVar instanceof j1) {
                    return null;
                }
            }
        }
    }

    public static String H(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (f1Var.e()) {
                return "Cancelling";
            }
            if (f1Var.f()) {
                return "Completing";
            }
            return "Active";
        }
        if (obj instanceof u0) {
            if (((u0) obj).b()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof k) {
            return "Cancelled";
        }
        return "Completed";
    }

    public boolean A() {
        return false;
    }

    public final Object B(Object obj) {
        Object I;
        k kVar;
        do {
            I = I(w(), obj);
            if (I == a0.c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof k) {
                    kVar = (k) obj;
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    th = kVar.f6037a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (I == a0.e);
        return I;
    }

    public final void D(j1 j1Var, Throwable th) {
        Object f8 = j1Var.f();
        f8.getClass();
        a8.a aVar = null;
        for (a9.m mVar = (a9.m) f8; !Intrinsics.areEqual(mVar, j1Var); mVar = mVar.g()) {
            if (mVar instanceof b1) {
                d1 d1Var = (d1) mVar;
                try {
                    d1Var.j(th);
                } catch (Throwable th2) {
                    if (aVar != null) {
                        ExceptionsKt.addSuppressed(aVar, th2);
                    } else {
                        aVar = new a8.a("Exception in completion handler " + d1Var + " for " + this, 6, th2);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (aVar != null) {
            y(aVar);
        }
        m(th);
    }

    public final void G(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a9.m mVar = new a9.m();
        d1Var.getClass();
        a9.m.c.lazySet(mVar, d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a9.m.f78b;
        atomicReferenceFieldUpdater2.lazySet(mVar, d1Var);
        loop0: while (true) {
            if (d1Var.f() != d1Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(d1Var, d1Var, mVar)) {
                if (atomicReferenceFieldUpdater2.get(d1Var) != d1Var) {
                    break;
                }
            }
            mVar.e(d1Var);
        }
        a9.m g10 = d1Var.g();
        do {
            atomicReferenceFieldUpdater = f6031b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d1Var, g10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == d1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d7, code lost:
    
        if (v8.x0.a(r2.f6032f, new v8.e1(r7, r1, r2, r9), 1) == v8.k1.f6039b) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
    
        r2 = C(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e0, code lost:
    
        if (r2 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
    
        return v8.a0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e6, code lost:
    
        return r(r1, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Throwable, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.h1.I(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // v8.z0
    public boolean b() {
        Object w = w();
        if ((w instanceof u0) && ((u0) w).b()) {
            return true;
        }
        return false;
    }

    @Override // v8.z0
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a1(n(), null, this);
        }
        l(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return y0.f6058b;
    }

    public final boolean h(u0 u0Var, j1 j1Var, d1 d1Var) {
        a9.m d;
        g1 g1Var = new g1(d1Var, this, u0Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a9.m.c;
            d = j1Var.d();
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(j1Var);
                while (true) {
                    d = (a9.m) obj;
                    if (!d.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            a9.m.c.lazySet(d1Var, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a9.m.f78b;
            atomicReferenceFieldUpdater2.lazySet(d1Var, j1Var);
            g1Var.c = j1Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(d, j1Var, g1Var)) {
                if (atomicReferenceFieldUpdater2.get(d) != j1Var) {
                    break;
                }
            }
        }
        if (g1Var.b(d) == null) {
            return true;
        }
        return false;
    }

    public void j(Object obj) {
        i(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = v8.a0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != v8.a0.d) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ea, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = I(r0, new v8.k(false, q(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == v8.a0.e) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r0 != v8.a0.c) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r4 = w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r4 instanceof v8.f1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if ((r4 instanceof v8.u0) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r1 = q(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        r5 = (v8.u0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (u() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r5.b() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        r5 = I(r4, new v8.k(false, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r5 == v8.a0.c) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (r5 == v8.a0.e) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        org.apache.commons.net.ftp.a.c(r4, "Cannot happen in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        r6 = v(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        if (r6 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        r7 = new v8.f1(r6, r1);
        r8 = v8.h1.f6031b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r8.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof v8.u0) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r8.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        D(r6, r1);
        r10 = v8.a0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0059, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
    
        r10 = v8.a0.f6007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0048, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
    
        if (v8.f1.e.get((v8.f1) r4) != v8.a0.f6008g) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0056, code lost:
    
        r10 = v8.a0.f6007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0058, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005e, code lost:
    
        r5 = ((v8.f1) r4).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0065, code lost:
    
        if (r10 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0067, code lost:
    
        if (r5 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof v8.f1) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0075, code lost:
    
        r10 = ((v8.f1) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007c, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007e, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007f, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0080, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0082, code lost:
    
        D(((v8.f1) r4).f6026b, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0089, code lost:
    
        r10 = v8.a0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0069, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x006b, code lost:
    
        r1 = q(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x006f, code lost:
    
        ((v8.f1) r4).a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e3, code lost:
    
        if (r0 != v8.a0.c) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e8, code lost:
    
        if (r0 != v8.a0.d) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ed, code lost:
    
        if (r0 != v8.a0.f6007f) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ef, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f0, code lost:
    
        i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((v8.f1) r0).f() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f3, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.h1.k(java.lang.Object):boolean");
    }

    public void l(CancellationException cancellationException) {
        k(cancellationException);
    }

    public final boolean m(Throwable th) {
        if (!A()) {
            boolean z9 = th instanceof CancellationException;
            h hVar = (h) c.get(this);
            if (hVar != null && hVar != k1.f6039b) {
                if (!hVar.a(th) && !z9) {
                    return false;
                }
                return true;
            }
            return z9;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    public String n() {
        return "Job was cancelled";
    }

    public boolean o(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (k(th) && t()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void p(u0 u0Var, Object obj) {
        k kVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        h hVar = (h) atomicReferenceFieldUpdater.get(this);
        if (hVar != null) {
            hVar.dispose();
            atomicReferenceFieldUpdater.set(this, k1.f6039b);
        }
        a8.a aVar = null;
        if (obj instanceof k) {
            kVar = (k) obj;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            th = kVar.f6037a;
        } else {
            th = null;
        }
        if (u0Var instanceof d1) {
            try {
                ((d1) u0Var).j(th);
                return;
            } catch (Throwable th2) {
                y(new a8.a("Exception in completion handler " + u0Var + " for " + this, 6, th2));
                return;
            }
        }
        j1 c10 = u0Var.c();
        if (c10 != null) {
            Object f8 = c10.f();
            f8.getClass();
            for (a9.m mVar = (a9.m) f8; !Intrinsics.areEqual(mVar, c10); mVar = mVar.g()) {
                if (mVar instanceof d1) {
                    d1 d1Var = (d1) mVar;
                    try {
                        d1Var.j(th);
                    } catch (Throwable th3) {
                        if (aVar != null) {
                            ExceptionsKt.addSuppressed(aVar, th3);
                        } else {
                            aVar = new a8.a("Exception in completion handler " + d1Var + " for " + this, 6, th3);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (aVar != null) {
                y(aVar);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    public final Throwable q(Object obj) {
        boolean z9;
        CancellationException cancellationException;
        if (obj == null) {
            z9 = true;
        } else {
            z9 = obj instanceof Throwable;
        }
        CancellationException cancellationException2 = null;
        if (z9) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new a1(n(), null, this);
            }
            return th;
        }
        obj.getClass();
        h1 h1Var = (h1) ((m1) obj);
        Object w = h1Var.w();
        if (w instanceof f1) {
            cancellationException = ((f1) w).d();
        } else if (w instanceof k) {
            cancellationException = ((k) w).f6037a;
        } else if (!(w instanceof u0)) {
            cancellationException = null;
        } else {
            org.apache.commons.net.ftp.a.c(w, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new a1("Parent job is ".concat(H(w)), cancellationException, h1Var);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(f1 f1Var, Object obj) {
        k kVar;
        Throwable th;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof k) {
            kVar = (k) obj;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            th = kVar.f6037a;
        } else {
            th = null;
        }
        synchronized (f1Var) {
            f1Var.e();
            ArrayList g10 = f1Var.g(th);
            if (g10.isEmpty()) {
                if (f1Var.e()) {
                    th2 = new a1(n(), null, this);
                }
            } else {
                int size = g10.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj3 = g10.get(i10);
                    i10++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        th2 = obj3;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) g10.get(0);
                }
            }
            if (th2 != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                int size2 = g10.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj4 = g10.get(i11);
                    i11++;
                    Throwable th3 = (Throwable) obj4;
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        ExceptionsKt.addSuppressed(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new k(false, th2);
        }
        if (th2 != null && (m(th2) || x(th2))) {
            obj.getClass();
            k.f6036b.compareAndSet((k) obj, 0, 1);
        }
        E(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6031b;
        if (obj instanceof u0) {
            obj2 = new v0((u0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, f1Var, obj2) && atomicReferenceFieldUpdater.get(this) == f1Var) {
        }
        p(f1Var, obj);
        return obj;
    }

    public final CancellationException s() {
        Object w = w();
        CancellationException cancellationException = null;
        if (w instanceof f1) {
            Throwable d = ((f1) w).d();
            if (d != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (d instanceof CancellationException) {
                    cancellationException = (CancellationException) d;
                }
                if (cancellationException == null) {
                    return new a1(concat, d, this);
                }
                return cancellationException;
            }
            org.apache.commons.net.ftp.a.c(this, "Job is still new or active: ");
            return null;
        }
        if (!(w instanceof u0)) {
            if (w instanceof k) {
                Throwable th = ((k) w).f6037a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new a1(n(), th, this);
                }
                return cancellationException;
            }
            return new a1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        org.apache.commons.net.ftp.a.c(this, "Job is still new or active: ");
        return null;
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + H(w()) + '}');
        sb.append('@');
        sb.append(a0.a(this));
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [v8.j1, a9.m] */
    public final j1 v(u0 u0Var) {
        j1 c10 = u0Var.c();
        if (c10 == null) {
            if (u0Var instanceof k0) {
                return new a9.m();
            }
            if (u0Var instanceof d1) {
                G((d1) u0Var);
                return null;
            }
            org.apache.commons.net.ftp.a.c(u0Var, "State should have list: ");
            return null;
        }
        return c10;
    }

    public final Object w() {
        while (true) {
            Object obj = f6031b.get(this);
            if (!(obj instanceof a9.b)) {
                return obj;
            }
            ((a9.b) obj).b(this);
        }
    }

    public boolean x(Throwable th) {
        return false;
    }

    public final void z(z0 z0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        k1 k1Var = k1.f6039b;
        if (z0Var == null) {
            atomicReferenceFieldUpdater.set(this, k1Var);
            return;
        }
        h1 h1Var = (h1) z0Var;
        loop0: while (true) {
            Object w = h1Var.w();
            boolean z9 = w instanceof k0;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6031b;
            if (z9) {
                if (!((k0) w).f6038b) {
                    k0 k0Var = a0.f6010i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(h1Var, w, k0Var)) {
                        if (atomicReferenceFieldUpdater2.get(h1Var) != w) {
                            break;
                        }
                    }
                    h1Var.getClass();
                    break loop0;
                }
                break;
            }
            if (!(w instanceof t0)) {
                break;
            }
            j1 j1Var = ((t0) w).f6051b;
            while (!atomicReferenceFieldUpdater2.compareAndSet(h1Var, w, j1Var)) {
                if (atomicReferenceFieldUpdater2.get(h1Var) != w) {
                    break;
                }
            }
            h1Var.getClass();
            break loop0;
        }
        h hVar = (h) x0.a(h1Var, new i(this), 2);
        atomicReferenceFieldUpdater.set(this, hVar);
        if (!(w() instanceof u0)) {
            hVar.dispose();
            atomicReferenceFieldUpdater.set(this, k1Var);
        }
    }

    public void F() {
    }

    public void E(Object obj) {
    }

    public void i(Object obj) {
    }

    public void y(a8.a aVar) {
        throw aVar;
    }
}
