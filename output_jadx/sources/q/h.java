package q;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class h implements h.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5132a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5133b;

    public h(int i10) {
        this.f5132a = i10;
        switch (i10) {
            case 1:
                this.f5133b = new d();
                return;
            default:
                this.f5133b = new d();
                return;
        }
    }

    @Override // h.j
    public final j.d0 a(Object obj, int i10, int i11, h.h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f5132a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.f5133b.c(createSource, i10, i11, hVar);
            default:
                createSource2 = ImageDecoder.createSource(c0.b.b((InputStream) obj));
                return this.f5133b.c(createSource2, i10, i11, hVar);
        }
    }

    @Override // h.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, h.h hVar) {
        switch (this.f5132a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
