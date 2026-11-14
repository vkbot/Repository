package o;

import com.bumptech.glide.load.data.l;
import h.g;
import h.h;
import java.util.ArrayDeque;
import n.n;
import n.o;
import n.p;
import n.q;
import n.r;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final g f4271b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final p f4272a;

    public a(p pVar) {
        this.f4272a = pVar;
    }

    @Override // n.r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // n.r
    public final q b(Object obj, int i10, int i11, h hVar) {
        n.g gVar = (n.g) obj;
        p pVar = this.f4272a;
        if (pVar != null) {
            n nVar = (n) pVar.c;
            o a10 = o.a(gVar);
            Object a11 = nVar.a(a10);
            ArrayDeque arrayDeque = o.f4028b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            n.g gVar2 = (n.g) a11;
            if (gVar2 == null) {
                nVar.d(o.a(gVar), gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new q(gVar, new l(gVar, ((Integer) hVar.c(f4271b)).intValue()));
    }
}
