package androidx.core.widget;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204b;
    public final /* synthetic */ ContentLoadingProgressBar c;

    public /* synthetic */ a(ContentLoadingProgressBar contentLoadingProgressBar, int i10) {
        this.f204b = i10;
        this.c = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f204b) {
            case 0:
                this.c.lambda$new$0();
                return;
            case 1:
                this.c.lambda$new$1();
                return;
            case 2:
                this.c.showOnUiThread();
                return;
            default:
                this.c.hideOnUiThread();
                return;
        }
    }
}
