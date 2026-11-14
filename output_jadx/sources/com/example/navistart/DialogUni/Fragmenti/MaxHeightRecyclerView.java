package com.example.navistart.DialogUni.Fragmenti;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaxHeightRecyclerView extends RecyclerView {

    /* renamed from: b, reason: collision with root package name */
    public int f733b;

    public MaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f733b = Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f733b, Integer.MIN_VALUE));
    }

    public void setMaxHeight(int i10) {
        this.f733b = i10;
    }
}
