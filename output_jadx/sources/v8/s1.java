package v8;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class s1 extends a9.t {

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal f6050f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1(kotlin.coroutines.Continuation r3, kotlin.coroutines.CoroutineContext r4) {
        /*
            r2 = this;
            v8.t1 r0 = v8.t1.f6052b
            kotlin.coroutines.CoroutineContext$Element r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f6050f = r0
            kotlin.coroutines.CoroutineContext r3 = r3.get$context()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r0)
            boolean r3 = r3 instanceof v8.t
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = a9.b0.b(r4, r3)
            a9.b0.a(r4, r3)
            r2.N(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.s1.<init>(kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean M() {
        boolean z9;
        if (this.threadLocalIsSet && this.f6050f.get() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f6050f.remove();
        return !z9;
    }

    public final void N(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f6050f.set(TuplesKt.to(coroutineContext, obj));
    }

    @Override // a9.t, v8.h1
    public final void j(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f6050f.get();
            if (pair != null) {
                a9.b0.a((CoroutineContext) pair.component1(), pair.component2());
            }
            this.f6050f.remove();
        }
        Object a10 = m.a(obj);
        Continuation continuation = this.e;
        CoroutineContext coroutineContext = continuation.get$context();
        s1 s1Var = null;
        Object b10 = a9.b0.b(coroutineContext, null);
        if (b10 != a9.b0.f61a) {
            s1Var = q.b(continuation, coroutineContext, b10);
        }
        try {
            this.e.resumeWith(a10);
            Unit unit = Unit.INSTANCE;
            if (s1Var != null && !s1Var.M()) {
                return;
            }
            a9.b0.a(coroutineContext, b10);
        } catch (Throwable th) {
            if (s1Var == null || s1Var.M()) {
                a9.b0.a(coroutineContext, b10);
            }
            throw th;
        }
    }
}
