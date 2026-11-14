package z3;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f6735a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6736b;

    public b(float f8, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f6735a;
            f8 += ((b) dVar).f6736b;
        }
        this.f6735a = dVar;
        this.f6736b = f8;
    }

    @Override // z3.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f6735a.a(rectF) + this.f6736b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6735a.equals(bVar.f6735a) && this.f6736b == bVar.f6736b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6735a, Float.valueOf(this.f6736b)});
    }
}
