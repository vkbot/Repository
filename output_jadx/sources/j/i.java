package j;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class i implements v.a {

    /* renamed from: b, reason: collision with root package name */
    public int f3015b;
    public Object c;

    public i(int i10) {
        switch (i10) {
            case 5:
                this.c = Bitmap.CompressFormat.JPEG;
                this.f3015b = 100;
                return;
            default:
                this.c = new int[10];
                return;
        }
    }

    @Override // v.a
    public d0 a(d0 d0Var, h.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) d0Var.get()).compress((Bitmap.CompressFormat) this.c, this.f3015b, byteArrayOutputStream);
        d0Var.recycle();
        return new q.a0(byteArrayOutputStream.toByteArray());
    }

    public boolean b(int i10) {
        if (((1 << i10) & this.f3015b) != 0) {
            return true;
        }
        return false;
    }

    public void c(int i10, int i11) {
        int[] iArr = (int[]) this.c;
        if (i10 >= iArr.length) {
            return;
        }
        this.f3015b = (1 << i10) | this.f3015b;
        iArr[i10] = i11;
    }

    public /* synthetic */ i(Comparable comparable, int i10) {
        this.c = comparable;
        this.f3015b = i10;
    }

    public i(int i10, c6.a aVar) {
        this.f3015b = i10;
        this.c = new c6.a[]{aVar};
    }

    public i(int i10, c6.a... aVarArr) {
        this.f3015b = i10;
        this.c = aVarArr;
    }
}
