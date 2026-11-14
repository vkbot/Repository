package l5;

import com.bumptech.glide.manager.t;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final p f3539a;

    public h(p pVar) {
        this.f3539a = pVar;
    }

    @Override // l5.j
    public final boolean a(m5.b bVar) {
        int i10 = bVar.f3940b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            p pVar = this.f3539a;
            String str = bVar.f3939a;
            o7.a aVar = (o7.a) pVar.c;
            synchronized (aVar.f4388b) {
                try {
                    if (aVar.f4387a) {
                        return true;
                    }
                    aVar.f4387a = true;
                    aVar.d = str;
                    ((t) aVar.c).n(aVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    @Override // l5.j
    public final boolean b(Exception exc) {
        return false;
    }
}
