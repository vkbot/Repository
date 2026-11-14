package q;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class v extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5154b = "q.v".getBytes(h.e.f2522a);

    @Override // h.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5154b);
    }

    @Override // q.f
    public final Bitmap c(k.b bVar, Bitmap bitmap, int i10, int i11) {
        return z.b(bVar, bitmap, i10, i11);
    }

    @Override // h.e
    public final boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // h.e
    public final int hashCode() {
        return 1572326941;
    }
}
