package c9;

import a9.x;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import v8.r0;
import v8.t;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class c extends r0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final c f595b = new t();
    public static final t c = l.f605b.limitedParallelism(a9.a.i(RangesKt.coerceAtLeast(64, x.f89a), 12, "kotlinx.coroutines.io.parallelism"));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // v8.t
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        c.dispatch(coroutineContext, runnable);
    }

    @Override // v8.t
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        c.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // v8.t
    public final t limitedParallelism(int i10) {
        return l.f605b.limitedParallelism(i10);
    }

    @Override // v8.t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
