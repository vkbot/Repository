package o7;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4614b;
    public final /* synthetic */ k0 c;

    public /* synthetic */ m0(k0 k0Var, int i10) {
        this.f4614b = i10;
        this.c = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4614b) {
            case 0:
                this.c.d.request();
                return;
            case 1:
                this.c.d.o();
                return;
            case 2:
                this.c.j();
                return;
            case 3:
                this.c.d.flush();
                return;
            default:
                this.c.d.i();
                return;
        }
    }
}
