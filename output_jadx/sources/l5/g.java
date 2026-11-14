package l5;

import com.bumptech.glide.manager.t;
import n.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f3537a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3538b;

    public g(k kVar, p pVar) {
        this.f3537a = kVar;
        this.f3538b = pVar;
    }

    @Override // l5.j
    public final boolean a(m5.b bVar) {
        if (bVar.f3940b == 4 && !this.f3537a.a(bVar)) {
            String str = bVar.c;
            if (str != null) {
                ((o7.a) this.f3538b.c).g(new a(str, bVar.e, bVar.f3941f));
                return true;
            }
            n0.b.n("Null token");
            return false;
        }
        return false;
    }

    @Override // l5.j
    public final boolean b(Exception exc) {
        o7.a aVar = (o7.a) this.f3538b.c;
        aVar.getClass();
        synchronized (aVar.f4388b) {
            try {
                if (aVar.f4387a) {
                    return true;
                }
                aVar.f4387a = true;
                aVar.e = exc;
                ((t) aVar.c).n(aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
