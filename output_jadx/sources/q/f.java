package q;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public abstract class f implements h.l {
    @Override // h.l
    public final j.d0 a(Context context, j.d0 d0Var, int i10, int i11) {
        if (c0.p.i(i10, i11)) {
            k.b bVar = com.bumptech.glide.b.a(context).f611b;
            Bitmap bitmap = (Bitmap) d0Var.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c = c(bVar, bitmap, i10, i11);
            if (bitmap.equals(c)) {
                return d0Var;
            }
            return e.c(c, bVar);
        }
        ai.onnxruntime.b.s("Cannot apply transformation on width: ", i10, " or height: ", i11, " less than or equal to zero and not Target.SIZE_ORIGINAL");
        return null;
    }

    public abstract Bitmap c(k.b bVar, Bitmap bitmap, int i10, int i11);
}
