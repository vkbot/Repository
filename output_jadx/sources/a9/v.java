package a9;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f87a = 0;

    static {
        Object m95constructorimpl;
        Object m95constructorimpl2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Result.Companion companion = Result.INSTANCE;
            m95constructorimpl = Result.m95constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m95constructorimpl = Result.m95constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m98exceptionOrNullimpl(m95constructorimpl) != null) {
            m95constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            m95constructorimpl2 = Result.m95constructorimpl(v.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            m95constructorimpl2 = Result.m95constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m98exceptionOrNullimpl(m95constructorimpl2) != null) {
            m95constructorimpl2 = "a9.v";
        }
    }
}
