package g8;

import android.support.v4.media.h;
import b1.u;
import e0.g;
import f5.x;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2489b = 0;
    public final Object c;

    public b(x xVar) {
        this.c = xVar;
    }

    @Override // b1.u
    public final void B(x7.a aVar) {
        switch (this.f2489b) {
            case 0:
                c8.d dVar = new c8.d(d8.b.f1858b);
                aVar.b(dVar);
                try {
                    ((x) this.c).call();
                    if (!dVar.c()) {
                        aVar.a();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    com.bumptech.glide.d.v(th);
                    if (!dVar.c()) {
                        aVar.onError(th);
                        return;
                    }
                    return;
                }
            default:
                z7.a dVar2 = new c8.d(0);
                aVar.b(dVar2);
                ((d) this.c).A(new h(this, aVar, dVar2, 12));
                return;
        }
    }

    public b(d dVar, g gVar) {
        this.c = dVar;
    }
}
