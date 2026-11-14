package m4;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k extends com.bumptech.glide.c {

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f3923b;
    public static final long c;
    public static final long d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f3924f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f3925g;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e6) {
                ai.onnxruntime.b.o("Could not initialize intrinsics", e6.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            d = unsafe.objectFieldOffset(m.class.getDeclaredField("d"));
            c = unsafe.objectFieldOffset(m.class.getDeclaredField("c"));
            e = unsafe.objectFieldOffset(m.class.getDeclaredField("b"));
            f3924f = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
            f3925g = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
            f3923b = unsafe;
        } catch (NoSuchFieldException e10) {
            n0.b.w(e10);
        } catch (RuntimeException e11) {
            throw e11;
        }
    }

    @Override // com.bumptech.glide.c
    public final boolean c(m mVar, d dVar, d dVar2) {
        return h.a(f3923b, mVar, c, dVar, dVar2);
    }

    @Override // com.bumptech.glide.c
    public final boolean d(m mVar, Object obj, Object obj2) {
        return i.a(f3923b, mVar, e, obj, obj2);
    }

    @Override // com.bumptech.glide.c
    public final boolean e(m mVar, l lVar, l lVar2) {
        return g.a(f3923b, mVar, d, lVar, lVar2);
    }

    @Override // com.bumptech.glide.c
    public final d k(m mVar) {
        d dVar;
        d dVar2 = d.d;
        do {
            dVar = mVar.c;
            if (dVar2 == dVar) {
                break;
            }
        } while (!c(mVar, dVar, dVar2));
        return dVar;
    }

    @Override // com.bumptech.glide.c
    public final l l(m mVar) {
        l lVar;
        l lVar2 = l.c;
        do {
            lVar = mVar.d;
            if (lVar2 == lVar) {
                break;
            }
        } while (!e(mVar, lVar, lVar2));
        return lVar;
    }

    @Override // com.bumptech.glide.c
    public final void q(l lVar, l lVar2) {
        f3923b.putObject(lVar, f3925g, lVar2);
    }

    @Override // com.bumptech.glide.c
    public final void r(l lVar, Thread thread) {
        f3923b.putObject(lVar, f3924f, thread);
    }
}
