package w8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object m95constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m95constructorimpl = Result.m95constructorimpl(new c(a(Looper.getMainLooper()), false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m95constructorimpl = Result.m95constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m101isFailureimpl(m95constructorimpl)) {
            m95constructorimpl = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            invoke.getClass();
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
