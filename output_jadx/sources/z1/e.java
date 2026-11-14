package z1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import com.github.clans.fab.FloatingActionButton;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f6703a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f6704b;
    public final float c;
    public final /* synthetic */ FloatingActionButton d;

    public e(FloatingActionButton floatingActionButton) {
        int circleSize;
        this.d = floatingActionButton;
        Paint paint = new Paint(1);
        this.f6703a = paint;
        Paint paint2 = new Paint(1);
        this.f6704b = paint2;
        floatingActionButton.setLayerType(1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(floatingActionButton.f1084h);
        paint2.setXfermode(FloatingActionButton.W);
        if (!floatingActionButton.isInEditMode()) {
            paint.setShadowLayer(floatingActionButton.e, floatingActionButton.f1082f, floatingActionButton.f1083g, floatingActionButton.d);
        }
        circleSize = floatingActionButton.getCircleSize();
        float f8 = circleSize / 2;
        this.c = f8;
        if (floatingActionButton.f1095u && floatingActionButton.U) {
            this.c = f8 + floatingActionButton.f1096v;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode = FloatingActionButton.W;
        FloatingActionButton floatingActionButton = this.d;
        float measuredWidth = floatingActionButton.getMeasuredWidth() / 2;
        float measuredHeight = floatingActionButton.getMeasuredHeight() / 2;
        Paint paint = this.f6703a;
        float f8 = this.c;
        canvas.drawCircle(measuredWidth, measuredHeight, f8, paint);
        canvas.drawCircle(floatingActionButton.getMeasuredWidth() / 2, floatingActionButton.getMeasuredHeight() / 2, f8, this.f6704b);
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
