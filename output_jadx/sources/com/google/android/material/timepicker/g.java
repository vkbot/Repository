package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.navistart.R;
import z3.l;
import z3.n;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class g extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public final f f1518b;
    public int c;
    public final z3.k d;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.f] */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        z3.k kVar = new z3.k();
        this.d = kVar;
        l lVar = new l(0.5f);
        n g10 = kVar.c.f6749a.g();
        g10.e = lVar;
        g10.f6786f = lVar;
        g10.f6787g = lVar;
        g10.f6788h = lVar;
        kVar.setShapeAppearanceModel(g10.a());
        this.d.q(ColorStateList.valueOf(-1));
        setBackground(this.d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.C, R.attr.materialClockStyle, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1518b = new Runnable() { // from class: com.google.android.material.timepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.a();
            }
        };
        obtainStyledAttributes.recycle();
    }

    public abstract void a();

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            f fVar = this.f1518b;
            handler.removeCallbacks(fVar);
            handler.post(fVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            f fVar = this.f1518b;
            handler.removeCallbacks(fVar);
            handler.post(fVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.d.q(ColorStateList.valueOf(i10));
    }
}
