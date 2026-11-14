package m0;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m1 implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f3782b;

    public m1(n1 n1Var) {
        this.f3782b = n1Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        l0.a aVar;
        if (((ViewGroup) view).getChildCount() == 0 && (aVar = (l0.a) this.f3782b.getParentFragment()) != null) {
            aVar.dismiss();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
    }
}
