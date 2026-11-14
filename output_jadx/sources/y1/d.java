package y1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    public final Path f6617g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f6618h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f6619i;

    /* renamed from: j, reason: collision with root package name */
    public float f6620j;

    public d(Context context) {
        super(context);
        this.f6617g = new Path();
        this.f6618h = new Path();
        Paint paint = new Paint(1);
        this.f6619i = paint;
        h(12.0f * this.f6613b);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // y1.b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f6617g, this.f6612a);
        canvas.drawPath(this.f6618h, this.f6619i);
    }

    @Override // y1.b
    public final float b() {
        return this.f6620j;
    }

    @Override // y1.b
    public final void i() {
        Path path = this.f6617g;
        path.reset();
        Path path2 = this.f6618h;
        path2.reset();
        float c = c();
        this.c.getClass();
        path.moveTo(c, r3.getPadding());
        float f8 = (f() * 0.5f) + ((float) (Math.sin(Math.toRadians(260.0d)) * this.d));
        this.c.getClass();
        this.f6620j = f8 + r2.getPadding();
        float f10 = (f() * 0.5f) + ((float) (Math.cos(Math.toRadians(260.0d)) * this.d));
        this.c.getClass();
        path.lineTo(f10 + r2.getPadding(), this.f6620j);
        path.arcTo(new RectF(c() - this.d, d() - this.d, c() + this.d, d() + this.d), 260.0f, 20.0f);
        float f11 = this.d * 0.25f;
        path2.addCircle(c(), d(), (this.d - (0.5f * f11)) + 0.6f, Path.Direction.CW);
        this.f6612a.setColor(this.e);
        int i10 = this.e;
        Paint paint = this.f6619i;
        paint.setColor(i10);
        paint.setStrokeWidth(f11);
    }
}
