package c9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f581j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: b, reason: collision with root package name */
    public final m f582b;
    public final Ref.ObjectRef c;
    public int d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f583f;

    /* renamed from: g, reason: collision with root package name */
    public int f584g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f585h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f586i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    @Volatile
    private volatile int workerCtl;

    public a(b bVar, int i10) {
        this.f586i = bVar;
        setDaemon(true);
        this.f582b = new m();
        this.c = new Ref.ObjectRef();
        this.d = 4;
        this.nextParkedWorker = b.f590l;
        this.f584g = Random.INSTANCE.nextInt();
        f(i10);
    }

    public final h a(boolean z9) {
        h e;
        h e6;
        long j10;
        int i10 = this.d;
        b bVar = this.f586i;
        h hVar = null;
        boolean z10 = true;
        m mVar = this.f582b;
        if (i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f588j;
            do {
                j10 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f606b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 == null || hVar2.c.f599b != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                break;
                            }
                        }
                        hVar = hVar2;
                    }
                    int i11 = m.d.get(mVar);
                    int i12 = m.c.get(mVar);
                    while (true) {
                        if (i11 == i12 || m.e.get(mVar) == 0) {
                            break;
                        }
                        i12--;
                        h c = mVar.c(i12, true);
                        if (c != null) {
                            hVar = c;
                            break;
                        }
                    }
                    if (hVar == null) {
                        h hVar3 = (h) bVar.f593g.d();
                        if (hVar3 == null) {
                            return i(1);
                        }
                        return hVar3;
                    }
                    return hVar;
                }
            } while (!b.f588j.compareAndSet(bVar, j10, j10 - 4398046511104L));
            this.d = 1;
        }
        if (z9) {
            if (d(bVar.f591b * 2) != 0) {
                z10 = false;
            }
            if (z10 && (e6 = e()) != null) {
                return e6;
            }
            mVar.getClass();
            h hVar4 = (h) m.f606b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z10 && (e = e()) != null) {
                return e;
            }
        } else {
            h e10 = e();
            if (e10 != null) {
                return e10;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f584g;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f584g = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final h e() {
        int d = d(2);
        b bVar = this.f586i;
        e eVar = bVar.f593g;
        e eVar2 = bVar.f592f;
        if (d == 0) {
            h hVar = (h) eVar2.d();
            if (hVar != null) {
                return hVar;
            }
            return (h) eVar.d();
        }
        h hVar2 = (h) eVar.d();
        if (hVar2 != null) {
            return hVar2;
        }
        return (h) eVar2.d();
    }

    public final void f(int i10) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f586i.e);
        sb.append("-worker-");
        if (i10 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i10);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i10) {
        int i11 = this.d;
        boolean z9 = true;
        if (i11 != 1) {
            z9 = false;
        }
        if (z9) {
            b.f588j.addAndGet(this.f586i, 4398046511104L);
        }
        if (i11 != i10) {
            this.d = i10;
        }
        return z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, c9.h] */
    /* JADX WARN: Type inference failed for: r7v14, types: [c9.h] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [c9.h] */
    public final h i(int i10) {
        boolean z9;
        long j10;
        T t;
        long j11;
        long j12;
        T t3;
        int i11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f588j;
        b bVar = this.f586i;
        int i12 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        Object obj = null;
        if (i12 < 2) {
            return null;
        }
        int d = d(i12);
        int i13 = 0;
        long j13 = Long.MAX_VALUE;
        while (i13 < i12) {
            d++;
            if (d > i12) {
                d = 1;
            }
            a aVar = (a) bVar.f594h.b(d);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f582b;
                if (i10 == 3) {
                    t = mVar.b();
                    j10 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.d.get(mVar);
                    int i15 = m.c.get(mVar);
                    if (i10 == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j10 = 0;
                            if (!z9 || m.e.get(mVar) != 0) {
                                int i16 = i14 + 1;
                                t = mVar.c(i14, z9);
                                if (t != 0) {
                                    break;
                                }
                                i14 = i16;
                            } else {
                                break;
                            }
                        } else {
                            j10 = 0;
                            break;
                        }
                    }
                    t = obj;
                }
                Ref.ObjectRef objectRef = this.c;
                if (t != 0) {
                    objectRef.element = t;
                    t3 = obj;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f606b;
                        ?? r14 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (r14 == 0) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (r14.c.f599b == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        k.f602f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - r14.f598b;
                        long j14 = k.f601b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            t3 = 0;
                            break;
                        }
                        do {
                            t3 = 0;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, r14, null)) {
                                objectRef.element = r14;
                                j12 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == r14);
                        mVar = mVar2;
                        obj = null;
                    }
                    j12 = -2;
                    t3 = obj;
                }
                if (j12 == j11) {
                    h hVar = (h) objectRef.element;
                    objectRef.element = t3;
                    return hVar;
                }
                if (j12 > j10) {
                    j13 = Math.min(j13, j12);
                }
            }
            i13++;
            obj = null;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = 0;
        }
        this.f583f = j13;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.a.run():void");
    }
}
