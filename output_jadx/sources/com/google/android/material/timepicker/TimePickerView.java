package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.navistart.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Chip f1512b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ?? obj = new Object();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f1266l.add(new Object());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f1512b = chip2;
        k kVar = new k(new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()));
        chip.setOnTouchListener(kVar);
        chip2.setOnTouchListener(kVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(obj);
        chip2.setOnClickListener(obj);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f1512b.sendAccessibilityEvent(8);
        }
    }
}
