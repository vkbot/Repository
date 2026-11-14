package i7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class w extends View {

    /* renamed from: b, reason: collision with root package name */
    public float f2831b;
    public int c;
    public float d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f2832f;

    /* renamed from: g, reason: collision with root package name */
    public float f2833g;

    /* renamed from: h, reason: collision with root package name */
    public float f2834h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2835i;

    /* renamed from: j, reason: collision with root package name */
    public long f2836j;

    private void setSignalStrength(float f8) {
        this.f2831b = f8;
        invalidate();
    }

    public final void a(float f8) {
        setSignalStrength(Math.max(0.0f, Math.min(f8, 100.0f)));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i10 = this.c;
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (this.f2831b < this.f2834h) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f2836j >= 500) {
                this.f2835i = !this.f2835i;
                this.f2836j = currentTimeMillis;
            }
            if (this.f2835i) {
                Paint paint2 = new Paint();
                paint2.setColor(SupportMenu.CATEGORY_MASK);
                paint2.setAlpha(200);
                canvas.drawCircle(width, height, Math.min(getWidth(), getHeight()) / 6.0f, paint2);
            }
            postInvalidateDelayed(500L);
            return;
        }
        Paint paint3 = new Paint();
        paint3.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint3.setAlpha(FTPReply.FILE_STATUS_OK);
        float f8 = this.f2833g;
        canvas.drawRoundRect(width - ((getWidth() - 100.0f) / 2.0f), height - ((getHeight() - 100.0f) / 2.0f), ((getWidth() - 100.0f) / 2.0f) + width, ((getHeight() - 100.0f) / 2.0f) + height, f8, f8, paint3);
        float f10 = i10;
        float width2 = getWidth() / (this.d * f10);
        float f11 = width2 / 2.0f;
        float height2 = getHeight() * this.e;
        float f12 = width2 + f11;
        float f13 = width - (((f12 * f10) - f11) / 2.0f);
        float height3 = ((getHeight() * this.f2832f) / 2.0f) + height;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), new int[]{-16711936, InputDeviceCompat.SOURCE_ANY, SupportMenu.CATEGORY_MASK}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint4 = new Paint();
        paint4.setShader(linearGradient);
        Paint paint5 = new Paint();
        paint5.setColor(-12303292);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setAlpha(FTPReply.FILE_STATUS_OK);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            float f14 = i11;
            float f15 = (f14 * f12) + f13;
            float f16 = f15 + width2;
            float min = height3 - ((i12 / f10) * (Math.min(1.0f, this.f2831b / 100.0f) * height2));
            if (this.f2831b / 100.0f > f14 / f10) {
                canvas.drawRoundRect(f15, min, f16, height3, f11, f11, paint4);
                paint = paint5;
            } else {
                paint = paint5;
                canvas.drawRoundRect(f15, min, f16, height3, f11, f11, paint);
            }
            i11 = i12;
            paint5 = paint;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSize(50, i10), View.resolveSize(50, i11));
    }
}
