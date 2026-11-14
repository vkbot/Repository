package a9;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class t extends v8.a implements CoroutineStackFrame {
    public final Continuation e;

    public t(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.e = continuation;
    }

    @Override // v8.h1
    public final boolean A() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // v8.h1
    public void i(Object obj) {
        a.f(v8.m.a(obj), IntrinsicsKt.intercepted(this.e));
    }

    @Override // v8.h1
    public void j(Object obj) {
        this.e.resumeWith(v8.m.a(obj));
    }
}
