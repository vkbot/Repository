package q;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b0 implements h.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5121a;

    public /* synthetic */ b0(int i10) {
        this.f5121a = i10;
    }

    @Override // h.j
    public final j.d0 a(Object obj, int i10, int i11, h.h hVar) {
        switch (this.f5121a) {
            case 0:
                return new a0(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new s.b(drawable, 0);
                }
                return null;
            default:
                return new a0((File) obj);
        }
    }

    @Override // h.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, h.h hVar) {
        switch (this.f5121a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }
}
