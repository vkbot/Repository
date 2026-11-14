package e4;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.example.navistart.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2173b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2174f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2175g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f2176h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f2177i;

    /* renamed from: j, reason: collision with root package name */
    public int f2178j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f2179k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2180l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2181m;

    /* renamed from: n, reason: collision with root package name */
    public int f2182n;

    /* renamed from: o, reason: collision with root package name */
    public int f2183o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2184p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2185q;
    public AppCompatTextView r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2186s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f2187u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2188v;
    public CharSequence w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2189x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f2190y;

    /* renamed from: z, reason: collision with root package name */
    public int f2191z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2175g = context;
        this.f2176h = textInputLayout;
        this.f2181m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2172a = com.bumptech.glide.d.q(context, R.attr.motionDurationShort4, 217);
        this.f2173b = com.bumptech.glide.d.q(context, R.attr.motionDurationMedium4, 167);
        this.c = com.bumptech.glide.d.q(context, R.attr.motionDurationShort4, 167);
        this.d = com.bumptech.glide.d.r(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, b3.a.d);
        LinearInterpolator linearInterpolator = b3.a.f340a;
        this.e = com.bumptech.glide.d.r(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2174f = com.bumptech.glide.d.r(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i10) {
        if (this.f2177i == null && this.f2179k == null) {
            Context context = this.f2175g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2177i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2177i;
            TextInputLayout textInputLayout = this.f2176h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2179k = new FrameLayout(context);
            this.f2177i.addView(this.f2179k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            this.f2177i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f2179k.setVisibility(0);
            this.f2179k.addView(appCompatTextView);
        }
        this.f2177i.setVisibility(0);
        this.f2178j++;
    }

    public final void b() {
        if (this.f2177i != null) {
            TextInputLayout textInputLayout = this.f2176h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2175g;
                boolean d = w3.c.d(context);
                LinearLayout linearLayout = this.f2177i;
                int paddingStart = editText.getPaddingStart();
                if (d) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (d) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (d) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2180l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z9, AppCompatTextView appCompatTextView, int i10, int i11, int i12) {
        boolean z10;
        float f8;
        long j10;
        TimeInterpolator timeInterpolator;
        if (appCompatTextView != null && z9) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, f8);
                int i13 = this.c;
                if (z10) {
                    j10 = this.f2173b;
                } else {
                    j10 = i13;
                }
                ofFloat.setDuration(j10);
                if (z10) {
                    timeInterpolator = this.e;
                } else {
                    timeInterpolator = this.f2174f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    ofFloat.setStartDelay(i13);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f2181m, 0.0f);
                    ofFloat2.setDuration(this.f2172a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay(i13);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f2190y;
        }
        return this.r;
    }

    public final void f() {
        this.f2184p = null;
        c();
        if (this.f2182n == 1) {
            if (this.f2189x && !TextUtils.isEmpty(this.w)) {
                this.f2183o = 2;
            } else {
                this.f2183o = 0;
            }
        }
        i(this.f2182n, this.f2183o, h(this.r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2177i;
        if (linearLayout != null) {
            if ((i10 == 0 || i10 == 1) && (frameLayout = this.f2179k) != null) {
                frameLayout.removeView(appCompatTextView);
            } else {
                linearLayout.removeView(appCompatTextView);
            }
            int i11 = this.f2178j - 1;
            this.f2178j = i11;
            LinearLayout linearLayout2 = this.f2177i;
            if (i11 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f2176h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.f2183o != this.f2182n || appCompatTextView == null || !TextUtils.equals(appCompatTextView.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z9) {
        TextView e;
        TextView e6;
        if (i10 == i11) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2180l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f2189x, this.f2190y, 2, i10, i11);
            d(arrayList, this.f2185q, this.r, 1, i10, i11);
            b3.b.a(animatorSet, arrayList);
            animatorSet.addListener(new r(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e6 = e(i11)) != null) {
                e6.setVisibility(0);
                e6.setAlpha(1.0f);
            }
            if (i10 != 0 && (e = e(i10)) != null) {
                e.setVisibility(4);
                if (i10 == 1) {
                    e.setText((CharSequence) null);
                }
            }
            this.f2182n = i11;
        }
        TextInputLayout textInputLayout = this.f2176h;
        textInputLayout.t();
        textInputLayout.w(z9, false);
        textInputLayout.z();
    }
}
