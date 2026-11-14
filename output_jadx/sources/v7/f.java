package v7;

import n7.i0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5955a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f5956b;
    public final /* synthetic */ b c;

    public /* synthetic */ f(b bVar, i0 i0Var, int i10) {
        this.f5955a = i10;
        this.c = bVar;
        this.f5956b = i0Var;
    }

    @Override // n7.i0
    public final void a(n7.k kVar) {
        switch (this.f5955a) {
            case 0:
                this.f5956b.a(kVar);
                ((g) this.c).e.a(kVar);
                return;
            default:
                s sVar = (s) this.c;
                sVar.f5981g = kVar;
                if (!sVar.f5980f) {
                    this.f5956b.a(kVar);
                    return;
                }
                return;
        }
    }
}
