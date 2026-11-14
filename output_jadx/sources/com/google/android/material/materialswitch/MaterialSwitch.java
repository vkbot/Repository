package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import com.example.navistart.R;
import g4.a;
import o3.c;
import s3.l;
import s3.q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f1388o = {R.attr.state_with_icon};

    /* renamed from: b, reason: collision with root package name */
    public Drawable f1389b;
    public Drawable c;
    public int d;
    public Drawable e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1390f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1391g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f1392h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f1393i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1394j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1395k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1396l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f1397m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f1398n;

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, R.attr.materialSwitchStyle);
        this.d = -1;
        Context context2 = getContext();
        this.f1389b = super.getThumbDrawable();
        this.f1391g = super.getThumbTintList();
        super.setThumbTintList(null);
        this.e = super.getTrackDrawable();
        this.f1394j = super.getTrackTintList();
        super.setTrackTintList(null);
        l.a(context2, attributeSet, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch);
        int[] iArr = a3.a.f25y;
        l.b(context2, attributeSet, iArr, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, R.attr.materialSwitchStyle, R.style.Widget_Material3_CompoundButton_MaterialSwitch);
        this.c = obtainStyledAttributes.getDrawable(0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.f1392h = obtainStyledAttributes.getColorStateList(2);
        int i10 = obtainStyledAttributes.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1393i = q.b(i10, mode);
        this.f1390f = obtainStyledAttributes.getDrawable(4);
        this.f1395k = obtainStyledAttributes.getColorStateList(5);
        this.f1396l = q.b(obtainStyledAttributes.getInt(6, -1), mode);
        obtainStyledAttributes.recycle();
        setEnforceSwitchWidth(false);
        a();
        b();
    }

    public static void c(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f8) {
        if (drawable != null && colorStateList != null) {
            drawable.setTint(ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f8));
        }
    }

    public final void a() {
        this.f1389b = c.b(this.f1389b, this.f1391g, getThumbTintMode());
        this.c = c.b(this.c, this.f1392h, this.f1393i);
        d();
        Drawable drawable = this.f1389b;
        Drawable drawable2 = this.c;
        int i10 = this.d;
        super.setThumbDrawable(c.a(drawable, drawable2, i10, i10));
        refreshDrawableState();
    }

    public final void b() {
        this.e = c.b(this.e, this.f1394j, getTrackTintMode());
        this.f1390f = c.b(this.f1390f, this.f1395k, this.f1396l);
        d();
        Drawable drawable = this.e;
        if (drawable != null && this.f1390f != null) {
            drawable = new LayerDrawable(new Drawable[]{this.e, this.f1390f});
        } else if (drawable == null) {
            drawable = this.f1390f;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    public final void d() {
        if (this.f1391g != null || this.f1392h != null || this.f1394j != null || this.f1395k != null) {
            float thumbPosition = getThumbPosition();
            ColorStateList colorStateList = this.f1391g;
            if (colorStateList != null) {
                c(this.f1389b, colorStateList, this.f1397m, this.f1398n, thumbPosition);
            }
            ColorStateList colorStateList2 = this.f1392h;
            if (colorStateList2 != null) {
                c(this.c, colorStateList2, this.f1397m, this.f1398n, thumbPosition);
            }
            ColorStateList colorStateList3 = this.f1394j;
            if (colorStateList3 != null) {
                c(this.e, colorStateList3, this.f1397m, this.f1398n, thumbPosition);
            }
            ColorStateList colorStateList4 = this.f1395k;
            if (colorStateList4 != null) {
                c(this.f1390f, colorStateList4, this.f1397m, this.f1398n, thumbPosition);
            }
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f1389b;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.c;
    }

    @Px
    public int getThumbIconSize() {
        return this.d;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f1392h;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f1393i;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f1391g;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f1390f;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f1395k;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f1396l;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.e;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f1394j;
    }

    @Override // android.view.View
    public final void invalidate() {
        d();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (this.c != null) {
            View.mergeDrawableStates(onCreateDrawableState, f1388o);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i11 = 0;
        for (int i12 : onCreateDrawableState) {
            if (i12 != 16842912) {
                iArr[i11] = i12;
                i11++;
            }
        }
        this.f1397m = iArr;
        this.f1398n = c.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f1389b = drawable;
        a();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.c = drawable;
        a();
    }

    public void setThumbIconResource(@DrawableRes int i10) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setThumbIconSize(@Px int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f1392h = colorStateList;
        a();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f1393i = mode;
        a();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f1391g = colorStateList;
        a();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        a();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f1390f = drawable;
        b();
    }

    public void setTrackDecorationResource(@DrawableRes int i10) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f1395k = colorStateList;
        b();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f1396l = mode;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.e = drawable;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f1394j = colorStateList;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        b();
    }
}
