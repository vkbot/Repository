package com.example.navistart.mainview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.example.navistart.R;
import e0.l2;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MainView extends CardView {

    /* renamed from: b, reason: collision with root package name */
    public final int f1043b;
    public final String c;

    public MainView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        this.c = "";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.e, 0, 0);
            try {
                this.f1043b = obtainStyledAttributes.getResourceId(1, 0);
                this.c = obtainStyledAttributes.getString(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        LayoutInflater.from(context).inflate(this.f1043b, this);
        TextView textView = (TextView) findViewById(R.id.MainLabel);
        if (textView != null && (str = this.c) != null) {
            textView.setText(str);
        }
    }
}
