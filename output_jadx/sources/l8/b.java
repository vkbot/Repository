package l8;

import e8.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: j, reason: collision with root package name */
    public static final int f3550j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3551k = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f3552b;
    public final int c;
    public long d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicReferenceArray f3553f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3554g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicReferenceArray f3555h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f3556i;

    public b(int i10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f3552b = atomicLong;
        this.f3556i = new AtomicLong();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i10) - 1));
        int i11 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.f3553f = atomicReferenceArray;
        this.e = i11;
        this.c = Math.min(numberOfLeadingZeros / 4, f3550j);
        this.f3555h = atomicReferenceArray;
        this.f3554g = i11;
        this.d = numberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // e8.g
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // e8.g
    public final boolean isEmpty() {
        if (this.f3552b.get() == this.f3556i.get()) {
            return true;
        }
        return false;
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.f3553f;
            AtomicLong atomicLong = this.f3552b;
            long j10 = atomicLong.get();
            int i10 = this.e;
            int i11 = ((int) j10) & i10;
            if (j10 < this.d) {
                atomicReferenceArray.lazySet(i11, obj);
                atomicLong.lazySet(j10 + 1);
                return true;
            }
            long j11 = this.c + j10;
            if (atomicReferenceArray.get(((int) j11) & i10) == null) {
                this.d = j11 - 1;
                atomicReferenceArray.lazySet(i11, obj);
                atomicLong.lazySet(j10 + 1);
                return true;
            }
            long j12 = j10 + 1;
            if (atomicReferenceArray.get(((int) j12) & i10) == null) {
                atomicReferenceArray.lazySet(i11, obj);
                atomicLong.lazySet(j12);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f3553f = atomicReferenceArray2;
            this.d = (j10 + i10) - 1;
            atomicReferenceArray2.lazySet(i11, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i11, f3551k);
            atomicLong.lazySet(j12);
            return true;
        }
        n0.b.n("Null is not a valid element");
        return false;
    }

    @Override // e8.g
    public final Object poll() {
        boolean z9;
        AtomicReferenceArray atomicReferenceArray = this.f3555h;
        AtomicLong atomicLong = this.f3556i;
        long j10 = atomicLong.get();
        int i10 = this.f3554g;
        int i11 = ((int) j10) & i10;
        Object obj = atomicReferenceArray.get(i11);
        if (obj == f3551k) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (obj != null && !z9) {
            atomicReferenceArray.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
            return obj;
        }
        if (!z9) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        this.f3555h = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i11);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i11, null);
            atomicLong.lazySet(j10 + 1);
        }
        return obj2;
    }
}
