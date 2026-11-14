package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import s3.a;
import s3.e;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements MenuView.ItemView {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1376s = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public int f1377h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1378i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1379j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1380k;

    /* renamed from: l, reason: collision with root package name */
    public final CheckedTextView f1381l;

    /* renamed from: m, reason: collision with root package name */
    public FrameLayout f1382m;

    /* renamed from: n, reason: collision with root package name */
    public MenuItemImpl f1383n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f1384o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1385p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f1386q;
    public final a r;

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1380k = true;
        a aVar = new a(1, this);
        this.r = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.example.navistart.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.example.navistart.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.example.navistart.R.id.design_menu_item_text);
        this.f1381l = checkedTextView;
        ViewCompat.setAccessibilityDelegate(checkedTextView, aVar);
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f1382m == null) {
                this.f1382m = (FrameLayout) ((ViewStub) findViewById(com.example.navistart.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1382m.removeAllViews();
            this.f1382m.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f1383n;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i10) {
        int i11;
        StateListDrawable stateListDrawable;
        this.f1383n = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        if (menuItemImpl.isVisible()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1376s, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.setTooltipText(this, menuItemImpl.getTooltipText());
        CharSequence title = this.f1383n.getTitle();
        CheckedTextView checkedTextView = this.f1381l;
        if (title == null && this.f1383n.getIcon() == null && this.f1383n.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1382m;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f1382m.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1382m;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f1382m.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        MenuItemImpl menuItemImpl = this.f1383n;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f1383n.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1376s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.f1379j != z9) {
            this.f1379j = z9;
            this.r.sendAccessibilityEvent(this.f1381l, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z9) {
        int i10;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1381l;
        checkedTextView.setChecked(z9);
        Typeface typeface = checkedTextView.getTypeface();
        if (z9 && this.f1380k) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        checkedTextView.setTypeface(typeface, i10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.f1385p) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                drawable.setTintList(this.f1384o);
            }
            int i10 = this.f1377h;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f1378i) {
            if (this.f1386q == null) {
                Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), com.example.navistart.R.drawable.navigation_empty_icon, getContext().getTheme());
                this.f1386q = drawable2;
                if (drawable2 != null) {
                    int i11 = this.f1377h;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f1386q;
        }
        this.f1381l.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f1381l.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(@Dimension int i10) {
        this.f1377h = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z9;
        this.f1384o = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f1385p = z9;
        MenuItemImpl menuItemImpl = this.f1383n;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f1381l.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.f1378i = z9;
    }

    public void setTextAppearance(int i10) {
        TextViewCompat.setTextAppearance(this.f1381l, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1381l.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f1381l.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z9, char c) {
    }
}
