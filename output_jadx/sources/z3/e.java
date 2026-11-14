package z3;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public final class e extends a.a {
    @Override // a.a
    public final void k(y yVar, float f8, float f10) {
        float f11 = f10 * f8;
        yVar.d(f11, 180.0f, 90.0f);
        double d = f11;
        yVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d), (float) (Math.sin(Math.toRadians(0.0f)) * d));
    }
}
