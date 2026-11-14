package k;

import android.graphics.Bitmap;
import c0.p;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f f3370a;

    /* renamed from: b, reason: collision with root package name */
    public int f3371b;
    public Bitmap.Config c;

    public k(f fVar) {
        this.f3370a = fVar;
    }

    @Override // k.i
    public final void a() {
        this.f3370a.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f3371b == kVar.f3371b && p.b(this.c, kVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f3371b * 31;
        Bitmap.Config config = this.c;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return l.c(this.f3371b, this.c);
    }
}
