package g0;

import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2418b;
    public final /* synthetic */ e c;
    public final /* synthetic */ b d;

    public /* synthetic */ c(e eVar, b bVar, int i10) {
        this.f2418b = i10;
        this.c = eVar;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2418b) {
            case 0:
                e eVar = this.c;
                ViewPropertyAnimator viewPropertyAnimator = eVar.f2422h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.scaleX(0.8f).scaleY(0.8f).alpha(0.0f).setDuration(300L).withEndAction(new c(eVar, this.d, 1)).start();
                    return;
                }
                return;
            default:
                this.c.setVisibility(8);
                this.d.run();
                return;
        }
    }
}
