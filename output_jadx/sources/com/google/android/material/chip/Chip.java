package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.navigation.b;
import b1.u;
import e0.s0;
import java.lang.ref.WeakReference;
import l3.a;
import l3.c;
import l3.d;
import l3.e;
import s3.j;
import s3.l;
import w3.f;
import z3.o;
import z3.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements d, z, Checkable {
    public static final Rect t = new Rect();

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f1277u = {R.attr.state_selected};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f1278v = {R.attr.state_checkable};

    /* renamed from: b, reason: collision with root package name */
    public e f1279b;
    public InsetDrawable c;
    public RippleDrawable d;
    public View.OnClickListener e;

    /* renamed from: f, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f1280f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1281g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1282h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1283i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1284j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1285k;

    /* renamed from: l, reason: collision with root package name */
    public int f1286l;

    /* renamed from: m, reason: collision with root package name */
    public int f1287m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f1288n;

    /* renamed from: o, reason: collision with root package name */
    public final c f1289o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1290p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1291q;
    public final RectF r;

    /* renamed from: s, reason: collision with root package name */
    public final a f1292s;

    public Chip(Context context, AttributeSet attributeSet) {
        super(g4.a.a(context, attributeSet, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.example.navistart.R.attr.chipStyle);
        f fVar;
        float dimension;
        int resourceId;
        this.f1291q = new Rect();
        this.r = new RectF();
        this.f1292s = new a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                b.g("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            b.g("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        b.g("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    b.g("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                b.g("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f3510p0;
        int[] iArr = a3.a.f9f;
        TypedArray d = l.d(context3, attributeSet, iArr, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.P0 = d.hasValue(37);
        Context context4 = eVar.f3510p0;
        ColorStateList a10 = w3.c.a(context4, d, 24);
        if (eVar.I != a10) {
            eVar.I = a10;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList a11 = w3.c.a(context4, d, 11);
        if (eVar.J != a11) {
            eVar.J = a11;
            eVar.onStateChange(eVar.getState());
        }
        float dimension2 = d.getDimension(19, 0.0f);
        if (eVar.K != dimension2) {
            eVar.K = dimension2;
            eVar.invalidateSelf();
            eVar.F();
        }
        if (d.hasValue(12)) {
            eVar.L(d.getDimension(12, 0.0f));
        }
        eVar.Q(w3.c.a(context4, d, 22));
        eVar.R(d.getDimension(23, 0.0f));
        eVar.b0(w3.c.a(context4, d, 36));
        String text = d.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(eVar.P, text);
        j jVar = eVar.f3516v0;
        if (!equals) {
            eVar.P = text;
            jVar.e = true;
            eVar.invalidateSelf();
            eVar.F();
        }
        if (d.hasValue(0) && (resourceId = d.getResourceId(0, 0)) != 0) {
            fVar = new f(context4, resourceId);
        } else {
            fVar = null;
        }
        fVar.f6371l = d.getDimension(1, fVar.f6371l);
        jVar.b(fVar, context4);
        int i10 = d.getInt(3, 0);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    eVar.M0 = TextUtils.TruncateAt.END;
                }
            } else {
                eVar.M0 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            eVar.M0 = TextUtils.TruncateAt.START;
        }
        eVar.P(d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.P(d.getBoolean(15, false));
        }
        eVar.M(w3.c.c(context4, d, 14));
        if (d.hasValue(17)) {
            eVar.O(w3.c.a(context4, d, 17));
        }
        eVar.N(d.getDimension(16, -1.0f));
        eVar.Y(d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.Y(d.getBoolean(26, false));
        }
        eVar.S(w3.c.c(context4, d, 25));
        eVar.X(w3.c.a(context4, d, 30));
        eVar.U(d.getDimension(28, 0.0f));
        eVar.H(d.getBoolean(6, false));
        eVar.K(d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.K(d.getBoolean(8, false));
        }
        eVar.I(w3.c.c(context4, d, 7));
        if (d.hasValue(9)) {
            eVar.J(w3.c.a(context4, d, 9));
        }
        eVar.f3500f0 = b3.e.a(context4, d, 39);
        eVar.f3501g0 = b3.e.a(context4, d, 33);
        float dimension3 = d.getDimension(21, 0.0f);
        if (eVar.f3502h0 != dimension3) {
            eVar.f3502h0 = dimension3;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.a0(d.getDimension(35, 0.0f));
        eVar.Z(d.getDimension(34, 0.0f));
        float dimension4 = d.getDimension(41, 0.0f);
        if (eVar.f3505k0 != dimension4) {
            eVar.f3505k0 = dimension4;
            eVar.invalidateSelf();
            eVar.F();
        }
        float dimension5 = d.getDimension(40, 0.0f);
        if (eVar.f3506l0 != dimension5) {
            eVar.f3506l0 = dimension5;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.V(d.getDimension(29, 0.0f));
        eVar.T(d.getDimension(27, 0.0f));
        float dimension6 = d.getDimension(13, 0.0f);
        if (eVar.f3509o0 != dimension6) {
            eVar.f3509o0 = dimension6;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.O0 = d.getDimensionPixelSize(4, Integer.MAX_VALUE);
        d.recycle();
        l.a(context2, attributeSet, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action);
        l.b(context2, attributeSet, iArr, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action);
        this.f1285k = obtainStyledAttributes.getBoolean(32, false);
        TypedValue a12 = w3.b.a(com.example.navistart.R.attr.minTouchTargetSize, context2);
        if (a12 != null && a12.type == 5) {
            dimension = a12.getDimension(context2.getResources().getDisplayMetrics());
        } else {
            dimension = context2.getResources().getDimension(com.example.navistart.R.dimen.mtrl_min_touch_target_size);
        }
        this.f1287m = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) dimension));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.p(getElevation());
        l.a(context2, attributeSet, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action);
        l.b(context2, attributeSet, iArr, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f1289o = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new l3.b(this));
        }
        setChecked(this.f1281g);
        setText(eVar.P);
        setEllipsize(eVar.M0);
        h();
        if (!this.f1279b.N0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f1285k) {
            setMinHeight(this.f1287m);
        }
        this.f1286l = getLayoutDirection();
        super.setOnCheckedChangeListener(new s0(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.r;
        rectF.setEmpty();
        if (d() && this.e != null) {
            e eVar = this.f1279b;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.e0()) {
                float f8 = eVar.f3509o0 + eVar.f3508n0 + eVar.Z + eVar.f3507m0 + eVar.f3506l0;
                if (DrawableCompat.getLayoutDirection(eVar) == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f8;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f8;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f1291q;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    @Nullable
    private f getTextAppearance() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3516v0.f5705g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.f1283i != z9) {
            this.f1283i = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.f1282h != z9) {
            this.f1282h = z9;
            refreshDrawableState();
        }
    }

    public final void c(int i10) {
        int i11;
        this.f1287m = i10;
        int i12 = 0;
        if (!this.f1285k) {
            InsetDrawable insetDrawable = this.c;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.c = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
            f();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f1279b.K));
        int max2 = Math.max(0, i10 - this.f1279b.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.c;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.c = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
            f();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.c != null) {
            Rect rect = new Rect();
            this.c.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                f();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.c = new InsetDrawable((Drawable) this.f1279b, i11, i13, i11, i13);
        f();
    }

    public final boolean d() {
        Drawable drawable;
        e eVar = this.f1279b;
        if (eVar != null) {
            Drawable drawable2 = eVar.W;
            if (drawable2 != null) {
                drawable = DrawableCompat.unwrap(drawable2);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f1290p) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f1289o.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1290p) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f1289o;
        if (cVar.dispatchKeyEvent(keyEvent) && cVar.getKeyboardFocusedVirtualViewId() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1279b;
        boolean z9 = false;
        int i10 = 0;
        z9 = false;
        if (eVar != null && e.E(eVar.W)) {
            e eVar2 = this.f1279b;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.f1284j) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.f1283i) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f1282h) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.f1284j) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f1283i) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f1282h) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            z9 = eVar2.W(iArr);
        }
        if (z9) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (d() && (eVar = this.f1279b) != null && eVar.V && this.e != null) {
            ViewCompat.setAccessibilityDelegate(this, this.f1289o);
            this.f1290p = true;
        } else {
            ViewCompat.setAccessibilityDelegate(this, null);
            this.f1290p = false;
        }
    }

    public final void f() {
        this.d = new RippleDrawable(x3.a.b(this.f1279b.O), getBackgroundDrawable(), null);
        this.f1279b.getClass();
        setBackground(this.d);
        g();
    }

    public final void g() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f1279b) != null) {
            int B = (int) (eVar.B() + eVar.f3509o0 + eVar.f3506l0);
            e eVar2 = this.f1279b;
            int A = (int) (eVar2.A() + eVar2.f3502h0 + eVar2.f3505k0);
            if (this.c != null) {
                Rect rect = new Rect();
                this.c.getPadding(rect);
                A += rect.left;
                B += rect.right;
            }
            setPaddingRelative(A, getPaddingTop(), B, getPaddingBottom());
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f1288n)) {
            return this.f1288n;
        }
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3496b0) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.c;
        if (insetDrawable == null) {
            return this.f1279b;
        }
        return insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3498d0;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3499e0;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f1279b;
        if (eVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, eVar.C());
    }

    public Drawable getChipDrawable() {
        return this.f1279b;
    }

    public float getChipEndPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3509o0;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f1279b;
        if (eVar == null || (drawable = eVar.R) == null) {
            return null;
        }
        return DrawableCompat.unwrap(drawable);
    }

    public float getChipIconSize() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.T;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.S;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.K;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3502h0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.M;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.N;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f1279b;
        if (eVar == null || (drawable = eVar.W) == null) {
            return null;
        }
        return DrawableCompat.unwrap(drawable);
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3495a0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3508n0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.Z;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3507m0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.Y;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.M0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f1290p) {
            c cVar = this.f1289o;
            if (cVar.getKeyboardFocusedVirtualViewId() == 1 || cVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public b3.e getHideMotionSpec() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3501g0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3504j0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3503i0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.O;
        }
        return null;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        return this.f1279b.c.f6749a;
    }

    @Nullable
    public b3.e getShowMotionSpec() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3500f0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3506l0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f1279b;
        if (eVar != null) {
            return eVar.f3505k0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f1279b;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        f textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f1292s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u.w(this, this.f1279b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1277u);
        }
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3496b0) {
            View.mergeDrawableStates(onCreateDrawableState, f1278v);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (this.f1290p) {
            this.f1289o.onFocusChanged(z9, i10, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3496b0) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), PointerIconCompat.TYPE_HAND);
        }
        return super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f1286l != i10) {
            this.f1286l = i10;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f1282h
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f1282h
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.e
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f1290p
            if (r0 == 0) goto L43
            l3.c r0 = r5.f1289o
            r0.sendEventForVirtualView(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f1288n = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.d) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.d) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z9) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.H(z9);
        }
    }

    public void setCheckableResource(@BoolRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.H(eVar.f3510p0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        e eVar = this.f1279b;
        if (eVar == null) {
            this.f1281g = z9;
        } else if (eVar.f3496b0) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.I(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.I(AppCompatResources.getDrawable(eVar.f3510p0, i10));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.J(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.J(AppCompatResources.getColorStateList(eVar.f3510p0, i10));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.K(eVar.f3510p0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.J != colorStateList) {
            eVar.J = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i10) {
        ColorStateList colorStateList;
        e eVar = this.f1279b;
        if (eVar != null && eVar.J != (colorStateList = AppCompatResources.getColorStateList(eVar.f3510p0, i10))) {
            eVar.J = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.L(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.L(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(@NonNull e eVar) {
        e eVar2 = this.f1279b;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.L0 = new WeakReference(null);
            }
            this.f1279b = eVar;
            eVar.N0 = false;
            eVar.L0 = new WeakReference(this);
            c(this.f1287m);
        }
    }

    public void setChipEndPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3509o0 != f8) {
            eVar.f3509o0 = f8;
            eVar.invalidateSelf();
            eVar.F();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            float dimension = eVar.f3510p0.getResources().getDimension(i10);
            if (eVar.f3509o0 != dimension) {
                eVar.f3509o0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.M(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@DrawableRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.M(AppCompatResources.getDrawable(eVar.f3510p0, i10));
        }
    }

    public void setChipIconSize(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.N(f8);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.N(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.O(AppCompatResources.getColorStateList(eVar.f3510p0, i10));
        }
    }

    public void setChipIconVisible(@BoolRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.P(eVar.f3510p0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f8) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.K != f8) {
            eVar.K = f8;
            eVar.invalidateSelf();
            eVar.F();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            float dimension = eVar.f3510p0.getResources().getDimension(i10);
            if (eVar.K != dimension) {
                eVar.K = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStartPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3502h0 != f8) {
            eVar.f3502h0 = f8;
            eVar.invalidateSelf();
            eVar.F();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            float dimension = eVar.f3510p0.getResources().getDimension(i10);
            if (eVar.f3502h0 != dimension) {
                eVar.f3502h0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.Q(AppCompatResources.getColorStateList(eVar.f3510p0, i10));
        }
    }

    public void setChipStrokeWidth(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.R(f8);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.R(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.S(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3495a0 != charSequence) {
            eVar.f3495a0 = BidiFormatter.getInstance().unicodeWrap(charSequence);
            eVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.T(f8);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.T(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(@DrawableRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.S(AppCompatResources.getDrawable(eVar.f3510p0, i10));
        }
        e();
    }

    public void setCloseIconSize(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.U(f8);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.U(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.V(f8);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.V(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.X(AppCompatResources.getColorStateList(eVar.f3510p0, i10));
        }
    }

    public void setCloseIconVisible(@BoolRes int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                b.g("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        b.g("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            } else {
                b.g("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        b.g("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
                return;
            } else {
                b.g("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        b.g("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
                return;
            } else {
                b.g("Please set end drawable using R.attr#closeIcon.");
                return;
            }
        }
        b.g("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.p(f8);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f1279b != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                e eVar = this.f1279b;
                if (eVar != null) {
                    eVar.M0 = truncateAt;
                    return;
                }
                return;
            }
            b.g("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.f1285k = z9;
        c(this.f1287m);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@Nullable b3.e eVar) {
        e eVar2 = this.f1279b;
        if (eVar2 != null) {
            eVar2.f3501g0 = eVar;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.f3501g0 = b3.e.b(i10, eVar.f3510p0);
        }
    }

    public void setIconEndPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.Z(f8);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.Z(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.a0(f8);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.a0(eVar.f3510p0.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f1279b == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
        } else {
            b.g("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
        } else {
            b.g("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i10) {
        super.setMaxWidth(i10);
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.O0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
        } else {
            b.g("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f1280f = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
        e();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.b0(colorStateList);
        }
        this.f1279b.getClass();
        f();
    }

    public void setRippleColorResource(@ColorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.b0(AppCompatResources.getColorStateList(eVar.f3510p0, i10));
            this.f1279b.getClass();
            f();
        }
    }

    @Override // z3.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        this.f1279b.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(@Nullable b3.e eVar) {
        e eVar2 = this.f1279b;
        if (eVar2 != null) {
            eVar2.f3500f0 = eVar;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.f3500f0 = b3.e.b(i10, eVar.f3510p0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z9) {
        if (z9) {
            super.setSingleLine(z9);
        } else {
            b.g("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        e eVar = this.f1279b;
        if (eVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (eVar.N0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            e eVar2 = this.f1279b;
            if (eVar2 != null && !TextUtils.equals(eVar2.P, charSequence)) {
                eVar2.P = charSequence;
                eVar2.f3516v0.e = true;
                eVar2.invalidateSelf();
                eVar2.F();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e eVar = this.f1279b;
        if (eVar != null) {
            Context context2 = eVar.f3510p0;
            eVar.f3516v0.b(new f(context2, i10), context2);
        }
        h();
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3506l0 != f8) {
            eVar.f3506l0 = f8;
            eVar.invalidateSelf();
            eVar.F();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            float dimension = eVar.f3510p0.getResources().getDimension(i10);
            if (eVar.f3506l0 != dimension) {
                eVar.f3506l0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f8) {
        super.setTextSize(i10, f8);
        e eVar = this.f1279b;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f8, getResources().getDisplayMetrics());
            j jVar = eVar.f3516v0;
            f fVar = jVar.f5705g;
            if (fVar != null) {
                fVar.f6371l = applyDimension;
                jVar.f5702a.setTextSize(applyDimension);
                eVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f8) {
        e eVar = this.f1279b;
        if (eVar != null && eVar.f3505k0 != f8) {
            eVar.f3505k0 = f8;
            eVar.invalidateSelf();
            eVar.F();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i10) {
        e eVar = this.f1279b;
        if (eVar != null) {
            float dimension = eVar.f3510p0.getResources().getDimension(i10);
            if (eVar.f3505k0 != dimension) {
                eVar.f3505k0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setCloseIconVisible(boolean z9) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.Y(z9);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z9) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.K(z9);
        }
    }

    public void setChipIconVisible(boolean z9) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.P(z9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            b.g("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            b.g("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            b.g("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            b.g("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable s3.f fVar) {
    }

    public void setTextAppearance(@Nullable f fVar) {
        e eVar = this.f1279b;
        if (eVar != null) {
            eVar.f3516v0.b(fVar, eVar.f3510p0);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        e eVar = this.f1279b;
        if (eVar != null) {
            Context context = eVar.f3510p0;
            eVar.f3516v0.b(new f(context, i10), context);
        }
        h();
    }
}
