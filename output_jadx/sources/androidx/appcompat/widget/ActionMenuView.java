package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f8);
        this.mGeneratedItemPadding = (int) (f8 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    public static int measureChildForCells(View view, int i10, int i11, int i12, int i13) {
        ActionMenuItemView actionMenuItemView;
        boolean z9;
        int i14;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z10 = false;
        if (actionMenuItemView != null && actionMenuItemView.hasText()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 > 0) {
            i14 = 2;
            if (!z9 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z9 || i15 >= 2) {
                    i14 = i15;
                }
                if (!layoutParams.isOverflowButton && z9) {
                    z10 = true;
                }
                layoutParams.expandable = z10;
                layoutParams.cellsUsed = i14;
                view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, BasicMeasure.EXACTLY), makeMeasureSpec);
                return i14;
            }
        }
        i14 = 0;
        if (!layoutParams.isOverflowButton) {
            z10 = true;
        }
        layoutParams.expandable = z10;
        layoutParams.cellsUsed = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, BasicMeasure.EXACTLY), makeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v47 */
    private void onMeasureExactFormat(int i10, int i11) {
        boolean z9;
        int i12;
        int i13;
        long j10;
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        ?? r32;
        boolean z13;
        int i18;
        int i19;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i20 = size - paddingRight;
        int i21 = this.mMinCellSize;
        int i22 = i20 / i21;
        int i23 = i20 % i21;
        if (i22 == 0) {
            setMeasuredDimension(i20, 0);
            return;
        }
        int i24 = (i23 / i22) + i21;
        int childCount = getChildCount();
        int i25 = 0;
        int i26 = 0;
        boolean z14 = false;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        long j11 = 0;
        while (i26 < childCount) {
            View childAt = getChildAt(i26);
            int i30 = size2;
            if (childAt.getVisibility() == 8) {
                i19 = paddingBottom;
            } else {
                boolean z15 = childAt instanceof ActionMenuItemView;
                i27++;
                if (z15) {
                    int i31 = this.mGeneratedItemPadding;
                    z12 = z15;
                    r32 = 0;
                    childAt.setPadding(i31, 0, i31, 0);
                } else {
                    z12 = z15;
                    r32 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r32;
                layoutParams.extraPixels = r32;
                layoutParams.cellsUsed = r32;
                layoutParams.expandable = r32;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r32;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r32;
                if (z12 && ((ActionMenuItemView) childAt).hasText()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                layoutParams.preventEdgeOffset = z13;
                if (layoutParams.isOverflowButton) {
                    i18 = 1;
                } else {
                    i18 = i22;
                }
                int measureChildForCells = measureChildForCells(childAt, i24, i18, childMeasureSpec, paddingBottom);
                i28 = Math.max(i28, measureChildForCells);
                i19 = paddingBottom;
                if (layoutParams.expandable) {
                    i29++;
                }
                if (layoutParams.isOverflowButton) {
                    z14 = true;
                }
                i22 -= measureChildForCells;
                i25 = Math.max(i25, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    j11 |= 1 << i26;
                    i22 = i22;
                }
            }
            i26++;
            size2 = i30;
            paddingBottom = i19;
        }
        int i32 = size2;
        char c = 2;
        if (z14 && i27 == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z16 = false;
        while (i29 > 0 && i22 > 0) {
            long j12 = 0;
            char c10 = c;
            int i33 = Integer.MAX_VALUE;
            int i34 = 0;
            int i35 = 0;
            j10 = 1;
            while (i35 < childCount) {
                boolean z17 = z9;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i35).getLayoutParams();
                int i36 = i24;
                if (layoutParams2.expandable) {
                    int i37 = layoutParams2.cellsUsed;
                    if (i37 < i33) {
                        j12 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j12 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                i24 = i36;
                z9 = z17;
            }
            boolean z18 = z9;
            i12 = i24;
            j11 |= j12;
            if (i34 > i22) {
                i13 = i25;
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount) {
                View childAt2 = getChildAt(i39);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i40 = i25;
                long j13 = 1 << i39;
                if ((j12 & j13) == 0) {
                    if (layoutParams3.cellsUsed == i38) {
                        j11 |= j13;
                    }
                    i17 = i39;
                } else {
                    if (z18 && layoutParams3.preventEdgeOffset) {
                        if (i22 == 1) {
                            int i41 = this.mGeneratedItemPadding;
                            z11 = true;
                            i17 = i39;
                            childAt2.setPadding(i41 + i12, 0, i41, 0);
                        } else {
                            i17 = i39;
                            z11 = true;
                        }
                    } else {
                        i17 = i39;
                        z11 = true;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = z11;
                    i22--;
                }
                i39 = i17 + 1;
                i25 = i40;
            }
            i24 = i12;
            c = c10;
            z9 = z18;
            z16 = true;
        }
        i12 = i24;
        i13 = i25;
        j10 = 1;
        if (!z14 && i27 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i22 <= 0 || j11 == 0 || (i22 >= i27 - 1 && !z10 && i28 <= 1)) {
            i14 = 0;
        } else {
            float bitCount = Long.bitCount(j11);
            if (!z10) {
                if ((j11 & j10) != 0) {
                    i14 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i14 = 0;
                }
                int i42 = childCount - 1;
                if ((j11 & (1 << i42)) != 0 && !((LayoutParams) getChildAt(i42).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            } else {
                i14 = 0;
            }
            if (bitCount > 0.0f) {
                i16 = (int) ((i22 * i12) / bitCount);
            } else {
                i16 = i14;
            }
            for (int i43 = i14; i43 < childCount; i43++) {
                if ((j11 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i16;
                        layoutParams4.expanded = true;
                        if (i43 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i16) / 2;
                        }
                        z16 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i16;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i16) / 2;
                        z16 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i16 / 2;
                        }
                        if (i43 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i16 / 2;
                        }
                    }
                }
            }
        }
        if (z16) {
            for (int i44 = i14; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i12) + layoutParams5.extraPixels, BasicMeasure.EXACTLY), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i15 = i13;
        } else {
            i15 = i32;
        }
        setMeasuredDimension(i20, i15);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(callback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i10) {
        boolean z9 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z9 = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        if (i10 > 0 && (childAt2 instanceof ActionMenuChildView)) {
            return ((ActionMenuChildView) childAt2).needsDividerBefore() | z9;
        }
        return z9;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending()) {
            return true;
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.mFormatItems) {
            super.onLayout(z9, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i29 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i29;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z9;
        MenuBuilder menuBuilder;
        boolean z10 = this.mFormatItems;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mFormatItems = z9;
        if (z10 != z9) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z9) {
        this.mPresenter.setExpandedActionViewsExclusive(z9);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z9) {
        this.mReserveOverflow = z9;
    }

    public void setPopupTheme(@StyleRes int i10) {
        if (this.mPopupTheme != i10) {
            this.mPopupTheme = i10;
            if (i10 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu()) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i10, int i11, boolean z9) {
            super(i10, i11);
            this.isOverflowButton = z9;
        }
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z9) {
        }
    }
}
