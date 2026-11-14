package f5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements b8.c, b8.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5.c f2308b;

    public /* synthetic */ p(x5.c cVar) {
        this.f2308b = cVar;
    }

    @Override // b8.b
    public void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        x5.c cVar = this.f2308b;
        if (com.bumptech.glide.g.a(cVar.r(), 1)) {
            e3.d.n("Already impressed campaign " + cVar.u().p() + " ? : " + bool);
            return;
        }
        if (com.bumptech.glide.g.a(cVar.r(), 2)) {
            e3.d.n("Already impressed experiment " + cVar.p().p() + " ? : " + bool);
        }
    }

    @Override // b8.c
    public Object apply(Object obj) {
        return this.f2308b;
    }
}
