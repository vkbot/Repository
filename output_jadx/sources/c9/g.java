package c9;

import kotlin.coroutines.CoroutineContext;
import v8.r0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class g extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public b f597b;

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        b.y(this.f597b, runnable, 6);
    }

    @Override // v8.t
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        b.y(this.f597b, runnable, 2);
    }
}
