package e0;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1912b;
    public final /* synthetic */ g2 c;

    public /* synthetic */ f2(g2 g2Var, int i10) {
        this.f1912b = i10;
        this.c = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1912b) {
            case 0:
                this.c.f1921f.setVisibility(0);
                return;
            default:
                this.c.d.setVisibility(4);
                return;
        }
    }
}
