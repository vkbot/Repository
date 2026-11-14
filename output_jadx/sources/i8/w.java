package i8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w extends AtomicReference implements x7.f {

    /* renamed from: b, reason: collision with root package name */
    public final v f2861b;
    public final int c;

    public w(v vVar, int i10) {
        this.f2861b = vVar;
        this.c = i10;
    }

    @Override // x7.f
    public final void a() {
        v vVar = this.f2861b;
        if (vVar.getAndSet(0) > 0) {
            vVar.a(this.c);
            vVar.f2860b.a();
        }
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        c8.a.d(this, aVar);
    }

    @Override // x7.f
    public final void c(Object obj) {
        v vVar = this.f2861b;
        x7.f fVar = vVar.f2860b;
        Object[] objArr = vVar.e;
        objArr[this.c] = obj;
        if (vVar.decrementAndGet() == 0) {
            try {
                fVar.c(vVar.c.apply(objArr));
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                fVar.onError(th);
            }
        }
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        v vVar = this.f2861b;
        if (vVar.getAndSet(0) > 0) {
            vVar.a(this.c);
            vVar.f2860b.onError(th);
        } else {
            a.a.s(th);
        }
    }
}
