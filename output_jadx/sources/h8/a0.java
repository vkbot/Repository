package h8;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 extends a {
    public final /* synthetic */ int d = 1;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2626f;

    public a0(x7.b bVar, b8.c cVar) {
        super(bVar);
        this.f2626f = cVar;
        this.e = Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.b
    public final void e(x7.d dVar) {
        switch (this.d) {
            case 0:
                this.c.d(new z(dVar, (b8.c) this.f2626f, this.e));
                return;
            case 1:
                c5.e eVar = (c5.e) this.f2626f;
                x7.b bVar = this.c;
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            o8.d.a(dVar);
                            return;
                        }
                        try {
                            eVar.getClass();
                            l.f(dVar, ((Iterable) call).iterator());
                            return;
                        } catch (Throwable th) {
                            com.bumptech.glide.d.v(th);
                            o8.d.b(th, dVar);
                            return;
                        }
                    } catch (Throwable th2) {
                        com.bumptech.glide.d.v(th2);
                        o8.d.b(th2, dVar);
                        return;
                    }
                }
                bVar.d(new b0(dVar, eVar, this.e));
                return;
            default:
                x7.j a10 = ((x7.k) this.f2626f).a();
                boolean z9 = dVar instanceof e8.a;
                int i10 = this.e;
                x7.b bVar2 = this.c;
                if (z9) {
                    bVar2.d(new i0((e8.a) dVar, a10, i10));
                    return;
                } else {
                    bVar2.d(new j0(dVar, a10, i10));
                    return;
                }
        }
    }

    public a0(x7.b bVar, x7.k kVar, int i10) {
        super(bVar);
        this.f2626f = kVar;
        this.e = i10;
    }

    public a0(w wVar, int i10) {
        super(wVar);
        this.f2626f = d8.b.f1857a;
        this.e = i10;
    }
}
