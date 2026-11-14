package a9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f78b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef");

    @Volatile
    private volatile Object _next = this;

    @Volatile
    private volatile Object _prev = this;

    @Volatile
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((a9.r) r6).f86a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a9.m d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a9.m.c
            java.lang.Object r1 = r0.get(r9)
            a9.m r1 = (a9.m) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a9.m.f78b
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof a9.b
            if (r7 == 0) goto L38
            a9.b r6 = (a9.b) r6
            r6.b(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof a9.r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            a9.r r6 = (a9.r) r6
            a9.m r6 = r6.f86a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            a9.m r3 = (a9.m) r3
            goto Lb
        L58:
            r6.getClass()
            r4 = r6
            a9.m r4 = (a9.m) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.m.d():a9.m");
    }

    public final void e(m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(mVar);
            if (f() != mVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, mVar2, this)) {
                if (atomicReferenceFieldUpdater.get(mVar) != mVar2) {
                    break;
                }
            }
            if (h()) {
                mVar.d();
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f78b.get(this);
            if (!(obj instanceof b)) {
                return obj;
            }
            ((b) obj).b(this);
        }
    }

    public final m g() {
        r rVar;
        Object f8 = f();
        if (f8 instanceof r) {
            rVar = (r) f8;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            return rVar.f86a;
        }
        f8.getClass();
        return (m) f8;
    }

    public boolean h() {
        return f() instanceof r;
    }

    public String toString() {
        return new PropertyReference0Impl(this, v8.a0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + v8.a0.a(this);
    }
}
