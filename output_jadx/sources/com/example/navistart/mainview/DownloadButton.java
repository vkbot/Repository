package com.example.navistart.mainview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.example.navistart.R;
import e4.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class DownloadButton extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1009f = 0;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1010b;
    public TextView c;
    public GradientDrawable d;
    public ValueAnimator e;

    public DownloadButton(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Context context) {
        setOrientation(0);
        setGravity(16);
        setPadding(32, 20, 32, 20);
        setClickable(true);
        setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{-16711766, -16733441, -16711766});
        this.d = gradientDrawable;
        gradientDrawable.setUseLevel(true);
        this.d.setCornerRadius(24.0f);
        this.d.setStroke(4, -16711766);
        setBackground(this.d);
        this.f1010b = new ImageView(context);
        this.f1010b.setLayoutParams(new LinearLayout.LayoutParams(48, 48));
        this.f1010b.setImageResource(R.drawable.ic_download);
        this.f1010b.setColorFilter(-1);
        this.c = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = 16;
        this.c.setLayoutParams(layoutParams);
        this.c.setText(context.getString(R.string.Run_Store_Mod));
        this.c.setTextColor(-1);
        this.c.setTextSize(14.0f);
        this.c.setTypeface(null, 1);
        addView(this.f1010b);
        addView(this.c);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.jctModernUi, typedValue, true) && typedValue.data != 0) {
            setBackgroundResource(R.drawable.modern_button_primary);
            float f8 = getResources().getDisplayMetrics().density;
            float f10 = 16.0f * f8;
            float f11 = 10.0f * f8;
            setPadding(Math.round(f10), Math.round(f11), Math.round(f10), Math.round(f11));
            setMinimumHeight(Math.round(f8 * 48.0f));
            this.c.setTextColor(context.getColor(R.color.modern_text));
            this.c.setTextSize(15.0f);
            return;
        }
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        this.e = ofInt;
        ofInt.setDuration(3000L);
        this.e.setRepeatCount(-1);
        this.e.setInterpolator(new LinearInterpolator());
        this.e.addUpdateListener(new h(3, this));
        this.e.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
