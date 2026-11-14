package y8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class v extends z8.a implements m, f {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6679f = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state");

    @Volatile
    private volatile Object _state;
    public int e;

    public v(Object obj) {
        this._state = obj;
    }

    @Override // y8.l
    public final boolean b(Object obj) {
        f(obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, z8.c] */
    @Override // z8.a
    public final z8.c c() {
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (r6.c(r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0036, B:15:0x0076, B:17:0x007e, B:20:0x0085, B:21:0x008b, B:25:0x008e, B:27:0x00af, B:30:0x00c2, B:33:0x0094, B:36:0x009b, B:44:0x004e, B:46:0x0058, B:47:0x0067), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:14:0x0036, B:15:0x0076, B:17:0x007e, B:20:0x0085, B:21:0x008b, B:25:0x008e, B:27:0x00af, B:30:0x00c2, B:33:0x0094, B:36:0x009b, B:44:0x004e, B:46:0x0058, B:47:0x0067), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c1 -> B:15:0x0076). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d2 -> B:15:0x0076). Please report as a decompilation issue!!! */
    @Override // y8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(y8.g r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.v.collect(y8.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // z8.a
    public final z8.c[] d() {
        return new w[2];
    }

    @Override // y8.g
    public final Object emit(Object obj, Continuation continuation) {
        f(obj);
        return Unit.INSTANCE;
    }

    public final void f(Object obj) {
        int i10;
        z8.c[] cVarArr;
        a9.w wVar;
        if (obj == null) {
            obj = z8.b.f6880b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6679f;
            if (Intrinsics.areEqual(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i11 = this.e;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.e = i12;
                z8.c[] cVarArr2 = this.f6878b;
                Unit unit = Unit.INSTANCE;
                while (true) {
                    w[] wVarArr = (w[]) cVarArr2;
                    if (wVarArr != null) {
                        for (w wVar2 : wVarArr) {
                            if (wVar2 != null) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w.f6680a;
                                while (true) {
                                    Object obj2 = atomicReferenceFieldUpdater2.get(wVar2);
                                    if (obj2 != null && obj2 != (wVar = r.c)) {
                                        a9.w wVar3 = r.f6671b;
                                        if (obj2 == wVar3) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(wVar2, obj2, wVar)) {
                                                if (atomicReferenceFieldUpdater2.get(wVar2) != obj2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(wVar2, obj2, wVar3)) {
                                                if (atomicReferenceFieldUpdater2.get(wVar2) != obj2) {
                                                    break;
                                                }
                                            }
                                            Result.Companion companion = Result.INSTANCE;
                                            ((v8.e) obj2).resumeWith(Result.m95constructorimpl(Unit.INSTANCE));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.e;
                        if (i10 == i12) {
                            this.e = i12 + 1;
                            return;
                        } else {
                            cVarArr = this.f6878b;
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    cVarArr2 = cVarArr;
                    i12 = i10;
                }
            } else {
                this.e = i11 + 2;
            }
        }
    }

    @Override // y8.t
    public final Object getValue() {
        a9.w wVar = z8.b.f6880b;
        Object obj = f6679f.get(this);
        if (obj == wVar) {
            return null;
        }
        return obj;
    }
}
