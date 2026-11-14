package i8;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h extends AtomicReference implements x7.f, x7.a, z7.a, x7.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2849b;
    public final Object c;
    public final Object d;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f2849b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // x7.f
    public void a() {
        switch (this.f2849b) {
            case 0:
                ((x7.a) this.c).a();
                return;
            default:
                z7.a aVar = (z7.a) get();
                if (aVar != c8.a.f577b && compareAndSet(aVar, null)) {
                    ((x7.e) this.d).c(new android.support.v4.media.h(this.c, (Object) this, false, 17));
                    return;
                }
                return;
        }
    }

    @Override // x7.f
    public final void b(z7.a aVar) {
        switch (this.f2849b) {
            case 0:
                c8.a.c(this, aVar);
                return;
            case 1:
                if (c8.a.d(this, aVar)) {
                    ((x7.f) this.c).b(this);
                    return;
                }
                return;
            default:
                if (c8.a.d(this, aVar)) {
                    ((x7.m) this.c).b(this);
                    return;
                }
                return;
        }
    }

    @Override // x7.f
    public final void c(Object obj) {
        switch (this.f2849b) {
            case 0:
                try {
                    b1.u uVar = (b1.u) ((f5.f) this.d).apply(obj);
                    if (!c8.a.b((z7.a) get())) {
                        uVar.A(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    onError(th);
                    return;
                }
            case 1:
                ((x7.f) this.c).c(obj);
                return;
            default:
                ((x7.m) this.c).c(obj);
                return;
        }
    }

    @Override // z7.a
    public final void dispose() {
        switch (this.f2849b) {
            case 0:
                c8.a.a(this);
                return;
            case 1:
                c8.a.a(this);
                return;
            default:
                c8.a.a(this);
                return;
        }
    }

    @Override // x7.f
    public final void onError(Throwable th) {
        switch (this.f2849b) {
            case 0:
                ((x7.a) this.c).onError(th);
                return;
            case 1:
                ((x7.f) this.c).onError(th);
                return;
            default:
                x7.m mVar = (x7.m) this.c;
                try {
                    Object obj = ((d8.a) this.d).c;
                    d8.b.a(obj, "The nextFunction returned a null SingleSource.");
                    ((x7.l) obj).a(new android.support.v4.media.h((Object) this, (Object) mVar, false, 10));
                    return;
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    mVar.onError(new a8.c(th, th2));
                    return;
                }
        }
    }
}
