package e4;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class g extends z3.k {
    public static final /* synthetic */ int J = 0;
    public f I;

    @Override // z3.k
    public final void g(Canvas canvas) {
        if (this.I.r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        int i10 = Build.VERSION.SDK_INT;
        f fVar = this.I;
        if (i10 >= 26) {
            canvas.clipOutRect(fVar.r);
        } else {
            canvas.clipRect(fVar.r, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // z3.k, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I = new f(this.I);
        return this;
    }

    public final void y(float f8, float f10, float f11, float f12) {
        RectF rectF = this.I.r;
        if (f8 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f8, f10, f11, f12);
        invalidateSelf();
    }
}
