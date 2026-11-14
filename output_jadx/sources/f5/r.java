package f5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements z2.b, z2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i8.b f2310b;

    @Override // z2.a
    public void a(Exception exc) {
        i8.b bVar = this.f2310b;
        bVar.onError(exc);
        bVar.a();
    }

    @Override // z2.b
    public void c(Object obj) {
        z7.a aVar;
        i8.b bVar = this.f2310b;
        Object obj2 = bVar.get();
        c8.a aVar2 = c8.a.f577b;
        if (obj2 != aVar2 && (aVar = (z7.a) bVar.getAndSet(aVar2)) != aVar2) {
            x7.f fVar = (x7.f) bVar.c;
            try {
                if (obj == null) {
                    fVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    fVar.c(obj);
                }
                if (aVar != null) {
                    aVar.dispose();
                }
            } catch (Throwable th) {
                if (aVar != null) {
                    aVar.dispose();
                }
                throw th;
            }
        }
        bVar.a();
    }
}
