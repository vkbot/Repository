package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends a {
    public final /* synthetic */ int d = 0;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2663f;

    /* renamed from: g, reason: collision with root package name */
    public final b8.c f2664g;

    public g(l lVar, int i10) {
        super(lVar);
        this.f2664g = d8.b.f1857a;
        this.e = 3;
        this.f2663f = i10;
    }

    @Override // x7.b
    public final void e(x7.d dVar) {
        x7.d cVar;
        switch (this.d) {
            case 0:
                f5.q qVar = (f5.q) this.f2664g;
                x7.b bVar = this.c;
                if (!y5.k.y(bVar, dVar, qVar)) {
                    int c = com.bumptech.glide.g.c(this.f2663f);
                    int i10 = this.e;
                    if (c != 1) {
                        if (c != 2) {
                            cVar = new d(dVar, qVar, i10);
                        } else {
                            cVar = new c(dVar, qVar, i10, true);
                        }
                    } else {
                        cVar = new c(dVar, qVar, i10, false);
                    }
                    bVar.d(cVar);
                    return;
                }
                return;
            default:
                c5.e eVar = (c5.e) this.f2664g;
                x7.b bVar2 = this.c;
                if (!y5.k.y(bVar2, dVar, eVar)) {
                    bVar2.d(new y(dVar, eVar, this.e, this.f2663f));
                    return;
                }
                return;
        }
    }

    public g(a0 a0Var, f5.q qVar) {
        super(a0Var);
        this.f2664g = qVar;
        this.e = 2;
        this.f2663f = 1;
    }
}
