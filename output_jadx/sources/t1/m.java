package t1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextPaint;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class m extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5786b;
    public final Paint c;
    public final TextPaint d;
    public final RectF e;

    /* renamed from: f, reason: collision with root package name */
    public String f5787f;

    /* renamed from: g, reason: collision with root package name */
    public int f5788g;

    /* renamed from: h, reason: collision with root package name */
    public final l f5789h;

    public m(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5786b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new RectF();
        this.f5787f = e0.m.h(new byte[]{-16, 34}, new byte[]{-35, 15, 45, 124, 23, 30, 54, 120});
        this.f5788g = Color.rgb(63, 185, 93);
        this.f5789h = new l(0, this);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(210, 24, 24, 24));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(a(5));
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
        textPaint.setTextSize(a(24));
        setMinimumWidth(a(76));
        setMinimumHeight(a(76));
        b();
    }

    public final int a(int i10) {
        return (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b() {
        String absolutePath;
        String format;
        int rgb;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                absolutePath = "";
            } else {
                try {
                    absolutePath = externalStorageDirectory.getCanonicalPath();
                } catch (IOException unused) {
                    absolutePath = externalStorageDirectory.getAbsolutePath();
                }
            }
            long availableBytes = new StatFs(absolutePath).getAvailableBytes();
            double d = availableBytes / 1.073741824E9d;
            if (d >= 10.0d) {
                format = String.valueOf((int) Math.floor(d));
            } else {
                format = String.format(Locale.US, e0.m.h(new byte[]{-36, 96, 51, 51}, new byte[]{-7, 78, 2, 85, 21, -95, 23, 102}), Double.valueOf(d));
            }
            this.f5787f = format;
            if (availableBytes < 2147483648L) {
                rgb = Color.rgb(FTPReply.ENTERING_EPSV_MODE, 57, 53);
            } else if (availableBytes < 3221225472L) {
                rgb = Color.rgb(251, 192, 45);
            } else {
                rgb = Color.rgb(63, 185, 93);
            }
            this.f5788g = rgb;
        } catch (Exception unused2) {
            this.f5787f = e0.m.h(new byte[]{-127, 110}, new byte[]{-84, 67, 119, 4, -102, -89, -119, 27});
            this.f5788g = Color.rgb(FTPReply.ENTERING_EPSV_MODE, 57, 53);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5789h);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int min = Math.min(getWidth(), getHeight());
        Paint paint = this.c;
        float strokeWidth = (paint.getStrokeWidth() / 2.0f) + a(3);
        float f8 = min;
        float f10 = f8 - strokeWidth;
        RectF rectF = this.e;
        rectF.set(strokeWidth, strokeWidth, f10, f10);
        float f11 = f8 / 2.0f;
        canvas.drawCircle(f11, f11, f11 - a(4), this.f5786b);
        paint.setColor(this.f5788g);
        canvas.drawArc(rectF, -90.0f, 360.0f, false, paint);
        TextPaint textPaint = this.d;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(this.f5787f, f11, f11 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int a10 = a(76);
        int min = Math.min(View.resolveSize(a10, i10), View.resolveSize(a10, i11));
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        l lVar = this.f5789h;
        if (i10 == 0) {
            post(lVar);
        } else {
            removeCallbacks(lVar);
        }
    }
}
