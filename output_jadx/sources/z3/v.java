package z3;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: b, reason: collision with root package name */
    public float f6817b;
    public float c;

    @Override // z3.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f6818a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f6817b, this.c);
        path.transform(matrix);
    }
}
