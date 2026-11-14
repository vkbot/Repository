package c3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class h extends CoordinatorLayout.Behavior {

    /* renamed from: a, reason: collision with root package name */
    public i f520a;

    /* renamed from: b, reason: collision with root package name */
    public int f521b;

    public h() {
        this.f521b = 0;
    }

    public final int a() {
        i iVar = this.f520a;
        if (iVar != null) {
            return iVar.c;
        }
        return 0;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.onLayoutChild(view, i10);
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [c3.i, java.lang.Object] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        b(coordinatorLayout, view, i10);
        if (this.f520a == null) {
            ?? obj = new Object();
            obj.d = view;
            this.f520a = obj;
        }
        i iVar = this.f520a;
        View view2 = (View) iVar.d;
        iVar.f522a = view2.getTop();
        iVar.f523b = view2.getLeft();
        this.f520a.b();
        int i11 = this.f521b;
        if (i11 != 0) {
            i iVar2 = this.f520a;
            if (iVar2.c != i11) {
                iVar2.c = i11;
                iVar2.b();
            }
            this.f521b = 0;
            return true;
        }
        return true;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f521b = 0;
    }
}
