package t4;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class n implements k5.b {
    public static final org.apache.commons.net.ftp.a c = new org.apache.commons.net.ftp.a(6);
    public static final d d = new d(1);

    /* renamed from: a, reason: collision with root package name */
    public k5.a f5817a;

    /* renamed from: b, reason: collision with root package name */
    public volatile k5.b f5818b;

    public n(org.apache.commons.net.ftp.a aVar, k5.b bVar) {
        this.f5817a = aVar;
        this.f5818b = bVar;
    }

    public final void a(k5.a aVar) {
        k5.b bVar;
        k5.b bVar2;
        k5.b bVar3 = this.f5818b;
        d dVar = d;
        if (bVar3 != dVar) {
            aVar.e(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f5818b;
            if (bVar != dVar) {
                bVar2 = bVar;
            } else {
                this.f5817a = new f5.f(26, this.f5817a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.e(bVar);
        }
    }

    @Override // k5.b
    public final Object get() {
        return this.f5818b.get();
    }
}
