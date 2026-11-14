package z1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6709a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f6710b;
    public final /* synthetic */ k c;

    public j(k kVar) {
        this.c = kVar;
        Paint paint = new Paint(1);
        this.f6709a = paint;
        Paint paint2 = new Paint(1);
        this.f6710b = paint2;
        kVar.setLayerType(1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(kVar.f6716j);
        paint2.setXfermode(k.t);
        if (!kVar.isInEditMode()) {
            paint.setShadowLayer(kVar.f6711b, kVar.c, kVar.d, kVar.e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        k kVar = this.c;
        RectF rectF = new RectF(Math.abs(kVar.c) + kVar.f6711b, Math.abs(kVar.d) + kVar.f6711b, kVar.f6714h, kVar.f6715i);
        float f8 = kVar.f6719m;
        canvas.drawRoundRect(rectF, f8, f8, this.f6709a);
        float f10 = kVar.f6719m;
        canvas.drawRoundRect(rectF, f10, f10, this.f6710b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
