package b4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import com.example.navistart.R;
import s3.q;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class i extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final h f352k = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final o f353b;
    public int c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f354f;

    /* renamed from: g, reason: collision with root package name */
    public final int f355g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f356h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f357i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f358j;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, AttributeSet attributeSet) {
        super(g4.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Drawable wrap;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a3.a.G);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f353b = o.c(context2, attributeSet, 0, 0).a();
        }
        this.d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(w3.c.a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(q.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f354f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f355g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f352k);
        setFocusable(true);
        if (getBackground() == null) {
            int c = m3.a.c(getBackgroundOverlayColorAlpha(), m3.a.a(R.attr.colorSurface, this), m3.a.a(R.attr.colorOnSurface, this));
            o oVar = this.f353b;
            if (oVar != null) {
                Handler handler = j.f359b;
                z3.k kVar = new z3.k(oVar);
                kVar.q(ColorStateList.valueOf(c));
                gradientDrawable = kVar;
            } else {
                Resources resources = getResources();
                Handler handler2 = j.f359b;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(c);
                gradientDrawable = gradientDrawable2;
            }
            if (this.f356h != null) {
                wrap = DrawableCompat.wrap(gradientDrawable);
                wrap.setTintList(this.f356h);
            } else {
                wrap = DrawableCompat.wrap(gradientDrawable);
            }
            setBackground(wrap);
        }
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.f355g;
    }

    public int getMaxWidth() {
        return this.f354f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f354f;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY), i11);
        }
    }

    public void setAnimationMode(int i10) {
        this.c = i10;
    }

    @Override // android.view.View
    public void setBackground(@Nullable Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        if (drawable != null && this.f356h != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            drawable.setTintList(this.f356h);
            drawable.setTintMode(this.f357i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f356h = colorStateList;
        if (getBackground() != null) {
            Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
            wrap.setTintList(colorStateList);
            wrap.setTintMode(this.f357i);
            if (wrap != getBackground()) {
                super.setBackgroundDrawable(wrap);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        this.f357i = mode;
        if (getBackground() != null) {
            Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
            wrap.setTintMode(mode);
            if (wrap != getBackground()) {
                super.setBackgroundDrawable(wrap);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f358j && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        h hVar;
        if (onClickListener != null) {
            hVar = null;
        } else {
            hVar = f352k;
        }
        setOnTouchListener(hVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(j jVar) {
    }
}
