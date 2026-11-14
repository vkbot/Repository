package q;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e implements j.d0, j.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5125b = 1;
    public final Object c;
    public final Object d;

    public e(Bitmap bitmap, k.b bVar) {
        c0.g.c(bitmap, "Bitmap must not be null");
        this.c = bitmap;
        c0.g.c(bVar, "BitmapPool must not be null");
        this.d = bVar;
    }

    public static e c(Bitmap bitmap, k.b bVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, bVar);
    }

    @Override // j.a0
    public final void a() {
        switch (this.f5125b) {
            case 0:
                ((Bitmap) this.c).prepareToDraw();
                return;
            default:
                j.d0 d0Var = (j.d0) this.d;
                if (d0Var instanceof j.a0) {
                    ((j.a0) d0Var).a();
                    return;
                }
                return;
        }
    }

    @Override // j.d0
    public final int b() {
        switch (this.f5125b) {
            case 0:
                return c0.p.c((Bitmap) this.c);
            default:
                return ((j.d0) this.d).b();
        }
    }

    @Override // j.d0
    public final Class d() {
        switch (this.f5125b) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // j.d0
    public final Object get() {
        switch (this.f5125b) {
            case 0:
                return (Bitmap) this.c;
            default:
                return new BitmapDrawable((Resources) this.c, (Bitmap) ((j.d0) this.d).get());
        }
    }

    @Override // j.d0
    public final void recycle() {
        switch (this.f5125b) {
            case 0:
                ((k.b) this.d).c((Bitmap) this.c);
                return;
            default:
                ((j.d0) this.d).recycle();
                return;
        }
    }

    public e(Resources resources, j.d0 d0Var) {
        c0.g.c(resources, "Argument must not be null");
        this.c = resources;
        c0.g.c(d0Var, "Argument must not be null");
        this.d = d0Var;
    }
}
