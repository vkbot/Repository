package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialCalendarGridView f1353b;

    public u(LinearLayout linearLayout, boolean z9) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f1352a = textView;
        ViewCompat.setAccessibilityHeading(textView, true);
        this.f1353b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z9) {
            textView.setVisibility(8);
        }
    }
}
