package y1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: g, reason: collision with root package name */
    public final Path f6621g;

    public f(Context context) {
        super(context);
        this.f6621g = new Path();
        h(16.0f * this.f6613b);
    }

    @Override // y1.b
    public final void a(Canvas canvas) {
        canvas.drawPath(this.f6621g, this.f6612a);
    }

    @Override // y1.b
    public final float e() {
        float f8 = f() * 0.18f;
        this.c.getClass();
        return f8 + r1.getPadding();
    }

    @Override // y1.b
    public final void i() {
        Path path = this.f6621g;
        path.reset();
        path.moveTo(c(), d());
        float c = c() - this.d;
        float f8 = f() * 0.34f;
        this.c.getClass();
        float padding = f8 + r4.getPadding();
        float c10 = c();
        float f10 = f() * 0.18f;
        this.c.getClass();
        path.quadTo(c, padding, c10, f10 + r6.getPadding());
        float c11 = c() + this.d;
        float f11 = f() * 0.34f;
        this.c.getClass();
        path.quadTo(c11, f11 + r3.getPadding(), c(), d());
        this.f6612a.setColor(this.e);
    }
}
