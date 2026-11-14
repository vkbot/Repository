package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class o implements OnApplyWindowInsetsListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1325b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1326f;

    public o(View view, int i10, int i11, int i12, int i13) {
        this.f1325b = i10;
        this.c = view;
        this.d = i11;
        this.e = i12;
        this.f1326f = i13;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        View view2 = this.c;
        int i10 = this.f1325b;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + insets.top;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.d + insets.left, this.e + insets.top, this.f1326f + insets.right, view2.getPaddingBottom());
        return windowInsetsCompat;
    }
}
