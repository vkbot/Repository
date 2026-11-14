package n8;

import h8.f0;
import java.util.concurrent.atomic.AtomicReference;
import o8.f;
import p2.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends AtomicReference implements x7.d, n9.b, z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.navigation.b f4267b;
    public final e c = d8.b.e;
    public final w7.c d = d8.b.c;
    public final f0 e = f0.f2662b;

    public c(androidx.navigation.b bVar) {
        this.f4267b = bVar;
    }

    @Override // x7.d
    public final void a() {
        Object obj = get();
        f fVar = f.f4806b;
        if (obj != fVar) {
            lazySet(fVar);
            try {
                this.d.getClass();
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                a.a.s(th);
            }
        }
    }

    @Override // n9.b
    public final void cancel() {
        f.a(this);
    }

    @Override // n9.b
    public final void d(long j10) {
        ((n9.b) get()).d(j10);
    }

    @Override // z7.a
    public final void dispose() {
        f.a(this);
    }

    @Override // x7.d
    public final void e(Object obj) {
        boolean z9;
        if (get() == f.f4806b) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            try {
                this.f4267b.getClass();
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                ((n9.b) get()).cancel();
                onError(th);
            }
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (f.b(this, bVar)) {
            try {
                this.e.accept(this);
            } catch (Throwable th) {
                com.bumptech.glide.d.v(th);
                bVar.cancel();
                onError(th);
            }
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        Object obj = get();
        f fVar = f.f4806b;
        if (obj != fVar) {
            lazySet(fVar);
            try {
                this.c.accept(th);
                return;
            } catch (Throwable th2) {
                com.bumptech.glide.d.v(th2);
                a.a.s(new a8.c(th, th2));
                return;
            }
        }
        a.a.s(th);
    }
}
