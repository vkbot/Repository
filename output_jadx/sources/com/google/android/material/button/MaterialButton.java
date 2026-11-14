package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.customview.view.AbsSavedState;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.fragment.app.h;
import b1.u;
import com.bumptech.glide.g;
import f5.j;
import h3.a;
import h3.b;
import h3.e;
import h3.f;
import j1.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s3.l;
import s3.q;
import w3.c;
import z3.b0;
import z3.d0;
import z3.k;
import z3.n;
import z3.o;
import z3.z;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, z {
    public static final int[] D = {R.attr.state_checkable};
    public static final int[] E = {R.attr.state_checked};
    public static final a F = new FloatPropertyCompat("widthIncrease");
    public float A;
    public float B;
    public SpringAnimation C;

    /* renamed from: b */
    public final f f1247b;
    public final LinkedHashSet c;
    public b d;
    public PorterDuff.Mode e;

    /* renamed from: f */
    public ColorStateList f1248f;

    /* renamed from: g */
    public Drawable f1249g;

    /* renamed from: h */
    public String f1250h;

    /* renamed from: i */
    public int f1251i;

    /* renamed from: j */
    public int f1252j;

    /* renamed from: k */
    public int f1253k;

    /* renamed from: l */
    public int f1254l;

    /* renamed from: m */
    public boolean f1255m;

    /* renamed from: n */
    public boolean f1256n;

    /* renamed from: o */
    public int f1257o;

    /* renamed from: p */
    public int f1258p;

    /* renamed from: q */
    public float f1259q;
    public int r;

    /* renamed from: s */
    public int f1260s;
    public LinearLayout.LayoutParams t;

    /* renamed from: u */
    public boolean f1261u;

    /* renamed from: v */
    public int f1262v;
    public boolean w;

    /* renamed from: x */
    public int f1263x;

    /* renamed from: y */
    public d0 f1264y;

    /* renamed from: z */
    public int f1265z;

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(g4.a.b(context, attributeSet, new int[]{com.example.navistart.R.attr.materialSizeOverlay}, com.example.navistart.R.attr.materialButtonStyle, com.example.navistart.R.style.Widget_MaterialComponents_Button), attributeSet, com.example.navistart.R.attr.materialButtonStyle);
        o a10;
        this.c = new LinkedHashSet();
        this.f1255m = false;
        this.f1256n = false;
        this.f1258p = -1;
        this.f1259q = -1.0f;
        this.r = -1;
        this.f1260s = -1;
        this.f1263x = -1;
        Context context2 = getContext();
        TypedArray d = l.d(context2, attributeSet, a3.a.f17n, com.example.navistart.R.attr.materialButtonStyle, com.example.navistart.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1254l = d.getDimensionPixelSize(13, 0);
        int i10 = d.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e = q.b(i10, mode);
        this.f1248f = c.a(getContext(), d, 15);
        this.f1249g = c.c(getContext(), d, 11);
        this.f1257o = d.getInteger(12, 1);
        this.f1251i = d.getDimensionPixelSize(14, 0);
        b0 b10 = b0.b(context2, d, 19);
        if (b10 != null) {
            a10 = b10.c();
        } else {
            a10 = o.c(context2, attributeSet, com.example.navistart.R.attr.materialButtonStyle, com.example.navistart.R.style.Widget_MaterialComponents_Button).a();
        }
        boolean z9 = d.getBoolean(17, false);
        f fVar = new f(this, a10);
        this.f1247b = fVar;
        fVar.f2562f = d.getDimensionPixelOffset(2, 0);
        fVar.f2563g = d.getDimensionPixelOffset(3, 0);
        fVar.f2564h = d.getDimensionPixelOffset(4, 0);
        fVar.f2565i = d.getDimensionPixelOffset(5, 0);
        if (d.hasValue(9)) {
            int dimensionPixelSize = d.getDimensionPixelSize(9, -1);
            fVar.f2566j = dimensionPixelSize;
            float f8 = dimensionPixelSize;
            n g10 = fVar.f2561b.g();
            g10.e = new z3.a(f8);
            g10.f6786f = new z3.a(f8);
            g10.f6787g = new z3.a(f8);
            g10.f6788h = new z3.a(f8);
            fVar.f2561b = g10.a();
            fVar.c = null;
            fVar.d();
            fVar.f2574s = true;
        }
        fVar.f2567k = d.getDimensionPixelSize(22, 0);
        fVar.f2568l = q.b(d.getInt(8, -1), mode);
        fVar.f2569m = c.a(getContext(), d, 7);
        fVar.f2570n = c.a(getContext(), d, 21);
        fVar.f2571o = c.a(getContext(), d, 18);
        fVar.t = d.getBoolean(6, false);
        fVar.w = d.getDimensionPixelSize(10, 0);
        fVar.f2575u = d.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            fVar.r = true;
            setSupportBackgroundTintList(fVar.f2569m);
            setSupportBackgroundTintMode(fVar.f2568l);
        } else {
            fVar.c();
        }
        setPaddingRelative(paddingStart + fVar.f2562f, paddingTop + fVar.f2564h, paddingEnd + fVar.f2563g, paddingBottom + fVar.f2565i);
        setCheckedInternal(d.getBoolean(1, false));
        if (b10 != null) {
            fVar.d = d();
            if (fVar.c != null) {
                fVar.d();
            }
            fVar.c = b10;
            fVar.d();
        }
        setOpticalCenterEnabled(z9);
        d.recycle();
        setCompoundDrawablePadding(this.f1254l);
        h(this.f1249g != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f1262v = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    public float getDisplayedWidthIncrease() {
        return this.A;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        k a10;
        if (!this.f1261u || !this.w || (a10 = this.f1247b.a(false)) == null) {
            return 0;
        }
        return (int) (a10.i() * 0.11f);
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f8 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f8 = Math.max(f8, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f8);
    }

    private void setCheckedInternal(boolean z9) {
        f fVar = this.f1247b;
        if (fVar != null && fVar.t && this.f1255m != z9) {
            this.f1255m = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z10 = this.f1255m;
                if (!materialButtonToggleGroup.f1267m) {
                    materialButtonToggleGroup.f(getId(), z10);
                }
            }
            if (!this.f1256n) {
                this.f1256n = true;
                Iterator it = this.c.iterator();
                if (!it.hasNext()) {
                    this.f1256n = false;
                    return;
                }
                throw g.b(it);
            }
        }
    }

    public void setDisplayedWidthIncrease(float f8) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.A != f8) {
            this.A = f8;
            j();
            invalidate();
            if (getParent() instanceof e) {
                e eVar = (e) getParent();
                int i10 = (int) this.A;
                int indexOfChild = eVar.indexOfChild(this);
                if (indexOfChild >= 0) {
                    int i11 = indexOfChild - 1;
                    while (true) {
                        materialButton = null;
                        if (i11 >= 0) {
                            if (eVar.c(i11)) {
                                materialButton2 = (MaterialButton) eVar.getChildAt(i11);
                                break;
                            }
                            i11--;
                        } else {
                            materialButton2 = null;
                            break;
                        }
                    }
                    int childCount = eVar.getChildCount();
                    while (true) {
                        indexOfChild++;
                        if (indexOfChild >= childCount) {
                            break;
                        } else if (eVar.c(indexOfChild)) {
                            materialButton = (MaterialButton) eVar.getChildAt(indexOfChild);
                            break;
                        }
                    }
                    if (materialButton2 != null || materialButton != null) {
                        if (materialButton2 == null) {
                            materialButton.setDisplayedWidthDecrease(i10);
                        }
                        if (materialButton == null) {
                            materialButton2.setDisplayedWidthDecrease(i10);
                        }
                        if (materialButton2 != null && materialButton != null) {
                            materialButton2.setDisplayedWidthDecrease(i10 / 2);
                            materialButton.setDisplayedWidthDecrease((i10 + 1) / 2);
                        }
                    }
                }
            }
        }
    }

    public final SpringForce d() {
        TypedArray obtainStyledAttributes;
        Context context = getContext();
        TypedValue a10 = w3.b.a(com.example.navistart.R.attr.motionSpringFastSpatial, context);
        int[] iArr = a3.a.f24x;
        if (a10 == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, 0, com.example.navistart.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(a10.resourceId, iArr);
        }
        SpringForce springForce = new SpringForce();
        try {
            float f8 = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f8 != Float.MIN_VALUE) {
                float f10 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE) {
                    springForce.setStiffness(f8);
                    springForce.setDampingRatio(f10);
                    return springForce;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        f fVar = this.f1247b;
        if (fVar != null && !fVar.r) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if (r1 == 2) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            z3.d0 r0 = r8.f1264y
            if (r0 != 0) goto L6
            goto L86
        L6:
            androidx.dynamicanimation.animation.SpringAnimation r0 = r8.C
            if (r0 != 0) goto L1a
            androidx.dynamicanimation.animation.SpringAnimation r0 = new androidx.dynamicanimation.animation.SpringAnimation
            h3.a r1 = com.google.android.material.button.MaterialButton.F
            r0.<init>(r8, r1)
            r8.C = r0
            androidx.dynamicanimation.animation.SpringForce r1 = r8.d()
            r0.setSpring(r1)
        L1a:
            boolean r0 = r8.w
            if (r0 == 0) goto L86
            int r0 = r8.f1265z
            z3.d0 r1 = r8.f1264y
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L2a:
            int r6 = r1.f6745a
            r7 = -1
            if (r5 >= r6) goto L3b
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L38
            goto L3c
        L38:
            int r5 = r5 + 1
            goto L2a
        L3b:
            r5 = r7
        L3c:
            if (r5 >= 0) goto L55
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L43:
            int r6 = r1.f6745a
            if (r5 >= r6) goto L54
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L51
            r7 = r5
            goto L54
        L51:
            int r5 = r5 + 1
            goto L43
        L54:
            r5 = r7
        L55:
            if (r5 >= 0) goto L5a
            n.p r1 = r1.f6746b
            goto L5e
        L5a:
            n.p[] r1 = r1.d
            r1 = r1[r5]
        L5e:
            java.lang.Object r1 = r1.c
            z3.c0 r1 = (z3.c0) r1
            int r2 = r8.getWidth()
            float r3 = r1.f6744b
            int r1 = r1.f6743a
            r5 = 1
            if (r1 != r5) goto L71
            float r1 = (float) r2
            float r3 = r3 * r1
        L6f:
            int r4 = (int) r3
            goto L75
        L71:
            r2 = 2
            if (r1 != r2) goto L75
            goto L6f
        L75:
            int r0 = java.lang.Math.min(r0, r4)
            androidx.dynamicanimation.animation.SpringAnimation r1 = r8.C
            float r0 = (float) r0
            r1.animateToFinalPosition(r0)
            if (r9 == 0) goto L86
            androidx.dynamicanimation.animation.SpringAnimation r9 = r8.C
            r9.skipToEnd()
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i10 = this.f1257o;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 16 && i10 != 32) {
                    return;
                }
                setCompoundDrawablesRelative(null, this.f1249g, null, null);
                return;
            }
            setCompoundDrawablesRelative(null, null, this.f1249g, null);
            return;
        }
        setCompoundDrawablesRelative(this.f1249g, null, null, null);
    }

    @NonNull
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f1250h)) {
            return this.f1250h;
        }
        f fVar = this.f1247b;
        if (fVar != null && fVar.t) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Px
    public int getAllowedWidthDecrease() {
        return this.f1263x;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (e()) {
            return this.f1247b.f2566j;
        }
        return 0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SpringForce getCornerSpringForce() {
        return this.f1247b.d;
    }

    public Drawable getIcon() {
        return this.f1249g;
    }

    public int getIconGravity() {
        return this.f1257o;
    }

    @Px
    public int getIconPadding() {
        return this.f1254l;
    }

    @Px
    public int getIconSize() {
        return this.f1251i;
    }

    public ColorStateList getIconTint() {
        return this.f1248f;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.e;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f1247b.f2565i;
    }

    @Dimension
    public int getInsetTop() {
        return this.f1247b.f2564h;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f1247b.f2571o;
        }
        return null;
    }

    @NonNull
    public o getShapeAppearanceModel() {
        if (e()) {
            return this.f1247b.f2561b;
        }
        i.l("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f1247b.c;
        }
        i.l("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f1247b.f2570n;
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (e()) {
            return this.f1247b.f2567k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f1247b.f2569m;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f1247b.f2568l;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z9) {
        Drawable drawable = this.f1249g;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f1249g = mutate;
            mutate.setTintList(this.f1248f);
            PorterDuff.Mode mode = this.e;
            if (mode != null) {
                this.f1249g.setTintMode(mode);
            }
            int i10 = this.f1251i;
            if (i10 == 0) {
                i10 = this.f1249g.getIntrinsicWidth();
            }
            int i11 = this.f1251i;
            if (i11 == 0) {
                i11 = this.f1249g.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1249g;
            int i12 = this.f1252j;
            int i13 = this.f1253k;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f1249g.setVisible(true, z9);
        }
        if (z9) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i14 = this.f1257o;
        if (((i14 != 1 && i14 != 2) || drawable3 == this.f1249g) && (((i14 != 3 && i14 != 4) || drawable5 == this.f1249g) && ((i14 != 16 && i14 != 32) || drawable4 == this.f1249g))) {
            return;
        }
        g();
    }

    public final void i(int i10, int i11) {
        boolean z9;
        if (this.f1249g != null && getLayout() != null) {
            int i12 = this.f1257o;
            boolean z10 = true;
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                if (i12 != 16 && i12 != 32) {
                    return;
                }
                this.f1252j = 0;
                if (i12 == 16) {
                    this.f1253k = 0;
                    h(false);
                    return;
                }
                int i13 = this.f1251i;
                if (i13 == 0) {
                    i13 = this.f1249g.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f1254l) - getPaddingBottom()) / 2);
                if (this.f1253k != max) {
                    this.f1253k = max;
                    h(false);
                    return;
                }
                return;
            }
            this.f1253k = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f1257o;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.f1251i;
                if (i15 == 0) {
                    i15 = this.f1249g.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - i15) - this.f1254l) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.f1257o != 4) {
                    z10 = false;
                }
                if (z9 != z10) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f1252j != textLayoutWidth) {
                    this.f1252j = textLayoutWidth;
                    h(false);
                    return;
                }
                return;
            }
            this.f1252j = 0;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1255m;
    }

    public final void j() {
        int i10 = (int) (this.A - this.B);
        int i11 = (i10 / 2) + this.f1262v;
        getLayoutParams().width = (int) (this.f1259q + i10);
        setPaddingRelative(this.r + i11, getPaddingTop(), (this.f1260s + i10) - i11, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            u.w(this, this.f1247b.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        f fVar = this.f1247b;
        if (fVar != null && fVar.t) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.f1255m) {
            View.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1255m);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        f fVar = this.f1247b;
        if (fVar != null && fVar.t) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setChecked(this.f1255m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z9, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f1258p != i15) {
            this.f1258p = i15;
            this.f1259q = -1.0f;
        }
        if (this.f1259q == -1.0f) {
            this.f1259q = getMeasuredWidth();
            if (this.t == null && (getParent() instanceof e) && ((e) getParent()).getButtonSizeChange() != null) {
                this.t = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.t);
                layoutParams.width = (int) this.f1259q;
                setLayoutParams(layoutParams);
            }
        }
        boolean z10 = false;
        if (this.f1263x == -1) {
            if (this.f1249g == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i16 = this.f1251i;
                if (i16 == 0) {
                    i16 = this.f1249g.getIntrinsicWidth();
                }
                i14 = iconPadding + i16;
            }
            this.f1263x = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.r == -1) {
            this.r = getPaddingStart();
        }
        if (this.f1260s == -1) {
            this.f1260s = getPaddingEnd();
        }
        if ((getParent() instanceof e) && ((e) getParent()).getOrientation() == 0) {
            z10 = true;
        }
        this.w = z10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h3.c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h3.c cVar = (h3.c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setChecked(cVar.f2551b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [h3.c, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.f2551b = this.f1255m;
        return absSavedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f1247b.f2575u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1249g != null) {
            if (this.f1249g.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setA11yClassName(@Nullable String str) {
        this.f1250h = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        if (e()) {
            f fVar = this.f1247b;
            if (fVar.a(false) != null) {
                fVar.a(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                f fVar = this.f1247b;
                fVar.r = true;
                MaterialButton materialButton = fVar.f2560a;
                materialButton.setSupportBackgroundTintList(fVar.f2569m);
                materialButton.setSupportBackgroundTintMode(fVar.f2568l);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (e()) {
            this.f1247b.t = z9;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        setCheckedInternal(z9);
    }

    public void setCornerRadius(@Px int i10) {
        if (e()) {
            f fVar = this.f1247b;
            if (!fVar.f2574s || fVar.f2566j != i10) {
                fVar.f2566j = i10;
                fVar.f2574s = true;
                float f8 = i10;
                n g10 = fVar.f2561b.g();
                g10.e = new z3.a(f8);
                g10.f6786f = new z3.a(f8);
                g10.f6787g = new z3.a(f8);
                g10.f6788h = new z3.a(f8);
                fVar.f2561b = g10.a();
                fVar.c = null;
                fVar.d();
            }
        }
    }

    public void setCornerRadiusResource(@DimenRes int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        f fVar = this.f1247b;
        fVar.d = springForce;
        if (fVar.c != null) {
            fVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.B = Math.min(i10, this.f1263x);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        if (e()) {
            this.f1247b.a(false).p(f8);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f1249g != drawable) {
            this.f1249g = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f1257o != i10) {
            this.f1257o = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i10) {
        if (this.f1254l != i10) {
            this.f1254l = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@DrawableRes int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = AppCompatResources.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(@Px int i10) {
        if (i10 >= 0) {
            if (this.f1251i != i10) {
                this.f1251i = i10;
                h(true);
                return;
            }
            return;
        }
        i.k("iconSize cannot be less than 0");
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f1248f != colorStateList) {
            this.f1248f = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            h(false);
        }
    }

    public void setIconTintResource(@ColorRes int i10) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(@Dimension int i10) {
        f fVar = this.f1247b;
        fVar.b(fVar.f2564h, i10);
    }

    public void setInsetTop(@Dimension int i10) {
        f fVar = this.f1247b;
        fVar.b(i10, fVar.f2565i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable b bVar) {
        this.d = bVar;
    }

    public void setOpticalCenterEnabled(boolean z9) {
        if (this.f1261u != z9) {
            this.f1261u = z9;
            f fVar = this.f1247b;
            if (z9) {
                h hVar = new h(12, this);
                fVar.e = hVar;
                k a10 = fVar.a(false);
                if (a10 != null) {
                    a10.F = hVar;
                }
            } else {
                fVar.e = null;
                k a11 = fVar.a(false);
                if (a11 != null) {
                    a11.F = null;
                }
            }
            post(new j(3, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        b bVar = this.d;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((r5.c) bVar).c).invalidate();
        }
        super.setPressed(z9);
        f(false);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f1247b;
            MaterialButton materialButton = fVar.f2560a;
            if (fVar.f2571o != colorStateList) {
                fVar.f2571o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(x3.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        if (e()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    @Override // z3.z
    public void setShapeAppearanceModel(@NonNull o oVar) {
        if (e()) {
            f fVar = this.f1247b;
            fVar.f2561b = oVar;
            fVar.c = null;
            fVar.d();
            return;
        }
        i.l("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (e()) {
            f fVar = this.f1247b;
            fVar.f2573q = z9;
            fVar.e();
        }
    }

    public void setSizeChange(@NonNull d0 d0Var) {
        if (this.f1264y != d0Var) {
            this.f1264y = d0Var;
            f(true);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearanceModel(@NonNull b0 b0Var) {
        if (e()) {
            f fVar = this.f1247b;
            if (fVar.d == null && b0Var.d()) {
                fVar.d = d();
                if (fVar.c != null) {
                    fVar.d();
                }
            }
            fVar.c = b0Var;
            fVar.d();
            return;
        }
        i.l("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f1247b;
            if (fVar.f2570n != colorStateList) {
                fVar.f2570n = colorStateList;
                fVar.e();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i10) {
        if (e()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(@Px int i10) {
        if (e()) {
            f fVar = this.f1247b;
            if (fVar.f2567k != i10) {
                fVar.f2567k = i10;
                fVar.e();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f1247b;
            if (fVar.f2569m != colorStateList) {
                fVar.f2569m = colorStateList;
                if (fVar.a(false) != null) {
                    fVar.a(false).setTintList(fVar.f2569m);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (e()) {
            f fVar = this.f1247b;
            if (fVar.f2568l != mode) {
                fVar.f2568l = mode;
                if (fVar.a(false) != null && fVar.f2568l != null) {
                    fVar.a(false).setTintMode(fVar.f2568l);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z9) {
        this.f1247b.f2575u = z9;
    }

    @Override // android.widget.TextView
    public void setWidth(@Px int i10) {
        this.f1259q = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(@Px int i10) {
        if (this.f1265z != i10) {
            this.f1265z = i10;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1255m);
    }
}
