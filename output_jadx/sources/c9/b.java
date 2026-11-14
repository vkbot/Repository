package c9;

import a9.n;
import a9.s;
import a9.w;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import v8.a0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class b implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f587i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f588j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f589k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final w f590l = new w("NOT_IN_STACK", 0);

    @Volatile
    private volatile int _isTerminated;

    /* renamed from: b, reason: collision with root package name */
    public final int f591b;
    public final int c;

    @Volatile
    private volatile long controlState;
    public final long d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final e f592f;

    /* renamed from: g, reason: collision with root package name */
    public final e f593g;

    /* renamed from: h, reason: collision with root package name */
    public final s f594h;

    @Volatile
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r4v6, types: [c9.e, a9.n] */
    /* JADX WARN: Type inference failed for: r4v7, types: [c9.e, a9.n] */
    public b(int i10, int i11, long j10, String str) {
        this.f591b = i10;
        this.c = i11;
        this.d = j10;
        this.e = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.f592f = new n();
                        this.f593g = new n();
                        this.f594h = new s((i10 + 1) * 2);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                l9.i.d(ai.onnxruntime.a.f(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            l9.i.d(ai.onnxruntime.a.g(i11, "Max pool size ", " should be greater than or equals to core pool size ", i10));
            throw null;
        }
        l9.i.d(ai.onnxruntime.a.f(i10, "Core pool size ", " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void y(b bVar, Runnable runnable, int i10) {
        boolean z9;
        i iVar = k.f603g;
        if ((i10 & 4) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        bVar.c(runnable, iVar, z9);
    }

    public final void S(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f587i.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c = aVar.c();
                    while (true) {
                        if (c == f590l) {
                            i12 = -1;
                            break;
                        }
                        if (c == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) c;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i12 = b10;
                            break;
                        }
                        c = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f587i.compareAndSet(this, j10, i12 | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean V(long j10) {
        int coerceAtLeast = RangesKt.coerceAtLeast(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        int i10 = this.f591b;
        if (coerceAtLeast < i10) {
            int b10 = b();
            if (b10 == 1 && i10 > 1) {
                b();
            }
            if (b10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        boolean z9;
        synchronized (this.f594h) {
            try {
                if (f589k.get(this) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f588j;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int coerceAtLeast = RangesKt.coerceAtLeast(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (coerceAtLeast >= this.f591b) {
                    return 0;
                }
                if (i10 >= this.c) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.f594h.b(i11) == null) {
                    a aVar = new a(this, i11);
                    this.f594h.c(i11, aVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = coerceAtLeast + 1;
                        aVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, i iVar, boolean z9) {
        h jVar;
        boolean z10;
        long j10;
        a aVar;
        boolean a10;
        int i10;
        k.f602f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f598b = nanoTime;
            jVar.c = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z11 = false;
        if (jVar.c.f599b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f588j;
        if (z10) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !Intrinsics.areEqual(aVar.f586i, this)) {
            aVar = null;
        }
        if (aVar != null && (i10 = aVar.d) != 5 && (jVar.c.f599b != 0 || i10 != 2)) {
            aVar.f585h = true;
            m mVar = aVar.f582b;
            if (z9) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f606b.getAndSet(mVar, jVar);
                if (hVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(hVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.c.f599b == 1) {
                a10 = this.f593g.a(jVar);
            } else {
                a10 = this.f592f.a(jVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(ai.onnxruntime.a.p(new StringBuilder(), this.e, " was terminated"));
            }
        }
        if (z9 && aVar != null) {
            z11 = true;
        }
        if (z10) {
            if (!z11 && !c0() && !V(j10)) {
                c0();
                return;
            }
            return;
        }
        if (z11 || c0() || V(atomicLongFieldUpdater.get(this))) {
            return;
        }
        c0();
    }

    public final boolean c0() {
        w wVar;
        int i10;
        while (true) {
            long j10 = f587i.get(this);
            a aVar = (a) this.f594h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c = aVar.c();
                while (true) {
                    wVar = f590l;
                    if (c == wVar) {
                        i10 = -1;
                        break;
                    }
                    if (c == null) {
                        i10 = 0;
                        break;
                    }
                    a aVar2 = (a) c;
                    i10 = aVar2.b();
                    if (i10 != 0) {
                        break;
                    }
                    c = aVar2.c();
                }
                if (i10 >= 0) {
                    if (f587i.compareAndSet(this, j10, i10 | j11)) {
                        aVar.g(wVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f581j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = c9.b.f589k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof c9.a
            r3 = 0
            if (r1 == 0) goto L17
            c9.a r0 = (c9.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            c9.b r1 = r0.f586i
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            a9.s r1 = r8.f594h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = c9.b.f588j     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L36:
            a9.s r5 = r8.f594h
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            c9.a r5 = (c9.a) r5
            if (r5 == r0) goto L71
        L43:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L52:
            c9.m r5 = r5.f582b
            c9.e r6 = r8.f593g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = c9.m.f606b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            c9.h r7 = (c9.h) r7
            if (r7 == 0) goto L66
            r6.a(r7)
        L66:
            c9.h r7 = r5.b()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.a(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L36
        L76:
            c9.e r1 = r8.f593g
            r1.b()
            c9.e r1 = r8.f592f
            r1.b()
        L80:
            if (r0 == 0) goto L88
            c9.h r1 = r0.a(r2)
            if (r1 != 0) goto Laf
        L88:
            c9.e r1 = r8.f592f
            java.lang.Object r1 = r1.d()
            c9.h r1 = (c9.h) r1
            if (r1 != 0) goto Laf
            c9.e r1 = r8.f593g
            java.lang.Object r1 = r1.d()
            c9.h r1 = (c9.h) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c9.b.f587i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c9.b.f588j
            r0.set(r8, r1)
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L80
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.b.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y(this, runnable, 6);
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f594h;
        int a10 = sVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a10; i16++) {
            a aVar = (a) sVar.b(i16);
            if (aVar != null) {
                m mVar = aVar.f582b;
                mVar.getClass();
                if (m.f606b.get(mVar) != null) {
                    i10 = (m.c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i10 = m.c.get(mVar) - m.d.get(mVar);
                }
                int c = com.bumptech.glide.g.c(aVar.d);
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c == 4) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (i10 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i10);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i10);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i10);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j10 = f588j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.e);
        sb4.append('@');
        sb4.append(a0.a(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f591b;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.c);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i11);
        sb4.append(", blocking = ");
        sb4.append(i12);
        sb4.append(", parked = ");
        sb4.append(i13);
        sb4.append(", dormant = ");
        sb4.append(i14);
        sb4.append(", terminated = ");
        sb4.append(i15);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f592f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f593g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
