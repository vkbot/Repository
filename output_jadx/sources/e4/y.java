package e4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.example.navistart.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f2201b;
    public final AppCompatTextView c;
    public CharSequence d;
    public final CheckableImageButton e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f2202f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2203g;

    /* renamed from: h, reason: collision with root package name */
    public int f2204h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView.ScaleType f2205i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f2206j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2207k;

    public y(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f2201b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.c = appCompatTextView;
        if (w3.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f2206j;
        checkableImageButton.setOnClickListener(null);
        y5.k.s(checkableImageButton, onLongClickListener);
        this.f2206j = null;
        checkableImageButton.setOnLongClickListener(null);
        y5.k.s(checkableImageButton, null);
        if (tintTypedArray.hasValue(70)) {
            this.f2202f = w3.c.b(getContext(), tintTypedArray, 70);
        }
        if (tintTypedArray.hasValue(71)) {
            this.f2203g = s3.q.b(tintTypedArray.getInt(71, -1), null);
        }
        if (tintTypedArray.hasValue(67)) {
            b(tintTypedArray.getDrawable(67));
            if (tintTypedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = tintTypedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(tintTypedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f2204h) {
                this.f2204h = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (tintTypedArray.hasValue(69)) {
                ImageView.ScaleType d = y5.k.d(tintTypedArray.getInt(69, -1));
                this.f2205i = d;
                checkableImageButton.setScaleType(d);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            appCompatTextView.setAccessibilityLiveRegion(1);
            TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(61, 0));
            if (tintTypedArray.hasValue(62)) {
                appCompatTextView.setTextColor(tintTypedArray.getColorStateList(62));
            }
            CharSequence text2 = tintTypedArray.getText(60);
            this.d = TextUtils.isEmpty(text2) ? null : text2;
            appCompatTextView.setText(text2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        j1.i.k("startIconSize cannot be less than 0");
        throw null;
    }

    public final int a() {
        int i10;
        CheckableImageButton checkableImageButton = this.e;
        if (checkableImageButton.getVisibility() == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        return this.c.getPaddingStart() + getPaddingStart() + i10;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2202f;
            PorterDuff.Mode mode = this.f2203g;
            TextInputLayout textInputLayout = this.f2201b;
            y5.k.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            y5.k.o(textInputLayout, checkableImageButton, this.f2202f);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f2206j;
        checkableImageButton.setOnClickListener(null);
        y5.k.s(checkableImageButton, onLongClickListener);
        this.f2206j = null;
        checkableImageButton.setOnLongClickListener(null);
        y5.k.s(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z9) {
        boolean z10;
        CheckableImageButton checkableImageButton = this.e;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            if (!z9) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f2201b.f1448f;
        if (editText == null) {
            return;
        }
        if (this.e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            paddingStart = editText.getPaddingStart();
        }
        this.c.setPaddingRelative(paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10;
        int i11 = 8;
        if (this.d != null && !this.f2207k) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.e.getVisibility() == 0 || i10 == 0) {
            i11 = 0;
        }
        setVisibility(i11);
        this.c.setVisibility(i10);
        this.f2201b.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
