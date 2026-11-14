package b9;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class a {
    public static void a(Function2 function2, v8.a aVar, v8.a aVar2) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, aVar, aVar2));
            Result.Companion companion = Result.INSTANCE;
            a9.a.f(Result.m95constructorimpl(Unit.INSTANCE), intercepted);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            aVar2.resumeWith(Result.m95constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
