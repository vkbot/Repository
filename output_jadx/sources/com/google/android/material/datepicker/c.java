package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p2.e f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.e f1303b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(w3.b.c(context, n.class.getCanonicalName(), R.attr.materialCalendarStyle).data, a3.a.f20q);
        p2.e.n(obtainStyledAttributes.getResourceId(4, 0), context);
        p2.e.n(obtainStyledAttributes.getResourceId(2, 0), context);
        p2.e.n(obtainStyledAttributes.getResourceId(3, 0), context);
        p2.e.n(obtainStyledAttributes.getResourceId(5, 0), context);
        ColorStateList a10 = w3.c.a(context, obtainStyledAttributes, 7);
        this.f1302a = p2.e.n(obtainStyledAttributes.getResourceId(9, 0), context);
        p2.e.n(obtainStyledAttributes.getResourceId(8, 0), context);
        this.f1303b = p2.e.n(obtainStyledAttributes.getResourceId(10, 0), context);
        new Paint().setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
