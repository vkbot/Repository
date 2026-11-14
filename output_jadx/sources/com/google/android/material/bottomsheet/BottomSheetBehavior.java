package com.google.android.material.bottomsheet;

import a3.a;
import a4.h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.example.navistart.R;
import d4.b;
import g3.c;
import g3.d;
import g3.e;
import g3.f;
import j1.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.net.ftp.FTPReply;
import z3.k;
import z3.o;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public final h A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public ViewDragHelper O;
    public boolean P;
    public int Q;
    public boolean R;
    public final float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public final ArrayList Y;
    public VelocityTracker Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f1221a;

    /* renamed from: a0, reason: collision with root package name */
    public int f1222a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1223b;

    /* renamed from: b0, reason: collision with root package name */
    public int f1224b0;
    public final float c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1225c0;
    public final int d;

    /* renamed from: d0, reason: collision with root package name */
    public HashMap f1226d0;
    public int e;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseIntArray f1227e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1228f;

    /* renamed from: f0, reason: collision with root package name */
    public final c f1229f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1230g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1231h;

    /* renamed from: i, reason: collision with root package name */
    public final k f1232i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f1233j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1234k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1235l;

    /* renamed from: m, reason: collision with root package name */
    public int f1236m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1237n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1238o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1239p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1240q;
    public final boolean r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1241s;
    public final boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1242u;

    /* renamed from: v, reason: collision with root package name */
    public int f1243v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1244x;

    /* renamed from: y, reason: collision with root package name */
    public final o f1245y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1246z;

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f1221a = 0;
        this.f1223b = true;
        this.f1234k = -1;
        this.f1235l = -1;
        this.A = new h(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f1224b0 = -1;
        this.f1227e0 = new SparseIntArray();
        this.f1229f0 = new c(this);
        this.f1231h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f1233j = w3.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.f1245y = o.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.f1245y;
        if (oVar != null) {
            k kVar = new k(oVar);
            this.f1232i = kVar;
            kVar.m(context);
            ColorStateList colorStateList = this.f1233j;
            if (colorStateList != null) {
                this.f1232i.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f1232i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new b(2, this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f1234k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f1235l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(10);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            j(i10);
        } else {
            j(obtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z9 = obtainStyledAttributes.getBoolean(9, false);
        if (this.I != z9) {
            this.I = z9;
            if (!z9 && this.N == 5) {
                k(4);
            }
            o();
        }
        this.f1237n = obtainStyledAttributes.getBoolean(14, false);
        boolean z10 = obtainStyledAttributes.getBoolean(7, true);
        if (this.f1223b != z10) {
            this.f1223b = z10;
            if (this.W != null) {
                a();
            }
            l((this.f1223b && this.N == 6) ? 3 : this.N);
            p(this.N, true);
            o();
        }
        this.J = obtainStyledAttributes.getBoolean(13, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.f1221a = obtainStyledAttributes.getInt(11, 0);
        float f8 = obtainStyledAttributes.getFloat(8, 0.5f);
        if (f8 > 0.0f && f8 < 1.0f) {
            this.F = f8;
            if (this.W != null) {
                this.E = (int) ((1.0f - f8) * this.V);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i11 = peekValue2.data;
                if (i11 >= 0) {
                    this.C = i11;
                    p(this.N, true);
                } else {
                    i.k("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    p(this.N, true);
                } else {
                    i.k("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            this.d = obtainStyledAttributes.getInt(12, 500);
            this.f1238o = obtainStyledAttributes.getBoolean(18, false);
            this.f1239p = obtainStyledAttributes.getBoolean(19, false);
            this.f1240q = obtainStyledAttributes.getBoolean(20, false);
            this.r = obtainStyledAttributes.getBoolean(21, true);
            this.f1241s = obtainStyledAttributes.getBoolean(15, false);
            this.t = obtainStyledAttributes.getBoolean(16, false);
            this.f1242u = obtainStyledAttributes.getBoolean(17, false);
            this.f1244x = obtainStyledAttributes.getBoolean(24, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        i.k("ratio must be a float value between 0 and 1");
        throw null;
    }

    public static View e(View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View e = e(viewGroup.getChildAt(i10));
                    if (e != null) {
                        return e;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), BasicMeasure.EXACTLY);
    }

    public final void a() {
        int c = c();
        boolean z9 = this.f1223b;
        int i10 = this.V;
        if (z9) {
            this.G = Math.max(i10 - c, this.D);
        } else {
            this.G = i10 - c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            r5 = this;
            z3.k r0 = r5.f1232i
            r1 = 0
            if (r0 == 0) goto L77
            java.lang.ref.WeakReference r0 = r5.W
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L77
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L77
            java.lang.ref.WeakReference r0 = r5.W
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.i()
            if (r2 == 0) goto L77
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L77
            z3.k r2 = r5.f1232i
            float r2 = r2.k()
            android.view.RoundedCorner r3 = androidx.core.app.c.n(r0)
            if (r3 == 0) goto L44
            int r3 = androidx.core.app.c.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            z3.k r2 = r5.f1232i
            float[] r4 = r2.D
            if (r4 == 0) goto L4f
            r2 = 0
            r2 = r4[r2]
            goto L5d
        L4f:
            z3.h r4 = r2.c
            z3.o r4 = r4.f6749a
            z3.d r4 = r4.f6796f
            android.graphics.RectF r2 = r2.h()
            float r2 = r4.a(r2)
        L5d:
            android.view.RoundedCorner r0 = androidx.core.app.c.B(r0)
            if (r0 == 0) goto L72
            int r0 = androidx.core.app.c.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L72
            float r1 = r0 / r2
        L72:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b():float");
    }

    public final int c() {
        int i10;
        if (this.f1228f) {
            return Math.min(Math.max(this.f1230g, this.V - ((this.U * 9) / 16)), this.T) + this.f1243v;
        }
        if (!this.f1237n && !this.f1238o && (i10 = this.f1236m) > 0) {
            return Math.max(this.e, i10 + this.f1231h);
        }
        return this.e + this.f1243v;
    }

    public final void d(int i10) {
        if (((View) this.W.get()) != null) {
            ArrayList arrayList = this.Y;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != g()) {
                    g();
                }
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    n0.b.a();
                }
            }
        }
    }

    public final int g() {
        int i10;
        if (this.f1223b) {
            return this.D;
        }
        if (this.r) {
            i10 = 0;
        } else {
            i10 = this.w;
        }
        return Math.max(this.C, i10);
    }

    public final int h(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    i.k(ai.onnxruntime.a.e(i10, "Invalid state to get top offset: "));
                    return 0;
                }
                return this.V;
            }
            return this.G;
        }
        return g();
    }

    public final boolean i() {
        WeakReference weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i10) {
        boolean z9 = this.f1228f;
        if (i10 == -1) {
            if (!z9) {
                this.f1228f = true;
            } else {
                return;
            }
        } else {
            if (!z9 && this.e == i10) {
                return;
            }
            this.f1228f = false;
            this.e = Math.max(0, i10);
        }
        r();
    }

    public final void k(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2) {
            if (!this.I && i10 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
                return;
            }
            if (i10 == 6 && this.f1223b && h(i10) <= this.D) {
                i11 = 3;
            } else {
                i11 = i10;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.W.get();
                g3.a aVar = new g3.a(this, view, i11);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                    view.post(aVar);
                    return;
                } else {
                    aVar.run();
                    return;
                }
            }
            l(i10);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(ai.onnxruntime.a.p(sb, str, " should not be set externally."));
    }

    public final void l(int i10) {
        if (this.N != i10) {
            this.N = i10;
            if (i10 != 4 && i10 != 3 && i10 != 6) {
                boolean z9 = this.I;
            }
            WeakReference weakReference = this.W;
            if (weakReference == null || ((View) weakReference.get()) == null) {
                return;
            }
            if (i10 == 3) {
                q(true);
            } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                q(false);
            }
            p(i10, true);
            ArrayList arrayList = this.Y;
            if (arrayList.size() <= 0) {
                o();
            } else {
                arrayList.get(0).getClass();
                n0.b.a();
            }
        }
    }

    public final boolean m(View view, float f8) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f8 * this.S) + view.getTop()) - this.G) / c() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void n(View view, int i10, boolean z9) {
        int h2 = h(i10);
        ViewDragHelper viewDragHelper = this.O;
        if (viewDragHelper != null && (!z9 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), h2) : viewDragHelper.settleCapturedViewAt(view.getLeft(), h2))) {
            l(2);
            p(i10, true);
            this.A.a(i10);
            return;
        }
        l(i10);
    }

    public final void o() {
        View view;
        WeakReference weakReference = this.W;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            SparseIntArray sparseIntArray = this.f1227e0;
            int i10 = sparseIntArray.get(0, -1);
            if (i10 != -1) {
                ViewCompat.removeAccessibilityAction(view, i10);
                sparseIntArray.delete(0);
            }
            int i11 = 6;
            if (!this.f1223b && this.N != 6) {
                sparseIntArray.put(0, ViewCompat.addAccessibilityAction(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new d(this, 6)));
            }
            if (this.I && this.N != 5) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new d(this, 5));
            }
            int i12 = this.N;
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 == 6) {
                        ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new d(this, 4));
                        ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new d(this, 3));
                        return;
                    }
                    return;
                }
                if (this.f1223b) {
                    i11 = 3;
                }
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new d(this, i11));
                return;
            }
            if (this.f1223b) {
                i11 = 4;
            }
            ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new d(this, i11));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.W = null;
        this.O = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.W = null;
        this.O = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        View view2;
        int i10;
        ViewDragHelper viewDragHelper;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f1222a0 = -1;
                this.f1224b0 = -1;
                VelocityTracker velocityTracker = this.Z;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Z = null;
                }
            }
            if (this.Z == null) {
                this.Z = VelocityTracker.obtain();
            }
            this.Z.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f1225c0 = false;
                    this.f1222a0 = -1;
                    if (this.P) {
                        this.P = false;
                        return false;
                    }
                }
            } else {
                int x9 = (int) motionEvent.getX();
                int y9 = (int) motionEvent.getY();
                this.f1224b0 = y9;
                if (this.N != 2) {
                    WeakReference weakReference = this.X;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x9, y9)) {
                        this.f1222a0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f1225c0 = true;
                    }
                }
                if (this.f1222a0 == -1 && !coordinatorLayout.isPointInChildBounds(view, x9, this.f1224b0)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.P = z9;
            }
            if (this.P || (viewDragHelper = this.O) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                WeakReference weakReference2 = this.X;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i10 = this.f1224b0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.O.getTouchSlop()) {
                    return false;
                }
            }
            return true;
        }
        this.P = true;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z9;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f1230g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f1237n && !this.f1228f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f1238o || this.f1239p || this.f1240q || this.f1241s || this.t || this.f1242u || z9) {
                g3.b bVar = new g3.b(this, z9);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.f3485a = paddingStart;
                obj.f3486b = paddingEnd;
                obj.c = paddingBottom;
                ViewCompat.setOnApplyWindowInsetsListener(view, new l.d(13, bVar, obj));
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            ViewCompat.setWindowInsetsAnimationCallback(view, new f(view));
            this.W = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            com.bumptech.glide.d.q(context, R.attr.motionDurationMedium2, 300);
            com.bumptech.glide.d.q(context, R.attr.motionDurationShort3, FTPReply.FILE_STATUS_OK);
            com.bumptech.glide.d.q(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            k kVar = this.f1232i;
            if (kVar != null) {
                view.setBackground(kVar);
                float f8 = this.H;
                if (f8 == -1.0f) {
                    f8 = view.getElevation();
                }
                this.f1232i.p(f8);
            } else {
                ColorStateList colorStateList = this.f1233j;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(view, colorStateList);
                }
            }
            o();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = ViewDragHelper.create(coordinatorLayout, this.f1229f0);
        }
        int top = view.getTop();
        coordinatorLayout.onLayoutChild(view, i10);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i11 = this.V;
        int i12 = i11 - height;
        int i13 = this.w;
        if (i12 < i13) {
            boolean z10 = this.r;
            int i14 = this.f1235l;
            if (z10) {
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.T = i11;
            } else {
                int i15 = i11 - i13;
                if (i14 != -1) {
                    i15 = Math.min(i15, i14);
                }
                this.T = i15;
            }
        }
        this.D = Math.max(0, this.V - this.T);
        this.E = (int) ((1.0f - this.F) * this.V);
        a();
        int i16 = this.N;
        if (i16 == 3) {
            ViewCompat.offsetTopAndBottom(view, g());
        } else if (i16 == 6) {
            ViewCompat.offsetTopAndBottom(view, this.E);
        } else if (this.I && i16 == 5) {
            ViewCompat.offsetTopAndBottom(view, this.V);
        } else if (i16 == 4) {
            ViewCompat.offsetTopAndBottom(view, this.G);
        } else if (i16 == 1 || i16 == 2) {
            ViewCompat.offsetTopAndBottom(view, top - view.getTop());
        }
        p(this.N, false);
        this.X = new WeakReference(e(view));
        ArrayList arrayList = this.Y;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        n0.b.a();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(f(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f1234k, marginLayoutParams.width), f(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f1235l, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f8, float f10) {
        WeakReference weakReference = this.X;
        if (weakReference != null && view2 == weakReference.get()) {
            if ((this.N != 3 && !this.M) || super.onNestedPreFling(coordinatorLayout, view, view2, f8, f10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        View view3;
        if (i12 != 1) {
            WeakReference weakReference = this.X;
            if (weakReference != null) {
                view3 = (View) weakReference.get();
            } else {
                view3 = null;
            }
            if (view2 == view3) {
                int top = view.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (!this.R && !this.L && view2 == view3 && view2.canScrollVertically(1)) {
                        this.M = true;
                        return;
                    }
                    if (i13 < g()) {
                        int g10 = top - g();
                        iArr[1] = g10;
                        ViewCompat.offsetTopAndBottom(view, -g10);
                        l(3);
                    } else if (this.K) {
                        iArr[1] = i11;
                        ViewCompat.offsetTopAndBottom(view, -i11);
                        l(1);
                    } else {
                        return;
                    }
                } else if (i11 < 0) {
                    boolean canScrollVertically = view2.canScrollVertically(-1);
                    if (!this.R && !this.L && view2 == view3 && canScrollVertically) {
                        this.M = true;
                        return;
                    }
                    if (!canScrollVertically) {
                        int i14 = this.G;
                        if (i13 > i14 && !this.I) {
                            int i15 = top - i14;
                            iArr[1] = i15;
                            ViewCompat.offsetTopAndBottom(view, -i15);
                            l(4);
                        } else {
                            if (!this.K) {
                                return;
                            }
                            iArr[1] = i11;
                            ViewCompat.offsetTopAndBottom(view, -i11);
                            l(1);
                        }
                    }
                }
                d(view.getTop());
                this.Q = i11;
                this.R = true;
                this.M = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, view, eVar.getSuperState());
        int i10 = this.f1221a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.e = eVar.c;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f1223b = eVar.d;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = eVar.e;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = eVar.f2449f;
            }
        }
        int i11 = eVar.f2448b;
        if (i11 != 1 && i11 != 2) {
            this.N = i11;
        } else {
            this.N = 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
        return new e(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.g()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.l(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.X
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.R
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f1223b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.Z
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.Z
            int r6 = r2.f1222a0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.m(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f1223b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f1223b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.n(r4, r0, r3)
            r2.R = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.N;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.O;
        if (viewDragHelper != null && (this.K || i10 == 1)) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.f1222a0 = -1;
            this.f1224b0 = -1;
            VelocityTracker velocityTracker = this.Z;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z = null;
            }
        }
        if (this.Z == null) {
            this.Z = VelocityTracker.obtain();
        }
        this.Z.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P && Math.abs(this.f1224b0 - motionEvent.getY()) > this.O.getTouchSlop())) {
            this.O.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public final void p(int i10, boolean z9) {
        boolean z10;
        k kVar;
        if (i10 != 2) {
            if (this.N == 3 && (this.f1244x || i())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f1246z != z10 && (kVar = this.f1232i) != null) {
                this.f1246z = z10;
                ValueAnimator valueAnimator = this.B;
                float f8 = 1.0f;
                if (z9 && valueAnimator != null) {
                    if (valueAnimator.isRunning()) {
                        valueAnimator.reverse();
                        return;
                    }
                    float f10 = kVar.c.f6755j;
                    if (z10) {
                        f8 = b();
                    }
                    valueAnimator.setFloatValues(f10, f8);
                    valueAnimator.start();
                    return;
                }
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                if (this.f1246z) {
                    f8 = b();
                }
                kVar.r(f8);
            }
        }
    }

    public final void q(boolean z9) {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z9) {
                    if (this.f1226d0 == null) {
                        this.f1226d0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.W.get() && z9) {
                        this.f1226d0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z9) {
                    this.f1226d0 = null;
                }
            }
        }
    }

    public final void r() {
        View view;
        if (this.W != null) {
            a();
            if (this.N == 4 && (view = (View) this.W.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.f1221a = 0;
        this.f1223b = true;
        this.f1234k = -1;
        this.f1235l = -1;
        this.A = new h(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.S = 0.1f;
        this.Y = new ArrayList();
        this.f1224b0 = -1;
        this.f1227e0 = new SparseIntArray();
        this.f1229f0 = new c(this);
    }
}
