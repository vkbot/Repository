package z3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.BitSet;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class k extends Drawable implements TintAwareDrawable, z {
    public static final Paint G;
    public static final j[] H;
    public o A;
    public SpringForce B;
    public final SpringAnimation[] C;
    public float[] D;
    public float[] E;
    public i F;

    /* renamed from: b, reason: collision with root package name */
    public final g f6764b;
    public h c;
    public final x[] d;
    public final x[] e;

    /* renamed from: f, reason: collision with root package name */
    public final BitSet f6765f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6766g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6767h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f6768i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f6769j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f6770k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f6771l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f6772m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f6773n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f6774o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f6775p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f6776q;
    public final y3.a r;

    /* renamed from: s, reason: collision with root package name */
    public final g f6777s;
    public final q t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f6778u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f6779v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f6780x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6781y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6782z;

    static {
        Paint paint = new Paint(1);
        G = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        H = new j[4];
        int i10 = 0;
        while (true) {
            j[] jVarArr = H;
            if (i10 < jVarArr.length) {
                jVarArr[i10] = new j(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    public k(h hVar) {
        q qVar;
        this.f6764b = new g(this);
        this.d = new x[4];
        this.e = new x[4];
        this.f6765f = new BitSet(8);
        this.f6768i = new Matrix();
        this.f6769j = new Path();
        this.f6770k = new Path();
        this.f6771l = new RectF();
        this.f6772m = new RectF();
        this.f6773n = new Region();
        this.f6774o = new Region();
        Paint paint = new Paint(1);
        this.f6775p = paint;
        Paint paint2 = new Paint(1);
        this.f6776q = paint2;
        this.r = new y3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = p.f6803a;
        } else {
            qVar = new q();
        }
        this.t = qVar;
        this.f6780x = new RectF();
        this.f6781y = true;
        this.f6782z = true;
        this.C = new SpringAnimation[4];
        this.c = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.f6777s = new g(this);
    }

    public static float c(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.f(rectF)) {
                return oVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f8 = fArr[0];
            for (int i10 = 1; i10 < fArr.length; i10++) {
                if (fArr[i10] != f8) {
                    return -1.0f;
                }
            }
        }
        if (oVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void b(RectF rectF, Path path) {
        h hVar = this.c;
        this.t.a(hVar.f6749a, this.D, hVar.f6755j, rectF, this.f6777s, path);
        if (this.c.f6754i != 1.0f) {
            Matrix matrix = this.f6768i;
            matrix.reset();
            float f8 = this.c.f6754i;
            matrix.setScale(f8, f8, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f6780x, true);
    }

    public final int d(int i10) {
        float f8;
        int i11;
        h hVar = this.c;
        float f10 = hVar.f6759n + 0.0f + hVar.f6758m;
        p3.a aVar = hVar.c;
        if (aVar != null && aVar.f4995a && ColorUtils.setAlphaComponent(i10, 255) == aVar.d) {
            if (aVar.e > 0.0f && f10 > 0.0f) {
                f8 = Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f8 = 0.0f;
            }
            int alpha = Color.alpha(i10);
            int c = m3.a.c(f8, ColorUtils.setAlphaComponent(i10, 255), aVar.f4996b);
            if (f8 > 0.0f && (i11 = aVar.c) != 0) {
                c = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i11, p3.a.f4994f), c);
            }
            return ColorUtils.setAlphaComponent(c, alpha);
        }
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f6778u;
        Paint paint2 = this.f6775p;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i10 = this.c.f6757l;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6779v;
        Paint paint3 = this.f6776q;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.c.f6756k);
        int alpha2 = paint3.getAlpha();
        int i11 = this.c.f6757l;
        paint3.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.c.f6762q;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            paint = paint2;
        } else {
            boolean z9 = this.f6766g;
            paint = paint2;
            Path path = this.f6769j;
            if (z9) {
                b(h(), path);
                this.f6766g = false;
            }
            h hVar = this.c;
            hVar.getClass();
            if (hVar.f6760o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.c.f6761p), (int) (Math.cos(Math.toRadians(d)) * this.c.f6761p));
                if (!this.f6781y) {
                    e(canvas);
                    canvas.restore();
                } else {
                    RectF rectF = this.f6780x;
                    int width = (int) (rectF.width() - getBounds().width());
                    int height = (int) (rectF.height() - getBounds().height());
                    if (width >= 0 && height >= 0) {
                        Bitmap createBitmap = Bitmap.createBitmap((this.c.f6760o * 2) + ((int) rectF.width()) + width, (this.c.f6760o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f8 = (getBounds().left - this.c.f6760o) - width;
                        float f10 = (getBounds().top - this.c.f6760o) - height;
                        canvas2.translate(-f8, -f10);
                        e(canvas2);
                        canvas.drawBitmap(createBitmap, f8, f10, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        j1.i.l("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                }
            }
            f(canvas, paint, path, this.c.f6749a, this.D, h());
        }
        if (l()) {
            if (this.f6767h) {
                o oVar = this.c.f6749a;
                n g10 = oVar.g();
                d dVar = oVar.e;
                g gVar = this.f6764b;
                g10.e = gVar.a(dVar);
                g10.f6786f = gVar.a(oVar.f6796f);
                g10.f6788h = gVar.a(oVar.f6798h);
                g10.f6787g = gVar.a(oVar.f6797g);
                this.A = g10.a();
                float[] fArr = this.D;
                if (fArr == null) {
                    this.E = null;
                } else {
                    if (this.E == null) {
                        this.E = new float[fArr.length];
                    }
                    float j10 = j();
                    int i12 = 0;
                    while (true) {
                        float[] fArr2 = this.D;
                        if (i12 >= fArr2.length) {
                            break;
                        }
                        this.E[i12] = Math.max(0.0f, fArr2[i12] - j10);
                        i12++;
                    }
                }
                o oVar2 = this.A;
                float[] fArr3 = this.E;
                float f11 = this.c.f6755j;
                RectF h2 = h();
                RectF rectF2 = this.f6772m;
                rectF2.set(h2);
                float j11 = j();
                rectF2.inset(j11, j11);
                this.t.a(oVar2, fArr3, f11, rectF2, null, this.f6770k);
                this.f6767h = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f6765f.cardinality() > 0) {
            Log.w("k", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.c.f6761p;
        Path path = this.f6769j;
        y3.a aVar = this.r;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f6628a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            x xVar = this.d[i11];
            int i12 = this.c.f6760o;
            Matrix matrix = x.f6819b;
            xVar.a(matrix, aVar, i12, canvas);
            this.e[i11].a(matrix, aVar, this.c.f6760o, canvas);
        }
        if (this.f6781y) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.c.f6761p);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.c.f6761p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, G);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float c = c(rectF, oVar, fArr);
        if (c >= 0.0f) {
            float f8 = c * this.c.f6755j;
            canvas.drawRoundRect(rectF, f8, f8, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void g(Canvas canvas) {
        o oVar = this.A;
        float[] fArr = this.E;
        RectF h2 = h();
        RectF rectF = this.f6772m;
        rectF.set(h2);
        float j10 = j();
        rectF.inset(j10, j10);
        f(canvas, this.f6776q, this.f6770k, oVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.c.f6757l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.c.getClass();
        RectF h2 = h();
        if (h2.isEmpty()) {
            return;
        }
        float c = c(h2, this.c.f6749a, this.D);
        if (c >= 0.0f) {
            outline.setRoundRect(getBounds(), c * this.c.f6755j);
            return;
        }
        boolean z9 = this.f6766g;
        Path path = this.f6769j;
        if (z9) {
            b(h2, path);
            this.f6766g = false;
        }
        o3.c.e(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.c.f6753h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f6773n;
        region.set(bounds);
        RectF h2 = h();
        Path path = this.f6769j;
        b(h2, path);
        Region region2 = this.f6774o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f6771l;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.D;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h2 = h();
        o oVar = this.c.f6749a;
        q qVar = this.t;
        qVar.getClass();
        float a10 = oVar.e.a(h2);
        o oVar2 = this.c.f6749a;
        qVar.getClass();
        float a11 = oVar2.f6798h.a(h2) + a10;
        o oVar3 = this.c.f6749a;
        qVar.getClass();
        float a12 = a11 - oVar3.f6797g.a(h2);
        o oVar4 = this.c.f6749a;
        qVar.getClass();
        return (a12 - oVar4.f6796f.a(h2)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6766g = true;
        this.f6767h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.c.f6751f;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.c.getClass();
                ColorStateList colorStateList2 = this.c.e;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.c.d;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        b0 b0Var = this.c.f6750b;
                        if (b0Var == null || !b0Var.d()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final float j() {
        if (l()) {
            return this.f6776q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.D;
        if (fArr != null) {
            return fArr[3];
        }
        return this.c.f6749a.e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.c.f6762q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6776q.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void m(Context context) {
        this.c.c = new p3.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.c = new h(this.c);
        return this;
    }

    public final boolean n() {
        if (!this.c.f6749a.f(h())) {
            float[] fArr = this.D;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f8 = fArr[0];
                    for (int i10 = 1; i10 < fArr.length; i10++) {
                        if (fArr[i10] != f8) {
                            break;
                        }
                    }
                }
                if (this.c.f6749a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(SpringForce springForce) {
        if (this.B != springForce) {
            this.B = springForce;
            int i10 = 0;
            while (true) {
                SpringAnimation[] springAnimationArr = this.C;
                if (i10 < springAnimationArr.length) {
                    if (springAnimationArr[i10] == null) {
                        springAnimationArr[i10] = new SpringAnimation(this, H[i10]);
                    }
                    springAnimationArr[i10].setSpring(new SpringForce().setDampingRatio(springForce.getDampingRatio()).setStiffness(springForce.getStiffness()));
                    i10++;
                } else {
                    v(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6766g = true;
        this.f6767h = true;
        super.onBoundsChange(rect);
        if (this.c.f6750b != null && !rect.isEmpty()) {
            v(getState(), this.f6782z);
        }
        this.f6782z = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, s3.i
    public boolean onStateChange(int[] iArr) {
        boolean z9 = false;
        if (this.c.f6750b != null) {
            v(iArr, false);
        }
        boolean u8 = u(iArr);
        boolean w = w();
        if (u8 || w) {
            z9 = true;
        }
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    public final void p(float f8) {
        h hVar = this.c;
        if (hVar.f6759n != f8) {
            hVar.f6759n = f8;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        h hVar = this.c;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f8) {
        h hVar = this.c;
        if (hVar.f6755j != f8) {
            hVar.f6755j = f8;
            this.f6766g = true;
            this.f6767h = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.r.a(-12303292);
        this.c.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h hVar = this.c;
        if (hVar.f6757l != i10) {
            hVar.f6757l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.c.getClass();
        super.invalidateSelf();
    }

    @Override // z3.z
    public final void setShapeAppearanceModel(o oVar) {
        h hVar = this.c;
        hVar.f6749a = oVar;
        hVar.f6750b = null;
        this.D = null;
        this.E = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.c.f6751f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.c;
        if (hVar.f6752g != mode) {
            hVar.f6752g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(b0 b0Var) {
        h hVar = this.c;
        if (hVar.f6750b != b0Var) {
            hVar.f6750b = b0Var;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z9;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.c.d != null && color2 != (colorForState2 = this.c.d.getColorForState(iArr, (color2 = (paint2 = this.f6775p).getColor())))) {
            paint2.setColor(colorForState2);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.c.e != null && color != (colorForState = this.c.e.getColorForState(iArr, (color = (paint = this.f6776q).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z9;
    }

    public final void v(int[] iArr, boolean z9) {
        boolean z10;
        o a10;
        d dVar;
        int i10;
        RectF h2 = h();
        if (this.c.f6750b != null && !h2.isEmpty()) {
            if (this.B == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z9 | z10;
            if (this.D == null) {
                this.D = new float[4];
            }
            b0 b0Var = this.c.f6750b;
            o[] oVarArr = b0Var.d;
            int i11 = b0Var.f6737a;
            int[][] iArr2 = b0Var.c;
            a0 a0Var = b0Var.f6741h;
            a0 a0Var2 = b0Var.f6740g;
            a0 a0Var3 = b0Var.f6739f;
            a0 a0Var4 = b0Var.e;
            int i12 = 0;
            while (true) {
                if (i12 < i11) {
                    if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i13 = 0;
                while (true) {
                    if (i13 < i11) {
                        if (StateSet.stateSetMatches(iArr2[i13], iArr3)) {
                            i10 = i13;
                            break;
                        }
                        i13++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                i12 = i10;
            }
            if (a0Var4 == null && a0Var3 == null && a0Var2 == null && a0Var == null) {
                a10 = oVarArr[i12];
            } else {
                n g10 = oVarArr[i12].g();
                if (a0Var4 != null) {
                    g10.e = a0Var4.c(iArr);
                }
                if (a0Var3 != null) {
                    g10.f6786f = a0Var3.c(iArr);
                }
                if (a0Var2 != null) {
                    g10.f6788h = a0Var2.c(iArr);
                }
                if (a0Var != null) {
                    g10.f6787g = a0Var.c(iArr);
                }
                a10 = g10.a();
            }
            for (int i14 = 0; i14 < 4; i14++) {
                this.t.getClass();
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            dVar = a10.f6796f;
                        } else {
                            dVar = a10.e;
                        }
                    } else {
                        dVar = a10.f6798h;
                    }
                } else {
                    dVar = a10.f6797g;
                }
                float a11 = dVar.a(h2);
                if (z11) {
                    this.D[i14] = a11;
                }
                SpringAnimation[] springAnimationArr = this.C;
                SpringAnimation springAnimation = springAnimationArr[i14];
                if (springAnimation != null) {
                    springAnimation.animateToFinalPosition(a11);
                    if (z11) {
                        springAnimationArr[i14].skipToEnd();
                    }
                }
            }
            if (z11) {
                invalidateSelf();
            }
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6778u;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f6779v;
        h hVar = this.c;
        ColorStateList colorStateList = hVar.f6751f;
        PorterDuff.Mode mode = hVar.f6752g;
        if (colorStateList != null && mode != null) {
            int d = d(colorStateList.getColorForState(getState(), 0));
            this.w = d;
            porterDuffColorFilter = new PorterDuffColorFilter(d, mode);
        } else {
            int color = this.f6775p.getColor();
            int d10 = d(color);
            this.w = d10;
            if (d10 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.f6778u = porterDuffColorFilter;
        this.c.getClass();
        this.f6779v = null;
        this.c.getClass();
        if (!ObjectsCompat.equals(porterDuffColorFilter2, this.f6778u) || !ObjectsCompat.equals(porterDuffColorFilter3, this.f6779v)) {
            return true;
        }
        return false;
    }

    public final void x() {
        h hVar = this.c;
        float f8 = hVar.f6759n + 0.0f;
        hVar.f6760o = (int) Math.ceil(0.75f * f8);
        this.c.f6761p = (int) Math.ceil(f8 * 0.25f);
        w();
        super.invalidateSelf();
    }

    public k(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(o.c(context, attributeSet, i10, i11).a());
    }

    public k(o oVar) {
        this(new h(oVar));
    }

    public k() {
        this(new o());
    }
}
