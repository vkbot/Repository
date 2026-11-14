package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b3.a;
import com.bumptech.glide.d;
import com.example.navistart.R;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f1418b;
    public Button c;
    public final TimeInterpolator d;
    public int e;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = d.r(context, R.attr.motionEasingEmphasizedInterpolator, a.f341b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z9;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f1418b.getPaddingTop() == i11 && this.f1418b.getPaddingBottom() == i12) {
            return z9;
        }
        TextView textView = this.f1418b;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i11, textView.getPaddingEnd(), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.c;
    }

    public TextView getMessageView() {
        return this.f1418b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1418b = (TextView) findViewById(R.id.snackbar_text);
        this.c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z9;
        super.onMeasure(i10, i11);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f1418b.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && this.e > 0 && this.c.getMeasuredWidth() > this.e) {
                if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z9) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.e = i10;
    }
}
