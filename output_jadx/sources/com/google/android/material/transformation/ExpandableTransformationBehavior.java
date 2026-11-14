package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import e3.c;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f1521b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void a(View view, View view2, boolean z9, boolean z10) {
        boolean z11;
        AnimatorSet animatorSet = this.f1521b;
        if (animatorSet != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet b10 = b(view, view2, z9, z11);
        this.f1521b = b10;
        b10.addListener(new c(3, this));
        this.f1521b.start();
        if (!z10) {
            this.f1521b.end();
        }
    }

    public abstract AnimatorSet b(View view, View view2, boolean z9, boolean z10);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
