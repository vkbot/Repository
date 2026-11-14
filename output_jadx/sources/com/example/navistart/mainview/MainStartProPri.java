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
public class MainStartProPri extends CardView {

    /* renamed from: b, reason: collision with root package name */
    public final String f1042b;

    public MainStartProPri(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1042b = "";
        LayoutInflater.from(context).inflate(R.layout.main_startpropri, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.f1962b, 0, 0);
        try {
            this.f1042b = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            ((TextView) findViewById(R.id.MainStartProPriLabel)).setText(this.f1042b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
