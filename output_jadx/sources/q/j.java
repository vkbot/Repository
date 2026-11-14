package q;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5135b = "q.j".getBytes(h.e.f2522a);

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5135b);
    }

    @Override // q.f
    public final Bitmap c(k.b bVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = z.f5163a;
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return z.b(bVar, bitmap, i10, i11);
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // h.e
    public final int hashCode() {
        return -670243078;
    }
}
