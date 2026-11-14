package t1;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5785b;
    public final /* synthetic */ View c;

    public /* synthetic */ l(int i10, View view) {
        this.f5785b = i10;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5785b) {
            case 0:
                m mVar = (m) this.c;
                mVar.b();
                mVar.postDelayed(this, 10000L);
                return;
            case 1:
                n nVar = (n) this.c;
                nVar.setTemperatura(h0.b.a().e().d);
                nVar.postDelayed(this, 10000L);
                return;
            default:
                x0.c cVar = (x0.c) this.c;
                if (cVar.f6432f && !cVar.d && !cVar.c.f6485u.stream().noneMatch(new i7.k(7))) {
                    x0.c.f6430s.execute(new f5.j(24, this));
                    return;
                }
                return;
        }
    }
}
