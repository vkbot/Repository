package k3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.bumptech.glide.g;
import com.example.navistart.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends AppCompatCheckBox {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f3398v = {R.attr.state_indeterminate};
    public static final int[] w = {R.attr.state_error};

    /* renamed from: x, reason: collision with root package name */
    public static final int[][] f3399x = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: y, reason: collision with root package name */
    public static final int f3400y = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3401b;
    public final LinkedHashSet c;
    public ColorStateList d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3402f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3403g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3404h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f3405i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3406j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3407k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3408l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f3409m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f3410n;

    /* renamed from: o, reason: collision with root package name */
    public int f3411o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f3412p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3413q;
    public CharSequence r;

    /* renamed from: s, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3414s;
    public final AnimatedVectorDrawableCompat t;

    /* renamed from: u, reason: collision with root package name */
    public final a f3415u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = androidx.appcompat.R.attr.checkboxStyle
            r0 = 2132018352(0x7f1404b0, float:1.9675008E38)
            android.content.Context r8 = g4.a.a(r8, r9, r3, r0)
            r7.<init>(r8, r9, r3)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f3401b = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.c = r8
            android.content.Context r8 = r7.getContext()
            r0 = 2131165606(0x7f0701a6, float:1.7945434E38)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r8 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(r8, r0)
            r7.t = r8
            k3.a r8 = new k3.a
            r8.<init>(r7)
            r7.f3415u = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r7)
            r7.f3405i = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.f3408l = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            r6 = 0
            int[] r5 = new int[r6]
            r4 = 2132018352(0x7f1404b0, float:1.9675008E38)
            s3.l.a(r0, r9, r3, r4)
            int[] r2 = a3.a.t
            r1 = r9
            s3.l.b(r0, r1, r2, r3, r4, r5)
            androidx.appcompat.widget.TintTypedArray r9 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r1, r2, r3, r4)
            r1 = 2
            android.graphics.drawable.Drawable r1 = r9.getDrawable(r1)
            r7.f3406j = r1
            android.graphics.drawable.Drawable r1 = r7.f3405i
            r2 = 1
            if (r1 == 0) goto L93
            r1 = 2130903752(0x7f0302c8, float:1.741433E38)
            boolean r1 = w3.b.b(r0, r1, r6)
            if (r1 == 0) goto L93
            int r1 = r9.getResourceId(r6, r6)
            int r3 = r9.getResourceId(r2, r6)
            int r4 = k3.c.f3400y
            if (r1 != r4) goto L93
            if (r3 != 0) goto L93
            super.setButtonDrawable(r8)
            r8 = 2131165605(0x7f0701a5, float:1.7945432E38)
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            r7.f3405i = r8
            r7.f3407k = r2
            android.graphics.drawable.Drawable r8 = r7.f3406j
            if (r8 != 0) goto L93
            r8 = 2131165607(0x7f0701a7, float:1.7945436E38)
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            r7.f3406j = r8
        L93:
            r8 = 3
            android.content.res.ColorStateList r8 = w3.c.b(r0, r9, r8)
            r7.f3409m = r8
            r8 = 4
            r0 = -1
            int r8 = r9.getInt(r8, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = s3.q.b(r8, r0)
            r7.f3410n = r8
            r8 = 10
            boolean r8 = r9.getBoolean(r8, r6)
            r7.e = r8
            r8 = 6
            boolean r8 = r9.getBoolean(r8, r2)
            r7.f3402f = r8
            r8 = 9
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f3403g = r8
            r8 = 8
            java.lang.CharSequence r8 = r9.getText(r8)
            r7.f3404h = r8
            r8 = 7
            boolean r0 = r9.hasValue(r8)
            if (r0 == 0) goto Ld5
            int r8 = r9.getInt(r8, r6)
            r7.setCheckedState(r8)
        Ld5:
            r9.recycle()
            r7.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f3411o;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i10 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.d == null) {
            int a10 = m3.a.a(androidx.appcompat.R.attr.colorControlActivated, this);
            int a11 = m3.a.a(androidx.appcompat.R.attr.colorError, this);
            int a12 = m3.a.a(R.attr.colorSurface, this);
            int a13 = m3.a.a(R.attr.colorOnSurface, this);
            this.d = new ColorStateList(f3399x, new int[]{m3.a.c(1.0f, a12, a11), m3.a.c(1.0f, a12, a10), m3.a.c(0.54f, a12, a13), m3.a.c(0.38f, a12, a13), m3.a.c(0.38f, a12, a13)});
        }
        return this.d;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f3408l;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.f3405i = o3.c.b(this.f3405i, this.f3408l, CompoundButtonCompat.getButtonTintMode(this));
        this.f3406j = o3.c.b(this.f3406j, this.f3409m, this.f3410n);
        if (this.f3407k) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.t;
            if (animatedVectorDrawableCompat != null) {
                a aVar = this.f3415u;
                animatedVectorDrawableCompat.unregisterAnimationCallback(aVar);
                animatedVectorDrawableCompat.registerAnimationCallback(aVar);
            }
            Drawable drawable = this.f3405i;
            if ((drawable instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.f3405i).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable2 = this.f3405i;
        if (drawable2 != null && (colorStateList2 = this.f3408l) != null) {
            drawable2.setTintList(colorStateList2);
        }
        Drawable drawable3 = this.f3406j;
        if (drawable3 != null && (colorStateList = this.f3409m) != null) {
            drawable3.setTintList(colorStateList);
        }
        super.setButtonDrawable(o3.c.a(this.f3405i, this.f3406j, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f3405i;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f3406j;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f3409m;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f3410n;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f3408l;
    }

    public int getCheckedState() {
        return this.f3411o;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f3404h;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f3411o == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && this.f3408l == null && this.f3409m == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f3398v);
        }
        if (this.f3403g) {
            View.mergeDrawableStates(onCreateDrawableState, w);
        }
        this.f3412p = o3.c.c(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.f3402f && TextUtils.isEmpty(getText()) && (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) != null) {
            int i10 = 1;
            if (getLayoutDirection() == 1) {
                i10 = -1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f3403g) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f3404h));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f3397b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, k3.b] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f3397b = getCheckedState();
        return baseSavedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i10) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f3406j = drawable;
        a();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i10) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f3409m == colorStateList) {
            return;
        }
        this.f3409m = colorStateList;
        a();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f3410n == mode) {
            return;
        }
        this.f3410n = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f3408l == colorStateList) {
            return;
        }
        this.f3408l = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f3402f = z9;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        setCheckedState(z9 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        boolean z9;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f3411o != i10) {
            this.f3411o = i10;
            if (i10 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            super.setChecked(z9);
            refreshDrawableState();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && this.r == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f3413q) {
                this.f3413q = true;
                LinkedHashSet linkedHashSet = this.c;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw g.b(it);
                    }
                }
                if (this.f3411o != 2 && (onCheckedChangeListener = this.f3414s) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i11 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f3413q = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f3404h = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z9) {
        if (this.f3403g != z9) {
            this.f3403g = z9;
            refreshDrawableState();
            Iterator it = this.f3401b.iterator();
            if (!it.hasNext()) {
            } else {
                throw g.b(it);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3414s = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.r = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.e = z9;
        if (z9) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f3405i = drawable;
        this.f3407k = false;
        a();
    }
}
