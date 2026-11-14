package i8;

import java.util.Iterator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u extends x7.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2859b;
    public final Object c;

    public /* synthetic */ u(int i10, Object obj) {
        this.f2859b = i10;
        this.c = obj;
    }

    @Override // x7.g
    public final void d(x7.h hVar) {
        switch (this.f2859b) {
            case 0:
                ((x7.e) this.c).c(new t(hVar));
                return;
            default:
                z7.a aVar = c8.b.f578b;
                try {
                    Iterator it = ((Iterable) this.c).iterator();
                    try {
                        if (!it.hasNext()) {
                            hVar.b(aVar);
                            hVar.a();
                            return;
                        }
                        j8.i iVar = new j8.i(hVar, it);
                        hVar.b(iVar);
                        if (iVar.e) {
                            return;
                        }
                        while (!iVar.d) {
                            try {
                                Object next = iVar.c.next();
                                d8.b.a(next, "The iterator returned a null value");
                                iVar.f3344b.e(next);
                                if (!iVar.d) {
                                    try {
                                        if (!iVar.c.hasNext()) {
                                            if (!iVar.d) {
                                                iVar.f3344b.a();
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        com.bumptech.glide.d.v(th);
                                        iVar.f3344b.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                com.bumptech.glide.d.v(th2);
                                iVar.f3344b.onError(th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        com.bumptech.glide.d.v(th3);
                        hVar.b(aVar);
                        hVar.onError(th3);
                        return;
                    }
                } catch (Throwable th4) {
                    com.bumptech.glide.d.v(th4);
                    hVar.b(aVar);
                    hVar.onError(th4);
                    return;
                }
        }
    }
}
