package d4;

import android.view.View;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1813b;

    public k(l lVar, View view) {
        this.f1813b = lVar;
        this.f1812a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f1812a;
        if (view2.getVisibility() == 0) {
            this.f1813b.d(view2);
        }
    }
}
