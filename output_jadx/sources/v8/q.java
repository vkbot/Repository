package v8;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z9) {
        Boolean bool = Boolean.FALSE;
        p pVar = p.f6044b;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, pVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, pVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Lambda(2));
        if (booleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, n.f6041b);
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final s1 b(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        s1 s1Var = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(t1.f6052b) != null) {
            CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((coroutineStackFrame instanceof e0) || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                    break;
                }
                if (coroutineStackFrame instanceof s1) {
                    s1Var = (s1) coroutineStackFrame;
                    break;
                }
            }
            if (s1Var != null) {
                s1Var.N(coroutineContext, obj);
            }
        }
        return s1Var;
    }
}
