package x7;

import i8.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class e {
    public static o a(Object obj) {
        d8.b.a(obj, "item is null");
        return new o(obj);
    }

    public final e b(e eVar) {
        d8.b.a(eVar, "next is null");
        return new i8.f(this, new d8.a(0, eVar), 2);
    }

    public final void c(f fVar) {
        d8.b.a(fVar, "observer is null");
        try {
            d(fVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void d(f fVar);

    public final e e(e eVar) {
        d8.b.a(eVar, "other is null");
        return new i8.f(this, eVar, 3);
    }
}
