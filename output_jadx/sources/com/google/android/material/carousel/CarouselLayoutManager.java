package com.google.android.material.carousel;

import a3.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import e0.q1;
import j1.i;
import j3.b;
import j3.c;
import j3.d;
import j3.e;
import j3.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: b, reason: collision with root package name */
    public final h f1276b;
    public e c;
    public final View.OnLayoutChangeListener d;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        new b();
        this.d = new q1(1, this);
        this.f1276b = new h();
        requestLayout();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e);
            obtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return !l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i10) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (l()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final float k(float f8, float f10) {
        if (m()) {
            return f8 - f10;
        }
        return f8 + f10;
    }

    public final boolean l() {
        if (this.c.f3263a == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (l() && getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        h hVar = this.f1276b;
        float f8 = hVar.f3264a;
        if (f8 <= 0.0f) {
            f8 = context.getResources().getDimension(com.example.navistart.R.dimen.m3_carousel_small_item_size_min);
        }
        hVar.f3264a = f8;
        float f10 = hVar.f3265b;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(com.example.navistart.R.dimen.m3_carousel_small_item_size_max);
        }
        hVar.f3265b = f10;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (m() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (m() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r4, int r5, androidx.recyclerview.widget.RecyclerView.Recycler r6, androidx.recyclerview.widget.RecyclerView.State r7) {
        /*
            r3 = this;
            int r6 = r3.getChildCount()
            if (r6 != 0) goto L8
            goto L96
        L8:
            j3.e r6 = r3.c
            int r6 = r6.f3263a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.m()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.m()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = r3.getPosition(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.getChildAt(r6)
            int r4 = r3.getPosition(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.getItemCount()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            j3.e r4 = r3.c
            r4.d()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.m()
            if (r4 == 0) goto L86
            int r4 = r3.getChildCount()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.getChildAt(r6)
            return r4
        L8b:
            int r4 = r3.getPosition(r4)
            int r5 = r3.getItemCount()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.getChildCount()
            int r4 = r4 - r1
            android.view.View r4 = r3.getChildAt(r4)
            int r4 = r3.getPosition(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.getItemCount()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            j3.e r4 = r3.c
            r4.d()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.m()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.getChildCount()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.getChildAt(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height;
        if (state.getItemCount() > 0) {
            if (l()) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            if (height > 0.0f) {
                m();
                measureChildWithMargins(recycler.getViewForPosition(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!l() || getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        measureChildWithMargins(recycler.getViewForPosition(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!canScrollVertically() || getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        measureChildWithMargins(recycler.getViewForPosition(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i10) {
        e dVar;
        if (i10 != 0 && i10 != 1) {
            i.k(ai.onnxruntime.a.e(i10, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        e eVar = this.c;
        if (eVar != null && i10 == eVar.f3263a) {
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                dVar = new c(this);
            } else {
                i.k("invalid orientation");
                return;
            }
        } else {
            dVar = new d(this);
        }
        this.c = dVar;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i10) {
    }

    public CarouselLayoutManager() {
        h hVar = new h();
        new b();
        this.d = new q1(1, this);
        this.f1276b = hVar;
        requestLayout();
        setOrientation(0);
    }
}
