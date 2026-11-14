package e4;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w extends AppCompatAutoCompleteTextView {

    /* renamed from: b, reason: collision with root package name */
    public final ListPopupWindow f2194b;
    public final AccessibilityManager c;
    public final Rect d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2195f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2196g;

    /* renamed from: h, reason: collision with root package name */
    public int f2197h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f2198i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = g4.a.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.d = r8
            android.content.Context r0 = r7.getContext()
            int r4 = androidx.appcompat.R.style.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            int[] r2 = a3.a.f16m
            r1 = r9
            android.content.res.TypedArray r8 = s3.l.d(r0, r1, r2, r3, r4, r5)
            boolean r9 = r8.hasValue(r6)
            if (r9 == 0) goto L30
            int r9 = r8.getInt(r6, r6)
            if (r9 != 0) goto L30
            r9 = 0
            r7.setKeyListener(r9)
        L30:
            r9 = 3
            r1 = 2131493070(0x7f0c00ce, float:1.860961E38)
            int r9 = r8.getResourceId(r9, r1)
            r7.e = r9
            r9 = 2131100558(0x7f06038e, float:1.78135E38)
            r1 = 1
            int r9 = r8.getDimensionPixelOffset(r1, r9)
            float r9 = (float) r9
            r7.f2195f = r9
            r9 = 2
            boolean r2 = r8.hasValue(r9)
            if (r2 == 0) goto L56
            int r2 = r8.getColor(r9, r6)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r7.f2196g = r2
        L56:
            r2 = 4
            int r2 = r8.getColor(r2, r6)
            r7.f2197h = r2
            r2 = 5
            android.content.res.ColorStateList r2 = w3.c.a(r0, r8, r2)
            r7.f2198i = r2
            java.lang.String r2 = "accessibility"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            r7.c = r2
            androidx.appcompat.widget.ListPopupWindow r2 = new androidx.appcompat.widget.ListPopupWindow
            r2.<init>(r0)
            r7.f2194b = r2
            r2.setModal(r1)
            r2.setAnchorView(r7)
            r2.setInputMethodMode(r9)
            android.widget.ListAdapter r9 = r7.getAdapter()
            r2.setAdapter(r9)
            e4.u r9 = new e4.u
            r9.<init>(r7)
            r2.setOnItemClickListener(r9)
            r9 = 6
            boolean r0 = r8.hasValue(r9)
            if (r0 == 0) goto L9b
            int r9 = r8.getResourceId(r9, r6)
            r7.setSimpleItems(r9)
        L9b:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.w.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.c;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f2194b.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f2196g;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.G) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f2195f;
    }

    public int getSimpleItemSelectedColor() {
        return this.f2197h;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f2198i;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.G && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2194b.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i12 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f2194b;
                int min = Math.min(adapter.getCount(), Math.max(0, listPopupWindow.getSelectedItemPosition()) + 15);
                View view = null;
                int i13 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i12) {
                        view = null;
                        i12 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i13 = Math.max(i13, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.d;
                    background.getPadding(rect);
                    i13 += rect.left + rect.right;
                }
                i12 = b10.getEndIconView().getMeasuredWidth() + i13;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i12), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z9);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f2194b.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f2194b;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f2196g = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof z3.k) {
            ((z3.k) dropDownBackground).q(this.f2196g);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f2194b.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.u();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f2197h = i10;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f2198i = colorStateList;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new v(this, getContext(), this.e, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f2194b.show();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(@ArrayRes int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }
}
