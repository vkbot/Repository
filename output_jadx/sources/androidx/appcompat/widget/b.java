package androidx.appcompat.widget;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f156b;
    public final /* synthetic */ Toolbar c;

    public /* synthetic */ b(Toolbar toolbar, int i10) {
        this.f156b = i10;
        this.c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f156b) {
            case 0:
                this.c.collapseActionView();
                return;
            default:
                this.c.invalidateMenu();
                return;
        }
    }
}
