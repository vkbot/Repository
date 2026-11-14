package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.h;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b3.e;
import com.example.navistart.R;
import java.util.HashMap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    public HashMap f1525i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void a(View view, View view2, boolean z9, boolean z10) {
        boolean z11;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                this.f1525i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (childAt != view2 && !z11) {
                    HashMap hashMap = this.f1525i;
                    if (!z9) {
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.f1525i.get(childAt)).intValue());
                        }
                    } else {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z9) {
                this.f1525i = null;
            }
        }
        super.a(view, view2, z9, z10);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final h h(Context context, boolean z9) {
        int i10;
        if (z9) {
            i10 = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i10 = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        h hVar = new h(13, false);
        hVar.c = e.b(i10, context);
        hVar.d = new c5.e(1);
        return hVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
