package h8;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o extends a {
    public final e0.g d;
    public final z3.f e;

    /* renamed from: f, reason: collision with root package name */
    public final w7.c f2699f;

    /* renamed from: g, reason: collision with root package name */
    public final w7.c f2700g;

    public o(x7.b bVar, e0.g gVar) {
        super(bVar);
        this.d = gVar;
        this.e = d8.b.d;
        w7.c cVar = d8.b.c;
        this.f2699f = cVar;
        this.f2700g = cVar;
    }

    @Override // x7.b
    public final void e(x7.d dVar) {
        boolean z9 = dVar instanceof e8.a;
        x7.b bVar = this.c;
        e0.g gVar = this.d;
        if (z9) {
            bVar.d(new m((e8.a) dVar, gVar, this.e, this.f2699f, this.f2700g));
        } else {
            bVar.d(new n(dVar, gVar, this.e, this.f2699f, this.f2700g));
        }
    }
}
