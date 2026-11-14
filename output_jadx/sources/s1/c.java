package s1;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5478b;
    public final /* synthetic */ k c;

    public /* synthetic */ c(k kVar, int i10) {
        this.f5478b = i10;
        this.c = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5478b) {
            case 0:
                this.c.r();
                return;
            case 1:
                this.c.y();
                return;
            case 2:
                this.c.z();
                return;
            case 3:
                this.c.j(false);
                return;
            default:
                this.c.j(true);
                return;
        }
    }
}
