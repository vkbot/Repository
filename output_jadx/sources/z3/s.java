package z3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class s extends x {
    public final u c;

    public s(u uVar) {
        this.c = uVar;
    }

    @Override // z3.x
    public final void a(Matrix matrix, y3.a aVar, int i10, Canvas canvas) {
        boolean z9;
        float f8;
        u uVar = this.c;
        float f10 = uVar.f6815f;
        float f11 = uVar.f6816g;
        RectF rectF = new RectF(uVar.f6814b, uVar.c, uVar.d, uVar.e);
        Paint paint = aVar.f6629b;
        if (f11 < 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Path path = aVar.f6631g;
        int[] iArr = y3.a.f6626k;
        if (z9) {
            iArr[0] = 0;
            iArr[1] = aVar.f6630f;
            iArr[2] = aVar.e;
            iArr[3] = aVar.d;
            f8 = 0.0f;
        } else {
            path.rewind();
            f8 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f6630f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f8) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = y3.a.f6627l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f6632h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
