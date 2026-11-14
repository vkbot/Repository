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
public class MainCarPrefView extends CardView {

    /* renamed from: b, reason: collision with root package name */
    public final String f1039b;

    public MainCarPrefView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1039b = "";
        LayoutInflater.from(context).inflate(R.layout.main_car, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.f1962b, 0, 0);
        try {
            this.f1039b = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            ((TextView) findViewById(R.id.MainCarPrefViewLabel)).setText(this.f1039b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
