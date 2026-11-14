package m7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3958b;
    public final /* synthetic */ j c;

    public /* synthetic */ i(j jVar, int i10) {
        this.f3958b = i10;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3958b) {
            case 0:
                this.c.d();
                return;
            default:
                this.c.a();
                return;
        }
    }
}
