package x8;

import a9.u;
import a9.w;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import v8.u1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class b implements f {
    public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f6510f = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6511g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6512h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6513i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6514j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6515k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");

    @Volatile
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f6516b;

    @Volatile
    private volatile long bufferEnd;

    @Volatile
    private volatile Object bufferEndSegment;

    @Volatile
    private volatile Object closeHandler;

    @Volatile
    private volatile long completedExpandBuffersAndPauseFlag;

    @Volatile
    private volatile Object receiveSegment;

    @Volatile
    private volatile long receivers;

    @Volatile
    private volatile Object sendSegment;

    @Volatile
    private volatile long sendersAndCloseStatus;

    public b(int i10) {
        long j10;
        this.f6516b = i10;
        if (i10 >= 0) {
            k kVar = d.f6518a;
            if (i10 != 0) {
                if (i10 != Integer.MAX_VALUE) {
                    j10 = i10;
                } else {
                    j10 = Long.MAX_VALUE;
                }
            } else {
                j10 = 0;
            }
            this.bufferEnd = j10;
            this.completedExpandBuffersAndPauseFlag = e.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment = kVar2;
            this.receiveSegment = kVar2;
            if (t()) {
                kVar2 = d.f6518a;
                kVar2.getClass();
            }
            this.bufferEndSegment = kVar2;
            this._closeCause = d.f6532s;
            return;
        }
        l9.i.d(ai.onnxruntime.a.f(i10, "Invalid channel capacity: ", ", should be >=0"));
        throw null;
    }

    public static final k a(b bVar, long j10, k kVar) {
        Object a10;
        b bVar2;
        k kVar2 = d.f6518a;
        c cVar = c.f6517b;
        loop0: while (true) {
            a10 = a9.d.a(kVar, j10, cVar);
            if (!a9.a.d(a10)) {
                u b10 = a9.a.b(a10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6511g;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.d >= b10.d) {
                        break loop0;
                    }
                    if (!b10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, b10)) {
                        if (atomicReferenceFieldUpdater.get(bVar) != uVar) {
                            if (b10.e()) {
                                b10.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean d10 = a9.a.d(a10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (d10) {
            bVar.r();
            if (kVar.d * d.f6519b < atomicLongFieldUpdater.get(bVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) a9.a.b(a10);
            long j11 = kVar3.d;
            if (j11 > j10) {
                long j12 = d.f6519b * j11;
                while (true) {
                    long j13 = c.get(bVar);
                    long j14 = 1152921504606846975L & j13;
                    if (j14 >= j12) {
                        bVar2 = bVar;
                        break;
                    }
                    bVar2 = bVar;
                    if (c.compareAndSet(bVar2, j13, (((int) (j13 >> 60)) << 60) + j14)) {
                        break;
                    }
                    bVar = bVar2;
                }
                if (j11 * d.f6519b < atomicLongFieldUpdater.get(bVar2)) {
                    kVar3.a();
                }
            } else {
                return kVar3;
            }
        }
        return null;
    }

    public static final void b(b bVar, Object obj, v8.e eVar) {
        Throwable n10 = bVar.n();
        Result.Companion companion = Result.INSTANCE;
        eVar.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(n10)));
    }

    public static final int d(b bVar, k kVar, int i10, Object obj, long j10, Object obj2, boolean z9) {
        kVar.m(i10, obj);
        if (z9) {
            return bVar.A(kVar, i10, obj, j10, obj2, z9);
        }
        Object k6 = kVar.k(i10);
        if (k6 == null) {
            if (bVar.g(j10)) {
                if (kVar.j(i10, null, d.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (k6 instanceof u1) {
            kVar.m(i10, null);
            if (bVar.x(k6, obj)) {
                kVar.n(i10, d.f6523i);
                return 0;
            }
            w wVar = d.f6525k;
            if (kVar.f6539g.getAndSet((i10 * 2) + 1, wVar) != wVar) {
                kVar.l(i10, true);
                return 5;
            }
            return 5;
        }
        return bVar.A(kVar, i10, obj, j10, obj2, z9);
    }

    public static void p(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f6510f;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
    }

    public static boolean y(Object obj) {
        if (obj instanceof v8.d) {
            v8.d dVar = (v8.d) obj;
            Unit unit = Unit.INSTANCE;
            k kVar = d.f6518a;
            w a10 = dVar.a(unit, null);
            if (a10 == null) {
                return false;
            }
            dVar.g(a10);
            return true;
        }
        org.apache.commons.net.ftp.a.c(obj, "Unexpected waiter: ");
        return false;
    }

    public final int A(k kVar, int i10, Object obj, long j10, Object obj2, boolean z9) {
        while (true) {
            Object k6 = kVar.k(i10);
            if (k6 == null) {
                if (g(j10) && !z9) {
                    if (kVar.j(i10, null, d.d)) {
                        break;
                    }
                } else if (z9) {
                    if (kVar.j(i10, null, d.f6524j)) {
                        kVar.h();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kVar.j(i10, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k6 == d.e) {
                if (kVar.j(i10, k6, d.d)) {
                    break;
                }
            } else {
                w wVar = d.f6525k;
                if (k6 == wVar) {
                    kVar.m(i10, null);
                    return 5;
                }
                if (k6 == d.f6522h) {
                    kVar.m(i10, null);
                    return 5;
                }
                if (k6 == d.f6526l) {
                    kVar.m(i10, null);
                    r();
                    return 4;
                }
                kVar.m(i10, null);
                if (k6 instanceof s) {
                    k6 = ((s) k6).f6542a;
                }
                if (x(k6, obj)) {
                    kVar.n(i10, d.f6523i);
                    return 0;
                }
                if (kVar.f6539g.getAndSet((i10 * 2) + 1, wVar) != wVar) {
                    kVar.l(i10, true);
                }
                return 5;
            }
        }
        return 1;
    }

    @Override // x8.f
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(true, cancellationException);
    }

    @Override // x8.r
    public Object e(Object obj) {
        boolean z9;
        u1 u1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j10 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j11 = 1152921504606846975L;
        if (q(j10, false)) {
            z9 = false;
        } else {
            z9 = !g(j10 & 1152921504606846975L);
        }
        i iVar = j.f6537a;
        if (z9) {
            return iVar;
        }
        b8.d dVar = d.f6524j;
        k kVar = (k) f6511g.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = andIncrement & j11;
            boolean q8 = q(andIncrement, z10);
            int i10 = d.f6519b;
            long j13 = i10;
            long j14 = j12 / j13;
            int i11 = (int) (j12 % j13);
            if (kVar.d != j14) {
                k a10 = a(this, j14, kVar);
                if (a10 == null) {
                    if (q8) {
                        return new h(n());
                    }
                    z10 = false;
                    j11 = 1152921504606846975L;
                } else {
                    kVar = a10;
                }
            }
            int d10 = d(this, kVar, i11, obj, j12, dVar, q8);
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 != 2) {
                        if (d10 != 3) {
                            if (d10 != 4) {
                                if (d10 == 5) {
                                    kVar.a();
                                }
                                z10 = false;
                                j11 = 1152921504606846975L;
                            } else {
                                if (j12 < d.get(this)) {
                                    kVar.a();
                                }
                                return new h(n());
                            }
                        } else {
                            j1.i.l("unexpected");
                            return null;
                        }
                    } else {
                        if (q8) {
                            kVar.h();
                            return new h(n());
                        }
                        if (dVar instanceof u1) {
                            u1Var = (u1) dVar;
                        } else {
                            u1Var = null;
                        }
                        if (u1Var != null) {
                            u1Var.b(kVar, i11 + i10);
                        }
                        kVar.h();
                        return iVar;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                kVar.a();
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00c4, code lost:
    
        b(r1, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01ae, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190 A[RETURN] */
    @Override // x8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.Object r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean g(long j10) {
        if (j10 >= e.get(this) && j10 >= d.get(this) + this.f6516b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r14) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r13 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = x8.b.f6515k;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = x8.d.f6531q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r13 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        r13 = (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r14, 1);
        ((kotlin.jvm.functions.Function1) r14).invoke(m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = x8.d.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = x8.d.f6518a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = x8.d.f6532s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = x8.b.f6514j;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(boolean r13, java.lang.Throwable r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = x8.b.c
            r9 = 1
            if (r13 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            x8.k r4 = x8.d.f6518a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            a9.w r5 = x8.d.f6532s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = x8.b.f6514j
            boolean r7 = r6.compareAndSet(r12, r5, r14)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r14 = 0
            r10 = r14
        L39:
            r11 = 3
            if (r13 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.r()
            if (r10 == 0) goto L9b
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = x8.b.f6515k
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            a9.w r0 = x8.d.f6531q
            goto L7b
        L79:
            a9.w r0 = x8.d.r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L94
            if (r14 != 0) goto L84
            goto L9b
        L84:
            java.lang.Object r13 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r14, r9)
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            java.lang.Throwable r13 = r12.m()
            r14.invoke(r13)
            return r10
        L94:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L9b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.h(boolean, java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (x8.k) ((a9.e) a9.e.c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x8.k i(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.i(long):x8.k");
    }

    public final void j(long j10) {
        k kVar = (k) f6512h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(this.f6516b + j11, e.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = d.f6519b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (kVar.d != j13) {
                    k l10 = l(j13, kVar);
                    if (l10 != null) {
                        kVar = l10;
                    }
                }
                k kVar2 = kVar;
                if (z(kVar2, i10, j11, null) == d.f6529o) {
                    if (j11 < o()) {
                        kVar2.a();
                    }
                } else {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bf, code lost:
    
        if ((r0.addAndGet(r15, (r11 * r13) - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c8, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.k():void");
    }

    public final k l(long j10, k kVar) {
        Object a10;
        long j11;
        k kVar2 = d.f6518a;
        c cVar = c.f6517b;
        loop0: while (true) {
            a10 = a9.d.a(kVar, j10, cVar);
            if (!a9.a.d(a10)) {
                u b10 = a9.a.b(a10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6512h;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.d >= b10.d) {
                        break loop0;
                    }
                    if (!b10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (b10.e()) {
                                b10.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (a9.a.d(a10)) {
            r();
            if (kVar.d * d.f6519b < o()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) a9.a.b(a10);
            long j12 = kVar3.d;
            if (!t() && j10 <= e.get(this) / d.f6519b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6513i;
                    u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.d >= j12) {
                        break;
                    }
                    if (!kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (uVar2.e()) {
                        uVar2.d();
                    }
                }
            }
            if (j12 > j10) {
                long j13 = j12 * d.f6519b;
                do {
                    j11 = d.get(this);
                    if (j11 >= j13) {
                        break;
                    }
                } while (!d.compareAndSet(this, j11, j13));
                if (j12 * d.f6519b < o()) {
                    kVar3.a();
                }
            } else {
                return kVar3;
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f6514j.get(this);
    }

    public final Throwable n() {
        Throwable m10 = m();
        if (m10 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return m10;
    }

    public final long o() {
        return c.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (x8.k) ((a9.e) a9.e.c.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.q(long, boolean):boolean");
    }

    public final boolean r() {
        return q(c.get(this), false);
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j10 = e.get(this);
        if (j10 != 0 && j10 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        r16 = r7;
        r3 = (x8.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b3, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(long r5, x8.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            a9.e r0 = r7.b()
            x8.k r0 = (x8.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            a9.e r5 = r7.b()
            x8.k r5 = (x8.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = x8.b.f6513i
            java.lang.Object r6 = r5.get(r4)
            a9.u r6 = (a9.u) r6
            long r0 = r6.d
            long r2 = r7.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.b.u(long, x8.k):void");
    }

    public final Object v(Object obj, Continuation continuation) {
        v8.e eVar = new v8.e(1, IntrinsicsKt.intercepted(continuation));
        eVar.r();
        Throwable n10 = n();
        Result.Companion companion = Result.INSTANCE;
        eVar.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(n10)));
        Object q8 = eVar.q();
        if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (q8 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return q8;
        }
        return Unit.INSTANCE;
    }

    public final void w(u1 u1Var, boolean z9) {
        Throwable n10;
        if (u1Var instanceof v8.d) {
            Continuation continuation = (Continuation) u1Var;
            Result.Companion companion = Result.INSTANCE;
            if (z9) {
                n10 = m();
                if (n10 == null) {
                    n10 = new NoSuchElementException("Channel was closed");
                }
            } else {
                n10 = n();
            }
            continuation.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(n10)));
            return;
        }
        if (u1Var instanceof a) {
            a aVar = (a) u1Var;
            v8.e eVar = aVar.c;
            eVar.getClass();
            aVar.c = null;
            aVar.f6509b = d.f6526l;
            Throwable m10 = aVar.d.m();
            if (m10 == null) {
                Result.Companion companion2 = Result.INSTANCE;
                eVar.resumeWith(Result.m95constructorimpl(Boolean.FALSE));
                return;
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                eVar.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(m10)));
                return;
            }
        }
        org.apache.commons.net.ftp.a.c(u1Var, "Unexpected waiter: ");
    }

    public final boolean x(Object obj, Object obj2) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            v8.e eVar = aVar.c;
            eVar.getClass();
            aVar.c = null;
            aVar.f6509b = obj2;
            Boolean bool = Boolean.TRUE;
            k kVar = d.f6518a;
            w a10 = eVar.a(bool, null);
            if (a10 == null) {
                return false;
            }
            eVar.g(a10);
            return true;
        }
        if (obj instanceof v8.d) {
            v8.d dVar = (v8.d) obj;
            k kVar2 = d.f6518a;
            w a11 = dVar.a(obj2, null);
            if (a11 == null) {
                return false;
            }
            dVar.g(a11);
            return true;
        }
        org.apache.commons.net.ftp.a.c(obj, "Unexpected receiver type: ");
        return false;
    }

    public final Object z(k kVar, int i10, long j10, a aVar) {
        AtomicReferenceArray atomicReferenceArray = kVar.f6539g;
        Object k6 = kVar.k(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (k6 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (aVar == null) {
                    return d.f6528n;
                }
                if (kVar.j(i10, k6, aVar)) {
                    k();
                    return d.f6527m;
                }
            }
        } else if (k6 == d.d && kVar.j(i10, k6, d.f6523i)) {
            k();
            Object obj = atomicReferenceArray.get(i10 * 2);
            kVar.m(i10, null);
            return obj;
        }
        while (true) {
            Object k10 = kVar.k(i10);
            if (k10 != null && k10 != d.e) {
                if (k10 == d.d) {
                    if (kVar.j(i10, k10, d.f6523i)) {
                        k();
                        Object obj2 = atomicReferenceArray.get(i10 * 2);
                        kVar.m(i10, null);
                        return obj2;
                    }
                } else {
                    w wVar = d.f6524j;
                    if (k10 == wVar) {
                        return d.f6529o;
                    }
                    if (k10 == d.f6522h) {
                        return d.f6529o;
                    }
                    if (k10 == d.f6526l) {
                        k();
                        return d.f6529o;
                    }
                    if (k10 != d.f6521g && kVar.j(i10, k10, d.f6520f)) {
                        boolean z9 = k10 instanceof s;
                        if (z9) {
                            k10 = ((s) k10).f6542a;
                        }
                        if (y(k10)) {
                            kVar.n(i10, d.f6523i);
                            k();
                            Object obj3 = atomicReferenceArray.get(i10 * 2);
                            kVar.m(i10, null);
                            return obj3;
                        }
                        kVar.n(i10, wVar);
                        kVar.h();
                        if (z9) {
                            k();
                        }
                        return d.f6529o;
                    }
                }
            } else if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.j(i10, k10, d.f6522h)) {
                    k();
                    return d.f6529o;
                }
            } else {
                if (aVar == null) {
                    return d.f6528n;
                }
                if (kVar.j(i10, k10, aVar)) {
                    k();
                    return d.f6527m;
                }
            }
        }
    }
}
