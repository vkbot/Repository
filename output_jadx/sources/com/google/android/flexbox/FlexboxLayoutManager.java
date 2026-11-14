package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import e0.s3;
import java.util.ArrayList;
import java.util.List;
import o2.a;
import o2.c;
import o2.f;
import o2.g;
import o2.h;
import o2.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements a, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: z, reason: collision with root package name */
    public static final Rect f1145z = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public int f1146b;
    public final int c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1147f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1148g;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView.Recycler f1151j;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView.State f1152k;

    /* renamed from: l, reason: collision with root package name */
    public h f1153l;

    /* renamed from: m, reason: collision with root package name */
    public final f f1154m;

    /* renamed from: n, reason: collision with root package name */
    public OrientationHelper f1155n;

    /* renamed from: o, reason: collision with root package name */
    public OrientationHelper f1156o;

    /* renamed from: p, reason: collision with root package name */
    public i f1157p;

    /* renamed from: q, reason: collision with root package name */
    public int f1158q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f1159s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f1160u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f1161v;
    public View w;

    /* renamed from: x, reason: collision with root package name */
    public int f1162x;

    /* renamed from: y, reason: collision with root package name */
    public final j.i f1163y;
    public final int e = -1;

    /* renamed from: h, reason: collision with root package name */
    public List f1149h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final s3 f1150i = new s3(this);

    /* JADX WARN: Type inference failed for: r0v1, types: [j.i, java.lang.Object] */
    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        f fVar = new f(this);
        this.f1154m = fVar;
        this.f1158q = -1;
        this.r = Integer.MIN_VALUE;
        this.f1159s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.f1160u = new SparseArray();
        this.f1162x = -1;
        this.f1163y = new Object();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i10, i11);
        int i12 = properties.orientation;
        if (i12 != 0) {
            if (i12 == 1) {
                if (properties.reverseLayout) {
                    w(3);
                } else {
                    w(2);
                }
            }
        } else if (properties.reverseLayout) {
            w(1);
        } else {
            w(0);
        }
        int i13 = this.c;
        if (i13 != 1) {
            if (i13 == 0) {
                removeAllViews();
                this.f1149h.clear();
                f.b(fVar);
                fVar.d = 0;
            }
            this.c = 1;
            this.f1155n = null;
            this.f1156o = null;
            requestLayout();
        }
        if (this.d != 4) {
            removeAllViews();
            this.f1149h.clear();
            f.b(fVar);
            fVar.d = 0;
            this.d = 4;
            requestLayout();
        }
        this.f1161v = context;
    }

    public static boolean isMeasurementUpToDate(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        }
        if (size < i10) {
            return false;
        }
        return true;
    }

    public final void A(f fVar, boolean z9, boolean z10) {
        if (z10) {
            v();
        } else {
            this.f1153l.f4343b = false;
        }
        if (!i() && this.f1147f) {
            this.f1153l.f4342a = (this.w.getWidth() - fVar.c) - this.f1155n.getStartAfterPadding();
        } else {
            this.f1153l.f4342a = fVar.c - this.f1155n.getStartAfterPadding();
        }
        h hVar = this.f1153l;
        hVar.d = fVar.f4331a;
        hVar.f4346h = -1;
        hVar.e = fVar.c;
        hVar.f4344f = Integer.MIN_VALUE;
        int i10 = fVar.f4332b;
        hVar.c = i10;
        if (z9 && i10 > 0) {
            int size = this.f1149h.size();
            int i11 = fVar.f4332b;
            if (size > i11) {
                c cVar = (c) this.f1149h.get(i11);
                r4.c--;
                this.f1153l.d -= cVar.f4313h;
            }
        }
    }

    @Override // o2.a
    public final void a(View view, int i10, int i11, c cVar) {
        calculateItemDecorationsForChild(view, f1145z);
        if (i()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            cVar.e += rightDecorationWidth;
            cVar.f4311f += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        cVar.e += bottomDecorationHeight;
        cVar.f4311f += bottomDecorationHeight;
    }

    @Override // o2.a
    public final View c(int i10) {
        return f(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        int i10;
        if (this.c == 0) {
            return i();
        }
        if (i()) {
            int width = getWidth();
            View view = this.w;
            if (view != null) {
                i10 = view.getWidth();
            } else {
                i10 = 0;
            }
            if (width <= i10) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        int i10;
        if (this.c == 0) {
            return !i();
        }
        if (!i()) {
            int height = getHeight();
            View view = this.w;
            if (view != null) {
                i10 = view.getHeight();
            } else {
                i10 = 0;
            }
            if (height <= i10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        k();
        View m10 = m(itemCount);
        View o5 = o(itemCount);
        if (state.getItemCount() == 0 || m10 == null || o5 == null) {
            return 0;
        }
        return Math.min(this.f1155n.getTotalSpace(), this.f1155n.getDecoratedEnd(o5) - this.f1155n.getDecoratedStart(m10));
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View m10 = m(itemCount);
        View o5 = o(itemCount);
        if (state.getItemCount() != 0 && m10 != null && o5 != null) {
            int position = getPosition(m10);
            int position2 = getPosition(o5);
            int abs = Math.abs(this.f1155n.getDecoratedEnd(o5) - this.f1155n.getDecoratedStart(m10));
            int i10 = ((int[]) this.f1150i.e)[position];
            if (i10 != 0 && i10 != -1) {
                return Math.round((i10 * (abs / ((r4[position2] - i10) + 1))) + (this.f1155n.getStartAfterPadding() - this.f1155n.getDecoratedStart(m10)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.State state) {
        int position;
        if (getChildCount() != 0) {
            int itemCount = state.getItemCount();
            View m10 = m(itemCount);
            View o5 = o(itemCount);
            if (state.getItemCount() != 0 && m10 != null && o5 != null) {
                View q8 = q(0, getChildCount());
                int i10 = -1;
                if (q8 == null) {
                    position = -1;
                } else {
                    position = getPosition(q8);
                }
                View q9 = q(getChildCount() - 1, -1);
                if (q9 != null) {
                    i10 = getPosition(q9);
                }
                return (int) ((Math.abs(this.f1155n.getDecoratedEnd(o5) - this.f1155n.getDecoratedStart(m10)) / ((i10 - position) + 1)) * state.getItemCount());
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i10) {
        View childAt;
        int i11;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        if (i10 < getPosition(childAt)) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        if (i()) {
            return new PointF(0.0f, i11);
        }
        return new PointF(i11, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // o2.a
    public final int d(int i10, int i11, int i12) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i11, i12, canScrollHorizontally());
    }

    @Override // o2.a
    public final void e(int i10, View view) {
        this.f1160u.put(i10, view);
    }

    @Override // o2.a
    public final View f(int i10) {
        View view = (View) this.f1160u.get(i10);
        if (view != null) {
            return view;
        }
        return this.f1151j.getViewForPosition(i10);
    }

    public final int fixLayoutEndGap(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z9) {
        int i11;
        int endAfterPadding;
        if (!i() && this.f1147f) {
            int startAfterPadding = i10 - this.f1155n.getStartAfterPadding();
            if (startAfterPadding > 0) {
                i11 = s(startAfterPadding, recycler, state);
            } else {
                return 0;
            }
        } else {
            int endAfterPadding2 = this.f1155n.getEndAfterPadding() - i10;
            if (endAfterPadding2 > 0) {
                i11 = -s(-endAfterPadding2, recycler, state);
            } else {
                return 0;
            }
        }
        int i12 = i10 + i11;
        if (z9 && (endAfterPadding = this.f1155n.getEndAfterPadding() - i12) > 0) {
            this.f1155n.offsetChildren(endAfterPadding);
            return endAfterPadding + i11;
        }
        return i11;
    }

    public final int fixLayoutStartGap(int i10, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z9) {
        int i11;
        int startAfterPadding;
        if (!i() && this.f1147f) {
            int endAfterPadding = this.f1155n.getEndAfterPadding() - i10;
            if (endAfterPadding > 0) {
                i11 = s(-endAfterPadding, recycler, state);
            } else {
                return 0;
            }
        } else {
            int startAfterPadding2 = i10 - this.f1155n.getStartAfterPadding();
            if (startAfterPadding2 > 0) {
                i11 = -s(startAfterPadding2, recycler, state);
            } else {
                return 0;
            }
        }
        int i12 = i10 + i11;
        if (z9 && (startAfterPadding = i12 - this.f1155n.getStartAfterPadding()) > 0) {
            this.f1155n.offsetChildren(-startAfterPadding);
            return i11 - startAfterPadding;
        }
        return i11;
    }

    @Override // o2.a
    public final int g(View view, int i10, int i11) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (i()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutParams, o2.g] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new RecyclerView.LayoutParams(-2, -2);
        layoutParams.f4336b = 0.0f;
        layoutParams.c = 1.0f;
        layoutParams.d = -1;
        layoutParams.e = -1.0f;
        layoutParams.f4339h = ViewCompat.MEASURED_SIZE_MASK;
        layoutParams.f4340i = ViewCompat.MEASURED_SIZE_MASK;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutParams, o2.g] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ?? layoutParams = new RecyclerView.LayoutParams(context, attributeSet);
        layoutParams.f4336b = 0.0f;
        layoutParams.c = 1.0f;
        layoutParams.d = -1;
        layoutParams.e = -1.0f;
        layoutParams.f4339h = ViewCompat.MEASURED_SIZE_MASK;
        layoutParams.f4340i = ViewCompat.MEASURED_SIZE_MASK;
        return layoutParams;
    }

    @Override // o2.a
    public final int getAlignContent() {
        return 5;
    }

    @Override // o2.a
    public final int getAlignItems() {
        return this.d;
    }

    @Override // o2.a
    public final int getFlexDirection() {
        return this.f1146b;
    }

    @Override // o2.a
    public final int getFlexItemCount() {
        return this.f1152k.getItemCount();
    }

    @Override // o2.a
    public final List getFlexLinesInternal() {
        return this.f1149h;
    }

    @Override // o2.a
    public final int getFlexWrap() {
        return this.c;
    }

    @Override // o2.a
    public final int getLargestMainSize() {
        if (this.f1149h.size() == 0) {
            return 0;
        }
        int size = this.f1149h.size();
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = Math.max(i10, ((c) this.f1149h.get(i11)).e);
        }
        return i10;
    }

    @Override // o2.a
    public final int getMaxLine() {
        return this.e;
    }

    @Override // o2.a
    public final int getSumOfCrossSize() {
        int size = this.f1149h.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((c) this.f1149h.get(i11)).f4312g;
        }
        return i10;
    }

    @Override // o2.a
    public final int h(int i10, int i11, int i12) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i11, i12, canScrollVertically());
    }

    @Override // o2.a
    public final boolean i() {
        int i10 = this.f1146b;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // o2.a
    public final int j(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (i()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    public final void k() {
        if (this.f1155n != null) {
            return;
        }
        boolean i10 = i();
        int i11 = this.c;
        if (i10) {
            if (i11 == 0) {
                this.f1155n = OrientationHelper.createHorizontalHelper(this);
                this.f1156o = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.f1155n = OrientationHelper.createVerticalHelper(this);
                this.f1156o = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (i11 == 0) {
            this.f1155n = OrientationHelper.createVerticalHelper(this);
            this.f1156o = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.f1155n = OrientationHelper.createHorizontalHelper(this);
            this.f1156o = OrientationHelper.createVerticalHelper(this);
        }
    }

    public final int l(RecyclerView.Recycler recycler, RecyclerView.State state, h hVar) {
        int i10;
        int i11;
        boolean z9;
        int i12;
        int i13;
        Rect rect;
        int i14;
        int i15;
        int i16;
        boolean z10;
        s3 s3Var;
        int i17;
        int i18;
        int i19;
        Rect rect2;
        int i20;
        int i21 = hVar.f4344f;
        if (i21 != Integer.MIN_VALUE) {
            int i22 = hVar.f4342a;
            if (i22 < 0) {
                hVar.f4344f = i21 + i22;
            }
            u(recycler, hVar);
        }
        int i23 = hVar.f4342a;
        boolean i24 = i();
        int i25 = i23;
        int i26 = 0;
        while (true) {
            if (i25 <= 0 && !this.f1153l.f4343b) {
                break;
            }
            List list = this.f1149h;
            int i27 = hVar.d;
            if (i27 < 0 || i27 >= state.getItemCount() || (i10 = hVar.c) < 0 || i10 >= list.size()) {
                break;
            }
            c cVar = (c) this.f1149h.get(hVar.c);
            hVar.d = cVar.f4320o;
            boolean i28 = i();
            f fVar = this.f1154m;
            Rect rect3 = f1145z;
            s3 s3Var2 = this.f1150i;
            if (i28) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i29 = hVar.e;
                if (hVar.f4346h == -1) {
                    i29 -= cVar.f4312g;
                }
                int i30 = hVar.d;
                float f8 = fVar.d;
                float f10 = paddingLeft - f8;
                float f11 = (width - paddingRight) - f8;
                float max = Math.max(0.0f, 0.0f);
                int i31 = cVar.f4313h;
                i11 = i23;
                int i32 = i29;
                int i33 = i30;
                int i34 = 0;
                while (i33 < i30 + i31) {
                    int i35 = i30;
                    View f12 = f(i33);
                    if (f12 == null) {
                        i18 = i34;
                        z10 = i24;
                        s3Var = s3Var2;
                        i17 = i31;
                        i19 = i33;
                        rect2 = rect3;
                        i20 = i35;
                    } else {
                        z10 = i24;
                        if (hVar.f4346h == 1) {
                            calculateItemDecorationsForChild(f12, rect3);
                            addView(f12);
                        } else {
                            calculateItemDecorationsForChild(f12, rect3);
                            addView(f12, i34);
                            i34++;
                        }
                        s3Var = s3Var2;
                        long j10 = ((long[]) s3Var2.f2029f)[i33];
                        int i36 = (int) j10;
                        int i37 = (int) (j10 >> 32);
                        if (x(f12, i36, i37, (g) f12.getLayoutParams())) {
                            f12.measure(i36, i37);
                        }
                        float leftDecorationWidth = f10 + getLeftDecorationWidth(f12) + ((ViewGroup.MarginLayoutParams) r6).leftMargin;
                        float rightDecorationWidth = f11 - (getRightDecorationWidth(f12) + ((ViewGroup.MarginLayoutParams) r6).rightMargin);
                        int topDecorationHeight = getTopDecorationHeight(f12) + i32;
                        boolean z11 = this.f1147f;
                        i17 = i31;
                        s3 s3Var3 = this.f1150i;
                        if (z11) {
                            int round = Math.round(rightDecorationWidth) - f12.getMeasuredWidth();
                            Rect rect4 = rect3;
                            int round2 = Math.round(rightDecorationWidth);
                            int measuredHeight = f12.getMeasuredHeight() + topDecorationHeight;
                            i19 = i33;
                            rect2 = rect4;
                            i18 = i34;
                            i20 = i35;
                            s3Var3.p(f12, cVar, round, topDecorationHeight, round2, measuredHeight);
                        } else {
                            i18 = i34;
                            i19 = i33;
                            rect2 = rect3;
                            i20 = i35;
                            s3Var3.p(f12, cVar, Math.round(leftDecorationWidth), topDecorationHeight, f12.getMeasuredWidth() + Math.round(leftDecorationWidth), f12.getMeasuredHeight() + topDecorationHeight);
                        }
                        f11 = rightDecorationWidth - ((getLeftDecorationWidth(f12) + (f12.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).leftMargin)) + max);
                        f10 = getRightDecorationWidth(f12) + f12.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r6).rightMargin + max + leftDecorationWidth;
                    }
                    i33 = i19 + 1;
                    i30 = i20;
                    s3Var2 = s3Var;
                    i24 = z10;
                    i31 = i17;
                    i34 = i18;
                    rect3 = rect2;
                }
                z9 = i24;
                hVar.c += this.f1153l.f4346h;
                i13 = cVar.f4312g;
            } else {
                i11 = i23;
                z9 = i24;
                Rect rect5 = rect3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i38 = hVar.e;
                if (hVar.f4346h == -1) {
                    int i39 = cVar.f4312g;
                    i12 = i38 + i39;
                    i38 -= i39;
                } else {
                    i12 = i38;
                }
                int i40 = hVar.d;
                float f13 = height - paddingBottom;
                float f14 = fVar.d;
                float f15 = paddingTop - f14;
                float f16 = f13 - f14;
                float max2 = Math.max(0.0f, 0.0f);
                int i41 = cVar.f4313h;
                int i42 = i40;
                int i43 = 0;
                while (i42 < i40 + i41) {
                    int i44 = i40;
                    View f17 = f(i42);
                    if (f17 == null) {
                        i15 = i41;
                        i14 = i42;
                        rect = rect5;
                        i16 = i44;
                    } else {
                        float f18 = f15;
                        long j11 = ((long[]) s3Var2.f2029f)[i42];
                        float f19 = f16;
                        int i45 = (int) j11;
                        int i46 = (int) (j11 >> 32);
                        if (x(f17, i45, i46, (g) f17.getLayoutParams())) {
                            f17.measure(i45, i46);
                        }
                        float topDecorationHeight2 = f18 + getTopDecorationHeight(f17) + ((ViewGroup.MarginLayoutParams) r4).topMargin;
                        float bottomDecorationHeight = f19 - (getBottomDecorationHeight(f17) + ((ViewGroup.MarginLayoutParams) r4).rightMargin);
                        if (hVar.f4346h == 1) {
                            rect = rect5;
                            calculateItemDecorationsForChild(f17, rect);
                            addView(f17);
                        } else {
                            rect = rect5;
                            calculateItemDecorationsForChild(f17, rect);
                            addView(f17, i43);
                            i43++;
                        }
                        int i47 = i43;
                        int leftDecorationWidth2 = getLeftDecorationWidth(f17) + i38;
                        int rightDecorationWidth2 = i12 - getRightDecorationWidth(f17);
                        int i48 = i42;
                        boolean z12 = this.f1147f;
                        boolean z13 = this.f1148g;
                        int i49 = i41;
                        s3 s3Var4 = this.f1150i;
                        if (z12) {
                            if (z13) {
                                i14 = i48;
                                i15 = i49;
                                i16 = i44;
                                s3Var4.q(f17, cVar, z12, rightDecorationWidth2 - f17.getMeasuredWidth(), Math.round(bottomDecorationHeight) - f17.getMeasuredHeight(), rightDecorationWidth2, Math.round(bottomDecorationHeight));
                            } else {
                                i14 = i48;
                                i15 = i49;
                                i16 = i44;
                                s3Var4.q(f17, cVar, z12, rightDecorationWidth2 - f17.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth2, f17.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        } else {
                            i14 = i48;
                            i15 = i49;
                            i16 = i44;
                            if (z13) {
                                s3Var4.q(f17, cVar, z12, leftDecorationWidth2, Math.round(bottomDecorationHeight) - f17.getMeasuredHeight(), f17.getMeasuredWidth() + leftDecorationWidth2, Math.round(bottomDecorationHeight));
                            } else {
                                s3Var4.q(f17, cVar, z12, leftDecorationWidth2, Math.round(topDecorationHeight2), f17.getMeasuredWidth() + leftDecorationWidth2, f17.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        }
                        f16 = bottomDecorationHeight - ((getTopDecorationHeight(f17) + (f17.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).bottomMargin)) + max2);
                        f15 = getBottomDecorationHeight(f17) + f17.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4).topMargin + max2 + topDecorationHeight2;
                        i43 = i47;
                    }
                    i42 = i14 + 1;
                    i40 = i16;
                    i41 = i15;
                    rect5 = rect;
                }
                hVar.c += this.f1153l.f4346h;
                i13 = cVar.f4312g;
            }
            i26 += i13;
            if (!z9 && this.f1147f) {
                hVar.e -= cVar.f4312g * hVar.f4346h;
            } else {
                hVar.e += cVar.f4312g * hVar.f4346h;
            }
            i25 -= cVar.f4312g;
            i23 = i11;
            i24 = z9;
        }
        int i50 = i23;
        int i51 = hVar.f4342a - i26;
        hVar.f4342a = i51;
        int i52 = hVar.f4344f;
        if (i52 != Integer.MIN_VALUE) {
            int i53 = i52 + i26;
            hVar.f4344f = i53;
            if (i51 < 0) {
                hVar.f4344f = i53 + i51;
            }
            u(recycler, hVar);
        }
        return i50 - hVar.f4342a;
    }

    public final View m(int i10) {
        View r = r(0, getChildCount(), i10);
        if (r != null) {
            int i11 = ((int[]) this.f1150i.e)[getPosition(r)];
            if (i11 == -1) {
                return null;
            }
            return n(r, (c) this.f1149h.get(i11));
        }
        return null;
    }

    public final View n(View view, c cVar) {
        boolean i10 = i();
        int i11 = cVar.f4313h;
        for (int i12 = 1; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.f1147f && !i10) {
                    if (this.f1155n.getDecoratedEnd(view) >= this.f1155n.getDecoratedEnd(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f1155n.getDecoratedStart(view) <= this.f1155n.getDecoratedStart(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View o(int i10) {
        View r = r(getChildCount() - 1, -1, i10);
        if (r == null) {
            return null;
        }
        return p(r, (c) this.f1149h.get(((int[]) this.f1150i.e)[getPosition(r)]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.w = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        y(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.onItemsMoved(recyclerView, i10, i11, i12);
        y(Math.min(i10, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        y(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.onItemsUpdated(recyclerView, i10, i11, obj);
        y(i10);
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, o2.h] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z9;
        boolean z10;
        View m10;
        OrientationHelper orientationHelper;
        int startAfterPadding;
        int i10;
        View childAt;
        boolean z11;
        int decoratedStart;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        this.f1151j = recycler;
        this.f1152k = state;
        int itemCount = state.getItemCount();
        if (itemCount != 0 || !state.isPreLayout()) {
            int layoutDirection = getLayoutDirection();
            int i15 = this.f1146b;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            this.f1147f = false;
                            this.f1148g = false;
                        } else {
                            if (layoutDirection == 1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            this.f1147f = z17;
                            if (this.c == 2) {
                                this.f1147f = !z17;
                            }
                            this.f1148g = true;
                        }
                    } else {
                        if (layoutDirection == 1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f1147f = z16;
                        if (this.c == 2) {
                            this.f1147f = !z16;
                        }
                        this.f1148g = false;
                    }
                } else {
                    if (layoutDirection != 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    this.f1147f = z14;
                    if (this.c == 2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.f1148g = z15;
                }
            } else {
                if (layoutDirection == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f1147f = z9;
                if (this.c == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f1148g = z10;
            }
            k();
            if (this.f1153l == null) {
                ?? obj = new Object();
                obj.f4346h = 1;
                this.f1153l = obj;
            }
            s3 s3Var = this.f1150i;
            s3Var.k(itemCount);
            s3Var.l(itemCount);
            s3Var.j(itemCount);
            this.f1153l.f4347i = false;
            i iVar = this.f1157p;
            if (iVar != null && (i14 = iVar.f4348b) >= 0 && i14 < itemCount) {
                this.f1158q = i14;
            }
            f fVar = this.f1154m;
            if (!fVar.f4333f || this.f1158q != -1 || iVar != null) {
                f.b(fVar);
                i iVar2 = this.f1157p;
                if (!state.isPreLayout() && (i10 = this.f1158q) != -1) {
                    if (i10 >= 0 && i10 < state.getItemCount()) {
                        int i16 = this.f1158q;
                        fVar.f4331a = i16;
                        fVar.f4332b = ((int[]) s3Var.e)[i16];
                        i iVar3 = this.f1157p;
                        if (iVar3 != null) {
                            int itemCount2 = state.getItemCount();
                            int i17 = iVar3.f4348b;
                            if (i17 >= 0 && i17 < itemCount2) {
                                fVar.c = this.f1155n.getStartAfterPadding() + iVar2.c;
                                fVar.f4334g = true;
                                fVar.f4332b = -1;
                                fVar.f4333f = true;
                            }
                        }
                        if (this.r == Integer.MIN_VALUE) {
                            View findViewByPosition = findViewByPosition(this.f1158q);
                            if (findViewByPosition != null) {
                                if (this.f1155n.getDecoratedMeasurement(findViewByPosition) > this.f1155n.getTotalSpace()) {
                                    f.a(fVar);
                                } else {
                                    int decoratedStart2 = this.f1155n.getDecoratedStart(findViewByPosition) - this.f1155n.getStartAfterPadding();
                                    OrientationHelper orientationHelper2 = this.f1155n;
                                    if (decoratedStart2 < 0) {
                                        fVar.c = orientationHelper2.getStartAfterPadding();
                                        fVar.e = false;
                                    } else if (orientationHelper2.getEndAfterPadding() - this.f1155n.getDecoratedEnd(findViewByPosition) < 0) {
                                        fVar.c = this.f1155n.getEndAfterPadding();
                                        fVar.e = true;
                                    } else {
                                        boolean z18 = fVar.e;
                                        OrientationHelper orientationHelper3 = this.f1155n;
                                        if (z18) {
                                            decoratedStart = this.f1155n.getTotalSpaceChange() + orientationHelper3.getDecoratedEnd(findViewByPosition);
                                        } else {
                                            decoratedStart = orientationHelper3.getDecoratedStart(findViewByPosition);
                                        }
                                        fVar.c = decoratedStart;
                                    }
                                }
                            } else {
                                if (getChildCount() > 0 && (childAt = getChildAt(0)) != null) {
                                    if (this.f1158q < getPosition(childAt)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    fVar.e = z11;
                                }
                                f.a(fVar);
                            }
                        } else if (!i() && this.f1147f) {
                            fVar.c = this.r - this.f1155n.getEndPadding();
                        } else {
                            fVar.c = this.f1155n.getStartAfterPadding() + this.r;
                        }
                        fVar.f4333f = true;
                    } else {
                        this.f1158q = -1;
                        this.r = Integer.MIN_VALUE;
                    }
                }
                if (getChildCount() != 0) {
                    if (fVar.e) {
                        m10 = o(state.getItemCount());
                    } else {
                        m10 = m(state.getItemCount());
                    }
                    if (m10 != null) {
                        FlexboxLayoutManager flexboxLayoutManager = fVar.f4335h;
                        if (flexboxLayoutManager.c == 0) {
                            orientationHelper = flexboxLayoutManager.f1156o;
                        } else {
                            orientationHelper = flexboxLayoutManager.f1155n;
                        }
                        if (!flexboxLayoutManager.i() && flexboxLayoutManager.f1147f) {
                            if (fVar.e) {
                                fVar.c = orientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedStart(m10);
                            } else {
                                fVar.c = orientationHelper.getDecoratedEnd(m10);
                            }
                        } else if (fVar.e) {
                            fVar.c = orientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedEnd(m10);
                        } else {
                            fVar.c = orientationHelper.getDecoratedStart(m10);
                        }
                        int position = flexboxLayoutManager.getPosition(m10);
                        fVar.f4331a = position;
                        fVar.f4334g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.f1150i.e;
                        if (position == -1) {
                            position = 0;
                        }
                        int i18 = iArr[position];
                        if (i18 == -1) {
                            i18 = 0;
                        }
                        fVar.f4332b = i18;
                        int size = flexboxLayoutManager.f1149h.size();
                        int i19 = fVar.f4332b;
                        if (size > i19) {
                            fVar.f4331a = ((c) flexboxLayoutManager.f1149h.get(i19)).f4320o;
                        }
                        if (!state.isPreLayout() && supportsPredictiveItemAnimations() && (this.f1155n.getDecoratedStart(m10) >= this.f1155n.getEndAfterPadding() || this.f1155n.getDecoratedEnd(m10) < this.f1155n.getStartAfterPadding())) {
                            boolean z19 = fVar.e;
                            OrientationHelper orientationHelper4 = this.f1155n;
                            if (z19) {
                                startAfterPadding = orientationHelper4.getEndAfterPadding();
                            } else {
                                startAfterPadding = orientationHelper4.getStartAfterPadding();
                            }
                            fVar.c = startAfterPadding;
                        }
                        fVar.f4333f = true;
                    }
                }
                f.a(fVar);
                fVar.f4331a = 0;
                fVar.f4332b = 0;
                fVar.f4333f = true;
            }
            detachAndScrapAttachedViews(recycler);
            if (fVar.e) {
                A(fVar, false, true);
            } else {
                z(fVar, false, true);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
            int width = getWidth();
            int height = getHeight();
            boolean i20 = i();
            Context context = this.f1161v;
            if (i20) {
                int i21 = this.f1159s;
                if (i21 != Integer.MIN_VALUE && i21 != width) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h hVar = this.f1153l;
                if (hVar.f4343b) {
                    i11 = context.getResources().getDisplayMetrics().heightPixels;
                } else {
                    i11 = hVar.f4342a;
                }
            } else {
                int i22 = this.t;
                if (i22 != Integer.MIN_VALUE && i22 != height) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h hVar2 = this.f1153l;
                if (hVar2.f4343b) {
                    i11 = context.getResources().getDisplayMetrics().widthPixels;
                } else {
                    i11 = hVar2.f4342a;
                }
            }
            int i23 = i11;
            this.f1159s = width;
            this.t = height;
            int i24 = this.f1162x;
            j.i iVar4 = this.f1163y;
            if (i24 == -1 && (this.f1158q != -1 || z12)) {
                if (!fVar.e) {
                    this.f1149h.clear();
                    iVar4.c = null;
                    iVar4.f3015b = 0;
                    boolean i25 = i();
                    int i26 = fVar.f4331a;
                    s3 s3Var2 = this.f1150i;
                    j.i iVar5 = this.f1163y;
                    if (i25) {
                        s3Var2.b(iVar5, makeMeasureSpec, makeMeasureSpec2, i23, 0, i26, this.f1149h);
                    } else {
                        s3Var2.b(iVar5, makeMeasureSpec2, makeMeasureSpec, i23, 0, i26, this.f1149h);
                        makeMeasureSpec2 = makeMeasureSpec2;
                        makeMeasureSpec = makeMeasureSpec;
                    }
                    this.f1149h = (List) iVar4.c;
                    s3Var.i(makeMeasureSpec, makeMeasureSpec2, 0);
                    s3Var.w(0);
                    int i27 = ((int[]) s3Var.e)[fVar.f4331a];
                    fVar.f4332b = i27;
                    this.f1153l.c = i27;
                }
            } else {
                int i28 = fVar.f4331a;
                if (i24 != -1) {
                    i28 = Math.min(i24, i28);
                }
                iVar4.c = null;
                iVar4.f3015b = 0;
                boolean i29 = i();
                List list = this.f1149h;
                if (i29) {
                    if (list.size() > 0) {
                        s3Var.d(i28, this.f1149h);
                        this.f1150i.b(this.f1163y, makeMeasureSpec, makeMeasureSpec2, i23, i28, fVar.f4331a, this.f1149h);
                    } else {
                        s3Var.j(itemCount);
                        this.f1150i.b(this.f1163y, makeMeasureSpec, makeMeasureSpec2, i23, 0, -1, this.f1149h);
                    }
                } else if (list.size() > 0) {
                    s3Var.d(i28, this.f1149h);
                    int i30 = i28;
                    this.f1150i.b(this.f1163y, makeMeasureSpec2, makeMeasureSpec, i23, i30, fVar.f4331a, this.f1149h);
                    makeMeasureSpec2 = makeMeasureSpec2;
                    makeMeasureSpec = makeMeasureSpec;
                    i28 = i30;
                } else {
                    s3Var.j(itemCount);
                    this.f1150i.b(this.f1163y, makeMeasureSpec2, makeMeasureSpec, i23, 0, -1, this.f1149h);
                    makeMeasureSpec2 = makeMeasureSpec2;
                    makeMeasureSpec = makeMeasureSpec;
                }
                this.f1149h = (List) iVar4.c;
                s3Var.i(makeMeasureSpec, makeMeasureSpec2, i28);
                s3Var.w(i28);
            }
            l(recycler, state, this.f1153l);
            boolean z20 = fVar.e;
            h hVar3 = this.f1153l;
            if (z20) {
                i13 = hVar3.e;
                z13 = true;
                z(fVar, true, false);
                l(recycler, state, this.f1153l);
                i12 = this.f1153l.e;
            } else {
                z13 = true;
                i12 = hVar3.e;
                A(fVar, true, false);
                l(recycler, state, this.f1153l);
                i13 = this.f1153l.e;
            }
            if (getChildCount() > 0) {
                if (fVar.e) {
                    fixLayoutStartGap(fixLayoutEndGap(i12, recycler, state, z13) + i13, recycler, state, false);
                } else {
                    fixLayoutEndGap(fixLayoutStartGap(i13, recycler, state, z13) + i12, recycler, state, false);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f1157p = null;
        this.f1158q = -1;
        this.r = Integer.MIN_VALUE;
        this.f1162x = -1;
        f.b(this.f1154m);
        this.f1160u.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof i) {
            this.f1157p = (i) parcelable;
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, o2.i] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, java.lang.Object, o2.i] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        i iVar = this.f1157p;
        if (iVar != null) {
            ?? obj = new Object();
            obj.f4348b = iVar.f4348b;
            obj.c = iVar.c;
            return obj;
        }
        ?? obj2 = new Object();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            obj2.f4348b = getPosition(childAt);
            obj2.c = this.f1155n.getDecoratedStart(childAt) - this.f1155n.getStartAfterPadding();
            return obj2;
        }
        obj2.f4348b = -1;
        return obj2;
    }

    public final View p(View view, c cVar) {
        boolean i10 = i();
        int childCount = (getChildCount() - cVar.f4313h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (this.f1147f && !i10) {
                    if (this.f1155n.getDecoratedStart(view) <= this.f1155n.getDecoratedStart(childAt)) {
                    }
                    view = childAt;
                } else {
                    if (this.f1155n.getDecoratedEnd(view) >= this.f1155n.getDecoratedEnd(childAt)) {
                    }
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View q(int i10, int i11) {
        int i12;
        boolean z9;
        if (i11 > i10) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z10 = false;
            if (decoratedLeft < width && decoratedRight < paddingLeft) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (decoratedTop >= height || decoratedBottom >= paddingTop) {
                z10 = true;
            }
            if (z9 && z10) {
                return childAt;
            }
            i10 += i12;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o2.h] */
    public final View r(int i10, int i11, int i12) {
        int position;
        k();
        int i13 = 1;
        if (this.f1153l == null) {
            ?? obj = new Object();
            obj.f4346h = 1;
            this.f1153l = obj;
        }
        int startAfterPadding = this.f1155n.getStartAfterPadding();
        int endAfterPadding = this.f1155n.getEndAfterPadding();
        if (i11 <= i10) {
            i13 = -1;
        }
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i12) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f1155n.getDecoratedStart(childAt) >= startAfterPadding && this.f1155n.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i10 += i13;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r20, androidx.recyclerview.widget.RecyclerView.Recycler r21, androidx.recyclerview.widget.RecyclerView.State r22) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.s(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (i() && this.c != 0) {
            int t = t(i10);
            this.f1154m.d += t;
            this.f1156o.offsetChildren(-t);
            return t;
        }
        int s5 = s(i10, recycler, state);
        this.f1160u.clear();
        return s5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i10) {
        this.f1158q = i10;
        this.r = Integer.MIN_VALUE;
        i iVar = this.f1157p;
        if (iVar != null) {
            iVar.f4348b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!i() && (this.c != 0 || i())) {
            int t = t(i10);
            this.f1154m.d += t;
            this.f1156o.offsetChildren(-t);
            return t;
        }
        int s5 = s(i10, recycler, state);
        this.f1160u.clear();
        return s5;
    }

    @Override // o2.a
    public final void setFlexLines(List list) {
        this.f1149h = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i10);
        startSmoothScroll(linearSmoothScroller);
    }

    public final int t(int i10) {
        int height;
        int height2;
        if (getChildCount() != 0 && i10 != 0) {
            k();
            boolean i11 = i();
            View view = this.w;
            if (i11) {
                height = view.getWidth();
            } else {
                height = view.getHeight();
            }
            if (i11) {
                height2 = getWidth();
            } else {
                height2 = getHeight();
            }
            int layoutDirection = getLayoutDirection();
            f fVar = this.f1154m;
            if (layoutDirection == 1) {
                int abs = Math.abs(i10);
                if (i10 < 0) {
                    return -Math.min((height2 + fVar.d) - height, abs);
                }
                int i12 = fVar.d;
                if (i12 + i10 > 0) {
                    return -i12;
                }
            } else {
                if (i10 > 0) {
                    return Math.min((height2 - fVar.d) - height, i10);
                }
                int i13 = fVar.d;
                if (i13 + i10 < 0) {
                    return -i13;
                }
            }
            return i10;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(androidx.recyclerview.widget.RecyclerView.Recycler r10, o2.h r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.u(androidx.recyclerview.widget.RecyclerView$Recycler, o2.h):void");
    }

    public final void v() {
        int widthMode;
        boolean z9;
        if (i()) {
            widthMode = getHeightMode();
        } else {
            widthMode = getWidthMode();
        }
        h hVar = this.f1153l;
        if (widthMode != 0 && widthMode != Integer.MIN_VALUE) {
            z9 = false;
        } else {
            z9 = true;
        }
        hVar.f4343b = z9;
    }

    public final void w(int i10) {
        if (this.f1146b != i10) {
            removeAllViews();
            this.f1146b = i10;
            this.f1155n = null;
            this.f1156o = null;
            this.f1149h.clear();
            f fVar = this.f1154m;
            f.b(fVar);
            fVar.d = 0;
            requestLayout();
        }
    }

    public final boolean x(View view, int i10, int i11, g gVar) {
        if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) gVar).width) && isMeasurementUpToDate(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) gVar).height)) {
            return false;
        }
        return true;
    }

    public final void y(int i10) {
        int i11 = -1;
        View q8 = q(getChildCount() - 1, -1);
        if (q8 != null) {
            i11 = getPosition(q8);
        }
        if (i10 < i11) {
            int childCount = getChildCount();
            s3 s3Var = this.f1150i;
            s3Var.k(childCount);
            s3Var.l(childCount);
            s3Var.j(childCount);
            if (i10 < ((int[]) s3Var.e).length) {
                this.f1162x = i10;
                View childAt = getChildAt(0);
                if (childAt == null) {
                    return;
                }
                this.f1158q = getPosition(childAt);
                if (!i() && this.f1147f) {
                    this.r = this.f1155n.getEndPadding() + this.f1155n.getDecoratedEnd(childAt);
                } else {
                    this.r = this.f1155n.getDecoratedStart(childAt) - this.f1155n.getStartAfterPadding();
                }
            }
        }
    }

    public final void z(f fVar, boolean z9, boolean z10) {
        int i10;
        if (z10) {
            v();
        } else {
            this.f1153l.f4343b = false;
        }
        if (!i() && this.f1147f) {
            this.f1153l.f4342a = fVar.c - getPaddingRight();
        } else {
            this.f1153l.f4342a = this.f1155n.getEndAfterPadding() - fVar.c;
        }
        h hVar = this.f1153l;
        hVar.d = fVar.f4331a;
        hVar.f4346h = 1;
        hVar.e = fVar.c;
        hVar.f4344f = Integer.MIN_VALUE;
        hVar.c = fVar.f4332b;
        if (z9 && this.f1149h.size() > 1 && (i10 = fVar.f4332b) >= 0 && i10 < this.f1149h.size() - 1) {
            c cVar = (c) this.f1149h.get(fVar.f4332b);
            h hVar2 = this.f1153l;
            hVar2.c++;
            hVar2.d += cVar.f4313h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsUpdated(recyclerView, i10, i11);
        y(i10);
    }

    @Override // o2.a
    public final void b(c cVar) {
    }
}
