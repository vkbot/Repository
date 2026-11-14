package x7;

import h8.a0;
import h8.m0;
import h8.p0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class b implements n9.a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f6507b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // n9.a
    public final void a(d dVar) {
        if (dVar != null) {
            d(dVar);
        } else {
            d8.b.a(dVar, "s is null");
            d(new n8.d(dVar));
        }
    }

    public final a0 b(b8.c cVar) {
        d8.b.a(cVar, "mapper is null");
        d8.b.b(Integer.MAX_VALUE, "maxConcurrency");
        return new a0(this, cVar);
    }

    public final p0 c() {
        int i10 = f6507b;
        d8.b.b(i10, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new p0(new m0(atomicReference, i10), this, atomicReference, i10);
    }

    public final void d(d dVar) {
        d8.b.a(dVar, "s is null");
        try {
            e(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            a.a.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(d dVar);
}
