package q;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class a0 implements j.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5119b;
    public final Object c;

    public a0(byte[] bArr) {
        this.f5119b = 1;
        c0.g.c(bArr, "Argument must not be null");
        this.c = bArr;
    }

    @Override // j.d0
    public final int b() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.f5119b) {
            case 0:
                return c0.p.c((Bitmap) this.c);
            case 1:
                return ((byte[]) this.c).length;
            case 2:
                intrinsicWidth = ((AnimatedImageDrawable) this.c).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.c).getIntrinsicHeight();
                return c0.p.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    @Override // j.d0
    public final Class d() {
        switch (this.f5119b) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.c).getClass();
        }
    }

    @Override // j.d0
    public final Object get() {
        switch (this.f5119b) {
            case 0:
                return (Bitmap) this.c;
            case 1:
                return (byte[]) this.c;
            case 2:
                return (AnimatedImageDrawable) this.c;
            default:
                return (File) this.c;
        }
    }

    @Override // j.d0
    public final void recycle() {
        switch (this.f5119b) {
            case 0:
            case 1:
                return;
            case 2:
                ((AnimatedImageDrawable) this.c).stop();
                ((AnimatedImageDrawable) this.c).clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ a0(int i10, Object obj) {
        this.f5119b = i10;
        this.c = obj;
    }

    public a0(File file) {
        this.f5119b = 3;
        c0.g.c(file, "Argument must not be null");
        this.c = file;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void e() {
    }
}
