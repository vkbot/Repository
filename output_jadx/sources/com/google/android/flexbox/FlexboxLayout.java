package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import e0.s3;
import j.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o2.a;
import o2.b;
import o2.c;
import o2.d;
import o2.e;
import o2.j;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements a {

    /* renamed from: b, reason: collision with root package name */
    public int f1132b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1133f;

    /* renamed from: g, reason: collision with root package name */
    public int f1134g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f1135h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f1136i;

    /* renamed from: j, reason: collision with root package name */
    public int f1137j;

    /* renamed from: k, reason: collision with root package name */
    public int f1138k;

    /* renamed from: l, reason: collision with root package name */
    public int f1139l;

    /* renamed from: m, reason: collision with root package name */
    public int f1140m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f1141n;

    /* renamed from: o, reason: collision with root package name */
    public SparseIntArray f1142o;

    /* renamed from: p, reason: collision with root package name */
    public final s3 f1143p;

    /* renamed from: q, reason: collision with root package name */
    public List f1144q;
    public final i r;

    /* JADX WARN: Type inference failed for: r2v2, types: [j.i, java.lang.Object] */
    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1134g = -1;
        this.f1143p = new s3(this);
        this.f1144q = new ArrayList();
        this.r = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f4349a, 0, 0);
        this.f1132b = obtainStyledAttributes.getInt(5, 0);
        this.c = obtainStyledAttributes.getInt(6, 0);
        this.d = obtainStyledAttributes.getInt(7, 0);
        this.e = obtainStyledAttributes.getInt(1, 0);
        this.f1133f = obtainStyledAttributes.getInt(0, 0);
        this.f1134g = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i10 = obtainStyledAttributes.getInt(9, 0);
        if (i10 != 0) {
            this.f1138k = i10;
            this.f1137j = i10;
        }
        int i11 = obtainStyledAttributes.getInt(11, 0);
        if (i11 != 0) {
            this.f1138k = i11;
        }
        int i12 = obtainStyledAttributes.getInt(10, 0);
        if (i12 != 0) {
            this.f1137j = i12;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // o2.a
    public final void a(View view, int i10, int i11, c cVar) {
        if (p(i10, i11)) {
            boolean i12 = i();
            int i13 = cVar.e;
            if (i12) {
                int i14 = this.f1140m;
                cVar.e = i13 + i14;
                cVar.f4311f += i14;
            } else {
                int i15 = this.f1139l;
                cVar.e = i13 + i15;
                cVar.f4311f += i15;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o2.d] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f1142o == null) {
            this.f1142o = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f1142o;
        s3 s3Var = this.f1143p;
        a aVar = (a) s3Var.c;
        int flexItemCount = aVar.getFlexItemCount();
        ArrayList g10 = s3Var.g(flexItemCount);
        ?? obj = new Object();
        if (view != null && (layoutParams instanceof b)) {
            obj.c = ((b) layoutParams).getOrder();
        } else {
            obj.c = 1;
        }
        if (i10 != -1 && i10 != flexItemCount) {
            if (i10 < aVar.getFlexItemCount()) {
                obj.f4323b = i10;
                for (int i11 = i10; i11 < flexItemCount; i11++) {
                    ((d) g10.get(i11)).f4323b++;
                }
            } else {
                obj.f4323b = flexItemCount;
            }
        } else {
            obj.f4323b = flexItemCount;
        }
        g10.add(obj);
        this.f1141n = s3.t(flexItemCount + 1, g10, sparseIntArray);
        super.addView(view, i10, layoutParams);
    }

    @Override // o2.a
    public final void b(c cVar) {
        if (i()) {
            if ((this.f1138k & 4) > 0) {
                int i10 = cVar.e;
                int i11 = this.f1140m;
                cVar.e = i10 + i11;
                cVar.f4311f += i11;
                return;
            }
            return;
        }
        if ((this.f1137j & 4) > 0) {
            int i12 = cVar.e;
            int i13 = this.f1139l;
            cVar.e = i12 + i13;
            cVar.f4311f += i13;
        }
    }

    @Override // o2.a
    public final View c(int i10) {
        return o(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // o2.a
    public final int d(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // o2.a
    public final View f(int i10) {
        return getChildAt(i10);
    }

    @Override // o2.a
    public final int g(View view, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (i()) {
            if (p(i10, i11)) {
                i13 = this.f1140m;
            }
            if ((this.f1138k & 4) > 0) {
                i12 = this.f1140m;
            } else {
                return i13;
            }
        } else {
            if (p(i10, i11)) {
                i13 = this.f1139l;
            }
            if ((this.f1137j & 4) > 0) {
                i12 = this.f1139l;
            } else {
                return i13;
            }
        }
        return i13 + i12;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o2.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o2.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o2.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) eVar);
            marginLayoutParams.f4324b = 1;
            marginLayoutParams.c = 0.0f;
            marginLayoutParams.d = 1.0f;
            marginLayoutParams.e = -1;
            marginLayoutParams.f4325f = -1.0f;
            marginLayoutParams.f4326g = -1;
            marginLayoutParams.f4327h = -1;
            marginLayoutParams.f4328i = ViewCompat.MEASURED_SIZE_MASK;
            marginLayoutParams.f4329j = ViewCompat.MEASURED_SIZE_MASK;
            marginLayoutParams.f4324b = eVar.f4324b;
            marginLayoutParams.c = eVar.c;
            marginLayoutParams.d = eVar.d;
            marginLayoutParams.e = eVar.e;
            marginLayoutParams.f4325f = eVar.f4325f;
            marginLayoutParams.f4326g = eVar.f4326g;
            marginLayoutParams.f4327h = eVar.f4327h;
            marginLayoutParams.f4328i = eVar.f4328i;
            marginLayoutParams.f4329j = eVar.f4329j;
            marginLayoutParams.f4330k = eVar.f4330k;
            return marginLayoutParams;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams2.f4324b = 1;
            marginLayoutParams2.c = 0.0f;
            marginLayoutParams2.d = 1.0f;
            marginLayoutParams2.e = -1;
            marginLayoutParams2.f4325f = -1.0f;
            marginLayoutParams2.f4326g = -1;
            marginLayoutParams2.f4327h = -1;
            marginLayoutParams2.f4328i = ViewCompat.MEASURED_SIZE_MASK;
            marginLayoutParams2.f4329j = ViewCompat.MEASURED_SIZE_MASK;
            return marginLayoutParams2;
        }
        ?? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams3.f4324b = 1;
        marginLayoutParams3.c = 0.0f;
        marginLayoutParams3.d = 1.0f;
        marginLayoutParams3.e = -1;
        marginLayoutParams3.f4325f = -1.0f;
        marginLayoutParams3.f4326g = -1;
        marginLayoutParams3.f4327h = -1;
        marginLayoutParams3.f4328i = ViewCompat.MEASURED_SIZE_MASK;
        marginLayoutParams3.f4329j = ViewCompat.MEASURED_SIZE_MASK;
        return marginLayoutParams3;
    }

    @Override // o2.a
    public int getAlignContent() {
        return this.f1133f;
    }

    @Override // o2.a
    public int getAlignItems() {
        return this.e;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.f1135h;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.f1136i;
    }

    @Override // o2.a
    public int getFlexDirection() {
        return this.f1132b;
    }

    @Override // o2.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f1144q.size());
        for (c cVar : this.f1144q) {
            if (cVar.a() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // o2.a
    public List<c> getFlexLinesInternal() {
        return this.f1144q;
    }

    @Override // o2.a
    public int getFlexWrap() {
        return this.c;
    }

    public int getJustifyContent() {
        return this.d;
    }

    @Override // o2.a
    public int getLargestMainSize() {
        Iterator it = this.f1144q.iterator();
        int i10 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i10 = Math.max(i10, ((c) it.next()).e);
        }
        return i10;
    }

    @Override // o2.a
    public int getMaxLine() {
        return this.f1134g;
    }

    public int getShowDividerHorizontal() {
        return this.f1137j;
    }

    public int getShowDividerVertical() {
        return this.f1138k;
    }

    @Override // o2.a
    public int getSumOfCrossSize() {
        int i10;
        int i11;
        int size = this.f1144q.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c cVar = (c) this.f1144q.get(i13);
            if (q(i13)) {
                if (i()) {
                    i11 = this.f1139l;
                } else {
                    i11 = this.f1140m;
                }
                i12 += i11;
            }
            if (r(i13)) {
                if (i()) {
                    i10 = this.f1139l;
                } else {
                    i10 = this.f1140m;
                }
                i12 += i10;
            }
            i12 += cVar.f4312g;
        }
        return i12;
    }

    @Override // o2.a
    public final int h(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // o2.a
    public final boolean i() {
        int i10 = this.f1132b;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    @Override // o2.a
    public final int j(View view) {
        return 0;
    }

    public final void k(Canvas canvas, boolean z9, boolean z10) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f1144q.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = (c) this.f1144q.get(i12);
            for (int i13 = 0; i13 < cVar.f4313h; i13++) {
                int i14 = cVar.f4320o + i13;
                View o5 = o(i14);
                if (o5 != null && o5.getVisibility() != 8) {
                    e eVar = (e) o5.getLayoutParams();
                    if (p(i14, i13)) {
                        if (z9) {
                            left = o5.getRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                        } else {
                            left = (o5.getLeft() - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - this.f1140m;
                        }
                        n(left, cVar.f4310b, cVar.f4312g, canvas);
                    }
                    if (i13 == cVar.f4313h - 1 && (this.f1138k & 4) > 0) {
                        if (z9) {
                            right = (o5.getLeft() - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - this.f1140m;
                        } else {
                            right = o5.getRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                        }
                        n(right, cVar.f4310b, cVar.f4312g, canvas);
                    }
                }
            }
            if (q(i12)) {
                if (z10) {
                    i11 = cVar.d;
                } else {
                    i11 = cVar.f4310b - this.f1139l;
                }
                m(paddingLeft, i11, max, canvas);
            }
            if (r(i12) && (this.f1137j & 4) > 0) {
                if (z10) {
                    i10 = cVar.f4310b - this.f1139l;
                } else {
                    i10 = cVar.d;
                }
                m(paddingLeft, i10, max, canvas);
            }
        }
    }

    public final void l(Canvas canvas, boolean z9, boolean z10) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f1144q.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = (c) this.f1144q.get(i12);
            for (int i13 = 0; i13 < cVar.f4313h; i13++) {
                int i14 = cVar.f4320o + i13;
                View o5 = o(i14);
                if (o5 != null && o5.getVisibility() != 8) {
                    e eVar = (e) o5.getLayoutParams();
                    if (p(i14, i13)) {
                        if (z10) {
                            top = o5.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        } else {
                            top = (o5.getTop() - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - this.f1139l;
                        }
                        m(cVar.f4309a, top, cVar.f4312g, canvas);
                    }
                    if (i13 == cVar.f4313h - 1 && (this.f1137j & 4) > 0) {
                        if (z10) {
                            bottom = (o5.getTop() - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - this.f1139l;
                        } else {
                            bottom = o5.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        }
                        m(cVar.f4309a, bottom, cVar.f4312g, canvas);
                    }
                }
            }
            if (q(i12)) {
                if (z9) {
                    i11 = cVar.c;
                } else {
                    i11 = cVar.f4309a - this.f1140m;
                }
                n(i11, paddingTop, max, canvas);
            }
            if (r(i12) && (this.f1138k & 4) > 0) {
                if (z9) {
                    i10 = cVar.f4309a - this.f1140m;
                } else {
                    i10 = cVar.c;
                }
                n(i10, paddingTop, max, canvas);
            }
        }
    }

    public final void m(int i10, int i11, int i12, Canvas canvas) {
        Drawable drawable = this.f1135h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f1139l + i11);
        this.f1135h.draw(canvas);
    }

    public final void n(int i10, int i11, int i12, Canvas canvas) {
        Drawable drawable = this.f1136i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f1140m + i10, i12 + i11);
        this.f1136i.draw(canvas);
    }

    public final View o(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.f1141n;
            if (i10 < iArr.length) {
                return getChildAt(iArr[i10]);
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9;
        boolean z10;
        if (this.f1136i != null || this.f1135h != null) {
            if (this.f1137j != 0 || this.f1138k != 0) {
                int layoutDirection = ViewCompat.getLayoutDirection(this);
                int i10 = this.f1132b;
                boolean z11 = false;
                boolean z12 = true;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return;
                            }
                            if (layoutDirection == 1) {
                                z11 = true;
                            }
                            if (this.c == 2) {
                                z11 = !z11;
                            }
                            l(canvas, z11, true);
                            return;
                        }
                        if (layoutDirection != 1) {
                            z12 = false;
                        }
                        if (this.c == 2) {
                            z12 = !z12;
                        }
                        l(canvas, z12, false);
                        return;
                    }
                    if (layoutDirection != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.c == 2) {
                        z11 = true;
                    }
                    k(canvas, z10, z11);
                    return;
                }
                if (layoutDirection == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.c == 2) {
                    z11 = true;
                }
                k(canvas, z9, z11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i14 = this.f1132b;
        boolean z12 = false;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (layoutDirection == 1) {
                            z12 = true;
                        }
                        if (this.c == 2) {
                            z12 = !z12;
                        }
                        t(i10, i11, i12, i13, z12, true);
                        return;
                    }
                    ai.onnxruntime.b.b(this.f1132b, "Invalid flex direction is set: ");
                    return;
                }
                boolean z13 = false;
                if (layoutDirection == 1) {
                    z13 = true;
                }
                if (this.c == 2) {
                    z13 = !z13;
                }
                t(i10, i11, i12, i13, z13, false);
                return;
            }
            if (layoutDirection != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            s(i10, i11, i12, i13, z11);
            return;
        }
        if (layoutDirection == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        s(i10, i11, i12, i13, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    public final boolean p(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View o5 = o(i10 - i12);
            if (o5 != null && o5.getVisibility() != 8) {
                if (i()) {
                    if ((this.f1138k & 2) != 0) {
                        return true;
                    }
                    return false;
                }
                if ((this.f1137j & 2) != 0) {
                    return true;
                }
                return false;
            }
        }
        if (i()) {
            if ((this.f1138k & 1) != 0) {
                return true;
            }
            return false;
        }
        if ((this.f1137j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        if (i10 >= 0 && i10 < this.f1144q.size()) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (((c) this.f1144q.get(i11)).a() > 0) {
                    if (i()) {
                        if ((this.f1137j & 2) == 0) {
                            return false;
                        }
                        return true;
                    }
                    if ((this.f1138k & 2) == 0) {
                        return false;
                    }
                    return true;
                }
            }
            if (i()) {
                if ((this.f1137j & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f1138k & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i10) {
        if (i10 >= 0 && i10 < this.f1144q.size()) {
            for (int i11 = i10 + 1; i11 < this.f1144q.size(); i11++) {
                if (((c) this.f1144q.get(i11)).a() > 0) {
                    return false;
                }
            }
            if (i()) {
                if ((this.f1137j & 4) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f1138k & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r25, int r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.s(int, int, int, int, boolean):void");
    }

    public void setAlignContent(int i10) {
        if (this.f1133f != i10) {
            this.f1133f = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.e != i10) {
            this.e = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f1135h) {
            return;
        }
        this.f1135h = drawable;
        if (drawable != null) {
            this.f1139l = drawable.getIntrinsicHeight();
        } else {
            this.f1139l = 0;
        }
        if (this.f1135h == null && this.f1136i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.f1136i) {
            return;
        }
        this.f1136i = drawable;
        if (drawable != null) {
            this.f1140m = drawable.getIntrinsicWidth();
        } else {
            this.f1140m = 0;
        }
        if (this.f1135h == null && this.f1136i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f1132b != i10) {
            this.f1132b = i10;
            requestLayout();
        }
    }

    @Override // o2.a
    public void setFlexLines(List<c> list) {
        this.f1144q = list;
    }

    public void setFlexWrap(int i10) {
        if (this.c != i10) {
            this.c = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.d != i10) {
            this.d = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f1134g != i10) {
            this.f1134g = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f1137j) {
            this.f1137j = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f1138k) {
            this.f1138k = i10;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(int r25, int r26, int r27, int r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(int, int, int, int, boolean, boolean):void");
    }

    public final void u(int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                j1.i.k(ai.onnxruntime.a.e(i10, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i13 = View.combineMeasuredStates(i13, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
                } else {
                    j1.i.l(ai.onnxruntime.a.e(mode, "Unknown width mode is set: "));
                    return;
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
            }
        } else {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < paddingBottom) {
                        i13 = View.combineMeasuredStates(i13, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
                } else {
                    j1.i.l(ai.onnxruntime.a.e(mode2, "Unknown height mode is set: "));
                    return;
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i12, i13);
            }
        } else {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    @Override // o2.a
    public final void e(int i10, View view) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o2.e] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f4324b = 1;
        marginLayoutParams.c = 0.0f;
        marginLayoutParams.d = 1.0f;
        marginLayoutParams.e = -1;
        marginLayoutParams.f4325f = -1.0f;
        marginLayoutParams.f4326g = -1;
        marginLayoutParams.f4327h = -1;
        marginLayoutParams.f4328i = ViewCompat.MEASURED_SIZE_MASK;
        marginLayoutParams.f4329j = ViewCompat.MEASURED_SIZE_MASK;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f4350b);
        marginLayoutParams.f4324b = obtainStyledAttributes.getInt(8, 1);
        marginLayoutParams.c = obtainStyledAttributes.getFloat(2, 0.0f);
        marginLayoutParams.d = obtainStyledAttributes.getFloat(3, 1.0f);
        marginLayoutParams.e = obtainStyledAttributes.getInt(0, -1);
        marginLayoutParams.f4325f = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        marginLayoutParams.f4326g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        marginLayoutParams.f4327h = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        marginLayoutParams.f4328i = obtainStyledAttributes.getDimensionPixelSize(5, ViewCompat.MEASURED_SIZE_MASK);
        marginLayoutParams.f4329j = obtainStyledAttributes.getDimensionPixelSize(4, ViewCompat.MEASURED_SIZE_MASK);
        marginLayoutParams.f4330k = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }
}
