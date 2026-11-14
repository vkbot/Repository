package r3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import z3.o;
import z3.p;
import z3.q;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5353b;

    /* renamed from: h, reason: collision with root package name */
    public float f5356h;

    /* renamed from: i, reason: collision with root package name */
    public int f5357i;

    /* renamed from: j, reason: collision with root package name */
    public int f5358j;

    /* renamed from: k, reason: collision with root package name */
    public int f5359k;

    /* renamed from: l, reason: collision with root package name */
    public int f5360l;

    /* renamed from: m, reason: collision with root package name */
    public int f5361m;

    /* renamed from: o, reason: collision with root package name */
    public o f5363o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f5364p;

    /* renamed from: a, reason: collision with root package name */
    public final q f5352a = p.f6803a;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f5354f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final a f5355g = new a(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f5362n = true;

    public b(o oVar) {
        this.f5363o = oVar;
        Paint paint = new Paint(1);
        this.f5353b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z9 = this.f5362n;
        Rect rect = this.d;
        Paint paint = this.f5353b;
        if (z9) {
            copyBounds(rect);
            float height = this.f5356h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{ColorUtils.compositeColors(this.f5357i, this.f5361m), ColorUtils.compositeColors(this.f5358j, this.f5361m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f5358j, 0), this.f5361m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f5360l, 0), this.f5361m), ColorUtils.compositeColors(this.f5360l, this.f5361m), ColorUtils.compositeColors(this.f5359k, this.f5361m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f5362n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        z3.d dVar = this.f5363o.e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f5354f;
        rectF2.set(bounds);
        float min = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        o oVar = this.f5363o;
        rectF2.set(getBounds());
        if (oVar.f(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5355g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f5356h > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        o oVar = this.f5363o;
        Rect bounds = getBounds();
        RectF rectF = this.f5354f;
        rectF.set(bounds);
        if (oVar.f(rectF)) {
            z3.d dVar = this.f5363o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.e;
        rectF2.set(rect);
        o oVar2 = this.f5363o;
        q qVar = this.f5352a;
        Path path = this.c;
        qVar.a(oVar2, null, 1.0f, rectF2, null, path);
        o3.c.e(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        o oVar = this.f5363o;
        Rect bounds = getBounds();
        RectF rectF = this.f5354f;
        rectF.set(bounds);
        if (oVar.f(rectF)) {
            int round = Math.round(this.f5356h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f5364p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f5362n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f5364p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f5361m)) != this.f5361m) {
            this.f5362n = true;
            this.f5361m = colorForState;
        }
        if (this.f5362n) {
            invalidateSelf();
        }
        return this.f5362n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f5353b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5353b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
