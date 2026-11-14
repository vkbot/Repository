package com.woha.atir;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import i7.x;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class SignView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1685b;
    public x c;

    public SignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f1685b = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f1685b.setStrokeWidth(5.0f);
        this.f1685b.setStyle(Paint.Style.STROKE);
        this.f1685b.setStrokeCap(Paint.Cap.ROUND);
        this.f1685b.setStrokeJoin(Paint.Join.ROUND);
    }

    public final void a(Canvas canvas, int i10, int i11, int i12, int i13) {
        this.f1685b.setStyle(Paint.Style.STROKE);
        float f8 = i10;
        float f10 = i11;
        canvas.drawCircle(f8, f10, i12, this.f1685b);
        this.f1685b.setTextSize(80.0f);
        this.f1685b.setColor(-1);
        this.f1685b.setStyle(Paint.Style.FILL);
        String valueOf = String.valueOf(i13);
        canvas.drawText(valueOf, f8 - (this.f1685b.measureText(valueOf) / 2.0f), (this.f1685b.getTextSize() / 2.0f) + f10, this.f1685b);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c != null) {
            int width = getWidth();
            int height = getHeight();
            int i10 = width / 2;
            int i11 = height / 2;
            int min = (Math.min(width, height) / 2) - 10;
            x xVar = this.c;
            int i12 = xVar.d;
            if (i12 != 1) {
                if (i12 != 101) {
                    if (i12 != 107) {
                        return;
                    }
                    this.f1685b.setStyle(Paint.Style.STROKE);
                    float f8 = i10;
                    canvas.drawCircle(f8, i11, min, this.f1685b);
                    Path path = new Path();
                    path.moveTo(f8, i11 - min);
                    int i13 = min / 2;
                    float f10 = i10 - i13;
                    float f11 = i11 + i13;
                    path.lineTo(f10, f11);
                    float f12 = i10 + i13;
                    path.lineTo(f12, f11);
                    path.close();
                    this.f1685b.setStyle(Paint.Style.FILL);
                    this.f1685b.setColor(-1);
                    canvas.drawPath(path, this.f1685b);
                    this.f1685b.setStrokeWidth(10.0f);
                    this.f1685b.setColor(ViewCompat.MEASURED_STATE_MASK);
                    canvas.drawLine(f10, f11, f12, f11, this.f1685b);
                    return;
                }
                a(canvas, i10, i11, min, xVar.e);
                return;
            }
            a(canvas, i10, i11, min, xVar.e);
        }
    }

    public void setTrafficObject(x xVar) {
        this.c = xVar;
        invalidate();
    }
}
