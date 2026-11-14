package com.github.clans.fab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.example.navistart.R;
import com.google.android.material.datepicker.m;
import e3.d;
import j1.i;
import z1.a;
import z1.b;
import z1.c;
import z1.e;
import z1.k;
import z1.l;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FloatingActionButton extends ImageButton {
    public static final PorterDuffXfermode W = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    public float A;
    public boolean B;
    public RectF C;
    public final Paint D;
    public final Paint E;
    public boolean F;
    public long G;
    public float H;
    public long I;
    public double J;
    public boolean K;
    public final int L;
    public float M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public final GestureDetector V;

    /* renamed from: b, reason: collision with root package name */
    public int f1081b;
    public boolean c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f1082f;

    /* renamed from: g, reason: collision with root package name */
    public int f1083g;

    /* renamed from: h, reason: collision with root package name */
    public int f1084h;

    /* renamed from: i, reason: collision with root package name */
    public int f1085i;

    /* renamed from: j, reason: collision with root package name */
    public int f1086j;

    /* renamed from: k, reason: collision with root package name */
    public int f1087k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f1088l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1089m;

    /* renamed from: n, reason: collision with root package name */
    public Animation f1090n;

    /* renamed from: o, reason: collision with root package name */
    public Animation f1091o;

    /* renamed from: p, reason: collision with root package name */
    public String f1092p;

    /* renamed from: q, reason: collision with root package name */
    public View.OnClickListener f1093q;
    public RippleDrawable r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1094s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1095u;

    /* renamed from: v, reason: collision with root package name */
    public int f1096v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f1097x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1098y;

    /* renamed from: z, reason: collision with root package name */
    public float f1099z;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = d.e(getContext(), 4.0f);
        this.f1082f = d.e(getContext(), 1.0f);
        this.f1083g = d.e(getContext(), 3.0f);
        this.f1089m = d.e(getContext(), 24.0f);
        this.f1096v = d.e(getContext(), 6.0f);
        this.f1099z = -1.0f;
        this.A = -1.0f;
        this.C = new RectF();
        this.D = new Paint(1);
        this.E = new Paint(1);
        this.H = 195.0f;
        this.I = 0L;
        this.K = true;
        this.L = 16;
        this.T = 100;
        this.V = new GestureDetector(getContext(), new b(0, this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f6725a, 0, 0);
        this.f1084h = obtainStyledAttributes.getColor(9, -2473162);
        this.f1085i = obtainStyledAttributes.getColor(10, -1617853);
        this.f1086j = obtainStyledAttributes.getColor(8, -5592406);
        this.f1087k = obtainStyledAttributes.getColor(11, -1711276033);
        this.c = obtainStyledAttributes.getBoolean(26, true);
        this.d = obtainStyledAttributes.getColor(21, 1711276032);
        this.e = obtainStyledAttributes.getDimensionPixelSize(22, this.e);
        this.f1082f = obtainStyledAttributes.getDimensionPixelSize(23, this.f1082f);
        this.f1083g = obtainStyledAttributes.getDimensionPixelSize(24, this.f1083g);
        this.f1081b = obtainStyledAttributes.getInt(27, 0);
        this.f1092p = obtainStyledAttributes.getString(14);
        this.R = obtainStyledAttributes.getBoolean(18, false);
        this.w = obtainStyledAttributes.getColor(17, -16738680);
        this.f1097x = obtainStyledAttributes.getColor(16, 1291845632);
        this.T = obtainStyledAttributes.getInt(19, this.T);
        this.U = obtainStyledAttributes.getBoolean(20, true);
        if (obtainStyledAttributes.hasValue(15)) {
            this.P = obtainStyledAttributes.getInt(15, 0);
            this.S = true;
        }
        if (obtainStyledAttributes.hasValue(12)) {
            float dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(12, 0);
            if (isInEditMode()) {
                setElevation(dimensionPixelOffset);
            } else {
                setElevationCompat(dimensionPixelOffset);
            }
        }
        this.f1090n = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(25, R.anim.fab_scale_up));
        this.f1091o = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(13, R.anim.fab_scale_down));
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.R) {
                setIndeterminate(true);
            } else if (this.S) {
                j();
                k(this.P, false);
            }
        }
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCircleSize() {
        int i10;
        Resources resources = getResources();
        if (this.f1081b == 0) {
            i10 = R.dimen.fab_size_normal;
        } else {
            i10 = R.dimen.fab_size_mini;
        }
        return resources.getDimensionPixelSize(i10);
    }

    private int getShadowX() {
        return Math.abs(this.f1082f) + this.e;
    }

    private int getShadowY() {
        return Math.abs(this.f1083g) + this.e;
    }

    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    public final int b() {
        int i10;
        int circleSize = getCircleSize();
        if (f()) {
            i10 = getShadowY() * 2;
        } else {
            i10 = 0;
        }
        int i11 = circleSize + i10;
        if (this.f1095u) {
            return (this.f1096v * 2) + i11;
        }
        return i11;
    }

    public final int c() {
        int i10;
        int circleSize = getCircleSize();
        if (f()) {
            i10 = getShadowX() * 2;
        } else {
            i10 = 0;
        }
        int i11 = circleSize + i10;
        if (this.f1095u) {
            return (this.f1096v * 2) + i11;
        }
        return i11;
    }

    public final c d(int i10) {
        c cVar = new c(this, new OvalShape());
        cVar.getPaint().setColor(i10);
        return cVar;
    }

    public final RippleDrawable e() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, d(this.f1086j));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, d(this.f1085i));
        stateListDrawable.addState(new int[0], d(this.f1084h));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f1087k}), stateListDrawable, null);
        setOutlineProvider(new a(0));
        setClipToOutline(true);
        this.r = rippleDrawable;
        return rippleDrawable;
    }

    public final boolean f() {
        if (!this.f1094s && this.c) {
            return true;
        }
        return false;
    }

    public final void g(boolean z9) {
        if (getVisibility() == 4) {
            return;
        }
        if (z9) {
            this.f1090n.cancel();
            startAnimation(this.f1091o);
        }
        super.setVisibility(4);
    }

    public int getButtonSize() {
        return this.f1081b;
    }

    public int getColorDisabled() {
        return this.f1086j;
    }

    public int getColorNormal() {
        return this.f1084h;
    }

    public int getColorPressed() {
        return this.f1085i;
    }

    public int getColorRipple() {
        return this.f1087k;
    }

    public Animation getHideAnimation() {
        return this.f1091o;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.f1088l;
        if (drawable != null) {
            return drawable;
        }
        return new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.f1092p;
    }

    public k getLabelView() {
        return (k) getTag(R.id.fab_label);
    }

    public int getLabelVisibility() {
        k labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.T;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f1093q;
    }

    public synchronized int getProgress() {
        int i10;
        if (this.F) {
            i10 = 0;
        } else {
            i10 = this.P;
        }
        return i10;
    }

    public int getShadowColor() {
        return this.d;
    }

    public int getShadowRadius() {
        return this.e;
    }

    public int getShadowXOffset() {
        return this.f1082f;
    }

    public int getShadowYOffset() {
        return this.f1083g;
    }

    public Animation getShowAnimation() {
        return this.f1090n;
    }

    public final void h() {
        RippleDrawable rippleDrawable = this.r;
        rippleDrawable.setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
        rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        rippleDrawable.setVisible(true, true);
    }

    public final void i() {
        RippleDrawable rippleDrawable = this.r;
        rippleDrawable.setState(new int[]{android.R.attr.state_enabled});
        rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        rippleDrawable.setVisible(true, true);
    }

    public final void j() {
        if (!this.B) {
            if (this.f1099z == -1.0f) {
                this.f1099z = getX();
            }
            if (this.A == -1.0f) {
                this.A = getY();
            }
            this.B = true;
        }
    }

    public final synchronized void k(int i10, boolean z9) {
        float f8;
        if (this.F) {
            return;
        }
        this.P = i10;
        this.Q = z9;
        if (!this.B) {
            this.S = true;
            return;
        }
        this.f1095u = true;
        this.f1098y = true;
        l();
        j();
        n();
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i11 = this.T;
            if (i10 > i11) {
                i10 = i11;
            }
        }
        float f10 = i10;
        if (f10 == this.O) {
            return;
        }
        int i12 = this.T;
        if (i12 > 0) {
            f8 = (f10 / i12) * 360.0f;
        } else {
            f8 = 0.0f;
        }
        this.O = f8;
        this.G = SystemClock.uptimeMillis();
        if (!z9) {
            this.N = this.O;
        }
        invalidate();
    }

    public final void l() {
        int i10;
        int i11 = 0;
        if (f()) {
            i10 = getShadowX();
        } else {
            i10 = 0;
        }
        if (f()) {
            i11 = getShadowY();
        }
        int i12 = this.f1096v;
        this.C = new RectF((i12 / 2) + i10, (i12 / 2) + i11, (c() - i10) - (this.f1096v / 2), (b() - i11) - (this.f1096v / 2));
    }

    public final void m(boolean z9) {
        if (getVisibility() == 4) {
            if (z9) {
                this.f1091o.cancel();
                startAnimation(this.f1090n);
            }
            super.setVisibility(0);
        }
    }

    public final void n() {
        LayerDrawable layerDrawable;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (f()) {
            layerDrawable = new LayerDrawable(new Drawable[]{new e(this), e(), getIconDrawable()});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{e(), getIconDrawable()});
        }
        LayerDrawable layerDrawable2 = layerDrawable;
        if (getIconDrawable() != null) {
            i10 = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight());
        } else {
            i10 = -1;
        }
        int circleSize = getCircleSize();
        if (i10 <= 0) {
            i10 = this.f1089m;
        }
        int i14 = (circleSize - i10) / 2;
        if (f()) {
            i11 = Math.abs(this.f1082f) + this.e;
        } else {
            i11 = 0;
        }
        if (f()) {
            i13 = Math.abs(this.f1083g) + this.e;
        }
        if (this.f1095u) {
            int i15 = this.f1096v;
            i11 += i15;
            i13 += i15;
        }
        if (f()) {
            i12 = 2;
        } else {
            i12 = 1;
        }
        int i16 = i11 + i14;
        int i17 = i13 + i14;
        layerDrawable2.setLayerInset(i12, i16, i17, i16, i17);
        setBackgroundCompat(layerDrawable2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f1095u) {
            if (this.U) {
                canvas.drawArc(this.C, 360.0f, 360.0f, false, this.D);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            boolean z9 = this.F;
            Paint paint = this.E;
            boolean z10 = true;
            if (z9) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.G;
                float f8 = (((float) uptimeMillis) * this.H) / 1000.0f;
                long j10 = this.I;
                int i10 = this.L;
                if (j10 >= 200) {
                    double d = this.J + uptimeMillis;
                    this.J = d;
                    if (d > 500.0d) {
                        this.J = d - 500.0d;
                        this.I = 0L;
                        this.K = !this.K;
                    }
                    float cos = (((float) Math.cos(((this.J / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f10 = 270 - i10;
                    if (this.K) {
                        this.M = cos * f10;
                    } else {
                        float f11 = (1.0f - cos) * f10;
                        this.N = (this.M - f11) + this.N;
                        this.M = f11;
                    }
                } else {
                    this.I = j10 + uptimeMillis;
                }
                float f12 = this.N + f8;
                this.N = f12;
                if (f12 > 360.0f) {
                    this.N = f12 - 360.0f;
                }
                this.G = SystemClock.uptimeMillis();
                float f13 = this.N - 90.0f;
                float f14 = i10 + this.M;
                if (isInEditMode()) {
                    f13 = 0.0f;
                    f14 = 135.0f;
                }
                canvas2.drawArc(this.C, f13, f14, false, paint);
            } else {
                if (this.N != this.O) {
                    float uptimeMillis2 = (((float) (SystemClock.uptimeMillis() - this.G)) / 1000.0f) * this.H;
                    float f15 = this.N;
                    float f16 = this.O;
                    if (f15 > f16) {
                        this.N = Math.max(f15 - uptimeMillis2, f16);
                    } else {
                        this.N = Math.min(f15 + uptimeMillis2, f16);
                    }
                    this.G = SystemClock.uptimeMillis();
                } else {
                    z10 = false;
                }
                canvas2.drawArc(this.C, -90.0f, this.N, false, paint);
            }
            if (z10) {
                invalidate();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(c(), b());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z1.d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z1.d dVar = (z1.d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.N = dVar.f6692b;
        this.O = dVar.c;
        this.H = dVar.d;
        this.f1096v = dVar.f6693f;
        this.w = dVar.f6694g;
        this.f1097x = dVar.f6695h;
        this.R = dVar.f6699l;
        this.S = dVar.f6700m;
        this.P = dVar.e;
        this.Q = dVar.f6701n;
        this.U = dVar.f6702o;
        this.G = SystemClock.uptimeMillis();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, z1.d] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f6692b = this.N;
        baseSavedState.c = this.O;
        baseSavedState.d = this.H;
        baseSavedState.f6693f = this.f1096v;
        baseSavedState.f6694g = this.w;
        baseSavedState.f6695h = this.f1097x;
        boolean z10 = this.F;
        baseSavedState.f6699l = z10;
        if (this.f1095u && this.P > 0 && !z10) {
            z9 = true;
        } else {
            z9 = false;
        }
        baseSavedState.f6700m = z9;
        baseSavedState.e = this.P;
        baseSavedState.f6701n = this.Q;
        baseSavedState.f6702o = this.U;
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f8;
        float x9;
        j();
        if (this.R) {
            setIndeterminate(true);
            this.R = false;
        } else if (this.S) {
            k(this.P, this.Q);
            this.S = false;
        } else if (this.f1098y) {
            boolean z9 = this.f1095u;
            float f10 = this.f1099z;
            if (z9) {
                if (f10 > getX()) {
                    x9 = getX() + this.f1096v;
                } else {
                    x9 = getX() - this.f1096v;
                }
                f10 = x9;
                if (this.A > getY()) {
                    f8 = getY() + this.f1096v;
                } else {
                    f8 = getY() - this.f1096v;
                }
            } else {
                f8 = this.A;
            }
            setX(f10);
            setY(f8);
            this.f1098y = false;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        l();
        int i14 = this.f1097x;
        Paint paint = this.D;
        paint.setColor(i14);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f1096v);
        int i15 = this.w;
        Paint paint2 = this.E;
        paint2.setColor(i15);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f1096v);
        n();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1093q != null && isEnabled()) {
            k kVar = (k) getTag(R.id.fab_label);
            if (kVar == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 3) {
                    kVar.d();
                    i();
                }
            } else {
                kVar.d();
                i();
            }
            this.V.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            i.k("Use @FabSize constants only!");
        } else if (this.f1081b != i10) {
            this.f1081b = i10;
            n();
        }
    }

    public void setColorDisabled(int i10) {
        if (i10 != this.f1086j) {
            this.f1086j = i10;
            n();
        }
    }

    public void setColorDisabledResId(int i10) {
        setColorDisabled(getResources().getColor(i10));
    }

    public void setColorNormal(int i10) {
        if (this.f1084h != i10) {
            this.f1084h = i10;
            n();
        }
    }

    public void setColorNormalResId(int i10) {
        setColorNormal(getResources().getColor(i10));
    }

    public void setColorPressed(int i10) {
        if (i10 != this.f1085i) {
            this.f1085i = i10;
            n();
        }
    }

    public void setColorPressedResId(int i10) {
        setColorPressed(getResources().getColor(i10));
    }

    public void setColorRipple(int i10) {
        if (i10 != this.f1087k) {
            this.f1087k = i10;
            n();
        }
    }

    public void setColorRippleResId(int i10) {
        setColorRipple(getResources().getColor(i10));
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        if (f8 > 0.0f) {
            super.setElevation(f8);
            if (!isInEditMode()) {
                this.f1094s = true;
                this.c = false;
            }
            n();
        }
    }

    public void setElevationCompat(float f8) {
        this.d = 637534208;
        float f10 = f8 / 2.0f;
        this.e = Math.round(f10);
        this.f1082f = 0;
        if (this.f1081b == 0) {
            f10 = f8;
        }
        this.f1083g = Math.round(f10);
        super.setElevation(f8);
        this.t = true;
        this.c = false;
        n();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        k kVar = (k) getTag(R.id.fab_label);
        if (kVar != null) {
            kVar.setEnabled(z9);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.f1091o = animation;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f1088l != drawable) {
            this.f1088l = drawable;
            n();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        Drawable drawable = getResources().getDrawable(i10);
        if (this.f1088l != drawable) {
            this.f1088l = drawable;
            n();
        }
    }

    public synchronized void setIndeterminate(boolean z9) {
        if (!z9) {
            try {
                this.N = 0.0f;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1095u = z9;
        this.f1098y = true;
        this.F = z9;
        this.G = SystemClock.uptimeMillis();
        l();
        n();
    }

    public void setLabelText(String str) {
        this.f1092p = str;
        k labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i10) {
        getLabelView().setTextColor(i10);
    }

    public void setLabelVisibility(int i10) {
        boolean z9;
        k labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i10);
            if (i10 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            labelView.setHandleVisibilityChanges(z9);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.t) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin += getShadowX();
            marginLayoutParams.topMargin += getShadowY();
            marginLayoutParams.rightMargin += getShadowX();
            marginLayoutParams.bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i10) {
        this.T = i10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f1093q = onClickListener;
        View view = (View) getTag(R.id.fab_label);
        if (view != null) {
            view.setOnClickListener(new m(2, this));
        }
    }

    public void setShadowColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            n();
        }
    }

    public void setShadowColorResource(int i10) {
        int color = getResources().getColor(i10);
        if (this.d != color) {
            this.d = color;
            n();
        }
    }

    public void setShadowRadius(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.e != dimensionPixelSize) {
            this.e = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShadowXOffset(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f1082f != dimensionPixelSize) {
            this.f1082f = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShadowYOffset(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f1083g != dimensionPixelSize) {
            this.f1083g = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.f1090n = animation;
    }

    public synchronized void setShowProgressBackground(boolean z9) {
        this.U = z9;
    }

    public void setShowShadow(boolean z9) {
        if (this.c != z9) {
            this.c = z9;
            n();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        k kVar = (k) getTag(R.id.fab_label);
        if (kVar != null) {
            kVar.setVisibility(i10);
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public void setShadowRadius(float f8) {
        this.e = d.e(getContext(), f8);
        requestLayout();
        n();
    }

    public void setShadowXOffset(float f8) {
        this.f1082f = d.e(getContext(), f8);
        requestLayout();
        n();
    }

    public void setShadowYOffset(float f8) {
        this.f1083g = d.e(getContext(), f8);
        requestLayout();
        n();
    }
}
