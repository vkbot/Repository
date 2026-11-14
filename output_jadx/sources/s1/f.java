package s1;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5487b;
    public final /* synthetic */ k c;

    public /* synthetic */ f(k kVar, int i10) {
        this.f5487b = i10;
        this.c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5487b) {
            case 0:
                k kVar = this.c;
                kVar.d();
                if (kVar.f5518b.f()) {
                    kVar.l();
                    return;
                } else {
                    kVar.y();
                    return;
                }
            case 1:
                this.c.l();
                return;
            default:
                this.c.z();
                return;
        }
    }
}
