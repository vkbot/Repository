package z3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class t extends x {
    public final v c;
    public final float d;
    public final float e;

    public t(v vVar, float f8, float f10) {
        this.c = vVar;
        this.d = f8;
        this.e = f10;
    }

    @Override // z3.x
    public final void a(Matrix matrix, y3.a aVar, int i10, Canvas canvas) {
        v vVar = this.c;
        float f8 = vVar.c;
        float f10 = this.e;
        float f11 = vVar.f6817b;
        float f12 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f8 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f6820a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int i11 = aVar.f6630f;
        int[] iArr = y3.a.f6624i;
        iArr[0] = i11;
        iArr[1] = aVar.e;
        iArr[2] = aVar.d;
        Paint paint = aVar.c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, y3.a.f6625j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.c;
        return (float) Math.toDegrees(Math.atan((vVar.c - this.e) / (vVar.f6817b - this.d)));
    }
}
