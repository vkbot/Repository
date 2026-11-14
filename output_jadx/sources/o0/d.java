package o0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import e4.h;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: p, reason: collision with root package name */
    public static final int f4290p = Color.rgb(47, 128, TelnetCommand.SUSP);

    /* renamed from: q, reason: collision with root package name */
    public static final int f4291q = Color.rgb(30, 41, 59);

    /* renamed from: b, reason: collision with root package name */
    public final f f4292b;
    public final Paint c;
    public final Paint d;
    public final Paint e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f4293f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f4294g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4295h;

    /* renamed from: i, reason: collision with root package name */
    public ValueAnimator f4296i;

    /* renamed from: j, reason: collision with root package name */
    public float f4297j;

    /* renamed from: k, reason: collision with root package name */
    public float f4298k;

    /* renamed from: l, reason: collision with root package name */
    public float f4299l;

    /* renamed from: m, reason: collision with root package name */
    public float f4300m;

    /* renamed from: n, reason: collision with root package name */
    public float f4301n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4302o;

    public d(Context context, f fVar) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f4293f = new RectF();
        this.f4294g = new RectF();
        this.f4292b = fVar;
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f4295h = f8;
        paint.setStyle(Paint.Style.FILL);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.5f * f8);
        paint3.setStyle(style);
        paint3.setStrokeWidth(2.3f * f8);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setStrokeJoin(Paint.Join.ROUND);
    }

    public static float a(float f8, float f10, float f11) {
        if (f11 < f10) {
            return f10;
        }
        return Math.max(f10, Math.min(f11, f8));
    }

    public static int b(int i10, int i11) {
        return Color.argb(Math.max(0, Math.min(255, i11)), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public final void c() {
        this.f4302o = false;
        ValueAnimator valueAnimator = this.f4296i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f4301n, 0.0f);
        this.f4296i = ofFloat;
        ofFloat.setDuration(180L);
        this.f4296i.addUpdateListener(new h(2, this));
        this.f4296i.start();
    }

    public final void d(float f8, float f10, float f11, float f12, float f13) {
        ValueAnimator valueAnimator = this.f4296i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4296i = null;
        }
        this.f4297j = a(f8, 0.0f, Math.max(0, getWidth()));
        this.f4298k = a(f10, 0.0f, Math.max(0, getHeight()));
        this.f4299l = f11;
        this.f4300m = f12;
        this.f4302o = true;
        this.f4301n = Math.max(0.18f, f13);
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f4296i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4296i = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9;
        float f8;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        f fVar;
        int i10;
        float f15;
        float f16;
        float f17;
        super.onDraw(canvas);
        if (this.f4301n <= 0.01f) {
            return;
        }
        f fVar2 = f.f4306f;
        f fVar3 = this.f4292b;
        if (fVar3 != fVar2 && fVar3 != f.f4307g) {
            z9 = false;
        } else {
            z9 = true;
        }
        float width = getWidth();
        float height = getHeight();
        float f18 = this.f4295h;
        if (z9) {
            f8 = 3.0f * f18;
        } else {
            f8 = 0.0f;
        }
        float f19 = 8.0f * f18;
        if (z9) {
            f10 = height;
        } else {
            f10 = width;
        }
        float max = Math.max(f19, Math.min(f10, 18.0f * f18));
        float a10 = a(this.f4297j, 0.0f, width);
        float a11 = a(this.f4298k, 0.0f, height);
        if (this.f4302o) {
            f11 = 1.0f;
        } else {
            f11 = this.f4301n;
        }
        Paint paint = this.d;
        RectF rectF = this.f4294g;
        int i11 = f4290p;
        Paint paint2 = this.c;
        boolean z10 = z9;
        RectF rectF2 = this.f4293f;
        if (z10) {
            float f20 = max / 2.0f;
            float f21 = (height - f8) - f20;
            float f22 = f21 - f20;
            f12 = f18;
            float f23 = width - f8;
            f13 = f11;
            float f24 = f21 + f20;
            rectF2.set(f8, f22, f23, f24);
            paint2.setColor(b(i11, (int) (f13 * 34.0f)));
            canvas.drawRoundRect(rectF2, max, max, paint2);
            float f25 = this.f4299l;
            float f26 = this.f4300m;
            float f27 = f8;
            float sqrt = (float) Math.sqrt((f26 * f26) + (f25 * f25));
            float f28 = 72.0f * f12;
            float a12 = a((sqrt * 0.16f) + f28, f28, Math.max(f28, width - (f27 * 2.0f))) / 2.0f;
            float a13 = a(a10, f27 + a12, f23 - a12);
            rectF.set(a13 - a12, f22, a13 + a12, f24);
            paint2.setColor(b(i11, (int) (((this.f4301n * 90.0f) + 70.0f) * f13)));
            canvas.drawRoundRect(rectF, max, max, paint2);
            paint.setColor(b(i11, (int) (f13 * 120.0f)));
            canvas.drawRoundRect(rectF, max, max, paint);
            paint2.setColor(b(-1, (int) (f13 * 160.0f)));
            canvas.drawCircle(a(a10, f27 + f20, f23 - f20), f21, max * 0.28f, paint2);
            fVar = fVar3;
            i10 = -1;
        } else {
            f12 = f18;
            float f29 = f8;
            f13 = f11;
            if (fVar3 != f.f4305b && fVar3 != f.c) {
                f14 = (width - f29) - (max / 2.0f);
            } else {
                f14 = (max / 2.0f) + f29;
            }
            float f30 = max / 2.0f;
            float f31 = f14 - f30;
            float f32 = f14 + f30;
            float f33 = height - f29;
            rectF2.set(f31, f29, f32, f33);
            paint2.setColor(b(i11, (int) (f13 * 34.0f)));
            canvas.drawRoundRect(rectF2, max, max, paint2);
            float f34 = this.f4299l;
            float f35 = this.f4300m;
            float f36 = (f35 * f35) + (f34 * f34);
            fVar = fVar3;
            float f37 = f14;
            float f38 = 72.0f * f12;
            float a14 = a((((float) Math.sqrt(f36)) * 0.16f) + f38, f38, Math.max(f38, height - (f29 * 2.0f))) / 2.0f;
            float a15 = a(a11, f29 + a14, f33 - a14);
            rectF.set(f31, a15 - a14, f32, a15 + a14);
            paint2.setColor(b(i11, (int) (((this.f4301n * 90.0f) + 70.0f) * f13)));
            canvas.drawRoundRect(rectF, max, max, paint2);
            paint.setColor(b(i11, (int) (f13 * 120.0f)));
            canvas.drawRoundRect(rectF, max, max, paint);
            i10 = -1;
            paint2.setColor(b(-1, (int) (f13 * 160.0f)));
            canvas.drawCircle(f37, a(a11, f29 + f30, f33 - f30), max * 0.28f, paint2);
        }
        float f39 = this.f4299l;
        float f40 = this.f4300m;
        float a16 = a(((float) Math.sqrt((f40 * f40) + (f39 * f39))) * 0.26f, 12.0f * f12, 34.0f * f12);
        float f41 = this.f4299l;
        float f42 = this.f4300m;
        float sqrt2 = (float) Math.sqrt((f42 * f42) + (f41 * f41));
        if (sqrt2 < 4.0f * f12) {
            if (z10) {
                f16 = 0.0f;
            } else {
                if (fVar == f.f4305b || fVar == f.c) {
                    i10 = 1;
                }
                f16 = i10;
            }
            if (z10) {
                f17 = -1.0f;
            } else {
                f17 = 0.0f;
            }
            f41 = f16;
            f42 = f17;
            f15 = 1.0f;
        } else {
            f15 = sqrt2;
        }
        float f43 = f41 / f15;
        float f44 = f42 / f15;
        float f45 = f43 * a16;
        float a17 = a(a10 - (f45 * 0.35f), 0.0f, getWidth());
        float f46 = a16 * f44;
        float a18 = a(a11 - (0.35f * f46), 0.0f, getHeight());
        float a19 = a(a10 + f45, 0.0f, getWidth());
        float a20 = a(a11 + f46, 0.0f, getHeight());
        int b10 = b(f4291q, (int) (f13 * 170.0f));
        Paint paint3 = this.e;
        paint3.setColor(b10);
        canvas.drawLine(a17, a18, a19, a20, paint3);
        float f47 = 6.0f * f12;
        float f48 = f43 * f47;
        float f49 = a19 - f48;
        float f50 = f44 * f47;
        float f51 = f50 * 0.65f;
        float f52 = a20 - f50;
        float f53 = f48 * 0.65f;
        canvas.drawLine(a19, a20, a(f49 - f51, 0.0f, getWidth()), a(f52 + f53, 0.0f, getHeight()), paint3);
        canvas.drawLine(a19, a20, a(f49 + f51, 0.0f, getWidth()), a(f52 - f53, 0.0f, getHeight()), paint3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f4297j == 0.0f && this.f4298k == 0.0f) {
            this.f4297j = i10 / 2.0f;
            this.f4298k = i11 / 2.0f;
        }
    }
}
