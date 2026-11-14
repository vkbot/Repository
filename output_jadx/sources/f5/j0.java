package f5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j0 implements e5.b, f2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2295b;
    public final t8.a c;
    public final t8.a d;

    public /* synthetic */ j0(t8.a aVar, t8.a aVar2, int i10) {
        this.f2295b = i10;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // t8.a
    public final Object get() {
        switch (this.f2295b) {
            case 0:
                return new i0((y) this.c.get(), (i5.a) this.d.get());
            default:
                return new k2.h(new c5.e(15), new z3.f(14), k2.a.f3382f, (k2.j) this.c.get(), this.d);
        }
    }
}
