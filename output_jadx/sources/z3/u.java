package z3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class u extends w {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f6813h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f6814b;
    public final float c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public float f6815f;

    /* renamed from: g, reason: collision with root package name */
    public float f6816g;

    public u(float f8, float f10, float f11, float f12) {
        this.f6814b = f8;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // z3.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6818a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f8 = this.d;
        float f10 = this.e;
        RectF rectF = f6813h;
        rectF.set(this.f6814b, this.c, f8, f10);
        path.arcTo(rectF, this.f6815f, this.f6816g, false);
        path.transform(matrix);
    }
}
