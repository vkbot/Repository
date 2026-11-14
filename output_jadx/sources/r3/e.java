package r3;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5371a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f5372b = new float[9];
    public final Matrix c = new Matrix();
    public final /* synthetic */ h d;

    public e(h hVar) {
        this.d = hVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f8, Object obj, Object obj2) {
        this.d.f5388p = f8;
        float[] fArr = this.f5371a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f5372b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f10 = fArr2[i10];
            float f11 = fArr[i10];
            fArr2[i10] = ai.onnxruntime.a.b(f10, f11, f8, f11);
        }
        Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
