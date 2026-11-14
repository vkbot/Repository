package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import b1.u;
import c5.e;
import com.example.navistart.R;
import d4.c;
import d4.d;
import d4.f;
import d4.h;
import d4.i;
import d4.j;
import d4.m;
import g4.a;
import java.util.ArrayList;
import java.util.Iterator;
import s3.l;
import s3.q;
import w3.b;
import z3.k;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
@ViewPager.DecorView
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: b0, reason: collision with root package name */
    public static final Pools.SynchronizedPool f1420b0 = new Pools.SynchronizedPool(16);
    public final int A;
    public int B;
    public final int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public e K;
    public final TimeInterpolator L;
    public d M;
    public final ArrayList N;
    public m O;
    public ValueAnimator P;
    public ViewPager Q;
    public PagerAdapter R;
    public f S;
    public j T;
    public c U;
    public boolean V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public final Pools.SimplePool f1421a0;

    /* renamed from: b, reason: collision with root package name */
    public int f1422b;
    public final ArrayList c;
    public i d;
    public final h e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1423f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1424g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1425h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1426i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1427j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1428k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1429l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f1430m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f1431n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f1432o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1433p;

    /* renamed from: q, reason: collision with root package name */
    public int f1434q;
    public final PorterDuff.Mode r;

    /* renamed from: s, reason: collision with root package name */
    public final float f1435s;
    public final float t;

    /* renamed from: u, reason: collision with root package name */
    public final float f1436u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1437v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1438x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1439y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1440z;

    public TabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f1422b = -1;
        this.c = new ArrayList();
        this.f1429l = -1;
        this.f1434q = 0;
        this.w = Integer.MAX_VALUE;
        this.H = -1;
        this.N = new ArrayList();
        this.f1421a0 = new Pools.SimplePool(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(this, context2);
        this.e = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d = l.d(context2, attributeSet, a3.a.J, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList d10 = o3.c.d(getBackground());
        if (d10 != null) {
            k kVar = new k();
            kVar.q(d10);
            kVar.m(context2);
            kVar.p(getElevation());
            setBackground(kVar);
        }
        setSelectedTabIndicator(w3.c.c(context2, d, 5));
        setSelectedTabIndicatorColor(d.getColor(8, 0));
        hVar.b(d.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d.getInt(10, 0));
        setTabIndicatorAnimationMode(d.getInt(7, 0));
        setTabIndicatorFullWidth(d.getBoolean(9, true));
        int dimensionPixelSize = d.getDimensionPixelSize(16, 0);
        this.f1426i = dimensionPixelSize;
        this.f1425h = dimensionPixelSize;
        this.f1424g = dimensionPixelSize;
        this.f1423f = dimensionPixelSize;
        this.f1423f = d.getDimensionPixelSize(19, dimensionPixelSize);
        this.f1424g = d.getDimensionPixelSize(20, dimensionPixelSize);
        this.f1425h = d.getDimensionPixelSize(18, dimensionPixelSize);
        this.f1426i = d.getDimensionPixelSize(17, dimensionPixelSize);
        if (b.b(context2, R.attr.isMaterial3Theme, false)) {
            this.f1427j = R.attr.textAppearanceTitleSmall;
        } else {
            this.f1427j = R.attr.textAppearanceButton;
        }
        int resourceId = d.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f1428k = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, androidx.appcompat.R.styleable.TextAppearance);
        try {
            this.f1435s = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.f1430m = w3.c.a(context2, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (d.hasValue(22)) {
                this.f1429l = d.getResourceId(22, resourceId);
            }
            int i10 = this.f1429l;
            if (i10 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i10, androidx.appcompat.R.styleable.TextAppearance);
                try {
                    this.t = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, (int) r5);
                    ColorStateList a10 = w3.c.a(context2, obtainStyledAttributes, androidx.appcompat.R.styleable.TextAppearance_android_textColor);
                    if (a10 != null) {
                        this.f1430m = g(this.f1430m.getDefaultColor(), a10.getColorForState(new int[]{android.R.attr.state_selected}, a10.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (d.hasValue(25)) {
                this.f1430m = w3.c.a(context2, d, 25);
            }
            if (d.hasValue(23)) {
                this.f1430m = g(this.f1430m.getDefaultColor(), d.getColor(23, 0));
            }
            this.f1431n = w3.c.a(context2, d, 3);
            this.r = q.b(d.getInt(4, -1), null);
            this.f1432o = w3.c.a(context2, d, 21);
            this.C = d.getInt(6, 300);
            this.L = com.bumptech.glide.d.r(context2, R.attr.motionEasingEmphasizedInterpolator, b3.a.f341b);
            this.f1438x = d.getDimensionPixelSize(14, -1);
            this.f1439y = d.getDimensionPixelSize(13, -1);
            this.f1437v = d.getResourceId(0, 0);
            this.A = d.getDimensionPixelSize(1, 0);
            this.E = d.getInt(15, 1);
            this.B = d.getInt(2, 0);
            this.F = d.getBoolean(12, false);
            this.J = d.getBoolean(26, false);
            d.recycle();
            Resources resources = getResources();
            this.f1436u = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f1440z = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    public static ColorStateList g(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    @Dimension(unit = 0)
    private int getDefaultHeight() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) arrayList.get(i10);
            if (iVar != null && iVar.f1806b != null && !TextUtils.isEmpty(iVar.c)) {
                if (!this.F) {
                    return 72;
                }
                return 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f1438x;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.E;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.f1440z;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.e.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        boolean z9;
        boolean z10;
        h hVar = this.e;
        int childCount = hVar.getChildCount();
        if (i10 < childCount) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = hVar.getChildAt(i11);
                boolean z11 = true;
                if ((i11 == i10 && !childAt.isSelected()) || (i11 != i10 && childAt.isSelected())) {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 != i10) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                    if (childAt instanceof d4.l) {
                        ((d4.l) childAt).g();
                    }
                } else {
                    if (i11 == i10) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    childAt.setSelected(z9);
                    if (i11 != i10) {
                        z11 = false;
                    }
                    childAt.setActivated(z11);
                }
            }
        }
    }

    public final void a(d dVar) {
        ArrayList arrayList = this.N;
        if (!arrayList.contains(dVar)) {
            arrayList.add(dVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(i iVar, boolean z9) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        if (iVar.f1808g == this) {
            iVar.e = size;
            arrayList.add(size, iVar);
            int size2 = arrayList.size();
            int i10 = -1;
            for (int i11 = size + 1; i11 < size2; i11++) {
                if (((i) arrayList.get(i11)).e == this.f1422b) {
                    i10 = i11;
                }
                ((i) arrayList.get(i11)).e = i11;
            }
            this.f1422b = i10;
            d4.l lVar = iVar.f1809h;
            lVar.setSelected(false);
            lVar.setActivated(false);
            int i12 = iVar.e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.E == 1 && this.B == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            this.e.addView(lVar, i12, layoutParams);
            if (z9) {
                TabLayout tabLayout = iVar.f1808g;
                if (tabLayout != null) {
                    tabLayout.l(iVar, true);
                    return;
                } else {
                    j1.i.k("Tab not attached to a TabLayout");
                    return;
                }
            }
            return;
        }
        j1.i.k("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            i i10 = i();
            CharSequence charSequence = tabItem.f1419b;
            if (charSequence != null) {
                i10.a(charSequence);
            }
            Drawable drawable = tabItem.c;
            if (drawable != null) {
                i10.f1806b = drawable;
                TabLayout tabLayout = i10.f1808g;
                if (tabLayout.B == 1 || tabLayout.E == 2) {
                    tabLayout.p(true);
                }
                d4.l lVar = i10.f1809h;
                if (lVar != null) {
                    lVar.e();
                }
            }
            int i11 = tabItem.d;
            if (i11 != 0) {
                i10.f1807f = LayoutInflater.from(i10.f1809h.getContext()).inflate(i11, (ViewGroup) i10.f1809h, false);
                d4.l lVar2 = i10.f1809h;
                if (lVar2 != null) {
                    lVar2.e();
                }
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                i10.d = tabItem.getContentDescription();
                d4.l lVar3 = i10.f1809h;
                if (lVar3 != null) {
                    lVar3.e();
                }
            }
            b(i10, this.c.isEmpty());
            return;
        }
        j1.i.k("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            h hVar = this.e;
            int childCount = hVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (hVar.getChildAt(i11).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int f8 = f(i10, 0.0f);
            if (scrollX != f8) {
                h();
                this.P.setIntValues(scrollX, f8);
                this.P.start();
            }
            ValueAnimator valueAnimator = (ValueAnimator) hVar.c;
            if (valueAnimator != null && valueAnimator.isRunning() && ((TabLayout) hVar.d).f1422b != i10) {
                ((ValueAnimator) hVar.c).cancel();
            }
            hVar.d(i10, this.C, true);
            return;
        }
        n(i10, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.E
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.A
            int r3 = r5.f1423f
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            d4.h r3 = r5.e
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.E
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 == r4) goto L25
            if (r0 == r1) goto L25
            goto L4a
        L25:
            int r0 = r5.B
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            r3.setGravity(r4)
            goto L4a
        L32:
            int r0 = r5.B
            if (r0 == 0) goto L3f
            if (r0 == r4) goto L3b
            if (r0 == r1) goto L44
            goto L4a
        L3b:
            r3.setGravity(r4)
            goto L4a
        L3f:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L44:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4a:
            r5.p(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(int i10, float f8) {
        h hVar;
        View childAt;
        View view;
        int i11 = this.E;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = (hVar = this.e).getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < hVar.getChildCount()) {
            view = hVar.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + i12) * 0.5f * f8);
        if (getLayoutDirection() == 0) {
            return left + i14;
        }
        return left - i14;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        i iVar = this.d;
        if (iVar != null) {
            return iVar.e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.c.size();
    }

    public int getTabGravity() {
        return this.B;
    }

    @Nullable
    public ColorStateList getTabIconTint() {
        return this.f1431n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.I;
    }

    public int getTabIndicatorGravity() {
        return this.D;
    }

    public int getTabMaxWidth() {
        return this.w;
    }

    public int getTabMode() {
        return this.E;
    }

    @Nullable
    public ColorStateList getTabRippleColor() {
        return this.f1432o;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f1433p;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.f1430m;
    }

    public final void h() {
        if (this.P == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P = valueAnimator;
            valueAnimator.setInterpolator(this.L);
            this.P.setDuration(this.C);
            this.P.addUpdateListener(new d4.b(0, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [d4.i, java.lang.Object] */
    public final i i() {
        d4.l lVar;
        i iVar = (i) f1420b0.acquire();
        i iVar2 = iVar;
        if (iVar == null) {
            ?? obj = new Object();
            obj.e = -1;
            iVar2 = obj;
        }
        iVar2.f1808g = this;
        Pools.SimplePool simplePool = this.f1421a0;
        if (simplePool != null) {
            lVar = (d4.l) simplePool.acquire();
        } else {
            lVar = null;
        }
        if (lVar == null) {
            lVar = new d4.l(this, getContext());
        }
        lVar.setTab(iVar2);
        lVar.setFocusable(true);
        lVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar2.d)) {
            lVar.setContentDescription(iVar2.c);
        } else {
            lVar.setContentDescription(iVar2.d);
        }
        iVar2.f1809h = lVar;
        return iVar2;
    }

    public final void j() {
        int currentItem;
        i iVar;
        k();
        PagerAdapter pagerAdapter = this.R;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                i i11 = i();
                i11.a(this.R.getPageTitle(i10));
                b(i11, false);
            }
            ViewPager viewPager = this.Q;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                if (currentItem >= 0 && currentItem < getTabCount()) {
                    iVar = (i) this.c.get(currentItem);
                } else {
                    iVar = null;
                }
                l(iVar, true);
            }
        }
    }

    public final void k() {
        h hVar = this.e;
        int childCount = hVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            d4.l lVar = (d4.l) hVar.getChildAt(childCount);
            hVar.removeViewAt(childCount);
            if (lVar != null) {
                lVar.setTab(null);
                lVar.setSelected(false);
                this.f1421a0.release(lVar);
            }
            requestLayout();
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            it.remove();
            iVar.f1808g = null;
            iVar.f1809h = null;
            iVar.f1805a = null;
            iVar.f1806b = null;
            iVar.c = null;
            iVar.d = null;
            iVar.e = -1;
            iVar.f1807f = null;
            f1420b0.release(iVar);
        }
        this.d = null;
    }

    public final void l(i iVar, boolean z9) {
        int i10;
        TabLayout tabLayout;
        i iVar2 = this.d;
        ArrayList arrayList = this.N;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((d) arrayList.get(size)).getClass();
                }
                d(iVar.e);
                return;
            }
            return;
        }
        if (iVar != null) {
            i10 = iVar.e;
        } else {
            i10 = -1;
        }
        if (z9) {
            if ((iVar2 != null && iVar2.e != -1) || i10 == -1) {
                tabLayout = this;
                d(i10);
            } else {
                tabLayout = this;
                tabLayout.n(i10, 0.0f, true, true, true);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.d = iVar;
        if (iVar2 != null && iVar2.f1808g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((d) arrayList.get(size2)).getClass();
            }
        }
        if (iVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((d) arrayList.get(size3)).a(iVar);
            }
        }
    }

    public final void m(PagerAdapter pagerAdapter, boolean z9) {
        f fVar;
        PagerAdapter pagerAdapter2 = this.R;
        if (pagerAdapter2 != null && (fVar = this.S) != null) {
            pagerAdapter2.unregisterDataSetObserver(fVar);
        }
        this.R = pagerAdapter;
        if (z9 && pagerAdapter != null) {
            if (this.S == null) {
                this.S = new f(this);
            }
            pagerAdapter.registerDataSetObserver(this.S);
        }
        j();
    }

    public final void n(int i10, float f8, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        float f10 = i10 + f8;
        int round = Math.round(f10);
        if (round >= 0) {
            h hVar = this.e;
            if (round < hVar.getChildCount()) {
                if (z10) {
                    ((TabLayout) hVar.d).f1422b = Math.round(f10);
                    ValueAnimator valueAnimator = (ValueAnimator) hVar.c;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        ((ValueAnimator) hVar.c).cancel();
                    }
                    hVar.c(hVar.getChildAt(i10), hVar.getChildAt(i10 + 1), f8);
                }
                ValueAnimator valueAnimator2 = this.P;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.P.cancel();
                }
                int f11 = f(i10, f8);
                int scrollX = getScrollX();
                if ((i10 < getSelectedTabPosition() && f11 >= scrollX) || ((i10 > getSelectedTabPosition() && f11 <= scrollX) || i10 == getSelectedTabPosition())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (getLayoutDirection() == 1) {
                    if ((i10 < getSelectedTabPosition() && f11 <= scrollX) || ((i10 > getSelectedTabPosition() && f11 >= scrollX) || i10 == getSelectedTabPosition())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (z12 || this.W == 1 || z11) {
                    if (i10 < 0) {
                        f11 = 0;
                    }
                    scrollTo(f11, 0);
                }
                if (z9) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z9) {
        TabLayout tabLayout;
        ViewPager viewPager2 = this.Q;
        if (viewPager2 != null) {
            j jVar = this.T;
            if (jVar != null) {
                viewPager2.removeOnPageChangeListener(jVar);
            }
            c cVar = this.U;
            if (cVar != null) {
                this.Q.removeOnAdapterChangeListener(cVar);
            }
        }
        m mVar = this.O;
        if (mVar != null) {
            this.N.remove(mVar);
            this.O = null;
        }
        if (viewPager != null) {
            this.Q = viewPager;
            if (this.T == null) {
                this.T = new j(this);
            }
            j jVar2 = this.T;
            jVar2.c = 0;
            jVar2.f1811b = 0;
            viewPager.addOnPageChangeListener(jVar2);
            m mVar2 = new m(0, viewPager);
            this.O = mVar2;
            a(mVar2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, true);
            }
            if (this.U == null) {
                this.U = new c(this);
            }
            c cVar2 = this.U;
            cVar2.f1799a = true;
            viewPager.addOnAdapterChangeListener(cVar2);
            tabLayout = this;
            tabLayout.n(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.Q = null;
            m(null, false);
        }
        tabLayout.V = z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof k) {
            u.w(this, (k) background);
        }
        if (this.Q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            setupWithViewPager(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        d4.l lVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            h hVar = this.e;
            if (i10 < hVar.getChildCount()) {
                View childAt = hVar.getChildAt(i10);
                if ((childAt instanceof d4.l) && (drawable = (lVar = (d4.l) childAt).f1820j) != null) {
                    drawable.setBounds(lVar.getLeft(), lVar.getTop(), lVar.getRight(), lVar.getBottom());
                    lVar.f1820j.draw(canvas);
                }
                i10++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int round = Math.round(q.a(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, BasicMeasure.EXACTLY);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.f1439y;
            if (i12 <= 0) {
                i12 = (int) (size - q.a(56, getContext()));
            }
            this.w = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.E;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(boolean z9) {
        int i10 = 0;
        while (true) {
            h hVar = this.e;
            if (i10 < hVar.getChildCount()) {
                View childAt = hVar.getChildAt(i10);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.E == 1 && this.B == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                if (z9) {
                    childAt.requestLayout();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof k) {
            ((k) background).p(f8);
        }
    }

    public void setInlineLabel(boolean z9) {
        if (this.F != z9) {
            this.F = z9;
            int i10 = 0;
            while (true) {
                h hVar = this.e;
                if (i10 < hVar.getChildCount()) {
                    View childAt = hVar.getChildAt(i10);
                    if (childAt instanceof d4.l) {
                        d4.l lVar = (d4.l) childAt;
                        lVar.setOrientation(!lVar.f1822l.F ? 1 : 0);
                        TextView textView = lVar.f1818h;
                        if (textView == null && lVar.f1819i == null) {
                            lVar.h(lVar.c, lVar.d, true);
                        } else {
                            lVar.h(textView, lVar.f1819i, false);
                        }
                    }
                    i10++;
                } else {
                    e();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(@BoolRes int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable d dVar) {
        d dVar2 = this.M;
        if (dVar2 != null) {
            this.N.remove(dVar2);
        }
        this.M = dVar;
        if (dVar != null) {
            a(dVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        h();
        this.P.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@Nullable Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        this.f1433p = mutate;
        int i10 = this.f1434q;
        if (i10 != 0) {
            mutate.setTint(i10);
        } else {
            mutate.setTintList(null);
        }
        int i11 = this.H;
        if (i11 == -1) {
            i11 = this.f1433p.getIntrinsicHeight();
        }
        this.e.b(i11);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i10) {
        this.f1434q = i10;
        Drawable drawable = this.f1433p;
        if (i10 != 0) {
            drawable.setTint(i10);
        } else {
            drawable.setTintList(null);
        }
        p(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.D != i10) {
            this.D = i10;
            this.e.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.H = i10;
        this.e.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            e();
        }
    }

    public void setTabIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f1431n != colorStateList) {
            this.f1431n = colorStateList;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d4.l lVar = ((i) arrayList.get(i10)).f1809h;
                if (lVar != null) {
                    lVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(@ColorRes int i10) {
        setTabIconTint(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.I = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.K = new d4.a(1);
                    return;
                }
                throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
            }
            this.K = new d4.a(0);
            return;
        }
        this.K = new e(4);
    }

    public void setTabIndicatorFullWidth(boolean z9) {
        this.G = z9;
        int i10 = h.e;
        h hVar = this.e;
        hVar.a(((TabLayout) hVar.d).getSelectedTabPosition());
        hVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            e();
        }
    }

    public void setTabRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f1432o != colorStateList) {
            this.f1432o = colorStateList;
            int i10 = 0;
            while (true) {
                h hVar = this.e;
                if (i10 < hVar.getChildCount()) {
                    View childAt = hVar.getChildAt(i10);
                    if (childAt instanceof d4.l) {
                        Context context = getContext();
                        int i11 = d4.l.f1814m;
                        ((d4.l) childAt).f(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(@ColorRes int i10) {
        setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.f1430m != colorStateList) {
            this.f1430m = colorStateList;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d4.l lVar = ((i) arrayList.get(i10)).f1809h;
                if (lVar != null) {
                    lVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        m(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
            int i10 = 0;
            while (true) {
                h hVar = this.e;
                if (i10 < hVar.getChildCount()) {
                    View childAt = hVar.getChildAt(i10);
                    if (childAt instanceof d4.l) {
                        Context context = getContext();
                        int i11 = d4.l.f1814m;
                        ((d4.l) childAt).f(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(@BoolRes int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        o(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable d4.e eVar) {
        setOnTabSelectedListener((d) eVar);
    }

    public void setSelectedTabIndicator(@DrawableRes int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
