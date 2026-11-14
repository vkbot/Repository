package com.google.android.material.tabs;

import a3.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1419b;
    public final Drawable c;
    public final int d;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, a.I);
        this.f1419b = obtainStyledAttributes.getText(2);
        this.c = obtainStyledAttributes.getDrawable(0);
        this.d = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
