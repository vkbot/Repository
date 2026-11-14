package p;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import h.g;
import h.h;
import h.i;
import q.o;
import q.q;
import q.w;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final w f4948a = w.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f4949b;
    public final int c;
    public final h.a d;
    public final o e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4950f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4951g;

    public b(int i10, int i11, h hVar) {
        boolean z9;
        this.f4949b = i10;
        this.c = i11;
        this.d = (h.a) hVar.c(q.f5144f);
        this.e = (o) hVar.c(o.f5141g);
        g gVar = q.f5147i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f4950f = z9;
        this.f4951g = (i) hVar.c(q.f5145g);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [p.a, java.lang.Object] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        ColorSpace.Named unused;
        if (this.f4948a.c(this.f4949b, this.c, this.f4950f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == h.a.c) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new Object());
        size = imageInfo.getSize();
        int i10 = this.f4949b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f4951g;
        if (iVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (iVar == i.f2526b) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named);
                            imageDecoder.setTargetColorSpace(colorSpace2);
                            return;
                        }
                    }
                }
                named = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace2);
                return;
            }
            if (i12 >= 26) {
                unused = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
