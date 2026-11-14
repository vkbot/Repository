package androidx.activity;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f141b;
    public final /* synthetic */ ComponentActivity c;

    public /* synthetic */ g(ComponentActivity componentActivity, int i10) {
        this.f141b = i10;
        this.c = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f141b) {
            case 0:
                ComponentActivity$onBackPressedDispatcher$2.b(this.c);
                return;
            default:
                ComponentActivity.h(this.c);
                return;
        }
    }
}
