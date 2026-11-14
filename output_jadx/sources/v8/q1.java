package v8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6046a = new ThreadLocal();

    public static l0 a() {
        ThreadLocal threadLocal = f6046a;
        l0 l0Var = (l0) threadLocal.get();
        if (l0Var == null) {
            c cVar = new c(Thread.currentThread());
            threadLocal.set(cVar);
            return cVar;
        }
        return l0Var;
    }
}
