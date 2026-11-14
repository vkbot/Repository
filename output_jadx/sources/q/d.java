package q;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class d implements h.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5122a;

    /* renamed from: b, reason: collision with root package name */
    public final k.b f5123b;

    public d() {
        this.f5122a = 0;
        this.f5123b = new c5.e(13);
    }

    @Override // h.j
    public final j.d0 a(Object obj, int i10, int i11, h.h hVar) {
        switch (this.f5122a) {
            case 0:
                return c(c.d(obj), i10, i11, hVar);
            default:
                return e.c(((g.d) obj).b(), this.f5123b);
        }
    }

    @Override // h.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, h.h hVar) {
        switch (this.f5122a) {
            case 0:
                c.k(obj);
                return true;
            default:
                return true;
        }
    }

    public e c(ImageDecoder.Source source, int i10, int i11, h.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new p.b(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new e(decodeBitmap, (c5.e) this.f5123b);
    }

    public d(k.b bVar) {
        this.f5122a = 1;
        this.f5123b = bVar;
    }
}
