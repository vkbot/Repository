package v8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class n0 extends o0 implements d0 {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_queue");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6042f = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_delayed");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6043g = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_isCompleted");

    @Volatile
    private volatile Object _delayed;

    @Volatile
    private volatile int _isCompleted = 0;

    @Volatile
    private volatile Object _queue;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r6 = c0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = v8.n0.e
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = v8.n0.f6043g
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof a9.p
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            a9.p r2 = (a9.p) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            a9.p r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            a9.w r2 = v8.a0.f6006b
            if (r1 != r2) goto L50
        L4a:
            v8.b0 r0 = v8.b0.f6013h
            r0.d0(r6)
            return
        L50:
            a9.p r2 = new a9.p
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.c0()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.n0.d0(java.lang.Runnable):void");
    }

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        d0(runnable);
    }

    public final boolean e0() {
        boolean z9;
        ArrayDeque arrayDeque = this.d;
        if (arrayDeque != null) {
            z9 = arrayDeque.isEmpty();
        } else {
            z9 = true;
        }
        if (z9) {
            Object obj = e.get(this);
            if (obj != null) {
                if (obj instanceof a9.p) {
                    long j10 = a9.p.f81f.get((a9.p) obj);
                    if (((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                }
                if (obj == a0.f6006b) {
                }
            }
            return true;
        }
        return false;
    }

    public final long f0() {
        Runnable runnable;
        long j10;
        if (!V()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof a9.p) {
                    a9.p pVar = (a9.p) obj;
                    Object d = pVar.d();
                    if (d != a9.p.f82g) {
                        runnable = (Runnable) d;
                        break;
                    }
                    a9.p c = pVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == a0.f6006b) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                Object obj2 = e.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof a9.p) {
                        long j11 = a9.p.f81f.get((a9.p) obj2);
                        if (((int) (1073741823 & j11)) != ((int) ((j11 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == a0.f6006b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // v8.l0
    public void shutdown() {
        ThreadLocal threadLocal = q1.f6046a;
        q1.f6046a.set(null);
        f6043g.set(this, 1);
        a9.w wVar = a0.f6006b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, wVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof a9.p) {
                    ((a9.p) obj).b();
                    break;
                }
                if (obj != wVar) {
                    a9.p pVar = new a9.p(8, true);
                    pVar.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (f0() <= 0);
        System.nanoTime();
    }
}
