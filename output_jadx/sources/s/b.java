package s;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c0.g;
import com.bumptech.glide.p;
import g.d;
import j.a0;
import j.d0;
import u.f;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements d0, a0 {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f5450b;
    public final /* synthetic */ int c;

    public b(Drawable drawable, int i10) {
        this.c = i10;
        g.c(drawable, "Argument must not be null");
        this.f5450b = drawable;
    }

    @Override // j.a0
    public void a() {
        switch (this.c) {
            case 1:
                ((f) ((u.b) this.f5450b).f5835b.f5351b).f5856l.prepareToDraw();
                return;
            default:
                Drawable drawable = this.f5450b;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof u.b) {
                        ((f) ((u.b) drawable).f5835b.f5351b).f5856l.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // j.d0
    public final int b() {
        switch (this.c) {
            case 0:
                Drawable drawable = this.f5450b;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                f fVar = (f) ((u.b) this.f5450b).f5835b.f5351b;
                d dVar = fVar.f5848a;
                return (dVar.f2406j.length * 4) + dVar.d.limit() + dVar.f2405i.length + fVar.f5858n;
        }
    }

    @Override // j.d0
    public final Class d() {
        switch (this.c) {
            case 0:
                return this.f5450b.getClass();
            default:
                return u.b.class;
        }
    }

    @Override // j.d0
    public final Object get() {
        Drawable drawable = this.f5450b;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return drawable;
        }
        return constantState.newDrawable();
    }

    @Override // j.d0
    public final void recycle() {
        k.g gVar;
        k.g gVar2;
        k.g gVar3;
        switch (this.c) {
            case 0:
                return;
            default:
                u.b bVar = (u.b) this.f5450b;
                bVar.stop();
                bVar.e = true;
                f fVar = (f) bVar.f5835b.f5351b;
                p pVar = fVar.d;
                fVar.c.clear();
                Bitmap bitmap = fVar.f5856l;
                if (bitmap != null) {
                    fVar.e.c(bitmap);
                    fVar.f5856l = null;
                }
                fVar.f5850f = false;
                u.d dVar = fVar.f5853i;
                if (dVar != null) {
                    pVar.k(dVar);
                    fVar.f5853i = null;
                }
                u.d dVar2 = fVar.f5855k;
                if (dVar2 != null) {
                    pVar.k(dVar2);
                    fVar.f5855k = null;
                }
                u.d dVar3 = fVar.f5857m;
                if (dVar3 != null) {
                    pVar.k(dVar3);
                    fVar.f5857m = null;
                }
                d dVar4 = fVar.f5848a;
                l.d dVar5 = dVar4.c;
                dVar4.f2408l = null;
                byte[] bArr = dVar4.f2405i;
                if (bArr != null && (gVar3 = (k.g) dVar5.d) != null) {
                    gVar3.g(bArr);
                }
                int[] iArr = dVar4.f2406j;
                if (iArr != null && (gVar2 = (k.g) dVar5.d) != null) {
                    gVar2.g(iArr);
                }
                Bitmap bitmap2 = dVar4.f2409m;
                if (bitmap2 != null) {
                    ((k.b) dVar5.c).c(bitmap2);
                }
                dVar4.f2409m = null;
                dVar4.d = null;
                dVar4.f2414s = null;
                byte[] bArr2 = dVar4.e;
                if (bArr2 != null && (gVar = (k.g) dVar5.d) != null) {
                    gVar.g(bArr2);
                }
                fVar.f5854j = true;
                return;
        }
    }

    private final void c() {
    }
}
