package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import b1.u;
import com.bumptech.glide.d;
import com.bumptech.glide.m;
import com.google.android.material.internal.CheckableImageButton;
import e0.g;
import e4.a0;
import e4.b0;
import e4.c0;
import e4.p;
import e4.s;
import e4.t;
import e4.w;
import e4.y;
import e4.z;
import g4.a;
import j1.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s3.c;
import s3.l;
import w3.b;
import z3.f;
import z3.h;
import z3.k;
import z3.n;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public ValueAnimator A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public boolean E;
    public CharSequence F;
    public boolean G;
    public k H;
    public k I;
    public StateListDrawable J;
    public boolean K;
    public k L;
    public k M;
    public o N;
    public boolean O;
    public final int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f1442a0;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f1443b;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f1444b0;
    public final y c;

    /* renamed from: c0, reason: collision with root package name */
    public final RectF f1445c0;
    public final p d;

    /* renamed from: d0, reason: collision with root package name */
    public Typeface f1446d0;
    public final int e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorDrawable f1447e0;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1448f;

    /* renamed from: f0, reason: collision with root package name */
    public int f1449f0;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f1450g;

    /* renamed from: g0, reason: collision with root package name */
    public final LinkedHashSet f1451g0;

    /* renamed from: h, reason: collision with root package name */
    public int f1452h;

    /* renamed from: h0, reason: collision with root package name */
    public ColorDrawable f1453h0;

    /* renamed from: i, reason: collision with root package name */
    public int f1454i;

    /* renamed from: i0, reason: collision with root package name */
    public int f1455i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1456j;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f1457j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1458k;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f1459k0;

    /* renamed from: l, reason: collision with root package name */
    public final t f1460l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f1461l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1462m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1463m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1464n;

    /* renamed from: n0, reason: collision with root package name */
    public int f1465n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1466o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1467o0;

    /* renamed from: p, reason: collision with root package name */
    public b0 f1468p;

    /* renamed from: p0, reason: collision with root package name */
    public ColorStateList f1469p0;

    /* renamed from: q, reason: collision with root package name */
    public AppCompatTextView f1470q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1471q0;
    public int r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1472r0;

    /* renamed from: s, reason: collision with root package name */
    public int f1473s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1474s0;
    public CharSequence t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1475t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1476u;

    /* renamed from: u0, reason: collision with root package name */
    public int f1477u0;

    /* renamed from: v, reason: collision with root package name */
    public AppCompatTextView f1478v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1479v0;
    public ColorStateList w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1480w0;

    /* renamed from: x, reason: collision with root package name */
    public int f1481x;

    /* renamed from: x0, reason: collision with root package name */
    public final c f1482x0;

    /* renamed from: y, reason: collision with root package name */
    public Fade f1483y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f1484y0;

    /* renamed from: z, reason: collision with root package name */
    public Fade f1485z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1486z0;

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.example.navistart.R.attr.textInputStyle, com.example.navistart.R.style.Widget_Design_TextInputLayout), attributeSet, com.example.navistart.R.attr.textInputStyle);
        this.f1452h = -1;
        this.f1454i = -1;
        this.f1456j = -1;
        this.f1458k = -1;
        this.f1460l = new t(this);
        this.f1468p = new g(7);
        this.f1442a0 = new Rect();
        this.f1444b0 = new Rect();
        this.f1445c0 = new RectF();
        this.f1451g0 = new LinkedHashSet();
        c cVar = new c(this);
        this.f1482x0 = cVar;
        this.D0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1443b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = b3.a.f340a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.f5665g != 8388659) {
            cVar.f5665g = 8388659;
            cVar.j(false);
        }
        l.a(context2, attributeSet, com.example.navistart.R.attr.textInputStyle, com.example.navistart.R.style.Widget_Design_TextInputLayout);
        int[] iArr = a3.a.L;
        l.b(context2, attributeSet, iArr, com.example.navistart.R.attr.textInputStyle, com.example.navistart.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, com.example.navistart.R.attr.textInputStyle, com.example.navistart.R.style.Widget_Design_TextInputLayout);
        y yVar = new y(this, obtainStyledAttributes);
        this.c = yVar;
        this.E = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f1486z0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1484y0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.N = o.c(context2, attributeSet, com.example.navistart.R.attr.textInputStyle, com.example.navistart.R.style.Widget_Design_TextInputLayout).a();
        this.P = context2.getResources().getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.e = getResources().getDimensionPixelSize(com.example.navistart.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.T = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.example.navistart.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.U = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.example.navistart.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = this.T;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        n g10 = this.N.g();
        if (dimension >= 0.0f) {
            g10.e = new z3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            g10.f6786f = new z3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            g10.f6787g = new z3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            g10.f6788h = new z3.a(dimension4);
        }
        this.N = g10.a();
        ColorStateList b10 = w3.c.b(context2, obtainStyledAttributes, 7);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.f1471q0 = defaultColor;
            this.W = defaultColor;
            if (b10.isStateful()) {
                this.f1472r0 = b10.getColorForState(new int[]{-16842910}, -1);
                this.f1474s0 = b10.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1475t0 = b10.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1474s0 = this.f1471q0;
                ColorStateList colorStateList = AppCompatResources.getColorStateList(context2, com.example.navistart.R.color.mtrl_filled_background_color);
                this.f1472r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f1475t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.W = 0;
            this.f1471q0 = 0;
            this.f1472r0 = 0;
            this.f1474s0 = 0;
            this.f1475t0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(1);
            this.f1461l0 = colorStateList2;
            this.f1459k0 = colorStateList2;
        }
        ColorStateList b11 = w3.c.b(context2, obtainStyledAttributes, 14);
        this.f1467o0 = obtainStyledAttributes.getColor(14, 0);
        this.f1463m0 = ContextCompat.getColor(context2, com.example.navistart.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1477u0 = ContextCompat.getColor(context2, com.example.navistart.R.color.mtrl_textinput_disabled_color);
        this.f1465n0 = ContextCompat.getColor(context2, com.example.navistart.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b11 != null) {
            setBoxStrokeColorStateList(b11);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(w3.c.b(context2, obtainStyledAttributes, 15));
        }
        if (obtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(50, 0));
        }
        this.C = obtainStyledAttributes.getColorStateList(24);
        this.D = obtainStyledAttributes.getColorStateList(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i10 = obtainStyledAttributes.getInt(34, 1);
        boolean z9 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = obtainStyledAttributes.getText(57);
        boolean z11 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f1473s = obtainStyledAttributes.getResourceId(22, 0);
        this.r = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.r);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1473s);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(obtainStyledAttributes.getColorStateList(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(obtainStyledAttributes.getColorStateList(46));
        }
        if (obtainStyledAttributes.hasValue(51)) {
            setHintTextColor(obtainStyledAttributes.getColorStateList(51));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(obtainStyledAttributes.getColorStateList(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(obtainStyledAttributes.getColorStateList(21));
        }
        if (obtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(obtainStyledAttributes.getColorStateList(59));
        }
        p pVar = new p(this, obtainStyledAttributes);
        this.d = pVar;
        boolean z12 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(49, 1));
        obtainStyledAttributes.recycle();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z9);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        int i10;
        EditText editText = this.f1448f;
        if ((editText instanceof AutoCompleteTextView) && editText.getInputType() == 0) {
            int a10 = m3.a.a(androidx.appcompat.R.attr.colorControlHighlight, this.f1448f);
            int i11 = this.Q;
            int[][] iArr = E0;
            if (i11 == 2) {
                Context context = getContext();
                k kVar = this.H;
                TypedValue c = b.c(context, "TextInputLayout", com.example.navistart.R.attr.colorSurface);
                int i12 = c.resourceId;
                if (i12 != 0) {
                    i10 = ContextCompat.getColor(context, i12);
                } else {
                    i10 = c.data;
                }
                k kVar2 = new k(kVar.c.f6749a);
                int c10 = m3.a.c(0.1f, a10, i10);
                kVar2.q(new ColorStateList(iArr, new int[]{c10, 0}));
                kVar2.setTint(i10);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{c10, i10});
                k kVar3 = new k(kVar.c.f6749a);
                kVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar2, kVar3), kVar});
            }
            if (i11 == 1) {
                k kVar4 = this.H;
                int i13 = this.W;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{m3.a.c(0.1f, a10, i13), i13}), kVar4, kVar4);
            }
            return null;
        }
        return this.H;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.J == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.J = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.J.addState(new int[0], h(false));
        }
        return this.J;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.I == null) {
            this.I = h(true);
        }
        return this.I;
    }

    public static void m(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z9);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1448f == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f1448f = editText;
            int i10 = this.f1452h;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f1456j);
            }
            int i11 = this.f1454i;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f1458k);
            }
            this.K = false;
            k();
            setTextInputAccessibilityDelegate(new a0(this));
            Typeface typeface = this.f1448f.getTypeface();
            c cVar = this.f1482x0;
            cVar.n(typeface);
            float textSize = this.f1448f.getTextSize();
            if (cVar.f5667h != textSize) {
                cVar.f5667h = textSize;
                cVar.j(false);
            }
            float letterSpacing = this.f1448f.getLetterSpacing();
            if (cVar.X != letterSpacing) {
                cVar.X = letterSpacing;
                cVar.j(false);
            }
            int gravity = this.f1448f.getGravity();
            int i12 = (gravity & (-113)) | 48;
            if (cVar.f5665g != i12) {
                cVar.f5665g = i12;
                cVar.j(false);
            }
            if (cVar.f5663f != gravity) {
                cVar.f5663f = gravity;
                cVar.j(false);
            }
            this.f1479v0 = editText.getMinimumHeight();
            this.f1448f.addTextChangedListener(new z(this, editText));
            if (this.f1459k0 == null) {
                this.f1459k0 = this.f1448f.getHintTextColors();
            }
            if (this.E) {
                if (TextUtils.isEmpty(this.F)) {
                    CharSequence hint = this.f1448f.getHint();
                    this.f1450g = hint;
                    setHint(hint);
                    this.f1448f.setHint((CharSequence) null);
                }
                this.G = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            if (this.f1470q != null) {
                p(this.f1448f.getText());
            }
            t();
            this.f1460l.b();
            this.c.bringToFront();
            p pVar = this.d;
            pVar.bringToFront();
            Iterator it = this.f1451g0.iterator();
            while (it.hasNext()) {
                ((e4.n) it.next()).a(this);
            }
            pVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            w(false, true);
            return;
        }
        i.k("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.F)) {
            this.F = charSequence;
            c cVar = this.f1482x0;
            if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
                cVar.B = charSequence;
                cVar.C = null;
                cVar.j(false);
            }
            if (!this.f1480w0) {
                l();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.f1476u == z9) {
            return;
        }
        AppCompatTextView appCompatTextView = this.f1478v;
        if (z9) {
            if (appCompatTextView != null) {
                this.f1443b.addView(appCompatTextView);
                this.f1478v.setVisibility(0);
            }
        } else {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.f1478v = null;
        }
        this.f1476u = z9;
    }

    public final void a() {
        if (this.f1448f != null && this.Q == 1) {
            if (getHintMaxLines() == 1) {
                if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                    EditText editText = this.f1448f;
                    editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f1448f.getPaddingEnd(), getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                    return;
                } else {
                    if (w3.c.d(getContext())) {
                        EditText editText2 = this.f1448f;
                        editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f1448f.getPaddingEnd(), getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                        return;
                    }
                    return;
                }
            }
            EditText editText3 = this.f1448f;
            editText3.setPaddingRelative(editText3.getPaddingStart(), (int) (this.f1482x0.f() + this.e), this.f1448f.getPaddingEnd(), getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f1443b;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            v();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(float f8) {
        c cVar = this.f1482x0;
        if (cVar.f5658b == f8) {
            return;
        }
        int i10 = 1;
        if (this.A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0 = valueAnimator;
            valueAnimator.setInterpolator(d.r(getContext(), com.example.navistart.R.attr.motionEasingEmphasizedInterpolator, b3.a.f341b));
            this.A0.setDuration(d.q(getContext(), com.example.navistart.R.attr.motionDurationMedium4, 167));
            this.A0.addUpdateListener(new d4.b(i10, this));
        }
        this.A0.setFloatValues(cVar.f5658b, f8);
        this.A0.start();
    }

    public final void c() {
        ColorStateList valueOf;
        int i10;
        int i11;
        k kVar = this.H;
        if (kVar == null) {
            return;
        }
        o oVar = kVar.c.f6749a;
        o oVar2 = this.N;
        if (oVar != oVar2) {
            kVar.setShapeAppearanceModel(oVar2);
        }
        if (this.Q == 2 && (i10 = this.S) > -1 && (i11 = this.V) != 0) {
            k kVar2 = this.H;
            kVar2.c.f6756k = i10;
            kVar2.invalidateSelf();
            ColorStateList valueOf2 = ColorStateList.valueOf(i11);
            h hVar = kVar2.c;
            if (hVar.e != valueOf2) {
                hVar.e = valueOf2;
                kVar2.onStateChange(kVar2.getState());
            }
        }
        int i12 = this.W;
        if (this.Q == 1) {
            i12 = ColorUtils.compositeColors(this.W, m3.a.b(getContext(), com.example.navistart.R.attr.colorSurface, 0));
        }
        this.W = i12;
        this.H.q(ColorStateList.valueOf(i12));
        k kVar3 = this.L;
        if (kVar3 != null && this.M != null) {
            if (this.S > -1 && this.V != 0) {
                if (this.f1448f.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f1463m0);
                } else {
                    valueOf = ColorStateList.valueOf(this.V);
                }
                kVar3.q(valueOf);
                this.M.q(ColorStateList.valueOf(this.V));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        boolean z9;
        if (this.f1448f != null) {
            if (getLayoutDirection() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = rect.bottom;
            Rect rect2 = this.f1444b0;
            rect2.bottom = i10;
            int i11 = this.Q;
            if (i11 != 1) {
                int i12 = rect.left;
                if (i11 != 2) {
                    rect2.left = i(i12, z9);
                    rect2.top = getPaddingTop();
                    rect2.right = j(rect.right, z9);
                    return rect2;
                }
                rect2.left = this.f1448f.getPaddingLeft() + i12;
                rect2.top = rect.top - e();
                rect2.right = rect.right - this.f1448f.getPaddingRight();
                return rect2;
            }
            rect2.left = i(rect.left, z9);
            rect2.top = rect.top + this.R;
            rect2.right = j(rect.right, z9);
            return rect2;
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f1448f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f1450g != null) {
            boolean z9 = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.f1448f.setHint(this.f1450g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f1448f.setHint(hint);
                this.G = z9;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f1443b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f1448f) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.C0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        k kVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z9 = this.E;
        c cVar = this.f1482x0;
        if (z9) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.e;
            int save = canvas2.save();
            if (cVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f8 = cVar.f5680q;
                float f10 = cVar.r;
                float f11 = cVar.F;
                if (f11 != 1.0f) {
                    canvas2.scale(f11, f11, f8, f10);
                }
                if ((cVar.f5662e0 > 1 || cVar.f5664f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.f5680q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f10);
                    float f12 = alpha;
                    textPaint.setAlpha((int) (cVar.f5660c0 * f12));
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 31) {
                        float f13 = cVar.H;
                        float f14 = cVar.I;
                        float f15 = cVar.J;
                        int i11 = cVar.K;
                        textPaint.setShadowLayer(f13, f14, f15, ColorUtils.setAlphaComponent(i11, (textPaint.getAlpha() * Color.alpha(i11)) / 255));
                    }
                    cVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (cVar.f5659b0 * f12));
                    if (i10 >= 31) {
                        float f16 = cVar.H;
                        float f17 = cVar.I;
                        float f18 = cVar.J;
                        int i12 = cVar.K;
                        textPaint.setShadowLayer(f16, f17, f18, ColorUtils.setAlphaComponent(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.f5661d0;
                    float f19 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f19, textPaint);
                    if (i10 >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String trim = cVar.f5661d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), 0.0f, f19, (Paint) textPaint);
                } else {
                    canvas2.translate(f8, f10);
                    cVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.M != null && (kVar = this.L) != null) {
            kVar.draw(canvas2);
            if (this.f1448f.isFocused()) {
                Rect bounds = this.M.getBounds();
                Rect bounds2 = this.L.getBounds();
                float f20 = cVar.f5658b;
                int centerX = bounds2.centerX();
                bounds.left = b3.a.c(f20, centerX, bounds2.left);
                bounds.right = b3.a.c(f20, centerX, bounds2.right);
                this.M.draw(canvas2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.B0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.B0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            s3.c r3 = r4.f1482x0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.f5673k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f5671j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f1448f
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.B0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (this.E) {
            int i10 = this.Q;
            c cVar = this.f1482x0;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (getHintMaxLines() == 1) {
                        return (int) (cVar.f() / 2.0f);
                    }
                    float f8 = cVar.f();
                    TextPaint textPaint = cVar.P;
                    textPaint.setTextSize(cVar.f5669i);
                    textPaint.setTypeface(cVar.f5681s);
                    textPaint.setLetterSpacing(cVar.W);
                    return Math.max(0, (int) (f8 - ((-textPaint.ascent()) / 2.0f)));
                }
            } else {
                return (int) cVar.f();
            }
        }
        return 0;
    }

    public final Fade f() {
        Fade fade = new Fade();
        fade.setDuration(d.q(getContext(), com.example.navistart.R.attr.motionDurationShort2, 87));
        fade.setInterpolator(d.r(getContext(), com.example.navistart.R.attr.motionEasingLinearInterpolator, b3.a.f340a));
        return fade;
    }

    public final boolean g() {
        if (this.E && !TextUtils.isEmpty(this.F) && (this.H instanceof e4.g)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f1448f;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    @NonNull
    public k getBoxBackground() {
        int i10 = this.Q;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.H;
    }

    public int getBoxBackgroundColor() {
        return this.W;
    }

    public int getBoxBackgroundMode() {
        return this.Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.N;
        RectF rectF = this.f1445c0;
        if (layoutDirection == 1) {
            return oVar.f6798h.a(rectF);
        }
        return oVar.f6797g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.N;
        RectF rectF = this.f1445c0;
        if (layoutDirection == 1) {
            return oVar.f6797g.a(rectF);
        }
        return oVar.f6798h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.N;
        RectF rectF = this.f1445c0;
        if (layoutDirection == 1) {
            return oVar.e.a(rectF);
        }
        return oVar.f6796f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        o oVar = this.N;
        RectF rectF = this.f1445c0;
        if (layoutDirection == 1) {
            return oVar.f6796f.a(rectF);
        }
        return oVar.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1467o0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1469p0;
    }

    public int getBoxStrokeWidth() {
        return this.T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.f1464n;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f1462m && this.f1466o && (appCompatTextView = this.f1470q) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.A;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.C;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.D;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f1459k0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f1448f;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.d.f2154h.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.d.f2154h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.d.f2160n;
    }

    public int getEndIconMode() {
        return this.d.f2156j;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.d.f2161o;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.d.f2154h;
    }

    @Nullable
    public CharSequence getError() {
        t tVar = this.f1460l;
        if (tVar.f2185q) {
            return tVar.f2184p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1460l.t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f1460l.f2186s;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f1460l.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.d.d.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        t tVar = this.f1460l;
        if (tVar.f2189x) {
            return tVar.w;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f1460l.f2190y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.E) {
            return this.F;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f1482x0.f();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.f1482x0;
        return cVar.g(cVar.f5673k);
    }

    public int getHintMaxLines() {
        return this.f1482x0.f5662e0;
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f1461l0;
    }

    @NonNull
    public b0 getLengthCounter() {
        return this.f1468p;
    }

    public int getMaxEms() {
        return this.f1454i;
    }

    @Px
    public int getMaxWidth() {
        return this.f1458k;
    }

    public int getMinEms() {
        return this.f1452h;
    }

    @Px
    public int getMinWidth() {
        return this.f1456j;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.d.f2154h.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.d.f2154h.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f1476u) {
            return this.t;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f1481x;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.w;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.c.d;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.c.c.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.c.c;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.N;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.c.e.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.c.e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.c.f2204h;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.c.f2205i;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.d.f2163q;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.d.r.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.d.r;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f1446d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [z3.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.a, java.lang.Object] */
    public final k h(boolean z9) {
        float f8;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i10;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_shape_corner_size_small_component);
        if (z9) {
            f8 = dimensionPixelOffset2;
        } else {
            f8 = 0.0f;
        }
        EditText editText = this.f1448f;
        if (editText instanceof w) {
            dimensionPixelOffset = ((w) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.example.navistart.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        int i11 = 0;
        f fVar = new f(i11);
        f fVar2 = new f(i11);
        f fVar3 = new f(i11);
        f fVar4 = new f(i11);
        z3.a aVar = new z3.a(f8);
        z3.a aVar2 = new z3.a(f8);
        z3.a aVar3 = new z3.a(dimensionPixelOffset2);
        z3.a aVar4 = new z3.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f6794a = obj;
        obj5.f6795b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.e = aVar;
        obj5.f6796f = aVar2;
        obj5.f6797g = aVar4;
        obj5.f6798h = aVar3;
        obj5.f6799i = fVar;
        obj5.f6800j = fVar2;
        obj5.f6801k = fVar3;
        obj5.f6802l = fVar4;
        EditText editText2 = this.f1448f;
        if (editText2 instanceof w) {
            colorStateList = ((w) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = k.G;
            TypedValue c = b.c(context, k.class.getSimpleName(), com.example.navistart.R.attr.colorSurface);
            int i12 = c.resourceId;
            if (i12 != 0) {
                i10 = ContextCompat.getColor(context, i12);
            } else {
                i10 = c.data;
            }
            colorStateList = ColorStateList.valueOf(i10);
        }
        k kVar = new k();
        kVar.m(context);
        kVar.q(colorStateList);
        kVar.p(dimensionPixelOffset);
        kVar.setShapeAppearanceModel(obj5);
        h hVar = kVar.c;
        if (hVar.f6753h == null) {
            hVar.f6753h = new Rect();
        }
        kVar.c.f6753h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        kVar.invalidateSelf();
        return kVar;
    }

    public final int i(int i10, boolean z9) {
        int compoundPaddingLeft;
        if (!z9 && getPrefixText() != null) {
            compoundPaddingLeft = this.c.a();
        } else if (z9 && getSuffixText() != null) {
            compoundPaddingLeft = this.d.c();
        } else {
            compoundPaddingLeft = this.f1448f.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i10;
    }

    public final int j(int i10, boolean z9) {
        int compoundPaddingRight;
        if (!z9 && getSuffixText() != null) {
            compoundPaddingRight = this.d.c();
        } else if (z9 && getPrefixText() != null) {
            compoundPaddingRight = this.c.a();
        } else {
            compoundPaddingRight = this.f1448f.getCompoundPaddingRight();
        }
        return i10 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [e4.g, z3.k] */
    public final void k() {
        int i10 = this.Q;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.E && !(this.H instanceof e4.g)) {
                        o oVar = this.N;
                        int i11 = e4.g.J;
                        if (oVar == null) {
                            oVar = new o();
                        }
                        e4.f fVar = new e4.f(oVar, new RectF());
                        ?? kVar = new k(fVar);
                        kVar.I = fVar;
                        this.H = kVar;
                    } else {
                        this.H = new k(this.N);
                    }
                    this.L = null;
                    this.M = null;
                } else {
                    i.k(ai.onnxruntime.a.o(new StringBuilder(), " is illegal; only @BoxBackgroundMode constants are supported.", this.Q));
                    return;
                }
            } else {
                this.H = new k(this.N);
                this.L = new k();
                this.M = new k();
            }
        } else {
            this.H = null;
            this.L = null;
            this.M = null;
        }
        u();
        z();
        if (this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.R = getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (w3.c.d(getContext())) {
                this.R = getResources().getDimensionPixelSize(com.example.navistart.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.Q != 0) {
            v();
        }
        EditText editText = this.f1448f;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.Q;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(AppCompatTextView appCompatTextView, int i10) {
        try {
            TextViewCompat.setTextAppearance(appCompatTextView, i10);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(appCompatTextView, androidx.appcompat.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), com.example.navistart.R.color.design_error));
    }

    public final boolean o() {
        t tVar = this.f1460l;
        if (tVar.f2183o == 1 && tVar.r != null && !TextUtils.isEmpty(tVar.f2184p)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1482x0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.d;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z9 = false;
        this.D0 = false;
        if (this.f1448f != null && this.f1448f.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.c.getMeasuredHeight()))) {
            this.f1448f.setMinimumHeight(max);
            z9 = true;
        }
        boolean s5 = s();
        if (!z9 && !s5) {
            return;
        }
        this.f1448f.post(new a4.g(27, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        float descent;
        int i14;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z9, i10, i11, i12, i13);
        EditText editText = this.f1448f;
        if (editText != null) {
            Rect rect = this.f1442a0;
            s3.d.a(this, editText, rect);
            k kVar = this.L;
            if (kVar != null) {
                int i15 = rect.bottom;
                kVar.setBounds(rect.left, i15 - this.T, rect.right, i15);
            }
            k kVar2 = this.M;
            if (kVar2 != null) {
                int i16 = rect.bottom;
                kVar2.setBounds(rect.left, i16 - this.U, rect.right, i16);
            }
            if (this.E) {
                float textSize = this.f1448f.getTextSize();
                c cVar = this.f1482x0;
                float f8 = cVar.f5667h;
                TextPaint textPaint = cVar.P;
                if (f8 != textSize) {
                    cVar.f5667h = textSize;
                    cVar.j(false);
                }
                int gravity = this.f1448f.getGravity();
                int i17 = (gravity & (-113)) | 48;
                if (cVar.f5665g != i17) {
                    cVar.f5665g = i17;
                    cVar.j(false);
                }
                if (cVar.f5663f != gravity) {
                    cVar.f5663f = gravity;
                    cVar.j(false);
                }
                Rect d = d(rect);
                int i18 = d.left;
                int i19 = d.top;
                int i20 = d.right;
                int i21 = d.bottom;
                Rect rect2 = cVar.d;
                if (rect2.left != i18 || rect2.top != i19 || rect2.right != i20 || rect2.bottom != i21) {
                    rect2.set(i18, i19, i20, i21);
                    cVar.N = true;
                }
                if (this.f1448f != null) {
                    if (getHintMaxLines() == 1) {
                        textPaint.setTextSize(cVar.f5667h);
                        textPaint.setTypeface(cVar.f5683v);
                        textPaint.setLetterSpacing(cVar.X);
                        descent = -textPaint.ascent();
                    } else {
                        textPaint.setTextSize(cVar.f5667h);
                        textPaint.setTypeface(cVar.f5683v);
                        textPaint.setLetterSpacing(cVar.X);
                        descent = cVar.f5675l * (textPaint.descent() + (-textPaint.ascent()));
                    }
                    int compoundPaddingLeft = this.f1448f.getCompoundPaddingLeft() + rect.left;
                    Rect rect3 = this.f1444b0;
                    rect3.left = compoundPaddingLeft;
                    if (this.Q == 1 && this.f1448f.getMinLines() <= 1) {
                        compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                    } else {
                        if (this.Q == 0 && getHintMaxLines() != 1) {
                            textPaint.setTextSize(cVar.f5667h);
                            textPaint.setTypeface(cVar.f5683v);
                            textPaint.setLetterSpacing(cVar.X);
                            i14 = (int) ((-textPaint.ascent()) / 2.0f);
                        } else {
                            i14 = 0;
                        }
                        compoundPaddingTop = (this.f1448f.getCompoundPaddingTop() + rect.top) - i14;
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.f1448f.getCompoundPaddingRight();
                    if (this.Q == 1 && this.f1448f.getMinLines() <= 1) {
                        compoundPaddingBottom = (int) (rect3.top + descent);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.f1448f.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    int i22 = rect3.left;
                    int i23 = rect3.top;
                    int i24 = rect3.right;
                    Rect rect4 = cVar.c;
                    if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom || true != cVar.f5674k0) {
                        rect4.set(i22, i23, i24, compoundPaddingBottom);
                        cVar.N = true;
                        cVar.f5674k0 = true;
                    }
                    cVar.j(false);
                    if (g() && !this.f1480w0) {
                        l();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f8;
        boolean z9;
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.D0;
        p pVar = this.d;
        if (!z10) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.D0 = true;
        }
        if (this.f1478v != null && (editText = this.f1448f) != null) {
            this.f1478v.setGravity(editText.getGravity());
            this.f1478v.setPadding(this.f1448f.getCompoundPaddingLeft(), this.f1448f.getCompoundPaddingTop(), this.f1448f.getCompoundPaddingRight(), this.f1448f.getCompoundPaddingBottom());
        }
        pVar.m();
        if (getHintMaxLines() != 1) {
            int measuredWidth = (this.f1448f.getMeasuredWidth() - this.f1448f.getCompoundPaddingLeft()) - this.f1448f.getCompoundPaddingRight();
            c cVar = this.f1482x0;
            TextPaint textPaint = cVar.P;
            textPaint.setTextSize(cVar.f5669i);
            textPaint.setTypeface(cVar.f5681s);
            textPaint.setLetterSpacing(cVar.W);
            float f10 = measuredWidth;
            cVar.f5670i0 = cVar.e(cVar.f5664f0, textPaint, cVar.B, (cVar.f5669i / cVar.f5667h) * f10, cVar.D).getHeight();
            textPaint.setTextSize(cVar.f5667h);
            textPaint.setTypeface(cVar.f5683v);
            textPaint.setLetterSpacing(cVar.X);
            cVar.f5672j0 = cVar.e(cVar.f5662e0, textPaint, cVar.B, f10, cVar.D).getHeight();
            EditText editText2 = this.f1448f;
            Rect rect = this.f1442a0;
            s3.d.a(this, editText2, rect);
            Rect d = d(rect);
            int i12 = d.left;
            int i13 = d.top;
            int i14 = d.right;
            int i15 = d.bottom;
            Rect rect2 = cVar.d;
            if (rect2.left != i12 || rect2.top != i13 || rect2.right != i14 || rect2.bottom != i15) {
                rect2.set(i12, i13, i14, i15);
                cVar.N = true;
            }
            v();
            a();
            if (this.f1448f != null) {
                int i16 = cVar.f5672j0;
                if (i16 != -1) {
                    f8 = i16;
                } else {
                    TextPaint textPaint2 = cVar.P;
                    textPaint2.setTextSize(cVar.f5667h);
                    textPaint2.setTypeface(cVar.f5683v);
                    textPaint2.setLetterSpacing(cVar.X);
                    f8 = -textPaint2.ascent();
                }
                float f11 = 0.0f;
                if (this.t != null) {
                    TextPaint textPaint3 = new TextPaint(129);
                    textPaint3.set(this.f1478v.getPaint());
                    textPaint3.setTextSize(this.f1478v.getTextSize());
                    textPaint3.setTypeface(this.f1478v.getTypeface());
                    textPaint3.setLetterSpacing(this.f1478v.getLetterSpacing());
                    s3.h hVar = new s3.h(this.t, textPaint3, measuredWidth);
                    if (getLayoutDirection() == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hVar.f5699k = z9;
                    hVar.f5698j = true;
                    float lineSpacingExtra = this.f1478v.getLineSpacingExtra();
                    float lineSpacingMultiplier = this.f1478v.getLineSpacingMultiplier();
                    hVar.f5695g = lineSpacingExtra;
                    hVar.f5696h = lineSpacingMultiplier;
                    hVar.f5701m = new androidx.fragment.app.h(8, this);
                    StaticLayout a10 = hVar.a();
                    if (this.Q == 1) {
                        f11 = cVar.f() + this.R + this.e;
                    }
                    f11 += a10.getHeight();
                }
                float max = Math.max(f8, f11);
                if (this.f1448f.getMeasuredHeight() < max) {
                    this.f1448f.setMinimumHeight(Math.round(max));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c0 c0Var = (c0) parcelable;
        super.onRestoreInstanceState(c0Var.getSuperState());
        setError(c0Var.f2121b);
        if (c0Var.c) {
            post(new m(3, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [z3.o, java.lang.Object] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        if (z9 != this.O) {
            z3.d dVar = this.N.e;
            RectF rectF = this.f1445c0;
            float a10 = dVar.a(rectF);
            float a11 = this.N.f6796f.a(rectF);
            float a12 = this.N.f6798h.a(rectF);
            float a13 = this.N.f6797g.a(rectF);
            o oVar = this.N;
            a.a aVar = oVar.f6794a;
            a.a aVar2 = oVar.f6795b;
            a.a aVar3 = oVar.d;
            a.a aVar4 = oVar.c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            z3.a aVar5 = new z3.a(a11);
            z3.a aVar6 = new z3.a(a10);
            z3.a aVar7 = new z3.a(a13);
            z3.a aVar8 = new z3.a(a12);
            ?? obj = new Object();
            obj.f6794a = aVar2;
            obj.f6795b = aVar;
            obj.c = aVar3;
            obj.d = aVar4;
            obj.e = aVar5;
            obj.f6796f = aVar6;
            obj.f6797g = aVar8;
            obj.f6798h = aVar7;
            obj.f6799i = fVar;
            obj.f6800j = fVar2;
            obj.f6801k = fVar3;
            obj.f6802l = fVar4;
            this.O = z9;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, e4.c0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        if (o()) {
            absSavedState.f2121b = getError();
        }
        p pVar = this.d;
        if (pVar.f2156j != 0 && pVar.f2154h.f1374b) {
            z9 = true;
        } else {
            z9 = false;
        }
        absSavedState.c = z9;
        return absSavedState;
    }

    public final void p(Editable editable) {
        int i10;
        boolean z9;
        int i11;
        ((g) this.f1468p).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z10 = this.f1466o;
        int i12 = this.f1464n;
        if (i12 == -1) {
            this.f1470q.setText(String.valueOf(i10));
            this.f1470q.setContentDescription(null);
            this.f1466o = false;
        } else {
            if (i10 > i12) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f1466o = z9;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f1470q;
            int i13 = this.f1464n;
            if (this.f1466o) {
                i11 = com.example.navistart.R.string.character_counter_overflowed_content_description;
            } else {
                i11 = com.example.navistart.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z10 != this.f1466o) {
                q();
            }
            this.f1470q.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(com.example.navistart.R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f1464n))));
        }
        if (this.f1448f != null && z10 != this.f1466o) {
            w(false, false);
            z();
            t();
        }
    }

    public final void q() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f1470q;
        if (appCompatTextView != null) {
            if (this.f1466o) {
                i10 = this.r;
            } else {
                i10 = this.f1473s;
            }
            n(appCompatTextView, i10);
            if (!this.f1466o && (colorStateList2 = this.A) != null) {
                this.f1470q.setTextColor(colorStateList2);
            }
            if (this.f1466o && (colorStateList = this.B) != null) {
                this.f1470q.setTextColor(colorStateList);
            }
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.C;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue a10 = b.a(androidx.appcompat.R.attr.colorControlActivated, context);
            if (a10 != null) {
                int i10 = a10.resourceId;
                if (i10 != 0) {
                    colorStateList2 = ContextCompat.getColorStateList(context, i10);
                } else {
                    int i11 = a10.data;
                    if (i11 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i11);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f1448f;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f1448f.getTextCursorDrawable();
                Drawable mutate = DrawableCompat.wrap(textCursorDrawable2).mutate();
                if ((o() || (this.f1470q != null && this.f1466o)) && (colorStateList = this.D) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(@ColorInt int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.f1471q0 = i10;
            this.f1474s0 = i10;
            this.f1475t0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i10) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1471q0 = defaultColor;
        this.W = defaultColor;
        this.f1472r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1474s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1475t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.Q) {
            this.Q = i10;
            if (this.f1448f != null) {
                k();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.R = i10;
    }

    public void setBoxCornerFamily(int i10) {
        n g10 = this.N.g();
        z3.d dVar = this.N.e;
        g10.f6784a = u.e(i10);
        g10.e = dVar;
        z3.d dVar2 = this.N.f6796f;
        g10.f6785b = u.e(i10);
        g10.f6786f = dVar2;
        z3.d dVar3 = this.N.f6798h;
        g10.d = u.e(i10);
        g10.f6788h = dVar3;
        z3.d dVar4 = this.N.f6797g;
        g10.c = u.e(i10);
        g10.f6787g = dVar4;
        this.N = g10.a();
        c();
    }

    public void setBoxStrokeColor(@ColorInt int i10) {
        if (this.f1467o0 != i10) {
            this.f1467o0 = i10;
            z();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1463m0 = colorStateList.getDefaultColor();
            this.f1477u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1465n0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1467o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1467o0 != colorStateList.getDefaultColor()) {
            this.f1467o0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f1469p0 != colorStateList) {
            this.f1469p0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.T = i10;
        z();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.U = i10;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.f1462m != z9) {
            Editable editable = null;
            t tVar = this.f1460l;
            if (z9) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f1470q = appCompatTextView;
                appCompatTextView.setId(com.example.navistart.R.id.textinput_counter);
                Typeface typeface = this.f1446d0;
                if (typeface != null) {
                    this.f1470q.setTypeface(typeface);
                }
                this.f1470q.setMaxLines(1);
                tVar.a(this.f1470q, 2);
                ((ViewGroup.MarginLayoutParams) this.f1470q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.example.navistart.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f1470q != null) {
                    EditText editText = this.f1448f;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    p(editable);
                }
            } else {
                tVar.g(this.f1470q, 2);
                this.f1470q = null;
            }
            this.f1462m = z9;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.f1464n != i10) {
            if (i10 > 0) {
                this.f1464n = i10;
            } else {
                this.f1464n = -1;
            }
            if (this.f1462m && this.f1470q != null) {
                EditText editText = this.f1448f;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                p(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.r != i10) {
            this.r = i10;
            q();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f1473s != i10) {
            this.f1473s = i10;
            q();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            r();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (!o() && (this.f1470q == null || !this.f1466o)) {
                return;
            }
            r();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f1459k0 = colorStateList;
        this.f1461l0 = colorStateList;
        if (this.f1448f != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        m(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.d.f2154h.setActivated(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.d.f2154h.setCheckable(z9);
    }

    public void setEndIconContentDescription(@StringRes int i10) {
        CharSequence charSequence;
        p pVar = this.d;
        if (i10 != 0) {
            charSequence = pVar.getResources().getText(i10);
        } else {
            charSequence = null;
        }
        CheckableImageButton checkableImageButton = pVar.f2154h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i10) {
        Drawable drawable;
        p pVar = this.d;
        if (i10 != 0) {
            drawable = AppCompatResources.getDrawable(pVar.getContext(), i10);
        } else {
            drawable = null;
        }
        TextInputLayout textInputLayout = pVar.f2151b;
        CheckableImageButton checkableImageButton = pVar.f2154h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            y5.k.b(textInputLayout, checkableImageButton, pVar.f2158l, pVar.f2159m);
            y5.k.o(textInputLayout, checkableImageButton, pVar.f2158l);
        }
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i10) {
        p pVar = this.d;
        if (i10 >= 0) {
            if (i10 != pVar.f2160n) {
                pVar.f2160n = i10;
                CheckableImageButton checkableImageButton = pVar.f2154h;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = pVar.d;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        pVar.getClass();
        i.k("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.d.g(i10);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        p pVar = this.d;
        CheckableImageButton checkableImageButton = pVar.f2154h;
        View.OnLongClickListener onLongClickListener = pVar.f2162p;
        checkableImageButton.setOnClickListener(onClickListener);
        y5.k.s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        p pVar = this.d;
        pVar.f2162p = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f2154h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y5.k.s(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        p pVar = this.d;
        pVar.f2161o = scaleType;
        pVar.f2154h.setScaleType(scaleType);
        pVar.d.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        p pVar = this.d;
        if (pVar.f2158l != colorStateList) {
            pVar.f2158l = colorStateList;
            y5.k.b(pVar.f2151b, pVar.f2154h, colorStateList, pVar.f2159m);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        p pVar = this.d;
        if (pVar.f2159m != mode) {
            pVar.f2159m = mode;
            y5.k.b(pVar.f2151b, pVar.f2154h, pVar.f2158l, mode);
        }
    }

    public void setEndIconVisible(boolean z9) {
        this.d.h(z9);
    }

    public void setError(@Nullable CharSequence charSequence) {
        t tVar = this.f1460l;
        if (!tVar.f2185q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            tVar.c();
            tVar.f2184p = charSequence;
            tVar.r.setText(charSequence);
            int i10 = tVar.f2182n;
            if (i10 != 1) {
                tVar.f2183o = 1;
            }
            tVar.i(i10, tVar.f2183o, tVar.h(tVar.r, charSequence));
            return;
        }
        tVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        t tVar = this.f1460l;
        tVar.t = i10;
        AppCompatTextView appCompatTextView = tVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        t tVar = this.f1460l;
        tVar.f2186s = charSequence;
        AppCompatTextView appCompatTextView = tVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z9) {
        t tVar = this.f1460l;
        TextInputLayout textInputLayout = tVar.f2176h;
        if (tVar.f2185q == z9) {
            return;
        }
        tVar.c();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(tVar.f2175g);
            tVar.r = appCompatTextView;
            appCompatTextView.setId(com.example.navistart.R.id.textinput_error);
            tVar.r.setTextAlignment(5);
            Typeface typeface = tVar.B;
            if (typeface != null) {
                tVar.r.setTypeface(typeface);
            }
            int i10 = tVar.f2187u;
            tVar.f2187u = i10;
            AppCompatTextView appCompatTextView2 = tVar.r;
            if (appCompatTextView2 != null) {
                tVar.f2176h.n(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = tVar.f2188v;
            tVar.f2188v = colorStateList;
            AppCompatTextView appCompatTextView3 = tVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f2186s;
            tVar.f2186s = charSequence;
            AppCompatTextView appCompatTextView4 = tVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i11 = tVar.t;
            tVar.t = i11;
            AppCompatTextView appCompatTextView5 = tVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i11);
            }
            tVar.r.setVisibility(4);
            tVar.a(tVar.r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.r, 0);
            tVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        tVar.f2185q = z9;
    }

    public void setErrorIconDrawable(@DrawableRes int i10) {
        Drawable drawable;
        p pVar = this.d;
        if (i10 != 0) {
            drawable = AppCompatResources.getDrawable(pVar.getContext(), i10);
        } else {
            drawable = null;
        }
        pVar.i(drawable);
        y5.k.o(pVar.f2151b, pVar.d, pVar.e);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        p pVar = this.d;
        CheckableImageButton checkableImageButton = pVar.d;
        View.OnLongClickListener onLongClickListener = pVar.f2153g;
        checkableImageButton.setOnClickListener(onClickListener);
        y5.k.s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        p pVar = this.d;
        pVar.f2153g = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y5.k.s(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        p pVar = this.d;
        if (pVar.e != colorStateList) {
            pVar.e = colorStateList;
            y5.k.b(pVar.f2151b, pVar.d, colorStateList, pVar.f2152f);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        p pVar = this.d;
        if (pVar.f2152f != mode) {
            pVar.f2152f = mode;
            y5.k.b(pVar.f2151b, pVar.d, pVar.e, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i10) {
        t tVar = this.f1460l;
        tVar.f2187u = i10;
        AppCompatTextView appCompatTextView = tVar.r;
        if (appCompatTextView != null) {
            tVar.f2176h.n(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        t tVar = this.f1460l;
        tVar.f2188v = colorStateList;
        AppCompatTextView appCompatTextView = tVar.r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.f1484y0 != z9) {
            this.f1484y0 = z9;
            w(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f1460l;
        if (isEmpty) {
            if (tVar.f2189x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f2189x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.w = charSequence;
        tVar.f2190y.setText(charSequence);
        int i10 = tVar.f2182n;
        if (i10 != 2) {
            tVar.f2183o = 2;
        }
        tVar.i(i10, tVar.f2183o, tVar.h(tVar.f2190y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        t tVar = this.f1460l;
        tVar.A = colorStateList;
        AppCompatTextView appCompatTextView = tVar.f2190y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z9) {
        t tVar = this.f1460l;
        TextInputLayout textInputLayout = tVar.f2176h;
        if (tVar.f2189x == z9) {
            return;
        }
        tVar.c();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(tVar.f2175g);
            tVar.f2190y = appCompatTextView;
            appCompatTextView.setId(com.example.navistart.R.id.textinput_helper_text);
            tVar.f2190y.setTextAlignment(5);
            Typeface typeface = tVar.B;
            if (typeface != null) {
                tVar.f2190y.setTypeface(typeface);
            }
            tVar.f2190y.setVisibility(4);
            tVar.f2190y.setAccessibilityLiveRegion(1);
            int i10 = tVar.f2191z;
            tVar.f2191z = i10;
            AppCompatTextView appCompatTextView2 = tVar.f2190y;
            if (appCompatTextView2 != null) {
                TextViewCompat.setTextAppearance(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = tVar.A;
            tVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = tVar.f2190y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            tVar.a(tVar.f2190y, 1);
            tVar.f2190y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i11 = tVar.f2182n;
            if (i11 == 2) {
                tVar.f2183o = 0;
            }
            tVar.i(i11, tVar.f2183o, tVar.h(tVar.f2190y, ""));
            tVar.g(tVar.f2190y, 1);
            tVar.f2190y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        tVar.f2189x = z9;
    }

    public void setHelperTextTextAppearance(@StyleRes int i10) {
        t tVar = this.f1460l;
        tVar.f2191z = i10;
        AppCompatTextView appCompatTextView = tVar.f2190y;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i10);
        }
    }

    public void setHint(@StringRes int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.f1486z0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.E) {
            this.E = z9;
            if (!z9) {
                this.G = false;
                if (!TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.f1448f.getHint())) {
                    this.f1448f.setHint(this.F);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1448f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.F)) {
                        setHint(hint);
                    }
                    this.f1448f.setHint((CharSequence) null);
                }
                this.G = true;
            }
            if (this.f1448f != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        c cVar = this.f1482x0;
        if (i10 != cVar.f5664f0) {
            cVar.f5664f0 = i10;
            cVar.j(false);
        }
        if (i10 != cVar.f5662e0) {
            cVar.f5662e0 = i10;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(@StyleRes int i10) {
        c cVar = this.f1482x0;
        TextInputLayout textInputLayout = cVar.f5656a;
        w3.f fVar = new w3.f(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = fVar.f6370k;
        if (colorStateList != null) {
            cVar.f5673k = colorStateList;
        }
        float f8 = fVar.f6371l;
        if (f8 != 0.0f) {
            cVar.f5669i = f8;
        }
        ColorStateList colorStateList2 = fVar.f6363a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = fVar.f6365f;
        cVar.U = fVar.f6366g;
        cVar.S = fVar.f6367h;
        cVar.W = fVar.f6369j;
        w3.a aVar = cVar.f5686z;
        if (aVar != null) {
            aVar.c = true;
        }
        n.p pVar = new n.p(10, cVar);
        fVar.a();
        cVar.f5686z = new w3.a(pVar, fVar.f6375p);
        fVar.b(textInputLayout.getContext(), cVar.f5686z);
        cVar.j(false);
        this.f1461l0 = cVar.f5673k;
        if (this.f1448f != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f1461l0 != colorStateList) {
            if (this.f1459k0 == null) {
                c cVar = this.f1482x0;
                if (cVar.f5673k != colorStateList) {
                    cVar.f5673k = colorStateList;
                    cVar.j(false);
                }
            }
            this.f1461l0 = colorStateList;
            if (this.f1448f != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull b0 b0Var) {
        this.f1468p = b0Var;
    }

    public void setMaxEms(int i10) {
        this.f1454i = i10;
        EditText editText = this.f1448f;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(@Px int i10) {
        this.f1458k = i10;
        EditText editText = this.f1448f;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(@DimenRes int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f1452h = i10;
        EditText editText = this.f1448f;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(@Px int i10) {
        this.f1456j = i10;
        EditText editText = this.f1448f;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(@DimenRes int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i10) {
        CharSequence charSequence;
        p pVar = this.d;
        if (i10 != 0) {
            charSequence = pVar.getResources().getText(i10);
        } else {
            charSequence = null;
        }
        pVar.f2154h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i10) {
        Drawable drawable;
        p pVar = this.d;
        if (i10 != 0) {
            drawable = AppCompatResources.getDrawable(pVar.getContext(), i10);
        } else {
            drawable = null;
        }
        pVar.f2154h.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        p pVar = this.d;
        if (z9 && pVar.f2156j != 1) {
            pVar.g(1);
        } else if (!z9) {
            pVar.g(0);
        } else {
            pVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        p pVar = this.d;
        pVar.f2158l = colorStateList;
        y5.k.b(pVar.f2151b, pVar.f2154h, colorStateList, pVar.f2159m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        p pVar = this.d;
        pVar.f2159m = mode;
        y5.k.b(pVar.f2151b, pVar.f2154h, pVar.f2158l, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        Editable text;
        if (this.f1478v == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f1478v = appCompatTextView;
            appCompatTextView.setId(com.example.navistart.R.id.textinput_placeholder);
            this.f1478v.setImportantForAccessibility(1);
            this.f1478v.setAccessibilityLiveRegion(1);
            Fade f8 = f();
            this.f1483y = f8;
            f8.setStartDelay(67L);
            this.f1485z = f();
            setPlaceholderTextAppearance(this.f1481x);
            setPlaceholderTextColor(this.w);
            ViewCompat.setAccessibilityDelegate(this.f1478v, new com.google.android.material.datepicker.g(3));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1476u) {
                setPlaceholderTextEnabled(true);
            }
            this.t = charSequence;
        }
        EditText editText = this.f1448f;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        x(text);
    }

    public void setPlaceholderTextAppearance(@StyleRes int i10) {
        this.f1481x = i10;
        AppCompatTextView appCompatTextView = this.f1478v;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i10);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            AppCompatTextView appCompatTextView = this.f1478v;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        y yVar = this.c;
        yVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        yVar.d = charSequence2;
        yVar.c.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(@StyleRes int i10) {
        TextViewCompat.setTextAppearance(this.c.c, i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.c.c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull o oVar) {
        k kVar = this.H;
        if (kVar != null && kVar.c.f6749a != oVar) {
            this.N = oVar;
            c();
        }
    }

    public void setStartIconCheckable(boolean z9) {
        this.c.e.setCheckable(z9);
    }

    public void setStartIconContentDescription(@StringRes int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(@DrawableRes int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i10) {
        y yVar = this.c;
        if (i10 >= 0) {
            if (i10 != yVar.f2204h) {
                yVar.f2204h = i10;
                CheckableImageButton checkableImageButton = yVar.e;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        yVar.getClass();
        i.k("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        y yVar = this.c;
        CheckableImageButton checkableImageButton = yVar.e;
        View.OnLongClickListener onLongClickListener = yVar.f2206j;
        checkableImageButton.setOnClickListener(onClickListener);
        y5.k.s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        y yVar = this.c;
        yVar.f2206j = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        y5.k.s(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        y yVar = this.c;
        yVar.f2205i = scaleType;
        yVar.e.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        y yVar = this.c;
        if (yVar.f2202f != colorStateList) {
            yVar.f2202f = colorStateList;
            y5.k.b(yVar.f2201b, yVar.e, colorStateList, yVar.f2203g);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        y yVar = this.c;
        if (yVar.f2203g != mode) {
            yVar.f2203g = mode;
            y5.k.b(yVar.f2201b, yVar.e, yVar.f2202f, mode);
        }
    }

    public void setStartIconVisible(boolean z9) {
        this.c.c(z9);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        p pVar = this.d;
        pVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        pVar.f2163q = charSequence2;
        pVar.r.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(@StyleRes int i10) {
        TextViewCompat.setTextAppearance(this.d.r, i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.d.r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable a0 a0Var) {
        EditText editText = this.f1448f;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, a0Var);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f1446d0) {
            this.f1446d0 = typeface;
            this.f1482x0.n(typeface);
            t tVar = this.f1460l;
            if (typeface != tVar.B) {
                tVar.B = typeface;
                AppCompatTextView appCompatTextView = tVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = tVar.f2190y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f1470q;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f1448f;
        if (editText != null && this.Q == 0 && (background = editText.getBackground()) != null) {
            if (DrawableUtils.canSafelyMutateDrawable(background)) {
                background = background.mutate();
            }
            if (o()) {
                background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f1466o && (appCompatTextView = this.f1470q) != null) {
                background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                DrawableCompat.clearColorFilter(background);
                this.f1448f.refreshDrawableState();
            }
        }
    }

    public final void u() {
        EditText editText = this.f1448f;
        if (editText != null && this.H != null) {
            if ((this.K || editText.getBackground() == null) && this.Q != 0) {
                this.f1448f.setBackground(getEditTextBoxBackground());
                this.K = true;
            }
        }
    }

    public final void v() {
        if (this.Q != 1) {
            FrameLayout frameLayout = this.f1443b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f1448f;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        EditText editText2 = this.f1448f;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ColorStateList colorStateList3 = this.f1459k0;
        c cVar = this.f1482x0;
        if (colorStateList3 != null) {
            cVar.k(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f1459k0;
            int i10 = this.f1477u0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, i10);
            }
            cVar.k(ColorStateList.valueOf(i10));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.f1460l.r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar.k(colorStateList2);
        } else if (this.f1466o && (appCompatTextView = this.f1470q) != null) {
            cVar.k(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f1461l0) != null && cVar.f5673k != colorStateList) {
            cVar.f5673k = colorStateList;
            cVar.j(false);
        }
        p pVar = this.d;
        y yVar = this.c;
        if (!z11 && this.f1484y0 && (!isEnabled() || !z12)) {
            if (z10 || !this.f1480w0) {
                ValueAnimator valueAnimator = this.A0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A0.cancel();
                }
                if (z9 && this.f1486z0) {
                    b(0.0f);
                } else {
                    cVar.m(0.0f);
                }
                if (g() && !((e4.g) this.H).I.r.isEmpty() && g()) {
                    ((e4.g) this.H).y(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f1480w0 = true;
                AppCompatTextView appCompatTextView3 = this.f1478v;
                if (appCompatTextView3 != null && this.f1476u) {
                    appCompatTextView3.setText((CharSequence) null);
                    TransitionManager.beginDelayedTransition(this.f1443b, this.f1485z);
                    this.f1478v.setVisibility(4);
                }
                yVar.f2207k = true;
                yVar.e();
                pVar.f2164s = true;
                pVar.n();
                return;
            }
            return;
        }
        if (!z10 && !this.f1480w0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.A0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.A0.cancel();
        }
        if (z9 && this.f1486z0) {
            b(1.0f);
        } else {
            cVar.m(1.0f);
        }
        this.f1480w0 = false;
        if (g()) {
            l();
        }
        EditText editText3 = this.f1448f;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        x(editable);
        yVar.f2207k = false;
        yVar.e();
        pVar.f2164s = false;
        pVar.n();
    }

    public final void x(Editable editable) {
        int i10;
        ((g) this.f1468p).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        FrameLayout frameLayout = this.f1443b;
        if (i10 == 0 && !this.f1480w0) {
            if (this.f1478v != null && this.f1476u && !TextUtils.isEmpty(this.t)) {
                this.f1478v.setText(this.t);
                TransitionManager.beginDelayedTransition(frameLayout, this.f1483y);
                this.f1478v.setVisibility(0);
                this.f1478v.bringToFront();
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f1478v;
        if (appCompatTextView != null && this.f1476u) {
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(frameLayout, this.f1485z);
            this.f1478v.setVisibility(4);
        }
    }

    public final void y(boolean z9, boolean z10) {
        int defaultColor = this.f1469p0.getDefaultColor();
        int colorForState = this.f1469p0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1469p0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z9) {
            this.V = colorForState2;
        } else if (z10) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    public final void z() {
        boolean z9;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.H != null && this.Q != 0) {
            boolean z10 = false;
            if (!isFocused() && ((editText2 = this.f1448f) == null || !editText2.hasFocus())) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (isHovered() || ((editText = this.f1448f) != null && editText.isHovered())) {
                z10 = true;
            }
            if (!isEnabled()) {
                this.V = this.f1477u0;
            } else if (o()) {
                if (this.f1469p0 != null) {
                    y(z9, z10);
                } else {
                    this.V = getErrorCurrentTextColors();
                }
            } else if (this.f1466o && (appCompatTextView = this.f1470q) != null) {
                if (this.f1469p0 != null) {
                    y(z9, z10);
                } else {
                    this.V = appCompatTextView.getCurrentTextColor();
                }
            } else if (z9) {
                this.V = this.f1467o0;
            } else if (z10) {
                this.V = this.f1465n0;
            } else {
                this.V = this.f1463m0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                r();
            }
            p pVar = this.d;
            TextInputLayout textInputLayout = pVar.f2151b;
            CheckableImageButton checkableImageButton = pVar.f2154h;
            TextInputLayout textInputLayout2 = pVar.f2151b;
            pVar.l();
            y5.k.o(textInputLayout2, pVar.d, pVar.e);
            y5.k.o(textInputLayout2, checkableImageButton, pVar.f2158l);
            if (pVar.b() instanceof e4.l) {
                if (textInputLayout.o() && checkableImageButton.getDrawable() != null) {
                    Drawable mutate = DrawableCompat.wrap(checkableImageButton.getDrawable()).mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton.setImageDrawable(mutate);
                } else {
                    y5.k.b(textInputLayout, checkableImageButton, pVar.f2158l, pVar.f2159m);
                }
            }
            y yVar = this.c;
            y5.k.o(yVar.f2201b, yVar.e, yVar.f2202f);
            if (this.Q == 2) {
                int i10 = this.S;
                if (z9 && isEnabled()) {
                    this.S = this.U;
                } else {
                    this.S = this.T;
                }
                if (this.S != i10 && g() && !this.f1480w0) {
                    if (g()) {
                        ((e4.g) this.H).y(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    l();
                }
            }
            if (this.Q == 1) {
                if (!isEnabled()) {
                    this.W = this.f1472r0;
                } else if (z10 && !z9) {
                    this.W = this.f1475t0;
                } else if (z9) {
                    this.W = this.f1474s0;
                } else {
                    this.W = this.f1471q0;
                }
            }
            c();
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.c.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.d.f2154h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.d.f2154h.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.d.f2154h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.d.i(drawable);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        p pVar = this.d;
        TextInputLayout textInputLayout = pVar.f2151b;
        CheckableImageButton checkableImageButton = pVar.f2154h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            y5.k.b(textInputLayout, checkableImageButton, pVar.f2158l, pVar.f2159m);
            y5.k.o(textInputLayout, checkableImageButton, pVar.f2158l);
        }
    }
}
