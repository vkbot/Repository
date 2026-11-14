package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import q3.a;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f1520a;

    public ExpandableBehavior() {
        this.f1520a = 0;
    }

    public abstract void a(View view, View view2, boolean z9, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z9 = ((FloatingActionButton) obj).f1369p.c;
        int i10 = this.f1520a;
        int i11 = 2;
        if (z9) {
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (i10 != 1) {
            return false;
        }
        if (z9) {
            i11 = 1;
        }
        this.f1520a = i11;
        a((View) obj, view, z9, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a aVar;
        if (!view.isLaidOut()) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    View view2 = dependencies.get(i11);
                    if (layoutDependsOn(coordinatorLayout, view, view2)) {
                        aVar = (a) view2;
                        break;
                    }
                    i11++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                boolean z9 = ((FloatingActionButton) aVar).f1369p.c;
                int i12 = this.f1520a;
                int i13 = 2;
                if (!z9 ? i12 == 1 : !(i12 != 0 && i12 != 2)) {
                    if (z9) {
                        i13 = 1;
                    }
                    this.f1520a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new h4.a(this, view, i13, aVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1520a = 0;
    }
}
