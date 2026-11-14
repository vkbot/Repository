package h8;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l extends x7.b {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ l(int i10, Object obj) {
        this.c = i10;
        this.d = obj;
    }

    public static void f(x7.d dVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                o8.d.a(dVar);
            } else if (dVar instanceof e8.a) {
                dVar.f(new d0((e8.a) dVar, it, 0));
            } else {
                dVar.f(new d0(dVar, it, 1));
            }
        } catch (Throwable th) {
            com.bumptech.glide.d.v(th);
            o8.d.b(th, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [x7.f, o8.c] */
    @Override // x7.b
    public final void e(x7.d dVar) {
        h hVar;
        switch (this.c) {
            case 0:
                int c = com.bumptech.glide.g.c(3);
                if (c != 0) {
                    if (c != 1) {
                        if (c != 3) {
                            if (c != 4) {
                                hVar = new i(dVar, x7.b.f6507b);
                            } else {
                                hVar = new i(dVar);
                            }
                        } else {
                            hVar = new h(dVar);
                        }
                    } else {
                        hVar = new h(dVar);
                    }
                } else {
                    hVar = new h(dVar);
                }
                dVar.f(hVar);
                try {
                    ((x7.c) this.d).d();
                    return;
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    if (!hVar.f(th)) {
                        a.a.s(th);
                        return;
                    }
                    return;
                }
            case 1:
                Object[] objArr = (Object[]) this.d;
                if (dVar instanceof e8.a) {
                    dVar.f(new c0((e8.a) dVar, objArr, 0));
                    return;
                } else {
                    dVar.f(new c0(dVar, objArr, 1));
                    return;
                }
            case 2:
                try {
                    f(dVar, ((com.google.protobuf.a0) this.d).iterator());
                    return;
                } catch (Throwable th2) {
                    com.bumptech.glide.d.v(th2);
                    o8.d.b(th2, dVar);
                    return;
                }
            case 3:
                ((x7.g) this.d).c(new e0(dVar));
                return;
            default:
                ((x7.e) this.d).c(new o8.c(dVar));
                return;
        }
    }
}
