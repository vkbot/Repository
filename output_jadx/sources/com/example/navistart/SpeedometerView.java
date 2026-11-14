package com.example.navistart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bumptech.glide.g;
import e0.l2;
import e0.m;
import e0.t2;
import j1.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ByteCompanionObject;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SpeedometerView extends View {

    /* renamed from: b, reason: collision with root package name */
    public double f893b;
    public double c;
    public int d;
    public double e;

    /* renamed from: f, reason: collision with root package name */
    public int f894f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f895g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f896h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f897i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f898j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f899k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f900l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f901m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f902n;

    /* renamed from: o, reason: collision with root package name */
    public int f903o;

    /* renamed from: p, reason: collision with root package name */
    public final Bitmap f904p;

    public SpeedometerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f893b = 100.0d;
        this.c = 0.0d;
        this.d = Color.rgb(180, 180, 180);
        this.e = 20.0d;
        this.f894f = 1;
        this.f895g = new ArrayList();
        float f8 = getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l2.f1963f, 0, 0);
        try {
            setMaxSpeed(obtainStyledAttributes.getFloat(1, 100.0f));
            setSpeed(obtainStyledAttributes.getFloat(2, 0.0f));
            setLabelTextSize(obtainStyledAttributes.getDimensionPixelSize(0, Math.round(f8 * 12.0f)));
            obtainStyledAttributes.recycle();
            if (!isInEditMode()) {
                setLayerType(2, null);
            }
            Paint paint = new Paint(1);
            this.f896h = paint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            this.f896h.setColor(Color.rgb(127, 127, 127));
            Paint paint2 = new Paint(1);
            this.f897i = paint2;
            paint2.setStyle(style);
            this.f897i.setColor(Color.rgb(FTPReply.FILE_STATUS_OK, FTPReply.FILE_STATUS_OK, FTPReply.FILE_STATUS_OK));
            Paint paint3 = new Paint(1);
            this.f901m = paint3;
            paint3.setColor(-1);
            this.f901m.setTextSize(this.f903o);
            this.f901m.setTextAlign(Paint.Align.CENTER);
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.spot_mask);
            this.f904p = decodeResource;
            this.f904p = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), this.f904p.getHeight() / 2);
            Paint paint4 = new Paint(1);
            this.f898j = paint4;
            paint4.setDither(true);
            Paint paint5 = new Paint(1);
            this.f900l = paint5;
            paint5.setStrokeWidth(3.0f);
            Paint paint6 = this.f900l;
            Paint.Style style2 = Paint.Style.STROKE;
            paint6.setStyle(style2);
            this.f900l.setColor(this.d);
            Paint paint7 = new Paint(1);
            this.f902n = paint7;
            paint7.setStyle(style2);
            this.f902n.setStrokeWidth(5.0f);
            this.f902n.setColor(this.d);
            Paint paint8 = new Paint(1);
            this.f899k = paint8;
            paint8.setStrokeWidth(5.0f);
            this.f899k.setStyle(style2);
            this.f899k.setColor(Color.argb(200, 255, 0, 0));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final RectF a(Canvas canvas, float f8) {
        RectF rectF;
        int width = (canvas.getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = ((canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) * 2;
        if (height >= width) {
            float f10 = width * f8;
            rectF = new RectF(0.0f, 0.0f, f10, f10);
        } else {
            float f11 = height * f8;
            rectF = new RectF(0.0f, 0.0f, f11, f11);
        }
        rectF.offset(((width - rectF.width()) / 2.0f) + getPaddingLeft(), ((height - rectF.height()) / 2.0f) + getPaddingTop());
        return rectF;
    }

    public int getDefaultColor() {
        return this.d;
    }

    public t2 getLabelConverter() {
        return null;
    }

    public int getLabelTextSize() {
        return this.f903o;
    }

    public double getMajorTickStep() {
        return this.e;
    }

    public double getMaxSpeed() {
        return this.f893b;
    }

    public int getMinorTicks() {
        return this.f894f;
    }

    public double getSpeed() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.drawColor(0);
        RectF a10 = a(canvas2, 1.0f);
        canvas2.drawArc(a10, 180.0f, 180.0f, true, this.f896h);
        canvas2.drawArc(a(canvas2, 0.9f), 180.0f, 180.0f, true, this.f897i);
        float f8 = 2.0f;
        canvas2.drawBitmap(Bitmap.createScaledBitmap(this.f904p, (int) (a10.width() * 1.1d), ((int) (a10.height() * 1.1d)) / 2, true), a10.centerX() - ((a10.width() * 1.1f) / 2.0f), a10.centerY() - ((a10.width() * 1.1f) / 2.0f), this.f898j);
        float f10 = (float) ((this.e / this.f893b) * 160.0f);
        float f11 = f10 / (this.f894f + 1);
        float f12 = 0.35f;
        float width = a(canvas2, 1.0f).width() * 0.35f;
        float f13 = 10.0f;
        while (f13 <= 170.0f) {
            double d = ((180.0f - f13) / 180.0f) * 3.141592653589793d;
            float f14 = f8;
            double d10 = width - 15.0f;
            float f15 = f10;
            float f16 = f12;
            float f17 = width;
            double d11 = (f13 / 180.0f) * 3.141592653589793d;
            double d12 = f17 + 15.0f;
            canvas2.drawLine((float) ((Math.cos(d) * d10) + r12.centerX()), (float) (r12.centerY() - (Math.sin(d11) * d10)), (float) ((Math.cos(d) * d12) + r12.centerX()), (float) (r12.centerY() - (Math.sin(d11) * d12)), this.f900l);
            int i10 = 1;
            while (i10 <= this.f894f) {
                if ((i10 * f11) + f13 >= (f11 / f14) + 170.0f) {
                    break;
                }
                double d13 = ((180.0f - r1) / 180.0f) * 3.141592653589793d;
                float f18 = f17;
                double d14 = f18;
                float cos = (float) ((Math.cos(d13) * d14) + r12.centerX());
                double d15 = (r1 / 180.0f) * 3.141592653589793d;
                canvas.drawLine(cos, (float) (r12.centerY() - (Math.sin(d15) * d14)), (float) ((Math.cos(d13) * d12) + r12.centerX()), (float) (r12.centerY() - (Math.sin(d15) * d12)), this.f900l);
                i10++;
                f17 = f18;
            }
            canvas2 = canvas;
            f13 += f15;
            width = f17;
            f10 = f15;
            f8 = f14;
            f12 = f16;
        }
        float f19 = f12;
        RectF a11 = a(canvas2, 0.7f);
        this.f902n.setColor(this.d);
        canvas2.drawArc(a11, 185.0f, 170.0f, false, this.f902n);
        Iterator it = this.f895g.iterator();
        if (!it.hasNext()) {
            float width2 = (a(canvas2, 1.0f).width() * f19) + 10.0f;
            RectF a12 = a(canvas2, 0.2f);
            float speed = ((float) ((getSpeed() / getMaxSpeed()) * 160.0d)) + 10.0f;
            double d16 = ((180.0f - speed) / 180.0f) * 3.141592653589793d;
            double d17 = (speed / 180.0f) * 3.141592653589793d;
            double d18 = width2;
            canvas2.drawLine((float) ((Math.cos(d16) * a12.width() * 0.5d) + r2.centerX()), (float) (r2.centerY() - ((Math.sin(d17) * a12.width()) * 0.5d)), (float) ((Math.cos(d16) * d18) + r2.centerX()), (float) (r2.centerY() - (Math.sin(d17) * d18)), this.f899k);
            canvas.drawArc(a12, 180.0f, 180.0f, true, this.f896h);
            return;
        }
        throw g.b(it);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = -1;
        }
        if (mode2 != 1073741824 && mode2 != Integer.MIN_VALUE) {
            size2 = -1;
        }
        if (size2 >= 0 && size >= 0) {
            size = Math.min(size2, size);
            size2 = size / 2;
        } else if (size >= 0) {
            size2 = size / 2;
        } else if (size2 >= 0) {
            size = size2 * 2;
        } else {
            size = 0;
            size2 = 0;
        }
        setMeasuredDimension(size, size2);
    }

    public void setDefaultColor(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setLabelConverter(t2 t2Var) {
        invalidate();
    }

    public void setLabelTextSize(int i10) {
        this.f903o = i10;
        Paint paint = this.f901m;
        if (paint != null) {
            paint.setTextSize(i10);
            invalidate();
        }
    }

    public void setMajorTickStep(double d) {
        if (d > 0.0d) {
            this.e = d;
            invalidate();
        } else {
            i.k(m.h(new byte[]{-43, ByteCompanionObject.MAX_VALUE, -93, 13, 83, -25, -116, -119, -17, 121, -69, 69, 3, -2, -98, -116, -18, 117, -19, 83, 83, -19, -100, -119, -3, 121, -88, 68, 3, -23, -116, -64, -6, 48, -96, 65, 73, -25, -115, -64, -17, 121, -82, 75, 3, -5, -117, -123, -21, 62}, new byte[]{-101, 16, -51, 32, 35, -120, -1, -32}));
        }
    }

    public void setMaxSpeed(double d) {
        if (d > 0.0d) {
            this.f893b = d;
            invalidate();
        } else {
            i.k(m.h(new byte[]{25, 20, 78, 40, -86, 71, 20, 100, 35, 18, 86, 96, -6, 94, 6, 97, 34, 30, 0, 118, -86, 77, 4, 100, 49, 18, 69, 97, -6, 73, 20, 45, 58, 26, 88, 37, -87, 88, 2, 104, 51, 85}, new byte[]{87, 123, 32, 5, -38, 40, 103, 13}));
        }
    }

    public void setMinorTicks(int i10) {
        this.f894f = i10;
        invalidate();
    }

    public void setSpeed(double d) {
        if (d >= 0.0d) {
            double d10 = this.f893b;
            if (d > d10) {
                d = d10;
            }
            this.c = d;
            invalidate();
            return;
        }
        i.k(m.h(new byte[]{-83, 85, 9, -78, -78, 102, 88, 49, -105, 83, 17, -6, -30, ByteCompanionObject.MAX_VALUE, 74, 52, -106, 95, 71, -20, -78, 108, 72, 49, -123, 83, 2, -5, -30, 104, 88, 120, -126, 26, 20, -17, -89, 108, 79, 118}, new byte[]{-29, 58, 103, -97, -62, 9, 43, 88}));
    }
}
