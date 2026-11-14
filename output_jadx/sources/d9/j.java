package d9;

import a9.u;
import a9.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1867b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head");
    public static final AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1868f = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits");

    @Volatile
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final h f1869a;

    @Volatile
    private volatile long deqIdx;

    @Volatile
    private volatile long enqIdx;

    @Volatile
    private volatile Object head;

    @Volatile
    private volatile Object tail;

    public j() {
        l lVar = new l(0L, null, 2);
        this.head = lVar;
        this.tail = lVar;
        this._availablePermits = 1;
        this.f1869a = new h(0, this);
    }

    public final void a(c cVar) {
        Object a10;
        long j10;
        l lVar;
        while (true) {
            int andDecrement = f1868f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Function1 function1 = this.f1869a;
                if (andDecrement > 0) {
                    cVar.d(Unit.INSTANCE, function1);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                g gVar = g.f1864b;
                long j11 = andIncrement / k.f1872f;
                while (true) {
                    a10 = a9.d.a(lVar2, j11, gVar);
                    if (!a9.a.d(a10)) {
                        u b10 = a9.a.b(a10);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            lVar = lVar2;
                            j10 = andIncrement;
                            if (uVar.d >= b10.d) {
                                break;
                            }
                            if (!b10.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (b10.e()) {
                                        b10.d();
                                    }
                                    lVar2 = lVar;
                                    andIncrement = j10;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        j10 = andIncrement;
                        break;
                    }
                    lVar2 = lVar;
                    andIncrement = j10;
                }
                l lVar3 = (l) a9.a.b(a10);
                AtomicReferenceArray atomicReferenceArray = lVar3.f1873f;
                int i10 = (int) (j10 % k.f1872f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        w wVar = k.f1871b;
                        w wVar2 = k.c;
                        while (!atomicReferenceArray.compareAndSet(i10, wVar, wVar2)) {
                            if (atomicReferenceArray.get(i10) != wVar) {
                                break;
                            }
                        }
                        cVar.d(Unit.INSTANCE, function1);
                        return;
                    }
                }
                cVar.b(lVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        boolean z9;
        int i10;
        Object a10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1868f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z9 = true;
            if (andIncrement < 1) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1867b;
                    l lVar = (l) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = c.getAndIncrement(this);
                    long j10 = andIncrement2 / k.f1872f;
                    i iVar = i.f1866b;
                    while (true) {
                        a10 = a9.d.a(lVar, j10, iVar);
                        if (!a9.a.d(a10)) {
                            u b10 = a9.a.b(a10);
                            while (true) {
                                u uVar = (u) atomicReferenceFieldUpdater.get(this);
                                if (uVar.d >= b10.d) {
                                    break;
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
                    l lVar2 = (l) a9.a.b(a10);
                    lVar2.a();
                    AtomicReferenceArray atomicReferenceArray = lVar2.f1873f;
                    boolean z10 = false;
                    if (lVar2.d <= j10) {
                        int i11 = (int) (andIncrement2 % k.f1872f);
                        Object andSet = atomicReferenceArray.getAndSet(i11, k.f1871b);
                        if (andSet == null) {
                            int i12 = k.f1870a;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    if (atomicReferenceArray.get(i11) == k.c) {
                                        break;
                                    } else {
                                        i13++;
                                    }
                                } else {
                                    w wVar = k.f1871b;
                                    w wVar2 = k.d;
                                    while (true) {
                                        if (atomicReferenceArray.compareAndSet(i11, wVar, wVar2)) {
                                            z10 = true;
                                            break;
                                        } else if (atomicReferenceArray.get(i11) != wVar) {
                                            break;
                                        }
                                    }
                                    z9 = true ^ z10;
                                }
                            }
                        } else if (andSet != k.e) {
                            if (andSet instanceof v8.d) {
                                v8.d dVar = (v8.d) andSet;
                                w a11 = dVar.a(Unit.INSTANCE, this.f1869a);
                                if (a11 != null) {
                                    dVar.g(a11);
                                }
                            } else {
                                org.apache.commons.net.ftp.a.c(andSet, "unexpected: ");
                                return;
                            }
                        }
                    }
                    z9 = false;
                } else {
                    return;
                }
            } else {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
        } while (!z9);
    }
}
