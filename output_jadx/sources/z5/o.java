package z5;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f6875a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6876b;

    public o(float f8, float f10) {
        this.f6875a = f8;
        this.f6876b = f10;
    }

    public static float a(o oVar, o oVar2) {
        return a.a.g(oVar.f6875a, oVar.f6876b, oVar2.f6875a, oVar2.f6876b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f6875a == oVar.f6875a && this.f6876b == oVar.f6876b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6876b) + (Float.floatToIntBits(this.f6875a) * 31);
    }

    public final String toString() {
        return "(" + this.f6875a + ',' + this.f6876b + ')';
    }
}
