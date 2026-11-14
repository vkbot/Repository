package a9;

import kotlin.coroutines.CoroutineContext;
import v8.p1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w f61a = new w("NO_THREAD_ELEMENTS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final y f62b = y.f90b;
    public static final z c = z.f91b;
    public static final a0 d = a0.f59b;

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj != f61a) {
            if (obj instanceof d0) {
                p1[] p1VarArr = ((d0) obj).c;
                int length = p1VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                p1 p1Var = p1VarArr[length];
                throw null;
            }
            coroutineContext.fold(null, c).getClass();
            n0.b.a();
        }
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, f62b);
            obj.getClass();
        }
        if (obj == 0) {
            return f61a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new d0(((Number) obj).intValue(), coroutineContext), d);
        }
        n0.b.a();
        return null;
    }
}
