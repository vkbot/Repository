package s;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import h.h;
import h.j;
import j.d0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k.g;
import l.d;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5448a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5449b;

    public /* synthetic */ a(d dVar, int i10) {
        this.f5448a = i10;
        this.f5449b = dVar;
    }

    @Override // h.j
    public final d0 a(Object obj, int i10, int i11, h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f5448a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return d.m(createSource, i10, i11, hVar);
            default:
                createSource2 = ImageDecoder.createSource(c0.b.b((InputStream) obj));
                return d.m(createSource2, i10, i11, hVar);
        }
    }

    @Override // h.j
    public final boolean b(Object obj, h hVar) {
        switch (this.f5448a) {
            case 0:
                ImageHeaderParser$ImageType w = o4.b.w((ArrayList) this.f5449b.c, (ByteBuffer) obj);
                if (w != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || w != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
            default:
                d dVar = this.f5449b;
                ImageHeaderParser$ImageType v9 = o4.b.v((ArrayList) dVar.c, (InputStream) obj, (g) dVar.d);
                if (v9 != ImageHeaderParser$ImageType.ANIMATED_WEBP && (Build.VERSION.SDK_INT < 31 || v9 != ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return false;
                }
                return true;
        }
    }
}
