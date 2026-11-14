package c9;

import kotlin.coroutines.CoroutineContext;
import v8.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class l extends t {

    /* renamed from: b, reason: collision with root package name */
    public static final l f605b = new t();

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        d dVar = d.c;
        dVar.f597b.c(runnable, k.f604h, false);
    }

    @Override // v8.t
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        d dVar = d.c;
        dVar.f597b.c(runnable, k.f604h, true);
    }

    @Override // v8.t
    public final t limitedParallelism(int i10) {
        a9.a.a(i10);
        if (i10 >= k.d) {
            return this;
        }
        return super.limitedParallelism(i10);
    }
}
