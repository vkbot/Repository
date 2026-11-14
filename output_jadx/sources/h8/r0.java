package h8;

import java.util.Collection;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class r0 extends o8.c implements x7.d, n9.b {
    public n9.b d;

    @Override // x7.d
    public final void a() {
        i(this.c);
    }

    @Override // n9.b
    public final void cancel() {
        set(4);
        this.c = null;
        this.d.cancel();
    }

    @Override // x7.d
    public final void e(Object obj) {
        Collection collection = (Collection) this.c;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // x7.d
    public final void f(n9.b bVar) {
        if (o8.f.e(this.d, bVar)) {
            this.d = bVar;
            this.f4803b.f(this);
            bVar.d(Long.MAX_VALUE);
        }
    }

    @Override // x7.d
    public final void onError(Throwable th) {
        this.c = null;
        this.f4803b.onError(th);
    }
}
