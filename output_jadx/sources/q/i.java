package q;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5134b = "q.i".getBytes(h.e.f2522a);

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5134b);
    }

    @Override // q.f
    public final Bitmap c(k.b bVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = z.f5163a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f8 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            f8 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f8 + 0.5f), (int) (height + 0.5f));
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap j10 = bVar.j(i10, i11, config);
        j10.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, j10, matrix);
        return j10;
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // h.e
    public final int hashCode() {
        return -599754482;
    }
}
