package v8;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class r1 extends t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6048b = 0;

    static {
        new t();
    }

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (coroutineContext.get(w1.f6057b) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        throw new ClassCastException();
    }

    @Override // v8.t
    public final t limitedParallelism(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // v8.t
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
