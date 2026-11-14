package f1;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2245b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ c(Runnable runnable, int i10) {
        this.f2245b = i10;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f2245b;
        Runnable runnable = this.c;
        switch (i10) {
            case 0:
                int i11 = e.f2247q;
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
