package a9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f60a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");

    @Volatile
    private volatile Object _consensus = a.f57a;

    public abstract void a(Object obj, Object obj2);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a9.b.f60a
            java.lang.Object r1 = r0.get(r4)
            a9.w r2 = a9.a.f57a
            if (r1 != r2) goto L28
            a9.w r3 = r4.c(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L28
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = r3
            goto L28
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
        L28:
            r4.a(r5, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.b.b(java.lang.Object):java.lang.Object");
    }

    public abstract w c(Object obj);

    public final String toString() {
        return getClass().getSimpleName() + '@' + v8.a0.a(this);
    }
}
