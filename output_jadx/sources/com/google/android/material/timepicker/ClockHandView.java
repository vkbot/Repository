package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.example.navistart.R;
import java.util.ArrayList;
import s3.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f1501o = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f1502b;
    public boolean c;
    public final ArrayList d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1503f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f1504g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f1505h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1506i;

    /* renamed from: j, reason: collision with root package name */
    public float f1507j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1508k;

    /* renamed from: l, reason: collision with root package name */
    public double f1509l;

    /* renamed from: m, reason: collision with root package name */
    public int f1510m;

    /* renamed from: n, reason: collision with root package name */
    public int f1511n;

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1502b = valueAnimator;
        this.d = new ArrayList();
        Paint paint = new Paint();
        this.f1504g = paint;
        this.f1505h = new RectF();
        this.f1511n = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a3.a.f11h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        com.bumptech.glide.d.q(context, R.attr.motionDurationLong2, 200);
        com.bumptech.glide.d.r(context, R.attr.motionEasingEmphasizedInterpolator, b3.a.f341b);
        this.f1510m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1506i = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1503f = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = ClockHandView.f1501o;
                ClockHandView.this.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new b4.a());
    }

    public final void a(float f8) {
        this.f1502b.cancel();
        b(f8);
    }

    public final void b(float f8) {
        float f10 = f8 % 360.0f;
        this.f1507j = f10;
        this.f1509l = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i10 = this.f1511n;
        int i11 = this.f1510m;
        if (i10 == 2) {
            i11 = Math.round(i11 * 0.66f);
        }
        float f11 = width;
        float f12 = i11;
        float cos = (((float) Math.cos(this.f1509l)) * f12) + f11;
        float sin = (f12 * ((float) Math.sin(this.f1509l))) + height;
        float f13 = this.e;
        this.f1505h.set(cos - f13, sin - f13, cos + f13, sin + f13);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ClockFaceView clockFaceView = (ClockFaceView) ((e) obj);
            if (Math.abs(clockFaceView.r - f10) > 0.001f) {
                clockFaceView.r = f10;
                clockFaceView.b();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i10 = this.f1511n;
        int i11 = this.f1510m;
        if (i10 == 2) {
            i11 = Math.round(i11 * 0.66f);
        }
        float f8 = width;
        float f10 = i11;
        float cos = (((float) Math.cos(this.f1509l)) * f10) + f8;
        float f11 = height;
        float sin = (f10 * ((float) Math.sin(this.f1509l))) + f11;
        Paint paint = this.f1504g;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.e, paint);
        double sin2 = Math.sin(this.f1509l);
        paint.setStrokeWidth(this.f1506i);
        canvas.drawLine(f8, f11, width + ((int) (Math.cos(this.f1509l) * r3)), height + ((int) (r3 * sin2)), paint);
        canvas.drawCircle(f8, f11, this.f1503f, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (!this.f1502b.isRunning()) {
            a(this.f1507j);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z10 = false;
                z9 = false;
            } else {
                z10 = this.f1508k;
                if (this.c) {
                    if (((float) Math.hypot(x9 - (getWidth() / 2), y9 - (getHeight() / 2))) <= Math.round(this.f1510m * 0.66f) + q.a(12, getContext())) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.f1511n = i10;
                }
                z9 = false;
            }
        } else {
            this.f1508k = false;
            z9 = true;
            z10 = false;
        }
        boolean z13 = this.f1508k;
        int degrees = (int) Math.toDegrees(Math.atan2(y9 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            i11 = degrees + 450;
        }
        float f8 = i11;
        if (this.f1507j != f8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z9 || !z11) {
            if (z11 || z10) {
                a(f8);
            }
            this.f1508k = z13 | z12;
            return true;
        }
        z12 = true;
        this.f1508k = z13 | z12;
        return true;
    }
}
