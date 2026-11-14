package b3;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f343a;

    public d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f343a = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Matrix imageMatrix = ((ImageView) obj).getImageMatrix();
        Matrix matrix = this.f343a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
