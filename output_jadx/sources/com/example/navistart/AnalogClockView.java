package com.example.navistart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import e0.l2;
import java.util.Calendar;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class AnalogClockView extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f698b;
    public double c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f699f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f700g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f701h;

    /* renamed from: i, reason: collision with root package name */
    public int f702i;

    /* renamed from: j, reason: collision with root package name */
    public int f703j;

    /* renamed from: k, reason: collision with root package name */
    public final TypedArray f704k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f705l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f706m;

    /* renamed from: n, reason: collision with root package name */
    public int f707n;

    /* renamed from: o, reason: collision with root package name */
    public int f708o;

    /* renamed from: p, reason: collision with root package name */
    public int f709p;

    /* renamed from: q, reason: collision with root package name */
    public int f710q;
    public int r;

    /* renamed from: s, reason: collision with root package name */
    public int f711s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f712u;

    /* renamed from: v, reason: collision with root package name */
    public int f713v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public int f714x;

    public AnalogClockView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f704k = context.getTheme().obtainStyledAttributes(attributeSet, l2.f1961a, 0, 0);
    }

    public final void a(int i10, Paint.Style style, int i11) {
        this.f700g.reset();
        this.f700g.setColor(i10);
        this.f700g.setStyle(style);
        this.f700g.setStrokeWidth(i11);
        this.f700g.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (!this.f699f) {
            int height = getHeight();
            int width = getWidth();
            this.d = width / 2;
            this.e = height / 2;
            int min = Math.min(height, width);
            this.f698b = (min / 2) - 50;
            this.c = -1.4660766124725342d;
            this.f700g = new Paint();
            this.f701h = new Rect();
            int i10 = this.f698b;
            this.f702i = i10 - (i10 / 2);
            this.f703j = i10 - (i10 / 4);
            TypedArray typedArray = this.f704k;
            this.f705l = typedArray.getBoolean(11, false);
            this.f706m = typedArray.getBoolean(10, false);
            this.f707n = typedArray.getColor(7, ViewCompat.MEASURED_STATE_MASK);
            this.f708o = typedArray.getColor(8, SupportMenu.CATEGORY_MASK);
            this.f709p = typedArray.getColor(5, ViewCompat.MEASURED_STATE_MASK);
            this.f710q = typedArray.getColor(3, ViewCompat.MEASURED_STATE_MASK);
            this.r = typedArray.getColor(0, ViewCompat.MEASURED_STATE_MASK);
            this.f711s = typedArray.getColor(2, -1);
            this.t = typedArray.getInt(1, 8);
            this.f712u = typedArray.getInt(9, 7);
            this.f713v = typedArray.getInt(6, 9);
            this.w = typedArray.getInt(4, 12);
            this.f714x = min / 12;
            typedArray.recycle();
            this.f699f = true;
        }
        a(this.f711s, Paint.Style.FILL, this.t);
        canvas.drawCircle(this.d, this.e, this.f698b, this.f700g);
        int i11 = this.r;
        Paint.Style style = Paint.Style.STROKE;
        a(i11, style, this.t);
        canvas.drawCircle(this.d, this.e, this.f698b, this.f700g);
        Calendar calendar = Calendar.getInstance();
        float f8 = calendar.get(11);
        if (f8 > 12.0f) {
            f8 -= 12.0f;
        }
        float f10 = calendar.get(12);
        float f11 = calendar.get(13);
        double d = f10;
        a(this.f710q, style, this.w);
        double d10 = (((((d / 60.0d) + f8) * 5.0d) * 3.141592653589793d) / 30.0d) - 1.5707963267948966d;
        this.c = d10;
        int i12 = this.d;
        canvas.drawLine(i12, this.e, (float) ((Math.cos(d10) * this.f702i) + i12), (float) ((Math.sin(this.c) * this.f702i) + this.e), this.f700g);
        a(this.f709p, style, this.f713v);
        double d11 = ((d * 3.141592653589793d) / 30.0d) - 1.5707963267948966d;
        this.c = d11;
        int i13 = this.d;
        canvas.drawLine(i13, this.e, (float) ((Math.cos(d11) * this.f703j) + i13), (float) ((Math.sin(this.c) * this.f702i) + this.e), this.f700g);
        if (this.f705l) {
            this.f700g.reset();
            a(this.f708o, style, this.f712u);
            double d12 = ((f11 * 3.141592653589793d) / 30.0d) - 1.5707963267948966d;
            this.c = d12;
            int i14 = this.d;
            canvas2 = canvas;
            canvas2.drawLine(i14, this.e, (float) ((Math.cos(d12) * this.f703j) + i14), (float) ((Math.sin(this.c) * this.f702i) + this.e), this.f700g);
        } else {
            canvas2 = canvas;
        }
        if (this.f706m) {
            this.f700g.reset();
            this.f700g.setColor(this.f707n);
            this.f700g.setTextSize(this.f714x);
            for (int i15 = 1; i15 <= 12; i15++) {
                String valueOf = String.valueOf(i15);
                this.f700g.getTextBounds(valueOf, 0, valueOf.length(), this.f701h);
                double d13 = (i15 - 3) * 0.5235987755982988d;
                canvas2.drawText(valueOf, (int) ((((Math.cos(d13) * this.f698b) / 1.2d) + this.d) - (this.f701h.width() / 2)), (int) (((Math.sin(d13) * this.f698b) / 1.2d) + this.e + (this.f701h.height() / 2)), this.f700g);
            }
        }
        if (this.f705l) {
            postInvalidateDelayed(500L);
        } else {
            postInvalidateDelayed(5000L);
        }
    }
}
