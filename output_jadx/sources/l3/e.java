package l3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s3.i;
import s3.j;
import w3.f;
import z3.g;
import z3.h;
import z3.k;
import z3.n;
import z3.o;
import z3.q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends k implements Drawable.Callback, i {
    public static final int[] Q0 = {R.attr.state_enabled};
    public static final ShapeDrawable R0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E0;
    public ColorFilter F0;
    public PorterDuffColorFilter G0;
    public ColorStateList H0;
    public ColorStateList I;
    public PorterDuff.Mode I0;
    public ColorStateList J;
    public int[] J0;
    public float K;
    public ColorStateList K0;
    public float L;
    public WeakReference L0;
    public ColorStateList M;
    public TextUtils.TruncateAt M0;
    public float N;
    public boolean N0;
    public ColorStateList O;
    public int O0;
    public CharSequence P;
    public boolean P0;
    public boolean Q;
    public Drawable R;
    public ColorStateList S;
    public float T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public RippleDrawable X;
    public ColorStateList Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public CharSequence f3495a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3496b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3497c0;

    /* renamed from: d0, reason: collision with root package name */
    public Drawable f3498d0;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f3499e0;

    /* renamed from: f0, reason: collision with root package name */
    public b3.e f3500f0;

    /* renamed from: g0, reason: collision with root package name */
    public b3.e f3501g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f3502h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f3503i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f3504j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f3505k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f3506l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f3507m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f3508n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f3509o0;

    /* renamed from: p0, reason: collision with root package name */
    public final Context f3510p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Paint f3511q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Paint.FontMetrics f3512r0;

    /* renamed from: s0, reason: collision with root package name */
    public final RectF f3513s0;

    /* renamed from: t0, reason: collision with root package name */
    public final PointF f3514t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Path f3515u0;

    /* renamed from: v0, reason: collision with root package name */
    public final j f3516v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3517w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3518x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f3519y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3520z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.example.navistart.R.attr.chipStyle, com.example.navistart.R.style.Widget_MaterialComponents_Chip_Action);
        this.L = -1.0f;
        this.f3511q0 = new Paint(1);
        this.f3512r0 = new Paint.FontMetrics();
        this.f3513s0 = new RectF();
        this.f3514t0 = new PointF();
        this.f3515u0 = new Path();
        this.E0 = 255;
        this.I0 = PorterDuff.Mode.SRC_IN;
        this.L0 = new WeakReference(null);
        m(context);
        this.f3510p0 = context;
        j jVar = new j(this);
        this.f3516v0 = jVar;
        this.P = "";
        jVar.f5702a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q0;
        setState(iArr);
        W(iArr);
        this.N0 = true;
        R0.setTint(-1);
    }

    public static boolean D(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean E(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        Drawable drawable;
        if (!d0() && !c0()) {
            return 0.0f;
        }
        float f8 = this.f3503i0;
        if (this.C0) {
            drawable = this.f3498d0;
        } else {
            drawable = this.R;
        }
        float f10 = this.T;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f8 + this.f3504j0;
    }

    public final float B() {
        if (e0()) {
            return this.f3507m0 + this.Z + this.f3508n0;
        }
        return 0.0f;
    }

    public final float C() {
        if (this.P0) {
            return k();
        }
        return this.L;
    }

    public final void F() {
        d dVar = (d) this.L0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.c(chip.f1287m);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.e.G(int[], int[]):boolean");
    }

    public final void H(boolean z9) {
        if (this.f3496b0 != z9) {
            this.f3496b0 = z9;
            float A = A();
            if (!z9 && this.C0) {
                this.C0 = false;
            }
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void I(Drawable drawable) {
        if (this.f3498d0 != drawable) {
            float A = A();
            this.f3498d0 = drawable;
            float A2 = A();
            f0(this.f3498d0);
            y(this.f3498d0);
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3499e0 != colorStateList) {
            this.f3499e0 = colorStateList;
            if (this.f3497c0 && (drawable = this.f3498d0) != null && this.f3496b0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z9) {
        if (this.f3497c0 != z9) {
            boolean c02 = c0();
            this.f3497c0 = z9;
            boolean c03 = c0();
            if (c02 != c03) {
                Drawable drawable = this.f3498d0;
                if (c03) {
                    y(drawable);
                } else {
                    f0(drawable);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void L(float f8) {
        if (this.L != f8) {
            this.L = f8;
            n g10 = this.c.f6749a.g();
            g10.e = new z3.a(f8);
            g10.f6786f = new z3.a(f8);
            g10.f6787g = new z3.a(f8);
            g10.f6788h = new z3.a(f8);
            setShapeAppearanceModel(g10.a());
        }
    }

    public final void M(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.R;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = DrawableCompat.unwrap(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            if (drawable != null) {
                drawable4 = DrawableCompat.wrap(drawable).mutate();
            }
            this.R = drawable4;
            float A2 = A();
            f0(drawable2);
            if (d0()) {
                y(this.R);
            }
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void N(float f8) {
        if (this.T != f8) {
            float A = A();
            this.T = f8;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        this.U = true;
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (d0()) {
                this.R.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z9) {
        if (this.Q != z9) {
            boolean d02 = d0();
            this.Q = z9;
            boolean d03 = d0();
            if (d02 != d03) {
                Drawable drawable = this.R;
                if (d03) {
                    y(drawable);
                } else {
                    f0(drawable);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (this.P0) {
                h hVar = this.c;
                if (hVar.e != colorStateList) {
                    hVar.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void R(float f8) {
        if (this.N != f8) {
            this.N = f8;
            this.f3511q0.setStrokeWidth(f8);
            if (this.P0) {
                this.c.f6756k = f8;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void S(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.W;
        Drawable drawable4 = null;
        if (drawable3 != null) {
            drawable2 = DrawableCompat.unwrap(drawable3);
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float B = B();
            if (drawable != null) {
                drawable4 = DrawableCompat.wrap(drawable).mutate();
            }
            this.W = drawable4;
            this.X = new RippleDrawable(x3.a.b(this.O), this.W, R0);
            float B2 = B();
            f0(drawable2);
            if (e0()) {
                y(this.W);
            }
            invalidateSelf();
            if (B != B2) {
                F();
            }
        }
    }

    public final void T(float f8) {
        if (this.f3508n0 != f8) {
            this.f3508n0 = f8;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void U(float f8) {
        if (this.Z != f8) {
            this.Z = f8;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void V(float f8) {
        if (this.f3507m0 != f8) {
            this.f3507m0 = f8;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final boolean W(int[] iArr) {
        if (!Arrays.equals(this.J0, iArr)) {
            this.J0 = iArr;
            if (e0()) {
                return G(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void X(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (e0()) {
                this.W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(boolean z9) {
        if (this.V != z9) {
            boolean e02 = e0();
            this.V = z9;
            boolean e03 = e0();
            if (e02 != e03) {
                Drawable drawable = this.W;
                if (e03) {
                    y(drawable);
                } else {
                    f0(drawable);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Z(float f8) {
        if (this.f3504j0 != f8) {
            float A = A();
            this.f3504j0 = f8;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    @Override // s3.i
    public final void a() {
        F();
        invalidateSelf();
    }

    public final void a0(float f8) {
        if (this.f3503i0 != f8) {
            float A = A();
            this.f3503i0 = f8;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void b0(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            this.K0 = null;
            onStateChange(getState());
        }
    }

    public final boolean c0() {
        if (this.f3497c0 && this.f3498d0 != null && this.C0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if (this.Q && this.R != null) {
            return true;
        }
        return false;
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int i11;
        float f8;
        float f10;
        boolean z9;
        int i12;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.E0) != 0) {
            if (i10 < 255) {
                canvas2 = canvas;
                i11 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                canvas2 = canvas;
                i11 = 0;
            }
            boolean z10 = this.P0;
            Paint paint = this.f3511q0;
            RectF rectF = this.f3513s0;
            if (!z10) {
                paint.setColor(this.f3517w0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, C(), C(), paint);
            }
            if (!this.P0) {
                paint.setColor(this.f3518x0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.F0;
                if (colorFilter == null) {
                    colorFilter = this.G0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, C(), C(), paint);
            }
            if (this.P0) {
                super.draw(canvas);
            }
            if (this.N > 0.0f && !this.P0) {
                paint.setColor(this.f3520z0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.P0) {
                    ColorFilter colorFilter2 = this.F0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.G0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f11 = bounds.left;
                float f12 = this.N / 2.0f;
                rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
                float f13 = this.L - (this.N / 2.0f);
                canvas2.drawRoundRect(rectF, f13, f13, paint);
            }
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.P0) {
                canvas2.drawRoundRect(rectF, C(), C(), paint);
                f8 = 2.0f;
            } else {
                RectF rectF2 = new RectF(bounds);
                h hVar = this.c;
                o oVar = hVar.f6749a;
                float[] fArr = this.D;
                float f14 = hVar.f6755j;
                g gVar = this.f6777s;
                q qVar = this.t;
                f8 = 2.0f;
                Path path = this.f3515u0;
                qVar.a(oVar, fArr, f14, rectF2, gVar, path);
                f(canvas2, paint, path, this.c.f6749a, this.D, h());
            }
            if (d0()) {
                z(bounds, rectF);
                float f15 = rectF.left;
                float f16 = rectF.top;
                canvas2.translate(f15, f16);
                this.R.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.R.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (c0()) {
                z(bounds, rectF);
                float f17 = rectF.left;
                float f18 = rectF.top;
                canvas2.translate(f17, f18);
                this.f3498d0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f3498d0.draw(canvas2);
                canvas2.translate(-f17, -f18);
            }
            if (this.N0 && this.P != null) {
                PointF pointF = this.f3514t0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.P;
                j jVar = this.f3516v0;
                if (charSequence != null) {
                    float A = A() + this.f3502h0 + this.f3505k0;
                    if (DrawableCompat.getLayoutDirection(this) == 0) {
                        pointF.x = bounds.left + A;
                    } else {
                        pointF.x = bounds.right - A;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = jVar.f5702a;
                    Paint.FontMetrics fontMetrics = this.f3512r0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f8);
                }
                rectF.setEmpty();
                if (this.P != null) {
                    float A2 = A() + this.f3502h0 + this.f3505k0;
                    float B = B() + this.f3509o0 + this.f3506l0;
                    int layoutDirection = DrawableCompat.getLayoutDirection(this);
                    int i13 = bounds.left;
                    if (layoutDirection == 0) {
                        rectF.left = i13 + A2;
                        rectF.right = bounds.right - B;
                    } else {
                        rectF.left = i13 + B;
                        rectF.right = bounds.right - A2;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                f fVar = jVar.f5705g;
                TextPaint textPaint2 = jVar.f5702a;
                if (fVar != null) {
                    textPaint2.drawableState = getState();
                    jVar.f5705g.d(this.f3510p0, textPaint2, jVar.f5703b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.P.toString();
                if (!jVar.e) {
                    f10 = jVar.c;
                } else {
                    jVar.a(charSequence2);
                    f10 = jVar.c;
                }
                if (Math.round(f10) > Math.round(rectF.width())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i12 = save;
                } else {
                    i12 = 0;
                }
                CharSequence charSequence3 = this.P;
                if (z9 && this.M0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.M0);
                }
                canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z9) {
                    canvas2.restoreToCount(i12);
                }
            }
            if (e0()) {
                rectF.setEmpty();
                if (e0()) {
                    float f19 = this.f3509o0 + this.f3508n0;
                    if (DrawableCompat.getLayoutDirection(this) == 0) {
                        float f20 = bounds.right - f19;
                        rectF.right = f20;
                        rectF.left = f20 - this.Z;
                    } else {
                        float f21 = bounds.left + f19;
                        rectF.left = f21;
                        rectF.right = f21 + this.Z;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f22 = this.Z;
                    float f23 = exactCenterY - (f22 / f8);
                    rectF.top = f23;
                    rectF.bottom = f23 + f22;
                }
                float f24 = rectF.left;
                float f25 = rectF.top;
                canvas2.translate(f24, f25);
                this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.X.setBounds(this.W.getBounds());
                this.X.jumpToCurrentState();
                this.X.draw(canvas2);
                canvas2.translate(-f24, -f25);
            }
            if (this.E0 < 255) {
                canvas2.restoreToCount(i11);
            }
        }
    }

    public final boolean e0() {
        if (this.V && this.W != null) {
            return true;
        }
        return false;
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float A = A() + this.f3502h0 + this.f3505k0;
        String charSequence = this.P.toString();
        j jVar = this.f3516v0;
        if (jVar.e) {
            jVar.a(charSequence);
        }
        return Math.min(Math.round(B() + jVar.c + A + this.f3506l0 + this.f3509o0), this.O0);
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.L);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.K, this.L);
        }
        outline2.setAlpha(this.E0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!D(this.I) && !D(this.J) && !D(this.M)) {
            f fVar = this.f3516v0.f5705g;
            if (fVar == null || (colorStateList = fVar.f6370k) == null || !colorStateList.isStateful()) {
                if ((!this.f3497c0 || this.f3498d0 == null || !this.f3496b0) && !E(this.R) && !E(this.f3498d0) && !D(this.H0)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (d0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.R, i10);
        }
        if (c0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f3498d0, i10);
        }
        if (e0()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.W, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (d0()) {
            onLevelChange |= this.R.setLevel(i10);
        }
        if (c0()) {
            onLevelChange |= this.f3498d0.setLevel(i10);
        }
        if (e0()) {
            onLevelChange |= this.W.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // z3.k, android.graphics.drawable.Drawable, s3.i
    public final boolean onStateChange(int[] iArr) {
        if (this.P0) {
            super.onStateChange(iArr);
        }
        return G(iArr, this.J0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            invalidateSelf();
        }
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.F0 != colorFilter) {
            this.F0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // z3.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // z3.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.I0 != mode) {
            this.I0 = mode;
            ColorStateList colorStateList = this.H0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.G0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (d0()) {
            visible |= this.R.setVisible(z9, z10);
        }
        if (c0()) {
            visible |= this.f3498d0.setVisible(z9, z10);
        }
        if (e0()) {
            visible |= this.W.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.W) {
                if (drawable.isStateful()) {
                    drawable.setState(this.J0);
                }
                drawable.setTintList(this.Y);
                return;
            }
            Drawable drawable2 = this.R;
            if (drawable == drawable2 && this.U) {
                drawable2.setTintList(this.S);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void z(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!d0() && !c0()) {
            return;
        }
        float f8 = this.f3502h0 + this.f3503i0;
        if (this.C0) {
            drawable = this.f3498d0;
        } else {
            drawable = this.R;
        }
        float f10 = this.T;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        if (DrawableCompat.getLayoutDirection(this) == 0) {
            float f11 = rect.left + f8;
            rectF.left = f11;
            rectF.right = f11 + f10;
        } else {
            float f12 = rect.right - f8;
            rectF.right = f12;
            rectF.left = f12 - f10;
        }
        if (this.C0) {
            drawable2 = this.f3498d0;
        } else {
            drawable2 = this.R;
        }
        float f13 = this.T;
        if (f13 <= 0.0f && drawable2 != null) {
            f13 = (float) Math.ceil(s3.q.a(24, this.f3510p0));
            if (drawable2.getIntrinsicHeight() <= f13) {
                f13 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f13;
    }
}
