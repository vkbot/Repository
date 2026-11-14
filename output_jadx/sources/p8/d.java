package p8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5114a = new Throwable("No further exceptions");

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        Throwable cVar;
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f5114a) {
                return false;
            }
            if (th2 == null) {
                cVar = th;
            } else {
                cVar = new a8.c(th2, th);
            }
            while (!atomicReference.compareAndSet(th2, cVar)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static Throwable b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        c cVar = f5114a;
        if (th != cVar) {
            return (Throwable) atomicReference.getAndSet(cVar);
        }
        return th;
    }

    public static RuntimeException c(Throwable th) {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                return (RuntimeException) th;
            }
            return new RuntimeException(th);
        }
        throw ((Error) th);
    }
}
