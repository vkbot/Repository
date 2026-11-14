package a9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import org.apache.commons.io.FileUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class p {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f81f = AtomicLongFieldUpdater.newUpdater(p.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final w f82g = new w("REMOVE_FROZEN", 0);

    @Volatile
    private volatile Object _next;

    @Volatile
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f83a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84b;
    public final int c;
    public final AtomicReferenceArray d;

    public p(int i10, boolean z9) {
        this.f83a = i10;
        this.f84b = z9;
        int i11 = i10 - 1;
        this.c = i11;
        this.d = new AtomicReferenceArray(i10);
        if (i11 <= 1073741823) {
            if ((i10 & i11) == 0) {
                return;
            }
            j1.i.l("Check failed.");
            throw null;
        }
        j1.i.l("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f81f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                if ((2305843009213693952L & j10) != 0) {
                    return 2;
                }
                return 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.c;
            if (((i11 + 2) & i12) != (i10 & i12)) {
                boolean z9 = this.f84b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z9 && atomicReferenceArray.get(i11 & i12) != null) {
                    int i13 = this.f83a;
                    if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f81f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i11 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i11 & i12, obj);
                        p pVar = this;
                        while ((atomicLongFieldUpdater.get(pVar) & FileUtils.ONE_EB) != 0) {
                            pVar = pVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = pVar.d;
                            int i14 = pVar.c & i11;
                            Object obj2 = atomicReferenceArray2.get(i14);
                            if ((obj2 instanceof o) && ((o) obj2).f80a == i11) {
                                atomicReferenceArray2.set(i14, obj);
                            } else {
                                pVar = null;
                            }
                            if (pVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f81f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((FileUtils.ONE_EB & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final p c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        p pVar;
        while (true) {
            atomicLongFieldUpdater = f81f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & FileUtils.ONE_EB) != 0) {
                pVar = this;
                break;
            }
            long j11 = FileUtils.ONE_EB | j10;
            pVar = this;
            if (atomicLongFieldUpdater.compareAndSet(pVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar2 != null) {
                return pVar2;
            }
            p pVar3 = new p(pVar.f83a * 2, pVar.f84b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = pVar.c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = pVar.d.get(i13);
                if (obj == null) {
                    obj = new o(i10);
                }
                pVar3.d.set(pVar3.c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(pVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        p pVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f81f;
            long j10 = atomicLongFieldUpdater.get(pVar);
            if ((j10 & FileUtils.ONE_EB) != 0) {
                return f82g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = pVar.c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = pVar.d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z9 = pVar.f84b;
            if (obj == null) {
                if (z9) {
                    break;
                }
            } else {
                if (obj instanceof o) {
                    break;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (f81f.compareAndSet(pVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                pVar = this;
                if (z9) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(pVar);
                        int i13 = (int) (j12 & 1073741823);
                        if ((j12 & FileUtils.ONE_EB) != 0) {
                            pVar = pVar.c();
                        } else {
                            p pVar2 = pVar;
                            if (f81f.compareAndSet(pVar2, j12, (j12 & (-1073741824)) | j11)) {
                                pVar2.d.set(i13 & pVar2.c, null);
                                pVar = null;
                            } else {
                                pVar = pVar2;
                            }
                        }
                        if (pVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
