package l8;

import e8.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a extends AtomicReferenceArray implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f3547g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: b, reason: collision with root package name */
    public final int f3548b;
    public final AtomicLong c;
    public long d;
    public final AtomicLong e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3549f;

    public a(int i10) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i10 - 1)));
        this.f3548b = length() - 1;
        this.c = new AtomicLong();
        this.e = new AtomicLong();
        this.f3549f = Math.min(i10 / 4, f3547g.intValue());
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
        if (this.c.get() == this.e.get()) {
            return true;
        }
        return false;
    }

    @Override // e8.g
    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicLong atomicLong = this.c;
            long j10 = atomicLong.get();
            int i10 = this.f3548b;
            int i11 = ((int) j10) & i10;
            if (j10 >= this.d) {
                long j11 = this.f3549f + j10;
                if (get(i10 & ((int) j11)) == null) {
                    this.d = j11;
                } else if (get(i11) != null) {
                    return false;
                }
            }
            lazySet(i11, obj);
            atomicLong.lazySet(j10 + 1);
            return true;
        }
        n0.b.n("Null is not a valid element");
        return false;
    }

    @Override // e8.g
    public final Object poll() {
        AtomicLong atomicLong = this.e;
        long j10 = atomicLong.get();
        int i10 = ((int) j10) & this.f3548b;
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j10 + 1);
        lazySet(i10, null);
        return obj;
    }
}
