package a9;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final transient CoroutineContext f70b;

    public g(CoroutineContext coroutineContext) {
        this.f70b = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f70b.toString();
    }
}
