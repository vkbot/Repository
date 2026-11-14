package e4;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2115b;
    public final /* synthetic */ q c;

    public /* synthetic */ a(q qVar, int i10) {
        this.f2115b = i10;
        this.c = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f2115b) {
            case 0:
                d dVar = (d) this.c;
                dVar.s(dVar.t());
                return;
            default:
                l lVar = (l) this.c;
                lVar.f2141l = z9;
                lVar.p();
                if (!z9) {
                    lVar.s(false);
                    lVar.f2142m = false;
                    return;
                }
                return;
        }
    }
}
