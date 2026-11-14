package y1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import w1.i;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6614g;

    /* renamed from: h, reason: collision with root package name */
    public float f6615h;

    /* renamed from: i, reason: collision with root package name */
    public Path f6616i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i10) {
        super(context);
        this.f6614g = i10;
        switch (i10) {
            case 2:
                super(context);
                this.f6616i = new Path();
                h(12.0f * this.f6613b);
                return;
            case 3:
                super(context);
                this.f6616i = new Path();
                h(12.0f * this.f6613b);
                return;
            case 4:
                super(context);
                return;
            default:
                this.f6616i = new Path();
                h(12.0f * this.f6613b);
                return;
        }
    }

    @Override // y1.b
    public final void a(Canvas canvas) {
        switch (this.f6614g) {
            case 0:
                canvas.drawPath(this.f6616i, this.f6612a);
                return;
            case 1:
                canvas.drawPath(this.f6616i, this.f6612a);
                return;
            case 2:
                canvas.drawPath(this.f6616i, this.f6612a);
                return;
            case 3:
                canvas.drawPath(this.f6616i, this.f6612a);
                return;
            default:
                canvas.drawPath(this.f6616i, this.f6612a);
                return;
        }
    }

    @Override // y1.b
    public final float b() {
        switch (this.f6614g) {
            case 0:
                return this.f6615h;
            case 1:
                return d() * this.f6615h;
            case 2:
                return this.f6615h;
            case 3:
                return this.f6615h;
            default:
                return this.f6615h + this.d;
        }
    }

    @Override // y1.b
    public float e() {
        switch (this.f6614g) {
            case 3:
                float f8 = f() / 5.0f;
                this.c.getClass();
                return f8 + r1.getPadding();
            case 4:
                return this.f6615h;
            default:
                return super.e();
        }
    }

    @Override // y1.b
    public final void i() {
        switch (this.f6614g) {
            case 0:
                Path path = this.f6616i;
                path.reset();
                float c = c();
                this.c.getClass();
                path.moveTo(c, r2.getPadding());
                float f8 = f() * 0.5f;
                this.c.getClass();
                this.f6615h = f8 + r2.getPadding();
                path.lineTo(c() - this.d, this.f6615h);
                path.lineTo(c(), this.f6615h + this.d);
                path.lineTo(c() + this.d, this.f6615h);
                this.f6612a.setColor(this.e);
                return;
            case 1:
                Path path2 = this.f6616i;
                path2.reset();
                float c10 = c();
                this.c.getClass();
                path2.moveTo(c10, r2.getPadding());
                path2.lineTo(c(), d() * this.f6615h);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.f6612a;
                paint.setStyle(style);
                paint.setStrokeWidth(this.d);
                paint.setColor(this.e);
                return;
            case 2:
                Path path3 = this.f6616i;
                path3.reset();
                float c11 = c();
                this.c.getClass();
                path3.moveTo(c11, r2.getPadding());
                float f10 = (f() * 2.0f) / 3.0f;
                this.c.getClass();
                this.f6615h = f10 + r2.getPadding();
                path3.lineTo(c() - this.d, this.f6615h);
                path3.lineTo(c() + this.d, this.f6615h);
                float c12 = c();
                float f11 = this.d;
                float f12 = c12 - f11;
                float f13 = this.f6615h - f11;
                float c13 = c();
                float f14 = this.d;
                path3.addArc(new RectF(f12, f13, c13 + f14, this.f6615h + f14), 0.0f, 180.0f);
                this.f6612a.setColor(this.e);
                return;
            case 3:
                Path path4 = this.f6616i;
                path4.reset();
                float c14 = c();
                float f15 = f() / 5.0f;
                this.c.getClass();
                path4.moveTo(c14, f15 + r4.getPadding());
                float f16 = (f() * 3.0f) / 5.0f;
                this.c.getClass();
                this.f6615h = f16 + r2.getPadding();
                path4.lineTo(c() - this.d, this.f6615h);
                path4.lineTo(c() + this.d, this.f6615h);
                float c15 = c();
                float f17 = this.d;
                float f18 = c15 - f17;
                float f19 = this.f6615h - f17;
                float c16 = c();
                float f20 = this.d;
                path4.addArc(new RectF(f18, f19, c16 + f20, this.f6615h + f20), 0.0f, 180.0f);
                this.f6612a.setColor(this.e);
                return;
            default:
                this.f6616i = new Path();
                i iVar = this.c;
                iVar.getClass();
                float padding = iVar.getPadding();
                i iVar2 = this.c;
                iVar2.getClass();
                this.f6615h = (5.0f * this.f6613b) + iVar2.getSpeedometerWidth() + padding;
                this.f6616i.moveTo(c(), this.f6615h);
                Path path5 = this.f6616i;
                float c17 = c();
                float f21 = this.d;
                path5.lineTo(c17 - f21, this.f6615h + f21);
                Path path6 = this.f6616i;
                float c18 = c();
                float f22 = this.d;
                path6.lineTo(c18 + f22, this.f6615h + f22);
                this.f6616i.moveTo(0.0f, 0.0f);
                this.f6612a.setShader(new LinearGradient(c(), this.f6615h, c(), this.f6615h + this.d, this.e, Color.argb(0, Color.red(this.e), Color.green(this.e), Color.blue(this.e)), Shader.TileMode.CLAMP));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, float f8) {
        super(context);
        this.f6614g = 1;
        this.f6615h = f8;
        this.f6616i = new Path();
        if (0.0f <= f8 && f8 <= 1.0f) {
            h(8.0f * this.f6613b);
        } else {
            j1.i.k("Length must be between [0,1].");
            throw null;
        }
    }
}
