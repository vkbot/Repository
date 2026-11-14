package c9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f606b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f607a = new AtomicReferenceArray(128);

    @Volatile
    private volatile int blockingTasksInBuffer;

    @Volatile
    private volatile int consumerIndex;

    @Volatile
    private volatile Object lastScheduledTask;

    @Volatile
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return hVar;
        }
        if (hVar.c.f599b == 1) {
            e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f607a;
            if (atomicReferenceArray.get(i10) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i10, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f607a.getAndSet(i11, null)) != null) {
                if (hVar.c.f599b == 1) {
                    e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.get(r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r7 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        c9.m.e.decrementAndGet(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == r7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r0.compareAndSet(r6, r1, null) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c9.h c(int r6, boolean r7) {
        /*
            r5 = this;
            r6 = r6 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f607a
            java.lang.Object r1 = r0.get(r6)
            c9.h r1 = (c9.h) r1
            r2 = 0
            if (r1 == 0) goto L2c
            c9.i r3 = r1.c
            int r3 = r3.f599b
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 != r7) goto L2c
        L18:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L26
            if (r7 == 0) goto L25
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = c9.m.e
            r6.decrementAndGet(r5)
        L25:
            return r1
        L26:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L18
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.m.c(int, boolean):c9.h");
    }
}
