package com.example.navistart.mainview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import e4.h;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class FireballView extends View {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1011g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f1012b;
    public final Paint c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public float f1013f;

    public FireballView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1013f = 0.0f;
        this.c = new Paint(1);
        this.d = -16711681;
        this.e = -16776961;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1012b = ofFloat;
        ofFloat.setDuration(10000);
        this.f1012b.setRepeatCount(-1);
        this.f1012b.setRepeatMode(2);
        this.f1012b.addUpdateListener(new h(4, this));
        this.f1012b.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int min = Math.min(width, height) / 2;
        int i10 = this.d;
        int i11 = this.e;
        float f8 = this.f1013f;
        float f10 = 1.0f - f8;
        int i12 = ((int) ((f8 * (i11 & 255)) + (f10 * (i10 & 255)))) | (((int) ((((i11 >> 24) & 255) * f8) + (((i10 >> 24) & 255) * f10))) << 24) | (((int) ((((i11 >> 16) & 255) * f8) + (((i10 >> 16) & 255) * f10))) << 16) | (((int) ((((i11 >> 8) & 255) * f8) + (((i10 >> 8) & 255) * f10))) << 8);
        float f11 = width / 2.0f;
        float f12 = height / 2.0f;
        float f13 = min;
        RadialGradient radialGradient = new RadialGradient(f11, f12, f13, new int[]{i12, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = this.c;
        paint.setShader(radialGradient);
        canvas.drawCircle(f11, f12, f13, paint);
    }
}
