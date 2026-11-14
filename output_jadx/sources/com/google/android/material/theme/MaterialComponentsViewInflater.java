package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.button.MaterialButton;
import e4.w;
import g4.a;
import k3.c;
import s3.l;
import w3.b;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton, v3.a, android.view.View] */
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        int i10 = R.attr.radioButtonStyle;
        ?? appCompatRadioButton = new AppCompatRadioButton(a.a(context, attributeSet, i10, com.example.navistart.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, i10);
        Context context2 = appCompatRadioButton.getContext();
        TypedArray d = l.d(context2, attributeSet, a3.a.f23v, i10, com.example.navistart.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d.hasValue(0)) {
            CompoundButtonCompat.setButtonTintList(appCompatRadioButton, w3.c.a(context2, d, 0));
        }
        appCompatRadioButton.c = d.getBoolean(1, false);
        d.recycle();
        return appCompatRadioButton;
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = appCompatTextView.getContext();
        if (b.b(context2, com.example.navistart.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a3.a.A;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int a10 = f4.a.a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a10 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a3.a.f26z);
                    int a11 = f4.a.a(appCompatTextView.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (a11 >= 0) {
                        appCompatTextView.setLineHeight(a11);
                    }
                }
            }
        }
        return appCompatTextView;
    }
}
